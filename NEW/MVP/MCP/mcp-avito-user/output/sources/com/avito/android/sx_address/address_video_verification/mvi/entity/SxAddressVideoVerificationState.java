package com.avito.android.sx_address.address_video_verification.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.address_video_verification.domain.File;
import com.avito.android.sx_address.address_video_verification.mvi.entity.SxAddressVideoVerificationViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SxAddressVideoVerificationState.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationState;", "Landroid/os/Parcelable;", "a", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SxAddressVideoVerificationState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SxAddressVideoVerificationViewState f292696b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final File f292697c;

    /* renamed from: d, reason: collision with root package name */
    public final long f292698d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f292694e = new a(null);

    @k
    public static final Parcelable.Creator<SxAddressVideoVerificationState> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final SxAddressVideoVerificationState f292695f = new SxAddressVideoVerificationState(SxAddressVideoVerificationViewState.Loading.f292703b, null, 0);

    /* compiled from: SxAddressVideoVerificationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationState$a;", "", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SxAddressVideoVerificationState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SxAddressVideoVerificationState> {
        @Override // android.os.Parcelable.Creator
        public final SxAddressVideoVerificationState createFromParcel(Parcel parcel) {
            return new SxAddressVideoVerificationState((SxAddressVideoVerificationViewState) parcel.readParcelable(SxAddressVideoVerificationState.class.getClassLoader()), parcel.readInt() == 0 ? null : File.CREATOR.createFromParcel(parcel), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final SxAddressVideoVerificationState[] newArray(int i12) {
            return new SxAddressVideoVerificationState[i12];
        }
    }

    public SxAddressVideoVerificationState(@k SxAddressVideoVerificationViewState sxAddressVideoVerificationViewState, @l File file, long j12) {
        this.f292696b = sxAddressVideoVerificationViewState;
        this.f292697c = file;
        this.f292698d = j12;
    }

    public static SxAddressVideoVerificationState a(SxAddressVideoVerificationState sxAddressVideoVerificationState, SxAddressVideoVerificationViewState sxAddressVideoVerificationViewState, File file, long j12, int i12) {
        if ((i12 & 2) != 0) {
            file = sxAddressVideoVerificationState.f292697c;
        }
        if ((i12 & 4) != 0) {
            j12 = sxAddressVideoVerificationState.f292698d;
        }
        sxAddressVideoVerificationState.getClass();
        return new SxAddressVideoVerificationState(sxAddressVideoVerificationViewState, file, j12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SxAddressVideoVerificationState)) {
            return false;
        }
        SxAddressVideoVerificationState sxAddressVideoVerificationState = (SxAddressVideoVerificationState) obj;
        return L.f(this.f292696b, sxAddressVideoVerificationState.f292696b) && L.f(this.f292697c, sxAddressVideoVerificationState.f292697c) && this.f292698d == sxAddressVideoVerificationState.f292698d;
    }

    public final int hashCode() {
        int iHashCode = this.f292696b.hashCode() * 31;
        File file = this.f292697c;
        return Long.hashCode(this.f292698d) + ((iHashCode + (file == null ? 0 : file.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SxAddressVideoVerificationState(viewState=");
        sb2.append(this.f292696b);
        sb2.append(", uploadingVideo=");
        sb2.append(this.f292697c);
        sb2.append(", videoMaxSizeMB=");
        return r.u(sb2, this.f292698d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f292696b, i12);
        File file = this.f292697c;
        if (file == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            file.writeToParcel(parcel, i12);
        }
        parcel.writeLong(this.f292698d);
    }
}
