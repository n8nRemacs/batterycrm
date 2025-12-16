package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ss.C48407a;
import ss.d;
import ss.f;
import ss.g;
import ss.h;
import ts.C48709c;
import ts.InterfaceC48707a;

/* compiled from: CpxPromoGeoAnalytics.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/analytics/b;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/analytics/a;", "a", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f127788a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f127789b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f127790c;

    /* compiled from: CpxPromoGeoAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/analytics/b$a;", "", "<init>", "()V", "", "BID_AUTO", "Ljava/lang/String;", "BID_MANUAL", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.k @k String str) {
        this.f127788a = interfaceC28373a;
        this.f127789b = str;
    }

    public static String i(C48709c c48709c) {
        C48709c.C48711b c48711b = c48709c.f439500i;
        return (c48711b == null || !c48711b.f439518c) ? "manual" : "auto";
    }

    public static int j(C48709c c48709c, String str) {
        List<C48709c.p> list;
        List<C48709c.C48710a> list2;
        if (str.equals("auto")) {
            C48709c.o oVar = c48709c.f439505n;
            if (oVar == null || (list2 = oVar.f439563b) == null) {
                return 0;
            }
            return list2.size();
        }
        C48709c.o oVar2 = c48709c.f439505n;
        if (oVar2 == null || (list = oVar2.f439564c) == null) {
            return 0;
        }
        return list.size();
    }

    public static int k(C48709c c48709c) {
        List<C48709c.p> list;
        C48709c.o oVar = c48709c.f439505n;
        int i12 = 0;
        if (oVar != null && (list = oVar.f439564c) != null) {
            List<C48709c.p> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (!C43066x.K(((C48709c.p) it.next()).f439567c.f439536b.f439538a) && (i12 = i12 + 1) < 0) {
                        C42745f0.G0();
                        throw null;
                    }
                }
            }
        }
        return i12;
    }

    @Override // com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a
    public final void a(@k C48709c c48709c, @k InterfaceC48707a.i iVar) {
        C48709c.p pVar;
        C48709c.q qVar;
        C48709c.s sVar;
        String str;
        Double dW02;
        C48709c.q qVar2;
        List<C48709c.p> list;
        Object next;
        Long l12 = iVar.f439477b;
        C48709c.o oVar = c48709c.f439505n;
        if (oVar == null || (list = oVar.f439564c) == null) {
            pVar = null;
        } else {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                long j12 = ((C48709c.p) next).f439565a;
                if (l12 != null && j12 == l12.longValue()) {
                    break;
                }
            }
            pVar = (C48709c.p) next;
        }
        List<C48709c.y> list2 = (pVar == null || (qVar2 = pVar.f439566b) == null) ? null : qVar2.f439572e;
        int iIntValue = 0;
        if (list2 != null) {
            Iterator<C48709c.y> it2 = list2.iterator();
            int i12 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i12 = -1;
                    break;
                } else if (it2.next().f439596a == iVar.f439476a) {
                    break;
                } else {
                    i12++;
                }
            }
            Integer numValueOf = i12 >= 0 ? Integer.valueOf(i12 + 1) : null;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        this.f127788a.c(new h(this.f127789b, (pVar == null || (qVar = pVar.f439566b) == null || (sVar = qVar.f439571d) == null || (str = sVar.f439577a) == null || (dW02 = C43066x.w0(str)) == null) ? 0.0d : dW02.doubleValue(), iIntValue, l12 != null ? l12.longValue() : 0L));
    }

    @Override // com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a
    public final void b(@k C48709c c48709c) {
        String strI = i(c48709c);
        this.f127788a.c(new ss.c(this.f127789b, strI, false, j(c48709c, strI), k(c48709c), 4, null));
    }

    @Override // com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a
    public final void c(@k C48709c c48709c, @k String str) {
        Double dW02 = C43066x.w0(str);
        this.f127788a.c(new g(dW02 != null ? dW02.doubleValue() : 0.0d, this.f127789b, i(c48709c)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(@Y61.k ts.C48709c r9, @Y61.k ts.InterfaceC48707a.i r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.f439502k
            java.lang.Long r1 = r10.f439477b
            r2 = 0
            ts.c$o r9 = r9.f439505n
            if (r1 != 0) goto L22
            if (r9 == 0) goto L20
            ts.c$r r9 = r9.f439562a
            if (r9 == 0) goto L20
            ts.c$c r9 = r9.f439576a
            java.util.Map<java.lang.String, ts.c$f> r9 = r9.f439524e
            if (r9 == 0) goto L20
            java.lang.Object r9 = r9.get(r0)
            ts.c$f r9 = (ts.C48709c.f) r9
            if (r9 == 0) goto L20
            java.lang.Object r9 = r9.f439529b
            goto L5b
        L20:
            r9 = r2
            goto L5b
        L22:
            if (r9 == 0) goto L20
            java.util.List<ts.c$a> r9 = r9.f439563b
            if (r9 == 0) goto L20
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L2e:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L46
            java.lang.Object r3 = r9.next()
            r4 = r3
            ts.c$a r4 = (ts.C48709c.C48710a) r4
            long r4 = r4.f439514a
            long r6 = r1.longValue()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L2e
            goto L47
        L46:
            r3 = r2
        L47:
            ts.c$a r3 = (ts.C48709c.C48710a) r3
            if (r3 == 0) goto L20
            ts.c$c r9 = r3.f439515b
            java.util.Map<java.lang.String, ts.c$f> r9 = r9.f439524e
            if (r9 == 0) goto L20
            java.lang.Object r9 = r9.get(r0)
            ts.c$f r9 = (ts.C48709c.f) r9
            if (r9 == 0) goto L20
            java.lang.Object r9 = r9.f439529b
        L5b:
            r0 = 0
            if (r9 == 0) goto L8b
            java.util.Iterator r1 = r9.iterator()
            r3 = r0
        L63:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r1.next()
            ts.c$y r4 = (ts.C48709c.y) r4
            float r4 = r4.f439596a
            float r5 = r10.f439476a
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L78
            goto L7c
        L78:
            int r3 = r3 + 1
            goto L63
        L7b:
            r3 = -1
        L7c:
            if (r3 < 0) goto L84
            int r3 = r3 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
        L84:
            if (r2 == 0) goto L8b
            int r1 = r2.intValue()
            goto L8c
        L8b:
            r1 = r0
        L8c:
            if (r9 == 0) goto L92
            int r0 = r9.size()
        L92:
            ss.b r9 = new ss.b
            java.lang.String r2 = r8.f127789b
            java.lang.Long r10 = r10.f439477b
            r9.<init>(r2, r1, r0, r10)
            com.avito.android.analytics.a r10 = r8.f127788a
            r10.c(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.b.d(ts.c, ts.a$i):void");
    }

    @Override // com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a
    public final void e(@k C48709c c48709c, boolean z12) {
        this.f127788a.c(new d(this.f127789b, j(c48709c, i(c48709c)), z12));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d A[PHI: r3
  0x001d: PHI (r3v9 java.lang.String) = 
  (r3v1 java.lang.String)
  (r3v3 java.lang.String)
  (r3v5 java.lang.String)
  (r3v7 java.lang.String)
  (r3v11 java.lang.String)
 binds: [B:30:0x005a, B:25:0x004f, B:19:0x003e, B:13:0x002d, B:6:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(@Y61.k ts.C48709c r7, @Y61.l ts.C48709c.k r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r5 = i(r7)
            int r1 = j(r7, r5)
            int r2 = k(r7)
            java.lang.String r0 = ""
            r3 = 0
            ts.c$j r7 = r7.f439507p
            if (r9 == 0) goto L1f
            if (r7 == 0) goto L19
            ts.c$d r7 = r7.f439546d
            java.lang.String r3 = r7.f439526a
        L19:
            if (r3 != 0) goto L1d
        L1b:
            r4 = r0
            goto L5d
        L1d:
            r4 = r3
            goto L5d
        L1f:
            ts.c$k$c r9 = ts.C48709c.k.C12687c.f439550a
            boolean r9 = kotlin.jvm.internal.L.f(r8, r9)
            if (r9 == 0) goto L30
            if (r7 == 0) goto L2d
            ts.c$d r7 = r7.f439544b
            java.lang.String r3 = r7.f439526a
        L2d:
            if (r3 != 0) goto L1d
            goto L1b
        L30:
            ts.c$k$a r9 = ts.C48709c.k.a.f439548a
            boolean r9 = kotlin.jvm.internal.L.f(r8, r9)
            if (r9 == 0) goto L41
            if (r7 == 0) goto L3e
            ts.c$d r7 = r7.f439547e
            java.lang.String r3 = r7.f439526a
        L3e:
            if (r3 != 0) goto L1d
            goto L1b
        L41:
            ts.c$k$b r9 = ts.C48709c.k.b.f439549a
            boolean r9 = kotlin.jvm.internal.L.f(r8, r9)
            if (r9 == 0) goto L52
            if (r7 == 0) goto L4f
            ts.c$d r7 = r7.f439546d
            java.lang.String r3 = r7.f439526a
        L4f:
            if (r3 != 0) goto L1d
            goto L1b
        L52:
            if (r8 != 0) goto L6b
            if (r7 == 0) goto L5a
            ts.c$d r7 = r7.f439544b
            java.lang.String r3 = r7.f439526a
        L5a:
            if (r3 != 0) goto L1d
            goto L1b
        L5d:
            ss.e r7 = new ss.e
            java.lang.String r3 = r6.f127789b
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            com.avito.android.analytics.a r8 = r6.f127788a
            r8.c(r7)
            return
        L6b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.b.f(ts.c, ts.c$k, boolean):void");
    }

    @Override // com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a
    public final void g() {
        if (this.f127790c) {
            return;
        }
        this.f127788a.c(new f(this.f127789b));
        this.f127790c = true;
    }

    @Override // com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a
    public final void h(@k C48709c c48709c, int i12) {
        String str;
        C48709c.g gVar = (C48709c.g) C42745f0.K(i12, c48709c.f439503l);
        if ((gVar == null || (str = gVar.f439531b) == null) && (str = c48709c.f439502k) == null) {
            str = "";
        }
        this.f127788a.c(new C48407a(this.f127789b, str, i(c48709c)));
    }
}
