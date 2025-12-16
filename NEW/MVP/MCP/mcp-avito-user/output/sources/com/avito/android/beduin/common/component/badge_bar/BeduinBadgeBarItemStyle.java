package com.avito.android.beduin.common.component.badge_bar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinBadgeBarModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\t¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItemStyle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "highlightedColor", "textColor", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "component3", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItemStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getHighlightedColor", "getTextColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinBadgeBarItemStyle implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinBadgeBarItemStyle> CREATOR = new a();

    @l
    private final UniversalColor backgroundColor;

    @l
    private final UniversalColor highlightedColor;

    @l
    private final UniversalColor textColor;

    /* compiled from: BeduinBadgeBarModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinBadgeBarItemStyle> {
        @Override // android.os.Parcelable.Creator
        public final BeduinBadgeBarItemStyle createFromParcel(Parcel parcel) {
            return new BeduinBadgeBarItemStyle((UniversalColor) parcel.readParcelable(BeduinBadgeBarItemStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(BeduinBadgeBarItemStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(BeduinBadgeBarItemStyle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinBadgeBarItemStyle[] newArray(int i12) {
            return new BeduinBadgeBarItemStyle[i12];
        }
    }

    public BeduinBadgeBarItemStyle(@l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalColor universalColor3) {
        this.backgroundColor = universalColor;
        this.highlightedColor = universalColor2;
        this.textColor = universalColor3;
    }

    public static /* synthetic */ BeduinBadgeBarItemStyle copy$default(BeduinBadgeBarItemStyle beduinBadgeBarItemStyle, UniversalColor universalColor, UniversalColor universalColor2, UniversalColor universalColor3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalColor = beduinBadgeBarItemStyle.backgroundColor;
        }
        if ((i12 & 2) != 0) {
            universalColor2 = beduinBadgeBarItemStyle.highlightedColor;
        }
        if ((i12 & 4) != 0) {
            universalColor3 = beduinBadgeBarItemStyle.textColor;
        }
        return beduinBadgeBarItemStyle.copy(universalColor, universalColor2, universalColor3);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getHighlightedColor() {
        return this.highlightedColor;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    @k
    public final BeduinBadgeBarItemStyle copy(@l UniversalColor backgroundColor, @l UniversalColor highlightedColor, @l UniversalColor textColor) {
        return new BeduinBadgeBarItemStyle(backgroundColor, highlightedColor, textColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinBadgeBarItemStyle)) {
            return false;
        }
        BeduinBadgeBarItemStyle beduinBadgeBarItemStyle = (BeduinBadgeBarItemStyle) other;
        return L.f(this.backgroundColor, beduinBadgeBarItemStyle.backgroundColor) && L.f(this.highlightedColor, beduinBadgeBarItemStyle.highlightedColor) && L.f(this.textColor, beduinBadgeBarItemStyle.textColor);
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final UniversalColor getHighlightedColor() {
        return this.highlightedColor;
    }

    @l
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
        UniversalColor universalColor2 = this.highlightedColor;
        int iHashCode2 = (iHashCode + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        UniversalColor universalColor3 = this.textColor;
        return iHashCode2 + (universalColor3 != null ? universalColor3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinBadgeBarItemStyle(backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", highlightedColor=");
        sb2.append(this.highlightedColor);
        sb2.append(", textColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.textColor, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.highlightedColor, flags);
        parcel.writeParcelable(this.textColor, flags);
    }
}
