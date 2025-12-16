package com.avito.android.rating_form.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Screen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/mvi/entity/Screen;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Screen {

    /* renamed from: b, reason: collision with root package name */
    public static final Screen f248760b;

    /* renamed from: c, reason: collision with root package name */
    public static final Screen f248761c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Screen[] f248762d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f248763e;

    static {
        Screen screen = new Screen("SELECT_ITEM", 0);
        f248760b = screen;
        Screen screen2 = new Screen("INFO", 1);
        f248761c = screen2;
        Screen[] screenArr = {screen, screen2};
        f248762d = screenArr;
        f248763e = c.a(screenArr);
    }

    public Screen() {
        throw null;
    }

    public static Screen valueOf(String str) {
        return (Screen) Enum.valueOf(Screen.class, str);
    }

    public static Screen[] values() {
        return (Screen[]) f248762d.clone();
    }
}
