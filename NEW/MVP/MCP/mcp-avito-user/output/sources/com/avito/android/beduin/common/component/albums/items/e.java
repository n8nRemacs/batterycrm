package com.avito.android.beduin.common.component.albums.items;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.image.ImageStyle;
import com.avito.android.beduin.common.container.Corners;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AlbumItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/albums/items/e;", "LTV0/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface e extends TV0.e {

    /* compiled from: AlbumItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Ea(int i12, int i13);

    void F(@l AttributedText attributedText);

    void Ra(@l Corners corners);

    void c(@k Y41.a<G0> aVar);

    void nI(@k Image image, @k ImageStyle imageStyle);
}
