package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.notification;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewarePayload;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.notifications.new_impl.IacNotification;
import com.avito.android.iac_dialer_models.abstract_module.IacCallTime;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationMiddleware.kt */
@P
@s0
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/notification/NotificationMiddleware;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareDistinctBy;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/notification/NotificationMiddleware$Payload;", "<init>", "()V", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallTime;", "callTime", "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Time;", "getNotificationTime", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacCallTime;)Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/IacNotification$Call$Time;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", VoiceInfo.STATE, "getPayloadFromState", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/notification/NotificationMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "oldPayload", "newPayload", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/notification/NotificationMiddleware$Payload;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/notification/NotificationMiddleware$Payload;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Payload", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final /* data */ class NotificationMiddleware implements IacMiddlewareDistinctBy<Payload> {
    public static final int $stable = 0;

    @k
    public static final NotificationMiddleware INSTANCE = new NotificationMiddleware();

    /* compiled from: NotificationMiddleware.kt */
    @P
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/notification/NotificationMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;", "notifications", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Notification;", "(Ljava/util/Set;)V", "getNotifications", "()Ljava/util/Set;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload implements IacMiddlewarePayload {
        public static final int $stable = 8;

        @k
        private final Set<IacEvent.Notification> notifications;

        /* JADX WARN: Multi-variable type inference failed */
        public Payload(@k Set<? extends IacEvent.Notification> set) {
            this.notifications = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Payload copy$default(Payload payload, Set set, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                set = payload.notifications;
            }
            return payload.copy(set);
        }

        @k
        public final Set<IacEvent.Notification> component1() {
            return this.notifications;
        }

        @k
        public final Payload copy(@k Set<? extends IacEvent.Notification> notifications) {
            return new Payload(notifications);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Payload) && L.f(this.notifications, ((Payload) other).notifications);
        }

        @k
        public final Set<IacEvent.Notification> getNotifications() {
            return this.notifications;
        }

        public int hashCode() {
            return this.notifications.hashCode();
        }

        @k
        public String toString() {
            return c.u(new StringBuilder("Payload(notifications="), this.notifications, ')');
        }
    }

    private NotificationMiddleware() {
    }

    private final IacNotification.Call.Time getNotificationTime(IacCallTime callTime) {
        return new IacNotification.Call.Time(callTime.f166849f, callTime.f166847d, callTime.f166850g);
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof NotificationMiddleware);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return -1367645362;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing) {
        IacMiddlewareDistinctBy.a.a(this, iacMiddlewareProcessing);
    }

    @k
    public String toString() {
        return "NotificationMiddleware";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent$Notification$Display] */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent$Notification$Display] */
    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.notification.NotificationMiddleware.Payload getPayloadFromState(@Y61.k com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState r19) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.notification.NotificationMiddleware.getPayloadFromState(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState):com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.notification.NotificationMiddleware$Payload");
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing, @k Payload payload, @k Payload payload2) {
        Set setF = b1.f(payload2.getNotifications(), payload.getNotifications());
        Iterator it = setF.iterator();
        while (it.hasNext()) {
            iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), (IacEvent.Notification) it.next());
        }
        Set<IacEvent.Notification> notifications = payload.getNotifications();
        ArrayList arrayList = new ArrayList(C42745f0.q(notifications, 10));
        Iterator<T> it2 = notifications.iterator();
        while (it2.hasNext()) {
            arrayList.add(((IacEvent.Notification) it2.next()).getCallId());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : setF) {
            if (!arrayList.contains(((IacEvent.Notification) obj).getCallId())) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((IacEvent.Notification) obj2) instanceof IacEvent.Notification.Display) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((IacEvent.Notification) it3.next()).getCallId());
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), new IacEvent.Notification.EnsureNotificationWasDisplayed((String) it4.next()));
        }
    }
}
