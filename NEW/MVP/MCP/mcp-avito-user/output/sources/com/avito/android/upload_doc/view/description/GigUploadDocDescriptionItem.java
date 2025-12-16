package com.avito.android.upload_doc.view.description;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigUploadDocDescriptionItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/view/description/GigUploadDocDescriptionItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GigUploadDocDescriptionItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<GigUploadDocDescriptionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f307003b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f307004c;

    /* compiled from: GigUploadDocDescriptionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigUploadDocDescriptionItem> {
        @Override // android.os.Parcelable.Creator
        public final GigUploadDocDescriptionItem createFromParcel(Parcel parcel) {
            return new GigUploadDocDescriptionItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GigUploadDocDescriptionItem[] newArray(int i12) {
            return new GigUploadDocDescriptionItem[i12];
        }
    }

    public GigUploadDocDescriptionItem(@k String str, @k String str2) {
        this.f307003b = str;
        this.f307004c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GigUploadDocDescriptionItem)) {
            return false;
        }
        GigUploadDocDescriptionItem gigUploadDocDescriptionItem = (GigUploadDocDescriptionItem) obj;
        return L.f(this.f307003b, gigUploadDocDescriptionItem.f307003b) && L.f(this.f307004c, gigUploadDocDescriptionItem.f307004c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF308025d() {
        return this.f307003b;
    }

    public final int hashCode() {
        return this.f307004c.hashCode() + (this.f307003b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigUploadDocDescriptionItem(stringId=");
        sb2.append(this.f307003b);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f307004c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f307003b);
        parcel.writeString(this.f307004c);
    }

    public /* synthetic */ GigUploadDocDescriptionItem(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "DESCRIPTION_ID" : str, str2);
    }
}
