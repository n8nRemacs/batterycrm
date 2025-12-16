package com.avito.android.profile_vk_linking.request_token;

import Zc0.C19541d;
import android.webkit.WebView;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: VkRequestTokenView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class i extends H implements Y41.l<C19541d, G0> {
    @Override // Y41.l
    public final G0 invoke(C19541d c19541d) {
        C19541d c19541d2 = c19541d;
        k kVar = (k) this.receiver;
        kVar.getClass();
        boolean z12 = c19541d2.f20309b;
        WebView webView = kVar.f231361c;
        com.avito.android.status_view.g gVar = kVar.f231363e;
        if (z12) {
            D6.w(webView);
            com.avito.android.status_view.g.a(gVar, webView.getContext().getString(R.string.unknown_server_error), null, 14);
        } else {
            D6.H(webView);
            D6.w(gVar.f284965h);
            D6.w(gVar.f284961d);
            gVar.f284967j.e();
        }
        if (!c19541d2.f20308a) {
            kVar.f231362d.setRefreshing(false);
        }
        return G0.f406611a;
    }
}
