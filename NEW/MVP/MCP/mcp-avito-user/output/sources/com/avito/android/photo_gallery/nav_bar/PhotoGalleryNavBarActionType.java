package com.avito.android.photo_gallery.nav_bar;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotoGalleryNavBar.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarActionType;", "", "_avito_photo-gallery_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoGalleryNavBarActionType {

    /* renamed from: b, reason: collision with root package name */
    public static final PhotoGalleryNavBarActionType f217475b;

    /* renamed from: c, reason: collision with root package name */
    public static final PhotoGalleryNavBarActionType f217476c;

    /* renamed from: d, reason: collision with root package name */
    public static final PhotoGalleryNavBarActionType f217477d;

    /* renamed from: e, reason: collision with root package name */
    public static final PhotoGalleryNavBarActionType f217478e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ PhotoGalleryNavBarActionType[] f217479f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f217480g;

    static {
        PhotoGalleryNavBarActionType photoGalleryNavBarActionType = new PhotoGalleryNavBarActionType("FAVORITE", 0);
        f217475b = photoGalleryNavBarActionType;
        PhotoGalleryNavBarActionType photoGalleryNavBarActionType2 = new PhotoGalleryNavBarActionType("SHARE", 1);
        f217476c = photoGalleryNavBarActionType2;
        PhotoGalleryNavBarActionType photoGalleryNavBarActionType3 = new PhotoGalleryNavBarActionType("COMPARE", 2);
        f217477d = photoGalleryNavBarActionType3;
        PhotoGalleryNavBarActionType photoGalleryNavBarActionType4 = new PhotoGalleryNavBarActionType("OTHER", 3);
        f217478e = photoGalleryNavBarActionType4;
        PhotoGalleryNavBarActionType[] photoGalleryNavBarActionTypeArr = {photoGalleryNavBarActionType, photoGalleryNavBarActionType2, photoGalleryNavBarActionType3, photoGalleryNavBarActionType4};
        f217479f = photoGalleryNavBarActionTypeArr;
        f217480g = kotlin.enums.c.a(photoGalleryNavBarActionTypeArr);
    }

    public PhotoGalleryNavBarActionType() {
        throw null;
    }

    public static PhotoGalleryNavBarActionType valueOf(String str) {
        return (PhotoGalleryNavBarActionType) Enum.valueOf(PhotoGalleryNavBarActionType.class, str);
    }

    public static PhotoGalleryNavBarActionType[] values() {
        return (PhotoGalleryNavBarActionType[]) f217479f.clone();
    }
}
