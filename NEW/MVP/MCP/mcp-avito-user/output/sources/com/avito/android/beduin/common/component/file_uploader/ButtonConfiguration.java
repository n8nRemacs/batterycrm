package com.avito.android.beduin.common.component.file_uploader;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.model.icon.IconPosition;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinFileUploaderModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJh\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b)\u0010$J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b3\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\u001cR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u00107R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010\u001eR\u0011\u0010;\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b:\u0010\u0013R\u0011\u0010<\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010?\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b>\u0010\u0015¨\u0006@"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/ButtonConfiguration;", "Landroid/os/Parcelable;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "_theme", "title", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "localIcon", "Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "_iconPosition", "", "_isEnabled", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/IconPosition;Ljava/lang/Boolean;Ljava/util/List;)V", "component2", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component5", "()Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "component6", "()Ljava/lang/Boolean;", "component1", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/IconPosition;Ljava/lang/Boolean;Ljava/util/List;)Lcom/avito/android/beduin/common/component/file_uploader/ButtonConfiguration;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStyle", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTitle", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getLocalIcon", "Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "Ljava/lang/Boolean;", "Ljava/util/List;", "getActions", "getTheme", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "isEnabled", "()Z", "getIconPosition", "iconPosition", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ButtonConfiguration implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ButtonConfiguration> CREATOR = new a();

    @com.google.gson.annotations.c("iconPosition")
    @Y61.l
    private final IconPosition _iconPosition;

    @com.google.gson.annotations.c("isEnabled")
    @Y61.l
    private final Boolean _isEnabled;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @Y61.l
    private final BeduinComponentTheme _theme;

    @com.google.gson.annotations.c("actions")
    @Y61.l
    private final List<BeduinAction> actions;

    @com.google.gson.annotations.c("localIcon")
    @Y61.l
    private final LocalIcon localIcon;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.k
    private final String style;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ButtonConfiguration> {
        @Override // android.os.Parcelable.Creator
        public final ButtonConfiguration createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            ArrayList arrayList = null;
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            LocalIcon localIconCreateFromParcel = parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel);
            IconPosition iconPositionValueOf = parcel.readInt() == 0 ? null : IconPosition.valueOf(parcel.readString());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ButtonConfiguration.class, parcel, arrayList, iL2, 1);
                }
            }
            return new ButtonConfiguration(string, beduinComponentThemeCreateFromParcel, string2, localIconCreateFromParcel, iconPositionValueOf, boolValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonConfiguration[] newArray(int i12) {
            return new ButtonConfiguration[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ButtonConfiguration(@Y61.k String str, @Y61.l BeduinComponentTheme beduinComponentTheme, @Y61.l String str2, @Y61.l LocalIcon localIcon, @Y61.l IconPosition iconPosition, @Y61.l Boolean bool, @Y61.l List<? extends BeduinAction> list) {
        this.style = str;
        this._theme = beduinComponentTheme;
        this.title = str2;
        this.localIcon = localIcon;
        this._iconPosition = iconPosition;
        this._isEnabled = bool;
        this.actions = list;
    }

    /* renamed from: component2, reason: from getter */
    private final BeduinComponentTheme get_theme() {
        return this._theme;
    }

    /* renamed from: component5, reason: from getter */
    private final IconPosition get_iconPosition() {
        return this._iconPosition;
    }

    /* renamed from: component6, reason: from getter */
    private final Boolean get_isEnabled() {
        return this._isEnabled;
    }

    public static /* synthetic */ ButtonConfiguration copy$default(ButtonConfiguration buttonConfiguration, String str, BeduinComponentTheme beduinComponentTheme, String str2, LocalIcon localIcon, IconPosition iconPosition, Boolean bool, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = buttonConfiguration.style;
        }
        if ((i12 & 2) != 0) {
            beduinComponentTheme = buttonConfiguration._theme;
        }
        BeduinComponentTheme beduinComponentTheme2 = beduinComponentTheme;
        if ((i12 & 4) != 0) {
            str2 = buttonConfiguration.title;
        }
        String str3 = str2;
        if ((i12 & 8) != 0) {
            localIcon = buttonConfiguration.localIcon;
        }
        LocalIcon localIcon2 = localIcon;
        if ((i12 & 16) != 0) {
            iconPosition = buttonConfiguration._iconPosition;
        }
        IconPosition iconPosition2 = iconPosition;
        if ((i12 & 32) != 0) {
            bool = buttonConfiguration._isEnabled;
        }
        Boolean bool2 = bool;
        if ((i12 & 64) != 0) {
            list = buttonConfiguration.actions;
        }
        return buttonConfiguration.copy(str, beduinComponentTheme2, str3, localIcon2, iconPosition2, bool2, list);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
    }

    @Y61.l
    public final List<BeduinAction> component7() {
        return this.actions;
    }

    @Y61.k
    public final ButtonConfiguration copy(@Y61.k String style, @Y61.l BeduinComponentTheme _theme, @Y61.l String title, @Y61.l LocalIcon localIcon, @Y61.l IconPosition _iconPosition, @Y61.l Boolean _isEnabled, @Y61.l List<? extends BeduinAction> actions) {
        return new ButtonConfiguration(style, _theme, title, localIcon, _iconPosition, _isEnabled, actions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonConfiguration)) {
            return false;
        }
        ButtonConfiguration buttonConfiguration = (ButtonConfiguration) other;
        return L.f(this.style, buttonConfiguration.style) && this._theme == buttonConfiguration._theme && L.f(this.title, buttonConfiguration.title) && L.f(this.localIcon, buttonConfiguration.localIcon) && this._iconPosition == buttonConfiguration._iconPosition && L.f(this._isEnabled, buttonConfiguration._isEnabled) && L.f(this.actions, buttonConfiguration.actions);
    }

    @Y61.l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @Y61.k
    public final IconPosition getIconPosition() {
        IconPosition iconPosition = this._iconPosition;
        return iconPosition == null ? IconPosition.LEFT : iconPosition;
    }

    @Y61.l
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
    }

    @Y61.k
    public final String getStyle() {
        return this.style;
    }

    @Y61.k
    public final BeduinComponentTheme getTheme() {
        BeduinComponentTheme beduinComponentTheme = this._theme;
        return beduinComponentTheme == null ? BeduinComponentTheme.AVITO_RE_23 : beduinComponentTheme;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.style.hashCode() * 31;
        BeduinComponentTheme beduinComponentTheme = this._theme;
        int iHashCode2 = (iHashCode + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        String str = this.title;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LocalIcon localIcon = this.localIcon;
        int iHashCode4 = (iHashCode3 + (localIcon == null ? 0 : localIcon.hashCode())) * 31;
        IconPosition iconPosition = this._iconPosition;
        int iHashCode5 = (iHashCode4 + (iconPosition == null ? 0 : iconPosition.hashCode())) * 31;
        Boolean bool = this._isEnabled;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isEnabled() {
        Boolean bool = this._isEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonConfiguration(style=");
        sb2.append(this.style);
        sb2.append(", _theme=");
        sb2.append(this._theme);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", localIcon=");
        sb2.append(this.localIcon);
        sb2.append(", _iconPosition=");
        sb2.append(this._iconPosition);
        sb2.append(", _isEnabled=");
        sb2.append(this._isEnabled);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.style);
        BeduinComponentTheme beduinComponentTheme = this._theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        LocalIcon localIcon = this.localIcon;
        if (localIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localIcon.writeToParcel(parcel, flags);
        }
        IconPosition iconPosition = this._iconPosition;
        if (iconPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iconPosition.name());
        }
        Boolean bool = this._isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }
}
