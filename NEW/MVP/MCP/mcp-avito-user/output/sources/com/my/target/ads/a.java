package com.my.target.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.T;
import androidx.camera.core.z0;
import androidx.core.view.J0;
import androidx.core.view.M;
import androidx.fragment.app.C;
import com.avito.android.R;
import com.avito.android.app.anr.EnableAnrWatchdogTask;
import com.github.anrwatchdog.c;
import com.google.android.gms.tasks.InterfaceC37024g;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.my.target.B;
import com.my.target.C37778c;
import com.my.target.C37782e;
import com.my.target.C37787g0;
import com.my.target.C37798m;
import com.my.target.C37799m0;
import com.my.target.C37801n0;
import com.my.target.C37803o0;
import com.my.target.C37807q0;
import com.my.target.C37818w0;
import com.my.target.C37820x0;
import com.my.target.L0;
import com.my.target.N0;
import com.my.target.R0;
import com.my.target.S0;
import com.my.target.Z;
import com.my.target.b1;
import com.my.target.b4;
import com.my.target.common.MyTargetActivity;
import com.my.target.e1;
import com.my.target.nativeads.d;
import com.my.target.nativeads.h;
import com.my.target.r;
import com.my.target.s1;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.evaluable.j;
import com.yandex.div.internal.widget.tabs.v;
import com.yandex.mobile.ads.impl.fz0;
import com.yandex.mobile.ads.impl.nh;
import e11.AbstractC39858c1;
import e11.C39855b1;
import e11.C39862e;
import e11.C39920x1;
import e11.D1;
import e11.Q0;
import e11.W0;
import e11.W1;
import e11.X0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import mn0.C44109b;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;
import ru.cyberity.cbr.core.domain.camera.CameraX;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionCountryFieldView;
import ru.tinkoff.core.tinkoffId.ui.webView.TinkoffWebViewAuthActivity;
import ta1.C48627a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Z.b, j, v.a, fz0.b, nh.a, C37778c.b, C37782e.C10788e.a, C37798m.a, C37801n0.a, b1.a, B.b.a, C37820x0.a, C37807q0.a, C39920x1.d, EventListener.Factory, c.f, M, io.reactivex.rxjava3.core.M, C, T.a, Toolbar.h, InterfaceC37024g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f364680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f364681c;

    public /* synthetic */ a(com.yandex.div.core.view2.divs.tabs.c cVar, C38029k c38029k) {
        this.f364680b = 4;
        this.f364681c = cVar;
    }

    @Override // e11.C39920x1.d
    public void a() {
        ((MyTargetActivity) this.f364681c).finish();
    }

    @Override // com.yandex.div.internal.widget.tabs.v.a
    public void b() {
        ((com.yandex.div.core.view2.divs.tabs.c) this.f364681c).f368752f.getClass();
        InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
    }

    @Override // com.my.target.Z.b
    public void c(AbstractC39858c1 abstractC39858c1, String str) {
        X0 x02;
        X0 x03;
        switch (this.f364680b) {
            case 0:
                ((b) this.f364681c).b((W0) abstractC39858c1, str);
                break;
            case 1:
                com.my.target.nativeads.d dVar = (com.my.target.nativeads.d) this.f364681c;
                C39862e c39862e = (C39862e) abstractC39858c1;
                if (dVar.f365003g != null) {
                    if (c39862e != null) {
                        ArrayList<Q0> arrayList = c39862e.f394575b;
                        q0 = arrayList.size() > 0 ? arrayList.get(0) : null;
                        x02 = c39862e.f394557a;
                    } else {
                        x02 = null;
                    }
                    Context context = dVar.f365000d;
                    if (q0 != null) {
                        S0 s02 = new S0(dVar, q0, dVar.f365001e, context);
                        dVar.f365002f = s02;
                        s02.f364594i = dVar.f365005i;
                        if (s02.f364592g != null) {
                            dVar.f365003g.a(s02.g(), dVar);
                            break;
                        }
                    } else if (x02 == null) {
                        d.c cVar = dVar.f365003g;
                        if (str == null) {
                            str = "no ad";
                        }
                        cVar.g(str, dVar);
                        break;
                    } else {
                        L0 l02 = new L0(dVar, x02, dVar.f395639a, dVar.f395640b, dVar.f365001e);
                        dVar.f365002f = l02;
                        l02.n(context);
                        break;
                    }
                }
                break;
            case 2:
                h hVar = (h) this.f364681c;
                C39862e c39862e2 = (C39862e) abstractC39858c1;
                if (hVar.f365011g != null) {
                    if (c39862e2 != null) {
                        ArrayList<Q0> arrayList2 = c39862e2.f394575b;
                        q0 = arrayList2.size() > 0 ? arrayList2.get(0) : null;
                        x03 = c39862e2.f394557a;
                    } else {
                        x03 = null;
                    }
                    Context context2 = hVar.f365008d;
                    if (q0 != null) {
                        C37787g0 c37787g0 = new C37787g0(hVar, q0, hVar.f365009e, context2);
                        hVar.f365010f = c37787g0;
                        k11.b bVar = c37787g0.f364847e;
                        if (bVar != null) {
                            hVar.f365011g.e(bVar);
                            break;
                        }
                    } else if (x03 == null) {
                        h.c cVar2 = hVar.f365011g;
                        if (str == null) {
                            str = "no ad";
                        }
                        cVar2.a(str);
                        break;
                    } else {
                        R0 r02 = new R0(hVar, x03, hVar.f395639a, hVar.f395640b, hVar.f365009e);
                        hVar.f365010f = r02;
                        r02.n(context2);
                        break;
                    }
                }
                break;
            default:
                D1 d12 = (D1) abstractC39858c1;
                C37818w0 c37818w0 = (C37818w0) this.f364681c;
                if (d12 == null) {
                    if (c37818w0.f365212h && c37818w0.f365213i > 0) {
                        e eVar = c37818w0.f365205a;
                        C37818w0.c cVar3 = c37818w0.f365208d;
                        eVar.removeCallbacks(cVar3);
                        eVar.postDelayed(cVar3, c37818w0.f365213i);
                        break;
                    }
                } else {
                    c37818w0.b(d12);
                    break;
                }
                break;
        }
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.asFactory$lambda$8((EventListener) this.f364681c, call);
    }

    @Override // androidx.camera.core.T.a
    public void d(z0 z0Var) throws Throwable {
        CameraX.a((CameraX) this.f364681c, z0Var);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewGroup, com.my.target.q, com.my.target.v] */
    public void f() {
        C37778c c37778c = (C37778c) this.f364681c;
        com.my.target.Q0 q02 = c37778c.f364759k;
        if (q02 != null) {
            ?? r12 = q02.f364523c;
            r12.d();
            r12.a(c37778c.f364750b);
            c37778c.f364759k.c();
            c37778c.f364759k = null;
        }
    }

    @Override // com.yandex.div.evaluable.j
    public Object get(String str) {
        C21.h hVarC = ((com.yandex.div.core.expression.d) this.f364681c).f367453b.c(str);
        if (hVarC == null) {
            return null;
        }
        return hVarC.b();
    }

    @Override // androidx.core.view.M
    public J0 h(View view, J0 j02) {
        C44109b.a((C44109b) this.f364681c, j02);
        return j02;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    @Override // io.reactivex.rxjava3.core.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(io.reactivex.rxjava3.core.K r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.ads.a.j(io.reactivex.rxjava3.core.K):void");
    }

    @Override // androidx.fragment.app.C
    public void k(Bundle bundle, String str) {
        switch (this.f364680b) {
            case 22:
                ru.cyberity.cbr.camera.photo.presentation.a.a((ru.cyberity.cbr.camera.photo.presentation.a) this.f364681c, str, bundle);
                break;
            case 23:
            default:
                ru.cyberity.cbr.presentation.screen.preview.selfie.a.a((ru.cyberity.cbr.presentation.screen.preview.selfie.a) this.f364681c, str, bundle);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                CBRApplicantDataSelectionCountryFieldView.m309setFragmentResultListener$lambda9$lambda8((CBRApplicantDataSelectionCountryFieldView) this.f364681c, str, bundle);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ru.cyberity.cbr.presentation.screen.a.a((ru.cyberity.cbr.presentation.screen.a) this.f364681c, str, bundle);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ru.cyberity.cbr.presentation.screen.preview.photo.identity.a.a((ru.cyberity.cbr.presentation.screen.preview.photo.identity.a) this.f364681c, str, bundle);
                break;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        int i12 = TinkoffWebViewAuthActivity.f437095e;
        if (menuItem.getItemId() != R.id.reloadMenuItem) {
            return false;
        }
        WebView webView = ((TinkoffWebViewAuthActivity) this.f364681c).f437098d;
        if (webView == null) {
            webView = null;
        }
        webView.reload();
        return true;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37024g
    public void onSuccess(Object obj) {
        ((C48627a) this.f364681c).invoke(obj);
    }

    public /* synthetic */ a(Object obj, int i12) {
        this.f364680b = i12;
        this.f364681c = obj;
    }

    @Override // com.yandex.mobile.ads.impl.nh.a
    public void a(long j12, long j13, long j14) {
        ((com.yandex.mobile.ads.exo.offline.e) this.f364681c).a(j12, j13, j14);
    }

    @Override // com.my.target.b1.a
    public void d() {
        switch (this.f364680b) {
            case 11:
                r rVar = r.this;
                b1 b1Var = rVar.f365096o;
                if (b1Var != null && rVar.f365091j != null) {
                    if (b1Var.getParent() != null) {
                        ((ViewGroup) rVar.f365096o.getParent()).removeView(rVar.f365096o);
                        rVar.f365096o.removeAllViews();
                        rVar.f365096o.setOnCloseListener(null);
                        rVar.f365096o = null;
                        rVar.f(rVar.f365091j);
                        rVar.g("default");
                    }
                    C37799m0.d dVar = rVar.f365093l;
                    if (dVar != null) {
                        dVar.a();
                        break;
                    }
                }
                break;
            default:
                ((e1) this.f364681c).k();
                break;
        }
    }

    @Override // com.my.target.C37798m.a
    public void a(Context context) {
        b4 b4Var = (b4) this.f364681c;
        s1 s1Var = b4Var.f364738k;
        if (s1Var != null) {
            s1Var.d();
            s1Var.f365134d.destroy();
            C39855b1 c39855b1 = s1Var.f365135e;
            WeakReference<View> weakReference = c39855b1.f394538c;
            if (weakReference != null) {
                weakReference.clear();
            }
            c39855b1.f394537b.clear();
            c39855b1.f394536a.clear();
            c39855b1.f394538c = null;
        }
        b4Var.i();
        N0 n02 = b4Var.f364732e;
        n02.getClass();
        b4Var.f364731d.d(b4Var.f364729b, n02.getContext());
    }

    @Override // com.yandex.mobile.ads.impl.fz0.b
    public void a(fz0 fz0Var, int i12) {
        ((com.yandex.mobile.ads.exo.offline.c) this.f364681c).a(fz0Var, i12);
    }

    @Override // com.my.target.C37820x0.a
    public void a(boolean z12) {
        C37803o0 c37803o0 = (C37803o0) this.f364681c;
        WeakReference<C37820x0> weakReference = c37803o0.f365053k;
        if (weakReference == null) {
            return;
        }
        C37820x0 c37820x0 = weakReference.get();
        if (c37820x0 == null) {
            c37803o0.f365053k = null;
            return;
        }
        WeakReference<View> weakReference2 = c37803o0.f365052j;
        View view = weakReference2 != null ? weakReference2.get() : null;
        ViewParent parent = c37820x0.getParent();
        if (parent == null || parent != view) {
            c37820x0.setStateChangedListener(null);
            c37803o0.f365053k.clear();
            c37803o0.f365053k = null;
            return;
        }
        W1 w12 = c37803o0.f365046d;
        e11.S0 s02 = c37803o0.f365043a;
        if (!z12) {
            c37803o0.d(true);
            if (c37803o0.f365055m) {
                c37803o0.f365055m = false;
                C37803o0.a aVar = c37803o0.f365051i;
                if (aVar != null) {
                    aVar.b(false);
                }
            }
            w12.b(s02);
            return;
        }
        if (c37803o0.f365058p && !c37803o0.f365060r) {
            c37803o0.d(false);
            if (!c37803o0.f365056n) {
                return;
            }
        }
        c37803o0.b();
        if (c37803o0.e()) {
            return;
        }
        w12.a(s02);
    }

    @Override // com.github.anrwatchdog.c.f
    public void a(com.github.anrwatchdog.a aVar) {
        EnableAnrWatchdogTask.execute$lambda$0((EnableAnrWatchdogTask) this.f364681c, aVar);
    }
}
