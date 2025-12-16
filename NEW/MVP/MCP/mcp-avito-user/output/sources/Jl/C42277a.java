package jL;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.avito.android.iac_dialer_root.impl_module.activity.argumet_ver_241206.IacCallActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import com.vk.id.captcha.web.h;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import mL.InterfaceC43977a;

/* compiled from: IacCallActivityLauncherImpl.kt */
@Singleton
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"LjL/a;", "LmL/a;", "LjL/e;", "a", "_avito_iac-dialer-root_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ContributesBinding.b
/* renamed from: jL.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C42277a implements InterfaceC43977a, e {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f405551c = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f405552a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public IacCallActivity f405553b;

    /* compiled from: IacCallActivityLauncherImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LjL/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer-root_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jL.a$a, reason: collision with other inner class name */
    public static final class C11558a {
        public /* synthetic */ C11558a(C42822w c42822w) {
            this();
        }

        public C11558a() {
        }
    }

    static {
        new C11558a(null);
    }

    @Inject
    public C42277a(@k Context context) {
        this.f405552a = context;
    }

    @Override // jL.e
    public final void a(@k IacCallActivity iacCallActivity) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacCallActivityLauncher", "onActivityStopped(), " + iacCallActivity.f166879p, null);
        if (L.f(this.f405553b, iacCallActivity)) {
            this.f405553b = null;
        }
    }

    @Override // mL.InterfaceC43977a
    public final void b(@k Parcelable parcelable) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacCallActivityLauncher", "launch() argument=" + parcelable, null);
        if (L.f(Looper.myLooper(), Looper.getMainLooper())) {
            d(parcelable);
        } else {
            new Handler(Looper.getMainLooper()).post(new h(21, this, parcelable));
        }
    }

    @Override // jL.e
    public final void c(@k IacCallActivity iacCallActivity) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacCallActivityLauncher", "onActivityStarted(), " + iacCallActivity.f166879p, null);
        this.f405553b = iacCallActivity;
    }

    public final void d(Parcelable parcelable) {
        G0 g02;
        IacCallActivity iacCallActivity = this.f405553b;
        if (iacCallActivity != null) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacCallActivityLauncher", "launchInMainThread() " + iacCallActivity.f166879p + " is already started. Invoke handleArgument(), argument=" + parcelable, null);
            iacCallActivity.a2(parcelable, "from IacCallActivityLauncher (cause activity in already started)");
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacCallActivityLauncher", "launchInMainThread() Activity is NOT started. Start it by intent, argument=" + parcelable, null);
            IacCallActivity.f166874q.getClass();
            Context context = this.f405552a;
            context.startActivity(new Intent(context, (Class<?>) IacCallActivity.class).putExtra("iac_argument", parcelable).addFlags(268435456).addFlags(32768));
        }
    }
}
