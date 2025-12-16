package com.avito.android.edit_seller_type;

import com.avito.android.edit_seller_type.EditSellerTypeFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditSellerTypeFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/edit_seller_type/mvi/entity/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.edit_seller_type.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30316e extends N implements Y41.l<com.avito.android.edit_seller_type.mvi.entity.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EditSellerTypeFragment f146729l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30316e(EditSellerTypeFragment editSellerTypeFragment) {
        super(1);
        this.f146729l = editSellerTypeFragment;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.edit_seller_type.mvi.entity.a aVar) {
        EditSellerTypeFragment.a aVar2 = EditSellerTypeFragment.f146675s0;
        this.f146729l.r5().accept(aVar);
        return G0.f406611a;
    }
}
