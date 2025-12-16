package com.avito.android.messenger.conversation.mvi.file_download;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import androidx.core.app.z;
import androidx.work.C23638w;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.C29972i;
import com.avito.android.messenger.conversation.mvi.file_download.C32037a;
import com.avito.android.messenger.conversation.mvi.file_download.FileDownloadWorker;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V2;
import java.util.concurrent.Callable;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.conversation.mvi.file_download.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class CallableC32050n implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f190940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f190941c;

    public /* synthetic */ CallableC32050n(Object obj, int i12) {
        this.f190940b = i12;
        this.f190941c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C32037a.C5644a c5644a = null;
        Object obj = this.f190941c;
        switch (this.f190940b) {
            case 0:
                FileDownloadWorker.a aVar = FileDownloadWorker.f190805d;
                new C32037a.b();
                FileDownloadWorker fileDownloadWorker = (FileDownloadWorker) obj;
                C32037a.c cVar = new C32037a.c((InterfaceC32057v) C29972i.a(C29972i.b(fileDownloadWorker.getApplicationContext()), InterfaceC32057v.class), null);
                fileDownloadWorker.f190807b = cVar.f190895m.get();
                InterfaceC28373a interfaceC28373aA = cVar.f190883a.a();
                dagger.internal.t.c(interfaceC28373aA);
                fileDownloadWorker.f190808c = interfaceC28373aA;
                try {
                    androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(fileDownloadWorker.getApplicationContext(), R.style.Theme_DesignSystem_Legacy);
                    String string = fileDownloadWorker.getApplicationContext().getString(R.string.messenger_file_download_notification_channel_id);
                    int i12 = Build.VERSION.SDK_INT;
                    NotificationChannel notificationChannel = new NotificationChannel(string, fileDownloadWorker.getApplicationContext().getString(R.string.messenger_file_download_notification_channel_name), 2);
                    w wVar = fileDownloadWorker.f190807b;
                    if (wVar == null) {
                        wVar = null;
                    }
                    wVar.b(notificationChannel);
                    V2.f318762a.c("FileDownloadWorker", "Created notification channel", null);
                    z.n nVar = new z.n(dVar, string);
                    nVar.g(16, true);
                    nVar.f44585e = z.n.c(fileDownloadWorker.getApplicationContext().getString(R.string.messenger_notification_file_dowload_title));
                    nVar.f44586f = z.n.c(fileDownloadWorker.getApplicationContext().getString(R.string.messenger_notification_file_dowload_content));
                    nVar.f44601u = C35835l0.d(R.attr.blue, dVar);
                    nVar.f44578B.icon = R.drawable.ic_notification;
                    Notification notificationB = nVar.b();
                    fileDownloadWorker.setForegroundAsync(i12 >= 29 ? new C23638w(60, 1, notificationB) : new C23638w(60, 0, notificationB)).get();
                } catch (Throwable th2) {
                    V2.f318762a.j("FileDownloadWorker", "setForegroundAsync() failed", th2);
                }
                break;
            default:
                C32042f c32042f = (C32042f) obj;
                Context context = c32042f.f190919a;
                c32042f.f190924f.b().b(new NotificationChannel(context.getString(R.string.messenger_file_download_notification_channel_id), context.getString(R.string.messenger_file_download_notification_channel_name), 2));
                V2.f318762a.c("FileDownloadWorker", "Created notification channel", null);
                break;
        }
        return G0.f406611a;
    }
}
