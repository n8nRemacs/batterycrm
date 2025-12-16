package com.avito.android.profile_settings_extended.adapter.gallery.image;

import Rb0.InterfaceC15026b;
import android.net.Uri;
import com.avito.android.profile_settings_extended.adapter.gallery.image.GalleryImageItem;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ImageItemView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/gallery/image/g;", "LTV0/e;", "LRb0/b;", "Lcom/avito/android/profile_management_core/images/entity/f;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface g extends TV0.e, InterfaceC15026b, com.avito.android.profile_management_core.images.entity.f {

    /* compiled from: ImageItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    /* renamed from: CU */
    String getF229444g();

    void NY(@Y61.k Uri uri, @Y61.k String str, @Y61.k String str2);

    void OV(@Y61.k Image image, @Y61.k String str, @Y61.k String str2);

    void iB(@Y61.k GalleryImageItem.ScaleType scaleType);

    @Y61.k
    /* renamed from: oT */
    String getF229443f();

    void p3(@Y61.k Y41.a<G0> aVar);
}
