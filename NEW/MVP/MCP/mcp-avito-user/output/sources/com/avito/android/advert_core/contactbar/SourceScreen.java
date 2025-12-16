package com.avito.android.advert_core.contactbar;

import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertContactsPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/contactbar/SourceScreen;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SourceScreen {

    /* renamed from: c, reason: collision with root package name */
    public static final SourceScreen f83145c;

    /* renamed from: d, reason: collision with root package name */
    public static final SourceScreen f83146d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42830m
    public static final SourceScreen f83147e;

    /* renamed from: f, reason: collision with root package name */
    public static final SourceScreen f83148f;

    /* renamed from: g, reason: collision with root package name */
    public static final SourceScreen f83149g;

    /* renamed from: h, reason: collision with root package name */
    public static final SourceScreen f83150h;

    /* renamed from: i, reason: collision with root package name */
    public static final SourceScreen f83151i;

    /* renamed from: j, reason: collision with root package name */
    public static final SourceScreen f83152j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ SourceScreen[] f83153k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f83154l;

    /* renamed from: b, reason: collision with root package name */
    public final int f83155b;

    static {
        SourceScreen sourceScreen = new SourceScreen("ADVERT_DETAILS", 0, 0);
        f83145c = sourceScreen;
        SourceScreen sourceScreen2 = new SourceScreen("PHOTO_GALLERY", 1, 3);
        f83146d = sourceScreen2;
        SourceScreen sourceScreen3 = new SourceScreen("SAFE_SHOW_DIALOG", 2, 4);
        f83147e = sourceScreen3;
        SourceScreen sourceScreen4 = new SourceScreen("AVITO_BLACK", 3, 4);
        f83148f = sourceScreen4;
        SourceScreen sourceScreen5 = new SourceScreen("DISCOUNTS_DIALOG", 4, 5);
        f83149g = sourceScreen5;
        SourceScreen sourceScreen6 = new SourceScreen("AVITO_MALL", 5, 6);
        f83150h = sourceScreen6;
        SourceScreen sourceScreen7 = new SourceScreen("AVITO_FOR_BUSINESS", 6, 7);
        f83151i = sourceScreen7;
        SourceScreen sourceScreen8 = new SourceScreen("SERVICES_PORTFOLIO_GALLERY", 7, 20);
        f83152j = sourceScreen8;
        SourceScreen[] sourceScreenArr = {sourceScreen, sourceScreen2, sourceScreen3, sourceScreen4, sourceScreen5, sourceScreen6, sourceScreen7, sourceScreen8};
        f83153k = sourceScreenArr;
        f83154l = kotlin.enums.c.a(sourceScreenArr);
    }

    public SourceScreen(String str, int i12, int i13) {
        this.f83155b = i13;
    }

    public static SourceScreen valueOf(String str) {
        return (SourceScreen) Enum.valueOf(SourceScreen.class, str);
    }

    public static SourceScreen[] values() {
        return (SourceScreen[]) f83153k.clone();
    }
}
