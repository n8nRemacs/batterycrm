package com.avito.android.change_specific;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileChangeSpecificArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/change_specific/ExtendedProfileChangeSpecificArguments;", "Landroid/os/Parcelable;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ExtendedProfileChangeSpecificArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileChangeSpecificArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f117866b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f117867c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f117868d;

    /* compiled from: ExtendedProfileChangeSpecificArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileChangeSpecificArguments> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileChangeSpecificArguments createFromParcel(Parcel parcel) {
            return new ExtendedProfileChangeSpecificArguments(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileChangeSpecificArguments[] newArray(int i12) {
            return new ExtendedProfileChangeSpecificArguments[i12];
        }
    }

    public ExtendedProfileChangeSpecificArguments(boolean z12, @Y61.l Integer num, @Y61.l Integer num2) {
        this.f117866b = z12;
        this.f117867c = num;
        this.f117868d = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileChangeSpecificArguments)) {
            return false;
        }
        ExtendedProfileChangeSpecificArguments extendedProfileChangeSpecificArguments = (ExtendedProfileChangeSpecificArguments) obj;
        return this.f117866b == extendedProfileChangeSpecificArguments.f117866b && L.f(this.f117867c, extendedProfileChangeSpecificArguments.f117867c) && L.f(this.f117868d, extendedProfileChangeSpecificArguments.f117868d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f117866b) * 31;
        Integer num = this.f117867c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f117868d;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileChangeSpecificArguments(onlySelect=");
        sb2.append(this.f117866b);
        sb2.append(", selectedVerticalId=");
        sb2.append(this.f117867c);
        sb2.append(", selectedSpecificId=");
        return s.j(sb2, this.f117868d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f117866b ? 1 : 0);
        Integer num = this.f117867c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f117868d;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
    }
}
