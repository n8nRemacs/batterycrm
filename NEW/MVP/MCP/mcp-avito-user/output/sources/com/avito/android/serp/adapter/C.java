package com.avito.android.serp.adapter;

import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Action;
import kotlin.Metadata;

/* compiled from: AdvertListItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class C extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D f268488l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f268489m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d12, AdvertItem advertItem) {
        super(0);
        this.f268488l = d12;
        this.f268489m = advertItem;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        InterfaceC34863v interfaceC34863v = this.f268488l.f268490b.get();
        AdvertItem advertItem = this.f268489m;
        String str = advertItem.f268425c;
        Action action = advertItem.f268410V;
        if (action == null || action.getDeepLink() == null) {
            new NoMatchLink();
        }
        interfaceC34863v.getClass();
        return kotlin.G0.f406611a;
    }
}
