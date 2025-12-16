package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemCardRedesign.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/CarouselGalleryGroup;", "", "(Ljava/lang/String;I)V", "NO_CROP_4_3", "CROP_4_3", "NO_CROP_9_7", "CROP_9_7", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CarouselGalleryGroup {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CarouselGalleryGroup[] $VALUES;

    @c("4/3-nocrop")
    public static final CarouselGalleryGroup NO_CROP_4_3 = new CarouselGalleryGroup("NO_CROP_4_3", 0);

    @c("4/3-crop")
    public static final CarouselGalleryGroup CROP_4_3 = new CarouselGalleryGroup("CROP_4_3", 1);

    @c("9/7-nocrop")
    public static final CarouselGalleryGroup NO_CROP_9_7 = new CarouselGalleryGroup("NO_CROP_9_7", 2);

    @c("9/7-crop")
    public static final CarouselGalleryGroup CROP_9_7 = new CarouselGalleryGroup("CROP_9_7", 3);

    private static final /* synthetic */ CarouselGalleryGroup[] $values() {
        return new CarouselGalleryGroup[]{NO_CROP_4_3, CROP_4_3, NO_CROP_9_7, CROP_9_7};
    }

    static {
        CarouselGalleryGroup[] carouselGalleryGroupArr$values = $values();
        $VALUES = carouselGalleryGroupArr$values;
        $ENTRIES = kotlin.enums.c.a(carouselGalleryGroupArr$values);
    }

    private CarouselGalleryGroup(String str, int i12) {
    }

    @k
    public static a<CarouselGalleryGroup> getEntries() {
        return $ENTRIES;
    }

    public static CarouselGalleryGroup valueOf(String str) {
        return (CarouselGalleryGroup) Enum.valueOf(CarouselGalleryGroup.class, str);
    }

    public static CarouselGalleryGroup[] values() {
        return (CarouselGalleryGroup[]) $VALUES.clone();
    }
}
