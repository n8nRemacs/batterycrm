package com.yandex.mobile.ads.nativeads.template.appearance;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.rj1;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance;
import j.N;
import j.k0;

/* loaded from: classes8.dex */
public final class NativeTemplateAppearance implements Parcelable {
    public static final Parcelable.Creator<NativeTemplateAppearance> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    @k0
    static final int f392802m = Color.parseColor("#7f7f7f");

    /* renamed from: n, reason: collision with root package name */
    static final int f392803n = Color.parseColor("#ffd200");

    /* renamed from: o, reason: collision with root package name */
    static final int f392804o = Color.parseColor("#ffd200");

    /* renamed from: p, reason: collision with root package name */
    static final int f392805p = Color.parseColor("#f4c900");

    /* renamed from: a, reason: collision with root package name */
    @N
    private final BannerAppearance f392806a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final TextAppearance f392807b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final TextAppearance f392808c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final TextAppearance f392809d;

    /* renamed from: e, reason: collision with root package name */
    @N
    private final TextAppearance f392810e;

    /* renamed from: f, reason: collision with root package name */
    @N
    private final TextAppearance f392811f;

    /* renamed from: g, reason: collision with root package name */
    @N
    private final TextAppearance f392812g;

    /* renamed from: h, reason: collision with root package name */
    @N
    private final TextAppearance f392813h;

    /* renamed from: i, reason: collision with root package name */
    @N
    private final ImageAppearance f392814i;

    /* renamed from: j, reason: collision with root package name */
    @N
    private final ImageAppearance f392815j;

    /* renamed from: k, reason: collision with root package name */
    @N
    private final ButtonAppearance f392816k;

    /* renamed from: l, reason: collision with root package name */
    @N
    private final RatingAppearance f392817l;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @N
        private BannerAppearance f392818a = b();

        /* renamed from: k, reason: collision with root package name */
        @N
        private ButtonAppearance f392828k = d();

        /* renamed from: i, reason: collision with root package name */
        @N
        private ImageAppearance f392826i = g();

        /* renamed from: j, reason: collision with root package name */
        @N
        private ImageAppearance f392827j = f();

        /* renamed from: l, reason: collision with root package name */
        @N
        private RatingAppearance f392829l = h();

        /* renamed from: b, reason: collision with root package name */
        @N
        private TextAppearance f392819b = a();

        /* renamed from: c, reason: collision with root package name */
        @N
        private TextAppearance f392820c = c();

        /* renamed from: d, reason: collision with root package name */
        @N
        private TextAppearance f392821d = e();

        /* renamed from: e, reason: collision with root package name */
        @N
        private TextAppearance f392822e = i();

        /* renamed from: f, reason: collision with root package name */
        @N
        private TextAppearance f392823f = j();

        /* renamed from: g, reason: collision with root package name */
        @N
        private TextAppearance f392824g = k();

        /* renamed from: h, reason: collision with root package name */
        @N
        private TextAppearance f392825h = l();

        @N
        public NativeTemplateAppearance build() {
            return new NativeTemplateAppearance(this, 0);
        }

        @N
        public Builder withAgeAppearance(@N TextAppearance textAppearance) {
            this.f392819b = com.yandex.mobile.ads.nativeads.template.appearance.a.a(this.f392819b, textAppearance);
            return this;
        }

        @N
        public Builder withBannerAppearance(@N BannerAppearance bannerAppearance) {
            BannerAppearance bannerAppearanceBuild = this.f392818a;
            if (bannerAppearance != null && !bannerAppearanceBuild.equals(bannerAppearance)) {
                int backgroundColor = bannerAppearance.getBackgroundColor();
                int borderColor = bannerAppearance.getBorderColor();
                float borderWidth = bannerAppearance.getBorderWidth();
                HorizontalOffset imageMargins = bannerAppearance.getImageMargins();
                BannerAppearance.Builder builder = new BannerAppearance.Builder();
                if (backgroundColor == 0) {
                    backgroundColor = bannerAppearanceBuild.getBackgroundColor();
                }
                BannerAppearance.Builder backgroundColor2 = builder.setBackgroundColor(backgroundColor);
                if (borderColor == 0) {
                    borderColor = bannerAppearanceBuild.getBorderColor();
                }
                BannerAppearance.Builder borderColor2 = backgroundColor2.setBorderColor(borderColor);
                if (borderWidth < 0.0f) {
                    borderWidth = bannerAppearanceBuild.getBorderWidth();
                }
                BannerAppearance.Builder borderWidth2 = borderColor2.setBorderWidth(borderWidth);
                HorizontalOffset contentPadding = bannerAppearanceBuild.getContentPadding();
                HorizontalOffset contentPadding2 = bannerAppearance.getContentPadding();
                if (contentPadding2 != null && !contentPadding.equals(contentPadding2)) {
                    contentPadding = new HorizontalOffset(contentPadding2.getLeft() >= 0.0f ? contentPadding2.getLeft() : 0.0f, contentPadding2.getRight() >= 0.0f ? contentPadding2.getRight() : 0.0f);
                }
                BannerAppearance.Builder contentPadding3 = borderWidth2.setContentPadding(contentPadding);
                if (imageMargins == null) {
                    imageMargins = bannerAppearanceBuild.getImageMargins();
                }
                bannerAppearanceBuild = contentPadding3.setImageMargins(imageMargins).build();
            }
            this.f392818a = bannerAppearanceBuild;
            return this;
        }

        @N
        public Builder withBodyAppearance(@N TextAppearance textAppearance) {
            this.f392820c = com.yandex.mobile.ads.nativeads.template.appearance.a.a(this.f392820c, textAppearance);
            return this;
        }

        @N
        public Builder withCallToActionAppearance(@N ButtonAppearance buttonAppearance) {
            ButtonAppearance buttonAppearanceBuild = this.f392828k;
            if (buttonAppearance != null && !buttonAppearanceBuild.equals(buttonAppearance)) {
                TextAppearance textAppearanceA = com.yandex.mobile.ads.nativeads.template.appearance.a.a(buttonAppearanceBuild.getTextAppearance(), buttonAppearance.getTextAppearance());
                int borderColor = buttonAppearance.getBorderColor();
                float borderWidth = buttonAppearance.getBorderWidth();
                int normalColor = buttonAppearance.getNormalColor();
                int pressedColor = buttonAppearance.getPressedColor();
                ButtonAppearance.Builder textAppearance = new ButtonAppearance.Builder().setTextAppearance(textAppearanceA);
                if (borderColor == 0) {
                    borderColor = buttonAppearanceBuild.getBorderColor();
                }
                ButtonAppearance.Builder borderColor2 = textAppearance.setBorderColor(borderColor);
                if (borderWidth < 0.0f) {
                    borderWidth = buttonAppearanceBuild.getBorderWidth();
                }
                ButtonAppearance.Builder borderWidth2 = borderColor2.setBorderWidth(borderWidth);
                if (normalColor == 0) {
                    normalColor = buttonAppearanceBuild.getNormalColor();
                }
                ButtonAppearance.Builder normalColor2 = borderWidth2.setNormalColor(normalColor);
                if (pressedColor == 0) {
                    pressedColor = buttonAppearanceBuild.getPressedColor();
                }
                buttonAppearanceBuild = normalColor2.setPressedColor(pressedColor).build();
            }
            this.f392828k = buttonAppearanceBuild;
            return this;
        }

        @N
        public Builder withDomainAppearance(@N TextAppearance textAppearance) {
            this.f392821d = com.yandex.mobile.ads.nativeads.template.appearance.a.a(this.f392821d, textAppearance);
            return this;
        }

        public Builder withFaviconAppearance(@N ImageAppearance imageAppearance) {
            ImageAppearance imageAppearanceBuild = this.f392827j;
            if (imageAppearance != null && !imageAppearanceBuild.equals(imageAppearance)) {
                SizeConstraint widthConstraint = imageAppearance.getWidthConstraint();
                ImageAppearance.Builder builder = new ImageAppearance.Builder();
                if (widthConstraint == null) {
                    widthConstraint = imageAppearanceBuild.getWidthConstraint();
                }
                imageAppearanceBuild = builder.setWidthConstraint(widthConstraint).build();
            }
            this.f392827j = imageAppearanceBuild;
            return this;
        }

        @N
        public Builder withImageAppearance(@N ImageAppearance imageAppearance) {
            ImageAppearance imageAppearanceBuild = this.f392826i;
            if (imageAppearance != null && !imageAppearanceBuild.equals(imageAppearance)) {
                SizeConstraint widthConstraint = imageAppearance.getWidthConstraint();
                ImageAppearance.Builder builder = new ImageAppearance.Builder();
                if (widthConstraint == null) {
                    widthConstraint = imageAppearanceBuild.getWidthConstraint();
                }
                imageAppearanceBuild = builder.setWidthConstraint(widthConstraint).build();
            }
            this.f392826i = imageAppearanceBuild;
            return this;
        }

        @N
        public Builder withRatingAppearance(@N RatingAppearance ratingAppearance) {
            RatingAppearance ratingAppearanceBuild = this.f392829l;
            if (ratingAppearance != null && !ratingAppearanceBuild.equals(ratingAppearance)) {
                int backgroundStarColor = ratingAppearance.getBackgroundStarColor();
                int progressStarColor = ratingAppearance.getProgressStarColor();
                RatingAppearance.Builder builder = new RatingAppearance.Builder();
                if (backgroundStarColor == 0) {
                    backgroundStarColor = ratingAppearanceBuild.getBackgroundStarColor();
                }
                RatingAppearance.Builder backgroundStarColor2 = builder.setBackgroundStarColor(backgroundStarColor);
                if (progressStarColor == 0) {
                    progressStarColor = ratingAppearanceBuild.getProgressStarColor();
                }
                ratingAppearanceBuild = backgroundStarColor2.setProgressStarColor(progressStarColor).build();
            }
            this.f392829l = ratingAppearanceBuild;
            return this;
        }

        @N
        public Builder withReviewCountAppearance(@N TextAppearance textAppearance) {
            this.f392822e = com.yandex.mobile.ads.nativeads.template.appearance.a.a(this.f392822e, textAppearance);
            return this;
        }

        @N
        public Builder withSponsoredAppearance(@N TextAppearance textAppearance) {
            this.f392823f = com.yandex.mobile.ads.nativeads.template.appearance.a.a(this.f392823f, textAppearance);
            return this;
        }

        @N
        public Builder withTitleAppearance(@N TextAppearance textAppearance) {
            this.f392824g = com.yandex.mobile.ads.nativeads.template.appearance.a.a(this.f392824g, textAppearance);
            return this;
        }

        @N
        public Builder withWarningAppearance(@N TextAppearance textAppearance) {
            this.f392825h = com.yandex.mobile.ads.nativeads.template.appearance.a.a(this.f392825h, textAppearance);
            return this;
        }

        @N
        private static TextAppearance a() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f392802m).setTextSize(15.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        @N
        private static BannerAppearance b() {
            return new BannerAppearance.Builder().setBackgroundColor(-1).setBorderColor(rj1.a(-16777216, 90.0f)).setBorderWidth(1.0f).setContentPadding(new HorizontalOffset(10.0f, 10.0f)).setImageMargins(new HorizontalOffset(0.0f, 10.0f)).build();
        }

        @N
        private static TextAppearance c() {
            return new TextAppearance.Builder().setTextColor(-16777216).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        @N
        private static ButtonAppearance d() {
            return new ButtonAppearance.Builder().setBorderColor(NativeTemplateAppearance.f392803n).setBorderWidth(1.0f).setNormalColor(-1).setPressedColor(NativeTemplateAppearance.f392804o).setTextAppearance(new TextAppearance.Builder().setTextColor(-16777216).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build()).build();
        }

        @N
        private static TextAppearance e() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f392802m).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        @N
        private static ImageAppearance f() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.FIXED, 16.0f)).build();
        }

        @N
        private static ImageAppearance g() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.PREFERRED_RATIO, 0.3f)).build();
        }

        @N
        private static RatingAppearance h() {
            return new RatingAppearance.Builder().setBackgroundStarColor(-3355444).setProgressStarColor(NativeTemplateAppearance.f392805p).build();
        }

        @N
        private static TextAppearance i() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f392802m).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        @N
        private static TextAppearance j() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f392802m).setTextSize(11.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        @N
        private static TextAppearance k() {
            return new TextAppearance.Builder().setTextColor(-16777216).setTextSize(15.0f).setFontFamilyName(null).setFontStyle(1).build();
        }

        @N
        private static TextAppearance l() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f392802m).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }
    }

    public class a implements Parcelable.Creator<NativeTemplateAppearance> {
        @Override // android.os.Parcelable.Creator
        public final NativeTemplateAppearance createFromParcel(Parcel parcel) {
            return new NativeTemplateAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final NativeTemplateAppearance[] newArray(int i12) {
            return new NativeTemplateAppearance[i12];
        }
    }

    public /* synthetic */ NativeTemplateAppearance(Builder builder, int i12) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NativeTemplateAppearance.class != obj.getClass()) {
            return false;
        }
        NativeTemplateAppearance nativeTemplateAppearance = (NativeTemplateAppearance) obj;
        BannerAppearance bannerAppearance = this.f392806a;
        if (bannerAppearance == null ? nativeTemplateAppearance.f392806a != null : !bannerAppearance.equals(nativeTemplateAppearance.f392806a)) {
            return false;
        }
        TextAppearance textAppearance = this.f392807b;
        if (textAppearance == null ? nativeTemplateAppearance.f392807b != null : !textAppearance.equals(nativeTemplateAppearance.f392807b)) {
            return false;
        }
        TextAppearance textAppearance2 = this.f392808c;
        if (textAppearance2 == null ? nativeTemplateAppearance.f392808c != null : !textAppearance2.equals(nativeTemplateAppearance.f392808c)) {
            return false;
        }
        TextAppearance textAppearance3 = this.f392809d;
        if (textAppearance3 == null ? nativeTemplateAppearance.f392809d != null : !textAppearance3.equals(nativeTemplateAppearance.f392809d)) {
            return false;
        }
        TextAppearance textAppearance4 = this.f392810e;
        if (textAppearance4 == null ? nativeTemplateAppearance.f392810e != null : !textAppearance4.equals(nativeTemplateAppearance.f392810e)) {
            return false;
        }
        TextAppearance textAppearance5 = this.f392811f;
        if (textAppearance5 == null ? nativeTemplateAppearance.f392811f != null : !textAppearance5.equals(nativeTemplateAppearance.f392811f)) {
            return false;
        }
        TextAppearance textAppearance6 = this.f392812g;
        if (textAppearance6 == null ? nativeTemplateAppearance.f392812g != null : !textAppearance6.equals(nativeTemplateAppearance.f392812g)) {
            return false;
        }
        TextAppearance textAppearance7 = this.f392813h;
        if (textAppearance7 == null ? nativeTemplateAppearance.f392813h != null : !textAppearance7.equals(nativeTemplateAppearance.f392813h)) {
            return false;
        }
        ImageAppearance imageAppearance = this.f392815j;
        if (imageAppearance == null ? nativeTemplateAppearance.f392815j != null : !imageAppearance.equals(nativeTemplateAppearance.f392815j)) {
            return false;
        }
        ImageAppearance imageAppearance2 = this.f392814i;
        if (imageAppearance2 == null ? nativeTemplateAppearance.f392814i != null : !imageAppearance2.equals(nativeTemplateAppearance.f392814i)) {
            return false;
        }
        ButtonAppearance buttonAppearance = this.f392816k;
        if (buttonAppearance == null ? nativeTemplateAppearance.f392816k != null : !buttonAppearance.equals(nativeTemplateAppearance.f392816k)) {
            return false;
        }
        RatingAppearance ratingAppearance = this.f392817l;
        if (ratingAppearance != null) {
            if (ratingAppearance.equals(nativeTemplateAppearance.f392817l)) {
                return true;
            }
        } else if (nativeTemplateAppearance.f392817l == null) {
            return true;
        }
        return false;
    }

    @N
    public TextAppearance getAgeAppearance() {
        return this.f392807b;
    }

    @N
    public BannerAppearance getBannerAppearance() {
        return this.f392806a;
    }

    @N
    public TextAppearance getBodyAppearance() {
        return this.f392808c;
    }

    @N
    public ButtonAppearance getCallToActionAppearance() {
        return this.f392816k;
    }

    @N
    public TextAppearance getDomainAppearance() {
        return this.f392809d;
    }

    @N
    public ImageAppearance getFaviconAppearance() {
        return this.f392814i;
    }

    @N
    public ImageAppearance getImageAppearance() {
        return this.f392815j;
    }

    @N
    public RatingAppearance getRatingAppearance() {
        return this.f392817l;
    }

    @N
    public TextAppearance getReviewCountAppearance() {
        return this.f392810e;
    }

    @N
    public TextAppearance getSponsoredAppearance() {
        return this.f392811f;
    }

    @N
    public TextAppearance getTitleAppearance() {
        return this.f392812g;
    }

    @N
    public TextAppearance getWarningAppearance() {
        return this.f392813h;
    }

    public int hashCode() {
        BannerAppearance bannerAppearance = this.f392806a;
        int iHashCode = (bannerAppearance != null ? bannerAppearance.hashCode() : 0) * 31;
        TextAppearance textAppearance = this.f392807b;
        int iHashCode2 = (iHashCode + (textAppearance != null ? textAppearance.hashCode() : 0)) * 31;
        TextAppearance textAppearance2 = this.f392808c;
        int iHashCode3 = (iHashCode2 + (textAppearance2 != null ? textAppearance2.hashCode() : 0)) * 31;
        TextAppearance textAppearance3 = this.f392809d;
        int iHashCode4 = (iHashCode3 + (textAppearance3 != null ? textAppearance3.hashCode() : 0)) * 31;
        TextAppearance textAppearance4 = this.f392810e;
        int iHashCode5 = (iHashCode4 + (textAppearance4 != null ? textAppearance4.hashCode() : 0)) * 31;
        TextAppearance textAppearance5 = this.f392811f;
        int iHashCode6 = (iHashCode5 + (textAppearance5 != null ? textAppearance5.hashCode() : 0)) * 31;
        TextAppearance textAppearance6 = this.f392812g;
        int iHashCode7 = (iHashCode6 + (textAppearance6 != null ? textAppearance6.hashCode() : 0)) * 31;
        TextAppearance textAppearance7 = this.f392813h;
        int iHashCode8 = (iHashCode7 + (textAppearance7 != null ? textAppearance7.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance = this.f392815j;
        int iHashCode9 = (iHashCode8 + (imageAppearance != null ? imageAppearance.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance2 = this.f392814i;
        int iHashCode10 = (iHashCode9 + (imageAppearance2 != null ? imageAppearance2.hashCode() : 0)) * 31;
        ButtonAppearance buttonAppearance = this.f392816k;
        int iHashCode11 = (iHashCode10 + (buttonAppearance != null ? buttonAppearance.hashCode() : 0)) * 31;
        RatingAppearance ratingAppearance = this.f392817l;
        return iHashCode11 + (ratingAppearance != null ? ratingAppearance.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeParcelable(this.f392806a, i12);
        parcel.writeParcelable(this.f392807b, i12);
        parcel.writeParcelable(this.f392808c, i12);
        parcel.writeParcelable(this.f392809d, i12);
        parcel.writeParcelable(this.f392810e, i12);
        parcel.writeParcelable(this.f392811f, i12);
        parcel.writeParcelable(this.f392812g, i12);
        parcel.writeParcelable(this.f392813h, i12);
        parcel.writeParcelable(this.f392814i, i12);
        parcel.writeParcelable(this.f392815j, i12);
        parcel.writeParcelable(this.f392816k, i12);
        parcel.writeParcelable(this.f392817l, i12);
    }

    private NativeTemplateAppearance(@N Builder builder) {
        this.f392806a = builder.f392818a;
        this.f392807b = builder.f392819b;
        this.f392808c = builder.f392820c;
        this.f392809d = builder.f392821d;
        this.f392810e = builder.f392822e;
        this.f392811f = builder.f392823f;
        this.f392812g = builder.f392824g;
        this.f392813h = builder.f392825h;
        this.f392815j = builder.f392826i;
        this.f392814i = builder.f392827j;
        this.f392816k = builder.f392828k;
        this.f392817l = builder.f392829l;
    }

    public NativeTemplateAppearance(Parcel parcel) {
        this.f392806a = (BannerAppearance) parcel.readParcelable(BannerAppearance.class.getClassLoader());
        this.f392807b = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f392808c = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f392809d = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f392810e = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f392811f = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f392812g = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f392813h = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f392814i = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f392815j = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f392816k = (ButtonAppearance) parcel.readParcelable(ButtonAppearance.class.getClassLoader());
        this.f392817l = (RatingAppearance) parcel.readParcelable(RatingAppearance.class.getClassLoader());
    }
}
