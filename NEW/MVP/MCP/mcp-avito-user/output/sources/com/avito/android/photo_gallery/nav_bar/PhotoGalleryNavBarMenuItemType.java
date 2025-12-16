package com.avito.android.photo_gallery.nav_bar;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotoGalleryNavBarMenuItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarMenuItemType;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoGalleryNavBarMenuItemType {

    /* renamed from: b, reason: collision with root package name */
    public static final PhotoGalleryNavBarMenuItemType f217499b;

    /* renamed from: c, reason: collision with root package name */
    public static final PhotoGalleryNavBarMenuItemType f217500c;

    /* renamed from: d, reason: collision with root package name */
    public static final PhotoGalleryNavBarMenuItemType f217501d;

    /* renamed from: e, reason: collision with root package name */
    public static final PhotoGalleryNavBarMenuItemType f217502e;

    /* renamed from: f, reason: collision with root package name */
    public static final PhotoGalleryNavBarMenuItemType f217503f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ PhotoGalleryNavBarMenuItemType[] f217504g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f217505h;

    static {
        PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType = new PhotoGalleryNavBarMenuItemType("FAVORITE", 0);
        f217499b = photoGalleryNavBarMenuItemType;
        PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType2 = new PhotoGalleryNavBarMenuItemType("SHARE", 1);
        f217500c = photoGalleryNavBarMenuItemType2;
        PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType3 = new PhotoGalleryNavBarMenuItemType("COMPARE", 2);
        f217501d = photoGalleryNavBarMenuItemType3;
        PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType4 = new PhotoGalleryNavBarMenuItemType("MORE_DROPDOWN", 3);
        f217502e = photoGalleryNavBarMenuItemType4;
        PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType5 = new PhotoGalleryNavBarMenuItemType("OTHER", 4);
        f217503f = photoGalleryNavBarMenuItemType5;
        PhotoGalleryNavBarMenuItemType[] photoGalleryNavBarMenuItemTypeArr = {photoGalleryNavBarMenuItemType, photoGalleryNavBarMenuItemType2, photoGalleryNavBarMenuItemType3, photoGalleryNavBarMenuItemType4, photoGalleryNavBarMenuItemType5};
        f217504g = photoGalleryNavBarMenuItemTypeArr;
        f217505h = kotlin.enums.c.a(photoGalleryNavBarMenuItemTypeArr);
    }

    public PhotoGalleryNavBarMenuItemType() {
        throw null;
    }

    public static PhotoGalleryNavBarMenuItemType valueOf(String str) {
        return (PhotoGalleryNavBarMenuItemType) Enum.valueOf(PhotoGalleryNavBarMenuItemType.class, str);
    }

    public static PhotoGalleryNavBarMenuItemType[] values() {
        return (PhotoGalleryNavBarMenuItemType[]) f217504g.clone();
    }
}
