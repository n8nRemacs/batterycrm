package com.avito.android.advert_core.ux_feedback.gallery;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertDetailsGalleryCampaign.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/ux_feedback/gallery/GalleryAction;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GalleryAction {

    /* renamed from: c, reason: collision with root package name */
    public static final GalleryAction f84404c;

    /* renamed from: d, reason: collision with root package name */
    public static final GalleryAction f84405d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ GalleryAction[] f84406e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f84407f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f84408b;

    static {
        GalleryAction galleryAction = new GalleryAction("SWIPE", 0, "swipe");
        f84404c = galleryAction;
        GalleryAction galleryAction2 = new GalleryAction("CLICK", 1, "click");
        f84405d = galleryAction2;
        GalleryAction[] galleryActionArr = {galleryAction, galleryAction2};
        f84406e = galleryActionArr;
        f84407f = c.a(galleryActionArr);
    }

    public GalleryAction(String str, int i12, String str2) {
        this.f84408b = str2;
    }

    public static GalleryAction valueOf(String str) {
        return (GalleryAction) Enum.valueOf(GalleryAction.class, str);
    }

    public static GalleryAction[] values() {
        return (GalleryAction[]) f84406e.clone();
    }
}
