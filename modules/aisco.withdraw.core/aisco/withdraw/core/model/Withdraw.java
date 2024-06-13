package aisco.withdraw.core;

import aisco.program.core.Program;
import aisco.financialreport.core.FinancialReport;

import vmj.auth.model.core.*;

import java.util.*;

public interface Withdraw {
    public UUID getId();
    public void setId(UUID id);
	
    public long getAmount();
    public void setAmount(long amount);
	
	public FinancialReport getExpense();
    public void setExpense(FinancialReport expense);
    
    public String getDisbursementMethod();
	public void setDisbursementMethod(String disbursementMethod);
    
    public User getUser();
    public void setUser(User user);
	
	HashMap<String, Object> toHashMap();
}
