package com.avito.android.iac_dialer.impl_module.overlay.widjet;

import Y61.k;
import android.app.Activity;
import androidx.appcompat.app.m;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import com.avito.android.util.AbstractC35776d5;
import com.avito.android.util.L0;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import lL.InterfaceC43652a;
import pK.InterfaceC46970a;

/* compiled from: IacDialerOverlayLifecycleCallbacks.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/widjet/a;", "Lcom/avito/android/util/d5;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC35776d5 {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.a> f166150c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC46970a> f166151d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC43652a> f166152e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final L0 f166153f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final HashMap<Integer, com.avito.android.iac_dialer.impl_module.overlay.widjet.ui.a> f166154g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer.impl_module.overlay.widjet.ui.f f166155h;

    /* compiled from: IacDialerOverlayLifecycleCallbacks.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/widjet/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.overlay.widjet.a$a, reason: collision with other inner class name */
    public static final class C4924a {
        public /* synthetic */ C4924a(C42822w c42822w) {
            this();
        }

        public C4924a() {
        }
    }

    static {
        new C4924a(null);
    }

    public a(@k h31.e<com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.a> eVar, @k h31.e<InterfaceC46970a> eVar2, @k h31.e<InterfaceC43652a> eVar3, @k L0 l02) {
        this.f166150c = eVar;
        this.f166151d = eVar2;
        this.f166152e = eVar3;
        this.f166153f = l02;
        int i12 = (-l02.d()) / 3;
        com.avito.android.iac_dialer.impl_module.overlay.widjet.ui.f fVar = new com.avito.android.iac_dialer.impl_module.overlay.widjet.ui.f();
        fVar.f166188a = 0;
        fVar.f166189b = i12;
        this.f166155h = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.util.AbstractC35776d5
    public final void c(@k Activity activity) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.getClass();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.c().a("IacDialerOverlayLifecycleCallbacks", "onActivityCreated: " + c.a(activity), null);
        if (activity instanceof m) {
            C43259k.d(C22981N.a(((InterfaceC22983P) activity).getLifecycle()), null, null, new b(activity, this, null), 3);
            return;
        }
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.c().a("IacDialerOverlayLifecycleCallbacks", c.a(activity) + " does not implement AppCompatActivity", null);
    }

    @Override // com.avito.android.util.AbstractC35776d5
    public final void d(@k Activity activity) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.getClass();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.c().a("IacDialerOverlayLifecycleCallbacks", "onActivityDestroyed: " + c.a(activity), null);
        i(activity);
    }

    @Override // com.avito.android.util.AbstractC35776d5
    public final void e(@k Activity activity) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.getClass();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.c().a("IacDialerOverlayLifecycleCallbacks", "onActivityPaused: " + c.a(activity), null);
        i(activity);
    }

    @Override // com.avito.android.util.AbstractC35776d5
    public final void f(@k Activity activity) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.getClass();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.c().a("IacDialerOverlayLifecycleCallbacks", "onActivityResumed: " + c.a(activity), null);
    }

    @Override // com.avito.android.util.AbstractC35776d5
    public final void g(@k Fragment fragment) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.getClass();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.c().a("IacDialerOverlayLifecycleCallbacks", "onFragmentPaused: " + c.a(fragment), null);
    }

    @Override // com.avito.android.util.AbstractC35776d5
    public final void h(@k Fragment fragment) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.getClass();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.c().a("IacDialerOverlayLifecycleCallbacks", "onFragmentResumed: " + c.a(fragment), null);
    }

    public final void i(Activity activity) {
        com.avito.android.iac_dialer.impl_module.overlay.widjet.ui.a aVarRemove = this.f166154g.remove(Integer.valueOf(activity.hashCode()));
        if (aVarRemove != null) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacDialerOverlayLifecycleCallbacks", c.a(activity) + ": removeOverlayViewFromActivity()", null);
            activity.getWindowManager().removeView(aVarRemove.f166171g);
        }
    }
}
