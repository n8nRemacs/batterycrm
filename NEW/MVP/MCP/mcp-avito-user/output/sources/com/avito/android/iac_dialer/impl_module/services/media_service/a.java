package com.avito.android.iac_dialer.impl_module.services.media_service;

import AK.b;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.foundation.text.selection.C21030p;
import androidx.compose.runtime.internal.P;
import androidx.core.content.d;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.FgType;
import com.avito.android.iac_dialer.impl_module.notifications.channels.IacNotificationChannelManager;
import com.avito.android.iac_dialer_watcher.public_module.logging.logger.b;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import n11.RunnableC44167a;
import zK.InterfaceC50478a;
import zK.f;

/* compiled from: IacMediaServiceLauncher.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/services/media_service/a;", "LzK/a;", "LzK/f;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@ContributesBinding.b
/* loaded from: classes14.dex */
public final class a implements InterfaceC50478a, f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f166361a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final IacNotificationChannelManager f166362b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AK.a f166363c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AtomicBoolean f166364d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AtomicLong f166365e = new AtomicLong(0);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AtomicReference<FgType> f166366f = new AtomicReference<>(null);

    @Inject
    public a(@k Context context, @k IacNotificationChannelManager iacNotificationChannelManager, @k AK.a aVar) {
        this.f166361a = context;
        this.f166362b = iacNotificationChannelManager;
        this.f166363c = aVar;
    }

    @Override // zK.InterfaceC50478a
    public final void a(@k FgType fgType) {
        Context context = this.f166361a;
        try {
            this.f166364d.set(false);
            FgType fgType2 = this.f166366f.get();
            if (fgType2 != null && ((!fgType.getMic() || fgType2.getMic()) && (!fgType.getCamera() || fgType2.getCamera()))) {
                b.f168184a.a("IacMediaServiceLauncher", "launchService: ignore 'launchService' invocation. currentFgType=" + fgType2 + ", wantedFgType=" + fgType, null);
                return;
            }
            this.f166365e.set(System.currentTimeMillis() + 3000);
            b.f168184a.a("IacMediaServiceLauncher", "startService:", null);
            IacMediaService.f166354g.getClass();
            Intent intent = new Intent(context, (Class<?>) IacMediaService.class);
            intent.putExtra("EXTRA_FG_TYPE", fgType);
            d.startForegroundService(context, intent);
        } catch (Throwable th2) {
            this.f166363c.a(new b.a(th2), "IacMediaServiceLauncher");
        }
    }

    @Override // zK.InterfaceC50478a
    public final void b() throws Resources.NotFoundException {
        this.f166364d.set(true);
        long jCurrentTimeMillis = this.f166365e.get() - System.currentTimeMillis();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        StringBuilder sb2 = new StringBuilder("schedule stopService ");
        sb2.append(jCurrentTimeMillis > 0 ? C21030p.a(jCurrentTimeMillis, "with delay=") : "without delay");
        bVar.a("IacMediaServiceLauncher", sb2.toString(), null);
        RunnableC44167a runnableC44167a = new RunnableC44167a(this, 11);
        if (jCurrentTimeMillis > 0) {
            new Handler(Looper.getMainLooper()).postDelayed(runnableC44167a, jCurrentTimeMillis);
        } else {
            runnableC44167a.run();
        }
    }
}
