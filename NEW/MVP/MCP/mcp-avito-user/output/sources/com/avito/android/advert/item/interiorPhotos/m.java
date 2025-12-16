package com.avito.android.advert.item.interiorPhotos;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.interior_photos_block.entity.InteriorPhotoBlock;
import iO.InterfaceC41322a;
import java.util.List;
import kotlin.Metadata;

/* compiled from: InteriorPhotosView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/interiorPhotos/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/interiorPhotos/l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f76605b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.interior_photos_block.a f76606c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public com.avito.android.interior_photos_block.b f76607d;

    public m(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.android.interior_photos_block.a aVar) {
        super(viewGroup);
        this.f76605b = viewGroup;
        this.f76606c = aVar;
        aVar.a(viewGroup, new a());
    }

    @Override // com.avito.android.advert.item.interiorPhotos.l
    public final void q70(@Y61.k InteriorPhotoBlock interiorPhotoBlock, @Y61.k h hVar) {
        com.avito.android.interior_photos_block.k kVarA = this.f76606c.a(this.f76605b, hVar);
        ViewGroup viewGroup = kVarA.f173052a;
        if (viewGroup.isAttachedToWindow()) {
            ((com.avito.android.interior_photos_block.mvi.k) kVarA.f173055d.getValue()).accept(new InterfaceC41322a.C11374a(interiorPhotoBlock));
        } else {
            viewGroup.addOnAttachStateChangeListener(new com.avito.android.interior_photos_block.g(viewGroup, kVarA, interiorPhotoBlock));
        }
    }

    /* compiled from: InteriorPhotosView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/interiorPhotos/m$a", "Lcom/avito/android/interior_photos_block/m;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.interior_photos_block.m {
        @Override // com.avito.android.interior_photos_block.m
        public final void a(int i12, @Y61.l String str, @Y61.k List list) {
        }
    }
}
