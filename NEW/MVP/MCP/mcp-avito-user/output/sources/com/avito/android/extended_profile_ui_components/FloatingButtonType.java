package com.avito.android.extended_profile_ui_components;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FloatingButton.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/FloatingButtonType;", "", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FloatingButtonType {

    /* renamed from: b, reason: collision with root package name */
    public static final FloatingButtonType f153298b;

    /* renamed from: c, reason: collision with root package name */
    public static final FloatingButtonType f153299c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ FloatingButtonType[] f153300d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f153301e;

    static {
        FloatingButtonType floatingButtonType = new FloatingButtonType("PHONE", 0);
        f153298b = floatingButtonType;
        FloatingButtonType floatingButtonType2 = new FloatingButtonType("MESSAGE", 1);
        f153299c = floatingButtonType2;
        FloatingButtonType[] floatingButtonTypeArr = {floatingButtonType, floatingButtonType2};
        f153300d = floatingButtonTypeArr;
        f153301e = kotlin.enums.c.a(floatingButtonTypeArr);
    }

    public FloatingButtonType() {
        throw null;
    }

    public static FloatingButtonType valueOf(String str) {
        return (FloatingButtonType) Enum.valueOf(FloatingButtonType.class, str);
    }

    public static FloatingButtonType[] values() {
        return (FloatingButtonType[]) f153300d.clone();
    }
}
