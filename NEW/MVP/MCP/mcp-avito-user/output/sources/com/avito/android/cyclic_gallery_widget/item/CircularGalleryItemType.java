package com.avito.android.cyclic_gallery_widget.item;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CircularGalleryItemType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/item/CircularGalleryItemType;", "", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CircularGalleryItemType {

    /* renamed from: b, reason: collision with root package name */
    public static final CircularGalleryItemType f132169b;

    /* renamed from: c, reason: collision with root package name */
    public static final CircularGalleryItemType f132170c;

    /* renamed from: d, reason: collision with root package name */
    public static final CircularGalleryItemType f132171d;

    /* renamed from: e, reason: collision with root package name */
    public static final CircularGalleryItemType f132172e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CircularGalleryItemType[] f132173f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f132174g;

    static {
        CircularGalleryItemType circularGalleryItemType = new CircularGalleryItemType("PICTURE", 0);
        f132169b = circularGalleryItemType;
        CircularGalleryItemType circularGalleryItemType2 = new CircularGalleryItemType("EXTENDED_PICTURE", 1);
        f132170c = circularGalleryItemType2;
        CircularGalleryItemType circularGalleryItemType3 = new CircularGalleryItemType("VIDEO", 2);
        f132171d = circularGalleryItemType3;
        CircularGalleryItemType circularGalleryItemType4 = new CircularGalleryItemType("EXTENDED_VIDEO", 3);
        f132172e = circularGalleryItemType4;
        CircularGalleryItemType[] circularGalleryItemTypeArr = {circularGalleryItemType, circularGalleryItemType2, circularGalleryItemType3, circularGalleryItemType4};
        f132173f = circularGalleryItemTypeArr;
        f132174g = c.a(circularGalleryItemTypeArr);
    }

    public CircularGalleryItemType() {
        throw null;
    }

    public static CircularGalleryItemType valueOf(String str) {
        return (CircularGalleryItemType) Enum.valueOf(CircularGalleryItemType.class, str);
    }

    public static CircularGalleryItemType[] values() {
        return (CircularGalleryItemType[]) f132173f.clone();
    }
}
