package aisco.withdraw.core;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;

import aisco.program.core.*;
import aisco.financialreport.core.*;

@Entity(name="withdraw_impl")
@Table(name="withdraw_impl")
public class WithdrawImpl extends WithdrawComponent {
	
	public WithdrawImpl ()
    {
        this.id = UUID.randomUUID();
        this.amount = 0;
		this.expense = null;
		this.objectName = WithdrawImpl.class.getName();
		this.user = null;
		this.disbursementMethod = "";
    }
    
    public WithdrawImpl (UUID id, long amount, String disbursementMethod, String objectName)
    {
        this.id = id;
        this.amount = amount;
		this.expense = null; // will be added later on
		this.objectName = objectName;
		this.user = null; //will be added later on
		this.disbursementMethod = disbursementMethod;
    }
	
	public WithdrawImpl (long amount, String disbursementMethod)
    {
        this(UUID.randomUUID(), amount, disbursementMethod, WithdrawImpl.class.getName());
    }
	
	public WithdrawImpl (long amount, String disbursementMethod, String objectName)
    {
        this(UUID.randomUUID(), amount,disbursementMethod, objectName);
    }
}