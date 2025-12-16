package com.avito.android.personal_filters;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PersonalFiltersAnalytics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_filters/ButtonType;", "", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ButtonType {

    /* renamed from: c, reason: collision with root package name */
    public static final ButtonType f215697c;

    /* renamed from: d, reason: collision with root package name */
    public static final ButtonType f215698d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ButtonType[] f215699e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f215700f;

    /* renamed from: b, reason: collision with root package name */
    public final int f215701b;

    static {
        ButtonType buttonType = new ButtonType("KEEP", 0, 0);
        f215697c = buttonType;
        ButtonType buttonType2 = new ButtonType("UPDATE", 1, 1);
        f215698d = buttonType2;
        ButtonType[] buttonTypeArr = {buttonType, buttonType2};
        f215699e = buttonTypeArr;
        f215700f = c.a(buttonTypeArr);
    }

    public ButtonType(String str, int i12, int i13) {
        this.f215701b = i13;
    }

    public static ButtonType valueOf(String str) {
        return (ButtonType) Enum.valueOf(ButtonType.class, str);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) f215699e.clone();
    }
}
