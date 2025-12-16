package com.avito.android.iac_dialer_root.impl_module.activity.argumet_ver_241206;

import Y61.k;
import Y61.l;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.InterfaceC23487e;
import androidx.view.y;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenFragment;
import com.avito.android.iac_dialer_root.impl_module.activity.di.c;
import com.avito.android.iac_dialer_root.public_module.on_back_pressed_callback.b;
import com.avito.android.ui.fragments.BaseFragment;
import fL.C40308b;
import jL.e;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: IacCallActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_root/impl_module/activity/argumet_ver_241206/IacCallActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "LjL/e$a;", "<init>", "()V", "a", "_avito_iac-dialer-root_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacCallActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a, e.a {

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final a f166874q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final AtomicInteger f166875r = new AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public C40308b f166876m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public e f166877n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public b f166878o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final String f166879p = "IacCallActivity_" + f166875r.getAndIncrement();

    /* compiled from: IacCallActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer_root/impl_module/activity/argumet_ver_241206/IacCallActivity$a;", "", "<init>", "()V", "", "EXTRA_ARGUMENT", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicInteger;", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "_avito_iac-dialer-root_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.iac_dialer_root_impl_call_activity_layout;
    }

    public final void a2(@l Parcelable parcelable, @k String str) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        bVar.a(this.f166879p, "handleArgument " + str + ": argument=" + parcelable, null);
        C40308b c40308b = this.f166876m;
        if (c40308b == null) {
            c40308b = null;
        }
        c40308b.getClass();
        bVar.a("IacCallActivityRouter", "handleArgument: argument=" + parcelable, null);
        OK.b bVar2 = c40308b.f395840c;
        if (parcelable == null) {
            c40308b.a(bVar2.b());
            return;
        }
        InterfaceC23487e interfaceC23487eG = c40308b.f395838a.getSupportFragmentManager().G(R.id.calls_root);
        OK.a aVar = interfaceC23487eG instanceof OK.a ? (OK.a) interfaceC23487eG : null;
        if (aVar != null && aVar.u(parcelable)) {
            aVar.y(parcelable, "from router.handleArgument (cause fragment is already in container)");
            return;
        }
        IacCallScreenFragment iacCallScreenFragmentA = bVar2.a(parcelable);
        if (iacCallScreenFragmentA != null) {
            c40308b.a(iacCallScreenFragmentA);
            return;
        }
        BaseFragment baseFragmentA = c40308b.f395839b.a(parcelable);
        if (baseFragmentA != null) {
            c40308b.a(baseFragmentA);
        } else {
            c40308b.a(bVar2.b());
        }
    }

    @Override // androidx.appcompat.app.m, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(@k Context context) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(this.f166879p, "attachBaseContext", null);
        getDelegate().E(2);
        super.attachBaseContext(context);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        C40308b c40308b = this.f166876m;
        if (c40308b == null) {
            c40308b = null;
        }
        InterfaceC23487e interfaceC23487eG = c40308b.f395838a.getSupportFragmentManager().G(R.id.calls_root);
        com.avito.android.iac_dialer_root.public_module.on_back_pressed_callback.a aVar = interfaceC23487eG instanceof com.avito.android.iac_dialer_root.public_module.on_back_pressed_callback.a ? (com.avito.android.iac_dialer_root.public_module.on_back_pressed_callback.a) interfaceC23487eG : null;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(this.f166879p, "onCreate savedInstanceState:" + bundle + ", intent extras:" + getIntent().getExtras(), null);
        setShowWhenLocked(true);
        setTurnScreenOn(true);
        ((KeyguardManager) getSystemService("keyguard")).requestDismissKeyguard(this, null);
        com.avito.android.iac_dialer_root.impl_module.activity.di.a.a().a(this, getApplicationContext().getResources(), (c) C29972i.a(C29972i.b(this), c.class)).a(this);
        y f21241d = getF21241d();
        b bVar = this.f166878o;
        f21241d.a(this, bVar != null ? bVar : null);
        if (bundle == null) {
            Intent intent = getIntent();
            a2(Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("iac_argument", Parcelable.class) : intent.getParcelableExtra("iac_argument"), "from activity.onCreate()");
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(this.f166879p, "onNewIntent intent extras:" + intent.getExtras(), null);
        a2(Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("iac_argument", Parcelable.class) : intent.getParcelableExtra("iac_argument"), "from activity.onNewIntent()");
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onPause() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(this.f166879p, "onPause", null);
        super.onPause();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onResume() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(this.f166879p, "onResume", null);
        super.onResume();
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        e eVar = this.f166877n;
        if (eVar == null) {
            eVar = null;
        }
        eVar.c(this);
        super.onStart();
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(this.f166879p, "onStop", null);
        e eVar = this.f166877n;
        (eVar != null ? eVar : null).a(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public final void recreate() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(this.f166879p, "recreate", null);
        super.recreate();
    }
}
