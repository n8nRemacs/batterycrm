package com.avito.android.advert.item.disclaimer_pd;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DisclaimerPDItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/disclaimer_pd/DisclaimerPDItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DisclaimerPDItem implements BlockItem {

    @k
    public static final Parcelable.Creator<DisclaimerPDItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f75219b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75220c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f75221d;

    /* compiled from: DisclaimerPDItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DisclaimerPDItem> {
        @Override // android.os.Parcelable.Creator
        public final DisclaimerPDItem createFromParcel(Parcel parcel) {
            return new DisclaimerPDItem(parcel.readInt(), (AttributedText) parcel.readParcelable(DisclaimerPDItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DisclaimerPDItem[] newArray(int i12) {
            return new DisclaimerPDItem[i12];
        }
    }

    public DisclaimerPDItem(int i12, @k AttributedText attributedText, @k String str) {
        this.f75219b = i12;
        this.f75220c = str;
        this.f75221d = attributedText;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new DisclaimerPDItem(i12, this.f75221d, this.f75220c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisclaimerPDItem)) {
            return false;
        }
        DisclaimerPDItem disclaimerPDItem = (DisclaimerPDItem) obj;
        return this.f75219b == disclaimerPDItem.f75219b && L.f(this.f75220c, disclaimerPDItem.f75220c) && L.f(this.f75221d, disclaimerPDItem.f75221d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269849b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270704j() {
        return this.f75219b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF393799b() {
        return this.f75220c;
    }

    public final int hashCode() {
        return this.f75221d.hashCode() + H.d(Integer.hashCode(this.f75219b) * 31, 31, this.f75220c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisclaimerPDItem(spanCount=");
        sb2.append(this.f75219b);
        sb2.append(", stringId=");
        sb2.append(this.f75220c);
        sb2.append(", personalDataText=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f75221d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f75219b);
        parcel.writeString(this.f75220c);
        parcel.writeParcelable(this.f75221d, i12);
    }
}
