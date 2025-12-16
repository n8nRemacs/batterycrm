package org.joda.time.field;

import androidx.compose.foundation.H;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;

/* compiled from: LenientDateTimeField.java */
/* loaded from: classes7.dex */
public class l extends g {
    private static final long serialVersionUID = 8714085824173290599L;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC44854a f420704e;

    public l(AbstractC44854a abstractC44854a, AbstractC44864f abstractC44864f) {
        super(abstractC44864f, null, null);
        this.f420704e = abstractC44854a;
    }

    @Override // org.joda.time.field.g, org.joda.time.AbstractC44864f
    public final boolean A() {
        return true;
    }

    @Override // org.joda.time.field.g, org.joda.time.AbstractC44864f
    public final long G(int i12, long j12) {
        AbstractC44854a abstractC44854a = this.f420704e;
        long jB2 = abstractC44854a.o().b(j12);
        long j13 = i12;
        long jC2 = this.f420693b.c(j12);
        long j14 = j13 - jC2;
        if ((j13 ^ j14) >= 0 || (j13 ^ jC2) >= 0) {
            return abstractC44854a.o().a(this.f420695d.b(abstractC44854a.N()).b(jB2, j14), j12);
        }
        StringBuilder sbQ = H.q(j13, "The calculation caused an overflow: ", " - ");
        sbQ.append(jC2);
        throw new ArithmeticException(sbQ.toString());
    }
}
