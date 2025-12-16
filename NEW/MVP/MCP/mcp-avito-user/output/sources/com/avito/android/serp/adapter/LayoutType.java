package com.avito.android.serp.adapter;

import com.avito.android.remote.model.SerpDisplayType;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LayoutType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/LayoutType;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LayoutType {

    /* renamed from: e, reason: collision with root package name */
    public static final LayoutType f268511e;

    /* renamed from: f, reason: collision with root package name */
    public static final LayoutType f268512f;

    /* renamed from: g, reason: collision with root package name */
    public static final LayoutType f268513g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ LayoutType[] f268514h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f268515i;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f268516b;

    /* renamed from: c, reason: collision with root package name */
    public final int f268517c;

    /* renamed from: d, reason: collision with root package name */
    public final int f268518d;

    /* compiled from: LayoutType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SerpViewType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SerpViewType serpViewType = SerpViewType.f268582b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SerpViewType serpViewType2 = SerpViewType.f268582b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SerpViewType serpViewType3 = SerpViewType.f268582b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[SerpDisplayType.values().length];
            try {
                iArr2[SerpDisplayType.Grid.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SerpDisplayType.List.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SerpDisplayType.Rich.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SerpDisplayType.MiniRich.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SerpDisplayType.Vacancy.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[SerpDisplayType.Service.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[SerpDisplayType.f253662Cv.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[SerpDisplayType.AvitoBlack.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[SerpDisplayType.AvitoMall.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[SerpDisplayType.AvitoMallTall.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[SerpDisplayType.AvitoSales.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[SerpDisplayType.HouseCard.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[SerpDisplayType.CarouselVacancy.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[SerpDisplayType.AvitoPromotion.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[SerpDisplayType.ItemsCarouselWidgetGridXL.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[SerpDisplayType.CarouselGig.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[SerpDisplayType.GigShift.ordinal()] = 17;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[SerpDisplayType.ServiceTrustGrid.ordinal()] = 18;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        LayoutType layoutType = new LayoutType(0, "NARROW", "narrow", 1, 2, 1);
        f268511e = layoutType;
        LayoutType layoutType2 = new LayoutType(1, "MIDDLE", "mid", 2, 3, 2);
        f268512f = layoutType2;
        LayoutType layoutType3 = new LayoutType(2, "WIDE", "wide", 2, 5, 3);
        f268513g = layoutType3;
        LayoutType[] layoutTypeArr = {layoutType, layoutType2, layoutType3};
        f268514h = layoutTypeArr;
        f268515i = kotlin.enums.c.a(layoutTypeArr);
    }

    public LayoutType(int i12, String str, String str2, int i13, int i14, int i15) {
        this.f268516b = str2;
        this.f268517c = i15;
        this.f268518d = b(i13, b(i14, i15));
    }

    public static int b(int i12, int i13) {
        if (i12 <= 0 || i13 <= 0) {
            throw new IllegalArgumentException("first and second arguments must be greater than zero");
        }
        int i14 = i12 * i13;
        if (i12 <= 0 || i13 <= 0) {
            throw new IllegalArgumentException("first and second arguments must be greater than zero");
        }
        while (true) {
            int i15 = i13;
            int i16 = i12;
            i12 = i15;
            if (i12 <= 0) {
                return i14 / i16;
            }
            i13 = i16 % i12;
        }
    }

    public static LayoutType valueOf(String str) {
        return (LayoutType) Enum.valueOf(LayoutType.class, str);
    }

    public static LayoutType[] values() {
        return (LayoutType[]) f268514h.clone();
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF268516b() {
        return this.f268516b;
    }
}
