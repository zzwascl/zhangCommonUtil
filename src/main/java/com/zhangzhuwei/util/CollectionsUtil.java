package com.zhangzhuwei.util;

import java.util.Collection;

public class CollectionsUtil {
	//判断集合是否为空
		public static boolean isEmpty(Collection<?> collection) {
			
			return collection == null || collection.size()==0;
			
		}
}
