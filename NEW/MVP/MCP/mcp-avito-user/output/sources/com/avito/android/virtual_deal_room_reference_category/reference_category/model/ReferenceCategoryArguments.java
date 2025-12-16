package com.avito.android.virtual_deal_room_reference_category.reference_category.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReferenceCategoryArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/reference_category/model/ReferenceCategoryArguments;", "Landroid/os/Parcelable;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ReferenceCategoryArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ReferenceCategoryArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f327262b;

    /* compiled from: ReferenceCategoryArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReferenceCategoryArguments> {
        @Override // android.os.Parcelable.Creator
        public final ReferenceCategoryArguments createFromParcel(Parcel parcel) {
            return new ReferenceCategoryArguments(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReferenceCategoryArguments[] newArray(int i12) {
            return new ReferenceCategoryArguments[i12];
        }
    }

    public ReferenceCategoryArguments(@k String str) {
        this.f327262b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReferenceCategoryArguments) && L.f(this.f327262b, ((ReferenceCategoryArguments) obj).f327262b);
    }

    public final int hashCode() {
        return this.f327262b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ReferenceCategoryArguments(processId="), this.f327262b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f327262b);
    }
}
