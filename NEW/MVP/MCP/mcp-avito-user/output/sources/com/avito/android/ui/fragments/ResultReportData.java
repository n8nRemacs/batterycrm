package com.avito.android.ui.fragments;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ResultReportData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/fragments/ResultReportData;", "Landroid/os/Parcelable;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ResultReportData implements Parcelable {

    @k
    public static final Parcelable.Creator<ResultReportData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f304611b;

    /* renamed from: c, reason: collision with root package name */
    public final int f304612c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Intent f304613d;

    /* compiled from: ResultReportData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ResultReportData> {
        @Override // android.os.Parcelable.Creator
        public final ResultReportData createFromParcel(Parcel parcel) {
            return new ResultReportData(parcel.readInt(), parcel.readInt(), (Intent) parcel.readParcelable(ResultReportData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ResultReportData[] newArray(int i12) {
            return new ResultReportData[i12];
        }
    }

    public ResultReportData(int i12, int i13, @l Intent intent) {
        this.f304611b = i12;
        this.f304612c = i13;
        this.f304613d = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f304611b);
        parcel.writeInt(this.f304612c);
        parcel.writeParcelable(this.f304613d, i12);
    }
}
