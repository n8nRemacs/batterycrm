package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InfoSection.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/PlaqueIcon;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "tint", "", "value", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "c", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PlaqueIcon implements Parcelable {

    @k
    public static final Parcelable.Creator<PlaqueIcon> CREATOR = new a();

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("tint")
    @l
    private final UniversalColor tint;

    @c("value")
    @l
    private final String value;

    /* compiled from: InfoSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PlaqueIcon> {
        @Override // android.os.Parcelable.Creator
        public final PlaqueIcon createFromParcel(Parcel parcel) {
            return new PlaqueIcon((UniversalColor) parcel.readParcelable(PlaqueIcon.class.getClassLoader()), (UniversalColor) parcel.readParcelable(PlaqueIcon.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PlaqueIcon[] newArray(int i12) {
            return new PlaqueIcon[i12];
        }
    }

    public PlaqueIcon(@l UniversalColor universalColor, @l UniversalColor universalColor2, @l String str) {
        this.backgroundColor = universalColor;
        this.tint = universalColor2;
        this.value = str;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final UniversalColor getTint() {
        return this.tint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaqueIcon)) {
            return false;
        }
        PlaqueIcon plaqueIcon = (PlaqueIcon) obj;
        return L.f(this.backgroundColor, plaqueIcon.backgroundColor) && L.f(this.tint, plaqueIcon.tint) && L.f(this.value, plaqueIcon.value);
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
        UniversalColor universalColor2 = this.tint;
        int iHashCode2 = (iHashCode + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        String str = this.value;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaqueIcon(backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", tint=");
        sb2.append(this.tint);
        sb2.append(", value=");
        return C22026a.c(sb2, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.backgroundColor, i12);
        parcel.writeParcelable(this.tint, i12);
        parcel.writeString(this.value);
    }
}
