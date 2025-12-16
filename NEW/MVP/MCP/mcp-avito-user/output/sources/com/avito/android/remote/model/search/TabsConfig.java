package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: InlineFilters.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/search/TabsConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/search/TabsConfig$Style;", "_style", "<init>", "(Lcom/avito/android/remote/model/search/TabsConfig$Style;)V", "component1", "()Lcom/avito/android/remote/model/search/TabsConfig$Style;", "copy", "(Lcom/avito/android/remote/model/search/TabsConfig$Style;)Lcom/avito/android/remote/model/search/TabsConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/search/TabsConfig$Style;", "getStyle", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Style", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TabsConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<TabsConfig> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final Style _style;

    /* compiled from: InlineFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TabsConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TabsConfig createFromParcel(@k Parcel parcel) {
            return new TabsConfig(parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TabsConfig[] newArray(int i12) {
            return new TabsConfig[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InlineFilters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/search/TabsConfig$Style;", "", "(Ljava/lang/String;I)V", "Default", "Chips", "WithBottomLineLarge", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        @c("default")
        public static final Style Default = new Style("Default", 0);

        @c("chips")
        public static final Style Chips = new Style("Chips", 1);

        @c("withBottomLineLarge")
        public static final Style WithBottomLineLarge = new Style("WithBottomLineLarge", 2);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{Default, Chips, WithBottomLineLarge};
        }

        static {
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = kotlin.enums.c.a(styleArr$values);
        }

        private Style(String str, int i12) {
        }

        @k
        public static a<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public TabsConfig(@l Style style) {
        this._style = style;
    }

    /* renamed from: component1, reason: from getter */
    private final Style get_style() {
        return this._style;
    }

    public static /* synthetic */ TabsConfig copy$default(TabsConfig tabsConfig, Style style, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            style = tabsConfig._style;
        }
        return tabsConfig.copy(style);
    }

    @k
    public final TabsConfig copy(@l Style _style) {
        return new TabsConfig(_style);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TabsConfig) && this._style == ((TabsConfig) other)._style;
    }

    @k
    public final Style getStyle() {
        Style style = this._style;
        return style == null ? Style.Default : style;
    }

    public int hashCode() {
        Style style = this._style;
        if (style == null) {
            return 0;
        }
        return style.hashCode();
    }

    @k
    public String toString() {
        return "TabsConfig(_style=" + this._style + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Style style = this._style;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(style.name());
        }
    }
}
