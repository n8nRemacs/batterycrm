package com.avito.android.oauth.presentation;

import Cd.C13243a;
import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.compose.j;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.OAuthScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import e40.InterfaceC39944a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import l40.b;
import z1.AbstractC50339a;

/* compiled from: OAuthActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/oauth/presentation/OAuthActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Ll40/c;", VoiceInfo.STATE, "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OAuthActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f208223r = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.oauth.presentation.d f208224m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f208226o;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f208225n = new O0(m0.f406844a.b(com.avito.android.oauth.presentation.c.class), new g(), new f(new i()), new h());

    /* renamed from: p, reason: collision with root package name */
    @k
    public final InterfaceC42726C f208227p = C42727D.c(new b());

    /* renamed from: q, reason: collision with root package name */
    @k
    public final C28478k f208228q = new C28478k(OAuthScreen.f90435d, s.a(this), null, 4, null);

    /* compiled from: OAuthActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/oauth/presentation/OAuthActivity$a;", "", "<init>", "()V", "", "OAUTH_DETAILS_KEY", "Ljava/lang/String;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OAuthActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/oauth/presentation/OAuthDetails;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<OAuthDetails> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final OAuthDetails invoke() {
            Intent intent = OAuthActivity.this.getIntent();
            Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("OAUTH_DETAILS_KEY", OAuthDetails.class) : intent.getParcelableExtra("OAUTH_DETAILS_KEY");
            if (parcelableExtra != null) {
                return (OAuthDetails) parcelableExtra;
            }
            throw new IllegalArgumentException("OAuth Details should be passed");
        }
    }

    /* compiled from: OAuthActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<A, Integer, G0> {
        public c() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                a aVar = OAuthActivity.f208223r;
                OAuthActivity oAuthActivity = OAuthActivity.this;
                com.avito.android.oauth.presentation.ui.s.a((l40.c) C22126m3.b(((com.avito.android.oauth.presentation.c) oAuthActivity.f208225n.getValue()).getState(), a13).getF42167b(), new com.avito.android.oauth.presentation.a(oAuthActivity), a13, 0);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OAuthActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<l40.b, G0> {
        @Override // Y41.l
        public final G0 invoke(l40.b bVar) {
            l40.b bVar2 = bVar;
            OAuthActivity oAuthActivity = (OAuthActivity) this.receiver;
            a aVar = OAuthActivity.f208223r;
            oAuthActivity.getClass();
            if (L.f(bVar2, b.c.f413471a)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(((OAuthDetails) oAuthActivity.f208227p.getValue()).f208240f);
                oAuthActivity.startActivity(intent);
            } else if (L.f(bVar2, b.a.f413469a)) {
                oAuthActivity.finish();
            } else if (bVar2 instanceof b.C11771b) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setFlags(536870912);
                intent2.setData(Uri.parse(((b.C11771b) bVar2).f413470a));
                try {
                    oAuthActivity.startActivity(intent2);
                    oAuthActivity.finish();
                } catch (Exception unused) {
                    Toast.makeText(oAuthActivity, R.string.oauth_unknown_error_title, 1).show();
                }
            } else if (bVar2 instanceof b.d) {
                try {
                    oAuthActivity.startActivity(((b.d) bVar2).f413472a);
                } catch (Exception unused2) {
                    Toast.makeText(oAuthActivity, R.string.oauth_unknown_error_title, 1).show();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OAuthActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll40/c;", "it", "Lkotlin/G0;", "invoke", "(Ll40/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<l40.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f208231l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(l40.c cVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f208232l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f208232l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f208232l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return OAuthActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return OAuthActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: OAuthActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/oauth/presentation/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/oauth/presentation/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.oauth.presentation.c> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.oauth.presentation.c invoke() {
            com.avito.android.oauth.presentation.d dVar = OAuthActivity.this.f208224m;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.oauth.presentation.c) dVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        ((InterfaceC39944a.InterfaceC11052a) C29972i.a(C29972i.b(this), InterfaceC39944a.InterfaceC11052a.class)).i8().a(this.f208228q, (OAuthDetails) this.f208227p.getValue(), cv.c.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f208226o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f208226o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        j.a(this, new C22096n(-572672522, new c(), true));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f208226o;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, (com.avito.android.oauth.presentation.c) this.f208225n.getValue(), new d(1, this, OAuthActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/oauth/presentation/mvi/entity/OAuthOneTimeEvent;)V", 0), e.f208231l);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f208226o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}
