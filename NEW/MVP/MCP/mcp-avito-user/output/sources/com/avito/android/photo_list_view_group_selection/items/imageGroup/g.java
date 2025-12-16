package com.avito.android.photo_list_view_group_selection.items.imageGroup;

import Y41.l;
import Y61.k;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j;
import e80.InterfaceC39964a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PhotoItemGroupSelectionImageGroupView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/items/imageGroup/g;", "Lcom/avito/android/photo_list_view_group_selection/items/imageGroup/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f218435d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemRadio f218436b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<InterfaceC39964a, G0> f218437c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k ListItemRadio listItemRadio, @k l<? super InterfaceC39964a, G0> lVar) {
        super(listItemRadio);
        this.f218436b = listItemRadio;
        this.f218437c = lVar;
    }

    @Override // com.avito.android.photo_list_view_group_selection.items.imageGroup.f
    public final void setChecked(boolean z12) {
        this.f218436b.setChecked(z12);
    }

    @Override // com.avito.android.photo_list_view_group_selection.items.imageGroup.f
    public final void tV(@k PhotoItemGroupSelectionImageGroupItem photoItemGroupSelectionImageGroupItem) {
        String str = photoItemGroupSelectionImageGroupItem.f218426d;
        ListItemRadio listItemRadio = this.f218436b;
        listItemRadio.setTitle(str);
        listItemRadio.setChecked(photoItemGroupSelectionImageGroupItem.f218427e);
        listItemRadio.setToggleByClickEnabled(false);
        listItemRadio.setOnClickListener(new j(16, this, photoItemGroupSelectionImageGroupItem));
    }
}
