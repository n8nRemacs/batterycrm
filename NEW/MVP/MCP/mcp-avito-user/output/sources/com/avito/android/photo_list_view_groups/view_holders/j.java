package com.avito.android.photo_list_view_groups.view_holders;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.photo_uploader_appending.PhotoUploaderAppending;
import com.avito.android.photo_list_view.InterfaceC33208b;
import kotlin.Metadata;

/* compiled from: PhotoAppendingViewHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/view_holders/j;", "Lcom/avito/android/photo_list_view_groups/view_holders/m;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j extends m {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_list_view_groups.h f218686c;

    /* renamed from: d, reason: collision with root package name */
    public final PhotoUploaderAppending f218687d;

    public j(@Y61.k View view, @Y61.k com.avito.android.photo_list_view_groups.g gVar, @Y61.k com.avito.android.photo_list_view_groups.h hVar) {
        super(view, gVar);
        this.f218686c = hVar;
        this.f218687d = (PhotoUploaderAppending) view.findViewById(R.id.loading_photo_image_view);
    }

    @Override // com.avito.android.photo_list_view_groups.view_holders.m
    public final void B80(@Y61.k InterfaceC33208b interfaceC33208b) {
        int[] iArr;
        com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j jVar = new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(19, this, interfaceC33208b);
        PhotoUploaderAppending photoUploaderAppending = this.f218687d;
        photoUploaderAppending.setOnClickListener(jVar);
        if (interfaceC33208b.getF218094c() instanceof InterfaceC33208b.InterfaceC6540b.C6541b) {
            PhotoUploaderAppending.f179938f.getClass();
            iArr = PhotoUploaderAppending.f179940h;
        } else {
            PhotoUploaderAppending.f179938f.getClass();
            iArr = PhotoUploaderAppending.f179939g;
        }
        photoUploaderAppending.setState(iArr);
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33207a
    public final boolean isDraggable() {
        return false;
    }
}
