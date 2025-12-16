package com.huawei.hms.framework.common;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes7.dex */
public class ReflectionUtils {
    public static boolean checkCompatible(String str) throws ClassNotFoundException {
        try {
            ClassLoader classLoader = ReflectionUtils.class.getClassLoader();
            if (classLoader == null) {
                throw new ClassNotFoundException("not found classloader");
            }
            classLoader.loadClass(str);
            return true;
        } catch (Exception unused) {
            Logger.w("ReflectionUtils", str + "ClassNotFoundException");
            return false;
        }
    }

    public static Field getField(Object obj, String str) throws NoSuchFieldException {
        if (obj != null && !TextUtils.isEmpty(str)) {
            try {
                final Field declaredField = obj.getClass().getDeclaredField(str);
                AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.2
                    @Override // java.security.PrivilegedAction
                    public Object run() throws SecurityException {
                        declaredField.setAccessible(true);
                        return null;
                    }
                });
                return declaredField;
            } catch (IllegalArgumentException e12) {
                Logger.e("ReflectionUtils", "Exception in getField :: IllegalArgumentException:", e12);
            } catch (NoSuchFieldException e13) {
                Logger.e("ReflectionUtils", "Exception in getField :: NoSuchFieldException:", e13);
            } catch (SecurityException e14) {
                Logger.e("ReflectionUtils", "not security int method getField,SecurityException:", e14);
            }
        }
        return null;
    }

    public static Object getFieldObj(Object obj, String str) throws NoSuchFieldException {
        if (obj == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            final Field declaredField = obj.getClass().getDeclaredField(str);
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.1
                @Override // java.security.PrivilegedAction
                public Object run() throws SecurityException {
                    declaredField.setAccessible(true);
                    return null;
                }
            });
            return declaredField.get(obj);
        } catch (IllegalAccessException e12) {
            Logger.e("ReflectionUtils", "Exception in getFieldObj :: IllegalAccessException:", e12);
            return null;
        } catch (IllegalArgumentException e13) {
            Logger.e("ReflectionUtils", "Exception in getFieldObj :: IllegalArgumentException:", e13);
            return null;
        } catch (NoSuchFieldException e14) {
            Logger.e("ReflectionUtils", "Exception in getFieldObj :: NoSuchFieldException:", e14);
            return null;
        } catch (SecurityException e15) {
            Logger.e("ReflectionUtils", "not security int method getFieldObj,SecurityException:", e15);
            return null;
        }
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null || str == null) {
            Logger.w("ReflectionUtils", "targetClass is  null pr name is null:");
            return null;
        }
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e12) {
            Logger.e("ReflectionUtils", "NoSuchMethodException:", e12);
            return null;
        } catch (SecurityException e13) {
            Logger.e("ReflectionUtils", "SecurityException:", e13);
            return null;
        }
    }

    public static Object getStaticFieldObj(String str, String str2) throws NoSuchFieldException, ClassNotFoundException {
        Class<?> cls;
        if (str == null) {
            return null;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            final Field declaredField = cls.getDeclaredField(str2);
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.3
                @Override // java.security.PrivilegedAction
                public Object run() throws SecurityException {
                    declaredField.setAccessible(true);
                    return null;
                }
            });
            return declaredField.get(cls);
        } catch (IllegalAccessException e12) {
            Logger.e("ReflectionUtils", "Exception in getFieldObj :: IllegalAccessException:", e12);
            return null;
        } catch (IllegalArgumentException e13) {
            Logger.e("ReflectionUtils", "Exception in getFieldObj :: IllegalArgumentException:", e13);
            return null;
        } catch (NoSuchFieldException e14) {
            Logger.e("ReflectionUtils", "Exception in getFieldObj :: NoSuchFieldException:", e14);
            return null;
        } catch (SecurityException e15) {
            Logger.e("ReflectionUtils", "not security int method getStaticFieldObj,SecurityException:", e15);
            return null;
        }
    }

    public static Object invokeStaticMethod(String str, String str2, Object... objArr) throws ClassNotFoundException {
        Class[] clsArr;
        Class<?> cls;
        if (str == null) {
            return null;
        }
        if (objArr != null) {
            int length = objArr.length;
            clsArr = new Class[length];
            for (int i12 = 0; i12 < length; i12++) {
                Object obj = objArr[i12];
                if (obj instanceof Integer) {
                    clsArr[i12] = Integer.TYPE;
                } else if (obj instanceof Long) {
                    clsArr[i12] = Long.TYPE;
                } else if (obj instanceof Double) {
                    clsArr[i12] = Double.TYPE;
                } else if (obj instanceof Float) {
                    clsArr[i12] = Float.TYPE;
                } else if (obj instanceof Boolean) {
                    clsArr[i12] = Boolean.TYPE;
                } else if (obj instanceof Character) {
                    clsArr[i12] = Character.TYPE;
                } else if (obj instanceof Byte) {
                    clsArr[i12] = Byte.TYPE;
                } else if (obj instanceof Void) {
                    clsArr[i12] = Void.TYPE;
                } else if (obj instanceof Short) {
                    clsArr[i12] = Short.TYPE;
                } else {
                    clsArr[i12] = obj.getClass();
                }
            }
        } else {
            clsArr = null;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        Method method = getMethod(cls, str2, clsArr);
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(null, objArr);
        } catch (RuntimeException e12) {
            Logger.e("ReflectionUtils", "RuntimeException in invoke:", e12);
            return null;
        } catch (Exception e13) {
            Logger.e("ReflectionUtils", "Exception in invoke:", e13);
            return null;
        }
    }

    public static Object invokeStaticMethod(String str, String str2, Class<?>[] clsArr, Object... objArr) throws ClassNotFoundException {
        Class<?> cls;
        if (str == null) {
            cls = null;
        } else {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        Method method = getMethod(cls, str2, clsArr);
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(null, objArr);
        } catch (RuntimeException e12) {
            Logger.e("ReflectionUtils", "RuntimeException in invoke:", e12);
            return null;
        } catch (Exception e13) {
            Logger.e("ReflectionUtils", "Exception in invoke:", e13);
            return null;
        }
    }
}
