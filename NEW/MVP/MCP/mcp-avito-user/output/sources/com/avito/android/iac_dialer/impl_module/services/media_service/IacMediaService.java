package com.avito.android.iac_dialer.impl_module.services.media_service;

import AK.b;
import Y61.k;
import Y61.l;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.di.C29972i;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.FgType;
import com.avito.android.iac_dialer.impl_module.services.media_service.di.c;
import com.avito.android.iac_dialer_watcher.public_module.logging.logger.b;
import j.X;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import zK.f;

/* compiled from: IacMediaService.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/services/media_service/IacMediaService;", "Landroid/app/Service;", "<init>", "()V", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacMediaService extends Service {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f166354g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final AtomicInteger f166355h = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public AK.a f166356b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public com.avito.android.iac_dialer.impl_module.notifications.new_impl.a f166357c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public f f166358d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public com.avito.android.app_foreground_provider.util_module.a f166359e;

    /* renamed from: f, reason: collision with root package name */
    public final int f166360f = f166355h.getAndIncrement();

    /* compiled from: IacMediaService.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/services/media_service/IacMediaService$a;", "", "<init>", "()V", "", "EXTRA_FG_TYPE", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicInteger;", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @X
    public final Q<Integer, FgType> a(FgType fgType, boolean z12) {
        FgType fgTypeCopy$default;
        boolean z13 = checkSelfPermission("android.permission.RECORD_AUDIO") == 0;
        boolean z14 = checkSelfPermission("android.permission.CAMERA") == 0;
        FgType fgType2 = new FgType(false, false);
        com.avito.android.app_foreground_provider.util_module.a aVar = this.f166359e;
        if (aVar == null) {
            aVar = null;
        }
        boolean zIsForeground = aVar.getStatus().isForeground();
        if (z12) {
            fgTypeCopy$default = fgType2.copy(z13, z14);
        } else {
            if (z13 && fgType.getMic() && zIsForeground) {
                fgType2 = FgType.copy$default(fgType2, true, false, 2, null);
            }
            fgTypeCopy$default = (z14 && fgType.getCamera() && zIsForeground) ? FgType.copy$default(fgType2, false, true, 1, null) : fgType2;
        }
        b bVar = b.f168184a;
        String strB = b();
        StringBuilder sb2 = new StringBuilder("calculateFgType: ");
        sb2.append("checkOnlyPermissions=" + z12 + ", ");
        sb2.append("micWhileInFgPermission=" + z13 + ", ");
        sb2.append("cameraWhileInFgPermission=" + z14 + ", ");
        if (!z12) {
            sb2.append("wantedFgType=" + fgType + ", ");
        }
        if (!z12) {
            sb2.append("isAppInFg=" + zIsForeground + " -> ");
        }
        sb2.append("fgType=" + fgTypeCopy$default + ", ");
        G0 g02 = G0.f406611a;
        bVar.a(strB, sb2.toString(), null);
        int i12 = fgTypeCopy$default.getMic() ? 132 : 4;
        if (fgTypeCopy$default.getCamera()) {
            i12 |= 64;
        }
        return new Q<>(Integer.valueOf(i12), fgTypeCopy$default);
    }

    public final String b() {
        return "IacMediaService_" + this.f166360f;
    }

    @X
    public final FgType c(FgType fgType, Notification notification) {
        try {
            Q<Integer, FgType> qA2 = a(fgType, true);
            int iIntValue = qA2.f406619b.intValue();
            FgType fgType2 = qA2.f406620c;
            startForeground(73286, notification, iIntValue);
            return fgType2;
        } catch (Throwable th2) {
            b bVar = b.f168184a;
            bVar.b(b(), "startForeground error", th2);
            bVar.a(b(), "Let's try to recalculate fgType using 'isAppForeground' and 'wantedFgType' parameters", null);
            Q<Integer, FgType> qA3 = a(fgType, false);
            int iIntValue2 = qA3.f406619b.intValue();
            FgType fgType3 = qA3.f406620c;
            startForeground(73286, notification, iIntValue2);
            return fgType3;
        }
    }

    @Override // android.app.Service
    @l
    public final IBinder onBind(@l Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        b.f168184a.a(b(), "onCreate", null);
        com.avito.android.iac_dialer.impl_module.services.media_service.di.a.a().a(this, (c) C29972i.a(C29972i.b(this), c.class)).a(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        b.f168184a.a(b(), "onDestroy", null);
        AK.a aVar = this.f166356b;
        (aVar != null ? aVar : null).a(new b.C0016b(this.f166360f), b());
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(@l Intent intent, int i12, int i13) {
        FgType fgType;
        super.onStartCommand(intent, i12, i13);
        if (intent != null) {
            fgType = (FgType) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("EXTRA_FG_TYPE", FgType.class) : intent.getParcelableExtra("EXTRA_FG_TYPE"));
        } else {
            fgType = null;
        }
        if (fgType == null) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b(b(), "onStartCommand: startId=" + i13 + ". wantedFgType is null!!. intent=" + intent, null);
            return 2;
        }
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(b(), "onStartCommand: startId=" + i13, null);
        com.avito.android.iac_dialer.impl_module.notifications.new_impl.a aVar = this.f166357c;
        if (aVar == null) {
            aVar = null;
        }
        Notification notificationA = aVar.a();
        try {
            int i14 = Build.VERSION.SDK_INT;
            int i15 = this.f166360f;
            if (i14 >= 30) {
                FgType fgTypeC = c(fgType, notificationA);
                AK.a aVar2 = this.f166356b;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.a(new b.c(fgTypeC, i15), b());
            } else {
                startForeground(73286, notificationA);
                AK.a aVar3 = this.f166356b;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                aVar3.a(new b.c(fgType, i15), b());
            }
        } catch (Throwable th2) {
            AK.a aVar4 = this.f166356b;
            (aVar4 != null ? aVar4 : null).a(new b.a(th2), b());
            stopSelf();
        }
        return 2;
    }

    @k
    public final String toString() {
        return b();
    }
}
