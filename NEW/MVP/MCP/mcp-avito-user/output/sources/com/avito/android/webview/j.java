package com.avito.android.webview;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.webkit.URLUtil;
import com.avito.android.R;
import com.avito.android.util.L5;
import i.b;
import kotlin.Metadata;

/* compiled from: WebViewDownloadDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/webview/j;", "", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WebViewActivity f329633a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public DownloadManager.Request f329634b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f329635c;

    public j(@Y61.k WebViewActivity webViewActivity, @Y61.k WebViewActivity webViewActivity2) {
        this.f329633a = webViewActivity;
        this.f329635c = webViewActivity2.registerForActivityResult(new b.l(), new C36152e(this, 3));
    }

    public final void a(DownloadManager.Request request) {
        WebViewActivity webViewActivity = this.f329633a;
        Object systemService = webViewActivity.getSystemService("download");
        DownloadManager downloadManager = systemService instanceof DownloadManager ? (DownloadManager) systemService : null;
        if (downloadManager != null) {
            downloadManager.enqueue(request);
            L5.a(webViewActivity, R.string.webview_file_download_started, 0);
        }
    }

    public final void b(String str, String str2, String str3) {
        String strGuessFileName = URLUtil.guessFileName(str, str2, str3);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(strGuessFileName);
        request.setMimeType(str3);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
        if (Build.VERSION.SDK_INT >= 29 || androidx.core.content.d.checkSelfPermission(this.f329633a, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            a(request);
        } else {
            this.f329634b = request;
            this.f329635c.b("android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }
}
