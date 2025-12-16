package com.avito.android.bottom_sheet_group.items.checkable_item;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetGroupCheckableItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f107349l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BottomSheetGroupCheckableItem f107350m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, BottomSheetGroupCheckableItem bottomSheetGroupCheckableItem) {
        super(1);
        this.f107349l = eVar;
        this.f107350m = bottomSheetGroupCheckableItem;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        e eVar = this.f107349l;
        l41.g<BottomSheetGroupCheckableItem> gVar = eVar.f107351b;
        BottomSheetGroupCheckableItem bottomSheetGroupCheckableItem = this.f107350m;
        bottomSheetGroupCheckableItem.f107344e = zBooleanValue;
        gVar.accept(bottomSheetGroupCheckableItem);
        bottomSheetGroupCheckableItem.f107344e = zBooleanValue;
        eVar.f107352c.accept(bottomSheetGroupCheckableItem);
        return G0.f406611a;
    }
}
