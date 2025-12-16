package com.avito.android.photo_gallery_carousel.gallery_view;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyLayoutHelper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/s;", "", "<init>", "()V", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f217851a = new LinkedHashMap();

    public final boolean a(int i12) {
        LinkedHashMap linkedHashMap = this.f217851a;
        return !((Boolean) linkedHashMap.getOrDefault(Integer.valueOf(i12), Boolean.FALSE)).booleanValue() && linkedHashMap.containsValue(Boolean.TRUE);
    }
}
