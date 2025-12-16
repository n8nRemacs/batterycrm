package com.avito.android.beduin.common.container.banner_gallery;

import com.avito.android.R;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinBannerGalleryContainerModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerPaginatorStyle;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL_BLUE", "FLOATING", "NORMAL_WHITE", "NORMAL_BLACK", "NORMAL_WHITE_RE23", "NORMAL_BLACK_RE23", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinBannerGalleryContainerPaginatorStyle {

    @c("floatingBlue")
    public static final BeduinBannerGalleryContainerPaginatorStyle FLOATING;

    @c("normalBlack")
    public static final BeduinBannerGalleryContainerPaginatorStyle NORMAL_BLACK;

    @c("normalBlackRe23")
    public static final BeduinBannerGalleryContainerPaginatorStyle NORMAL_BLACK_RE23;

    @c("normalBlue")
    public static final BeduinBannerGalleryContainerPaginatorStyle NORMAL_BLUE;

    @c("normalWhite")
    public static final BeduinBannerGalleryContainerPaginatorStyle NORMAL_WHITE;

    @c("normalWhiteRe23")
    public static final BeduinBannerGalleryContainerPaginatorStyle NORMAL_WHITE_RE23;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ BeduinBannerGalleryContainerPaginatorStyle[] f102926b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102927c;

    /* compiled from: BeduinBannerGalleryContainerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102928a;

        static {
            int[] iArr = new int[BeduinBannerGalleryContainerPaginatorStyle.values().length];
            try {
                iArr[BeduinBannerGalleryContainerPaginatorStyle.NORMAL_BLUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinBannerGalleryContainerPaginatorStyle.NORMAL_WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinBannerGalleryContainerPaginatorStyle.FLOATING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeduinBannerGalleryContainerPaginatorStyle.NORMAL_BLACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BeduinBannerGalleryContainerPaginatorStyle.NORMAL_BLACK_RE23.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BeduinBannerGalleryContainerPaginatorStyle.NORMAL_WHITE_RE23.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f102928a = iArr;
        }
    }

    static {
        BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle = new BeduinBannerGalleryContainerPaginatorStyle("NORMAL_BLUE", 0);
        NORMAL_BLUE = beduinBannerGalleryContainerPaginatorStyle;
        BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle2 = new BeduinBannerGalleryContainerPaginatorStyle("FLOATING", 1);
        FLOATING = beduinBannerGalleryContainerPaginatorStyle2;
        BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle3 = new BeduinBannerGalleryContainerPaginatorStyle("NORMAL_WHITE", 2);
        NORMAL_WHITE = beduinBannerGalleryContainerPaginatorStyle3;
        BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle4 = new BeduinBannerGalleryContainerPaginatorStyle("NORMAL_BLACK", 3);
        NORMAL_BLACK = beduinBannerGalleryContainerPaginatorStyle4;
        BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle5 = new BeduinBannerGalleryContainerPaginatorStyle("NORMAL_WHITE_RE23", 4);
        NORMAL_WHITE_RE23 = beduinBannerGalleryContainerPaginatorStyle5;
        BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle6 = new BeduinBannerGalleryContainerPaginatorStyle("NORMAL_BLACK_RE23", 5);
        NORMAL_BLACK_RE23 = beduinBannerGalleryContainerPaginatorStyle6;
        BeduinBannerGalleryContainerPaginatorStyle[] beduinBannerGalleryContainerPaginatorStyleArr = {beduinBannerGalleryContainerPaginatorStyle, beduinBannerGalleryContainerPaginatorStyle2, beduinBannerGalleryContainerPaginatorStyle3, beduinBannerGalleryContainerPaginatorStyle4, beduinBannerGalleryContainerPaginatorStyle5, beduinBannerGalleryContainerPaginatorStyle6};
        f102926b = beduinBannerGalleryContainerPaginatorStyleArr;
        f102927c = kotlin.enums.c.a(beduinBannerGalleryContainerPaginatorStyleArr);
    }

    private BeduinBannerGalleryContainerPaginatorStyle(String str, int i12) {
    }

    public static BeduinBannerGalleryContainerPaginatorStyle valueOf(String str) {
        return (BeduinBannerGalleryContainerPaginatorStyle) Enum.valueOf(BeduinBannerGalleryContainerPaginatorStyle.class, str);
    }

    public static BeduinBannerGalleryContainerPaginatorStyle[] values() {
        return (BeduinBannerGalleryContainerPaginatorStyle[]) f102926b.clone();
    }

    public final int a() {
        switch (a.f102928a[ordinal()]) {
            case 1:
                return R.style.HorizontalSliderPageIndicatorNormalBlue;
            case 2:
                return R.style.HorizontalSliderPageIndicatorNormalWhite;
            case 3:
                return R.style.HorizontalSliderPageIndicatorFloatingBlue;
            case 4:
                return R.style.HorizontalSliderPageIndicatorNormalBlack;
            case 5:
                return R.style.HorizontalSliderPageIndicatorNormalBlackRe23;
            case 6:
                return R.style.HorizontalSliderPageIndicatorNormalWhiteRe23;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
