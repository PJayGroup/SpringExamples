/**
 * 
 */
package org.pjaygroup.springtransaction.app1;

import java.util.Map;

/**
 * @author Vijay Konduru
 *
 */
public interface StoreTransaction {
	void purchaseProduct(Map<String, Integer> products) throws Exception;
	void addCustomerData() throws Exception;
	void tryPrint();
}
