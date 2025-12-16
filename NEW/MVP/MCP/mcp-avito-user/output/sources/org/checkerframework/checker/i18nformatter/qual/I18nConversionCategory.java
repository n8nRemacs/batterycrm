package org.checkerframework.checker.i18nformatter.qual;

import java.util.Date;
import java.util.StringJoiner;

/* loaded from: classes7.dex */
public enum I18nConversionCategory {
    /* JADX INFO: Fake field, exist only in values array */
    UNUSED(null),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL(null),
    /* JADX INFO: Fake field, exist only in values array */
    DATE(new Class[]{Date.class, Number.class}),
    /* JADX INFO: Fake field, exist only in values array */
    NUMBER(new Class[]{Number.class});


    /* renamed from: b, reason: collision with root package name */
    public final Class<?>[] f420238b;

    I18nConversionCategory(Class[] clsArr) {
        this.f420238b = clsArr;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(name());
        Class<?>[] clsArr = this.f420238b;
        if (clsArr == null) {
            sb2.append(" conversion category (all types)");
        } else {
            StringJoiner stringJoiner = new StringJoiner(", ", " conversion category (one of: ", ")");
            for (Class<?> cls : clsArr) {
                stringJoiner.add(cls.getCanonicalName());
            }
            sb2.append(stringJoiner);
        }
        return sb2.toString();
    }
}
