package com.avito.android.deeplink_handler.app.handler;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ToastLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class T extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ToastMessageLink f134403l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f134404m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(ToastMessageLink toastMessageLink, S s5) {
        super(0);
        this.f134403l = toastMessageLink;
        this.f134404m = s5;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f134403l.f133722f;
        if (deepLink != null) {
            ToastMessageLink.c.a aVar = ToastMessageLink.c.a.f133740b;
            S s5 = this.f134404m;
            s5.i(aVar, s5.f134402g, deepLink);
        }
        return G0.f406611a;
    }
}
