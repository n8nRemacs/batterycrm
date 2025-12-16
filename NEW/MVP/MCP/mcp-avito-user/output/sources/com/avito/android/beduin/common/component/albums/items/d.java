package com.avito.android.beduin.common.component.albums.items;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.albums.AlbumElement;
import com.avito.android.beduin.common.component.image.ImageStyle;
import com.avito.android.beduin.common.component.image.OverlayStyle;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AlbumItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/albums/items/d;", "LTV0/d;", "Lcom/avito/android/beduin/common/component/albums/items/e;", "Lcom/avito/android/beduin/common/component/albums/items/AlbumItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements TV0.d<e, AlbumItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Integer, G0> f100652b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k l<? super Integer, G0> lVar) {
        this.f100652b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        AlbumItem albumItem = (AlbumItem) aVar;
        eVar2.Ea(albumItem.f100643d, albumItem.f100644e);
        AlbumElement albumElement = albumItem.f100642c;
        Image image = albumElement.getImage();
        OverlayStyle overlay = albumElement.getOverlay();
        if (overlay == null) {
            overlay = albumItem.f100645f;
        }
        eVar2.nI(image, new ImageStyle(albumElement.getCorners(), null, null, null, null, overlay, null));
        eVar2.Ra(albumElement.getCorners());
        eVar2.F(albumElement.getText());
        eVar2.c(new c(this, i12));
    }
}
