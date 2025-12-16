package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.AbstractC44865g;
import org.joda.time.IllegalFieldValueException;

/* compiled from: GJMonthOfYearDateTimeField.java */
/* loaded from: classes7.dex */
final class u extends h {
    @Override // org.joda.time.field.c
    public final int J(String str, Locale locale) {
        Integer num = t.b(locale).f420642i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(AbstractC44865g.f420887i, str);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final String d(int i12, Locale locale) {
        return t.b(locale).f420638e[i12];
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final String g(int i12, Locale locale) {
        return t.b(locale).f420637d[i12];
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int m(Locale locale) {
        return t.b(locale).f420645l;
    }
}
