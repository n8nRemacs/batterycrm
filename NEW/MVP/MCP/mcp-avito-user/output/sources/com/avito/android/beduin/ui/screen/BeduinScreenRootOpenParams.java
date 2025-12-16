package com.avito.android.beduin.ui.screen;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinScreenRootOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/BeduinScreenRootOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinScreenRootOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<BeduinScreenRootOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f104094b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ScreenStyle f104095c;

    /* compiled from: BeduinScreenRootOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinScreenRootOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final BeduinScreenRootOpenParams createFromParcel(Parcel parcel) {
            return new BeduinScreenRootOpenParams(parcel.readString(), parcel.readInt() == 0 ? null : ScreenStyle.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinScreenRootOpenParams[] newArray(int i12) {
            return new BeduinScreenRootOpenParams[i12];
        }
    }

    public BeduinScreenRootOpenParams(@k String str, @l ScreenStyle screenStyle) {
        this.f104094b = str;
        this.f104095c = screenStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinScreenRootOpenParams)) {
            return false;
        }
        BeduinScreenRootOpenParams beduinScreenRootOpenParams = (BeduinScreenRootOpenParams) obj;
        return L.f(this.f104094b, beduinScreenRootOpenParams.f104094b) && this.f104095c == beduinScreenRootOpenParams.f104095c;
    }

    public final int hashCode() {
        int iHashCode = this.f104094b.hashCode() * 31;
        ScreenStyle screenStyle = this.f104095c;
        return iHashCode + (screenStyle == null ? 0 : screenStyle.hashCode());
    }

    @k
    public final String toString() {
        return "BeduinScreenRootOpenParams(url=" + this.f104094b + ", presentationStyle=" + this.f104095c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f104094b);
        ScreenStyle screenStyle = this.f104095c;
        if (screenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(screenStyle.name());
        }
    }
}
