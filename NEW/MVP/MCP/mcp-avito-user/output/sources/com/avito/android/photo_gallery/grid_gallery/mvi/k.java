package com.avito.android.photo_gallery.grid_gallery.mvi;

import com.avito.android.photo_gallery.grid_gallery.GridGalleryOpenParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryPositionsBuilder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/avito/android/photo_gallery/adapter/q;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class k extends N implements Y41.a<List<? extends com.avito.android.photo_gallery.adapter.q>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ GridGalleryOpenParams f217340l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(GridGalleryOpenParams gridGalleryOpenParams) {
        super(0);
        this.f217340l = gridGalleryOpenParams;
    }

    @Override // Y41.a
    public final List<? extends com.avito.android.photo_gallery.adapter.q> invoke() {
        GridGalleryOpenParams gridGalleryOpenParams = this.f217340l;
        return com.avito.android.photo_gallery.adapter.p.b(gridGalleryOpenParams.f217130h, gridGalleryOpenParams.f217131i, gridGalleryOpenParams.f217125c, null, null, true, null, gridGalleryOpenParams.f217128f, null, null, 256);
    }
}
