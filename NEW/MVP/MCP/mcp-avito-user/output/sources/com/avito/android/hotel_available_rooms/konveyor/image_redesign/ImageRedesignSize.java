package com.avito.android.hotel_available_rooms.konveyor.image_redesign;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HotelRoomImageRedesignItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/image_redesign/ImageRedesignSize;", "", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImageRedesignSize {

    /* renamed from: b, reason: collision with root package name */
    public static final ImageRedesignSize f163012b;

    /* renamed from: c, reason: collision with root package name */
    public static final ImageRedesignSize f163013c;

    /* renamed from: d, reason: collision with root package name */
    public static final ImageRedesignSize f163014d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ImageRedesignSize[] f163015e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163016f;

    static {
        ImageRedesignSize imageRedesignSize = new ImageRedesignSize("ADAPTIVE", 0);
        f163012b = imageRedesignSize;
        ImageRedesignSize imageRedesignSize2 = new ImageRedesignSize("FIT", 1);
        f163013c = imageRedesignSize2;
        ImageRedesignSize imageRedesignSize3 = new ImageRedesignSize("LARGE", 2);
        f163014d = imageRedesignSize3;
        ImageRedesignSize[] imageRedesignSizeArr = {imageRedesignSize, imageRedesignSize2, imageRedesignSize3};
        f163015e = imageRedesignSizeArr;
        f163016f = kotlin.enums.c.a(imageRedesignSizeArr);
    }

    public ImageRedesignSize() {
        throw null;
    }

    public static ImageRedesignSize valueOf(String str) {
        return (ImageRedesignSize) Enum.valueOf(ImageRedesignSize.class, str);
    }

    public static ImageRedesignSize[] values() {
        return (ImageRedesignSize[]) f163015e.clone();
    }
}
