package com.yandex.mapkit.search.search_layer;

import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import j.InterfaceC42148d;
import j.N;
import j.l0;

/* loaded from: classes7.dex */
public interface AssetsProvider {
    @InterfaceC42148d
    boolean canProvideLabels(@N SearchResultItem searchResultItem);

    @N
    @InterfaceC42148d
    IconStyle iconStyle(@N SearchResultItem searchResultItem, int i12);

    @N
    @l0
    ImageProvider image(@N SearchResultItem searchResultItem, int i12);

    @N
    @InterfaceC42148d
    Size size(@N SearchResultItem searchResultItem, int i12);
}
