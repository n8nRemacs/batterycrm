package com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HeaderDescriptionItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/headerDescription/HeaderDescriptionItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HeaderDescriptionItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<HeaderDescriptionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f148801b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f148802c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f148803d;

    /* compiled from: HeaderDescriptionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HeaderDescriptionItem> {
        @Override // android.os.Parcelable.Creator
        public final HeaderDescriptionItem createFromParcel(Parcel parcel) {
            return new HeaderDescriptionItem(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(HeaderDescriptionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HeaderDescriptionItem[] newArray(int i12) {
            return new HeaderDescriptionItem[i12];
        }
    }

    public HeaderDescriptionItem(@k String str, @k String str2, @k AttributedText attributedText) {
        this.f148801b = str;
        this.f148802c = str2;
        this.f148803d = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderDescriptionItem)) {
            return false;
        }
        HeaderDescriptionItem headerDescriptionItem = (HeaderDescriptionItem) obj;
        return L.f(this.f148801b, headerDescriptionItem.f148801b) && L.f(this.f148802c, headerDescriptionItem.f148802c) && L.f(this.f148803d, headerDescriptionItem.f148803d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85702c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF147959c() {
        return this.f148801b;
    }

    public final int hashCode() {
        return this.f148803d.hashCode() + H.d(this.f148801b.hashCode() * 31, 31, this.f148802c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderDescriptionItem(stringId=");
        sb2.append(this.f148801b);
        sb2.append(", title=");
        sb2.append(this.f148802c);
        sb2.append(", subtitle=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f148803d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f148801b);
        parcel.writeString(this.f148802c);
        parcel.writeParcelable(this.f148803d, i12);
    }
}
