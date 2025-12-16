package com.avito.android.advert.item.contactbar;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.remote.model.BusinessServicesRedesignType;
import com.avito.android.remote.model.ContactsPosition;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.item_visibility_tracker.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsContactBarItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/contactbar/AdvertDetailsContactBarItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsContactBarItem implements BlockItem, Q, l1, b.InterfaceC10495b {

    @k
    public static final Parcelable.Creator<AdvertDetailsContactBarItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f74860b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f74861c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f74862d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ContactsPosition f74863e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<? extends ContactBar.Button> f74864f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ContactBarData f74865g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AdvertPrice f74866h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f74867i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f74868j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final BusinessServicesRedesignType f74869k;

    /* renamed from: l, reason: collision with root package name */
    public final int f74870l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public SerpDisplayType f74871m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final SerpViewType f74872n;

    /* renamed from: o, reason: collision with root package name */
    public final long f74873o;

    /* compiled from: AdvertDetailsContactBarItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsContactBarItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsContactBarItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AdvertDetailsContactBarItem.class.getClassLoader());
            ContactsPosition contactsPosition = (ContactsPosition) parcel.readParcelable(AdvertDetailsContactBarItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsContactBarItem.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertDetailsContactBarItem(j12, string, attributedText, contactsPosition, arrayList, (ContactBarData) parcel.readParcelable(AdvertDetailsContactBarItem.class.getClassLoader()), (AdvertPrice) parcel.readParcelable(AdvertDetailsContactBarItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : BusinessServicesRedesignType.valueOf(parcel.readString()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsContactBarItem[] newArray(int i12) {
            return new AdvertDetailsContactBarItem[i12];
        }
    }

    public AdvertDetailsContactBarItem(long j12, @k String str, @l AttributedText attributedText, @l ContactsPosition contactsPosition, @k List<? extends ContactBar.Button> list, @l ContactBarData contactBarData, @l AdvertPrice advertPrice, boolean z12, boolean z13, @l BusinessServicesRedesignType businessServicesRedesignType, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f74860b = j12;
        this.f74861c = str;
        this.f74862d = attributedText;
        this.f74863e = contactsPosition;
        this.f74864f = list;
        this.f74865g = contactBarData;
        this.f74866h = advertPrice;
        this.f74867i = z12;
        this.f74868j = z13;
        this.f74869k = businessServicesRedesignType;
        this.f74870l = i12;
        this.f74871m = serpDisplayType;
        this.f74872n = serpViewType;
        this.f74873o = j12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsContactBarItem(this.f74860b, this.f74861c, this.f74862d, this.f74863e, this.f74864f, this.f74865g, this.f74866h, this.f74867i, this.f74868j, this.f74869k, i12, this.f74871m, this.f74872n);
    }

    public final int W() {
        int i12 = this.f74864f.size() > 2 ? 160 : 96;
        ContactBarData contactBarData = this.f74865g;
        return i12 + ((contactBarData == null || !contactBarData.getHasInstallmentsStickyBlock()) ? 0 : 24);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f74871m = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsContactBarItem)) {
            return false;
        }
        AdvertDetailsContactBarItem advertDetailsContactBarItem = (AdvertDetailsContactBarItem) obj;
        return this.f74860b == advertDetailsContactBarItem.f74860b && L.f(this.f74861c, advertDetailsContactBarItem.f74861c) && L.f(this.f74862d, advertDetailsContactBarItem.f74862d) && this.f74863e == advertDetailsContactBarItem.f74863e && L.f(this.f74864f, advertDetailsContactBarItem.f74864f) && L.f(this.f74865g, advertDetailsContactBarItem.f74865g) && L.f(this.f74866h, advertDetailsContactBarItem.f74866h) && this.f74867i == advertDetailsContactBarItem.f74867i && this.f74868j == advertDetailsContactBarItem.f74868j && this.f74869k == advertDetailsContactBarItem.f74869k && this.f74870l == advertDetailsContactBarItem.f74870l && this.f74871m == advertDetailsContactBarItem.f74871m && this.f74872n == advertDetailsContactBarItem.f74872n;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final ContactsPosition getF74863e() {
        return this.f74863e;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF79636b() {
        return this.f74860b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79640f() {
        return this.f74870l;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF138457b() {
        return this.f74861c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF272745l() {
        return this.f74873o;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79638d() {
        return this.f74872n;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f74860b) * 31, 31, this.f74861c);
        AttributedText attributedText = this.f74862d;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ContactsPosition contactsPosition = this.f74863e;
        int iE2 = H.e((iHashCode + (contactsPosition == null ? 0 : contactsPosition.hashCode())) * 31, 31, this.f74864f);
        ContactBarData contactBarData = this.f74865g;
        int iHashCode2 = (iE2 + (contactBarData == null ? 0 : contactBarData.hashCode())) * 31;
        AdvertPrice advertPrice = this.f74866h;
        int i12 = r.i(r.i((iHashCode2 + (advertPrice == null ? 0 : advertPrice.hashCode())) * 31, 31, this.f74867i), 31, this.f74868j);
        BusinessServicesRedesignType businessServicesRedesignType = this.f74869k;
        return this.f74872n.hashCode() + com.avito.android.actions_sheet.a.h(this.f74871m, r.e(this.f74870l, (i12 + (businessServicesRedesignType != null ? businessServicesRedesignType.hashCode() : 0)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsContactBarItem(id=");
        sb2.append(this.f74860b);
        sb2.append(", stringId=");
        sb2.append(this.f74861c);
        sb2.append(", title=");
        sb2.append(this.f74862d);
        sb2.append(", position=");
        sb2.append(this.f74863e);
        sb2.append(", actions=");
        sb2.append(this.f74864f);
        sb2.append(", contactBarData=");
        sb2.append(this.f74865g);
        sb2.append(", advertPrice=");
        sb2.append(this.f74866h);
        sb2.append(", isRedesign=");
        sb2.append(this.f74867i);
        sb2.append(", isRestyle=");
        sb2.append(this.f74868j);
        sb2.append(", servicesRedesignType=");
        sb2.append(this.f74869k);
        sb2.append(", spanCount=");
        sb2.append(this.f74870l);
        sb2.append(", displayType=");
        sb2.append(this.f74871m);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f74872n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f74860b);
        parcel.writeString(this.f74861c);
        parcel.writeParcelable(this.f74862d, i12);
        parcel.writeParcelable(this.f74863e, i12);
        Iterator itJ = C0.j(this.f74864f, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f74865g, i12);
        parcel.writeParcelable(this.f74866h, i12);
        parcel.writeInt(this.f74867i ? 1 : 0);
        parcel.writeInt(this.f74868j ? 1 : 0);
        BusinessServicesRedesignType businessServicesRedesignType = this.f74869k;
        if (businessServicesRedesignType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(businessServicesRedesignType.name());
        }
        parcel.writeInt(this.f74870l);
        parcel.writeString(this.f74871m.name());
        parcel.writeString(this.f74872n.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdvertDetailsContactBarItem(long j12, String str, AttributedText attributedText, ContactsPosition contactsPosition, List list, ContactBarData contactBarData, AdvertPrice advertPrice, boolean z12, boolean z13, BusinessServicesRedesignType businessServicesRedesignType, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 48;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? null : attributedText, (i13 & 8) != 0 ? null : contactsPosition, (i13 & 16) != 0 ? C42784z0.f406748b : list, (i13 & 32) != 0 ? null : contactBarData, (i13 & 64) != 0 ? null : advertPrice, (i13 & 128) != 0 ? false : z12, (i13 & 256) != 0 ? false : z13, (i13 & 512) != 0 ? null : businessServicesRedesignType, i12, (i13 & 2048) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 4096) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
