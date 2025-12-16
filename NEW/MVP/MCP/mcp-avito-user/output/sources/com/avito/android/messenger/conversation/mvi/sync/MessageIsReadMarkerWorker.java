package com.avito.android.messenger.conversation.mvi.sync;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import androidx.core.app.z;
import androidx.work.C23542f;
import androidx.work.C23544h;
import androidx.work.C23638w;
import androidx.work.ExistingWorkPolicy;
import androidx.work.F;
import androidx.work.J;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.rxjava3.RxWorker;
import com.avito.android.R;
import com.avito.android.di.C29972i;
import com.avito.android.messenger.conversation.mvi.sync.MessageIsReadMarkerWorker;
import com.avito.android.messenger.di.C32487o0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V2;
import com.avito.android.util.X2;
import com.google.common.util.concurrent.C37568u0;
import dZ.C39684b;
import dZ.j;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageIsReadMarkerWorker.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/MessageIsReadMarkerWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes15.dex */
public final class MessageIsReadMarkerWorker extends RxWorker {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f194619d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C39684b f194620e = new C39684b("version_for_message_is_read_marker_worker", kotlin.collections.P0.g(new kotlin.Q(0, new j.a()), new kotlin.Q(1, new j.b("userAccountId"))));

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.channels.mvi.sync.F0 f194621b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public com.avito.android.notification.m f194622c;

    /* compiled from: MessageIsReadMarkerWorker.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/MessageIsReadMarkerWorker$a;", "", "<init>", "()V", "", "DEFAULT_TIMESTAMP", "J", "", "KEY_CHANNEL_ID", "Ljava/lang/String;", "KEY_EXPEDITED", "KEY_MARK_ACTION", "KEY_TIMESTAMP", "KEY_USER_ACCOUNT_ID", "KEY_USER_ID", "KEY_USER_IS_EMPLOYEE", "KEY_USER_TYPE", "MARK_AS_READ", "MARK_AS_UNREAD", "", "NOTIFICATION_ID", "I", "TAG", "LdZ/a;", "Lru/avito/messenger/MessengerUserHashInfo;", "userInfoPersistHelper", "LdZ/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static kotlin.Q a(Context context, MessengerUserHashInfo messengerUserHashInfo, String str, long j12, String str2, boolean z12) {
            C23542f.a aVar = new C23542f.a();
            aVar.b(NetworkType.f55396c);
            C23542f c23542fA = aVar.a();
            String strF = androidx.camera.camera2.internal.G.f("MessageIsReadMarkerWorker-", str);
            C23544h.a aVar2 = new C23544h.a();
            dZ.g.b(aVar2, MessageIsReadMarkerWorker.f194620e, messengerUserHashInfo);
            LinkedHashMap linkedHashMap = aVar2.f55511a;
            linkedHashMap.put("channelId", str);
            aVar2.c("timestamp", j12);
            linkedHashMap.put("mark_action", str2);
            J.a aVarH = new J.a(MessageIsReadMarkerWorker.class).f(c23542fA).a(strF).h(aVar2.a());
            if (z12) {
                aVarH = aVarH;
                OutOfQuotaPolicy outOfQuotaPolicy = OutOfQuotaPolicy.f55404b;
                androidx.work.impl.model.H h12 = aVarH.f55483c;
                h12.f55811q = true;
                h12.f55812r = outOfQuotaPolicy;
            }
            androidx.work.J jB2 = aVarH.b();
            WorkManager.f55428a.getClass();
            androidx.work.impl.Y.f(context).a(strF, ExistingWorkPolicy.f55375b, jB2).a();
            kotlin.Q q12 = new kotlin.Q(strF, jB2.f55478a);
            X2.f318778a.i("MsgIsReadMarkerWorker", "enqueued " + q12, null);
            return q12;
        }

        public a() {
        }
    }

    /* compiled from: MessageIsReadMarkerWorker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/O;", "Landroidx/work/F$a;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f194623b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessageIsReadMarkerWorker f194624c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f194625d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f194626e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f194627f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f194628g;

        public b(String str, MessageIsReadMarkerWorker messageIsReadMarkerWorker, MessengerUserHashInfo messengerUserHashInfo, String str2, long j12, boolean z12) {
            this.f194623b = str;
            this.f194624c = messageIsReadMarkerWorker;
            this.f194625d = messengerUserHashInfo;
            this.f194626e = str2;
            this.f194627f = j12;
            this.f194628g = z12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            String str = this.f194623b;
            boolean zEquals = str.equals("mark_channel_read");
            String str2 = this.f194626e;
            MessengerUserHashInfo messengerUserHashInfo = this.f194625d;
            MessageIsReadMarkerWorker messageIsReadMarkerWorker = this.f194624c;
            if (zEquals) {
                com.avito.android.messenger.channels.mvi.sync.F0 f02 = messageIsReadMarkerWorker.f194621b;
                return (f02 != null ? f02 : null).e(this.f194627f, str2, messengerUserHashInfo).B(new F.a.c());
            }
            if (str.equals("mark_channel_unread")) {
                com.avito.android.messenger.channels.mvi.sync.F0 f03 = messageIsReadMarkerWorker.f194621b;
                return (f03 != null ? f03 : null).b(str2, messengerUserHashInfo).B(new F.a.c());
            }
            V2.f318762a.j("MsgIsReadMarkerWorker", "Marking action is invalid: markAction = ".concat(str), null);
            a aVar = MessageIsReadMarkerWorker.f194619d;
            messageIsReadMarkerWorker.getClass();
            return io.reactivex.rxjava3.core.I.q(new F.a.C1949a(MessageIsReadMarkerWorker.d(messengerUserHashInfo, str2, this.f194627f, str, this.f194628g)));
        }
    }

    public MessageIsReadMarkerWorker(@Y61.k Context context, @Y61.k WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static C23544h d(MessengerUserHashInfo messengerUserHashInfo, String str, long j12, String str2, boolean z12) {
        C23544h.a aVar = new C23544h.a();
        if (messengerUserHashInfo != null) {
            dZ.g.b(aVar, f194620e, messengerUserHashInfo);
        }
        LinkedHashMap linkedHashMap = aVar.f55511a;
        linkedHashMap.put("channelId", str);
        aVar.c("timestamp", j12);
        linkedHashMap.put("mark_action", str2);
        linkedHashMap.put("expedited", Boolean.valueOf(z12));
        return aVar.a();
    }

    @Override // androidx.work.rxjava3.RxWorker
    @Y61.k
    public final io.reactivex.rxjava3.core.I<F.a> b() {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) dZ.g.a(getInputData(), f194620e);
        String str = null;
        if (messengerUserHashInfo == null) {
            V2.f318762a.d("MsgIsReadMarkerWorker", "No userInfo was passed!");
            messengerUserHashInfo = null;
        }
        String strC = getInputData().c("channelId");
        if (strC == null) {
            V2.f318762a.d("MsgIsReadMarkerWorker", "No channelId was passed!");
            strC = null;
        }
        long jB2 = getInputData().b("timestamp", -1L);
        if (jB2 == -1) {
            V2.f318762a.d("MsgIsReadMarkerWorker", "No timestamp was passed!");
        }
        String strC2 = getInputData().c("mark_action");
        if (strC2 == null) {
            V2.f318762a.d("MsgIsReadMarkerWorker", "Not specified how channel should be marked.");
        } else {
            str = strC2;
        }
        final boolean zA2 = getInputData().a("expedited", false);
        return (messengerUserHashInfo == null || strC == null || jB2 == -1 || str == null) ? io.reactivex.rxjava3.core.I.q(new F.a.C1949a(d(null, strC, jB2, str, zA2))) : new io.reactivex.rxjava3.internal.operators.single.G(new Callable() { // from class: com.avito.android.messenger.conversation.mvi.sync.I
            @Override // java.util.concurrent.Callable
            public final Object call() {
                MessageIsReadMarkerWorker.a aVar = MessageIsReadMarkerWorker.f194619d;
                X2 x22 = X2.f318778a;
                StringBuilder sb2 = new StringBuilder("start ");
                MessageIsReadMarkerWorker messageIsReadMarkerWorker = this.f194595b;
                sb2.append(messageIsReadMarkerWorker.getId());
                x22.i("MsgIsReadMarkerWorker", sb2.toString(), null);
                C32487o0.a().a((com.avito.android.messenger.di.K0) C29972i.a(C29972i.b(messageIsReadMarkerWorker.getApplicationContext()), com.avito.android.messenger.di.K0.class)).a(messageIsReadMarkerWorker);
                if (zA2) {
                    try {
                        messageIsReadMarkerWorker.setForegroundAsync(messageIsReadMarkerWorker.c(true)).get();
                    } catch (Throwable th2) {
                        V2.f318762a.j("MsgIsReadMarkerWorker", "setForegroundAsync() failed", th2);
                    }
                }
                return kotlin.G0.f406611a;
            }
        }).n(new b(str, this, messengerUserHashInfo, strC, jB2, zA2)).u(new com.avito.android.iac_dialer_watcher.impl_module.logging.repository.d(6, messengerUserHashInfo, strC));
    }

    public final C23638w c(boolean z12) {
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(getApplicationContext(), R.style.Theme_DesignSystem_Legacy);
        String string = getApplicationContext().getString(R.string.messenger_sync_notification_channel_id);
        int i12 = Build.VERSION.SDK_INT;
        if (z12) {
            NotificationChannel notificationChannel = new NotificationChannel(string, getApplicationContext().getString(R.string.messenger_sync_notification_channel_name), 2);
            com.avito.android.notification.m mVar = this.f194622c;
            if (mVar == null) {
                mVar = null;
            }
            mVar.b().b(notificationChannel);
            V2.f318762a.c("MsgIsReadMarkerWorker", "Created notification channel", null);
        }
        z.n nVar = new z.n(dVar, string);
        nVar.g(16, true);
        nVar.f44585e = z.n.c(getApplicationContext().getString(R.string.messenger_sync_notification_title));
        nVar.f44586f = z.n.c(getApplicationContext().getString(R.string.messenger_sync_notification_content));
        nVar.f44601u = C35835l0.d(R.attr.blue, dVar);
        nVar.f44578B.icon = R.drawable.ic_notification;
        Notification notificationB = nVar.b();
        return i12 >= 29 ? new C23638w(99, 1, notificationB) : new C23638w(99, 0, notificationB);
    }

    @Override // androidx.work.rxjava3.RxWorker, androidx.work.F
    @Y61.k
    public final com.google.common.util.concurrent.D0<C23638w> getForegroundInfoAsync() {
        return C37568u0.d(c(false));
    }
}
