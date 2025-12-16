package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ToolbarConfigElement.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u00029:BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019Jp\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b3\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b4\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b5\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b6\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u0019¨\u0006;"}, d2 = {"Lcom/avito/android/remote/model/ToolbarConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/ToolbarConfig$ToolbarText;", "toolbarText", "Lcom/avito/android/remote/model/UniversalColor;", "toolbarColor", "searchColor", "pressedSearchColor", "elementsColor", "hintColor", "cartPointColor", "Lcom/avito/android/remote/model/NavigationBarStyle$ThemeAppearance;", "themeAppearance", "<init>", "(Lcom/avito/android/remote/model/ToolbarConfig$ToolbarText;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/NavigationBarStyle$ThemeAppearance;)V", "component1", "()Lcom/avito/android/remote/model/ToolbarConfig$ToolbarText;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/avito/android/remote/model/NavigationBarStyle$ThemeAppearance;", "copy", "(Lcom/avito/android/remote/model/ToolbarConfig$ToolbarText;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/NavigationBarStyle$ThemeAppearance;)Lcom/avito/android/remote/model/ToolbarConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/ToolbarConfig$ToolbarText;", "getToolbarText", "Lcom/avito/android/remote/model/UniversalColor;", "getToolbarColor", "getSearchColor", "getPressedSearchColor", "getElementsColor", "getHintColor", "getCartPointColor", "Lcom/avito/android/remote/model/NavigationBarStyle$ThemeAppearance;", "getThemeAppearance", "DisplayMode", "ToolbarText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ToolbarConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<ToolbarConfig> CREATOR = new Creator();

    @c("cartPointColor")
    @l
    private final UniversalColor cartPointColor;

    @c("elementsColor")
    @l
    private final UniversalColor elementsColor;

    @c("hintColor")
    @l
    private final UniversalColor hintColor;

    @c("pressedSearchViewColor")
    @l
    private final UniversalColor pressedSearchColor;

    @c("searchColor")
    @l
    private final UniversalColor searchColor;

    @c("themeAppearance")
    @l
    private final NavigationBarStyle.ThemeAppearance themeAppearance;

    @c("toolbarColor")
    @l
    private final UniversalColor toolbarColor;

    @c("toolbarText")
    @l
    private final ToolbarText toolbarText;

    /* compiled from: ToolbarConfigElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ToolbarConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ToolbarConfig createFromParcel(@k Parcel parcel) {
            return new ToolbarConfig(parcel.readInt() == 0 ? null : ToolbarText.CREATOR.createFromParcel(parcel), (UniversalColor) parcel.readParcelable(ToolbarConfig.class.getClassLoader()), (UniversalColor) parcel.readParcelable(ToolbarConfig.class.getClassLoader()), (UniversalColor) parcel.readParcelable(ToolbarConfig.class.getClassLoader()), (UniversalColor) parcel.readParcelable(ToolbarConfig.class.getClassLoader()), (UniversalColor) parcel.readParcelable(ToolbarConfig.class.getClassLoader()), (UniversalColor) parcel.readParcelable(ToolbarConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : NavigationBarStyle.ThemeAppearance.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ToolbarConfig[] newArray(int i12) {
            return new ToolbarConfig[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ToolbarConfigElement.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/ToolbarConfig$DisplayMode;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "ALWAYS", "ON_SCROLL_WIDGET", "ALIGN_TO_UP_BUTTON", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class DisplayMode implements Parcelable {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DisplayMode[] $VALUES;

        @k
        public static final Parcelable.Creator<DisplayMode> CREATOR;

        @c("always")
        public static final DisplayMode ALWAYS = new DisplayMode("ALWAYS", 0);

        @c("onScrollWidget")
        public static final DisplayMode ON_SCROLL_WIDGET = new DisplayMode("ON_SCROLL_WIDGET", 1);

        @c("alignToUpButton")
        public static final DisplayMode ALIGN_TO_UP_BUTTON = new DisplayMode("ALIGN_TO_UP_BUTTON", 2);

        /* compiled from: ToolbarConfigElement.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DisplayMode> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DisplayMode createFromParcel(@k Parcel parcel) {
                return DisplayMode.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DisplayMode[] newArray(int i12) {
                return new DisplayMode[i12];
            }
        }

        private static final /* synthetic */ DisplayMode[] $values() {
            return new DisplayMode[]{ALWAYS, ON_SCROLL_WIDGET, ALIGN_TO_UP_BUTTON};
        }

        static {
            DisplayMode[] displayModeArr$values = $values();
            $VALUES = displayModeArr$values;
            $ENTRIES = kotlin.enums.c.a(displayModeArr$values);
            CREATOR = new Creator();
        }

        private DisplayMode(String str, int i12) {
        }

        @k
        public static a<DisplayMode> getEntries() {
            return $ENTRIES;
        }

        public static DisplayMode valueOf(String str) {
            return (DisplayMode) Enum.valueOf(DisplayMode.class, str);
        }

        public static DisplayMode[] values() {
            return (DisplayMode[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(name());
        }
    }

    public ToolbarConfig(@l ToolbarText toolbarText, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalColor universalColor3, @l UniversalColor universalColor4, @l UniversalColor universalColor5, @l UniversalColor universalColor6, @l NavigationBarStyle.ThemeAppearance themeAppearance) {
        this.toolbarText = toolbarText;
        this.toolbarColor = universalColor;
        this.searchColor = universalColor2;
        this.pressedSearchColor = universalColor3;
        this.elementsColor = universalColor4;
        this.hintColor = universalColor5;
        this.cartPointColor = universalColor6;
        this.themeAppearance = themeAppearance;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final ToolbarText getToolbarText() {
        return this.toolbarText;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getToolbarColor() {
        return this.toolbarColor;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getSearchColor() {
        return this.searchColor;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalColor getPressedSearchColor() {
        return this.pressedSearchColor;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalColor getElementsColor() {
        return this.elementsColor;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final UniversalColor getHintColor() {
        return this.hintColor;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final UniversalColor getCartPointColor() {
        return this.cartPointColor;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final NavigationBarStyle.ThemeAppearance getThemeAppearance() {
        return this.themeAppearance;
    }

    @k
    public final ToolbarConfig copy(@l ToolbarText toolbarText, @l UniversalColor toolbarColor, @l UniversalColor searchColor, @l UniversalColor pressedSearchColor, @l UniversalColor elementsColor, @l UniversalColor hintColor, @l UniversalColor cartPointColor, @l NavigationBarStyle.ThemeAppearance themeAppearance) {
        return new ToolbarConfig(toolbarText, toolbarColor, searchColor, pressedSearchColor, elementsColor, hintColor, cartPointColor, themeAppearance);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolbarConfig)) {
            return false;
        }
        ToolbarConfig toolbarConfig = (ToolbarConfig) other;
        return L.f(this.toolbarText, toolbarConfig.toolbarText) && L.f(this.toolbarColor, toolbarConfig.toolbarColor) && L.f(this.searchColor, toolbarConfig.searchColor) && L.f(this.pressedSearchColor, toolbarConfig.pressedSearchColor) && L.f(this.elementsColor, toolbarConfig.elementsColor) && L.f(this.hintColor, toolbarConfig.hintColor) && L.f(this.cartPointColor, toolbarConfig.cartPointColor) && this.themeAppearance == toolbarConfig.themeAppearance;
    }

    @l
    public final UniversalColor getCartPointColor() {
        return this.cartPointColor;
    }

    @l
    public final UniversalColor getElementsColor() {
        return this.elementsColor;
    }

    @l
    public final UniversalColor getHintColor() {
        return this.hintColor;
    }

    @l
    public final UniversalColor getPressedSearchColor() {
        return this.pressedSearchColor;
    }

    @l
    public final UniversalColor getSearchColor() {
        return this.searchColor;
    }

    @l
    public final NavigationBarStyle.ThemeAppearance getThemeAppearance() {
        return this.themeAppearance;
    }

    @l
    public final UniversalColor getToolbarColor() {
        return this.toolbarColor;
    }

    @l
    public final ToolbarText getToolbarText() {
        return this.toolbarText;
    }

    public int hashCode() {
        ToolbarText toolbarText = this.toolbarText;
        int iHashCode = (toolbarText == null ? 0 : toolbarText.hashCode()) * 31;
        UniversalColor universalColor = this.toolbarColor;
        int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.searchColor;
        int iHashCode3 = (iHashCode2 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        UniversalColor universalColor3 = this.pressedSearchColor;
        int iHashCode4 = (iHashCode3 + (universalColor3 == null ? 0 : universalColor3.hashCode())) * 31;
        UniversalColor universalColor4 = this.elementsColor;
        int iHashCode5 = (iHashCode4 + (universalColor4 == null ? 0 : universalColor4.hashCode())) * 31;
        UniversalColor universalColor5 = this.hintColor;
        int iHashCode6 = (iHashCode5 + (universalColor5 == null ? 0 : universalColor5.hashCode())) * 31;
        UniversalColor universalColor6 = this.cartPointColor;
        int iHashCode7 = (iHashCode6 + (universalColor6 == null ? 0 : universalColor6.hashCode())) * 31;
        NavigationBarStyle.ThemeAppearance themeAppearance = this.themeAppearance;
        return iHashCode7 + (themeAppearance != null ? themeAppearance.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ToolbarConfig(toolbarText=" + this.toolbarText + ", toolbarColor=" + this.toolbarColor + ", searchColor=" + this.searchColor + ", pressedSearchColor=" + this.pressedSearchColor + ", elementsColor=" + this.elementsColor + ", hintColor=" + this.hintColor + ", cartPointColor=" + this.cartPointColor + ", themeAppearance=" + this.themeAppearance + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        ToolbarText toolbarText = this.toolbarText;
        if (toolbarText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            toolbarText.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.toolbarColor, flags);
        parcel.writeParcelable(this.searchColor, flags);
        parcel.writeParcelable(this.pressedSearchColor, flags);
        parcel.writeParcelable(this.elementsColor, flags);
        parcel.writeParcelable(this.hintColor, flags);
        parcel.writeParcelable(this.cartPointColor, flags);
        NavigationBarStyle.ThemeAppearance themeAppearance = this.themeAppearance;
        if (themeAppearance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(themeAppearance.name());
        }
    }

    /* compiled from: ToolbarConfigElement.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/ToolbarConfig$ToolbarText;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/ToolbarConfig$DisplayMode;", "displayMode", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/ToolbarConfig$DisplayMode;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/ToolbarConfig$DisplayMode;", "getDisplayMode", "()Lcom/avito/android/remote/model/ToolbarConfig$DisplayMode;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ToolbarText implements Parcelable {

        @k
        public static final Parcelable.Creator<ToolbarText> CREATOR = new Creator();

        @c("displayMode")
        @l
        private final DisplayMode displayMode;

        @c("text")
        @k
        private final String text;

        /* compiled from: ToolbarConfigElement.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ToolbarText> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ToolbarText createFromParcel(@k Parcel parcel) {
                return new ToolbarText(parcel.readString(), parcel.readInt() == 0 ? null : DisplayMode.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ToolbarText[] newArray(int i12) {
                return new ToolbarText[i12];
            }
        }

        public ToolbarText(@k String str, @l DisplayMode displayMode) {
            this.text = str;
            this.displayMode = displayMode;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final DisplayMode getDisplayMode() {
            return this.displayMode;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            DisplayMode displayMode = this.displayMode;
            if (displayMode == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                displayMode.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ ToolbarText(String str, DisplayMode displayMode, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? DisplayMode.ALWAYS : displayMode);
        }
    }
}
