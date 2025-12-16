package com.avito.android.beduin.common.component.model.icon;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.image.BeduinImageScaleType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LocalIcon.kt */
@d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "Landroid/os/Parcelable;", "", "name", "color", "Lcom/avito/android/remote/model/UniversalColor;", "dynamicColor", "Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;", "scaleType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "component4", "()Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;)Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getColor", "Lcom/avito/android/remote/model/UniversalColor;", "getDynamicColor", "Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;", "getScaleType", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LocalIcon implements Parcelable {

    @k
    public static final Parcelable.Creator<LocalIcon> CREATOR = new a();

    @l
    private final String color;

    @l
    private final UniversalColor dynamicColor;

    @k
    private final String name;

    @l
    private final BeduinImageScaleType scaleType;

    /* compiled from: LocalIcon.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocalIcon> {
        @Override // android.os.Parcelable.Creator
        public final LocalIcon createFromParcel(Parcel parcel) {
            return new LocalIcon(parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(LocalIcon.class.getClassLoader()), parcel.readInt() == 0 ? null : BeduinImageScaleType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final LocalIcon[] newArray(int i12) {
            return new LocalIcon[i12];
        }
    }

    public LocalIcon(@k String str, @l String str2, @l UniversalColor universalColor, @l BeduinImageScaleType beduinImageScaleType) {
        this.name = str;
        this.color = str2;
        this.dynamicColor = universalColor;
        this.scaleType = beduinImageScaleType;
    }

    public static /* synthetic */ LocalIcon copy$default(LocalIcon localIcon, String str, String str2, UniversalColor universalColor, BeduinImageScaleType beduinImageScaleType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = localIcon.name;
        }
        if ((i12 & 2) != 0) {
            str2 = localIcon.color;
        }
        if ((i12 & 4) != 0) {
            universalColor = localIcon.dynamicColor;
        }
        if ((i12 & 8) != 0) {
            beduinImageScaleType = localIcon.scaleType;
        }
        return localIcon.copy(str, str2, universalColor, beduinImageScaleType);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getDynamicColor() {
        return this.dynamicColor;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final BeduinImageScaleType getScaleType() {
        return this.scaleType;
    }

    @k
    public final LocalIcon copy(@k String name, @l String color, @l UniversalColor dynamicColor, @l BeduinImageScaleType scaleType) {
        return new LocalIcon(name, color, dynamicColor, scaleType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalIcon)) {
            return false;
        }
        LocalIcon localIcon = (LocalIcon) other;
        return L.f(this.name, localIcon.name) && L.f(this.color, localIcon.color) && L.f(this.dynamicColor, localIcon.dynamicColor) && this.scaleType == localIcon.scaleType;
    }

    @l
    public final String getColor() {
        return this.color;
    }

    @l
    public final UniversalColor getDynamicColor() {
        return this.dynamicColor;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final BeduinImageScaleType getScaleType() {
        return this.scaleType;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.color;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UniversalColor universalColor = this.dynamicColor;
        int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        BeduinImageScaleType beduinImageScaleType = this.scaleType;
        return iHashCode3 + (beduinImageScaleType != null ? beduinImageScaleType.hashCode() : 0);
    }

    @k
    public String toString() {
        return "LocalIcon(name=" + this.name + ", color=" + this.color + ", dynamicColor=" + this.dynamicColor + ", scaleType=" + this.scaleType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeString(this.color);
        parcel.writeParcelable(this.dynamicColor, flags);
        BeduinImageScaleType beduinImageScaleType = this.scaleType;
        if (beduinImageScaleType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(beduinImageScaleType.name());
        }
    }

    public /* synthetic */ LocalIcon(String str, String str2, UniversalColor universalColor, BeduinImageScaleType beduinImageScaleType, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : universalColor, (i12 & 8) != 0 ? null : beduinImageScaleType);
    }
}
