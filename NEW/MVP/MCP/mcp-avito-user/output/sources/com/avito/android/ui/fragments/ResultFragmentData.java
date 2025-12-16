package com.avito.android.ui.fragments;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ResultFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/fragments/ResultFragmentData;", "Landroid/os/Parcelable;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ResultFragmentData implements Parcelable {

    @k
    public static final Parcelable.Creator<ResultFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f304609b;

    /* renamed from: c, reason: collision with root package name */
    public final int f304610c;

    /* compiled from: ResultFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ResultFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final ResultFragmentData createFromParcel(Parcel parcel) {
            return new ResultFragmentData(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ResultFragmentData[] newArray(int i12) {
            return new ResultFragmentData[i12];
        }
    }

    public ResultFragmentData(@k String str, int i12) {
        this.f304609b = str;
        this.f304610c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f304609b);
        parcel.writeInt(this.f304610c);
    }
}
