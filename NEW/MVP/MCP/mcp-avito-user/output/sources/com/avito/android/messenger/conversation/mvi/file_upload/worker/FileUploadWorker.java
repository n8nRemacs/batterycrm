package com.avito.android.messenger.conversation.mvi.file_upload.worker;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.C22026a;
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
import com.avito.android.messenger.conversation.mvi.file_upload.worker.FileUploadWorker;
import com.avito.android.messenger.conversation.mvi.file_upload.worker.a;
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

/* compiled from: FileUploadWorker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/worker/FileUploadWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"IncorrectJobScheduling"})
/* loaded from: classes15.dex */
public final class FileUploadWorker extends RxWorker {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f191253c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C39684b f191254d = new C39684b("version_for_file_upload_worker", P0.g(new Q(0, new j.a()), new Q(1, new j.b("userAccountId"))));

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public k f191255b;

    /* compiled from: FileUploadWorker.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/worker/FileUploadWorker$a;", "", "<init>", "()V", "", "KEY_CHANNEL_ID", "Ljava/lang/String;", "KEY_DELETE_FILE", "KEY_ERROR", "KEY_FILE_ID", "KEY_FILE_NAME", "KEY_FILE_PATH", "KEY_LOCAL_MESSAGE_ID", "KEY_MIME_TYPE", "KEY_USER_ACCOUNT_ID", "KEY_USER_ID", "KEY_USER_IS_EMPLOYEE", "KEY_USER_TYPE", "", "NOTIFICATION_ID", "I", "TAG", "LdZ/a;", "Lru/avito/messenger/MessengerUserHashInfo;", "userInfoPersistHelper", "LdZ/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static String a(String str, String str2, MessengerUserHashInfo messengerUserHashInfo) {
            String strH = com.avito.android.messenger.util.i.h(messengerUserHashInfo.f430681c);
            StringBuilder sb2 = new StringBuilder();
            androidx.media3.exoplayer.analytics.m.p(sb2, messengerUserHashInfo.f430682d, "||", str, "||");
            return AK.c.s(sb2, str2, strH);
        }

        public a() {
        }
    }

    /* compiled from: FileUploadWorker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/O;", "Landroidx/work/F$a;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC32094s0.a f191257c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f191258d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f191259e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f191260f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f191261g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f191262h;

        public b(AbstractC32094s0.a aVar, String str, String str2, String str3, String str4, boolean z12) {
            this.f191257c = aVar;
            this.f191258d = str;
            this.f191259e = str2;
            this.f191260f = str3;
            this.f191261g = str4;
            this.f191262h = z12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            final FileUploadWorker fileUploadWorker = FileUploadWorker.this;
            k kVar = fileUploadWorker.f191255b;
            if (kVar == null) {
                kVar = null;
            }
            k kVar2 = kVar;
            String str = this.f191260f;
            final AbstractC32094s0.a aVar = this.f191257c;
            return kVar2.a(aVar, this.f191258d, this.f191259e, str, this.f191261g, this.f191262h).B(new F.a.c()).u(new l41.o() { // from class: com.avito.android.messenger.conversation.mvi.file_upload.worker.h
                @Override // l41.o
                public final Object apply(Object obj2) {
                    Throwable th2 = (Throwable) obj2;
                    V2 v22 = V2.f318762a;
                    StringBuilder sb2 = new StringBuilder("Upload failed for message(");
                    AbstractC32094s0.a aVar2 = aVar;
                    sb2.append(com.avito.android.messenger.util.i.b(aVar2.f191219b, new Q[0]));
                    sb2.append(", channelId=");
                    sb2.append(aVar2.f191220c);
                    sb2.append(", localMessageId = ");
                    v22.a("FileUploadWorker", C22026a.c(sb2, aVar2.f191218a, ')'), th2);
                    String string = th2.toString();
                    int length = string.length() - 1;
                    if (length > 2048) {
                        length = 2048;
                    }
                    String strSubstring = string.substring(0, length);
                    C23544h.a aVar3 = new C23544h.a();
                    aVar3.b(fileUploadWorker.getInputData().f55510a);
                    aVar3.f55511a.put("keyError", strSubstring);
                    return new F.a.C1949a(aVar3.a());
                }
            });
        }
    }

    public FileUploadWorker(@Y61.k Context context, @Y61.k WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static AbstractC32094s0.a d(C23544h c23544h) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) dZ.g.a(c23544h, f191254d);
        if (messengerUserHashInfo == null) {
            V2.f318762a.j("FileUploadWorker", "No user info was passed!", null);
            messengerUserHashInfo = null;
        }
        String strE = e(c23544h, "channelId");
        String strE2 = e(c23544h, "localMessageId");
        if (messengerUserHashInfo == null || strE == null || strE2 == null) {
            return null;
        }
        return new AbstractC32094s0.a(strE2, strE, messengerUserHashInfo);
    }

    public static String e(C23544h c23544h, String str) {
        String strC = c23544h.c(str);
        if (strC != null) {
            return strC;
        }
        V2.f318762a.j("FileUploadWorker", AK.c.k("No ", str, " was passed!"), null);
        return null;
    }

    @Override // androidx.work.rxjava3.RxWorker
    @Y61.k
    public final I<F.a> b() {
        AbstractC32094s0.a aVarD = d(getInputData());
        String strE = e(getInputData(), "fileId");
        String strE2 = e(getInputData(), "filePath");
        final String strE3 = e(getInputData(), "fileName");
        boolean zA2 = getInputData().a("deleteFile", true);
        String strC = getInputData().c(MessageBody.File.MIME_TYPE);
        if (aVarD != null && strE != null && strE2 != null) {
            return new G(new Callable() { // from class: com.avito.android.messenger.conversation.mvi.file_upload.worker.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str = strE3;
                    FileUploadWorker.a aVar = FileUploadWorker.f191253c;
                    new a.b(null);
                    FileUploadWorker fileUploadWorker = this.f191282b;
                    fileUploadWorker.f191255b = new a.c(new com.avito.android.messenger.conversation.mvi.file_upload.Q(), (j) C29972i.a(C29972i.b(fileUploadWorker.getApplicationContext()), j.class), null).f191271i.get();
                    try {
                        fileUploadWorker.setForegroundAsync(fileUploadWorker.c(str)).get();
                    } catch (Throwable th2) {
                        V2.f318762a.j("FileUploadWorker", "setForegroundAsync() failed", th2);
                    }
                    return G0.f406611a;
                }
            }).n(new b(aVarD, strE, strC, strE2, strE3, zA2));
        }
        C23544h.a aVar = new C23544h.a();
        aVar.b(getInputData().f55510a);
        return I.q(new F.a.C1949a(aVar.a()));
    }

    public final C23638w c(String str) {
        AbstractC32094s0.a aVarD = d(getInputData());
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(getApplicationContext(), R.style.Theme_DesignSystem_Legacy);
        z.n nVar = new z.n(dVar, getApplicationContext().getString(R.string.messenger_file_upload_notification_channel_id));
        nVar.g(16, true);
        nVar.f44585e = z.n.c(getApplicationContext().getString(R.string.messenger_notification_file_upload_title));
        nVar.f44586f = z.n.c((aVarD == null || str == null) ? getApplicationContext().getString(R.string.messenger_notification_file_upload_title) : getApplicationContext().getString(R.string.messenger_notification_file_upload_title_with_file_name, str));
        nVar.f44601u = C35835l0.d(R.attr.blue, dVar);
        nVar.f44578B.icon = R.drawable.ic_notification;
        Notification notificationB = nVar.b();
        return Build.VERSION.SDK_INT >= 29 ? new C23638w(98, 1, notificationB) : new C23638w(98, 0, notificationB);
    }

    @Override // androidx.work.rxjava3.RxWorker, androidx.work.F
    @Y61.k
    public final D0<C23638w> getForegroundInfoAsync() {
        return C37568u0.d(c(e(getInputData(), "fileName")));
    }
}
