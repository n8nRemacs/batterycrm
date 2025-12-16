package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi;

import Zx.C19616a;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.cpx_promo_geo.generated.api.api_1_cpa_cjm_cpx_promo_geo_get_data_post.TriggerDataGeo;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.m0;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Settings;
import os.C44929A;
import os.C44932b;
import os.r;
import os.s;
import os.v;
import os.x;
import os.y;
import ts.C48709c;

/* compiled from: CpxPromoGeoReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "Lts/c;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements u<CpxPromoGeoInternalAction, C48709c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C19616a f127909b;

    /* compiled from: CpxPromoGeoReducer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/foundation/p;", "invoke", "(Landroidx/compose/runtime/A;I)Lcom/akita/compose/foundation/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, com.akita.compose.foundation.p> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TriggerDataGeo f127910l;

        /* compiled from: CpxPromoGeoReducer.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.o$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3802a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f127911a;

            static {
                int[] iArr = new int[TriggerDataGeo.Color.values().length];
                try {
                    iArr[TriggerDataGeo.Color.Red.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TriggerDataGeo.Color.Gray.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TriggerDataGeo.Color.Green.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TriggerDataGeo.Color.Yellow.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f127911a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TriggerDataGeo triggerDataGeo) {
            super(2);
            this.f127910l = triggerDataGeo;
        }

        @Override // Y41.p
        public final com.akita.compose.foundation.p invoke(A a12, Integer num) {
            com.akita.compose.foundation.p pVar;
            A a13 = a12;
            num.intValue();
            a13.C(-1066987750);
            int i12 = C3802a.f127911a[this.f127910l.getColor().ordinal()];
            if (i12 == 1) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63880R0;
            } else if (i12 == 2) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63918e0;
            } else if (i12 == 3) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63966u0;
            } else {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63893V1;
            }
            a13.h();
            return pVar;
        }
    }

    /* compiled from: CpxPromoGeoReducer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/foundation/p;", "invoke", "(Landroidx/compose/runtime/A;I)Lcom/akita/compose/foundation/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<A, Integer, com.akita.compose.foundation.p> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TriggerDataGeo f127912l;

        /* compiled from: CpxPromoGeoReducer.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f127913a;

            static {
                int[] iArr = new int[TriggerDataGeo.Color.values().length];
                try {
                    iArr[TriggerDataGeo.Color.Red.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TriggerDataGeo.Color.Gray.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TriggerDataGeo.Color.Green.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TriggerDataGeo.Color.Yellow.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f127913a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TriggerDataGeo triggerDataGeo) {
            super(2);
            this.f127912l = triggerDataGeo;
        }

        @Override // Y41.p
        public final com.akita.compose.foundation.p invoke(A a12, Integer num) {
            com.akita.compose.foundation.p pVar;
            A a13 = a12;
            num.intValue();
            a13.C(1422476251);
            int i12 = a.f127913a[this.f127912l.getColor().ordinal()];
            if (i12 == 1) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63877Q0;
            } else if (i12 == 2) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63836C1;
            } else if (i12 == 3) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63960s0;
            } else {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63841E0;
            }
            a13.h();
            return pVar;
        }
    }

    @Inject
    public o(@Y61.k C19616a c19616a) {
        this.f127909b = c19616a;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public static C48709c.C12686c b(C48709c.f fVar, String str, String str2, C48709c.C12686c c12686c, boolean z12) {
        Q q12;
        String str3;
        C48709c.s sVar = fVar.f439528a;
        ?? r32 = fVar.f439529b;
        String str4 = ((C48709c.y) C42745f0.E(r32)).f439597b;
        String str5 = sVar.f439580d;
        String str6 = sVar.f439579c;
        String str7 = sVar.f439581e;
        String strC = c(str2, str5, str6, str7, z12);
        C48709c.y yVarJ = j(strC, r32);
        C48709c.B b12 = yVarJ != null ? yVarJ.f439599d : null;
        C48709c.x xVarI = i(str5, strC, c12686c.f439523d, str7, yVarJ);
        C48709c.l lVarF = f(strC, str4, fVar.f439530c, yVarJ, str5, str7, b12);
        C48709c.s sVarA = C48709c.s.a(sVar, strC);
        float f12 = xVarI.f439592a;
        Map<String, C48709c.f> map = c12686c.f439524e;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, C48709c.f> entry : map.entrySet()) {
            String key = entry.getKey();
            C48709c.f value = entry.getValue();
            if (L.f(key, str)) {
                q12 = new Q(key, C48709c.f.a(value, sVarA, lVarF));
            } else {
                C48709c.y yVarA = f.a(value.f439529b, Float.valueOf(f12));
                if (yVarA == null || (str3 = yVarA.f439597b) == null) {
                    str3 = sVarA.f439577a;
                }
                q12 = new Q(key, C48709c.f.a(value, C48709c.s.a(value.f439528a, str3), C48709c.l.a(value.f439530c, yVarA != null ? yVarA.f439598c : null, false)));
            }
            arrayList.add(q12);
        }
        return new C48709c.C12686c(c12686c.f439520a, c12686c.f439521b, c12686c.f439522c, xVarI, P0.p(arrayList), b12);
    }

    public static String c(String str, String str2, String str3, String str4, boolean z12) {
        return !z12 ? (!p.c(str) || L.f(str2, str)) ? str : String.valueOf((long) Math.ceil(p.a(str))) : (C43066x.K(str) || L.f(str3, str) || l(str2, str)) ? str3 : k(str4, str) ? str4 : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058 A[PHI: r11
  0x0058: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v13 java.lang.String) binds: [B:16:0x0031, B:27:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ts.C48709c.h d(com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.o r9, ts.C48709c.p r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.o.d(com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.o, ts.c$p, java.lang.String, java.lang.String, int):ts.c$h");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ts.C48709c.k e(java.util.ArrayList r3, java.util.ArrayList r4, ts.C48709c.r r5) {
        /*
            r0 = 0
            r1 = 0
            r2 = 1
            if (r3 == 0) goto L27
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto Lc
            goto L2f
        Lc:
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r3.next()
            ts.c$p r4 = (ts.C48709c.p) r4
            ts.c$q r4 = r4.f439566b
            ts.c$x r4 = r4.f439573f
            float r4 = r4.f439592a
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L10
        L27:
            if (r4 == 0) goto L4c
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L31
        L2f:
            r0 = r2
            goto L60
        L31:
            java.util.Iterator r3 = r4.iterator()
        L35:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r3.next()
            ts.c$a r4 = (ts.C48709c.C48710a) r4
            ts.c$c r4 = r4.f439515b
            ts.c$x r4 = r4.f439523d
            float r4 = r4.f439592a
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L35
        L4c:
            if (r5 == 0) goto L5b
            ts.c$c r3 = r5.f439576a
            ts.c$x r3 = r3.f439523d
            if (r3 == 0) goto L5b
            float r3 = r3.f439592a
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L5c
        L5b:
            r3 = 0
        L5c:
            boolean r0 = kotlin.jvm.internal.L.d(r3, r1)
        L60:
            if (r0 == 0) goto L65
            ts.c$k$a r3 = ts.C48709c.k.a.f439548a
            goto L67
        L65:
            ts.c$k$c r3 = ts.C48709c.k.C12687c.f439550a
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.o.e(java.util.ArrayList, java.util.ArrayList, ts.c$r):ts.c$k");
    }

    public static C48709c.l f(String str, String str2, C48709c.l lVar, C48709c.y yVar, String str3, String str4, C48709c.B b12) {
        String str5;
        boolean z12 = b12 != null;
        if (L.f(str, str2)) {
            C48709c.m mVar = lVar.f439553c;
            if (mVar == null || (str5 = mVar.f439556c) == null) {
                str5 = yVar != null ? yVar.f439598c : null;
            }
            return C48709c.l.a(lVar, z12 ? null : str5, false);
        }
        if (l(str3, str)) {
            C48709c.m mVar2 = lVar.f439553c;
            return C48709c.l.a(lVar, mVar2 != null ? mVar2.f439554a : null, true);
        }
        if (!k(str4, str)) {
            return C48709c.l.a(lVar, z12 ? null : yVar != null ? yVar.f439598c : null, false);
        }
        C48709c.m mVar3 = lVar.f439553c;
        return C48709c.l.a(lVar, mVar3 != null ? mVar3.f439555b : null, true);
    }

    public static C48709c.q g(String str, C48709c.q qVar, boolean z12) {
        C48709c.s sVar = qVar.f439571d;
        String str2 = sVar.f439580d;
        List<C48709c.y> list = qVar.f439572e;
        String str3 = ((C48709c.y) C42745f0.E(list)).f439597b;
        C48709c.s sVar2 = qVar.f439571d;
        String str4 = sVar2.f439579c;
        String str5 = sVar.f439581e;
        String strC = c(str, str2, str4, str5, z12);
        C48709c.y yVarJ = j(strC, list);
        C48709c.B b12 = yVarJ != null ? yVarJ.f439599d : null;
        C48709c.x xVarI = i(str2, strC, qVar.f439573f, str5, yVarJ);
        C48709c.l lVarF = f(strC, str3, qVar.f439574g, yVarJ, str2, str5, b12);
        return new C48709c.q(qVar.f439568a, qVar.f439569b, qVar.f439570c, C48709c.s.a(sVar2, strC), qVar.f439572e, xVarI, lVarF, b12);
    }

    public static /* synthetic */ C48709c.q h(o oVar, String str, C48709c.q qVar) {
        oVar.getClass();
        return g(str, qVar, false);
    }

    public static C48709c.x i(String str, String str2, C48709c.x xVar, String str3, C48709c.y yVar) {
        return l(str, str2) ? C48709c.x.a(xVar, xVar.f439593b) : k(str3, str2) ? C48709c.x.a(xVar, xVar.f439594c) : yVar != null ? C48709c.x.a(xVar, yVar.f439596a) : xVar;
    }

    public static C48709c.y j(String str, List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            if (p.b(str) >= p.b(((C48709c.y) objPrevious).f439597b)) {
                obj = objPrevious;
                break;
            }
        }
        return (C48709c.y) obj;
    }

    public static boolean k(String str, String str2) {
        return str != null && p.b(str2) > p.b(str);
    }

    public static boolean l(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (p.c(str2) || p.c(str)) {
            if (p.a(str2) >= p.a(str)) {
                return false;
            }
        } else if (p.b(str2) >= p.b(str)) {
            return false;
        }
        return true;
    }

    public static String n(String str, String str2) {
        if ((str == null || !p.c(str)) && (str2 == null || !p.c(str2)) ? p.b(str) >= p.b(str2) : p.a(str) >= p.a(str2)) {
            str = str2;
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v102 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v56, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v57, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v109 */
    /* JADX WARN: Type inference failed for: r3v110, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v112, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v114, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v115, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v52, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54, types: [java.util.ArrayList] */
    @Override // com.avito.android.arch.mvi.u
    @Y61.k
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final C48709c a(@Y61.k CpxPromoGeoInternalAction cpxPromoGeoInternalAction, @Y61.k C48709c c48709c) {
        C48709c.z zVar;
        C48709c.z zVar2;
        C48709c.z zVar3;
        C48709c.z zVar4;
        C48709c.w wVar;
        float sliderPercent;
        Object next;
        C48709c.z zVar5;
        C48709c.l lVar;
        String symbol;
        C48709c.z zVar6;
        ArrayList arrayList;
        float sliderPercent2;
        Iterator it;
        String value;
        String symbol2;
        String symbol3;
        String symbol4;
        String symbol5;
        String symbol6;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C48709c.o oVar;
        C48709c.j jVarA;
        C48709c.C12686c f439576a;
        Map<String, C48709c.f> mapA;
        List<C48709c.C48710a> listB;
        List<C48709c.p> listC;
        ArrayList arrayList4;
        ?? B12;
        C48709c.o oVar2;
        C48709c.C12686c f439576a2;
        Map<String, C48709c.f> mapA2;
        C48709c.f fVar;
        List<C48709c.C48710a> listB2;
        List<C48709c.p> listC2;
        C48709c.o oVarA;
        ArrayList arrayList5;
        ?? B13;
        List<C48709c.C48710a> listB3;
        float f439592a;
        Float fValueOf;
        C48709c.o oVar3;
        C48709c.j jVarA2;
        C48709c.C12686c f439576a3;
        Map<String, C48709c.f> mapA3;
        C48709c.f fVar2;
        List<C48709c.p> listC3;
        C48709c.r f439562a;
        C48709c.C12686c f439576a4;
        Map<String, C48709c.f> mapA4;
        C48709c.f fVar3;
        List<C48709c.p> listC4;
        List<C48709c.y> listB4;
        C48709c.y yVarA;
        List<C48709c.C48710a> listB5;
        List<C48709c.v> list;
        C48709c.v vVar;
        ArrayList arrayList6;
        ?? B14;
        C48709c.o oVar4;
        C48709c.j jVarA3;
        List<C48709c.C48710a> listB6;
        List<C48709c.p> listC5;
        if (cpxPromoGeoInternalAction instanceof CpxPromoGeoInternalAction.Loading) {
            return C48709c.a(c48709c, true, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 131061);
        }
        if (cpxPromoGeoInternalAction instanceof CpxPromoGeoInternalAction.PostLoading) {
            return C48709c.a(c48709c, false, ((CpxPromoGeoInternalAction.PostLoading) cpxPromoGeoInternalAction).getF127886b(), null, null, null, false, null, null, null, null, null, null, null, null, null, null, 131067);
        }
        if (cpxPromoGeoInternalAction instanceof CpxPromoGeoInternalAction.Error) {
            return C48709c.a(c48709c, false, false, ((CpxPromoGeoInternalAction.Error) cpxPromoGeoInternalAction).c(), null, null, false, null, null, null, null, null, null, null, null, null, null, 131061);
        }
        if (cpxPromoGeoInternalAction instanceof CpxPromoGeoInternalAction.Revalidate) {
            C48709c.o f439505n = c48709c.getF439505n();
            if (f439505n == null || (listC5 = f439505n.c()) == null) {
                arrayList6 = null;
            } else {
                List<C48709c.p> list2 = listC5;
                arrayList6 = new ArrayList(C42745f0.q(list2, 10));
                for (C48709c.p pVar : list2) {
                    C48709c.q qVarG = g(pVar.getF439566b().f439571d.getF439577a(), pVar.getF439566b(), true);
                    arrayList6.add(C48709c.p.a(pVar, qVarG, d(this, pVar, null, qVarG.f439571d.getF439577a(), 2), 1));
                }
            }
            C48709c.o f439505n2 = c48709c.getF439505n();
            if (f439505n2 == null || (listB6 = f439505n2.b()) == null) {
                B14 = 0;
            } else {
                List<C48709c.C48710a> list3 = listB6;
                B14 = new ArrayList(C42745f0.q(list3, 10));
                for (C48709c.C48710a c48710aA : list3) {
                    C48709c.f fVar4 = c48710aA.getF439515b().a().get(c48709c.getF439502k());
                    if (fVar4 != null) {
                        c48710aA = C48709c.C48710a.a(c48710aA, b(fVar4, c48709c.getF439502k(), fVar4.f439528a.getF439577a(), c48710aA.getF439515b(), true));
                    }
                    B14.add(c48710aA);
                }
            }
            C48709c.o f439505n3 = c48709c.getF439505n();
            C48709c.r f439562a2 = f439505n3 != null ? f439505n3.getF439562a() : null;
            if (f439562a2 == null) {
                f439562a2 = null;
            } else {
                C48709c.f fVar5 = f439562a2.getF439576a().a().get(c48709c.getF439502k());
                if (fVar5 != null) {
                    f439562a2 = new C48709c.r(b(fVar5, c48709c.getF439502k(), fVar5.f439528a.getF439577a(), f439562a2.getF439576a(), true));
                }
            }
            C48709c.k kVarE = e(arrayList6, B14, f439562a2);
            if (!c48709c.f439498g) {
                kVarE = null;
            }
            List<C48709c.p> listC6 = arrayList6;
            if (c48709c.getF439505n() != null) {
                if (arrayList6 == null) {
                    listC6 = c48709c.getF439505n().c();
                }
                if (B14 == 0) {
                    B14 = c48709c.getF439505n().b();
                }
                if (f439562a2 == null) {
                    f439562a2 = c48709c.getF439505n().getF439562a();
                }
                oVar4 = new C48709c.o(f439562a2, B14, listC6);
            } else {
                oVar4 = null;
            }
            C48709c.j f439507p = c48709c.getF439507p();
            if (f439507p != null) {
                if (kVarE == null) {
                    kVarE = c48709c.getF439507p().f439543a;
                }
                jVarA3 = C48709c.j.a(f439507p, kVarE);
            } else {
                jVarA3 = null;
            }
            return C48709c.a(c48709c, false, false, null, null, null, false, null, null, null, null, null, null, oVar4, null, jVarA3, null, 90111);
        }
        if (cpxPromoGeoInternalAction instanceof CpxPromoGeoInternalAction.ChangeSwitcher) {
            C48709c.w f439501j = c48709c.getF439501j();
            return C48709c.a(c48709c, false, false, null, null, null, false, null, null, f439501j != null ? C48709c.w.a(f439501j, ((CpxPromoGeoInternalAction.ChangeSwitcher) cpxPromoGeoInternalAction).getF127880b()) : null, null, null, null, null, null, null, null, 130559);
        }
        int i12 = 0;
        if (cpxPromoGeoInternalAction instanceof CpxPromoGeoInternalAction.ChangeAutoManualType) {
            C48709c.C48711b c48711b = c48709c.f439500i;
            boolean z12 = (c48711b == null || (list = c48711b.f439519d) == null || (vVar = list.get(((CpxPromoGeoInternalAction.ChangeAutoManualType) cpxPromoGeoInternalAction).f127871b)) == null || !vVar.f439587a) ? false : true;
            C48709c.o f439505n4 = c48709c.getF439505n();
            if (f439505n4 == null || (listB5 = f439505n4.b()) == null) {
                arrayList5 = null;
            } else {
                List<C48709c.C48710a> list4 = listB5;
                arrayList5 = new ArrayList(C42745f0.q(list4, 10));
                int i13 = 0;
                for (Object obj : list4) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    C48709c.p pVar2 = c48709c.getF439505n().c().get(i13);
                    C48709c.y yVarA2 = f.a(pVar2.getF439566b().f439572e, Float.valueOf(((C48709c.C48710a) obj).getF439515b().f439523d.getF439592a()));
                    String f439597b = yVarA2 != null ? yVarA2.getF439597b() : null;
                    if (f439597b == null) {
                        f439597b = "";
                    }
                    arrayList5.add(C48709c.p.a(pVar2, g(f439597b, pVar2.getF439566b(), true), d(this, pVar2, null, f439597b, 2), 1));
                    i13 = i14;
                }
            }
            if (z12) {
                arrayList5 = null;
            }
            C48709c.o f439505n5 = c48709c.getF439505n();
            if (f439505n5 == null || (listC4 = f439505n5.c()) == null) {
                B13 = 0;
            } else {
                B13 = new ArrayList();
                for (Object obj2 : listC4) {
                    int i15 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    C48709c.C48710a c48710a = c48709c.getF439505n().b().get(i12);
                    float f439592a2 = ((C48709c.p) obj2).getF439566b().f439573f.getF439592a();
                    C48709c.f fVar6 = c48710a.getF439515b().a().get(c48709c.getF439502k());
                    String f439597b2 = (fVar6 == null || (listB4 = fVar6.b()) == null || (yVarA = f.a(listB4, Float.valueOf(f439592a2))) == null) ? null : yVarA.getF439597b();
                    if (f439597b2 == null) {
                        f439597b2 = "";
                    }
                    C48709c.f fVar7 = c48710a.getF439515b().a().get(c48709c.getF439502k());
                    C48709c.C48710a c48710aA2 = fVar7 == null ? null : C48709c.C48710a.a(c48710a, b(fVar7, c48709c.getF439502k(), f439597b2, c48710a.getF439515b(), true));
                    if (c48710aA2 != null) {
                        B13.add(c48710aA2);
                    }
                    i12 = i15;
                }
            }
            if (!z12) {
                B13 = 0;
            }
            C48709c.o f439505n6 = c48709c.getF439505n();
            List<C48709c.y> listB7 = (f439505n6 == null || (f439562a = f439505n6.getF439562a()) == null || (f439576a4 = f439562a.getF439576a()) == null || (mapA4 = f439576a4.a()) == null || (fVar3 = mapA4.get(c48709c.getF439502k())) == null) ? null : fVar3.b();
            if (z12) {
                C48709c.o f439505n7 = c48709c.getF439505n();
                if (f439505n7 != null && (listC3 = f439505n7.c()) != null) {
                    Iterator it2 = listC3.iterator();
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    f439592a = ((C48709c.p) it2.next()).getF439566b().f439573f.getF439592a();
                    while (it2.hasNext()) {
                        f439592a = Math.max(f439592a, ((C48709c.p) it2.next()).getF439566b().f439573f.getF439592a());
                    }
                    fValueOf = Float.valueOf(f439592a);
                }
                fValueOf = null;
            } else {
                C48709c.o f439505n8 = c48709c.getF439505n();
                if (f439505n8 != null && (listB3 = f439505n8.b()) != null) {
                    Iterator it3 = listB3.iterator();
                    if (!it3.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    f439592a = ((C48709c.C48710a) it3.next()).getF439515b().f439523d.getF439592a();
                    while (it3.hasNext()) {
                        f439592a = Math.max(f439592a, ((C48709c.C48710a) it3.next()).getF439515b().f439523d.getF439592a());
                    }
                    fValueOf = Float.valueOf(f439592a);
                }
                fValueOf = null;
            }
            C48709c.y yVarA3 = listB7 != null ? f.a(listB7, fValueOf) : null;
            C48709c.o f439505n9 = c48709c.getF439505n();
            C48709c.r f439562a3 = f439505n9 != null ? f439505n9.getF439562a() : null;
            if (f439562a3 != null && (f439576a3 = f439562a3.getF439576a()) != null && (mapA3 = f439576a3.a()) != null && (fVar2 = mapA3.get(c48709c.getF439502k())) != null) {
                String f439502k = c48709c.getF439502k();
                String f439597b3 = yVarA3 != null ? yVarA3.getF439597b() : null;
                f439562a3 = new C48709c.r(b(fVar2, f439502k, f439597b3 != null ? f439597b3 : "", f439562a3.getF439576a(), true));
            }
            C48709c.k kVarE2 = e(arrayList5, B13, f439562a3);
            if (!c48709c.f439498g) {
                kVarE2 = null;
            }
            List<C48709c.p> listC7 = arrayList5;
            if (c48709c.getF439505n() != null) {
                if (arrayList5 == null) {
                    listC7 = c48709c.getF439505n().c();
                }
                if (B13 == 0) {
                    B13 = c48709c.getF439505n().b();
                }
                if (f439562a3 == null) {
                    f439562a3 = c48709c.getF439505n().getF439562a();
                }
                oVar3 = new C48709c.o(f439562a3, B13, listC7);
            } else {
                oVar3 = null;
            }
            C48709c.j f439507p2 = c48709c.getF439507p();
            if (f439507p2 != null) {
                if (kVarE2 == null) {
                    kVarE2 = c48709c.getF439507p().f439543a;
                }
                jVarA2 = C48709c.j.a(f439507p2, kVarE2);
            } else {
                jVarA2 = null;
            }
            C48709c.C48711b c48711b2 = c48709c.f439500i;
            return C48709c.a(c48709c, false, false, null, null, null, true, null, c48711b2 != null ? C48709c.C48711b.a(c48711b2, c48711b2.f439519d.get(((CpxPromoGeoInternalAction.ChangeAutoManualType) cpxPromoGeoInternalAction).f127871b).f439587a) : null, null, null, null, null, oVar3, null, jVarA2, null, 89791);
        }
        if (cpxPromoGeoInternalAction instanceof CpxPromoGeoInternalAction.ChangeDayCount) {
            CpxPromoGeoInternalAction.ChangeDayCount changeDayCount = (CpxPromoGeoInternalAction.ChangeDayCount) cpxPromoGeoInternalAction;
            String f439531b = c48709c.f439503l.get(changeDayCount.f127874b).getF439531b();
            List<C48709c.g> list5 = c48709c.f439503l;
            ArrayList arrayList7 = new ArrayList(C42745f0.q(list5, 10));
            int i16 = 0;
            for (Object obj3 : list5) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList7.add(C48709c.g.a((C48709c.g) obj3, i16 == changeDayCount.f127874b));
                i16 = i17;
            }
            return C48709c.a(c48709c, false, false, null, null, null, true, null, null, null, f439531b, arrayList7, null, null, null, null, null, 127935);
        }
        if (cpxPromoGeoInternalAction instanceof CpxPromoGeoInternalAction.ChangeDailyLimit) {
            C48709c.o f439505n10 = c48709c.getF439505n();
            if (f439505n10 != null) {
                List<C48709c.p> listC8 = c48709c.getF439505n().c();
                ArrayList arrayList8 = new ArrayList(C42745f0.q(listC8, 10));
                for (C48709c.p pVarA : listC8) {
                    CpxPromoGeoInternalAction.ChangeDailyLimit changeDailyLimit = (CpxPromoGeoInternalAction.ChangeDailyLimit) cpxPromoGeoInternalAction;
                    if (pVarA.f439565a == changeDailyLimit.getF127873c()) {
                        String f439538a = pVarA.f439567c.getF439536b().getF439538a();
                        String str = changeDailyLimit.f127872b;
                        if (!L.f(f439538a, str) && str.length() <= 8) {
                            pVarA = C48709c.p.a(pVarA, null, d(this, pVarA, str, null, 4), 3);
                        }
                    }
                    arrayList8.add(pVarA);
                }
                oVarA = C48709c.o.a(f439505n10, arrayList8);
            } else {
                oVarA = null;
            }
            return C48709c.a(c48709c, false, false, null, null, null, true, null, null, null, null, null, null, oVarA, null, null, null, 122815);
        }
        if (cpxPromoGeoInternalAction instanceof CpxPromoGeoInternalAction.ResetPrices) {
            C48709c.C48711b c48711b3 = c48709c.f439500i;
            boolean z13 = c48711b3 != null && c48711b3.getF439518c();
            String f439502k2 = c48709c.getF439502k();
            C48709c.o f439505n11 = c48709c.getF439505n();
            if (f439505n11 == null || (listC2 = f439505n11.c()) == null) {
                arrayList4 = null;
            } else {
                List<C48709c.p> list6 = listC2;
                arrayList4 = new ArrayList(C42745f0.q(list6, 10));
                for (C48709c.p pVar3 : list6) {
                    C48709c.y yVar = (C48709c.y) C42745f0.G(pVar3.getF439566b().f439572e);
                    String f439597b4 = yVar != null ? yVar.getF439597b() : null;
                    if (f439597b4 == null) {
                        f439597b4 = "";
                    }
                    arrayList4.add(C48709c.p.a(pVar3, h(this, f439597b4, pVar3.getF439566b()), d(this, pVar3, null, f439597b4, 2), 1));
                }
            }
            if (z13) {
                arrayList4 = null;
            }
            C48709c.o f439505n12 = c48709c.getF439505n();
            if (f439505n12 == null || (listB2 = f439505n12.b()) == null) {
                B12 = 0;
            } else {
                List<C48709c.C48710a> list7 = listB2;
                B12 = new ArrayList(C42745f0.q(list7, 10));
                for (C48709c.C48710a c48710aA3 : list7) {
                    C48709c.f fVar8 = c48710aA3.getF439515b().a().get(f439502k2);
                    if (fVar8 != null) {
                        C48709c.y yVar2 = (C48709c.y) C42745f0.G(fVar8.b());
                        String f439597b5 = yVar2 != null ? yVar2.getF439597b() : null;
                        if (f439597b5 == null) {
                            f439597b5 = "";
                        }
                        c48710aA3 = C48709c.C48710a.a(c48710aA3, b(fVar8, f439502k2, f439597b5, c48710aA3.getF439515b(), false));
                    }
                    B12.add(c48710aA3);
                }
            }
            if (!z13) {
                B12 = 0;
            }
            C48709c.o f439505n13 = c48709c.getF439505n();
            C48709c.r f439562a4 = f439505n13 != null ? f439505n13.getF439562a() : null;
            if (f439562a4 != null && (f439576a2 = f439562a4.getF439576a()) != null && (mapA2 = f439576a2.a()) != null && (fVar = mapA2.get(f439502k2)) != null) {
                C48709c.y yVar3 = (C48709c.y) C42745f0.G(fVar.b());
                String f439597b6 = yVar3 != null ? yVar3.getF439597b() : null;
                f439562a4 = new C48709c.r(b(fVar, f439502k2, f439597b6 != null ? f439597b6 : "", f439562a4.getF439576a(), false));
            }
            C48709c.k kVarE3 = e(arrayList4, B12, f439562a4);
            List<C48709c.p> listC9 = arrayList4;
            if (c48709c.getF439505n() != null) {
                if (arrayList4 == null) {
                    listC9 = c48709c.getF439505n().c();
                }
                if (B12 == 0) {
                    B12 = c48709c.getF439505n().b();
                }
                if (f439562a4 == null) {
                    f439562a4 = c48709c.getF439505n().getF439562a();
                }
                oVar2 = new C48709c.o(f439562a4, B12, listC9);
            } else {
                oVar2 = null;
            }
            C48709c.j f439507p3 = c48709c.getF439507p();
            C48709c.j jVarA4 = f439507p3 != null ? C48709c.j.a(f439507p3, kVarE3) : null;
            C48709c.t tVar = c48709c.f439508q;
            return C48709c.a(c48709c, false, false, null, null, null, true, null, null, null, null, null, null, oVar2, null, jVarA4, tVar != null ? C48709c.t.a(tVar, false) : null, 24511);
        }
        if (cpxPromoGeoInternalAction instanceof CpxPromoGeoInternalAction.ChangePrice) {
            C48709c.o f439505n14 = c48709c.getF439505n();
            if (f439505n14 == null || (listC = f439505n14.c()) == null) {
                arrayList2 = null;
            } else {
                List<C48709c.p> list8 = listC;
                arrayList2 = new ArrayList(C42745f0.q(list8, 10));
                for (C48709c.p pVarA2 : list8) {
                    long j12 = pVarA2.f439565a;
                    CpxPromoGeoInternalAction.ChangePrice changePrice = (CpxPromoGeoInternalAction.ChangePrice) cpxPromoGeoInternalAction;
                    Long l12 = changePrice.f127876c;
                    if (l12 != null && j12 == l12.longValue() && !L.f(pVarA2.getF439566b().f439571d.getF439577a(), changePrice.getF127875b()) && changePrice.getF127875b().length() <= 8) {
                        String f127875b = changePrice.getF127875b();
                        C48709c.q f439566b = pVarA2.getF439566b();
                        boolean z14 = changePrice.f127879f;
                        C48709c.q qVarG2 = g(f127875b, f439566b, z14);
                        pVarA2 = C48709c.p.a(pVarA2, qVarG2, z14 ? d(this, pVarA2, null, qVarG2.f439571d.getF439577a(), 2) : pVarA2.f439567c, 1);
                    }
                    arrayList2.add(pVarA2);
                }
            }
            CpxPromoGeoInternalAction.ChangePrice changePrice2 = (CpxPromoGeoInternalAction.ChangePrice) cpxPromoGeoInternalAction;
            ArrayList arrayList9 = arrayList2;
            if (!changePrice2.f127877d) {
                arrayList9 = null;
            }
            C48709c.o f439505n15 = c48709c.getF439505n();
            Long l13 = changePrice2.f127876c;
            boolean z15 = changePrice2.f127879f;
            String str2 = changePrice2.f127878e;
            if (f439505n15 == null || (listB = f439505n15.b()) == null) {
                arrayList3 = null;
            } else {
                List<C48709c.C48710a> list9 = listB;
                arrayList3 = new ArrayList(C42745f0.q(list9, 10));
                for (C48709c.C48710a c48710aA4 : list9) {
                    C48709c.f fVar9 = c48710aA4.getF439515b().a().get(str2);
                    long f439514a = c48710aA4.getF439514a();
                    if (l13 != null && f439514a == l13.longValue()) {
                        if (!L.f(fVar9 != null ? fVar9.f439528a.getF439577a() : null, changePrice2.getF127875b()) && changePrice2.getF127875b().length() <= 8 && fVar9 != null) {
                            c48710aA4 = C48709c.C48710a.a(c48710aA4, b(fVar9, str2, changePrice2.getF127875b(), c48710aA4.getF439515b(), z15));
                        }
                    }
                    arrayList3.add(c48710aA4);
                }
            }
            ?? B15 = arrayList3;
            if (changePrice2.f127877d || l13 == null) {
                B15 = 0;
            }
            C48709c.o f439505n16 = c48709c.getF439505n();
            C48709c.r f439562a5 = f439505n16 != null ? f439505n16.getF439562a() : null;
            C48709c.f fVar10 = (f439562a5 == null || (f439576a = f439562a5.getF439576a()) == null || (mapA = f439576a.a()) == null) ? null : mapA.get(str2);
            if (!L.f(fVar10 != null ? fVar10.f439528a.getF439577a() : null, changePrice2.getF127875b()) && changePrice2.getF127875b().length() <= 8 && fVar10 != null) {
                f439562a5 = f439562a5 != null ? new C48709c.r(b(fVar10, str2, changePrice2.getF127875b(), f439562a5.getF439576a(), z15)) : null;
            }
            C48709c.k kVarE4 = e(arrayList9, B15, f439562a5);
            if (!z15) {
                kVarE4 = null;
            }
            C48709c.t tVar2 = c48709c.f439508q;
            C48709c.t tVarA = tVar2 != null ? C48709c.t.a(tVar2, false) : null;
            List<C48709c.p> listC10 = arrayList9;
            if (c48709c.getF439505n() != null) {
                if (arrayList9 == null) {
                    listC10 = c48709c.getF439505n().c();
                }
                if (B15 == 0) {
                    B15 = c48709c.getF439505n().b();
                }
                if (f439562a5 == null) {
                    f439562a5 = c48709c.getF439505n().getF439562a();
                }
                oVar = new C48709c.o(f439562a5, B15, listC10);
            } else {
                oVar = null;
            }
            C48709c.j f439507p4 = c48709c.getF439507p();
            if (f439507p4 != null) {
                if (kVarE4 == null) {
                    kVarE4 = c48709c.getF439507p().f439543a;
                }
                jVarA = C48709c.j.a(f439507p4, kVarE4);
            } else {
                jVarA = null;
            }
            return C48709c.a(c48709c, false, false, null, null, null, true, null, null, null, null, null, null, oVar, null, jVarA, tVarA, 24511);
        }
        if (L.f(cpxPromoGeoInternalAction, CpxPromoGeoInternalAction.ShowResetDialog.f127889b)) {
            C48709c.t tVar3 = c48709c.f439508q;
            return C48709c.a(c48709c, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, tVar3 != null ? C48709c.t.a(tVar3, true) : null, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        if (L.f(cpxPromoGeoInternalAction, CpxPromoGeoInternalAction.CloseResetDialog.f127881b)) {
            C48709c.t tVar4 = c48709c.f439508q;
            return C48709c.a(c48709c, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, tVar4 != null ? C48709c.t.a(tVar4, false) : null, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        if (!(cpxPromoGeoInternalAction instanceof CpxPromoGeoInternalAction.Content)) {
            return c48709c;
        }
        CpxPromoGeoInternalAction.Content content = (CpxPromoGeoInternalAction.Content) cpxPromoGeoInternalAction;
        os.e navButton = content.getF127882b().getNavButton();
        C48709c.d dVar = navButton != null ? new C48709c.d(navButton.getTitle(), navButton.getUri()) : null;
        String title = content.getF127882b().getTitle();
        AttributedText description = content.getF127882b().getDescription();
        os.c autoManual = content.getF127882b().getAutoManual();
        String title2 = autoManual.getTitle();
        os.m icon = autoManual.getIcon();
        if (icon == null || (symbol6 = icon.getSymbol()) == null) {
            zVar = null;
        } else {
            com.akita.compose.theme.re23.g.f65049a.getClass();
            zVar = new C48709c.z(com.akita.compose.theme.re23.g.a(symbol6), autoManual.getIcon().getUri());
        }
        boolean isSelectAutoType = autoManual.getIsSelectAutoType();
        List<x> listB8 = autoManual.b();
        ArrayList arrayList10 = new ArrayList(C42745f0.q(listB8, 10));
        for (x xVar : listB8) {
            arrayList10.add(new C48709c.v(xVar.getIsAutoType(), xVar.getTitle()));
        }
        C48709c.C48711b c48711b4 = new C48709c.C48711b(title2, zVar, isSelectAutoType, arrayList10);
        os.p locationChooser = content.getF127882b().getLocationChooser();
        String title3 = locationChooser.getTitle();
        DeepLink uri = locationChooser.getUri();
        String preselectedInputText = locationChooser.getPreselectedInputText();
        os.m icon2 = locationChooser.getIcon();
        if (icon2 == null || (symbol5 = icon2.getSymbol()) == null) {
            zVar2 = null;
        } else {
            com.akita.compose.theme.re23.g.f65049a.getClass();
            zVar2 = new C48709c.z(com.akita.compose.theme.re23.g.a(symbol5), locationChooser.getIcon().getUri());
        }
        C48709c.n nVar = new C48709c.n(title3, uri, preselectedInputText, zVar2);
        y separateRegionsToggle = content.getF127882b().getSeparateRegionsToggle();
        boolean isToggleEnabled = separateRegionsToggle.getIsToggleEnabled();
        String toggleText = separateRegionsToggle.getToggleText();
        os.m icon3 = separateRegionsToggle.getIcon();
        if (icon3 == null || (symbol4 = icon3.getSymbol()) == null) {
            zVar3 = null;
        } else {
            com.akita.compose.theme.re23.g.f65049a.getClass();
            zVar3 = new C48709c.z(com.akita.compose.theme.re23.g.a(symbol4), separateRegionsToggle.getIcon().getUri());
        }
        C48709c.w wVar2 = new C48709c.w(isToggleEnabled, toggleText, zVar3);
        List<os.f> listB9 = content.getF127882b().b();
        ArrayList arrayList11 = new ArrayList(C42745f0.q(listB9, 10));
        for (os.f fVar11 : listB9) {
            arrayList11.add(new C48709c.g(fVar11.getDayCount(), fVar11.getTitle(), fVar11.getIsSelected(), false, 8, null));
        }
        os.q locations = content.getF127882b().getLocations();
        os.d priceBlock = locations.getMergedLocation().getPriceBlock();
        String title4 = priceBlock.getTitle();
        String subTitle = priceBlock.getSubTitle();
        os.m icon4 = priceBlock.getIcon();
        if (icon4 == null || (symbol3 = icon4.getSymbol()) == null) {
            zVar4 = null;
        } else {
            com.akita.compose.theme.re23.g.f65049a.getClass();
            zVar4 = new C48709c.z(com.akita.compose.theme.re23.g.a(symbol3), priceBlock.getIcon().getUri());
        }
        float value2 = (float) priceBlock.getSlider().getValue();
        int size = priceBlock.a().entrySet().iterator().next().getValue().c().size() - 2;
        C44929A c44929a = (C44929A) C42745f0.S(priceBlock.a().entrySet().iterator().next().getValue().c());
        if (c44929a != null) {
            wVar = wVar2;
            sliderPercent = (float) c44929a.getSliderPercent();
        } else {
            wVar = wVar2;
            sliderPercent = 1.0f;
        }
        C48709c.x xVar2 = new C48709c.x(value2, 0.0f, sliderPercent, size, 2, null);
        Map<String, os.g> mapA5 = priceBlock.a();
        ArrayList arrayList12 = new ArrayList(mapA5.size());
        Iterator<Map.Entry<String, os.g>> it4 = mapA5.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry<String, os.g> next2 = it4.next();
            String key = next2.getKey();
            os.g value3 = next2.getValue();
            v input = value3.getInput();
            String value4 = input.getValue();
            String placeholder = input.getPlaceholder();
            String minLimit = input.getMinLimit();
            String maxLimit = input.getMaxLimit();
            String minLimit2 = input.getMinLimit();
            C44929A c44929a2 = (C44929A) C42745f0.G(value3.c());
            C48709c.s sVar = new C48709c.s(value4, placeholder, n(minLimit2, c44929a2 != null ? c44929a2.getValue() : null), minLimit, maxLimit);
            List<C44929A> listC11 = value3.c();
            Iterator<Map.Entry<String, os.g>> it5 = it4;
            C48709c.n nVar2 = nVar;
            ArrayList arrayList13 = new ArrayList(C42745f0.q(listC11, 10));
            Iterator it6 = listC11.iterator();
            while (it6.hasNext()) {
                C44929A c44929a3 = (C44929A) it6.next();
                arrayList13.add(new C48709c.y((float) c44929a3.getSliderPercent(), c44929a3.getValue(), c44929a3.getHintText(), o(c44929a3.getTriggerData())));
                it6 = it6;
                title = title;
                description = description;
            }
            String str3 = title;
            AttributedText attributedText = description;
            os.k hint = value3.getHint();
            String text = hint.getText();
            os.l state = hint.getState();
            arrayList12.add(m0.a(key, new C48709c.f(sVar, arrayList13, new C48709c.l(text, false, state != null ? new C48709c.m(state.getMinError(), state.getMaxError(), state.getMinHint(), state.getLimitSet()) : null, 2, null))));
            it4 = it5;
            nVar = nVar2;
            title = str3;
            description = attributedText;
        }
        String str4 = title;
        AttributedText attributedText2 = description;
        C48709c.n nVar3 = nVar;
        C48709c.r rVar = new C48709c.r(new C48709c.C12686c(title4, subTitle, zVar4, xVar2, P0.p(arrayList12), null, 32, null));
        List<C44932b> listA = locations.a();
        ArrayList arrayList14 = new ArrayList(C42745f0.q(listA, 10));
        Iterator it7 = listA.iterator();
        while (it7.hasNext()) {
            C44932b c44932b = (C44932b) it7.next();
            long locationId = c44932b.getLocationId();
            os.d priceBlock2 = c44932b.getPriceBlock();
            String title5 = priceBlock2.getTitle();
            String subTitle2 = priceBlock2.getSubTitle();
            os.m icon5 = priceBlock2.getIcon();
            if (icon5 == null || (symbol2 = icon5.getSymbol()) == null) {
                zVar6 = null;
            } else {
                com.akita.compose.theme.re23.g.f65049a.getClass();
                zVar6 = new C48709c.z(com.akita.compose.theme.re23.g.a(symbol2), priceBlock2.getIcon().getUri());
            }
            float value5 = (float) priceBlock2.getSlider().getValue();
            int size2 = priceBlock2.a().entrySet().iterator().next().getValue().c().size() - 2;
            C44929A c44929a4 = (C44929A) C42745f0.S(priceBlock2.a().entrySet().iterator().next().getValue().c());
            if (c44929a4 != null) {
                arrayList = arrayList11;
                sliderPercent2 = (float) c44929a4.getSliderPercent();
            } else {
                arrayList = arrayList11;
                sliderPercent2 = 1.0f;
            }
            C48709c.x xVar3 = new C48709c.x(value5, 0.0f, sliderPercent2, size2, 2, null);
            Map<String, os.g> mapA6 = priceBlock2.a();
            ArrayList arrayList15 = new ArrayList(mapA6.size());
            Iterator<Map.Entry<String, os.g>> it8 = mapA6.entrySet().iterator();
            while (it8.hasNext()) {
                Map.Entry<String, os.g> next3 = it8.next();
                String key2 = next3.getKey();
                os.g value6 = next3.getValue();
                v input2 = value6.getInput();
                String value7 = input2.getValue();
                String placeholder2 = input2.getPlaceholder();
                String minLimit3 = input2.getMinLimit();
                String maxLimit2 = input2.getMaxLimit();
                String minLimit4 = input2.getMinLimit();
                C44929A c44929a5 = (C44929A) C42745f0.G(value6.c());
                if (c44929a5 != null) {
                    it = it7;
                    value = c44929a5.getValue();
                } else {
                    it = it7;
                    value = null;
                }
                C48709c.s sVar2 = new C48709c.s(value7, placeholder2, n(minLimit4, value), minLimit3, maxLimit2);
                List<C44929A> listC12 = value6.c();
                Iterator<Map.Entry<String, os.g>> it9 = it8;
                ArrayList arrayList16 = arrayList;
                C48709c.C48711b c48711b5 = c48711b4;
                ArrayList arrayList17 = new ArrayList(C42745f0.q(listC12, 10));
                Iterator it10 = listC12.iterator();
                while (it10.hasNext()) {
                    C44929A c44929a6 = (C44929A) it10.next();
                    arrayList17.add(new C48709c.y((float) c44929a6.getSliderPercent(), c44929a6.getValue(), c44929a6.getHintText(), o(c44929a6.getTriggerData())));
                    it10 = it10;
                    dVar = dVar;
                    rVar = rVar;
                }
                C48709c.r rVar2 = rVar;
                C48709c.d dVar2 = dVar;
                os.k hint2 = value6.getHint();
                String text2 = hint2.getText();
                os.l state2 = hint2.getState();
                arrayList15.add(m0.a(key2, new C48709c.f(sVar2, arrayList17, new C48709c.l(text2, false, state2 != null ? new C48709c.m(state2.getMinError(), state2.getMaxError(), state2.getMinHint(), state2.getLimitSet()) : null, 2, null))));
                it8 = it9;
                it7 = it;
                arrayList = arrayList16;
                c48711b4 = c48711b5;
                dVar = dVar2;
                rVar = rVar2;
            }
            arrayList14.add(new C48709c.C48710a(locationId, new C48709c.C12686c(title5, subTitle2, zVar6, xVar3, P0.p(arrayList15), null, 32, null)));
            it7 = it7;
            arrayList11 = arrayList;
            rVar = rVar;
        }
        C48709c.r rVar3 = rVar;
        C48709c.d dVar3 = dVar;
        ArrayList arrayList18 = arrayList11;
        C48709c.C48711b c48711b6 = c48711b4;
        List<r> listB10 = locations.b();
        ArrayList arrayList19 = new ArrayList(C42745f0.q(listB10, 10));
        for (r rVar4 : listB10) {
            long locationId2 = rVar4.getLocationId();
            s priceBlock3 = rVar4.getPriceBlock();
            String title6 = priceBlock3.getTitle();
            String subTitle3 = priceBlock3.getSubTitle();
            os.m icon6 = priceBlock3.getIcon();
            if (icon6 == null || (symbol = icon6.getSymbol()) == null) {
                zVar5 = null;
            } else {
                com.akita.compose.theme.re23.g.f65049a.getClass();
                zVar5 = new C48709c.z(com.akita.compose.theme.re23.g.a(symbol), priceBlock3.getIcon().getUri());
            }
            v input3 = priceBlock3.getInput();
            String value8 = input3.getValue();
            String placeholder3 = input3.getPlaceholder();
            String minLimit5 = input3.getMinLimit();
            String maxLimit3 = input3.getMaxLimit();
            String minLimit6 = input3.getMinLimit();
            C44929A c44929a7 = (C44929A) C42745f0.G(priceBlock3.e());
            C48709c.s sVar3 = new C48709c.s(value8, placeholder3, n(minLimit6, c44929a7 != null ? c44929a7.getValue() : null), minLimit5, maxLimit3);
            List<C44929A> listE = priceBlock3.e();
            ArrayList arrayList20 = new ArrayList(C42745f0.q(listE, 10));
            for (C44929A c44929a8 : listE) {
                arrayList20.add(new C48709c.y((float) c44929a8.getSliderPercent(), c44929a8.getValue(), c44929a8.getHintText(), o(c44929a8.getTriggerData())));
            }
            float value9 = (float) priceBlock3.getSlider().getValue();
            int size3 = priceBlock3.e().size() - 2;
            C44929A c44929a9 = (C44929A) C42745f0.S(priceBlock3.e());
            C48709c.x xVar4 = new C48709c.x(value9, 0.0f, c44929a9 != null ? (float) c44929a9.getSliderPercent() : 1.0f, size3, 2, null);
            os.k hint3 = priceBlock3.getHint();
            String text3 = hint3.getText();
            os.l state3 = hint3.getState();
            C48709c.q qVar = new C48709c.q(title6, subTitle3, zVar5, sVar3, arrayList20, xVar4, new C48709c.l(text3, false, state3 != null ? new C48709c.m(state3.getMinError(), state3.getMaxError(), state3.getMinHint(), state3.getLimitSet()) : null, 2, null), null, 128, null);
            os.h dayLimitBlock = rVar4.getDayLimitBlock();
            String title7 = dayLimitBlock.getTitle();
            os.i input4 = dayLimitBlock.getInput();
            C48709c.i iVar = new C48709c.i(input4.getValue(), input4.getPlaceholder(), input4.getMinPricePlaceholder(), input4.getMinLimit(), input4.getMaxLimit());
            os.k hint4 = dayLimitBlock.getHint();
            if (hint4 != null) {
                String text4 = hint4.getText();
                os.l state4 = hint4.getState();
                lVar = new C48709c.l(text4, false, state4 != null ? new C48709c.m(state4.getMinError(), state4.getMaxError(), state4.getMinHint(), state4.getLimitSet()) : null, 2, null);
            } else {
                lVar = null;
            }
            arrayList19.add(new C48709c.p(locationId2, qVar, new C48709c.h(title7, iVar, lVar)));
        }
        C48709c.o oVar5 = new C48709c.o(rVar3, arrayList14, arrayList19);
        C48709c.A a12 = new C48709c.A(content.getF127882b().getToastErrors().getLimitMinValidationError());
        os.j floatingFooter = content.getF127882b().getFloatingFooter();
        C48709c.k kVar = floatingFooter.getSkipButton().getUri() != null ? C48709c.k.b.f439549a : C48709c.k.C12687c.f439550a;
        os.e saveButton = floatingFooter.getSaveButton();
        C48709c.d dVar4 = new C48709c.d(saveButton.getTitle(), saveButton.getUri());
        os.e resetButton = floatingFooter.getResetButton();
        C48709c.d dVar5 = new C48709c.d(resetButton.getTitle(), resetButton.getUri());
        os.e skipButton = floatingFooter.getSkipButton();
        C48709c.d dVar6 = new C48709c.d(skipButton.getTitle(), skipButton.getUri());
        os.e continueWithMinButton = floatingFooter.getContinueWithMinButton();
        C48709c.j jVar = new C48709c.j(kVar, dVar4, dVar6, dVar5, new C48709c.d(continueWithMinButton.getTitle(), continueWithMinButton.getUri()));
        C48709c.t tVar5 = new C48709c.t(false, new C48709c.u(content.getF127882b().getResetSheet().getTitle(), content.getF127882b().getResetSheet().getConfirmButtonTitle(), content.getF127882b().getResetSheet().getCancelButtonTitle()));
        Iterator it11 = content.getF127882b().b().iterator();
        while (true) {
            if (!it11.hasNext()) {
                next = null;
                break;
            }
            next = it11.next();
            if (((os.f) next).getIsSelected()) {
                break;
            }
        }
        os.f fVar12 = (os.f) next;
        return C48709c.a(c48709c, false, false, null, dVar3, str4, false, attributedText2, c48711b6, wVar, fVar12 != null ? fVar12.getDayCount() : null, arrayList18, nVar3, oVar5, a12, jVar, tVar5, 5);
    }

    public final C48709c.B o(TriggerDataGeo triggerDataGeo) {
        C48709c.B b12 = triggerDataGeo != null ? new C48709c.B(triggerDataGeo.getTitle(), triggerDataGeo.getSubtitle(), new a(triggerDataGeo), new b(triggerDataGeo)) : null;
        C19616a c19616a = this.f127909b;
        c19616a.getClass();
        kotlin.reflect.n<Object> nVar = C19616a.f20576q[13];
        if (((Boolean) c19616a.f20590o.a().invoke()).booleanValue()) {
            return b12;
        }
        return null;
    }
}
