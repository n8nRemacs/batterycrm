package com.avito.android.bottom_sheet_group.items.checkable_item;

import Y61.k;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BottomSheetGroupCheckableItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_sheet_group/items/checkable_item/e;", "Lcom/avito/android/bottom_sheet_group/items/checkable_item/c;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<BottomSheetGroupCheckableItem> f107351b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<BottomSheetGroupCheckableItem> f107352c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f107353d;

    @Inject
    public e(@k l41.g<BottomSheetGroupCheckableItem> gVar) {
        this.f107351b = gVar;
        com.jakewharton.rxrelay3.c<BottomSheetGroupCheckableItem> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f107352c = cVar;
        this.f107353d = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        BottomSheetGroupCheckableItem bottomSheetGroupCheckableItem = (BottomSheetGroupCheckableItem) aVar;
        gVar.setTitle(bottomSheetGroupCheckableItem.f107343d);
        gVar.setChecked(bottomSheetGroupCheckableItem.f107344e);
        gVar.l0(new d(this, bottomSheetGroupCheckableItem));
    }

    @Override // com.avito.android.bottom_sheet_group.items.checkable_item.c
    @k
    public final z<BottomSheetGroupCheckableItem> d() {
        return this.f107353d;
    }
}
