package com.avito.android.passport.profile_add.create_flow.set_profile_name;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SetProfileNameArgs.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/SetProfileNameArgs;", "Landroid/os/Parcelable;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SetProfileNameArgs implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SetProfileNameArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f212032b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f212033c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f212034d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ProfileCreateExtendedFlow f212035e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f212036f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f212037g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f212038h;

    /* compiled from: SetProfileNameArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SetProfileNameArgs> {
        @Override // android.os.Parcelable.Creator
        public final SetProfileNameArgs createFromParcel(Parcel parcel) {
            return new SetProfileNameArgs(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (ProfileCreateExtendedFlow) parcel.readParcelable(SetProfileNameArgs.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SetProfileNameArgs[] newArray(int i12) {
            return new SetProfileNameArgs[i12];
        }
    }

    public SetProfileNameArgs(int i12, @Y61.l Integer num, @Y61.k String str, @Y61.k ProfileCreateExtendedFlow profileCreateExtendedFlow, @Y61.l String str2, boolean z12, @Y61.l String str3) {
        this.f212032b = i12;
        this.f212033c = num;
        this.f212034d = str;
        this.f212035e = profileCreateExtendedFlow;
        this.f212036f = str2;
        this.f212037g = z12;
        this.f212038h = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetProfileNameArgs)) {
            return false;
        }
        SetProfileNameArgs setProfileNameArgs = (SetProfileNameArgs) obj;
        return this.f212032b == setProfileNameArgs.f212032b && L.f(this.f212033c, setProfileNameArgs.f212033c) && L.f(this.f212034d, setProfileNameArgs.f212034d) && L.f(this.f212035e, setProfileNameArgs.f212035e) && L.f(this.f212036f, setProfileNameArgs.f212036f) && this.f212037g == setProfileNameArgs.f212037g && L.f(this.f212038h, setProfileNameArgs.f212038h);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f212032b) * 31;
        Integer num = this.f212033c;
        int iHashCode2 = (this.f212035e.hashCode() + H.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f212034d)) * 31;
        String str = this.f212036f;
        int i12 = r.i((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f212037g);
        String str2 = this.f212038h;
        return i12 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetProfileNameArgs(verticalId=");
        sb2.append(this.f212032b);
        sb2.append(", specificId=");
        sb2.append(this.f212033c);
        sb2.append(", constructorRequestId=");
        sb2.append(this.f212034d);
        sb2.append(", flow=");
        sb2.append(this.f212035e);
        sb2.append(", source=");
        sb2.append(this.f212036f);
        sb2.append(", alreadyHasExtendedProfile=");
        sb2.append(this.f212037g);
        sb2.append(", userHash=");
        return C22026a.c(sb2, this.f212038h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f212032b);
        Integer num = this.f212033c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f212034d);
        parcel.writeParcelable(this.f212035e, i12);
        parcel.writeString(this.f212036f);
        parcel.writeInt(this.f212037g ? 1 : 0);
        parcel.writeString(this.f212038h);
    }
}
