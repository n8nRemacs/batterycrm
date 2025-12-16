package com.avito.android.beduin.common.action;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.network.model.BeduinTitleAlignment;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOpenUniversalPageV2Action.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0011\u0010*\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010\u000eR\u0011\u0010,\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010\f¨\u0006-"}, d2 = {"Lcom/avito/android/beduin/common/action/ScreenTitle;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "_style", "Lcom/avito/android/beduin/network/model/BeduinTitleAlignment;", "_alignment", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;Lcom/avito/android/beduin/network/model/BeduinTitleAlignment;)V", "component3", "()Ljava/lang/String;", "component4", "()Lcom/avito/android/beduin/network/model/BeduinTitleAlignment;", "component1", "component2", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;Lcom/avito/android/beduin/network/model/BeduinTitleAlignment;)Lcom/avito/android/beduin/common/action/ScreenTitle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "Lcom/avito/android/beduin/network/model/BeduinTitleAlignment;", "getAlignment", "alignment", "getStyle", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ScreenTitle implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ScreenTitle> CREATOR = new a();

    @com.google.gson.annotations.c("alignment")
    @l
    private final BeduinTitleAlignment _alignment;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String _style;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final String text;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final BeduinComponentTheme theme;

    /* compiled from: BeduinOpenUniversalPageV2Action.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ScreenTitle> {
        @Override // android.os.Parcelable.Creator
        public final ScreenTitle createFromParcel(Parcel parcel) {
            return new ScreenTitle(parcel.readString(), parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? BeduinTitleAlignment.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ScreenTitle[] newArray(int i12) {
            return new ScreenTitle[i12];
        }
    }

    public ScreenTitle(@Y61.k String str, @l BeduinComponentTheme beduinComponentTheme, @l String str2, @l BeduinTitleAlignment beduinTitleAlignment) {
        this.text = str;
        this.theme = beduinComponentTheme;
        this._style = str2;
        this._alignment = beduinTitleAlignment;
    }

    /* renamed from: component3, reason: from getter */
    private final String get_style() {
        return this._style;
    }

    /* renamed from: component4, reason: from getter */
    private final BeduinTitleAlignment get_alignment() {
        return this._alignment;
    }

    public static /* synthetic */ ScreenTitle copy$default(ScreenTitle screenTitle, String str, BeduinComponentTheme beduinComponentTheme, String str2, BeduinTitleAlignment beduinTitleAlignment, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = screenTitle.text;
        }
        if ((i12 & 2) != 0) {
            beduinComponentTheme = screenTitle.theme;
        }
        if ((i12 & 4) != 0) {
            str2 = screenTitle._style;
        }
        if ((i12 & 8) != 0) {
            beduinTitleAlignment = screenTitle._alignment;
        }
        return screenTitle.copy(str, beduinComponentTheme, str2, beduinTitleAlignment);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @Y61.k
    public final ScreenTitle copy(@Y61.k String text, @l BeduinComponentTheme theme, @l String _style, @l BeduinTitleAlignment _alignment) {
        return new ScreenTitle(text, theme, _style, _alignment);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenTitle)) {
            return false;
        }
        ScreenTitle screenTitle = (ScreenTitle) other;
        return L.f(this.text, screenTitle.text) && this.theme == screenTitle.theme && L.f(this._style, screenTitle._style) && this._alignment == screenTitle._alignment;
    }

    @Y61.k
    public final BeduinTitleAlignment getAlignment() {
        BeduinTitleAlignment beduinTitleAlignment = this._alignment;
        if (beduinTitleAlignment != null) {
            return beduinTitleAlignment;
        }
        BeduinTitleAlignment.f104010b.getClass();
        return BeduinTitleAlignment.f104011c;
    }

    @Y61.k
    public final String getStyle() {
        String str = this._style;
        return str == null ? "h5" : str;
    }

    @Y61.k
    public final String getText() {
        return this.text;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode2 = (iHashCode + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        String str = this._style;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BeduinTitleAlignment beduinTitleAlignment = this._alignment;
        return iHashCode3 + (beduinTitleAlignment != null ? beduinTitleAlignment.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        return "ScreenTitle(text=" + this.text + ", theme=" + this.theme + ", _style=" + this._style + ", _alignment=" + this._alignment + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        parcel.writeString(this._style);
        BeduinTitleAlignment beduinTitleAlignment = this._alignment;
        if (beduinTitleAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinTitleAlignment.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ ScreenTitle(String str, BeduinComponentTheme beduinComponentTheme, String str2, BeduinTitleAlignment beduinTitleAlignment, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : beduinComponentTheme, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : beduinTitleAlignment);
    }
}
