package com.avito.android.evidence_request.details.headerDescription;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/headerDescription/HeaderDescriptionItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HeaderDescriptionItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<HeaderDescriptionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f148522b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f148523c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f148524d;

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
        this.f148522b = str;
        this.f148523c = str2;
        this.f148524d = attributedText;
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
        return L.f(this.f148522b, headerDescriptionItem.f148522b) && L.f(this.f148523c, headerDescriptionItem.f148523c) && L.f(this.f148524d, headerDescriptionItem.f148524d);
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
        return this.f148522b;
    }

    public final int hashCode() {
        return this.f148524d.hashCode() + H.d(this.f148522b.hashCode() * 31, 31, this.f148523c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderDescriptionItem(stringId=");
        sb2.append(this.f148522b);
        sb2.append(", title=");
        sb2.append(this.f148523c);
        sb2.append(", subtitle=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f148524d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f148522b);
        parcel.writeString(this.f148523c);
        parcel.writeParcelable(this.f148524d, i12);
    }
}
