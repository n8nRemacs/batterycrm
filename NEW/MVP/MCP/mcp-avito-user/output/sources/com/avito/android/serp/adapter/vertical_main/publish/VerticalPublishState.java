package com.avito.android.serp.adapter.vertical_main.publish;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.vertical_main.VerticalPublishData;
import kotlin.Metadata;

/* compiled from: VerticalPublishPresenter.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/publish/VerticalPublishState;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VerticalPublishState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<VerticalPublishState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VerticalPublishData f273084b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Parcelable f273085c;

    /* compiled from: VerticalPublishPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerticalPublishState> {
        @Override // android.os.Parcelable.Creator
        public final VerticalPublishState createFromParcel(Parcel parcel) {
            return new VerticalPublishState(VerticalPublishData.CREATOR.createFromParcel(parcel), parcel.readParcelable(VerticalPublishState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VerticalPublishState[] newArray(int i12) {
            return new VerticalPublishState[i12];
        }
    }

    public VerticalPublishState(@Y61.k VerticalPublishData verticalPublishData, @Y61.l Parcelable parcelable) {
        this.f273084b = verticalPublishData;
        this.f273085c = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f273084b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f273085c, i12);
    }
}
