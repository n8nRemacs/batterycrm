package com.avito.android.beduin_content;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.S2;
import com.avito.android.beduin_shared.model.form.BeduinForm;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: BeduinSerpItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin_content/BeduinSerpItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "_avito_bx-content_widget_beduin-content_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSerpItem implements PersistableSerpItem, S2, h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<BeduinSerpItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BeduinForm f105213b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f105214c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Analytics f105215d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Settings f105216e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f105217f;

    /* renamed from: g, reason: collision with root package name */
    public final int f105218g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final h.b f105219h;

    /* renamed from: i, reason: collision with root package name */
    public final long f105220i;

    /* compiled from: BeduinSerpItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSerpItem> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSerpItem createFromParcel(Parcel parcel) {
            return new BeduinSerpItem((BeduinForm) parcel.readParcelable(BeduinSerpItem.class.getClassLoader()), parcel.readString(), (Analytics) parcel.readParcelable(BeduinSerpItem.class.getClassLoader()), (Settings) parcel.readParcelable(BeduinSerpItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSerpItem[] newArray(int i12) {
            return new BeduinSerpItem[i12];
        }
    }

    public BeduinSerpItem(BeduinForm beduinForm, String str, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(beduinForm, (i12 & 2) != 0 ? beduinForm.f105312b : str, analytics, settings);
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
        if (!(obj instanceof BeduinSerpItem)) {
            return false;
        }
        BeduinSerpItem beduinSerpItem = (BeduinSerpItem) obj;
        return L.f(this.f105213b, beduinSerpItem.f105213b) && L.f(this.f105214c, beduinSerpItem.f105214c) && L.f(this.f105215d, beduinSerpItem.f105215d) && L.f(this.f105216e, beduinSerpItem.f105216e);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF231631p() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF282036b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF231632q() {
        return this.f105216e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84111f() {
        return this.f105218g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281526b() {
        return this.f105214c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF231637v() {
        return this.f105220i;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84110e() {
        return this.f105217f;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f105213b.hashCode() * 31, 31, this.f105214c);
        Analytics analytics = this.f105215d;
        int iHashCode = (iD2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f105216e;
        return iHashCode + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF231636u() {
        return this.f105219h;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSerpItem(beduinContent=");
        sb2.append(this.f105213b);
        sb2.append(", stringId=");
        sb2.append(this.f105214c);
        sb2.append(", analytics=");
        sb2.append(this.f105215d);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f105216e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f105213b, i12);
        parcel.writeString(this.f105214c);
        parcel.writeParcelable(this.f105215d, i12);
        parcel.writeParcelable(this.f105216e, i12);
    }

    public BeduinSerpItem(@k BeduinForm beduinForm, @k String str, @l Analytics analytics, @l Settings settings) {
        this.f105213b = beduinForm;
        this.f105214c = str;
        this.f105215d = analytics;
        this.f105216e = settings;
        this.f105217f = SerpViewType.f268585e;
        this.f105218g = 6;
        this.f105219h = new h.b(str, null, null, null, null, analytics, 30, null);
        this.f105220i = a.C10492a.a(this);
    }
}
