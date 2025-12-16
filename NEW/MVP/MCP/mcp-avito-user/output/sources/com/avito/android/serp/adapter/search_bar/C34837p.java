package com.avito.android.serp.adapter.search_bar;

import android.net.Uri;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.ticket_view.mvi.a;
import kotlin.Metadata;

/* compiled from: SearchBarItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.search_bar.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34837p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.ticket_view.mvi.n f271648b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C34840t f271649c;

    public C34837p(com.avito.android.ticket_view.mvi.n nVar, C34840t c34840t) {
        this.f271648b = nVar;
        this.f271649c = c34840t;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f271648b.accept(a.C9222a.f301405a);
        C34840t c34840t = this.f271649c;
        c34840t.getClass();
        Uri uri = Uri.parse("https://m.avito.ru/profile/rewards?pageFrom=main_entry_point_android");
        AuthSource authSource = AuthSource.f92694c;
        b.a.a(c34840t.f271669j, new WebViewLink.OnlyAvitoDomain(uri, new WebViewLinkSettings(false, true, true, false, true, "rewards", null, false, false, false, true, 968, null), null, 4, null), null, null, 6);
    }
}
