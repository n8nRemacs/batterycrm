package com.avito.android.photo_gallery;

import com.avito.android.photo_gallery.LegacyPhotoGalleryActivity;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LegacyPhotoGalleryActivity.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_gallery/adapter/q;", "realtyAdapterItems", "Lcom/avito/android/photo_gallery/adapter/a;", "invoke", "(Ljava/util/List;)Lcom/avito/android/photo_gallery/adapter/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class u extends kotlin.jvm.internal.N implements Y41.l<List<? extends com.avito.android.photo_gallery.adapter.q>, com.avito.android.photo_gallery.adapter.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LegacyPhotoGalleryActivity f217665l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(LegacyPhotoGalleryActivity legacyPhotoGalleryActivity) {
        super(1);
        this.f217665l = legacyPhotoGalleryActivity;
    }

    @Override // Y41.l
    public final com.avito.android.photo_gallery.adapter.a invoke(List<? extends com.avito.android.photo_gallery.adapter.q> list) {
        LegacyPhotoGalleryActivity.a aVar = LegacyPhotoGalleryActivity.f216531m0;
        return this.f217665l.c2(list);
    }
}
