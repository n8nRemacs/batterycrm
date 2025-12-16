package com.avito.android.adaptive.image;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageContentMode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adaptive/image/ImageContentMode;", "", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ImageContentMode {

    /* renamed from: b, reason: collision with root package name */
    public static final ImageContentMode f68474b;

    /* renamed from: c, reason: collision with root package name */
    public static final ImageContentMode f68475c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ImageContentMode[] f68476d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f68477e;

    static {
        ImageContentMode imageContentMode = new ImageContentMode("FILL", 0);
        f68474b = imageContentMode;
        ImageContentMode imageContentMode2 = new ImageContentMode("FIT", 1);
        f68475c = imageContentMode2;
        ImageContentMode[] imageContentModeArr = {imageContentMode, imageContentMode2};
        f68476d = imageContentModeArr;
        f68477e = kotlin.enums.c.a(imageContentModeArr);
    }

    public ImageContentMode() {
        throw null;
    }

    public static ImageContentMode valueOf(String str) {
        return (ImageContentMode) Enum.valueOf(ImageContentMode.class, str);
    }

    public static ImageContentMode[] values() {
        return (ImageContentMode[]) f68476d.clone();
    }
}
