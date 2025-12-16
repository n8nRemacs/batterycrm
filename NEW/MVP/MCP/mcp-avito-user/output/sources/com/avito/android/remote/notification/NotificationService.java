package com.avito.android.remote.notification;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.z;
import com.avito.android.R;
import com.avito.android.di.C29972i;
import com.avito.android.di.C29974k;
import com.avito.android.di.InterfaceC30269v;
import com.avito.android.di.InterfaceC30270w;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.service.d;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationService.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/notification/NotificationService;", "Landroid/app/Service;", "Lcom/avito/android/service/d$a;", "<init>", "()V", "a", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotificationService extends Service implements d.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f253966b = new a();

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public InterfaceC34350q f253967c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public com.avito.android.service.d f253968d;

    /* compiled from: NotificationService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/NotificationService$a;", "Landroid/os/Binder;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends Binder {
        public a() {
            throw null;
        }
    }

    @Override // com.avito.android.service.d.a
    public final void a(int i12) {
        stopSelfResult(i12);
    }

    @Override // android.app.Service
    @Y61.l
    public final IBinder onBind(@Y61.k Intent intent) {
        V2.f318762a.i("NotificationService", "onBind", null);
        return this.f253966b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        V2.f318762a.c("NotificationService", "onCreate", null);
        InterfaceC30269v.a aVarA = C29974k.a();
        aVarA.c((InterfaceC30270w) C29972i.a(C29972i.b(this), InterfaceC30270w.class));
        aVarA.a();
        aVarA.b(this);
        aVarA.build().a(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        V2.f318762a.c("NotificationService", "onDestroy", null);
        super.onDestroy();
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.app.Service
    public final int onStartCommand(@Y61.l Intent intent, int i12, int i13) {
        String action;
        PushParameters pushParameters;
        super.onStartCommand(intent, i12, i13);
        if (Build.VERSION.SDK_INT >= 34) {
            z.n nVar = new z.n(this, getResources().getString(R.string.notification_channel_id_service));
            nVar.f44591k = -1;
            startForeground(1, nVar.b(), 1073741824);
        } else {
            z.n nVar2 = new z.n(this, getResources().getString(R.string.notification_channel_id_service));
            nVar2.f44591k = -1;
            startForeground(1, nVar2.b());
        }
        com.avito.android.service.d dVar = this.f253968d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.b(i13);
        if (intent != null) {
            try {
                if (intent.getAction() != null && (action = intent.getAction()) != null && action.hashCode() == 624410341 && action.equals("com.avito.android.PUSH_NOTIFICATION") && (pushParameters = (PushParameters) intent.getParcelableExtra(NotificationsSettings.Section.SECTION_PAID_SERVICES)) != null) {
                    InterfaceC34350q interfaceC34350q = this.f253967c;
                    if (interfaceC34350q == null) {
                        interfaceC34350q = null;
                    }
                    interfaceC34350q.c(pushParameters);
                }
            } catch (Throwable th2) {
                com.avito.android.service.d dVar2 = this.f253968d;
                (dVar2 != null ? dVar2 : null).a();
                throw th2;
            }
        }
        com.avito.android.service.d dVar3 = this.f253968d;
        (dVar3 != null ? dVar3 : null).a();
        return 2;
    }

    public final void onTimeout(int i12, int i13) {
        stopSelf();
    }

    @Override // android.app.Service
    public final boolean onUnbind(@Y61.k Intent intent) {
        V2.f318762a.i("NotificationService", "onUnbind", null);
        return super.onUnbind(intent);
    }

    @Override // com.avito.android.service.d.a
    public final void onStart() {
    }
}
