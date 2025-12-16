package com.avito.android.advert_multi_items.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageDisplayMode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_multi_items/model/ImageDisplayMode;", "", "_avito_advert-multi-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ImageDisplayMode {

    /* renamed from: b, reason: collision with root package name */
    public static final ImageDisplayMode f85892b;

    /* renamed from: c, reason: collision with root package name */
    public static final ImageDisplayMode f85893c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ImageDisplayMode[] f85894d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f85895e;

    static {
        ImageDisplayMode imageDisplayMode = new ImageDisplayMode("Square", 0);
        f85892b = imageDisplayMode;
        ImageDisplayMode imageDisplayMode2 = new ImageDisplayMode("Portrait", 1);
        f85893c = imageDisplayMode2;
        ImageDisplayMode[] imageDisplayModeArr = {imageDisplayMode, imageDisplayMode2};
        f85894d = imageDisplayModeArr;
        f85895e = c.a(imageDisplayModeArr);
    }

    public ImageDisplayMode() {
        throw null;
    }

    public static ImageDisplayMode valueOf(String str) {
        return (ImageDisplayMode) Enum.valueOf(ImageDisplayMode.class, str);
    }

    public static ImageDisplayMode[] values() {
        return (ImageDisplayMode[]) f85894d.clone();
    }
}
