package com.avito.android.photo_picker;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FocusMode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/FocusMode;", "", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FocusMode {

    /* renamed from: b, reason: collision with root package name */
    public static final FocusMode f218751b;

    /* renamed from: c, reason: collision with root package name */
    public static final FocusMode f218752c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ FocusMode[] f218753d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f218754e;

    static {
        FocusMode focusMode = new FocusMode("AUTO_FOCUS", 0);
        f218751b = focusMode;
        FocusMode focusMode2 = new FocusMode("MANUAL_FOCUS", 1);
        f218752c = focusMode2;
        FocusMode[] focusModeArr = {focusMode, focusMode2};
        f218753d = focusModeArr;
        f218754e = kotlin.enums.c.a(focusModeArr);
    }

    public FocusMode() {
        throw null;
    }

    public static FocusMode valueOf(String str) {
        return (FocusMode) Enum.valueOf(FocusMode.class, str);
    }

    public static FocusMode[] values() {
        return (FocusMode[]) f218753d.clone();
    }
}
