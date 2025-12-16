package com.avito.android.serp.adapter.witcher;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.witcher.WitcherItem;
import kotlin.Metadata;
import rn0.InterfaceC47691c;

/* compiled from: WitcherItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class w<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f273895b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WitcherItem f273896c;

    public w(A a12, WitcherItem witcherItem) {
        this.f273895b = a12;
        this.f273896c = witcherItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        A a12 = this.f273895b;
        InterfaceC34885d interfaceC34885d = a12.f273738f;
        if (interfaceC34885d == null) {
            interfaceC34885d = null;
        }
        interfaceC34885d.e();
        WitcherItem.Action action = this.f273896c.f273818i;
        DeepLink deepLink = action != null ? action.f273829c : null;
        if (deepLink != null) {
            InterfaceC47691c.a.b(a12.f273735c.get(), deepLink, 6);
        }
    }
}
