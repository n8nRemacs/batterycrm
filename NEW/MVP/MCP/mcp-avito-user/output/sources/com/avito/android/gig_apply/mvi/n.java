package com.avito.android.gig_apply.mvi;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.gig_apply.GigSlotMapDeeplink;
import com.avito.android.gig_apply.domain.ActionWaitingFor;
import com.avito.android.gig_apply.models.GigSlotTimer;
import com.avito.android.gig_apply.ui.GigSlotOpenParams;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mH.C43964c;
import nH.C44253b;
import nH.C44254c;
import nH.C44255d;
import pH.C46957e;
import pH.i;
import pH.k;

/* compiled from: GigSlotActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_apply/mvi/n;", "Lcom/avito/android/arch/mvi/a;", "LpH/i;", "LpH/k;", "LpH/w;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements com.avito.android.arch.mvi.a<pH.i, pH.k, pH.w> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final GigSlotOpenParams f159741a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f159742b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_apply.domain.h f159743c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43964c f159744d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_apply.domain.e f159745e;

    /* compiled from: GigSlotActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159746a;

        static {
            int[] iArr = new int[GigSlotTimer.Direction.values().length];
            try {
                GigSlotTimer.Direction direction = GigSlotTimer.Direction.f159692b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                GigSlotTimer.Direction direction2 = GigSlotTimer.Direction.f159692b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f159746a = iArr;
        }
    }

    @Inject
    public n(@Y61.k GigSlotOpenParams gigSlotOpenParams, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.gig_apply.domain.h hVar, @Y61.k C43964c c43964c, @Y61.k com.avito.android.gig_apply.domain.e eVar) {
        this.f159741a = gigSlotOpenParams;
        this.f159742b = aVar;
        this.f159743c = hVar;
        this.f159744d = c43964c;
        this.f159745e = eVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<pH.k> b(pH.i iVar, pH.w wVar) {
        DeepLink deepLink;
        DeepLink deepLink2;
        DeepLink deepLink3;
        DeepLink deepLink4;
        String str;
        Uri uri;
        pH.j jVar;
        DeepLink deepLink5;
        pH.j jVar2;
        DeepLink deepLink6;
        InterfaceC43160i<pH.k> interfaceC43160iW;
        DeepLink deepLink7;
        DeepLink deepLink8;
        DeepLink deepLink9;
        DeepLink deepLink10;
        pH.i iVar2 = iVar;
        pH.w wVar2 = wVar;
        boolean z12 = iVar2 instanceof i.r;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f159742b;
        ActionWaitingFor actionWaitingFor = null;
        C43964c c43964c = this.f159744d;
        GigSlotOpenParams gigSlotOpenParams = this.f159741a;
        if (z12) {
            long j12 = gigSlotOpenParams.f159882b;
            c43964c.getClass();
            c43964c.f414443a.c(new nH.j(j12));
            pH.x xVar = wVar2.f428439E;
            if (xVar != null && (deepLink10 = xVar.f428477a) != null) {
                b.a.a(aVar, deepLink10, null, null, 6);
            }
            return C43175k.w();
        }
        boolean z13 = iVar2 instanceof i.j;
        pH.j jVar3 = wVar2.f428456f;
        if (z13) {
            if (jVar3 != null && (deepLink9 = jVar3.f428375b) != null) {
                long j13 = gigSlotOpenParams.f159882b;
                c43964c.getClass();
                c43964c.f414443a.c(new C44253b(j13, jVar3.f428374a));
                b.a.a(aVar, deepLink9, null, null, 6);
            }
            return C43175k.w();
        }
        if (iVar2 instanceof i.p) {
            pH.j jVar4 = wVar2.f428457g;
            if (jVar4 != null && (deepLink8 = jVar4.f428375b) != null) {
                long j14 = gigSlotOpenParams.f159882b;
                c43964c.getClass();
                c43964c.f414443a.c(new C44253b(j14, jVar4.f428374a));
                b.a.a(aVar, deepLink8, null, null, 6);
            }
            return C43175k.w();
        }
        if (iVar2 instanceof i.l) {
            pH.j jVar5 = wVar2.f428458h;
            if (jVar5 != null && (deepLink7 = jVar5.f428375b) != null) {
                long j15 = gigSlotOpenParams.f159882b;
                c43964c.getClass();
                c43964c.f414443a.c(new nH.f(j15));
                b.a.a(aVar, deepLink7, null, null, 6);
            }
            return C43175k.w();
        }
        boolean z14 = iVar2 instanceof i.f;
        GigSlotTimer gigSlotTimer = wVar2.f428453c;
        if (z14) {
            GigSlotTimer.Direction direction = gigSlotTimer != null ? gigSlotTimer.f159690e : null;
            int i12 = direction == null ? -1 : a.f159746a[direction.ordinal()];
            if (i12 == 1) {
                actionWaitingFor = ActionWaitingFor.f159659c;
            } else if (i12 == 2) {
                actionWaitingFor = ActionWaitingFor.f159658b;
            }
            if (actionWaitingFor != null) {
                i.f fVar = (i.f) iVar2;
                boolean z15 = jVar3 != null;
                com.avito.android.gig_apply.domain.e eVar = this.f159745e;
                eVar.getClass();
                long j16 = fVar.f428357a;
                if (j16 == 0) {
                    interfaceC43160iW = C43175k.w();
                } else {
                    ActionWaitingFor actionWaitingFor2 = ActionWaitingFor.f159659c;
                    if (actionWaitingFor == actionWaitingFor2 && z15) {
                        interfaceC43160iW = C43175k.w();
                    } else {
                        ActionWaitingFor actionWaitingFor3 = ActionWaitingFor.f159658b;
                        interfaceC43160iW = (actionWaitingFor == actionWaitingFor3 && eVar.f159673d) ? C43175k.w() : (actionWaitingFor != actionWaitingFor2 || j16 > eVar.f159672c - 2) ? (actionWaitingFor == actionWaitingFor3 && j16 == 3) ? eVar.a(j16, actionWaitingFor) : C43175k.w() : eVar.a(j16, actionWaitingFor);
                    }
                }
                if (interfaceC43160iW != null) {
                    return interfaceC43160iW;
                }
            }
            return C43175k.w();
        }
        if (iVar2 instanceof i.k ? true : iVar2.equals(i.o.f428366a) ? true : iVar2.equals(i.m.f428364a) ? true : iVar2.equals(i.s.f428370a)) {
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(C43175k.G(new o(2, null)), this.f159743c.b(gigSlotOpenParams.f159882b)));
        }
        if (iVar2 instanceof i.v) {
            if (gigSlotTimer != null) {
                long j17 = gigSlotOpenParams.f159882b;
                c43964c.getClass();
                c43964c.f414443a.c(new C44255d(j17, "end_view"));
            }
            return C43175k.w();
        }
        boolean z16 = iVar2 instanceof i.a;
        C46957e c46957e = wVar2.f428440F;
        if (z16) {
            if (c46957e != null && c46957e.f428338e) {
                return C43175k.w();
            }
            if (c46957e != null && (jVar2 = c46957e.f428336c) != null && (deepLink6 = jVar2.f428375b) != null) {
                long j18 = gigSlotOpenParams.f159882b;
                c43964c.getClass();
                c43964c.f414443a.c(new nH.h(j18, "yes"));
                b.a.a(aVar, deepLink6, null, null, 6);
            }
            return C43175k.w();
        }
        if (iVar2 instanceof i.b) {
            if (c46957e != null && c46957e.f428338e) {
                return C43175k.w();
            }
            if (c46957e != null && (jVar = c46957e.f428337d) != null && (deepLink5 = jVar.f428375b) != null) {
                long j19 = gigSlotOpenParams.f159882b;
                c43964c.getClass();
                c43964c.f414443a.c(new nH.h(j19, "no"));
                b.a.a(aVar, deepLink5, null, null, 6);
            }
            return C43175k.w();
        }
        if (iVar2 instanceof i.e) {
            pH.l lVar = wVar2.f428441G;
            if (lVar != null && (str = lVar.f428410d) != null && (uri = Uri.parse(str)) != null) {
                long j22 = gigSlotOpenParams.f159882b;
                c43964c.getClass();
                c43964c.f414443a.c(new C44254c(j22, "rules"));
                b.a.a(aVar, new WebViewLink.OnlyAvitoDomain(uri, null, null, 6, null), null, null, 6);
            }
            return C43175k.w();
        }
        if (iVar2 instanceof i.t) {
            pH.y yVar = wVar2.f428442H;
            if (yVar != null && (deepLink4 = yVar.f428482d) != null) {
                long j23 = gigSlotOpenParams.f159882b;
                c43964c.getClass();
                c43964c.f414443a.c(new C44254c(j23, "rules"));
                b.a.a(aVar, deepLink4, null, null, 6);
            }
            return C43175k.w();
        }
        if (iVar2 instanceof i.q) {
            pH.o oVar = wVar2.f428461k;
            if (oVar != null) {
                long j24 = gigSlotOpenParams.f159882b;
                c43964c.getClass();
                c43964c.f414443a.c(new C44254c(j24, "maps"));
                pH.n nVar = oVar.f428418d;
                Double dValueOf = Double.valueOf(nVar.f428413a);
                Double dValueOf2 = Double.valueOf(nVar.f428414b);
                pH.m mVar = oVar.f428417c;
                b.a.a(aVar, new GigSlotMapDeeplink(oVar.f428415a, oVar.f428416b, dValueOf, dValueOf2, mVar.f428411a, mVar.f428412b), null, null, 6);
            }
            return C43175k.w();
        }
        if (iVar2 instanceof i.d) {
            List list = wVar2.f428464n;
            if (list == null) {
                list = C42784z0.f406748b;
            }
            return new C43210w(new k.h(com.avito.android.printable_text.b.c(R.string.gig_slot_duties_title, new Serializable[0]), list));
        }
        if (iVar2 instanceof i.u) {
            long j25 = gigSlotOpenParams.f159882b;
            c43964c.getClass();
            c43964c.f414443a.c(new nH.k(j25));
            return C43175k.w();
        }
        if (iVar2 instanceof i.c) {
            pH.t tVar = wVar2.f428444J;
            if (tVar.f428429a && (deepLink3 = tVar.f428430b) != null) {
                b.a.a(aVar, deepLink3, null, null, 6);
            }
            return C43175k.w();
        }
        boolean z17 = iVar2 instanceof i.h;
        pH.r rVar = wVar2.f428445K;
        if (z17) {
            pH.s sVar = rVar.f428423a;
            if (sVar != null && (deepLink2 = sVar.f428428c) != null) {
                b.a.a(aVar, deepLink2, null, null, 6);
            }
            return C43175k.w();
        }
        if (iVar2 instanceof i.g) {
            pH.j jVar6 = rVar.f428425c;
            if (jVar6 != null && (deepLink = jVar6.f428375b) != null) {
                long j26 = gigSlotOpenParams.f159882b;
                c43964c.getClass();
                c43964c.f414443a.c(new C44253b(j26, jVar6.f428374a));
                b.a.a(aVar, deepLink, null, null, 6);
            }
            return C43175k.w();
        }
        if (iVar2 instanceof i.C12261i) {
            b.a.a(aVar, ((i.C12261i) iVar2).f428360a, null, null, 6);
            return C43175k.w();
        }
        if (!(iVar2 instanceof i.n)) {
            throw new NoWhenBranchMatchedException();
        }
        long j27 = gigSlotOpenParams.f159882b;
        c43964c.getClass();
        c43964c.f414443a.c(new nH.g(j27));
        b.a.a(aVar, ((i.n) iVar2).f428365a, null, null, 6);
        return C43175k.w();
    }
}
