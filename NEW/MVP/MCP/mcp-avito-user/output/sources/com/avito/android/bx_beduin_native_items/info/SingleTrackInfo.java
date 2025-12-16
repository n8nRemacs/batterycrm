package com.avito.android.bx_beduin_native_items.info;

import Gk.InterfaceC13892b;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: SingleTrackInfo.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bx_beduin_native_items/info/SingleTrackInfo;", "Lcom/avito/android/bx_beduin_native_items/info/TrackInfo;", "b", "_avito_bx-beduin-native-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SingleTrackInfo implements TrackInfo {

    @k
    public static final Parcelable.Creator<SingleTrackInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Class<Object> f108829b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f108830c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f108831d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Long f108832e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Gk.d f108833f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public b f108834g;

    /* compiled from: SingleTrackInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SingleTrackInfo> {
        @Override // android.os.Parcelable.Creator
        public final SingleTrackInfo createFromParcel(Parcel parcel) {
            return new SingleTrackInfo((Class) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final SingleTrackInfo[] newArray(int i12) {
            return new SingleTrackInfo[i12];
        }
    }

    /* compiled from: SingleTrackInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bx_beduin_native_items/info/SingleTrackInfo$b;", "", "_avito_bx-beduin-native-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final N0 f108835a;

        /* renamed from: b, reason: collision with root package name */
        public final long f108836b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final b.InterfaceC10495b f108837c;

        /* renamed from: d, reason: collision with root package name */
        public final int f108838d;

        public b(@k N0 n02, long j12, @k b.InterfaceC10495b interfaceC10495b, int i12) {
            this.f108835a = n02;
            this.f108836b = j12;
            this.f108837c = interfaceC10495b;
            this.f108838d = i12;
        }
    }

    public SingleTrackInfo(@k Class<Object> cls, boolean z12, boolean z13, @l Long l12) {
        this.f108829b = cls;
        this.f108830c = z12;
        this.f108831d = z13;
        this.f108832e = l12;
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    public final void D0(long j12) {
        Gk.d dVar;
        if (this.f108834g == null && this.f108832e != null && ((dVar = this.f108833f) == null || !dVar.b())) {
            this.f108832e = null;
            return;
        }
        b bVar = this.f108834g;
        if (bVar != null) {
            this.f108831d = false;
            Gk.d dVar2 = this.f108833f;
            Long l12 = this.f108832e;
            if (l12 != null) {
                long jLongValue = (bVar.f108836b + l12.longValue()) - j12;
                if (jLongValue <= 0) {
                    a(bVar);
                    return;
                }
                this.f108832e = (dVar2 == null || !dVar2.b()) ? 0L : Long.valueOf(jLongValue);
            }
            ((V0) bVar.f108835a).c(null);
            this.f108834g = null;
        }
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    @l
    public final InterfaceC13892b F1() {
        return this.f108833f;
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    @k
    public final TrackInfo S4(long j12) {
        Long l12;
        b bVar = this.f108834g;
        if (bVar != null && (l12 = this.f108832e) != null) {
            long jLongValue = (bVar.f108836b + l12.longValue()) - j12;
            if (jLongValue > 0) {
                return new SingleTrackInfo(this.f108829b, this.f108830c, this.f108831d, Long.valueOf(jLongValue));
            }
            a(bVar);
        }
        return this;
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    public final void U1(@k C43238h c43238h, long j12, @k b.InterfaceC10495b interfaceC10495b, int i12, @k InterfaceC13892b interfaceC13892b) {
        long jH2;
        if (this.f108834g != null || this.f108831d || this.f108830c) {
            return;
        }
        Long l12 = this.f108832e;
        if (l12 != null) {
            jH2 = l12.longValue();
        } else {
            jH2 = interfaceC13892b.h();
            this.f108832e = Long.valueOf(jH2);
        }
        this.f108834g = new b(C43259k.d(c43238h, null, null, new com.avito.android.bx_beduin_native_items.info.b(jH2, this, null), 3), j12, interfaceC10495b, i12);
    }

    public final void a(b bVar) {
        Gk.d dVar = this.f108833f;
        if (dVar == null) {
            return;
        }
        dVar.c(bVar.f108838d, bVar.f108837c);
        this.f108830c = dVar.g();
        this.f108831d = true;
        this.f108832e = 0L;
        ((V0) bVar.f108835a).c(null);
        this.f108834g = null;
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    public final void a6(@l InterfaceC13892b interfaceC13892b) {
        this.f108833f = (Gk.d) interfaceC13892b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleTrackInfo)) {
            return false;
        }
        SingleTrackInfo singleTrackInfo = (SingleTrackInfo) obj;
        return L.f(this.f108829b, singleTrackInfo.f108829b) && this.f108830c == singleTrackInfo.f108830c && this.f108831d == singleTrackInfo.f108831d && L.f(this.f108832e, singleTrackInfo.f108832e);
    }

    public final int hashCode() {
        int i12 = r.i(r.i(this.f108829b.hashCode() * 31, 31, this.f108830c), 31, this.f108831d);
        Long l12 = this.f108832e;
        return i12 + (l12 == null ? 0 : l12.hashCode());
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    /* renamed from: m1, reason: from getter */
    public final boolean getF108830c() {
        return this.f108830c;
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    @k
    public final Class<Object> r4() {
        return this.f108829b;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SingleTrackInfo(visibilityFilterClass=");
        sb2.append(this.f108829b);
        sb2.append(", tracked=");
        sb2.append(this.f108830c);
        sb2.append(", localTracked=");
        sb2.append(this.f108831d);
        sb2.append(", trackTimeLeft=");
        return m.m(sb2, this.f108832e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f108829b);
        parcel.writeInt(this.f108830c ? 1 : 0);
        parcel.writeInt(this.f108831d ? 1 : 0);
        Long l12 = this.f108832e;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }

    public /* synthetic */ SingleTrackInfo(Class cls, boolean z12, boolean z13, Long l12, int i12, C42822w c42822w) {
        this(cls, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? null : l12);
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    public final void onDestroyView() {
    }
}
