package com.avito.android.bottom_sheet_group.items.multiselect_item;

import Y61.k;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.bottom_sheet_group.di.o;
import com.avito.android.bottom_sheet_group.items.checkable_item.BottomSheetGroupCheckableItem;
import com.avito.android.bottom_sheet_group.s;
import com.avito.android.util.O2;
import com.avito.konveyor.adapter.j;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetMultiselectItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_sheet_group/items/multiselect_item/e;", "Lcom/avito/android/bottom_sheet_group/items/multiselect_item/c;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f107370b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f107371c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final s f107372d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l41.g<BottomSheetMultiselectItem> f107373e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<BottomSheetMultiselectItem> f107374f = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public e(@o @k com.avito.konveyor.adapter.h hVar, @o @k com.avito.konveyor.a aVar, @k s sVar, @k l41.g<BottomSheetMultiselectItem> gVar) {
        this.f107370b = hVar;
        this.f107371c = aVar;
        this.f107372d = sVar;
        this.f107373e = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        BottomSheetMultiselectItem bottomSheetMultiselectItem = (BottomSheetMultiselectItem) aVar;
        com.avito.konveyor.a aVar2 = this.f107371c;
        com.avito.konveyor.adapter.h hVar = this.f107370b;
        j jVar = new j(hVar, aVar2);
        Boolean bool = bottomSheetMultiselectItem.f107362h;
        gVar.y20(bottomSheetMultiselectItem.f107357c, bool != null ? bool.booleanValue() : false, bottomSheetMultiselectItem.f107363i);
        gVar.tr(jVar);
        List<BottomSheetGroupCheckableItem> list = bottomSheetMultiselectItem.f107360f;
        boolean zA2 = O2.a(list);
        boolean z12 = bottomSheetMultiselectItem.f107361g;
        if (!zA2 || z12) {
            List<BottomSheetGroupCheckableItem> list2 = bottomSheetMultiselectItem.f107359e;
            if (list2 != null) {
                com.avito.konveyor.util.a.a(hVar, list2);
            }
        } else if (list != null) {
            com.avito.konveyor.util.a.a(hVar, list);
        }
        if (O2.a(list)) {
            s sVar = this.f107372d;
            gVar.yQ(z12 ? sVar.f107420a.getString(R.string.expanded_button_text) : sVar.f107420a.getString(R.string.collapsed_button_text), new d(this, bottomSheetMultiselectItem));
        } else {
            gVar.yQ(null, null);
        }
        gVar.ry();
    }

    @Override // com.avito.android.bottom_sheet_group.items.multiselect_item.c
    @k
    public final C41981q0 w7() {
        com.jakewharton.rxrelay3.c<BottomSheetMultiselectItem> cVar = this.f107374f;
        return l.l(cVar, cVar);
    }
}
