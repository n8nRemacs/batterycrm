package com.avito.android.webview;

import android.net.Uri;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: WebViewPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class r extends H implements Y41.l<String, G0> {
    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        u uVar = (u) this.receiver;
        D d12 = uVar.f329659o;
        if (d12 != null && !d12.f329515e.canScrollVertically(1)) {
            uVar.f329651g.e(Uri.parse(str2));
        }
        return G0.f406611a;
    }
}
