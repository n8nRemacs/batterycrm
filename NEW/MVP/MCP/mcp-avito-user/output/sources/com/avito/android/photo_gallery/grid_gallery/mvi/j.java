package com.avito.android.photo_gallery.grid_gallery.mvi;

import com.avito.android.photo_gallery.grid_gallery.GridGalleryOpenParams;
import com.avito.android.remote.model.Video;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryPositionsBuilder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "LX70/c;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class j extends N implements Y41.a<List<? extends X70.c>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ GridGalleryOpenParams f217339l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(GridGalleryOpenParams gridGalleryOpenParams) {
        super(0);
        this.f217339l = gridGalleryOpenParams;
    }

    @Override // Y41.a
    public final List<? extends X70.c> invoke() {
        X70.a aVar = X70.a.f18643a;
        GridGalleryOpenParams gridGalleryOpenParams = this.f217339l;
        Video video = gridGalleryOpenParams.f217130h;
        aVar.getClass();
        return X70.a.a(gridGalleryOpenParams.f217131i, video, null, null, gridGalleryOpenParams.f217125c, null, gridGalleryOpenParams.f217128f, null, null, true);
    }
}
