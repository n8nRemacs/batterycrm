package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.vertical_main.VerticalFilterData;
import kotlin.Metadata;

/* compiled from: VerticalFilterPresenterImpl.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/VerticalFilterState;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VerticalFilterState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<VerticalFilterState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VerticalFilterData f273423b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Parcelable f273424c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f273425d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f273426e;

    /* compiled from: VerticalFilterPresenterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerticalFilterState> {
        @Override // android.os.Parcelable.Creator
        public final VerticalFilterState createFromParcel(Parcel parcel) {
            return new VerticalFilterState(VerticalFilterData.CREATOR.createFromParcel(parcel), parcel.readParcelable(VerticalFilterState.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VerticalFilterState[] newArray(int i12) {
            return new VerticalFilterState[i12];
        }
    }

    public VerticalFilterState(@Y61.k VerticalFilterData verticalFilterData, @Y61.l Parcelable parcelable, boolean z12, @Y61.l String str) {
        this.f273423b = verticalFilterData;
        this.f273424c = parcelable;
        this.f273425d = z12;
        this.f273426e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f273423b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f273424c, i12);
        parcel.writeInt(this.f273425d ? 1 : 0);
        parcel.writeString(this.f273426e);
    }
}
