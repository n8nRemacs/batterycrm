package com.avito.android.guests_selector.items.child;

import gI.InterfaceC40585a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChildPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f161479l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ChildItem f161480m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ChildItem childItem) {
        super(0);
        this.f161479l = dVar;
        this.f161480m = childItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f161479l.f161481b.invoke(new InterfaceC40585a.f(this.f161480m.f161471b));
        return G0.f406611a;
    }
}
