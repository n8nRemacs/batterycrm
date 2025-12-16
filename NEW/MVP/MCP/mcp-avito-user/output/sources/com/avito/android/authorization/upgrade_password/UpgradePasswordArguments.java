package com.avito.android.authorization.upgrade_password;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UpgradePasswordArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/upgrade_password/UpgradePasswordArguments;", "Landroid/os/Parcelable;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UpgradePasswordArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<UpgradePasswordArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f94764b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f94765c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f94766d;

    /* compiled from: UpgradePasswordArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UpgradePasswordArguments> {
        @Override // android.os.Parcelable.Creator
        public final UpgradePasswordArguments createFromParcel(Parcel parcel) {
            return new UpgradePasswordArguments(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UpgradePasswordArguments[] newArray(int i12) {
            return new UpgradePasswordArguments[i12];
        }
    }

    public UpgradePasswordArguments(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this.f94764b = str;
        this.f94765c = str2;
        this.f94766d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpgradePasswordArguments)) {
            return false;
        }
        UpgradePasswordArguments upgradePasswordArguments = (UpgradePasswordArguments) obj;
        return L.f(this.f94764b, upgradePasswordArguments.f94764b) && L.f(this.f94765c, upgradePasswordArguments.f94765c) && L.f(this.f94766d, upgradePasswordArguments.f94766d);
    }

    public final int hashCode() {
        String str = this.f94764b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f94765c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f94766d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpgradePasswordArguments(description=");
        sb2.append(this.f94764b);
        sb2.append(", contextId=");
        sb2.append(this.f94765c);
        sb2.append(", login=");
        return C22026a.c(sb2, this.f94766d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f94764b);
        parcel.writeString(this.f94765c);
        parcel.writeString(this.f94766d);
    }

    public /* synthetic */ UpgradePasswordArguments(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3);
    }
}
