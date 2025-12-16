package com.avito.android.beduin.common.component.model.icon;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IconBase64.kt */
@d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "Landroid/os/Parcelable;", "", "iconBase64", "iconBase64Dark", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIconBase64", "getIconBase64Dark", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class IconBase64 implements Parcelable {

    @k
    public static final Parcelable.Creator<IconBase64> CREATOR = new a();

    @k
    private final String iconBase64;

    @l
    private final String iconBase64Dark;

    /* compiled from: IconBase64.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IconBase64> {
        @Override // android.os.Parcelable.Creator
        public final IconBase64 createFromParcel(Parcel parcel) {
            return new IconBase64(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IconBase64[] newArray(int i12) {
            return new IconBase64[i12];
        }
    }

    public IconBase64(@k String str, @l String str2) {
        this.iconBase64 = str;
        this.iconBase64Dark = str2;
    }

    public static /* synthetic */ IconBase64 copy$default(IconBase64 iconBase64, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = iconBase64.iconBase64;
        }
        if ((i12 & 2) != 0) {
            str2 = iconBase64.iconBase64Dark;
        }
        return iconBase64.copy(str, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getIconBase64() {
        return this.iconBase64;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getIconBase64Dark() {
        return this.iconBase64Dark;
    }

    @k
    public final IconBase64 copy(@k String iconBase64, @l String iconBase64Dark) {
        return new IconBase64(iconBase64, iconBase64Dark);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconBase64)) {
            return false;
        }
        IconBase64 iconBase64 = (IconBase64) other;
        return L.f(this.iconBase64, iconBase64.iconBase64) && L.f(this.iconBase64Dark, iconBase64.iconBase64Dark);
    }

    @k
    public final String getIconBase64() {
        return this.iconBase64;
    }

    @l
    public final String getIconBase64Dark() {
        return this.iconBase64Dark;
    }

    public int hashCode() {
        int iHashCode = this.iconBase64.hashCode() * 31;
        String str = this.iconBase64Dark;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IconBase64(iconBase64=");
        sb2.append(this.iconBase64);
        sb2.append(", iconBase64Dark=");
        return C22026a.c(sb2, this.iconBase64Dark, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.iconBase64);
        parcel.writeString(this.iconBase64Dark);
    }
}
