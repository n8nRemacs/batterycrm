package sberid.sdk.ui.screens.compose.elk.root;

import Mb1.b;
import Xb1.a;
import Yb1.a;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import androidx.view.M0;
import androidx.view.N0;
import e.InterfaceC39835a;
import e31.C39939a;
import f61.C40239a;
import gc1.C40657a;
import gc1.InterfaceC40658b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.A1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.serialization.json.AbstractC43443a;
import sberid.sdk.ui.models.root.ELKRootTypes;
import sberid.sdk.ui.screens.view.elk.fragment.NativeDialogFragment;
import sberid.sdk.ui.screens.view.sso.loading.LoadingSsoBottomSheetFragment;
import sberid.sdk.ui.utils.extensions.j;
import u2.AbstractC48768c;
import u2.C48766a;
import z2.C50357a;
import z2.InterfaceC50358b;

/* loaded from: classes9.dex */
public final class w extends M0 {

    /* renamed from: E, reason: collision with root package name */
    public final G41.a f437856E;

    /* renamed from: J, reason: collision with root package name */
    public final Cc1.c f437857J;

    /* renamed from: K, reason: collision with root package name */
    public final Cc1.a f437858K;

    /* renamed from: L, reason: collision with root package name */
    public final Cc1.d f437859L;

    /* renamed from: M, reason: collision with root package name */
    public final Z1 f437860M = p2.a(new InterfaceC40658b.m(0, 0, null, null, null, null, 63, null));

    /* renamed from: N, reason: collision with root package name */
    public final Z1 f437861N;

    /* renamed from: O, reason: collision with root package name */
    public final Z1 f437862O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f437863P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f437864Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f437865R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f437866S;

    /* renamed from: T, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f437867T;

    public w(G41.a aVar, Cc1.c cVar, Cc1.a aVar2, Cc1.d dVar) {
        this.f437856E = aVar;
        this.f437857J = cVar;
        this.f437858K = aVar2;
        this.f437859L = dVar;
        Z1 z1A = p2.a(s.f437831f);
        this.f437861N = z1A;
        this.f437862O = z1A;
        this.f437867T = new kotlinx.coroutines.sync.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlinx.coroutines.sync.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ke(java.lang.Boolean r16, java.lang.Boolean r17, java.lang.Boolean r18, N41.g r19, gc1.InterfaceC40658b r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sberid.sdk.ui.screens.compose.elk.root.w.ke(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, N41.g, gc1.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, kotlin.C] */
    public final void le(q qVar) {
        String nativeUrl;
        gc1.g sso;
        String deeplinkUrl;
        String browserUrl;
        Object bVar;
        Object bVar2;
        Object bVar3;
        String webLink;
        Object bVar4;
        boolean z12 = false;
        if (qVar instanceof m) {
            m mVar = (m) qVar;
            if (this.f437863P) {
                return;
            }
            this.f437863P = true;
            C43259k.d(N0.a(this), null, null, new v(this, mVar.f437827a, null), 3);
            G41.i iVar = (G41.i) this.f437856E;
            C43175k.K(new A1(new InterfaceC43160i[]{iVar.f6344o, iVar.f6341l, iVar.f6338i, iVar.f6332c}, new u(this, null)), N0.a(this));
            return;
        }
        if (!(qVar instanceof k)) {
            boolean z13 = qVar instanceof p;
            Cc1.d dVar = this.f437859L;
            if (z13) {
                InterfaceC40658b.k kVar = ((p) qVar).f437830a;
                if (this.f437865R) {
                    return;
                }
                dVar.getClass();
                sberid.sdk.ui.utils.extensions.j.b(dVar.f2364a, kVar, true);
                if (kVar.f396578f == ELKRootTypes.f437784b) {
                    ((zc1.c) dVar.f2365b).a(a.b.f18953a);
                }
                this.f437865R = true;
                return;
            }
            boolean z14 = qVar instanceof o;
            Z1 z15 = this.f437862O;
            if (z14) {
                InterfaceC40658b.k kVar2 = ((o) qVar).f437829a;
                InterfaceC40658b interfaceC40658b = ((s) z15.getValue()).f437836e;
                Cc1.c cVar = this.f437857J;
                cVar.getClass();
                cVar.f2362g.a(interfaceC40658b, new Cc1.b(cVar));
                dVar.getClass();
                int[] iArr = j.a.f437906a;
                ELKRootTypes eLKRootTypes = kVar2.f396578f;
                int i12 = iArr[eLKRootTypes.ordinal()];
                C50357a c50357a = dVar.f2364a;
                C39939a c39939a = c50357a.f443798a;
                C40239a c40239a = c50357a.f443800c;
                InterfaceC39835a interfaceC39835a = c50357a.f443799b;
                if (i12 == 1) {
                    e.h hVar = (e.h) interfaceC39835a;
                    c39939a.a(new a.i(null, null, "Click", hVar.f394234g, c40239a.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", hVar.a(), null, 259, null));
                } else if (i12 == 2) {
                    e.h hVar2 = (e.h) interfaceC39835a;
                    c39939a.a(new a.m(null, null, "Click", hVar2.f394234g, c40239a.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", hVar2.a(), null, 259, null));
                }
                if (eLKRootTypes == ELKRootTypes.f437784b) {
                    ((zc1.c) dVar.f2365b).a(a.d.f18955a);
                    return;
                }
                return;
            }
            if (qVar instanceof l) {
                if (!this.f437864Q || ((s) z15.getValue()).f437832a) {
                    InterfaceC40658b interfaceC40658b2 = ((s) z15.getValue()).f437836e;
                    dVar.getClass();
                    sberid.sdk.ui.utils.extensions.j.b(dVar.f2364a, interfaceC40658b2, false);
                    if ((interfaceC40658b2 instanceof InterfaceC40658b.k) && ((InterfaceC40658b.k) interfaceC40658b2).f396578f == ELKRootTypes.f437784b) {
                        ((zc1.c) dVar.f2365b).a(a.e.f18956a);
                    }
                    this.f437864Q = true;
                    return;
                }
                return;
            }
            if (!(qVar instanceof n)) {
                if (!(qVar instanceof j) || dVar.f2366c) {
                    return;
                }
                dVar.f2366c = true;
                C50357a c50357a2 = dVar.f2364a;
                InterfaceC39835a interfaceC39835a2 = c50357a2.f443799b;
                c50357a2.f443798a.a(new a.C1382a(null, null, "Show", ((e.h) interfaceC39835a2).f394234g, c50357a2.f443800c.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", ((e.h) interfaceC39835a2).a(), null, 259, null));
                return;
            }
            InterfaceC40658b.k kVar3 = ((n) qVar).f437828a;
            if (this.f437866S) {
                return;
            }
            boolean z16 = ((s) z15.getValue()).f437833b;
            dVar.getClass();
            ELKRootTypes eLKRootTypes2 = ELKRootTypes.f437784b;
            C50357a c50357a3 = dVar.f2364a;
            C39939a c39939a2 = c50357a3.f443798a;
            C40239a c40239a2 = c50357a3.f443800c;
            InterfaceC39835a interfaceC39835a3 = c50357a3.f443799b;
            ELKRootTypes eLKRootTypes3 = kVar3.f396578f;
            if (eLKRootTypes3 == eLKRootTypes2) {
                e.h hVar3 = (e.h) interfaceC39835a3;
                c39939a2.a(new a.i(null, null, "Hide", hVar3.f394234g, c40239a2.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", hVar3.a(), null, 259, null));
            } else {
                ELKRootTypes eLKRootTypes4 = ELKRootTypes.f437785c;
                if (eLKRootTypes3 == eLKRootTypes4 && !z16) {
                    e.h hVar4 = (e.h) interfaceC39835a3;
                    c39939a2.a(new a.n(null, null, "Hide", hVar4.f394234g, c40239a2.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", hVar4.a(), null, null, 771, null));
                } else if (eLKRootTypes3 == eLKRootTypes4 && z16) {
                    e.h hVar5 = (e.h) interfaceC39835a3;
                    c39939a2.a(new a.m(null, null, "Hide", hVar5.f394234g, c40239a2.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", hVar5.a(), null, 259, null));
                }
            }
            if (eLKRootTypes3 == eLKRootTypes2) {
                ((zc1.c) dVar.f2365b).a(a.c.f18954a);
            }
            this.f437866S = true;
            return;
        }
        k kVar4 = (k) qVar;
        Cc1.a aVar = this.f437858K;
        aVar.getClass();
        InterfaceC40658b interfaceC40658b3 = kVar4.f437823a;
        C40657a c40657a = kVar4.f437824b;
        if (c40657a == null || (nativeUrl = c40657a.getNativeUrl()) == null || C43066x.K(nativeUrl)) {
            nativeUrl = null;
        }
        C50357a c50357a4 = aVar.f2353a;
        InterfaceC50358b interfaceC50358b = aVar.f2354b;
        if (c40657a == null || (sso = c40657a.getSso()) == null) {
            sso = null;
        } else {
            String webLink2 = sso.getWebLink();
            if (webLink2 != null && C43066x.K(webLink2)) {
                ((zc1.c) interfaceC50358b).b(interfaceC40658b3.getF396628m(), sberid.sdk.ui.utils.extensions.h.a(c40657a));
                sberid.sdk.ui.utils.extensions.j.a(c50357a4, interfaceC40658b3, sberid.sdk.ui.utils.extensions.h.a(c40657a), null);
                return;
            }
        }
        if (c40657a == null || (deeplinkUrl = c40657a.getDeeplinkUrl()) == null || C43066x.K(deeplinkUrl)) {
            deeplinkUrl = null;
        }
        if (c40657a == null || (browserUrl = c40657a.getBrowserUrl()) == null || C43066x.K(browserUrl)) {
            browserUrl = null;
        }
        ActivityC22955m activityC22955m = kVar4.f437825c;
        if (sso != null) {
            Boolean isAdaptive = c40657a.getIsAdaptive();
            try {
                int i13 = Z.f406624c;
                webLink = sso.getWebLink();
            } catch (Throwable th2) {
                int i14 = Z.f406624c;
                bVar3 = new Z.b(th2);
            }
            if (webLink == null) {
                return;
            }
            String clientId = sso.getClientId();
            try {
                bVar4 = Integer.valueOf(Color.parseColor(sso.getPartnerColor()));
            } catch (Throwable th3) {
                int i15 = Z.f406624c;
                bVar4 = new Z.b(th3);
            }
            boolean z17 = bVar4 instanceof Z.b;
            Object obj = bVar4;
            if (z17) {
                obj = null;
            }
            bVar3 = new Zb1.b(webLink, clientId, (Integer) obj, sso.getOpenIn());
            boolean z18 = bVar3 instanceof Z.b;
            Object obj2 = bVar3;
            if (z18) {
                obj2 = null;
            }
            Zb1.b bVar5 = (Zb1.b) obj2;
            if (bVar5 == null) {
                return;
            }
            boolean z19 = Bc1.e.f1568d;
            String str = bVar5.f20270a;
            if (!z19) {
                if (!C43066x.K(str) && URLUtil.isValidUrl(str)) {
                    FragmentManager supportFragmentManager = activityC22955m.getSupportFragmentManager();
                    LoadingSsoBottomSheetFragment loadingSsoBottomSheetFragment = new LoadingSsoBottomSheetFragment();
                    Bc1.e.f1568d = true;
                    loadingSsoBottomSheetFragment.subscribeOnDetach(Bc1.a.f1561l);
                    loadingSsoBottomSheetFragment.show(supportFragmentManager, "AppTokenTAG");
                    Eb1.d dVar2 = (Eb1.d) Bc1.e.f1565a.getValue();
                    dVar2.getClass();
                    if (dVar2.a()) {
                        dVar2.f4106e.a(bVar5, true);
                    } else {
                        Eb1.b bVar6 = new Eb1.b(dVar2, bVar5);
                        yc1.d dVar3 = dVar2.f4103b;
                        C43259k.d((T) ((D31.g) dVar3.f443384c).f2880a.getValue(), null, null, new yc1.c(dVar3, bVar6, null), 3);
                    }
                } else {
                    ((B81.e) ((B81.a) Bc1.e.f1567c.getValue())).a(b.e.f10844a);
                }
            }
            ((zc1.c) interfaceC50358b).b(interfaceC40658b3.getF396628m(), str);
            String webLink3 = sso.getWebLink();
            if (webLink3 == null) {
                webLink3 = "";
            }
            sberid.sdk.ui.utils.extensions.j.a(c50357a4, interfaceC40658b3, webLink3, isAdaptive);
            return;
        }
        if (deeplinkUrl != null && sc1.j.a(deeplinkUrl)) {
            Boolean isAdaptive2 = c40657a.getIsAdaptive();
            activityC22955m.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(deeplinkUrl)));
            ((zc1.c) interfaceC50358b).b(interfaceC40658b3.getF396628m(), deeplinkUrl);
            sberid.sdk.ui.utils.extensions.j.a(c50357a4, interfaceC40658b3, deeplinkUrl, isAdaptive2);
            return;
        }
        if (browserUrl != null && !C43066x.K(browserUrl) && URLUtil.isValidUrl(browserUrl) && sc1.j.a(browserUrl)) {
            Boolean isAdaptive3 = c40657a.getIsAdaptive();
            activityC22955m.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(browserUrl)));
            ((zc1.c) interfaceC50358b).b(interfaceC40658b3.getF396628m(), browserUrl);
            sberid.sdk.ui.utils.extensions.j.a(c50357a4, interfaceC40658b3, browserUrl, isAdaptive3);
            return;
        }
        if (nativeUrl == null) {
            Boolean isAdaptive4 = c40657a != null ? c40657a.getIsAdaptive() : null;
            ((zc1.c) interfaceC50358b).b(interfaceC40658b3.getF396628m(), sberid.sdk.ui.utils.extensions.h.a(c40657a));
            sberid.sdk.ui.utils.extensions.j.a(c50357a4, interfaceC40658b3, sberid.sdk.ui.utils.extensions.h.a(c40657a), isAdaptive4);
            return;
        }
        Boolean isAdaptive5 = c40657a.getIsAdaptive();
        Object obj3 = AbstractC48768c.f439727a;
        FragmentManager supportFragmentManager2 = activityC22955m.getSupportFragmentManager();
        InterfaceC40658b.k kVar5 = new InterfaceC40658b.k(null, nativeUrl, null, null, C42784z0.f406748b, ELKRootTypes.f437785c, 12, null);
        NativeDialogFragment.f437870h0.getClass();
        try {
            int i16 = Z.f406624c;
            AbstractC43443a.C11757a c11757a = AbstractC43443a.f412954d;
            c11757a.getClass();
            bVar = c11757a.c(InterfaceC40658b.k.INSTANCE.serializer(), kVar5);
        } catch (Throwable th4) {
            int i17 = Z.f406624c;
            bVar = new Z.b(th4);
        }
        boolean z22 = bVar instanceof Z.b;
        Object obj4 = bVar;
        if (z22) {
            obj4 = null;
        }
        String str2 = (String) obj4;
        if (z22 || str2 == null) {
            InterfaceC40658b.k.class.toString();
            kVar5.toString();
        }
        if (str2 == null) {
            try {
                bVar2 = Dc1.c.f3297a.l(kVar5);
            } catch (Throwable th5) {
                int i18 = Z.f406624c;
                bVar2 = new Z.b(th5);
            }
            boolean z23 = bVar2 instanceof Z.b;
            if (z23) {
                bVar2 = null;
            }
            str2 = (String) bVar2;
            if (z23 || str2 == null) {
                InterfaceC40658b.k.class.toString();
                kVar5.toString();
            }
            if (str2 == null) {
                str2 = "";
            }
        }
        NativeDialogFragment nativeDialogFragment = new NativeDialogFragment(z12 ? 1 : 0);
        Bundle bundle = new Bundle(1);
        bundle.putString("NativeDialogFragmentTag", str2);
        nativeDialogFragment.setArguments(bundle);
        nativeDialogFragment.f437871f0 = C48766a.f439725l;
        nativeDialogFragment.show(supportFragmentManager2, "NativeDialogFragmentTAG" + kVar5.hashCode());
        ((zc1.c) interfaceC50358b).b(interfaceC40658b3.getF396628m(), nativeUrl);
        sberid.sdk.ui.utils.extensions.j.a(c50357a4, interfaceC40658b3, nativeUrl, isAdaptive5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean me(InterfaceC40658b interfaceC40658b, HashMap map, HashMap map2) {
        String str;
        if ((interfaceC40658b instanceof InterfaceC40658b.k) && ((str = ((InterfaceC40658b.k) interfaceC40658b).f396574b) == null || L.f(map2.get(str), Boolean.TRUE))) {
            return false;
        }
        Object obj = map.get(interfaceC40658b.getF396624i());
        Boolean bool = Boolean.TRUE;
        if ((L.f(obj, bool) || L.f(map.get(interfaceC40658b.toString()), bool)) && !(interfaceC40658b instanceof InterfaceC40658b.k)) {
            return (L.f(map.get(interfaceC40658b.getF396624i()), bool) || L.f(map.get(interfaceC40658b.toString()), bool)) && !interfaceC40658b.c();
        }
        List<InterfaceC40658b> listA = interfaceC40658b.a();
        if (listA == null) {
            InterfaceC40658b interfaceC40658b2 = (InterfaceC40658b) ((HashMap) ((G41.i) this.f437856E).f6338i.getValue()).get(interfaceC40658b.getF396624i());
            listA = interfaceC40658b2 != null ? interfaceC40658b2.a() : null;
            if (listA == null) {
                return false;
            }
        }
        int size = listA.size();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            if (me((InterfaceC40658b) it.next(), map, map2)) {
                size--;
            }
        }
        return size <= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean ne(InterfaceC40658b interfaceC40658b, HashMap map, HashMap map2) {
        if ((interfaceC40658b instanceof InterfaceC40658b.k) || (interfaceC40658b instanceof InterfaceC40658b.i) || (interfaceC40658b instanceof InterfaceC40658b.h) || (interfaceC40658b instanceof InterfaceC40658b.l) || (interfaceC40658b instanceof InterfaceC40658b.n)) {
            List<InterfaceC40658b> listA = interfaceC40658b.a();
            if (listA == null) {
                InterfaceC40658b interfaceC40658b2 = (InterfaceC40658b) ((HashMap) ((G41.i) this.f437856E).f6338i.getValue()).get(interfaceC40658b.getF396624i());
                listA = interfaceC40658b2 != null ? interfaceC40658b2.a() : null;
            }
            if (listA != null) {
                Iterator<T> it = listA.iterator();
                while (it.hasNext()) {
                    if (ne((InterfaceC40658b) it.next(), map, map2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (!(interfaceC40658b instanceof InterfaceC40658b.c) && !(interfaceC40658b instanceof InterfaceC40658b.d) && !(interfaceC40658b instanceof InterfaceC40658b.e) && !(interfaceC40658b instanceof InterfaceC40658b.f) && !(interfaceC40658b instanceof InterfaceC40658b.g) && !(interfaceC40658b instanceof InterfaceC40658b.j) && !(interfaceC40658b instanceof InterfaceC40658b.m) && !(interfaceC40658b instanceof InterfaceC40658b.o) && !(interfaceC40658b instanceof InterfaceC40658b.p)) {
            throw new NoWhenBranchMatchedException();
        }
        String f396624i = interfaceC40658b.getF396624i();
        if (f396624i == null) {
            return interfaceC40658b.c();
        }
        Object obj = map2.get(f396624i);
        Boolean bool = Boolean.FALSE;
        boolean zF2 = L.f(obj, bool);
        boolean z12 = L.f(map.get(interfaceC40658b.getF396624i()), bool) || L.f(map.get(interfaceC40658b.toString()), bool);
        if (zF2) {
            return z12 || interfaceC40658b.c();
        }
        return false;
    }
}
