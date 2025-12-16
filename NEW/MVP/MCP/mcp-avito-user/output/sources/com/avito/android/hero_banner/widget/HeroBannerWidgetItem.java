package com.avito.android.hero_banner.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import com.avito.android.serp.adapter.PersistableSerpItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HeroBannerWidgetItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hero_banner/widget/HeroBannerWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "a", "HeroBannerItemHeaderIcon", "HeroBannerItemTitle", "UdfToolbarAndStatusBarConfig", "_avito_bx-content_widget_hero-banner_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface HeroBannerWidgetItem extends PersistableSerpItem {

    /* compiled from: HeroBannerWidgetItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hero_banner/widget/HeroBannerWidgetItem$HeroBannerItemHeaderIcon;", "Landroid/os/Parcelable;", "_avito_bx-content_widget_hero-banner_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HeroBannerItemHeaderIcon implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<HeroBannerItemHeaderIcon> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f161872b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final UniversalColor f161873c;

        /* compiled from: HeroBannerWidgetItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HeroBannerItemHeaderIcon> {
            @Override // android.os.Parcelable.Creator
            public final HeroBannerItemHeaderIcon createFromParcel(Parcel parcel) {
                return new HeroBannerItemHeaderIcon(parcel.readString(), (UniversalColor) parcel.readParcelable(HeroBannerItemHeaderIcon.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final HeroBannerItemHeaderIcon[] newArray(int i12) {
                return new HeroBannerItemHeaderIcon[i12];
            }
        }

        public HeroBannerItemHeaderIcon(@Y61.l String str, @Y61.k UniversalColor universalColor) {
            this.f161872b = str;
            this.f161873c = universalColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroBannerItemHeaderIcon)) {
                return false;
            }
            HeroBannerItemHeaderIcon heroBannerItemHeaderIcon = (HeroBannerItemHeaderIcon) obj;
            return L.f(this.f161872b, heroBannerItemHeaderIcon.f161872b) && L.f(this.f161873c, heroBannerItemHeaderIcon.f161873c);
        }

        public final int hashCode() {
            String str = this.f161872b;
            return this.f161873c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HeroBannerItemHeaderIcon(style=");
            sb2.append(this.f161872b);
            sb2.append(", color=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f161873c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f161872b);
            parcel.writeParcelable(this.f161873c, i12);
        }
    }

    /* compiled from: HeroBannerWidgetItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hero_banner/widget/HeroBannerWidgetItem$HeroBannerItemTitle;", "Landroid/os/Parcelable;", "_avito_bx-content_widget_hero-banner_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HeroBannerItemTitle implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<HeroBannerItemTitle> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AttributedText f161874b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f161875c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final HeroBannerItemHeaderIcon f161876d;

        /* compiled from: HeroBannerWidgetItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HeroBannerItemTitle> {
            @Override // android.os.Parcelable.Creator
            public final HeroBannerItemTitle createFromParcel(Parcel parcel) {
                return new HeroBannerItemTitle((AttributedText) parcel.readParcelable(HeroBannerItemTitle.class.getClassLoader()), (DeepLink) parcel.readParcelable(HeroBannerItemTitle.class.getClassLoader()), parcel.readInt() == 0 ? null : HeroBannerItemHeaderIcon.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final HeroBannerItemTitle[] newArray(int i12) {
                return new HeroBannerItemTitle[i12];
            }
        }

        public HeroBannerItemTitle(@Y61.k AttributedText attributedText, @Y61.k DeepLink deepLink, @Y61.l HeroBannerItemHeaderIcon heroBannerItemHeaderIcon) {
            this.f161874b = attributedText;
            this.f161875c = deepLink;
            this.f161876d = heroBannerItemHeaderIcon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroBannerItemTitle)) {
                return false;
            }
            HeroBannerItemTitle heroBannerItemTitle = (HeroBannerItemTitle) obj;
            return L.f(this.f161874b, heroBannerItemTitle.f161874b) && L.f(this.f161875c, heroBannerItemTitle.f161875c) && L.f(this.f161876d, heroBannerItemTitle.f161876d);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f161875c, this.f161874b.hashCode() * 31, 31);
            HeroBannerItemHeaderIcon heroBannerItemHeaderIcon = this.f161876d;
            return iE2 + (heroBannerItemHeaderIcon == null ? 0 : heroBannerItemHeaderIcon.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "HeroBannerItemTitle(text=" + this.f161874b + ", deeplink=" + this.f161875c + ", headerIcon=" + this.f161876d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f161874b, i12);
            parcel.writeParcelable(this.f161875c, i12);
            HeroBannerItemHeaderIcon heroBannerItemHeaderIcon = this.f161876d;
            if (heroBannerItemHeaderIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                heroBannerItemHeaderIcon.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: HeroBannerWidgetItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hero_banner/widget/HeroBannerWidgetItem$UdfToolbarAndStatusBarConfig;", "Landroid/os/Parcelable;", "_avito_bx-content_widget_hero-banner_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UdfToolbarAndStatusBarConfig implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<UdfToolbarAndStatusBarConfig> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final UdfToolbarColors f161877b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final ThemeAppearance f161878c;

        /* compiled from: HeroBannerWidgetItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UdfToolbarAndStatusBarConfig> {
            @Override // android.os.Parcelable.Creator
            public final UdfToolbarAndStatusBarConfig createFromParcel(Parcel parcel) {
                return new UdfToolbarAndStatusBarConfig((UdfToolbarColors) parcel.readParcelable(UdfToolbarAndStatusBarConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : ThemeAppearance.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final UdfToolbarAndStatusBarConfig[] newArray(int i12) {
                return new UdfToolbarAndStatusBarConfig[i12];
            }
        }

        public UdfToolbarAndStatusBarConfig(@Y61.l UdfToolbarColors udfToolbarColors, @Y61.l ThemeAppearance themeAppearance) {
            this.f161877b = udfToolbarColors;
            this.f161878c = themeAppearance;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UdfToolbarAndStatusBarConfig)) {
                return false;
            }
            UdfToolbarAndStatusBarConfig udfToolbarAndStatusBarConfig = (UdfToolbarAndStatusBarConfig) obj;
            return L.f(this.f161877b, udfToolbarAndStatusBarConfig.f161877b) && this.f161878c == udfToolbarAndStatusBarConfig.f161878c;
        }

        public final int hashCode() {
            UdfToolbarColors udfToolbarColors = this.f161877b;
            int iHashCode = (udfToolbarColors == null ? 0 : udfToolbarColors.hashCode()) * 31;
            ThemeAppearance themeAppearance = this.f161878c;
            return iHashCode + (themeAppearance != null ? themeAppearance.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "UdfToolbarAndStatusBarConfig(udfToolbarColor=" + this.f161877b + ", themeAppearance=" + this.f161878c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f161877b, i12);
            ThemeAppearance themeAppearance = this.f161878c;
            if (themeAppearance == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(themeAppearance.name());
            }
        }
    }

    /* compiled from: HeroBannerWidgetItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hero_banner/widget/HeroBannerWidgetItem$a;", "", "<init>", "()V", "_avito_bx-content_widget_hero-banner_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: HeroBannerWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    @Y61.l
    UdfToolbarAndStatusBarConfig W3();

    @Y61.l
    UniversalImage getBackgroundImage();

    @Y61.l
    List<UniversalColor> getGradientColors();

    @Y61.l
    String getGradientToken();

    @Y61.l
    UniversalImage getImage();

    @Y61.k
    UniversalColor getShadowColor();

    @Y61.l
    AttributedText getSubtitle();

    @Y61.k
    HeroBannerItemTitle getTitle();
}
