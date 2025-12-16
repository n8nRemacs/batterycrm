package com.avito.android.advert.item.gig.documents;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentButtonItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigPersonalInfoItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/gig/documents/GigPersonalInfoItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GigPersonalInfoItem implements BlockItem {

    @k
    public static final Parcelable.Creator<GigPersonalInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f75719b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75720c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f75721d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<DocumentButtonItem> f75722e;

    /* compiled from: GigPersonalInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigPersonalInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final GigPersonalInfoItem createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(GigPersonalInfoItem.class, parcel, arrayList, iL2, 1);
            }
            return new GigPersonalInfoItem(i12, string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GigPersonalInfoItem[] newArray(int i12) {
            return new GigPersonalInfoItem[i12];
        }
    }

    public GigPersonalInfoItem(int i12, @k String str, @k String str2, @k List<DocumentButtonItem> list) {
        this.f75719b = i12;
        this.f75720c = str;
        this.f75721d = str2;
        this.f75722e = list;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new GigPersonalInfoItem(i12, this.f75720c, this.f75721d, this.f75722e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GigPersonalInfoItem)) {
            return false;
        }
        GigPersonalInfoItem gigPersonalInfoItem = (GigPersonalInfoItem) obj;
        return this.f75719b == gigPersonalInfoItem.f75719b && L.f(this.f75720c, gigPersonalInfoItem.f75720c) && L.f(this.f75721d, gigPersonalInfoItem.f75721d) && L.f(this.f75722e, gigPersonalInfoItem.f75722e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269950b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF269958j() {
        return this.f75719b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF260340b() {
        return this.f75720c;
    }

    public final int hashCode() {
        return this.f75722e.hashCode() + H.d(H.d(Integer.hashCode(this.f75719b) * 31, 31, this.f75720c), 31, this.f75721d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigPersonalInfoItem(spanCount=");
        sb2.append(this.f75719b);
        sb2.append(", stringId=");
        sb2.append(this.f75720c);
        sb2.append(", title=");
        sb2.append(this.f75721d);
        sb2.append(", items=");
        return H.p(sb2, this.f75722e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f75719b);
        parcel.writeString(this.f75720c);
        parcel.writeString(this.f75721d);
        Iterator itJ = C0.j(this.f75722e, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GigPersonalInfoItem(int i12, String str, String str2, List list, int i13, C42822w c42822w) {
        if ((i13 & 2) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            str = "ITEM_GIG_PERSONAL_INFO";
        }
        this(i12, str, str2, list);
    }
}
