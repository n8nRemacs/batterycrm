package com.avito.android.serp.adapter.beduin_v2;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import is0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: BeduinV2Item.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/beduin_v2/BeduinV2Item;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lis0/h;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BeduinV2Item implements PersistableSerpItem, is0.h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<BeduinV2Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f268996b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f268997c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BeduinV2Content f268998d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Analytics f268999e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Settings f269000f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final h.b f269001g;

    /* renamed from: h, reason: collision with root package name */
    public final long f269002h;

    /* compiled from: BeduinV2Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinV2Item> {
        @Override // android.os.Parcelable.Creator
        public final BeduinV2Item createFromParcel(Parcel parcel) {
            return new BeduinV2Item(parcel.readLong(), parcel.readString(), BeduinV2Content.CREATOR.createFromParcel(parcel), (Analytics) parcel.readParcelable(BeduinV2Item.class.getClassLoader()), (Settings) parcel.readParcelable(BeduinV2Item.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinV2Item[] newArray(int i12) {
            return new BeduinV2Item[i12];
        }
    }

    public BeduinV2Item(long j12, @k String str, @k BeduinV2Content beduinV2Content, @l Analytics analytics, @l Settings settings) {
        this.f268996b = j12;
        this.f268997c = str;
        this.f268998d = beduinV2Content;
        this.f268999e = analytics;
        this.f269000f = settings;
        this.f269001g = new h.b(str, null, null, null, null, analytics, 30, null);
        this.f269002h = j12;
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinV2Item)) {
            return false;
        }
        BeduinV2Item beduinV2Item = (BeduinV2Item) obj;
        return this.f268996b == beduinV2Item.f268996b && L.f(this.f268997c, beduinV2Item.f268997c) && L.f(this.f268998d, beduinV2Item.f268998d) && L.f(this.f268999e, beduinV2Item.f268999e) && L.f(this.f269000f, beduinV2Item.f269000f);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272743j() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF207600b() {
        return this.f268996b;
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF273036h() {
        return this.f269000f;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount */
    public final int getF161889l() {
        return 6;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF263864b() {
        return this.f268997c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF128563l() {
        return this.f269002h;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType */
    public final SerpViewType getF161888k() {
        return SerpViewType.f268585e;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f268996b) * 31, 31, this.f268997c), 31, this.f268998d.f268992b);
        Analytics analytics = this.f268999e;
        int iHashCode = (iD2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f269000f;
        return iHashCode + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF273037i() {
        return this.f269001g;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinV2Item(id=");
        sb2.append(this.f268996b);
        sb2.append(", stringId=");
        sb2.append(this.f268997c);
        sb2.append(", beduinV2Content=");
        sb2.append(this.f268998d);
        sb2.append(", analytics=");
        sb2.append(this.f268999e);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f269000f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f268996b);
        parcel.writeString(this.f268997c);
        this.f268998d.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f268999e, i12);
        parcel.writeParcelable(this.f269000f, i12);
    }
}
