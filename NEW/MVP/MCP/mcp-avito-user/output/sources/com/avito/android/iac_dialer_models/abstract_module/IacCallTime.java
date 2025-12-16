package com.avito.android.iac_dialer_models.abstract_module;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacCallTime.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacCallTime;", "Landroid/os/Parcelable;", "a", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacCallTime implements Parcelable {

    @k
    public static final Parcelable.Creator<IacCallTime> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public final long f166845b;

    /* renamed from: c, reason: collision with root package name */
    public final long f166846c;

    /* renamed from: d, reason: collision with root package name */
    public final long f166847d;

    /* renamed from: e, reason: collision with root package name */
    public final long f166848e;

    /* renamed from: f, reason: collision with root package name */
    public final long f166849f;

    /* renamed from: g, reason: collision with root package name */
    public final long f166850g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f166851h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f166852i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f166853j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f166854k;

    /* compiled from: IacCallTime.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacCallTime$a;", "", "<init>", "()V", "", GrsBaseInfo.CountryCodeSource.UNKNOWN, "J", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacCallTime.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<IacCallTime> {
        @Override // android.os.Parcelable.Creator
        public final IacCallTime createFromParcel(Parcel parcel) {
            return new IacCallTime(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final IacCallTime[] newArray(int i12) {
            return new IacCallTime[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public IacCallTime(long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f166845b = j12;
        this.f166846c = j13;
        this.f166847d = j14;
        this.f166848e = j15;
        this.f166849f = j16;
        this.f166850g = j17;
        this.f166851h = j14 != -1;
        this.f166852i = j15 != -1;
        this.f166853j = j16 != -1;
        this.f166854k = j17 != -1;
    }

    public static IacCallTime b(IacCallTime iacCallTime, long j12, long j13, long j14, long j15, int i12) {
        long j16 = iacCallTime.f166845b;
        long j17 = (i12 & 2) != 0 ? iacCallTime.f166846c : j12;
        long j18 = iacCallTime.f166847d;
        long j19 = (i12 & 8) != 0 ? iacCallTime.f166848e : j13;
        long j22 = (i12 & 16) != 0 ? iacCallTime.f166849f : j14;
        long j23 = (i12 & 32) != 0 ? iacCallTime.f166850g : j15;
        iacCallTime.getClass();
        return new IacCallTime(j16, j17, j18, j19, j22, j23);
    }

    @k
    public final IacCallTime a(long j12) {
        return !this.f166853j ? b(this, 0L, 0L, j12, 0L, 47) : this;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getF166852i() {
        return this.f166852i;
    }

    @k
    public final IacCallTime d(long j12) {
        return this.f166852i ? this : b(this, 0L, j12, 0L, 0L, 55);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final IacCallTime e(long j12) {
        return this.f166846c == -1 ? b(this, j12, 0L, 0L, 0L, 61) : this;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacCallTime)) {
            return false;
        }
        IacCallTime iacCallTime = (IacCallTime) obj;
        return this.f166845b == iacCallTime.f166845b && this.f166846c == iacCallTime.f166846c && this.f166847d == iacCallTime.f166847d && this.f166848e == iacCallTime.f166848e && this.f166849f == iacCallTime.f166849f && this.f166850g == iacCallTime.f166850g;
    }

    public final int hashCode() {
        return Long.hashCode(this.f166850g) + r.g(r.g(r.g(r.g(Long.hashCode(this.f166845b) * 31, 31, this.f166846c), 31, this.f166847d), 31, this.f166848e), 31, this.f166849f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacCallTime(createdAt=");
        sb2.append(this.f166845b);
        sb2.append(", screenStartedAt=");
        sb2.append(this.f166846c);
        sb2.append(", initializedAt=");
        sb2.append(this.f166847d);
        sb2.append(", ringingAt=");
        sb2.append(this.f166848e);
        sb2.append(", activatedAt=");
        sb2.append(this.f166849f);
        sb2.append(", finishedAt=");
        return r.u(sb2, this.f166850g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f166845b);
        parcel.writeLong(this.f166846c);
        parcel.writeLong(this.f166847d);
        parcel.writeLong(this.f166848e);
        parcel.writeLong(this.f166849f);
        parcel.writeLong(this.f166850g);
    }

    public /* synthetic */ IacCallTime(long j12, long j13, long j14, long j15, long j16, long j17, int i12, C42822w c42822w) {
        this(j12, (i12 & 2) != 0 ? -1L : j13, (i12 & 4) != 0 ? -1L : j14, (i12 & 8) != 0 ? -1L : j15, (i12 & 16) != 0 ? -1L : j16, (i12 & 32) != 0 ? -1L : j17);
    }
}
