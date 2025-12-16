package v31;

import Fc1.A3;
import Fc1.C13697p1;
import Fc1.C13709q4;
import Fc1.D3;
import Fc1.F1;
import Fc1.I0;
import Fc1.InterfaceC13581c2;
import Fc1.InterfaceC13642j0;
import Fc1.InterfaceC13753v4;
import Fc1.InterfaceC13779y3;
import Fc1.InterfaceC13784z;
import Fc1.K3;
import Fc1.L3;
import Fc1.Q2;
import Fc1.V1;
import Y41.l;
import Y41.p;
import Y61.k;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.appcompat.app.A;
import androidx.appcompat.app.m;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.C22823h0;
import androidx.core.view.L0;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import androidx.view.Lifecycle;
import feedback.shared.sdk.api.network.entities.CampaignInfo;
import h31.e;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* renamed from: v31.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49159a implements V1 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final L3 f440428b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CampaignInfo f440429c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC13779y3 f440430d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final F1 f440431e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC13642j0 f440432f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC13581c2 f440433g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC13784z f440434h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC13753v4 f440435i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final e<A> f440436j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final A3 f440437k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final C13697p1 f440438l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f440439m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final InterfaceC22196w1 f440440n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final d f440441o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final C13709q4 f440442p;

    /* renamed from: v31.a$a, reason: collision with other inner class name */
    public static final class C12743a extends N implements p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f440444m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12743a(int i12) {
            super(2);
            this.f440444m = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f440444m | 1);
            C49159a.this.f(a12, iA2);
            return G0.f406611a;
        }
    }

    /* renamed from: v31.a$b */
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C49159a.this.f440436j.get().cancel();
            return G0.f406611a;
        }
    }

    @s0
    /* renamed from: v31.a$c */
    public static final class c extends N implements l<String, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            try {
                Activity activityD = C49159a.this.f440428b.d();
                if (activityD != null) {
                    activityD.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                }
            } catch (Exception unused) {
            }
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v31/a$d", "Landroidx/lifecycle/q;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v31.a$d */
    public static final class d implements InterfaceC23057q {
        public d() {
        }

        @Override // androidx.view.InterfaceC23057q
        public final void onDestroy(@k InterfaceC22983P interfaceC22983P) {
            interfaceC22983P.getLifecycle().c(this);
            C49159a c49159a = C49159a.this;
            m mVarA = c49159a.f440428b.a();
            if (mVarA == null || mVarA.isFinishing()) {
                return;
            }
            C13697p1 c13697p1 = c49159a.f440438l;
            for (Map.Entry entry : c13697p1.f5742a.entrySet()) {
                try {
                    c13697p1.f5743b.put(entry.getKey(), ((l) entry.getValue()).invoke(G0.f406611a));
                } catch (Exception unused) {
                }
            }
        }
    }

    @Inject
    public C49159a(@k L3 l32, @k CampaignInfo campaignInfo, @k InterfaceC13779y3 interfaceC13779y3, @k F1 f12, @k InterfaceC13642j0 interfaceC13642j0, @k InterfaceC13581c2 interfaceC13581c2, @k InterfaceC13784z interfaceC13784z, @k InterfaceC13753v4 interfaceC13753v4, @k e<A> eVar, @k A3 a32, @k C13697p1 c13697p1) {
        this.f440428b = l32;
        this.f440429c = campaignInfo;
        this.f440430d = interfaceC13779y3;
        this.f440431e = f12;
        this.f440432f = interfaceC13642j0;
        this.f440433g = interfaceC13581c2;
        this.f440434h = interfaceC13784z;
        this.f440435i = interfaceC13753v4;
        this.f440436j = eVar;
        this.f440437k = a32;
        this.f440438l = c13697p1;
        int i12 = J.f406821a;
        this.f440440n = U2.a(0);
        this.f440441o = new d();
        this.f440442p = new C13709q4(new b(), new c());
    }

    @Override // Fc1.V1
    @k
    public final InterfaceC13784z a() {
        return this.f440434h;
    }

    @Override // Fc1.V1
    @k
    public final InterfaceC13753v4 b() {
        return this.f440435i;
    }

    @Override // Fc1.V1
    public final void c(@k Y41.a<G0> aVar) {
        Lifecycle lifecycle;
        L3 l32 = this.f440428b;
        A a12 = this.f440436j.get();
        if (a12 != null) {
            try {
                Activity activityD = l32.d();
                if (activityD == null || !activityD.isFinishing()) {
                    Activity activityD2 = l32.d();
                    if (activityD2 == null || !activityD2.isDestroyed()) {
                        aVar.invoke();
                        return;
                    } else {
                        a12.dismiss();
                        return;
                    }
                }
                m mVarA = l32.a();
                if (mVarA != null && (lifecycle = mVarA.getLifecycle()) != null) {
                    lifecycle.c(this.f440441o);
                }
                aVar.invoke();
                this.f440433g.a();
            } catch (Exception unused) {
            }
        }
    }

    @Override // Fc1.V1
    @InterfaceC22132o
    @InterfaceC22181t
    public final void f(@Y61.l androidx.compose.runtime.A a12, int i12) {
        B bE2 = a12.E(2069895178);
        if ((i12 & 1) == 0 && bE2.c()) {
            bE2.f();
        } else {
            Q2.a(bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C12743a(i12);
    }

    @Override // Fc1.V1
    @k
    @InterfaceC22137p
    public final View h(@k C22096n c22096n) {
        ComposeView composeView = new ComposeView(this.f440428b.b(), null, 0, 6, null);
        composeView.setContent(new C22096n(-529357333, new K3(this, c22096n), true));
        return composeView;
    }

    @Override // Fc1.V1
    public final void a(int i12) {
        ((C22061e3) this.f440440n).L3(i12);
    }

    @Override // Fc1.V1
    public final void b(@k Y41.a<G0> aVar) {
        Lifecycle lifecycle;
        A a12 = this.f440436j.get();
        if (a12 != null) {
            m mVarA = this.f440428b.a();
            if (mVarA != null && (lifecycle = mVarA.getLifecycle()) != null) {
                lifecycle.a(this.f440441o);
            }
            I0.a(a12);
            Window window = a12.getWindow();
            if (window != null) {
                window.setWindowAnimations(-1);
                InterfaceC13779y3 interfaceC13779y3 = this.f440430d;
                if (interfaceC13779y3.p()) {
                    if (Build.VERSION.SDK_INT > 29) {
                        L0 l0R = C22823h0.r(window.getDecorView());
                        if (l0R != null) {
                            l0R.e(true);
                        }
                    } else {
                        window.getDecorView().setSystemUiVisibility(16);
                    }
                }
                boolean zP2 = interfaceC13779y3.p();
                if (Build.VERSION.SDK_INT >= 30) {
                    int i12 = zP2 ? 8 : 0;
                    WindowInsetsController insetsController = window.getInsetsController();
                    if (insetsController != null) {
                        insetsController.setSystemBarsAppearance(i12, 8);
                    }
                } else {
                    window.getDecorView().setSystemUiVisibility(zP2 ? window.getDecorView().getSystemUiVisibility() | 8192 : window.getDecorView().getSystemUiVisibility() & (-8193));
                }
            }
            a12.setCanceledOnTouchOutside(false);
            a12.setOnCancelListener(new D3(this, 21));
            aVar.invoke();
        }
    }

    @Override // Fc1.V1
    public final void a(@k l<? super Boolean, G0> lVar) {
        A a12 = this.f440436j.get();
        if (a12 != null) {
            try {
                if (!a12.isShowing() || this.f440439m) {
                    lVar.invoke(Boolean.valueOf(this.f440439m));
                    this.f440439m = false;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // Fc1.V1
    public final void a(@k Y41.a<G0> aVar) {
        aVar.invoke();
        this.f440439m = true;
    }
}
