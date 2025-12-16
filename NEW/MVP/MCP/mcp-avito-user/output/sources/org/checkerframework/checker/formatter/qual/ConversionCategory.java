package org.checkerframework.checker.formatter.qual;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.StringJoiner;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes7.dex */
public enum ConversionCategory {
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL(null),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR(Character.class, Byte.class, Short.class, Integer.class),
    /* JADX INFO: Fake field, exist only in values array */
    INT(Byte.class, Short.class, Integer.class, Long.class, BigInteger.class),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT(Float.class, Double.class, BigDecimal.class),
    /* JADX INFO: Fake field, exist only in values array */
    TIME(Long.class, Calendar.class, Date.class),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR_AND_INT(Byte.class, Short.class, Integer.class),
    /* JADX INFO: Fake field, exist only in values array */
    INT_AND_TIME(Long.class),
    /* JADX INFO: Fake field, exist only in values array */
    NULL(new Class[0]),
    /* JADX INFO: Fake field, exist only in values array */
    UNUSED(null);


    /* renamed from: b, reason: collision with root package name */
    public final Class<?>[] f420236b;

    ConversionCategory(Class... clsArr) {
        if (clsArr == null) {
            this.f420236b = clsArr;
            return;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        int length = clsArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            Class cls = clsArr[i12];
            arrayList.add(cls);
            Class cls2 = cls == Byte.class ? Byte.TYPE : cls == Character.class ? Character.TYPE : cls == Short.class ? Short.TYPE : cls == Integer.class ? Integer.TYPE : cls == Long.class ? Long.TYPE : cls == Float.class ? Float.TYPE : cls == Double.class ? Double.TYPE : cls == Boolean.class ? Boolean.TYPE : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
        }
        this.f420236b = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }

    @Override // java.lang.Enum
    @Pure
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name());
        sb2.append(" conversion category");
        Class<?>[] clsArr = this.f420236b;
        if (clsArr == null || clsArr.length == 0) {
            return sb2.toString();
        }
        StringJoiner stringJoiner = new StringJoiner(", ", "(one of: ", ")");
        for (Class<?> cls : clsArr) {
            stringJoiner.add(cls.getSimpleName());
        }
        sb2.append(" ");
        sb2.append(stringJoiner);
        return sb2.toString();
    }
}
