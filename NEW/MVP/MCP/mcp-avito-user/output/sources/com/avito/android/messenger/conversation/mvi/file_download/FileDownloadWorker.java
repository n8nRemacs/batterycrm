package com.avito.android.messenger.conversation.mvi.file_download;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.C22026a;
import androidx.core.app.z;
import androidx.work.C23544h;
import androidx.work.C23638w;
import androidx.work.F;
import androidx.work.WorkerParameters;
import androidx.work.rxjava3.RxWorker;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V2;
import com.google.common.util.concurrent.C37568u0;
import com.google.common.util.concurrent.D0;
import dZ.C39684b;
import dZ.j;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileDownloadWorker.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"IncorrectJobScheduling"})
/* loaded from: classes15.dex */
public final class FileDownloadWorker extends RxWorker {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f190805d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C39684b f190806e = new C39684b("version_for_file_download_worker", P0.g(new kotlin.Q(0, new j.a()), new kotlin.Q(1, new j.b("userAccountId"))));

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public w f190807b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f190808c;

    /* compiled from: FileDownloadWorker.kt */
    @s0
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadWorker$a;", "", "<init>", "()V", "", "DEFAULT_ENQ_TIMESTAMP", "J", "", "KEY_CHANNEL_ID", "Ljava/lang/String;", "KEY_CHUNK_INDEX", "KEY_ENQ_TIMESTAMP", "KEY_ERROR", "KEY_LOCAL_MESSAGE_ID", "KEY_USER_ACCOUNT_ID", "KEY_USER_ID", "KEY_USER_IS_EMPLOYEE", "KEY_USER_TYPE", "", "NOTIFICATION_ID", "I", "TAG", "LdZ/a;", "Lru/avito/messenger/MessengerUserHashInfo;", "userInfoPersisHelper", "LdZ/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FileDownloadWorker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/O;", "Landroidx/work/F$a;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f190810c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f190811d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f190812e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Integer f190813f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f190814g;

        public b(MessengerUserHashInfo messengerUserHashInfo, String str, String str2, Integer num, long j12) {
            this.f190810c = messengerUserHashInfo;
            this.f190811d = str;
            this.f190812e = str2;
            this.f190813f = num;
            this.f190814g = j12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            w wVar = FileDownloadWorker.this.f190807b;
            if (wVar == null) {
                wVar = null;
            }
            final MessengerUserHashInfo messengerUserHashInfo = this.f190810c;
            final String str = this.f190811d;
            final String str2 = this.f190812e;
            io.reactivex.rxjava3.internal.operators.completable.T tB2 = wVar.a(messengerUserHashInfo, str, str2, this.f190813f).B(new F.a.c());
            final FileDownloadWorker fileDownloadWorker = FileDownloadWorker.this;
            final long j12 = this.f190814g;
            return tB2.u(new l41.o() { // from class: com.avito.android.messenger.conversation.mvi.file_download.t
                @Override // l41.o
                public final Object apply(Object obj2) {
                    Throwable th2 = (Throwable) obj2;
                    V2 v22 = V2.f318762a;
                    StringBuilder sb2 = new StringBuilder("Download failed for message(");
                    MessengerUserHashInfo messengerUserHashInfo2 = messengerUserHashInfo;
                    sb2.append(com.avito.android.messenger.util.i.b(messengerUserHashInfo2, new kotlin.Q[0]));
                    sb2.append(", channelId=");
                    String str3 = str;
                    sb2.append(str3);
                    sb2.append(", localMessageId = ");
                    String str4 = str2;
                    v22.a("FileDownloadWorker", C22026a.c(sb2, str4, ')'), th2);
                    InterfaceC28373a interfaceC28373a = fileDownloadWorker.f190808c;
                    if (interfaceC28373a == null) {
                        interfaceC28373a = null;
                    }
                    interfaceC28373a.c(new NonFatalErrorEvent("FileDownloadWorker Failed", th2, null, new NonFatalErrorEvent.a.b(FileDownloadWorker.class, "File download flow failed", 0, 4, null), 4, null));
                    String string = th2.toString();
                    int length = string.length() - 1;
                    if (length > 2048) {
                        length = 2048;
                    }
                    String strSubstring = string.substring(0, length);
                    C23544h.a aVar = new C23544h.a();
                    dZ.g.b(aVar, FileDownloadWorker.f190806e, messengerUserHashInfo2);
                    LinkedHashMap linkedHashMap = aVar.f55511a;
                    linkedHashMap.put("channelId", str3);
                    linkedHashMap.put("localMessageId", str4);
                    aVar.c("enqTimestamp", j12);
                    linkedHashMap.put("error", strSubstring);
                    return new F.a.C1949a(aVar.a());
                }
            });
        }
    }

    public FileDownloadWorker(@Y61.k Context context, @Y61.k WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.rxjava3.RxWorker
    @Y61.k
    public final io.reactivex.rxjava3.core.I<F.a> b() {
        MessengerUserHashInfo messengerUserHashInfo;
        String str;
        String str2;
        C23544h inputData = getInputData();
        C39684b c39684b = f190806e;
        MessengerUserHashInfo messengerUserHashInfo2 = (MessengerUserHashInfo) dZ.g.a(inputData, c39684b);
        if (messengerUserHashInfo2 == null) {
            V2.f318762a.d("FileDownloadWorker", "No userInfo was passed!");
            messengerUserHashInfo = null;
        } else {
            messengerUserHashInfo = messengerUserHashInfo2;
        }
        String strC = getInputData().c("channelId");
        if (strC == null) {
            V2.f318762a.d("FileDownloadWorker", "No channelId was passed!");
            str = null;
        } else {
            str = strC;
        }
        String strC2 = getInputData().c("localMessageId");
        if (strC2 == null) {
            V2.f318762a.d("FileDownloadWorker", "No localMessageId was passed!");
            str2 = null;
        } else {
            str2 = strC2;
        }
        long jB2 = getInputData().b("enqTimestamp", 0L);
        String strC3 = getInputData().c("chunkIndex");
        Integer numY0 = strC3 != null ? C43066x.y0(strC3) : null;
        if (messengerUserHashInfo != null && str != null && str2 != null) {
            return new io.reactivex.rxjava3.internal.operators.single.G(new CallableC32050n(this, 0)).n(new b(messengerUserHashInfo, str, str2, numY0, jB2));
        }
        C23544h.a aVar = new C23544h.a();
        if (messengerUserHashInfo != null) {
            dZ.g.b(aVar, c39684b, messengerUserHashInfo);
        }
        LinkedHashMap linkedHashMap = aVar.f55511a;
        linkedHashMap.put("channelId", str);
        linkedHashMap.put("localMessageId", str2);
        aVar.c("enqTimestamp", jB2);
        if (numY0 != null) {
            linkedHashMap.put("chunkIndex", numY0.toString());
        }
        return io.reactivex.rxjava3.core.I.q(new F.a.C1949a(aVar.a()));
    }

    @Override // androidx.work.rxjava3.RxWorker, androidx.work.F
    @Y61.k
    public final D0<C23638w> getForegroundInfoAsync() {
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(getApplicationContext(), R.style.Theme_DesignSystem_Legacy);
        z.n nVar = new z.n(dVar, getApplicationContext().getString(R.string.messenger_file_download_notification_channel_id));
        nVar.g(16, true);
        nVar.f44585e = z.n.c(getApplicationContext().getString(R.string.messenger_notification_file_dowload_title));
        nVar.f44586f = z.n.c(getApplicationContext().getString(R.string.messenger_notification_file_dowload_content));
        nVar.f44601u = C35835l0.d(R.attr.blue, dVar);
        nVar.f44578B.icon = R.drawable.ic_notification;
        Notification notificationB = nVar.b();
        return C37568u0.d(Build.VERSION.SDK_INT >= 29 ? new C23638w(60, 1, notificationB) : new C23638w(60, 0, notificationB));
    }
}
