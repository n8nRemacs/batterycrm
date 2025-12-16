package com.avito.android.paid_services.routing;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: DialogInfo.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/paid_services/routing/DialogInfo;", "Landroid/os/Parcelable;", "_avito_paid-services_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DialogInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<DialogInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f210619b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f210620c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f210621d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final BarInfo f210622e;

    /* compiled from: DialogInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DialogInfo> {
        @Override // android.os.Parcelable.Creator
        public final DialogInfo createFromParcel(Parcel parcel) {
            return new DialogInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BarInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DialogInfo[] newArray(int i12) {
            return new DialogInfo[i12];
        }
    }

    public DialogInfo(@k String str, @l String str2, @k String str3, @l BarInfo barInfo) {
        this.f210619b = str;
        this.f210620c = str2;
        this.f210621d = str3;
        this.f210622e = barInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f210619b);
        parcel.writeString(this.f210620c);
        parcel.writeString(this.f210621d);
        BarInfo barInfo = this.f210622e;
        if (barInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            barInfo.writeToParcel(parcel, i12);
        }
    }
}
