package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.P;
import androidx.core.app.z;
import androidx.work.C23544h;
import androidx.work.C23638w;
import androidx.work.F;
import androidx.work.WorkerParameters;
import androidx.work.rxjava3.RxWorker;
import com.avito.android.R;
import com.avito.android.di.C29972i;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.ChunkedVideoUploadWorker;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.D;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V2;
import com.google.common.util.concurrent.C37568u0;
import com.google.common.util.concurrent.D0;
import dZ.C39684b;
import dZ.j;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChunkedVideoUploadWorker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/ChunkedVideoUploadWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"IncorrectJobScheduling"})
/* loaded from: classes15.dex */
public final class ChunkedVideoUploadWorker extends RxWorker {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f194897c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C39684b f194898d = new C39684b("version_for_chunked_video_upload_worker", P0.g(new Q(0, new j.a()), new Q(1, new j.b("accountId"))));

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public n f194899b;

    /* compiled from: ChunkedVideoUploadWorker.kt */
    @s0
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/ChunkedVideoUploadWorker$a;", "", "<init>", "()V", "", "KEY_CHANNEL_ID", "Ljava/lang/String;", "KEY_ERROR", "KEY_FILE_ID", "KEY_FILE_NAME", "KEY_FILE_PATH", "KEY_HASH", "KEY_LOCAL_MESSAGE_ID", "KEY_MIME_TYPE", "KEY_PART_NUMBER", "KEY_TOTAL_PART_NUMBER", "KEY_UPLOAD_SESSION_ID", "KEY_USER_ACCOUNT_ID", "KEY_USER_ID", "KEY_USER_IS_EMPLOYEE", "KEY_USER_TYPE", "", "NOTIFICATION_ID", "I", "TAG", "LdZ/a;", "Lru/avito/messenger/MessengerUserHashInfo;", "userInfoPersistHelper", "LdZ/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static String a(MessengerUserHashInfo messengerUserHashInfo, String str, String str2, long j12) {
            String strH = com.avito.android.messenger.util.i.h(messengerUserHashInfo.f430681c);
            StringBuilder sb2 = new StringBuilder();
            androidx.media3.exoplayer.analytics.m.p(sb2, messengerUserHashInfo.f430682d, "||", str, "||");
            sb2.append(str2);
            sb2.append("||");
            sb2.append(j12);
            sb2.append(strH);
            return sb2.toString();
        }

        public a() {
        }
    }

    /* compiled from: ChunkedVideoUploadWorker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/O;", "Landroidx/work/F$a;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC32094s0.b f194901c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f194902d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f194903e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f194904f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f194905g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f194906h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f194907i;

        public b(AbstractC32094s0.b bVar, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f194901c = bVar;
            this.f194902d = str;
            this.f194903e = str2;
            this.f194904f = str3;
            this.f194905g = str4;
            this.f194906h = str5;
            this.f194907i = str6;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ChunkedVideoUploadWorker chunkedVideoUploadWorker = ChunkedVideoUploadWorker.this;
            n nVar = chunkedVideoUploadWorker.f194899b;
            if (nVar == null) {
                nVar = null;
            }
            n nVar2 = nVar;
            String str = this.f194904f;
            String str2 = this.f194905g;
            AbstractC32094s0.b bVar = this.f194901c;
            return nVar2.a(bVar, this.f194902d, this.f194903e, str, str2, this.f194906h, this.f194907i).B(new F.a.c()).u(new k(bVar, chunkedVideoUploadWorker, 0));
        }
    }

    public ChunkedVideoUploadWorker(@Y61.k Context context, @Y61.k WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static Long d(C23544h c23544h, String str) {
        long jB2 = c23544h.b(str, -1L);
        if (jB2 != -1) {
            return Long.valueOf(jB2);
        }
        V2.f318762a.d("ChunkedVideoUploadWorker", "No " + str + " was passed!");
        return null;
    }

    public static String e(C23544h c23544h, String str) {
        String strC = c23544h.c(str);
        if (strC != null) {
            return strC;
        }
        V2.f318762a.d("ChunkedVideoUploadWorker", "No " + str + " was passed!");
        return null;
    }

    @Override // androidx.work.rxjava3.RxWorker
    @Y61.k
    public final I<F.a> b() {
        AbstractC32094s0.b bVarF = f(getInputData());
        String strE = e(getInputData(), "fileId");
        String strE2 = e(getInputData(), "uploadSessionId");
        String strE3 = e(getInputData(), "hash");
        String strE4 = e(getInputData(), "filePath");
        final String strE5 = e(getInputData(), "fileName");
        String strC = getInputData().c(MessageBody.File.MIME_TYPE);
        if (bVarF != null && strE != null && strE3 != null && strE4 != null && strE2 != null) {
            return new G(new Callable() { // from class: com.avito.android.messenger.conversation.mvi.video.chunked_upload.i
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str = strE5;
                    ChunkedVideoUploadWorker.a aVar = ChunkedVideoUploadWorker.f194897c;
                    new D.c(null);
                    ChunkedVideoUploadWorker chunkedVideoUploadWorker = this.f194939b;
                    chunkedVideoUploadWorker.f194899b = new D.b(new com.avito.android.messenger.conversation.mvi.file_upload.Q(), (m) C29972i.a(C29972i.b(chunkedVideoUploadWorker.getApplicationContext()), m.class), null).f194918k.get();
                    try {
                        chunkedVideoUploadWorker.setForegroundAsync(chunkedVideoUploadWorker.c(str)).get();
                    } catch (Throwable th2) {
                        V2.f318762a.j("ChunkedVideoUploadWorker", "setForegroundAsync() failed", th2);
                    }
                    return G0.f406611a;
                }
            }).n(new b(bVarF, strE, strE3, strE2, strE4, strC, strE5));
        }
        C23544h.a aVar = new C23544h.a();
        aVar.b(getInputData().f55510a);
        return I.q(new F.a.C1949a(aVar.a()));
    }

    public final C23638w c(String str) {
        String string;
        AbstractC32094s0.b bVarF = f(getInputData());
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(getApplicationContext(), R.style.Theme_DesignSystem_Legacy);
        z.n nVar = new z.n(dVar, getApplicationContext().getString(R.string.messenger_file_upload_notification_channel_id));
        nVar.g(16, true);
        nVar.f44585e = z.n.c(getApplicationContext().getString(R.string.messenger_incoming_video_upload_message_description));
        if (bVarF == null) {
            string = getApplicationContext().getString(R.string.messenger_notification_file_upload_title);
        } else {
            long j12 = bVarF.f191225e;
            if (j12 > 1) {
                long j13 = bVarF.f191224d;
                string = str == null ? getApplicationContext().getString(R.string.messenger_notification_chunked_video_upload_title, String.valueOf(j13), String.valueOf(j12)) : getApplicationContext().getString(R.string.messenger_notification_chunked_video_upload_with_file_name, str, String.valueOf(j13), String.valueOf(j12));
            } else {
                string = str == null ? getApplicationContext().getString(R.string.messenger_notification_file_upload_title) : getApplicationContext().getString(R.string.messenger_notification_file_upload_title_with_file_name, str);
            }
        }
        nVar.f44586f = z.n.c(string);
        nVar.f44601u = C35835l0.d(R.attr.blue, dVar);
        nVar.f44578B.icon = R.drawable.ic_notification;
        Notification notificationB = nVar.b();
        return Build.VERSION.SDK_INT >= 29 ? new C23638w(91, 1, notificationB) : new C23638w(91, 0, notificationB);
    }

    public final AbstractC32094s0.b f(C23544h c23544h) {
        MessengerUserHashInfo messengerUserHashInfo;
        MessengerUserHashInfo messengerUserHashInfo2 = (MessengerUserHashInfo) dZ.g.a(c23544h, f194898d);
        if (messengerUserHashInfo2 == null) {
            V2.f318762a.d("ChunkedVideoUploadWorker", "No userInfo was passed!");
            messengerUserHashInfo = null;
        } else {
            messengerUserHashInfo = messengerUserHashInfo2;
        }
        String strE = e(c23544h, "channelId");
        String strE2 = e(c23544h, "localMessageId");
        Long lD2 = d(getInputData(), "partNumber");
        Long lD3 = d(getInputData(), "totalPartNumber");
        if (messengerUserHashInfo == null || strE == null || strE2 == null || lD2 == null || lD3 == null) {
            return null;
        }
        return new AbstractC32094s0.b(strE2, messengerUserHashInfo, strE, lD2.longValue(), lD3.longValue());
    }

    @Override // androidx.work.rxjava3.RxWorker, androidx.work.F
    @Y61.k
    public final D0<C23638w> getForegroundInfoAsync() {
        return C37568u0.d(c(e(getInputData(), "fileName")));
    }
}
