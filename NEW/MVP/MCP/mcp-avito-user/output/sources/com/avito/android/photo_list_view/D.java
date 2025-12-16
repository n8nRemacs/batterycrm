package com.avito.android.photo_list_view;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.photo_uploader_appending.PhotoUploaderAppending;
import com.avito.android.photo_list_view.InterfaceC33208b;
import kotlin.Metadata;

/* compiled from: ImageListAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/D;", "Lcom/avito/android/photo_list_view/Q;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class D extends Q {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f218066d = 0;

    /* renamed from: c, reason: collision with root package name */
    public final PhotoUploaderAppending f218067c;

    public D(@Y61.k View view, @Y61.k s sVar) {
        super(view, sVar);
        this.f218067c = (PhotoUploaderAppending) view.findViewById(R.id.loading_photo_image_view);
    }

    @Override // com.avito.android.photo_list_view.Q
    public final void B80(@Y61.k InterfaceC33208b interfaceC33208b) {
        int[] iArr;
        com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j jVar = new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(12, this, interfaceC33208b);
        PhotoUploaderAppending photoUploaderAppending = this.f218067c;
        photoUploaderAppending.setOnClickListener(jVar);
        if (interfaceC33208b.getF218094c() instanceof InterfaceC33208b.InterfaceC6540b.C6541b) {
            PhotoUploaderAppending.f179938f.getClass();
            iArr = PhotoUploaderAppending.f179940h;
        } else {
            PhotoUploaderAppending.f179938f.getClass();
            iArr = PhotoUploaderAppending.f179939g;
        }
        photoUploaderAppending.setState(iArr);
        if (interfaceC33208b instanceof L) {
            L l12 = (L) interfaceC33208b;
            photoUploaderAppending.setText(l12.f218096e);
            photoUploaderAppending.setIcon(l12.f218097f);
            Integer num = l12.f218098g;
            if (num != null) {
                photoUploaderAppending.setBackgroundColor(androidx.core.content.d.getColor(photoUploaderAppending.getContext(), num.intValue()));
            }
        }
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33207a
    public final boolean isDraggable() {
        return false;
    }
}
