package com.avito.android.messenger.conversation.mvi.file_upload;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import com.avito.android.R;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FileUploadInitializer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/c;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/b;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32062c implements InterfaceC32060b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f191123g = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f191124a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.n f191125b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification.m f191126c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f191127d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C31667x f191128e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f191129f;

    /* compiled from: FileUploadInitializer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C32062c(@Y61.k Application application, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.n nVar, @Y61.k com.avito.android.notification.m mVar, @Y61.k InterfaceC32024m interfaceC32024m, @Y61.k C31667x c31667x) {
        this.f191124a = application;
        this.f191125b = nVar;
        this.f191126c = mVar;
        this.f191127d = interfaceC32024m;
        this.f191128e = c31667x;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32060b
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.r a() {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new VH0.c(this, 22));
    }

    public final void b() {
        V2 v22 = V2.f318762a;
        v22.c("FileUploadInitializerImpl", "File upload initialization started", null);
        NotificationManager notificationManagerA = this.f191126c.a();
        Application application = this.f191124a;
        notificationManagerA.createNotificationChannel(new NotificationChannel(application.getString(R.string.messenger_file_upload_notification_channel_id), application.getString(R.string.messenger_file_upload_notification_channel_name), 2));
        v22.c("FileUploadInitializerImpl", "Created notification channel", null);
        com.avito.android.messenger.conversation.mvi.file_attachment.n nVar = this.f191125b;
        nVar.r().h(C32066e.f191141b).t(C32068f.f191148b).e();
        InterfaceC32024m interfaceC32024m = this.f191127d;
        interfaceC32024m.b().o(new r(this)).g(interfaceC32024m.S().o(new C32086o(this))).g(nVar.u().o(new C32080l(this))).l(new C32064d(this)).r().i();
        v22.c("FileUploadInitializerImpl", "File upload initialization successfully finished", null);
    }
}
