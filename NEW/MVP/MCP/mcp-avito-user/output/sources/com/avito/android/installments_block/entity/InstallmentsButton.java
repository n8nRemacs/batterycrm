package com.avito.android.installments_block.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsButton.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsButton;", "Landroid/os/Parcelable;", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InstallmentsButton implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f172850b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f172851c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f172852d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f172853e;

    /* compiled from: InstallmentsButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsButton> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsButton createFromParcel(Parcel parcel) {
            return new InstallmentsButton(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(InstallmentsButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsButton[] newArray(int i12) {
            return new InstallmentsButton[i12];
        }
    }

    public InstallmentsButton(@l Integer num, @k String str, @k String str2, @l DeepLink deepLink) {
        this.f172850b = num;
        this.f172851c = str;
        this.f172852d = str2;
        this.f172853e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsButton)) {
            return false;
        }
        InstallmentsButton installmentsButton = (InstallmentsButton) obj;
        return L.f(this.f172850b, installmentsButton.f172850b) && L.f(this.f172851c, installmentsButton.f172851c) && L.f(this.f172852d, installmentsButton.f172852d) && L.f(this.f172853e, installmentsButton.f172853e);
    }

    public final int hashCode() {
        Integer num = this.f172850b;
        int iD2 = H.d(H.d((num == null ? 0 : num.hashCode()) * 31, 31, this.f172851c), 31, this.f172852d);
        DeepLink deepLink = this.f172853e;
        return iD2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsButton(id=");
        sb2.append(this.f172850b);
        sb2.append(", title=");
        sb2.append(this.f172851c);
        sb2.append(", style=");
        sb2.append(this.f172852d);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f172853e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.f172850b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f172851c);
        parcel.writeString(this.f172852d);
        parcel.writeParcelable(this.f172853e, i12);
    }
}
