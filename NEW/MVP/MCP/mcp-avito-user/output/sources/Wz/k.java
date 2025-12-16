package wZ;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: MnzUniversalColor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LwZ/k;", "", "a", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class k {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f441571d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f441572a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final C49581e f441573b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final C49581e f441574c;

    /* compiled from: MnzUniversalColor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwZ/k$a;", "", "<init>", "()V", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static k a(@Y61.k UniversalColor universalColor) {
            C49581e c49581e;
            String colorKey = universalColor.getColorKey();
            Color color = universalColor.getColor();
            C49581e c49581e2 = null;
            if (color != null) {
                C49581e.f441553b.getClass();
                c49581e = new C49581e(color.getValue());
            } else {
                c49581e = null;
            }
            Color colorDark = universalColor.getColorDark();
            if (colorDark != null) {
                C49581e.f441553b.getClass();
                c49581e2 = new C49581e(colorDark.getValue());
            }
            return new k(colorKey, c49581e, c49581e2);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static wZ.k b(@Y61.l java.lang.String r2, @Y61.l java.lang.String r3, @Y61.l java.lang.String r4) {
            /*
                r0 = 0
                if (r2 != 0) goto L6
                if (r3 != 0) goto L6
                return r0
            L6:
                if (r3 == 0) goto L23
                wZ.e$a r1 = wZ.C49581e.f441553b
                r1.getClass()
                int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Throwable -> L16
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L16
                goto L17
            L16:
                r3 = r0
            L17:
                if (r3 == 0) goto L23
                int r3 = r3.intValue()
                wZ.e r1 = new wZ.e
                r1.<init>(r3)
                goto L24
            L23:
                r1 = r0
            L24:
                if (r4 == 0) goto L40
                wZ.e$a r3 = wZ.C49581e.f441553b
                r3.getClass()
                int r3 = android.graphics.Color.parseColor(r4)     // Catch: java.lang.Throwable -> L34
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L34
                goto L35
            L34:
                r3 = r0
            L35:
                if (r3 == 0) goto L40
                int r3 = r3.intValue()
                wZ.e r0 = new wZ.e
                r0.<init>(r3)
            L40:
                wZ.k r3 = new wZ.k
                r3.<init>(r2, r1, r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: wZ.k.a.b(java.lang.String, java.lang.String, java.lang.String):wZ.k");
        }

        public a() {
        }
    }

    public k(@Y61.l String str, @Y61.l C49581e c49581e, @Y61.l C49581e c49581e2) {
        this.f441572a = str;
        this.f441573b = c49581e;
        this.f441574c = c49581e2;
    }

    @Y61.l
    @InterfaceC42156l
    public final Integer a(@Y61.k Context context) {
        C48063a c48063a = C48063a.f437606a;
        C49581e c49581e = this.f441573b;
        Integer numValueOf = c49581e != null ? Integer.valueOf(c49581e.f441554a) : null;
        C49581e c49581e2 = this.f441574c;
        if (c49581e2 != null) {
            c49581e = c49581e2;
        }
        return C48063a.d(c48063a, context, this.f441572a, numValueOf, c49581e != null ? Integer.valueOf(c49581e.f441554a) : null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f441572a, kVar.f441572a) && L.f(this.f441573b, kVar.f441573b) && L.f(this.f441574c, kVar.f441574c);
    }

    public final int hashCode() {
        String str = this.f441572a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C49581e c49581e = this.f441573b;
        int iHashCode2 = (iHashCode + (c49581e == null ? 0 : Integer.hashCode(c49581e.f441554a))) * 31;
        C49581e c49581e2 = this.f441574c;
        return iHashCode2 + (c49581e2 != null ? Integer.hashCode(c49581e2.f441554a) : 0);
    }

    @Y61.k
    public final String toString() {
        return "MnzUniversalColor(colorKey=" + this.f441572a + ", color=" + this.f441573b + ", colorDark=" + this.f441574c + ')';
    }
}
