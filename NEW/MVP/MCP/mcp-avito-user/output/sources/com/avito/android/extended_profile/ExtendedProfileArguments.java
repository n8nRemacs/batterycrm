package com.avito.android.extended_profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.FloatingBuyBlock;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExtendedProfileArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/ExtendedProfileArguments;", "Landroid/os/Parcelable;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f149278b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f149279c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final SearchParams f149280d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f149281e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final FloatingBuyBlock f149282f;

    /* compiled from: ExtendedProfileArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileArguments> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileArguments createFromParcel(Parcel parcel) {
            return new ExtendedProfileArguments((FloatingBuyBlock) parcel.readParcelable(ExtendedProfileArguments.class.getClassLoader()), (SearchParams) parcel.readParcelable(ExtendedProfileArguments.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileArguments[] newArray(int i12) {
            return new ExtendedProfileArguments[i12];
        }
    }

    public ExtendedProfileArguments(@Y61.l FloatingBuyBlock floatingBuyBlock, @Y61.l SearchParams searchParams, @Y61.k String str, @Y61.l String str2, boolean z12) {
        this.f149278b = str;
        this.f149279c = str2;
        this.f149280d = searchParams;
        this.f149281e = z12;
        this.f149282f = floatingBuyBlock;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileArguments)) {
            return false;
        }
        ExtendedProfileArguments extendedProfileArguments = (ExtendedProfileArguments) obj;
        return kotlin.jvm.internal.L.f(this.f149278b, extendedProfileArguments.f149278b) && kotlin.jvm.internal.L.f(this.f149279c, extendedProfileArguments.f149279c) && kotlin.jvm.internal.L.f(this.f149280d, extendedProfileArguments.f149280d) && this.f149281e == extendedProfileArguments.f149281e && kotlin.jvm.internal.L.f(this.f149282f, extendedProfileArguments.f149282f);
    }

    public final int hashCode() {
        int iHashCode = this.f149278b.hashCode() * 31;
        String str = this.f149279c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SearchParams searchParams = this.f149280d;
        int i12 = androidx.appcompat.app.r.i((iHashCode2 + (searchParams == null ? 0 : searchParams.hashCode())) * 31, 31, this.f149281e);
        FloatingBuyBlock floatingBuyBlock = this.f149282f;
        return i12 + (floatingBuyBlock != null ? floatingBuyBlock.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ExtendedProfileArguments(userKey=" + this.f149278b + ", contextId=" + this.f149279c + ", searchParams=" + this.f149280d + ", withProfileTabs=" + this.f149281e + ", floatingBuyBlock=" + this.f149282f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f149278b);
        parcel.writeString(this.f149279c);
        parcel.writeParcelable(this.f149280d, i12);
        parcel.writeInt(this.f149281e ? 1 : 0);
        parcel.writeParcelable(this.f149282f, i12);
    }

    public /* synthetic */ ExtendedProfileArguments(String str, String str2, SearchParams searchParams, boolean z12, FloatingBuyBlock floatingBuyBlock, int i12, C42822w c42822w) {
        this((i12 & 16) != 0 ? null : floatingBuyBlock, searchParams, str, str2, z12);
    }
}
