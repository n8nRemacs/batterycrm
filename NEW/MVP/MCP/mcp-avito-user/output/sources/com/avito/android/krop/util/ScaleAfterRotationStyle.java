package com.avito.android.krop.util;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScaleAfterRotationStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/util/ScaleAfterRotationStyle;", "", "krop_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes14.dex */
public final class ScaleAfterRotationStyle {

    /* renamed from: b, reason: collision with root package name */
    public static final ScaleAfterRotationStyle f174839b;

    /* renamed from: c, reason: collision with root package name */
    public static final ScaleAfterRotationStyle f174840c;

    /* renamed from: d, reason: collision with root package name */
    public static final ScaleAfterRotationStyle f174841d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ScaleAfterRotationStyle[] f174842e;

    static {
        ScaleAfterRotationStyle scaleAfterRotationStyle = new ScaleAfterRotationStyle("NONE", 0);
        f174839b = scaleAfterRotationStyle;
        ScaleAfterRotationStyle scaleAfterRotationStyle2 = new ScaleAfterRotationStyle("INSTANT", 1);
        f174840c = scaleAfterRotationStyle2;
        ScaleAfterRotationStyle scaleAfterRotationStyle3 = new ScaleAfterRotationStyle("ANIMATE", 2);
        f174841d = scaleAfterRotationStyle3;
        f174842e = new ScaleAfterRotationStyle[]{scaleAfterRotationStyle, scaleAfterRotationStyle2, scaleAfterRotationStyle3};
    }

    public ScaleAfterRotationStyle() {
        throw null;
    }

    public static ScaleAfterRotationStyle valueOf(String str) {
        return (ScaleAfterRotationStyle) Enum.valueOf(ScaleAfterRotationStyle.class, str);
    }

    public static ScaleAfterRotationStyle[] values() {
        return (ScaleAfterRotationStyle[]) f174842e.clone();
    }
}
