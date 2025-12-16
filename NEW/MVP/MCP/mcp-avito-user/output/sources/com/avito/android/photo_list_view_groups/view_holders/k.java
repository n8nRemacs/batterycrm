package com.avito.android.photo_list_view_groups.view_holders;

import android.view.View;
import com.avito.android.R;
import com.avito.android.photo_list_view_groups.b;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PhotoItemGroupsRe23ViewHolderProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view_groups/view_holders/k;", "Lcom/avito/android/photo_list_view_groups/b$b;", "<init>", "()V", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements b.InterfaceC6557b {
    @Override // com.avito.android.photo_list_view_groups.b.InterfaceC6557b
    @Y61.k
    public final d a(@Y61.k Y41.l lVar, @Y61.k com.avito.android.photo_list_view_groups.g gVar, @Y61.k g80.d dVar) {
        return new d((View) lVar.invoke(Integer.valueOf(R.layout.photo_item_groups_re23_image_error_item)), gVar, dVar);
    }

    @Override // com.avito.android.photo_list_view_groups.b.InterfaceC6557b
    @Y61.k
    public final a b(@Y61.k Y41.l lVar, @Y61.k com.avito.android.photo_list_view_groups.g gVar, @Y61.k com.avito.android.photo_list_view_groups.b bVar, @Y61.k List list, @Y61.k List list2, @Y61.k com.avito.android.photo_list_view_groups.h hVar, @Y61.k g80.d dVar) {
        return new a((View) lVar.invoke(Integer.valueOf(R.layout.photo_item_groups_re23_image_content_item)), gVar, bVar, list, list2, hVar, dVar);
    }

    @Override // com.avito.android.photo_list_view_groups.b.InterfaceC6557b
    @Y61.k
    public final f c(@Y61.k Y41.l lVar, @Y61.k com.avito.android.photo_list_view_groups.g gVar, @Y61.k List list, @Y61.k List list2, @Y61.k com.avito.android.photo_list_view_groups.h hVar, @Y61.k g80.d dVar) {
        return new f((View) lVar.invoke(Integer.valueOf(R.layout.photo_item_groups_re23_image_loading_item)), gVar, list, list2, hVar, dVar);
    }

    @Override // com.avito.android.photo_list_view_groups.b.InterfaceC6557b
    @Y61.k
    public final j d(@Y61.k Y41.l lVar, @Y61.k com.avito.android.photo_list_view_groups.g gVar, @Y61.k com.avito.android.photo_list_view_groups.h hVar) {
        return new j((View) lVar.invoke(Integer.valueOf(R.layout.photo_item_groups_re23_camera_item)), gVar, hVar);
    }
}
