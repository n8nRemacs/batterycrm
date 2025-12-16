package com.avito.android.webview;

import Mu.C14528a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: WebViewPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMu/a;", "appLink", "Lkotlin/G0;", "accept", "(LMu/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class s<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f329641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f329642c;

    public s(u uVar, Uri uri) {
        this.f329641b = uVar;
        this.f329642c = uri;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        G0 g02;
        DeepLink deepLink = ((C14528a) obj).getDeepLink();
        Uri uri = this.f329642c;
        u uVar = this.f329641b;
        if (deepLink != null) {
            if (!uVar.j(deepLink)) {
                u.i(uVar, uri.toString());
            }
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            u.i(uVar, uri.toString());
        }
    }
}
