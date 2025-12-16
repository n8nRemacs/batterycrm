package com.avito.android.photo_list_view.re23.viewholders;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.photo_uploader_appending.PhotoUploaderAppending;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view.L;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImageAppendingViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/viewholders/b;", "Lcom/avito/android/photo_list_view/re23/viewholders/a;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f218280d = 0;

    /* renamed from: c, reason: collision with root package name */
    public final PhotoUploaderAppending f218281c;

    public b(@Y61.k View view, @Y61.k com.avito.android.photo_list_view.re23.a aVar) {
        super(view, aVar);
        this.f218281c = (PhotoUploaderAppending) view.findViewById(R.id.loading_photo_image_view);
    }

    @Override // com.avito.android.photo_list_view.re23.viewholders.a
    public final void B80(@Y61.k InterfaceC33208b interfaceC33208b) {
        int[] iArr;
        Bitmap bitmap;
        Bitmap bitmapCreateScaledBitmap;
        com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j jVar = new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(14, this, interfaceC33208b);
        PhotoUploaderAppending photoUploaderAppending = this.f218281c;
        photoUploaderAppending.setOnClickListener(jVar);
        if (interfaceC33208b instanceof L) {
            L l12 = (L) interfaceC33208b;
            photoUploaderAppending.setText(l12.f218096e);
            Integer num = l12.f218097f;
            if (num != null) {
                int iIntValue = num.intValue();
                Context context = photoUploaderAppending.getContext();
                int iB2 = y6.b(32);
                int iB3 = y6.b(32);
                Drawable drawable = androidx.core.content.d.getDrawable(context, iIntValue);
                BitmapDrawable bitmapDrawable = null;
                BitmapDrawable bitmapDrawable2 = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                if (bitmapDrawable2 != null && (bitmap = bitmapDrawable2.getBitmap()) != null && (bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iB2, iB3, false)) != null) {
                    bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapCreateScaledBitmap);
                }
                if (bitmapDrawable != null) {
                    photoUploaderAppending.setIcon(bitmapDrawable);
                }
            }
            Integer num2 = l12.f218098g;
            if (num2 != null) {
                photoUploaderAppending.setBackgroundColor(androidx.core.content.d.getColor(photoUploaderAppending.getContext(), num2.intValue()));
            }
        }
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
