package com.avito.android.webview;

import android.R;
import android.app.DownloadManager;
import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;
import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.webview.WebViewActivity;
import com.avito.android.webview.q;
import java.io.Serializable;
import java.util.List;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.webview.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C36152e implements androidx.view.result.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f329620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f329621c;

    public /* synthetic */ C36152e(Object obj, int i12) {
        this.f329620b = i12;
        this.f329621c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.result.a
    public final void a(Object obj) {
        Object obj2 = this.f329621c;
        switch (this.f329620b) {
            case 0:
                Boolean bool = (Boolean) obj;
                WebViewActivity webViewActivity = (WebViewActivity) obj2;
                if (!bool.booleanValue()) {
                    WebViewActivity.a aVar = WebViewActivity.f329521y;
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    View viewFindViewById = webViewActivity.findViewById(R.id.content);
                    PrintableText printableTextC = com.avito.android.printable_text.b.c(com.avito.android.R.string.permission_camera, new Serializable[0]);
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar, viewFindViewById, printableTextC, null, null, null, f.c.a.b(), 0, null, null, false, false, null, null, 4078);
                }
                Y41.l<? super Boolean, G0> lVar = webViewActivity.f329533x;
                if (lVar != null) {
                    ((q.a) lVar).invoke(bool);
                    break;
                }
                break;
            case 1:
                List list = (List) obj;
                ValueCallback<Uri[]> valueCallback = ((WebViewActivity) obj2).f329532w;
                if (valueCallback != 0) {
                    valueCallback.onReceiveValue(list.toArray(new Uri[0]));
                    break;
                }
                break;
            case 2:
                WebViewActivity webViewActivity2 = (WebViewActivity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    webViewActivity2.f329532w = null;
                    View viewFindViewById2 = webViewActivity2.findViewById(R.id.content);
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.b.b(viewFindViewById2, null, com.avito.android.R.string.permission_camera, null, 0, null, 0, null, f.c.a.b(), null, 130941);
                    break;
                } else {
                    ValueCallback<Uri[]> valueCallback2 = webViewActivity2.f329532w;
                    if (valueCallback2 != null) {
                        webViewActivity2.i0(valueCallback2);
                        break;
                    }
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    j jVar = (j) obj2;
                    DownloadManager.Request request = jVar.f329634b;
                    if (request != null) {
                        jVar.a(request);
                    }
                    jVar.f329634b = null;
                    break;
                }
                break;
        }
    }
}
