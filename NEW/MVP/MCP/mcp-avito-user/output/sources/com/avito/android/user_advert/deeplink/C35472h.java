package com.avito.android.user_advert.deeplink;

import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.user_advert.advert.InterfaceC35391g;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertDeactivateLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/deeplink/h;", "Lev/a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Deactivate;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.deeplink.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35472h extends AbstractC40161a<MyAdvertLink.Deactivate> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35391g f310724f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f310725g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f310726h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.g f310727i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f310728j = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public C35472h(@Y61.k InterfaceC35391g interfaceC35391g, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k a.g gVar) {
        this.f310724f = interfaceC35391g;
        this.f310725g = interfaceC35745a5;
        this.f310726h = interfaceC28373a;
        this.f310727i = gVar;
    }

    public static final void k(C35472h c35472h, MyAdvertLink.Deactivate deactivate, boolean z12) {
        if (deactivate.f133475d) {
            c35472h.f310727i.g(c35472h.d(), z12);
        }
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        MyAdvertLink.Deactivate deactivate = (MyAdvertLink.Deactivate) deepLink;
        String str2 = deactivate.f133474c;
        this.f310728j.b(this.f310724f.b(str2).r0(P2.c.f318721a).j0(this.f310725g.e()).t0(new C35471g(this, deactivate, str2)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f310728j.e();
    }
}
