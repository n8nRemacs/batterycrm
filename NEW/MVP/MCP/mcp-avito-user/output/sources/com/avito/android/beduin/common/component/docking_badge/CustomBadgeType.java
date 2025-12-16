package com.avito.android.beduin.common.component.docking_badge;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: CustomBadgeType.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/beduin/common/component/docking_badge/CustomBadgeType;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "textColor", "", "textStyle", "", "textVerticalOffset", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/Float;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Float;", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/Float;)Lcom/avito/android/beduin/common/component/docking_badge/CustomBadgeType;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getTextColor", "Ljava/lang/String;", "getTextStyle", "Ljava/lang/Float;", "getTextVerticalOffset", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CustomBadgeType implements Parcelable {

    @k
    public static final Parcelable.Creator<CustomBadgeType> CREATOR = new a();

    @k
    private final UniversalColor backgroundColor;

    @k
    private final UniversalColor textColor;

    @l
    private final String textStyle;

    @l
    private final Float textVerticalOffset;

    /* compiled from: CustomBadgeType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CustomBadgeType> {
        @Override // android.os.Parcelable.Creator
        public final CustomBadgeType createFromParcel(Parcel parcel) {
            return new CustomBadgeType((UniversalColor) parcel.readParcelable(CustomBadgeType.class.getClassLoader()), (UniversalColor) parcel.readParcelable(CustomBadgeType.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final CustomBadgeType[] newArray(int i12) {
            return new CustomBadgeType[i12];
        }
    }

    public CustomBadgeType(@k UniversalColor universalColor, @k UniversalColor universalColor2, @l String str, @l Float f12) {
        this.backgroundColor = universalColor;
        this.textColor = universalColor2;
        this.textStyle = str;
        this.textVerticalOffset = f12;
    }

    public static /* synthetic */ CustomBadgeType copy$default(CustomBadgeType customBadgeType, UniversalColor universalColor, UniversalColor universalColor2, String str, Float f12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalColor = customBadgeType.backgroundColor;
        }
        if ((i12 & 2) != 0) {
            universalColor2 = customBadgeType.textColor;
        }
        if ((i12 & 4) != 0) {
            str = customBadgeType.textStyle;
        }
        if ((i12 & 8) != 0) {
            f12 = customBadgeType.textVerticalOffset;
        }
        return customBadgeType.copy(universalColor, universalColor2, str, f12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getTextStyle() {
        return this.textStyle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Float getTextVerticalOffset() {
        return this.textVerticalOffset;
    }

    @k
    public final CustomBadgeType copy(@k UniversalColor backgroundColor, @k UniversalColor textColor, @l String textStyle, @l Float textVerticalOffset) {
        return new CustomBadgeType(backgroundColor, textColor, textStyle, textVerticalOffset);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomBadgeType)) {
            return false;
        }
        CustomBadgeType customBadgeType = (CustomBadgeType) other;
        return L.f(this.backgroundColor, customBadgeType.backgroundColor) && L.f(this.textColor, customBadgeType.textColor) && L.f(this.textStyle, customBadgeType.textStyle) && L.f(this.textVerticalOffset, customBadgeType.textVerticalOffset);
    }

    @k
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @k
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    @l
    public final String getTextStyle() {
        return this.textStyle;
    }

    @l
    public final Float getTextVerticalOffset() {
        return this.textVerticalOffset;
    }

    public int hashCode() {
        int i12 = com.avito.android.actions_sheet.a.i(this.textColor, this.backgroundColor.hashCode() * 31, 31);
        String str = this.textStyle;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        Float f12 = this.textVerticalOffset;
        return iHashCode + (f12 != null ? f12.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CustomBadgeType(backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", textColor=");
        sb2.append(this.textColor);
        sb2.append(", textStyle=");
        sb2.append(this.textStyle);
        sb2.append(", textVerticalOffset=");
        return h.d(sb2, this.textVerticalOffset, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.textColor, flags);
        parcel.writeString(this.textStyle);
        Float f12 = this.textVerticalOffset;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
    }
}
