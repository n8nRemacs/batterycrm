package com.huawei.updatesdk.a.a.d;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f363762a = "g";

    public static Class a(Field field) {
        int i12;
        if (Map.class.isAssignableFrom(field.getType())) {
            i12 = 1;
        } else {
            if (!List.class.isAssignableFrom(field.getType())) {
                return null;
            }
            i12 = 0;
        }
        return a(field, i12);
    }

    private static Class a(Field field, int i12) {
        Type[] actualTypeArguments;
        Type genericType = field.getGenericType();
        if ((genericType instanceof ParameterizedType) && (actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments()) != null && actualTypeArguments.length > i12) {
            try {
                Type type = actualTypeArguments[i12];
                if (type instanceof Class) {
                    return (Class) type;
                }
                String string = type.toString();
                int iIndexOf = string.indexOf("class ");
                if (iIndexOf < 0) {
                    iIndexOf = 0;
                }
                int iIndexOf2 = string.indexOf("<");
                if (iIndexOf2 < 0) {
                    iIndexOf2 = string.length();
                }
                return Class.forName(string.substring(iIndexOf, iIndexOf2));
            } catch (ClassNotFoundException e12) {
                com.huawei.updatesdk.a.a.c.a.a.a.b(f363762a, "getType exception!" + e12.getMessage());
            }
        }
        return null;
    }

    public static Field[] a(Class cls) {
        Field[] fieldArrA = cls.getSuperclass() != null ? a(cls.getSuperclass()) : null;
        Field[] declaredFields = cls.getDeclaredFields();
        if (fieldArrA != null && fieldArrA.length > 0) {
            Field[] fieldArr = new Field[declaredFields.length + fieldArrA.length];
            System.arraycopy(fieldArrA, 0, fieldArr, 0, fieldArrA.length);
            System.arraycopy(declaredFields, 0, fieldArr, fieldArrA.length, declaredFields.length);
            declaredFields = fieldArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (field.getName().indexOf("$") < 0) {
                arrayList.add(field);
            }
        }
        if (arrayList.size() == declaredFields.length) {
            return declaredFields;
        }
        Field[] fieldArr2 = new Field[arrayList.size()];
        arrayList.toArray(fieldArr2);
        return fieldArr2;
    }
}
