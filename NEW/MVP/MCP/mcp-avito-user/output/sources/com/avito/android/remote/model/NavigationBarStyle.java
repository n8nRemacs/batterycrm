package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19824b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.FontStyleKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NavigationBarStyle.kt */
@d
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0004CDEFBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!Jj\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010!R\u0011\u0010B\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bA\u0010\u0013¨\u0006G"}, d2 = {"Lcom/avito/android/remote/model/NavigationBarStyle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "elementsColor", "cartPointColor", "Lcom/avito/android/remote/model/NavigationBarStyle$ThemeAppearance;", "_themeAppearance", "Lcom/avito/android/remote/model/NavigationBarStyle$SearchBarStyle;", "searchBarStyle", "", "navigationIcon", "Lcom/avito/android/remote/model/NavigationBarStyle$NavigationIconOnboarding;", "navigationIconOnboarding", "Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType;", "displayType", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/NavigationBarStyle$ThemeAppearance;Lcom/avito/android/remote/model/NavigationBarStyle$SearchBarStyle;Ljava/lang/String;Lcom/avito/android/remote/model/NavigationBarStyle$NavigationIconOnboarding;Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType;)V", "component4", "()Lcom/avito/android/remote/model/NavigationBarStyle$ThemeAppearance;", "prepareForNextScreen", "()Lcom/avito/android/remote/model/NavigationBarStyle;", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "component3", "component5", "()Lcom/avito/android/remote/model/NavigationBarStyle$SearchBarStyle;", "component6", "()Ljava/lang/String;", "component7", "()Lcom/avito/android/remote/model/NavigationBarStyle$NavigationIconOnboarding;", "component8", "()Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType;", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/NavigationBarStyle$ThemeAppearance;Lcom/avito/android/remote/model/NavigationBarStyle$SearchBarStyle;Ljava/lang/String;Lcom/avito/android/remote/model/NavigationBarStyle$NavigationIconOnboarding;Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType;)Lcom/avito/android/remote/model/NavigationBarStyle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getElementsColor", "getCartPointColor", "Lcom/avito/android/remote/model/NavigationBarStyle$ThemeAppearance;", "Lcom/avito/android/remote/model/NavigationBarStyle$SearchBarStyle;", "getSearchBarStyle", "Ljava/lang/String;", "getNavigationIcon", "Lcom/avito/android/remote/model/NavigationBarStyle$NavigationIconOnboarding;", "getNavigationIconOnboarding", "Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType;", "getDisplayType", "getThemeAppearance", "themeAppearance", "DisplayType", "NavigationIconOnboarding", "SearchBarStyle", "ThemeAppearance", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NavigationBarStyle implements Parcelable {

    @k
    public static final Parcelable.Creator<NavigationBarStyle> CREATOR = new Creator();

    @c("themeAppearance")
    @l
    private final ThemeAppearance _themeAppearance;

    @c("backgroundColor")
    @k
    private final UniversalColor backgroundColor;

    @c("cartPointColor")
    @l
    private final UniversalColor cartPointColor;

    @c("displayType")
    @l
    private final DisplayType displayType;

    @c("elementsColor")
    @k
    private final UniversalColor elementsColor;

    @c("leftIcon")
    @l
    private final String navigationIcon;

    @c("leftIconOnboarding")
    @l
    private final NavigationIconOnboarding navigationIconOnboarding;

    @c("searchBarStyle")
    @k
    private final SearchBarStyle searchBarStyle;

    /* compiled from: NavigationBarStyle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NavigationBarStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NavigationBarStyle createFromParcel(@k Parcel parcel) {
            return new NavigationBarStyle((UniversalColor) parcel.readParcelable(NavigationBarStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(NavigationBarStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(NavigationBarStyle.class.getClassLoader()), parcel.readInt() == 0 ? null : ThemeAppearance.valueOf(parcel.readString()), SearchBarStyle.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? NavigationIconOnboarding.CREATOR.createFromParcel(parcel) : null, (DisplayType) parcel.readParcelable(NavigationBarStyle.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NavigationBarStyle[] newArray(int i12) {
            return new NavigationBarStyle[i12];
        }
    }

    /* compiled from: NavigationBarStyle.kt */
    @InterfaceC19824b
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType;", "Landroid/os/Parcelable;", "()V", "LogoWithSearchInput", "OnlyTitle", "SearchInput", "SearchWithActionTitle", "Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$LogoWithSearchInput;", "Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$OnlyTitle;", "Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$SearchInput;", "Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$SearchWithActionTitle;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static abstract class DisplayType implements Parcelable {

        /* compiled from: NavigationBarStyle.kt */
        @d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$LogoWithSearchInput;", "Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType;", "Lcom/avito/android/remote/model/UniversalImage;", "logo", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$LogoWithSearchInput;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getLogo", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LogoWithSearchInput extends DisplayType {

            @k
            public static final Parcelable.Creator<LogoWithSearchInput> CREATOR = new Creator();

            @c("logo")
            @k
            private final UniversalImage logo;

            /* compiled from: NavigationBarStyle.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LogoWithSearchInput> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final LogoWithSearchInput createFromParcel(@k Parcel parcel) {
                    return new LogoWithSearchInput((UniversalImage) parcel.readParcelable(LogoWithSearchInput.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final LogoWithSearchInput[] newArray(int i12) {
                    return new LogoWithSearchInput[i12];
                }
            }

            public LogoWithSearchInput(@k UniversalImage universalImage) {
                super(null);
                this.logo = universalImage;
            }

            public static /* synthetic */ LogoWithSearchInput copy$default(LogoWithSearchInput logoWithSearchInput, UniversalImage universalImage, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    universalImage = logoWithSearchInput.logo;
                }
                return logoWithSearchInput.copy(universalImage);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final UniversalImage getLogo() {
                return this.logo;
            }

            @k
            public final LogoWithSearchInput copy(@k UniversalImage logo) {
                return new LogoWithSearchInput(logo);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LogoWithSearchInput) && L.f(this.logo, ((LogoWithSearchInput) other).logo);
            }

            @k
            public final UniversalImage getLogo() {
                return this.logo;
            }

            public int hashCode() {
                return this.logo.hashCode();
            }

            @k
            public String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.s(new StringBuilder("LogoWithSearchInput(logo="), this.logo, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.logo, flags);
            }
        }

        /* compiled from: NavigationBarStyle.kt */
        @d
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$SearchInput;", "Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SearchInput extends DisplayType {

            @k
            public static final SearchInput INSTANCE = new SearchInput();

            @k
            public static final Parcelable.Creator<SearchInput> CREATOR = new Creator();

            /* compiled from: NavigationBarStyle.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SearchInput> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SearchInput createFromParcel(@k Parcel parcel) {
                    parcel.readInt();
                    return SearchInput.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SearchInput[] newArray(int i12) {
                    return new SearchInput[i12];
                }
            }

            private SearchInput() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof SearchInput);
            }

            public int hashCode() {
                return -1282649482;
            }

            @k
            public String toString() {
                return "SearchInput";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: NavigationBarStyle.kt */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$SearchWithActionTitle;", "Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType;", "", "title", "titleEndIcon", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$SearchWithActionTitle$Onboarding;", "onboarding", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$SearchWithActionTitle$Onboarding;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "()Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$SearchWithActionTitle$Onboarding;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$SearchWithActionTitle$Onboarding;)Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$SearchWithActionTitle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getTitleEndIcon", "getSubtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAction", "Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$SearchWithActionTitle$Onboarding;", "getOnboarding", "Onboarding", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class SearchWithActionTitle extends DisplayType {

            @k
            public static final Parcelable.Creator<SearchWithActionTitle> CREATOR = new Creator();

            @c("action")
            @l
            private final DeepLink action;

            @c("onboarding")
            @l
            private final Onboarding onboarding;

            @c("subtitle")
            @l
            private final String subtitle;

            @c("title")
            @l
            private final String title;

            @c("titleEndIcon")
            @l
            private final String titleEndIcon;

            /* compiled from: NavigationBarStyle.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SearchWithActionTitle> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SearchWithActionTitle createFromParcel(@k Parcel parcel) {
                    return new SearchWithActionTitle(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SearchWithActionTitle.class.getClassLoader()), parcel.readInt() == 0 ? null : Onboarding.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SearchWithActionTitle[] newArray(int i12) {
                    return new SearchWithActionTitle[i12];
                }
            }

            /* compiled from: NavigationBarStyle.kt */
            @d
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u000b¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$SearchWithActionTitle$Onboarding;", "Landroid/os/Parcelable;", "", "onceShowId", "", "priority", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$SearchWithActionTitle$Onboarding;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOnceShowId", "Ljava/lang/Integer;", "getPriority", "getTitle", "getSubtitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Onboarding implements Parcelable {

                @k
                public static final Parcelable.Creator<Onboarding> CREATOR = new Creator();

                @c("onceShowId")
                @l
                private final String onceShowId;

                @c("priority")
                @l
                private final Integer priority;

                @c("subtitle")
                @l
                private final String subtitle;

                @c("title")
                @l
                private final String title;

                /* compiled from: NavigationBarStyle.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Onboarding> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Onboarding createFromParcel(@k Parcel parcel) {
                        return new Onboarding(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Onboarding[] newArray(int i12) {
                        return new Onboarding[i12];
                    }
                }

                public Onboarding(@l String str, @l Integer num, @l String str2, @l String str3) {
                    this.onceShowId = str;
                    this.priority = num;
                    this.title = str2;
                    this.subtitle = str3;
                }

                public static /* synthetic */ Onboarding copy$default(Onboarding onboarding, String str, Integer num, String str2, String str3, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = onboarding.onceShowId;
                    }
                    if ((i12 & 2) != 0) {
                        num = onboarding.priority;
                    }
                    if ((i12 & 4) != 0) {
                        str2 = onboarding.title;
                    }
                    if ((i12 & 8) != 0) {
                        str3 = onboarding.subtitle;
                    }
                    return onboarding.copy(str, num, str2, str3);
                }

                @l
                /* renamed from: component1, reason: from getter */
                public final String getOnceShowId() {
                    return this.onceShowId;
                }

                @l
                /* renamed from: component2, reason: from getter */
                public final Integer getPriority() {
                    return this.priority;
                }

                @l
                /* renamed from: component3, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @l
                /* renamed from: component4, reason: from getter */
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @k
                public final Onboarding copy(@l String onceShowId, @l Integer priority, @l String title, @l String subtitle) {
                    return new Onboarding(onceShowId, priority, title, subtitle);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Onboarding)) {
                        return false;
                    }
                    Onboarding onboarding = (Onboarding) other;
                    return L.f(this.onceShowId, onboarding.onceShowId) && L.f(this.priority, onboarding.priority) && L.f(this.title, onboarding.title) && L.f(this.subtitle, onboarding.subtitle);
                }

                @l
                public final String getOnceShowId() {
                    return this.onceShowId;
                }

                @l
                public final Integer getPriority() {
                    return this.priority;
                }

                @l
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @l
                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    String str = this.onceShowId;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Integer num = this.priority;
                    int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                    String str2 = this.title;
                    int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.subtitle;
                    return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Onboarding(onceShowId=");
                    sb2.append(this.onceShowId);
                    sb2.append(", priority=");
                    sb2.append(this.priority);
                    sb2.append(", title=");
                    sb2.append(this.title);
                    sb2.append(", subtitle=");
                    return C22026a.c(sb2, this.subtitle, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.onceShowId);
                    Integer num = this.priority;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        a.C(parcel, 1, num);
                    }
                    parcel.writeString(this.title);
                    parcel.writeString(this.subtitle);
                }
            }

            public SearchWithActionTitle(@l String str, @l String str2, @l String str3, @l DeepLink deepLink, @l Onboarding onboarding) {
                super(null);
                this.title = str;
                this.titleEndIcon = str2;
                this.subtitle = str3;
                this.action = deepLink;
                this.onboarding = onboarding;
            }

            public static /* synthetic */ SearchWithActionTitle copy$default(SearchWithActionTitle searchWithActionTitle, String str, String str2, String str3, DeepLink deepLink, Onboarding onboarding, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = searchWithActionTitle.title;
                }
                if ((i12 & 2) != 0) {
                    str2 = searchWithActionTitle.titleEndIcon;
                }
                String str4 = str2;
                if ((i12 & 4) != 0) {
                    str3 = searchWithActionTitle.subtitle;
                }
                String str5 = str3;
                if ((i12 & 8) != 0) {
                    deepLink = searchWithActionTitle.action;
                }
                DeepLink deepLink2 = deepLink;
                if ((i12 & 16) != 0) {
                    onboarding = searchWithActionTitle.onboarding;
                }
                return searchWithActionTitle.copy(str, str4, str5, deepLink2, onboarding);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getTitleEndIcon() {
                return this.titleEndIcon;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final DeepLink getAction() {
                return this.action;
            }

            @l
            /* renamed from: component5, reason: from getter */
            public final Onboarding getOnboarding() {
                return this.onboarding;
            }

            @k
            public final SearchWithActionTitle copy(@l String title, @l String titleEndIcon, @l String subtitle, @l DeepLink action, @l Onboarding onboarding) {
                return new SearchWithActionTitle(title, titleEndIcon, subtitle, action, onboarding);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SearchWithActionTitle)) {
                    return false;
                }
                SearchWithActionTitle searchWithActionTitle = (SearchWithActionTitle) other;
                return L.f(this.title, searchWithActionTitle.title) && L.f(this.titleEndIcon, searchWithActionTitle.titleEndIcon) && L.f(this.subtitle, searchWithActionTitle.subtitle) && L.f(this.action, searchWithActionTitle.action) && L.f(this.onboarding, searchWithActionTitle.onboarding);
            }

            @l
            public final DeepLink getAction() {
                return this.action;
            }

            @l
            public final Onboarding getOnboarding() {
                return this.onboarding;
            }

            @l
            public final String getSubtitle() {
                return this.subtitle;
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            @l
            public final String getTitleEndIcon() {
                return this.titleEndIcon;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.titleEndIcon;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.subtitle;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                DeepLink deepLink = this.action;
                int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                Onboarding onboarding = this.onboarding;
                return iHashCode4 + (onboarding != null ? onboarding.hashCode() : 0);
            }

            @k
            public String toString() {
                return "SearchWithActionTitle(title=" + this.title + ", titleEndIcon=" + this.titleEndIcon + ", subtitle=" + this.subtitle + ", action=" + this.action + ", onboarding=" + this.onboarding + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.titleEndIcon);
                parcel.writeString(this.subtitle);
                parcel.writeParcelable(this.action, flags);
                Onboarding onboarding = this.onboarding;
                if (onboarding == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    onboarding.writeToParcel(parcel, flags);
                }
            }
        }

        public /* synthetic */ DisplayType(C42822w c42822w) {
            this();
        }

        /* compiled from: NavigationBarStyle.kt */
        @d
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$OnlyTitle;", "Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType;", "", "title", "Lcom/avito/android/remote/model/ToolbarConfig$DisplayMode;", "displayMode", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/ToolbarConfig$DisplayMode;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/ToolbarConfig$DisplayMode;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/ToolbarConfig$DisplayMode;)Lcom/avito/android/remote/model/NavigationBarStyle$DisplayType$OnlyTitle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/ToolbarConfig$DisplayMode;", "getDisplayMode", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OnlyTitle extends DisplayType {

            @k
            public static final Parcelable.Creator<OnlyTitle> CREATOR = new Creator();

            @l
            private final transient ToolbarConfig.DisplayMode displayMode;

            @k
            private final transient String title;

            /* compiled from: NavigationBarStyle.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OnlyTitle> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OnlyTitle createFromParcel(@k Parcel parcel) {
                    return new OnlyTitle(parcel.readString(), parcel.readInt() == 0 ? null : ToolbarConfig.DisplayMode.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OnlyTitle[] newArray(int i12) {
                    return new OnlyTitle[i12];
                }
            }

            public /* synthetic */ OnlyTitle(String str, ToolbarConfig.DisplayMode displayMode, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? ToolbarConfig.DisplayMode.ALWAYS : displayMode);
            }

            public static /* synthetic */ OnlyTitle copy$default(OnlyTitle onlyTitle, String str, ToolbarConfig.DisplayMode displayMode, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = onlyTitle.title;
                }
                if ((i12 & 2) != 0) {
                    displayMode = onlyTitle.displayMode;
                }
                return onlyTitle.copy(str, displayMode);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final ToolbarConfig.DisplayMode getDisplayMode() {
                return this.displayMode;
            }

            @k
            public final OnlyTitle copy(@k String title, @l ToolbarConfig.DisplayMode displayMode) {
                return new OnlyTitle(title, displayMode);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnlyTitle)) {
                    return false;
                }
                OnlyTitle onlyTitle = (OnlyTitle) other;
                return L.f(this.title, onlyTitle.title) && this.displayMode == onlyTitle.displayMode;
            }

            @l
            public final ToolbarConfig.DisplayMode getDisplayMode() {
                return this.displayMode;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                ToolbarConfig.DisplayMode displayMode = this.displayMode;
                return iHashCode + (displayMode == null ? 0 : displayMode.hashCode());
            }

            @k
            public String toString() {
                return "OnlyTitle(title=" + this.title + ", displayMode=" + this.displayMode + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                ToolbarConfig.DisplayMode displayMode = this.displayMode;
                if (displayMode == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    displayMode.writeToParcel(parcel, flags);
                }
            }

            public OnlyTitle(@k String str, @l ToolbarConfig.DisplayMode displayMode) {
                super(null);
                this.title = str;
                this.displayMode = displayMode;
            }
        }

        private DisplayType() {
        }
    }

    /* compiled from: NavigationBarStyle.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016Jd\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b2\u0010\u0016¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/NavigationBarStyle$NavigationIconOnboarding;", "Landroid/os/Parcelable;", "", "onceShowId", "", "priority", "title", "text", "buttonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "buttonDeeplink", "onShowDeeplink", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/NavigationBarStyle$NavigationIconOnboarding;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOnceShowId", "Ljava/lang/Integer;", "getPriority", "getTitle", "getText", "getButtonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getButtonDeeplink", "getOnShowDeeplink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigationIconOnboarding implements Parcelable {

        @k
        public static final Parcelable.Creator<NavigationIconOnboarding> CREATOR = new Creator();

        @c("buttonDeeplink")
        @l
        private final DeepLink buttonDeeplink;

        @c("buttonTitle")
        @l
        private final String buttonTitle;

        @c("onShowDeeplink")
        @l
        private final DeepLink onShowDeeplink;

        @c("onceShowId")
        @l
        private final String onceShowId;

        @c("priority")
        @l
        private final Integer priority;

        @c("description")
        @l
        private final String text;

        @c("title")
        @l
        private final String title;

        /* compiled from: NavigationBarStyle.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NavigationIconOnboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NavigationIconOnboarding createFromParcel(@k Parcel parcel) {
                return new NavigationIconOnboarding(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(NavigationIconOnboarding.class.getClassLoader()), (DeepLink) parcel.readParcelable(NavigationIconOnboarding.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NavigationIconOnboarding[] newArray(int i12) {
                return new NavigationIconOnboarding[i12];
            }
        }

        public NavigationIconOnboarding() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public static /* synthetic */ NavigationIconOnboarding copy$default(NavigationIconOnboarding navigationIconOnboarding, String str, Integer num, String str2, String str3, String str4, DeepLink deepLink, DeepLink deepLink2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = navigationIconOnboarding.onceShowId;
            }
            if ((i12 & 2) != 0) {
                num = navigationIconOnboarding.priority;
            }
            Integer num2 = num;
            if ((i12 & 4) != 0) {
                str2 = navigationIconOnboarding.title;
            }
            String str5 = str2;
            if ((i12 & 8) != 0) {
                str3 = navigationIconOnboarding.text;
            }
            String str6 = str3;
            if ((i12 & 16) != 0) {
                str4 = navigationIconOnboarding.buttonTitle;
            }
            String str7 = str4;
            if ((i12 & 32) != 0) {
                deepLink = navigationIconOnboarding.buttonDeeplink;
            }
            DeepLink deepLink3 = deepLink;
            if ((i12 & 64) != 0) {
                deepLink2 = navigationIconOnboarding.onShowDeeplink;
            }
            return navigationIconOnboarding.copy(str, num2, str5, str6, str7, deepLink3, deepLink2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Integer getPriority() {
            return this.priority;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final DeepLink getButtonDeeplink() {
            return this.buttonDeeplink;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final DeepLink getOnShowDeeplink() {
            return this.onShowDeeplink;
        }

        @k
        public final NavigationIconOnboarding copy(@l String onceShowId, @l Integer priority, @l String title, @l String text, @l String buttonTitle, @l DeepLink buttonDeeplink, @l DeepLink onShowDeeplink) {
            return new NavigationIconOnboarding(onceShowId, priority, title, text, buttonTitle, buttonDeeplink, onShowDeeplink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigationIconOnboarding)) {
                return false;
            }
            NavigationIconOnboarding navigationIconOnboarding = (NavigationIconOnboarding) other;
            return L.f(this.onceShowId, navigationIconOnboarding.onceShowId) && L.f(this.priority, navigationIconOnboarding.priority) && L.f(this.title, navigationIconOnboarding.title) && L.f(this.text, navigationIconOnboarding.text) && L.f(this.buttonTitle, navigationIconOnboarding.buttonTitle) && L.f(this.buttonDeeplink, navigationIconOnboarding.buttonDeeplink) && L.f(this.onShowDeeplink, navigationIconOnboarding.onShowDeeplink);
        }

        @l
        public final DeepLink getButtonDeeplink() {
            return this.buttonDeeplink;
        }

        @l
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        public final DeepLink getOnShowDeeplink() {
            return this.onShowDeeplink;
        }

        @l
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @l
        public final Integer getPriority() {
            return this.priority;
        }

        @l
        public final String getText() {
            return this.text;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.onceShowId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.priority;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.title;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.text;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonTitle;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            DeepLink deepLink = this.buttonDeeplink;
            int iHashCode6 = (iHashCode5 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            DeepLink deepLink2 = this.onShowDeeplink;
            return iHashCode6 + (deepLink2 != null ? deepLink2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("NavigationIconOnboarding(onceShowId=");
            sb2.append(this.onceShowId);
            sb2.append(", priority=");
            sb2.append(this.priority);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", buttonTitle=");
            sb2.append(this.buttonTitle);
            sb2.append(", buttonDeeplink=");
            sb2.append(this.buttonDeeplink);
            sb2.append(", onShowDeeplink=");
            return a.v(sb2, this.onShowDeeplink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.onceShowId);
            Integer num = this.priority;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            parcel.writeString(this.title);
            parcel.writeString(this.text);
            parcel.writeString(this.buttonTitle);
            parcel.writeParcelable(this.buttonDeeplink, flags);
            parcel.writeParcelable(this.onShowDeeplink, flags);
        }

        public NavigationIconOnboarding(@l String str, @l Integer num, @l String str2, @l String str3, @l String str4, @l DeepLink deepLink, @l DeepLink deepLink2) {
            this.onceShowId = str;
            this.priority = num;
            this.title = str2;
            this.text = str3;
            this.buttonTitle = str4;
            this.buttonDeeplink = deepLink;
            this.onShowDeeplink = deepLink2;
        }

        public /* synthetic */ NavigationIconOnboarding(String str, Integer num, String str2, String str3, String str4, DeepLink deepLink, DeepLink deepLink2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : deepLink, (i12 & 64) != 0 ? null : deepLink2);
        }
    }

    /* compiled from: NavigationBarStyle.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\t¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/NavigationBarStyle$SearchBarStyle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "pressedBackgroundColor", "hintColor", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "component3", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/NavigationBarStyle$SearchBarStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getPressedBackgroundColor", "getHintColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchBarStyle implements Parcelable {

        @k
        public static final Parcelable.Creator<SearchBarStyle> CREATOR = new Creator();

        @c("backgroundColor")
        @k
        private final UniversalColor backgroundColor;

        @c("hintColor")
        @k
        private final UniversalColor hintColor;

        @c("pressedBackgroundColor")
        @k
        private final UniversalColor pressedBackgroundColor;

        /* compiled from: NavigationBarStyle.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SearchBarStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SearchBarStyle createFromParcel(@k Parcel parcel) {
                return new SearchBarStyle((UniversalColor) parcel.readParcelable(SearchBarStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SearchBarStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SearchBarStyle.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SearchBarStyle[] newArray(int i12) {
                return new SearchBarStyle[i12];
            }
        }

        public SearchBarStyle(@k UniversalColor universalColor, @k UniversalColor universalColor2, @k UniversalColor universalColor3) {
            this.backgroundColor = universalColor;
            this.pressedBackgroundColor = universalColor2;
            this.hintColor = universalColor3;
        }

        public static /* synthetic */ SearchBarStyle copy$default(SearchBarStyle searchBarStyle, UniversalColor universalColor, UniversalColor universalColor2, UniversalColor universalColor3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalColor = searchBarStyle.backgroundColor;
            }
            if ((i12 & 2) != 0) {
                universalColor2 = searchBarStyle.pressedBackgroundColor;
            }
            if ((i12 & 4) != 0) {
                universalColor3 = searchBarStyle.hintColor;
            }
            return searchBarStyle.copy(universalColor, universalColor2, universalColor3);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getPressedBackgroundColor() {
            return this.pressedBackgroundColor;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final UniversalColor getHintColor() {
            return this.hintColor;
        }

        @k
        public final SearchBarStyle copy(@k UniversalColor backgroundColor, @k UniversalColor pressedBackgroundColor, @k UniversalColor hintColor) {
            return new SearchBarStyle(backgroundColor, pressedBackgroundColor, hintColor);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchBarStyle)) {
                return false;
            }
            SearchBarStyle searchBarStyle = (SearchBarStyle) other;
            return L.f(this.backgroundColor, searchBarStyle.backgroundColor) && L.f(this.pressedBackgroundColor, searchBarStyle.pressedBackgroundColor) && L.f(this.hintColor, searchBarStyle.hintColor);
        }

        @k
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        public final UniversalColor getHintColor() {
            return this.hintColor;
        }

        @k
        public final UniversalColor getPressedBackgroundColor() {
            return this.pressedBackgroundColor;
        }

        public int hashCode() {
            return this.hintColor.hashCode() + a.i(this.pressedBackgroundColor, this.backgroundColor.hashCode() * 31, 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SearchBarStyle(backgroundColor=");
            sb2.append(this.backgroundColor);
            sb2.append(", pressedBackgroundColor=");
            sb2.append(this.pressedBackgroundColor);
            sb2.append(", hintColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.hintColor, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.backgroundColor, flags);
            parcel.writeParcelable(this.pressedBackgroundColor, flags);
            parcel.writeParcelable(this.hintColor, flags);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NavigationBarStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/NavigationBarStyle$ThemeAppearance;", "", "(Ljava/lang/String;I)V", "Dark", "Light", "AlwaysDark", "AlwaysLight", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ThemeAppearance {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ ThemeAppearance[] $VALUES;

        @c("dark")
        public static final ThemeAppearance Dark = new ThemeAppearance("Dark", 0);

        @c(FontStyleKt.LIGHT)
        public static final ThemeAppearance Light = new ThemeAppearance("Light", 1);

        @c("alwaysDark")
        public static final ThemeAppearance AlwaysDark = new ThemeAppearance("AlwaysDark", 2);

        @c("alwaysLight")
        public static final ThemeAppearance AlwaysLight = new ThemeAppearance("AlwaysLight", 3);

        private static final /* synthetic */ ThemeAppearance[] $values() {
            return new ThemeAppearance[]{Dark, Light, AlwaysDark, AlwaysLight};
        }

        static {
            ThemeAppearance[] themeAppearanceArr$values = $values();
            $VALUES = themeAppearanceArr$values;
            $ENTRIES = kotlin.enums.c.a(themeAppearanceArr$values);
        }

        private ThemeAppearance(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<ThemeAppearance> getEntries() {
            return $ENTRIES;
        }

        public static ThemeAppearance valueOf(String str) {
            return (ThemeAppearance) Enum.valueOf(ThemeAppearance.class, str);
        }

        public static ThemeAppearance[] values() {
            return (ThemeAppearance[]) $VALUES.clone();
        }
    }

    public NavigationBarStyle(@k UniversalColor universalColor, @k UniversalColor universalColor2, @l UniversalColor universalColor3, @l ThemeAppearance themeAppearance, @k SearchBarStyle searchBarStyle, @l String str, @l NavigationIconOnboarding navigationIconOnboarding, @l DisplayType displayType) {
        this.backgroundColor = universalColor;
        this.elementsColor = universalColor2;
        this.cartPointColor = universalColor3;
        this._themeAppearance = themeAppearance;
        this.searchBarStyle = searchBarStyle;
        this.navigationIcon = str;
        this.navigationIconOnboarding = navigationIconOnboarding;
        this.displayType = displayType;
    }

    /* renamed from: component4, reason: from getter */
    private final ThemeAppearance get_themeAppearance() {
        return this._themeAppearance;
    }

    public static /* synthetic */ NavigationBarStyle copy$default(NavigationBarStyle navigationBarStyle, UniversalColor universalColor, UniversalColor universalColor2, UniversalColor universalColor3, ThemeAppearance themeAppearance, SearchBarStyle searchBarStyle, String str, NavigationIconOnboarding navigationIconOnboarding, DisplayType displayType, int i12, Object obj) {
        return navigationBarStyle.copy((i12 & 1) != 0 ? navigationBarStyle.backgroundColor : universalColor, (i12 & 2) != 0 ? navigationBarStyle.elementsColor : universalColor2, (i12 & 4) != 0 ? navigationBarStyle.cartPointColor : universalColor3, (i12 & 8) != 0 ? navigationBarStyle._themeAppearance : themeAppearance, (i12 & 16) != 0 ? navigationBarStyle.searchBarStyle : searchBarStyle, (i12 & 32) != 0 ? navigationBarStyle.navigationIcon : str, (i12 & 64) != 0 ? navigationBarStyle.navigationIconOnboarding : navigationIconOnboarding, (i12 & 128) != 0 ? navigationBarStyle.displayType : displayType);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getElementsColor() {
        return this.elementsColor;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getCartPointColor() {
        return this.cartPointColor;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final SearchBarStyle getSearchBarStyle() {
        return this.searchBarStyle;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getNavigationIcon() {
        return this.navigationIcon;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final NavigationIconOnboarding getNavigationIconOnboarding() {
        return this.navigationIconOnboarding;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final DisplayType getDisplayType() {
        return this.displayType;
    }

    @k
    public final NavigationBarStyle copy(@k UniversalColor backgroundColor, @k UniversalColor elementsColor, @l UniversalColor cartPointColor, @l ThemeAppearance _themeAppearance, @k SearchBarStyle searchBarStyle, @l String navigationIcon, @l NavigationIconOnboarding navigationIconOnboarding, @l DisplayType displayType) {
        return new NavigationBarStyle(backgroundColor, elementsColor, cartPointColor, _themeAppearance, searchBarStyle, navigationIcon, navigationIconOnboarding, displayType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationBarStyle)) {
            return false;
        }
        NavigationBarStyle navigationBarStyle = (NavigationBarStyle) other;
        return L.f(this.backgroundColor, navigationBarStyle.backgroundColor) && L.f(this.elementsColor, navigationBarStyle.elementsColor) && L.f(this.cartPointColor, navigationBarStyle.cartPointColor) && this._themeAppearance == navigationBarStyle._themeAppearance && L.f(this.searchBarStyle, navigationBarStyle.searchBarStyle) && L.f(this.navigationIcon, navigationBarStyle.navigationIcon) && L.f(this.navigationIconOnboarding, navigationBarStyle.navigationIconOnboarding) && L.f(this.displayType, navigationBarStyle.displayType);
    }

    @k
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final UniversalColor getCartPointColor() {
        return this.cartPointColor;
    }

    @l
    public final DisplayType getDisplayType() {
        return this.displayType;
    }

    @k
    public final UniversalColor getElementsColor() {
        return this.elementsColor;
    }

    @l
    public final String getNavigationIcon() {
        return this.navigationIcon;
    }

    @l
    public final NavigationIconOnboarding getNavigationIconOnboarding() {
        return this.navigationIconOnboarding;
    }

    @k
    public final SearchBarStyle getSearchBarStyle() {
        return this.searchBarStyle;
    }

    @k
    public final ThemeAppearance getThemeAppearance() {
        ThemeAppearance themeAppearance = this._themeAppearance;
        return themeAppearance == null ? ThemeAppearance.Dark : themeAppearance;
    }

    public int hashCode() {
        int i12 = a.i(this.elementsColor, this.backgroundColor.hashCode() * 31, 31);
        UniversalColor universalColor = this.cartPointColor;
        int iHashCode = (i12 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        ThemeAppearance themeAppearance = this._themeAppearance;
        int iHashCode2 = (this.searchBarStyle.hashCode() + ((iHashCode + (themeAppearance == null ? 0 : themeAppearance.hashCode())) * 31)) * 31;
        String str = this.navigationIcon;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        NavigationIconOnboarding navigationIconOnboarding = this.navigationIconOnboarding;
        int iHashCode4 = (iHashCode3 + (navigationIconOnboarding == null ? 0 : navigationIconOnboarding.hashCode())) * 31;
        DisplayType displayType = this.displayType;
        return iHashCode4 + (displayType != null ? displayType.hashCode() : 0);
    }

    @k
    public final NavigationBarStyle prepareForNextScreen() {
        return copy$default(this, null, null, null, null, null, null, null, null, 31, null);
    }

    @k
    public String toString() {
        return "NavigationBarStyle(backgroundColor=" + this.backgroundColor + ", elementsColor=" + this.elementsColor + ", cartPointColor=" + this.cartPointColor + ", _themeAppearance=" + this._themeAppearance + ", searchBarStyle=" + this.searchBarStyle + ", navigationIcon=" + this.navigationIcon + ", navigationIconOnboarding=" + this.navigationIconOnboarding + ", displayType=" + this.displayType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.elementsColor, flags);
        parcel.writeParcelable(this.cartPointColor, flags);
        ThemeAppearance themeAppearance = this._themeAppearance;
        if (themeAppearance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(themeAppearance.name());
        }
        this.searchBarStyle.writeToParcel(parcel, flags);
        parcel.writeString(this.navigationIcon);
        NavigationIconOnboarding navigationIconOnboarding = this.navigationIconOnboarding;
        if (navigationIconOnboarding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            navigationIconOnboarding.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.displayType, flags);
    }

    public /* synthetic */ NavigationBarStyle(UniversalColor universalColor, UniversalColor universalColor2, UniversalColor universalColor3, ThemeAppearance themeAppearance, SearchBarStyle searchBarStyle, String str, NavigationIconOnboarding navigationIconOnboarding, DisplayType displayType, int i12, C42822w c42822w) {
        this(universalColor, universalColor2, universalColor3, themeAppearance, searchBarStyle, str, (i12 & 64) != 0 ? null : navigationIconOnboarding, (i12 & 128) != 0 ? DisplayType.SearchInput.INSTANCE : displayType);
    }
}
