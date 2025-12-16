package com.avito.android.user_advert.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import lI0.InterfaceC43640a;

/* compiled from: MyAdvertRestorationV2DeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/deeplink/A;", "Lev/a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$RestoreV2;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class A extends AbstractC40161a<MyAdvertLink.RestoreV2> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43640a f310676f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f310677g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f310678h = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public A(@Y61.k InterfaceC43640a interfaceC43640a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f310676f = interfaceC43640a;
        this.f310677g = interfaceC35745a5;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        MyAdvertLink.RestoreV2 restoreV2 = (MyAdvertLink.RestoreV2) deepLink;
        this.f310678h.b(g1.a(this.f310676f.f(restoreV2.f133506c)).s(this.f310677g.e()).x(new y(this), new z(this, restoreV2)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f310678h.e();
    }
}
