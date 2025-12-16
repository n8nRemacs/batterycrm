package com.avito.android.iac_dialer.impl_module.notifications.new_impl;

import android.app.Notification;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.clickstream.C28395u;
import com.avito.android.iac_dialer.impl_module.notifications.new_impl.IacNotification;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import pK.InterfaceC46970a;

/* compiled from: IacNotificationManager.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/g;", "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/e;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification.m f166124a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC46970a f166125b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f166126c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f166127d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f166128e = new LinkedHashMap();

    @Inject
    public g(@Y61.k com.avito.android.notification.m mVar, @Y61.k InterfaceC46970a interfaceC46970a, @Y61.k a aVar) {
        this.f166124a = mVar;
        this.f166125b = interfaceC46970a;
        this.f166126c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.avito.android.iac_dialer.impl_module.notifications.new_impl.e
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r17, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.notifications.new_impl.g.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.iac_dialer.impl_module.notifications.new_impl.e
    public final void b(@Y61.k String str) {
        synchronized (this) {
            IacNotificationIdType iacNotificationIdType = (IacNotificationIdType) this.f166128e.remove(str);
            if (iacNotificationIdType != null) {
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacNotificationManager", "cancel: Remove notification (idType=" + iacNotificationIdType + "). CallId=" + C43066x.u0(3, str), null);
                this.f166124a.b().a(iacNotificationIdType.ordinal(), j.a(str));
            }
        }
    }

    @Override // com.avito.android.iac_dialer.impl_module.notifications.new_impl.e
    public final void c(@Y61.k IacNotification iacNotification) {
        Notification notificationB;
        IacNotificationIdType iacNotificationIdType;
        if (!this.f166127d.getAndSet(true)) {
            Thread.setDefaultUncaughtExceptionHandler(new C28395u(this, Thread.getDefaultUncaughtExceptionHandler(), 1));
        }
        boolean z12 = iacNotification instanceof IacNotification.Call;
        if (z12) {
            notificationB = this.f166126c.c((IacNotification.Call) iacNotification);
        } else {
            if (!(iacNotification instanceof IacNotification.CallInitializing)) {
                throw new NoWhenBranchMatchedException();
            }
            notificationB = this.f166126c.b((IacNotification.CallInitializing) iacNotification);
        }
        String callId = iacNotification.getCallId();
        if (z12) {
            IacNotification.Call call = (IacNotification.Call) iacNotification;
            IacNotification.Call.Type type = call.getType();
            if (L.f(type, IacNotification.Call.Type.Incoming.INSTANCE)) {
                iacNotificationIdType = call.getHighPriority() ? IacNotificationIdType.f166101d : IacNotificationIdType.f166100c;
            } else {
                if (!L.f(type, IacNotification.Call.Type.Ongoing.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                iacNotificationIdType = call.getHighPriority() ? IacNotificationIdType.f166103f : IacNotificationIdType.f166102e;
            }
        } else {
            if (!(iacNotification instanceof IacNotification.CallInitializing)) {
                throw new NoWhenBranchMatchedException();
            }
            iacNotificationIdType = IacNotificationIdType.f166099b;
        }
        synchronized (this) {
            try {
                IacNotificationIdType iacNotificationIdType2 = (IacNotificationIdType) this.f166128e.get(callId);
                if (iacNotificationIdType2 != null && iacNotificationIdType2 != iacNotificationIdType) {
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacNotificationManager", "notify: Remove previous notification (idType=" + iacNotificationIdType2 + "), and post new one (idType=" + iacNotificationIdType + "). CallId=" + C43066x.u0(3, callId), null);
                    this.f166124a.b().a(iacNotificationIdType2.ordinal(), j.a(callId));
                } else if (iacNotificationIdType2 == null) {
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacNotificationManager", "notify: Post notification for the first time (idType=" + iacNotificationIdType + "). CallId=" + C43066x.u0(3, callId), null);
                } else {
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacNotificationManager", "notify: Update notification (idType=" + iacNotificationIdType2 + "). CallId=" + C43066x.u0(3, callId), null);
                }
                this.f166128e.put(callId, iacNotificationIdType);
                this.f166124a.b().d(j.a(callId), iacNotificationIdType.ordinal(), notificationB);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
