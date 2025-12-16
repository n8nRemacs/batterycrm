package com.avito.android.webview;

import android.webkit.WebView;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f329622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f329623c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.h f329624d;

    public /* synthetic */ g(h hVar, l0.h hVar2, int i12) {
        this.f329622b = i12;
        this.f329623c = hVar;
        this.f329624d = hVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.avito.android.webview.g, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i12;
        int i13;
        switch (this.f329622b) {
            case 0:
                h hVar = this.f329623c;
                Runnable runnable = hVar.f329632h;
                l0.h hVar2 = this.f329624d;
                if (L.f(runnable, hVar2.f406842b)) {
                    int i14 = hVar.f329631g;
                    WebView webView = hVar.f329625a;
                    if (i14 == 0 && (i12 = hVar.f329630f) != 0) {
                        webView.scrollTo(0, i12);
                    }
                    ?? gVar = new g(hVar, hVar2, 1);
                    hVar2.f406842b = gVar;
                    hVar.f329632h = gVar;
                    webView.postDelayed(gVar, 500L);
                    break;
                }
                break;
            default:
                h hVar3 = this.f329623c;
                if (L.f(hVar3.f329632h, this.f329624d.f406842b)) {
                    if (hVar3.f329631g == 0 && (i13 = hVar3.f329630f) != 0) {
                        hVar3.f329625a.scrollTo(0, i13);
                    }
                    hVar3.f329632h = null;
                    break;
                }
                break;
        }
    }
}
