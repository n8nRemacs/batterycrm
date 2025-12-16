package com.avito.android.mortgage_category.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MortgageCategoryArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_category/model/MortgageCategoryArguments;", "Landroid/os/Parcelable;", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MortgageCategoryArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageCategoryArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f204911b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f204912c;

    /* compiled from: MortgageCategoryArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageCategoryArguments> {
        @Override // android.os.Parcelable.Creator
        public final MortgageCategoryArguments createFromParcel(Parcel parcel) {
            return new MortgageCategoryArguments(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageCategoryArguments[] newArray(int i12) {
            return new MortgageCategoryArguments[i12];
        }
    }

    public MortgageCategoryArguments(@k String str, @k String str2) {
        this.f204911b = str;
        this.f204912c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageCategoryArguments)) {
            return false;
        }
        MortgageCategoryArguments mortgageCategoryArguments = (MortgageCategoryArguments) obj;
        return L.f(this.f204911b, mortgageCategoryArguments.f204911b) && L.f(this.f204912c, mortgageCategoryArguments.f204912c);
    }

    public final int hashCode() {
        return this.f204912c.hashCode() + (this.f204911b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageCategoryArguments(processId=");
        sb2.append(this.f204911b);
        sb2.append(", sourceType=");
        return C22026a.c(sb2, this.f204912c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f204911b);
        parcel.writeString(this.f204912c);
    }

    public /* synthetic */ MortgageCategoryArguments(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? "virtual_deal_room" : str2);
    }
}
