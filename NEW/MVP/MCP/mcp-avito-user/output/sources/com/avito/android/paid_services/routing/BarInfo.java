package com.avito.android.paid_services.routing;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BarInfo.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/paid_services/routing/BarInfo;", "Landroid/os/Parcelable;", "_avito_paid-services_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BarInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<BarInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f210612b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f210613c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TariffCountStatus f210614d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Float f210615e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ProgressState f210616f;

    /* renamed from: g, reason: collision with root package name */
    public final float f210617g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ProgressState f210618h;

    /* compiled from: BarInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BarInfo> {
        @Override // android.os.Parcelable.Creator
        public final BarInfo createFromParcel(Parcel parcel) {
            return new BarInfo(parcel.readString(), parcel.readString(), TariffCountStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : ProgressState.valueOf(parcel.readString()), parcel.readFloat(), ProgressState.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BarInfo[] newArray(int i12) {
            return new BarInfo[i12];
        }
    }

    public BarInfo(@k String str, @l String str2, @k TariffCountStatus tariffCountStatus, @l Float f12, @l ProgressState progressState, float f13, @k ProgressState progressState2) {
        this.f210612b = str;
        this.f210613c = str2;
        this.f210614d = tariffCountStatus;
        this.f210615e = f12;
        this.f210616f = progressState;
        this.f210617g = f13;
        this.f210618h = progressState2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f210612b);
        parcel.writeString(this.f210613c);
        parcel.writeString(this.f210614d.name());
        Float f12 = this.f210615e;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        ProgressState progressState = this.f210616f;
        if (progressState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(progressState.name());
        }
        parcel.writeFloat(this.f210617g);
        parcel.writeString(this.f210618h.name());
    }

    public /* synthetic */ BarInfo(String str, String str2, TariffCountStatus tariffCountStatus, Float f12, ProgressState progressState, float f13, ProgressState progressState2, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? TariffCountStatus.f210627b : tariffCountStatus, f12, progressState, f13, progressState2);
    }
}
