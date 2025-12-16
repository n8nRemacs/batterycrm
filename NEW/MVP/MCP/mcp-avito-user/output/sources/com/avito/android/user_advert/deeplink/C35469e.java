package com.avito.android.user_advert.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import lI0.InterfaceC43640a;

/* compiled from: MyAdvertActivationV2DeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/deeplink/e;", "Lev/a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$ActivateV2;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.deeplink.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35469e extends AbstractC40161a<MyAdvertLink.ActivateV2> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43640a f310714f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f310715g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f310716h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f310717i = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public C35469e(@Y61.k InterfaceC43640a interfaceC43640a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f310714f = interfaceC43640a;
        this.f310715g = interfaceC35745a5;
        this.f310716h = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        MyAdvertLink.ActivateV2 activateV2 = (MyAdvertLink.ActivateV2) deepLink;
        this.f310717i.b(this.f310714f.o(activateV2.f133466c, activateV2.f133468e).s(this.f310715g.e()).x(new C35467c(this, activateV2), new C35468d(this, activateV2)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f310717i.e();
    }
}
