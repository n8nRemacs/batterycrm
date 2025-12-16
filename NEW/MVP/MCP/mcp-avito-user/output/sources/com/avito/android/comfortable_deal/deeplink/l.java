package com.avito.android.comfortable_deal.deeplink;

import Ju.AbstractC14250d;
import android.net.Uri;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.webview.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.HttpUrl;

/* compiled from: ComfortableDealDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29470k f121964l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ComfortableDealDeeplink f121965m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C29470k c29470k, ComfortableDealDeeplink comfortableDealDeeplink) {
        super(0);
        this.f121964l = c29470k;
        this.f121965m = comfortableDealDeeplink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        int i12 = C29470k.f121958k;
        C29470k c29470k = this.f121964l;
        ComfortableDealDeeplink comfortableDealDeeplink = this.f121965m;
        String str = comfortableDealDeeplink.f121850c;
        Uri.Builder builderBuildUpon = Uri.parse("https://" + (c29470k.f121962i.l() ? "m.avito.ru" : HttpUrl.INSTANCE.get(c29470k.f121963j.a()).host()) + "/comfortable-deal").buildUpon();
        String str2 = comfortableDealDeeplink.f121849b;
        if (str2 != null) {
            builderBuildUpon = builderBuildUpon.appendQueryParameter("item_id", str2);
        }
        if (str != null) {
            builderBuildUpon = builderBuildUpon.appendQueryParameter("utm_source", str);
        }
        c29470k.f121959f.R(l.a.a(c29470k.f121960g, builderBuildUpon.appendQueryParameter("platform", "android").build(), new WebViewLinkSettings(false, true, false, false, false, null, null, false, false, false, false, 2044, null), 4), com.avito.android.deeplink_handler.view.b.f134588l);
        c29470k.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
