package com.avito.android.photo_gallery.ui;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotoGallery.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/ui/PageIndicatorType;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PageIndicatorType {

    /* renamed from: b, reason: collision with root package name */
    public static final PageIndicatorType f217671b;

    /* renamed from: c, reason: collision with root package name */
    public static final PageIndicatorType f217672c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ PageIndicatorType[] f217673d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f217674e;

    static {
        PageIndicatorType pageIndicatorType = new PageIndicatorType("TEXT", 0);
        f217671b = pageIndicatorType;
        PageIndicatorType pageIndicatorType2 = new PageIndicatorType("DOTS", 1);
        f217672c = pageIndicatorType2;
        PageIndicatorType[] pageIndicatorTypeArr = {pageIndicatorType, pageIndicatorType2};
        f217673d = pageIndicatorTypeArr;
        f217674e = kotlin.enums.c.a(pageIndicatorTypeArr);
    }

    public PageIndicatorType() {
        throw null;
    }

    public static PageIndicatorType valueOf(String str) {
        return (PageIndicatorType) Enum.valueOf(PageIndicatorType.class, str);
    }

    public static PageIndicatorType[] values() {
        return (PageIndicatorType[]) f217673d.clone();
    }
}
