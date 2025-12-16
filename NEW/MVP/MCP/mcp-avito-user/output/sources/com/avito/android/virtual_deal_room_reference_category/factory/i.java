package com.avito.android.virtual_deal_room_reference_category.factory;

import androidx.fragment.app.Fragment;
import com.avito.android.virtual_deal_room_reference_category.reference_category.ReferenceCategoryFragment;
import com.avito.android.virtual_deal_room_reference_category.reference_category.model.ReferenceCategoryArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import zN0.InterfaceC50490a;

/* compiled from: VirtualDealRoomReferenceCategoryFactory.kt */
@C11.a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/factory/i;", "LzN0/b;", "<init>", "()V", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC50490a
/* loaded from: classes5.dex */
public final class i implements zN0.b {
    @Inject
    public i() {
    }

    @Override // zN0.b
    public final Fragment a(String str) {
        ReferenceCategoryFragment.a aVar = ReferenceCategoryFragment.f327227o0;
        ReferenceCategoryArguments referenceCategoryArguments = new ReferenceCategoryArguments(str);
        aVar.getClass();
        return ReferenceCategoryFragment.a.a(referenceCategoryArguments);
    }
}
