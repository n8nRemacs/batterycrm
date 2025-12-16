package com.avito.android.beduin.common.action;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: BeduinPixelAction.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinPixelActionScreenPosition;", "Landroid/os/Parcelable;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinPixelActionScreenPosition implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BeduinPixelActionScreenPosition> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f99992b;

    /* renamed from: c, reason: collision with root package name */
    public final int f99993c;

    /* renamed from: d, reason: collision with root package name */
    public final int f99994d;

    /* compiled from: BeduinPixelAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinPixelActionScreenPosition> {
        @Override // android.os.Parcelable.Creator
        public final BeduinPixelActionScreenPosition createFromParcel(Parcel parcel) {
            return new BeduinPixelActionScreenPosition(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinPixelActionScreenPosition[] newArray(int i12) {
            return new BeduinPixelActionScreenPosition[i12];
        }
    }

    public BeduinPixelActionScreenPosition(int i12, int i13, int i14) {
        this.f99992b = i12;
        this.f99993c = i13;
        this.f99994d = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinPixelActionScreenPosition)) {
            return false;
        }
        BeduinPixelActionScreenPosition beduinPixelActionScreenPosition = (BeduinPixelActionScreenPosition) obj;
        return this.f99992b == beduinPixelActionScreenPosition.f99992b && this.f99993c == beduinPixelActionScreenPosition.f99993c && this.f99994d == beduinPixelActionScreenPosition.f99994d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f99994d) + r.e(this.f99993c, Integer.hashCode(this.f99992b) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinPixelActionScreenPosition(top=");
        sb2.append(this.f99992b);
        sb2.append(", bottom=");
        sb2.append(this.f99993c);
        sb2.append(", parentHeight=");
        return r.t(sb2, this.f99994d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f99992b);
        parcel.writeInt(this.f99993c);
        parcel.writeInt(this.f99994d);
    }
}
