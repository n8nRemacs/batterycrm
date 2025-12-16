package com.avito.android.silent_update;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.service.short_task.ShortTask;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DownloadUpdateConfig.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/silent_update/DownloadUpdateConfig;", "Landroid/os/Parcelable;", "OneTimeDownloadRequest", "PeriodicDownloadRequest", "Lcom/avito/android/silent_update/DownloadUpdateConfig$OneTimeDownloadRequest;", "Lcom/avito/android/silent_update/DownloadUpdateConfig$PeriodicDownloadRequest;", "_avito_silent-update_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DownloadUpdateConfig extends Parcelable {

    /* compiled from: DownloadUpdateConfig.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update/DownloadUpdateConfig$OneTimeDownloadRequest;", "Lcom/avito/android/silent_update/DownloadUpdateConfig;", "_avito_silent-update_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OneTimeDownloadRequest implements DownloadUpdateConfig {

        @k
        public static final Parcelable.Creator<OneTimeDownloadRequest> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ShortTask.NetworkState f283600b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f283601c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f283602d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f283603e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f283604f;

        /* renamed from: g, reason: collision with root package name */
        public final long f283605g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f283606h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Bundle f283607i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final ShortTask.BackoffPolicy f283608j;

        /* renamed from: k, reason: collision with root package name */
        public final long f283609k;

        /* compiled from: DownloadUpdateConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OneTimeDownloadRequest> {
            @Override // android.os.Parcelable.Creator
            public final OneTimeDownloadRequest createFromParcel(Parcel parcel) {
                return new OneTimeDownloadRequest(ShortTask.NetworkState.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readInt() != 0, parcel.readBundle(OneTimeDownloadRequest.class.getClassLoader()), ShortTask.BackoffPolicy.valueOf(parcel.readString()), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final OneTimeDownloadRequest[] newArray(int i12) {
                return new OneTimeDownloadRequest[i12];
            }
        }

        public OneTimeDownloadRequest(@k ShortTask.NetworkState networkState, boolean z12, boolean z13, boolean z14, boolean z15, long j12, boolean z16, @l Bundle bundle, @k ShortTask.BackoffPolicy backoffPolicy, long j13) {
            this.f283600b = networkState;
            this.f283601c = z12;
            this.f283602d = z13;
            this.f283603e = z14;
            this.f283604f = z15;
            this.f283605g = j12;
            this.f283606h = z16;
            this.f283607i = bundle;
            this.f283608j = backoffPolicy;
            this.f283609k = j13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OneTimeDownloadRequest)) {
                return false;
            }
            OneTimeDownloadRequest oneTimeDownloadRequest = (OneTimeDownloadRequest) obj;
            return this.f283600b == oneTimeDownloadRequest.f283600b && this.f283601c == oneTimeDownloadRequest.f283601c && this.f283602d == oneTimeDownloadRequest.f283602d && this.f283603e == oneTimeDownloadRequest.f283603e && this.f283604f == oneTimeDownloadRequest.f283604f && this.f283605g == oneTimeDownloadRequest.f283605g && this.f283606h == oneTimeDownloadRequest.f283606h && L.f(this.f283607i, oneTimeDownloadRequest.f283607i) && this.f283608j == oneTimeDownloadRequest.f283608j && this.f283609k == oneTimeDownloadRequest.f283609k;
        }

        public final int hashCode() {
            int i12 = r.i(r.g(r.i(r.i(r.i(r.i(this.f283600b.hashCode() * 31, 31, this.f283601c), 31, this.f283602d), 31, this.f283603e), 31, this.f283604f), 31, this.f283605g), 31, this.f283606h);
            Bundle bundle = this.f283607i;
            return Long.hashCode(this.f283609k) + ((this.f283608j.hashCode() + ((i12 + (bundle == null ? 0 : bundle.hashCode())) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OneTimeDownloadRequest(requiredNetworkState=");
            sb2.append(this.f283600b);
            sb2.append(", isStorageNotLowRequired=");
            sb2.append(this.f283601c);
            sb2.append(", isBatteryNotLowRequired=");
            sb2.append(this.f283602d);
            sb2.append(", isChargingRequired=");
            sb2.append(this.f283603e);
            sb2.append(", isDeviceIdleRequired=");
            sb2.append(this.f283604f);
            sb2.append(", initialDelayMs=");
            sb2.append(this.f283605g);
            sb2.append(", updateCurrent=");
            sb2.append(this.f283606h);
            sb2.append(", extras=");
            sb2.append(this.f283607i);
            sb2.append(", backoffPolicy=");
            sb2.append(this.f283608j);
            sb2.append(", backoffDelayMs=");
            return r.u(sb2, this.f283609k, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f283600b.name());
            parcel.writeInt(this.f283601c ? 1 : 0);
            parcel.writeInt(this.f283602d ? 1 : 0);
            parcel.writeInt(this.f283603e ? 1 : 0);
            parcel.writeInt(this.f283604f ? 1 : 0);
            parcel.writeLong(this.f283605g);
            parcel.writeInt(this.f283606h ? 1 : 0);
            parcel.writeBundle(this.f283607i);
            parcel.writeString(this.f283608j.name());
            parcel.writeLong(this.f283609k);
        }

        public /* synthetic */ OneTimeDownloadRequest(ShortTask.NetworkState networkState, boolean z12, boolean z13, boolean z14, boolean z15, long j12, boolean z16, Bundle bundle, ShortTask.BackoffPolicy backoffPolicy, long j13, int i12, C42822w c42822w) {
            this(networkState, z12, z13, z14, z15, (i12 & 32) != 0 ? 1000L : j12, (i12 & 64) != 0 ? true : z16, (i12 & 128) != 0 ? null : bundle, (i12 & 256) != 0 ? ShortTask.BackoffPolicy.f274019b : backoffPolicy, (i12 & 512) != 0 ? 30000L : j13);
        }
    }

    /* compiled from: DownloadUpdateConfig.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update/DownloadUpdateConfig$PeriodicDownloadRequest;", "Lcom/avito/android/silent_update/DownloadUpdateConfig;", "_avito_silent-update_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PeriodicDownloadRequest implements DownloadUpdateConfig {

        @k
        public static final Parcelable.Creator<PeriodicDownloadRequest> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ShortTask.NetworkState f283610b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f283611c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f283612d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f283613e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f283614f;

        /* renamed from: g, reason: collision with root package name */
        public final long f283615g;

        /* renamed from: h, reason: collision with root package name */
        public final long f283616h;

        /* renamed from: i, reason: collision with root package name */
        public final long f283617i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f283618j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final Bundle f283619k;

        /* renamed from: l, reason: collision with root package name */
        @k
        public final ShortTask.BackoffPolicy f283620l;

        /* renamed from: m, reason: collision with root package name */
        public final long f283621m;

        /* compiled from: DownloadUpdateConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PeriodicDownloadRequest> {
            @Override // android.os.Parcelable.Creator
            public final PeriodicDownloadRequest createFromParcel(Parcel parcel) {
                return new PeriodicDownloadRequest(ShortTask.NetworkState.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readBundle(PeriodicDownloadRequest.class.getClassLoader()), ShortTask.BackoffPolicy.valueOf(parcel.readString()), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final PeriodicDownloadRequest[] newArray(int i12) {
                return new PeriodicDownloadRequest[i12];
            }
        }

        public PeriodicDownloadRequest(@k ShortTask.NetworkState networkState, boolean z12, boolean z13, boolean z14, boolean z15, long j12, long j13, long j14, boolean z16, @l Bundle bundle, @k ShortTask.BackoffPolicy backoffPolicy, long j15) {
            this.f283610b = networkState;
            this.f283611c = z12;
            this.f283612d = z13;
            this.f283613e = z14;
            this.f283614f = z15;
            this.f283615g = j12;
            this.f283616h = j13;
            this.f283617i = j14;
            this.f283618j = z16;
            this.f283619k = bundle;
            this.f283620l = backoffPolicy;
            this.f283621m = j15;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PeriodicDownloadRequest)) {
                return false;
            }
            PeriodicDownloadRequest periodicDownloadRequest = (PeriodicDownloadRequest) obj;
            return this.f283610b == periodicDownloadRequest.f283610b && this.f283611c == periodicDownloadRequest.f283611c && this.f283612d == periodicDownloadRequest.f283612d && this.f283613e == periodicDownloadRequest.f283613e && this.f283614f == periodicDownloadRequest.f283614f && this.f283615g == periodicDownloadRequest.f283615g && this.f283616h == periodicDownloadRequest.f283616h && this.f283617i == periodicDownloadRequest.f283617i && this.f283618j == periodicDownloadRequest.f283618j && L.f(this.f283619k, periodicDownloadRequest.f283619k) && this.f283620l == periodicDownloadRequest.f283620l && this.f283621m == periodicDownloadRequest.f283621m;
        }

        public final int hashCode() {
            int i12 = r.i(r.g(r.g(r.g(r.i(r.i(r.i(r.i(this.f283610b.hashCode() * 31, 31, this.f283611c), 31, this.f283612d), 31, this.f283613e), 31, this.f283614f), 31, this.f283615g), 31, this.f283616h), 31, this.f283617i), 31, this.f283618j);
            Bundle bundle = this.f283619k;
            return Long.hashCode(this.f283621m) + ((this.f283620l.hashCode() + ((i12 + (bundle == null ? 0 : bundle.hashCode())) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PeriodicDownloadRequest(requiredNetworkState=");
            sb2.append(this.f283610b);
            sb2.append(", isStorageNotLowRequired=");
            sb2.append(this.f283611c);
            sb2.append(", isBatteryNotLowRequired=");
            sb2.append(this.f283612d);
            sb2.append(", isChargingRequired=");
            sb2.append(this.f283613e);
            sb2.append(", isDeviceIdleRequired=");
            sb2.append(this.f283614f);
            sb2.append(", repeatIntervalMs=");
            sb2.append(this.f283615g);
            sb2.append(", flexIntervalMs=");
            sb2.append(this.f283616h);
            sb2.append(", initialDelayMs=");
            sb2.append(this.f283617i);
            sb2.append(", updateCurrent=");
            sb2.append(this.f283618j);
            sb2.append(", extras=");
            sb2.append(this.f283619k);
            sb2.append(", backoffPolicy=");
            sb2.append(this.f283620l);
            sb2.append(", backoffDelayMs=");
            return r.u(sb2, this.f283621m, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f283610b.name());
            parcel.writeInt(this.f283611c ? 1 : 0);
            parcel.writeInt(this.f283612d ? 1 : 0);
            parcel.writeInt(this.f283613e ? 1 : 0);
            parcel.writeInt(this.f283614f ? 1 : 0);
            parcel.writeLong(this.f283615g);
            parcel.writeLong(this.f283616h);
            parcel.writeLong(this.f283617i);
            parcel.writeInt(this.f283618j ? 1 : 0);
            parcel.writeBundle(this.f283619k);
            parcel.writeString(this.f283620l.name());
            parcel.writeLong(this.f283621m);
        }

        public /* synthetic */ PeriodicDownloadRequest(ShortTask.NetworkState networkState, boolean z12, boolean z13, boolean z14, boolean z15, long j12, long j13, long j14, boolean z16, Bundle bundle, ShortTask.BackoffPolicy backoffPolicy, long j15, int i12, C42822w c42822w) {
            this(networkState, z12, z13, z14, z15, j12, (i12 & 64) != 0 ? j12 : j13, (i12 & 128) != 0 ? 1000L : j14, (i12 & 256) != 0 ? true : z16, (i12 & 512) != 0 ? null : bundle, (i12 & 1024) != 0 ? ShortTask.BackoffPolicy.f274019b : backoffPolicy, (i12 & 2048) != 0 ? 30000L : j15);
        }
    }
}
