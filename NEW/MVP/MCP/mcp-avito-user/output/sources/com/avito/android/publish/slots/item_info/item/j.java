package com.avito.android.publish.slots.item_info.item;

import com.avito.android.remote.model.category_parameters.slot.item_info.Confetti;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemInfoItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f244391l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f244392m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d dVar, l lVar) {
        super(0);
        this.f244391l = dVar;
        this.f244392m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f244391l;
        Confetti confetti = dVar.f244379g;
        if (confetti != null) {
            l lVar = this.f244392m;
            lVar.f244397d.accept(confetti);
            n nVar = lVar.f244395b;
            nVar.getClass();
            nVar.f244399a.putBoolean("key_item_info_slot_confetti_animation_was_shown ".concat(dVar.f244381i), true);
        }
        return G0.f406611a;
    }
}
