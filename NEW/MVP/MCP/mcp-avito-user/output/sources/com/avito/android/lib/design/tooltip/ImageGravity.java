package com.avito.android.lib.design.tooltip;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TooltipContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tooltip/ImageGravity;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImageGravity {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ImageGravity[] f181186b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f181187c;

    static {
        ImageGravity[] imageGravityArr = {new ImageGravity("TOP", 0), new ImageGravity("CENTER", 1), new ImageGravity("BOTTOM", 2)};
        f181186b = imageGravityArr;
        f181187c = kotlin.enums.c.a(imageGravityArr);
    }

    public ImageGravity() {
        throw null;
    }

    public static ImageGravity valueOf(String str) {
        return (ImageGravity) Enum.valueOf(ImageGravity.class, str);
    }

    public static ImageGravity[] values() {
        return (ImageGravity[]) f181186b.clone();
    }
}
