package com.avito.android.silent_update.permissions;

import Cd.C13243a;
import Fw0.InterfaceC13846a;
import Fw0.InterfaceC13847b;
import Y41.l;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.x;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.silent_update.permissions.PermissionsActivity;
import i.b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: PermissionsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/silent_update/permissions/PermissionsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PermissionsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final a f283678t = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.silent_update.permissions.h f283679m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f283681o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f283682p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f283683q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Intent> f283684r;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f283680n = new O0(m0.f406844a.b(com.avito.android.silent_update.permissions.g.class), new g(), new f(new i()), new h());

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final b f283685s = new b();

    /* compiled from: PermissionsActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/silent_update/permissions/PermissionsActivity$a;", "", "<init>", "()V", "", "ARG_SOURCE_SCREEN", "Ljava/lang/String;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PermissionsActivity.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/silent_update/permissions/PermissionsActivity$b", "Landroidx/activity/x;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            PermissionsActivity permissionsActivity = PermissionsActivity.this;
            permissionsActivity.setResult(0);
            permissionsActivity.finish();
        }
    }

    /* compiled from: PermissionsActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<InterfaceC13847b, G0> {
        public final void f(@Y61.k InterfaceC13847b interfaceC13847b) {
            PermissionsActivity permissionsActivity = (PermissionsActivity) this.receiver;
            a aVar = PermissionsActivity.f283678t;
            permissionsActivity.getClass();
            if (L.f(interfaceC13847b, InterfaceC13847b.c.f6036a)) {
                permissionsActivity.a2().accept(InterfaceC13846a.g.f6033a);
                permissionsActivity.f283683q.b("android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            }
            if (L.f(interfaceC13847b, InterfaceC13847b.C0309b.f6035a)) {
                permissionsActivity.a2().accept(InterfaceC13846a.e.f6031a);
                Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                intent.setData(Uri.parse("package:" + permissionsActivity.getPackageName()));
                permissionsActivity.f283684r.b(intent);
                return;
            }
            if (L.f(interfaceC13847b, InterfaceC13847b.a.f6034a)) {
                com.avito.android.util.architecture_components.l.a(permissionsActivity.getLifecycle(), Lifecycle.State.f46683f, new com.avito.android.silent_update.permissions.b(permissionsActivity));
            } else if (interfaceC13847b instanceof InterfaceC13847b.d) {
                permissionsActivity.setResult(-1, new Intent().putExtra("result_permissions", ((InterfaceC13847b.d) interfaceC13847b).f6037a));
                permissionsActivity.finish();
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC13847b interfaceC13847b) {
            f(interfaceC13847b);
            return G0.f406611a;
        }
    }

    /* compiled from: PermissionsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LFw0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LFw0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<Fw0.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f283687l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Fw0.c cVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: PermissionsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = PermissionsActivity.f283678t;
            PermissionsActivity.this.a2().accept(InterfaceC13846a.C0308a.f6027a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f283689l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f283689l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f283689l);
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
            return PermissionsActivity.this.getF42820b();
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
            return PermissionsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: PermissionsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/silent_update/permissions/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/silent_update/permissions/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.silent_update.permissions.g> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.silent_update.permissions.g invoke() {
            com.avito.android.silent_update.permissions.h hVar = PermissionsActivity.this.f283679m;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.silent_update.permissions.g) hVar.get();
        }
    }

    public PermissionsActivity() {
        final int i12 = 0;
        this.f283683q = registerForActivityResult(new b.l(), new androidx.view.result.a(this) { // from class: com.avito.android.silent_update.permissions.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PermissionsActivity f283698c;

            {
                this.f283698c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                PermissionsActivity permissionsActivity = this.f283698c;
                switch (i12) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        PermissionsActivity.a aVar = PermissionsActivity.f283678t;
                        permissionsActivity.a2().accept(new InterfaceC13846a.f(zBooleanValue));
                        break;
                    default:
                        PermissionsActivity.a aVar2 = PermissionsActivity.f283678t;
                        permissionsActivity.a2().accept(InterfaceC13846a.d.f6030a);
                        break;
                }
            }
        });
        final int i13 = 1;
        this.f283684r = registerForActivityResult(new b.m(), new androidx.view.result.a(this) { // from class: com.avito.android.silent_update.permissions.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PermissionsActivity f283698c;

            {
                this.f283698c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                PermissionsActivity permissionsActivity = this.f283698c;
                switch (i13) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        PermissionsActivity.a aVar = PermissionsActivity.f283678t;
                        permissionsActivity.a2().accept(new InterfaceC13846a.f(zBooleanValue));
                        break;
                    default:
                        PermissionsActivity.a aVar2 = PermissionsActivity.f283678t;
                        permissionsActivity.a2().accept(InterfaceC13846a.d.f6030a);
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.silent_update.permissions.di.a.a().a((k) C29972i.a(C29972i.b(getApplicationContext()), k.class), new C28478k(PermissionsActivityScreen.f283693d, s.a(this), null, 4, null), getIntent().getStringExtra("ARG_SOURCE_SCREEN")).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f283681o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.silent_update.permissions.g a2() {
        return (com.avito.android.silent_update.permissions.g) this.f283680n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f283681o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f283681o;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.c(this, screenPerformanceTracker2, a2(), new c(1, this, PermissionsActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsOneTimeEvent;)V", 0), d.f283687l);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f283681o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
        getF21241d().b(this.f283685s);
        com.avito.android.util.architecture_components.l.a(getLifecycle(), Lifecycle.State.f46683f, new e());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f283682p) {
            this.f283682p = false;
            a2().accept(InterfaceC13846a.b.f6028a);
        }
    }
}
