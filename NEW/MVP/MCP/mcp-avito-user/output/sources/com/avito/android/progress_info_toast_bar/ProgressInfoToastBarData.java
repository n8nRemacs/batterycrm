package com.avito.android.progress_info_toast_bar;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import kotlin.Metadata;

/* compiled from: ProgressInfoToastBarData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/ProgressInfoToastBarData;", "Landroid/os/Parcelable;", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProgressInfoToastBarData implements Parcelable {

    @k
    public static final Parcelable.Creator<ProgressInfoToastBarData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f231493b;

    /* renamed from: c, reason: collision with root package name */
    public final int f231494c;

    /* renamed from: d, reason: collision with root package name */
    public final int f231495d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f231496e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f231497f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ProgressInfoToastBarPresenter.RequestType f231498g;

    /* compiled from: ProgressInfoToastBarData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProgressInfoToastBarData> {
        @Override // android.os.Parcelable.Creator
        public final ProgressInfoToastBarData createFromParcel(Parcel parcel) {
            return new ProgressInfoToastBarData(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), ProgressInfoToastBarPresenter.RequestType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProgressInfoToastBarData[] newArray(int i12) {
            return new ProgressInfoToastBarData[i12];
        }
    }

    public ProgressInfoToastBarData(@k String str, int i12, int i13, @k String str2, @k String str3, @k ProgressInfoToastBarPresenter.RequestType requestType) {
        this.f231493b = str;
        this.f231494c = i12;
        this.f231495d = i13;
        this.f231496e = str2;
        this.f231497f = str3;
        this.f231498g = requestType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f231493b);
        parcel.writeInt(this.f231494c);
        parcel.writeInt(this.f231495d);
        parcel.writeString(this.f231496e);
        parcel.writeString(this.f231497f);
        parcel.writeString(this.f231498g.name());
    }
}
