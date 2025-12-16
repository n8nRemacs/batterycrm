package com.avito.android.publish.slots.contact_method.info_item;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContactMethodInfoBlockItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f243276l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ContactMethodInfoBlockItem f243277m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ContactMethodInfoBlockItem contactMethodInfoBlockItem) {
        super(0);
        this.f243276l = eVar;
        this.f243277m = contactMethodInfoBlockItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f243276l;
        eVar.f243278b.c(Integer.MAX_VALUE);
        eVar.f243279c.accept(this.f243277m);
        return G0.f406611a;
    }
}
