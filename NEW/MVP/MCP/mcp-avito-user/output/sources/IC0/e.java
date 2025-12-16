package iC0;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: TariffCptUniversalColor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LiC0/e;", "", "a", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f398444d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f398445a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C41269c f398446b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C41269c f398447c;

    /* compiled from: TariffCptUniversalColor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LiC0/e$a;", "", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static iC0.e a(@Y61.l java.lang.String r2, @Y61.l java.lang.String r3, @Y61.l java.lang.String r4) {
            /*
                r0 = 0
                if (r2 != 0) goto L6
                if (r3 != 0) goto L6
                return r0
            L6:
                if (r3 == 0) goto L23
                iC0.c$a r1 = iC0.C41269c.f398440b
                r1.getClass()
                int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Throwable -> L16
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L16
                goto L17
            L16:
                r3 = r0
            L17:
                if (r3 == 0) goto L23
                int r3 = r3.intValue()
                iC0.c r1 = new iC0.c
                r1.<init>(r3)
                goto L24
            L23:
                r1 = r0
            L24:
                if (r4 == 0) goto L40
                iC0.c$a r3 = iC0.C41269c.f398440b
                r3.getClass()
                int r3 = android.graphics.Color.parseColor(r4)     // Catch: java.lang.Throwable -> L34
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L34
                goto L35
            L34:
                r3 = r0
            L35:
                if (r3 == 0) goto L40
                int r3 = r3.intValue()
                iC0.c r0 = new iC0.c
                r0.<init>(r3)
            L40:
                iC0.e r3 = new iC0.e
                r3.<init>(r2, r1, r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: iC0.e.a.a(java.lang.String, java.lang.String, java.lang.String):iC0.e");
        }

        public a() {
        }
    }

    public e(@l String str, @l C41269c c41269c, @l C41269c c41269c2) {
        this.f398445a = str;
        this.f398446b = c41269c;
        this.f398447c = c41269c2;
    }

    @l
    @InterfaceC42156l
    public final Integer a(@k Context context) {
        C48063a c48063a = C48063a.f437606a;
        C41269c c41269c = this.f398446b;
        Integer numValueOf = c41269c != null ? Integer.valueOf(c41269c.f398441a) : null;
        C41269c c41269c2 = this.f398447c;
        if (c41269c2 != null) {
            c41269c = c41269c2;
        }
        return C48063a.d(c48063a, context, this.f398445a, numValueOf, c41269c != null ? Integer.valueOf(c41269c.f398441a) : null);
    }

    @l
    public final ColorStateList b(@k Context context) {
        C48063a c48063a = C48063a.f437606a;
        C41269c c41269c = this.f398446b;
        Integer numValueOf = c41269c != null ? Integer.valueOf(c41269c.f398441a) : null;
        C41269c c41269c2 = this.f398447c;
        if (c41269c2 != null) {
            c41269c = c41269c2;
        }
        Integer numValueOf2 = c41269c != null ? Integer.valueOf(c41269c.f398441a) : null;
        c48063a.getClass();
        return C48063a.f(context, this.f398445a, numValueOf, numValueOf2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f398445a, eVar.f398445a) && L.f(this.f398446b, eVar.f398446b) && L.f(this.f398447c, eVar.f398447c);
    }

    public final int hashCode() {
        String str = this.f398445a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C41269c c41269c = this.f398446b;
        int iHashCode2 = (iHashCode + (c41269c == null ? 0 : Integer.hashCode(c41269c.f398441a))) * 31;
        C41269c c41269c2 = this.f398447c;
        return iHashCode2 + (c41269c2 != null ? Integer.hashCode(c41269c2.f398441a) : 0);
    }

    @k
    public final String toString() {
        return "TariffCptUniversalColor(colorKey=" + this.f398445a + ", color=" + this.f398446b + ", colorDark=" + this.f398447c + ')';
    }
}
