package com.avito.android.bx_beduin_native_items.info;

import Gk.InterfaceC13891a;
import Gk.InterfaceC13892b;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: ContinuousTrackInfo.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bx_beduin_native_items/info/ContinuousTrackInfo;", "Lcom/avito/android/bx_beduin_native_items/info/TrackInfo;", "b", "_avito_bx-beduin-native-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContinuousTrackInfo implements TrackInfo {

    @k
    public static final Parcelable.Creator<ContinuousTrackInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Class<Object> f108823b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public InterfaceC13891a f108824c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public b f108825d;

    /* compiled from: ContinuousTrackInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContinuousTrackInfo> {
        @Override // android.os.Parcelable.Creator
        public final ContinuousTrackInfo createFromParcel(Parcel parcel) {
            return new ContinuousTrackInfo((Class) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final ContinuousTrackInfo[] newArray(int i12) {
            return new ContinuousTrackInfo[i12];
        }
    }

    /* compiled from: ContinuousTrackInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bx_beduin_native_items/info/ContinuousTrackInfo$b;", "", "_avito_bx-beduin-native-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final N0 f108826a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b.InterfaceC10495b f108827b;

        /* renamed from: c, reason: collision with root package name */
        public final int f108828c;

        public b(@k N0 n02, @k b.InterfaceC10495b interfaceC10495b, int i12) {
            this.f108826a = n02;
            this.f108827b = interfaceC10495b;
            this.f108828c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f108826a, bVar.f108826a) && L.f(this.f108827b, bVar.f108827b) && this.f108828c == bVar.f108828c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f108828c) + ((this.f108827b.hashCode() + (this.f108826a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TempInfo(job=");
            sb2.append(this.f108826a);
            sb2.append(", item=");
            sb2.append(this.f108827b);
            sb2.append(", position=");
            return r.t(sb2, this.f108828c, ')');
        }
    }

    public ContinuousTrackInfo(@k Class<Object> cls) {
        this.f108823b = cls;
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    public final void D0(long j12) {
        c();
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    @l
    public final InterfaceC13892b F1() {
        return this.f108824c;
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    public final void U1(@k C43238h c43238h, long j12, @k b.InterfaceC10495b interfaceC10495b, int i12, @k InterfaceC13892b interfaceC13892b) {
        if (this.f108825d != null) {
            return;
        }
        this.f108825d = new b(C43259k.d(c43238h, null, null, new com.avito.android.bx_beduin_native_items.info.a(interfaceC13892b, this, null), 3), interfaceC10495b, i12);
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    public final void a6(@l InterfaceC13892b interfaceC13892b) {
        this.f108824c = (InterfaceC13891a) interfaceC13892b;
    }

    public final void c() {
        b bVar = this.f108825d;
        if (bVar == null) {
            return;
        }
        N0 n02 = bVar.f108826a;
        if (((AbstractC43075a) n02).isActive()) {
            ((V0) n02).c(null);
        } else {
            InterfaceC13891a interfaceC13891a = this.f108824c;
            if (interfaceC13891a != null) {
                interfaceC13891a.e(bVar.f108827b);
            }
        }
        this.f108825d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    /* renamed from: m1 */
    public final boolean getF108830c() {
        return false;
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    public final void onDestroyView() {
        c();
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    @k
    public final Class<Object> r4() {
        return this.f108823b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f108823b);
    }

    @Override // com.avito.android.bx_beduin_native_items.info.TrackInfo
    @k
    public final TrackInfo S4(long j12) {
        return this;
    }
}
