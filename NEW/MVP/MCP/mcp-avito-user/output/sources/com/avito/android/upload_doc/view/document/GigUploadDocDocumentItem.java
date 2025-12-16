package com.avito.android.upload_doc.view.document;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigUploadDocDocumentItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/view/document/GigUploadDocDocumentItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GigUploadDocDocumentItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<GigUploadDocDocumentItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f307011b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f307012c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f307013d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f307014e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Uri f307015f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f307016g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f307017h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f307018i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f307019j;

    /* compiled from: GigUploadDocDocumentItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigUploadDocDocumentItem> {
        @Override // android.os.Parcelable.Creator
        public final GigUploadDocDocumentItem createFromParcel(Parcel parcel) {
            return new GigUploadDocDocumentItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(GigUploadDocDocumentItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GigUploadDocDocumentItem[] newArray(int i12) {
            return new GigUploadDocDocumentItem[i12];
        }
    }

    public GigUploadDocDocumentItem(@k String str, @k String str2, @k String str3, @k String str4, @l Uri uri, @l String str5, boolean z12, boolean z13, boolean z14) {
        this.f307011b = str;
        this.f307012c = str2;
        this.f307013d = str3;
        this.f307014e = str4;
        this.f307015f = uri;
        this.f307016g = str5;
        this.f307017h = z12;
        this.f307018i = z13;
        this.f307019j = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GigUploadDocDocumentItem)) {
            return false;
        }
        GigUploadDocDocumentItem gigUploadDocDocumentItem = (GigUploadDocDocumentItem) obj;
        return L.f(this.f307011b, gigUploadDocDocumentItem.f307011b) && L.f(this.f307012c, gigUploadDocDocumentItem.f307012c) && L.f(this.f307013d, gigUploadDocDocumentItem.f307013d) && L.f(this.f307014e, gigUploadDocDocumentItem.f307014e) && L.f(this.f307015f, gigUploadDocDocumentItem.f307015f) && L.f(this.f307016g, gigUploadDocDocumentItem.f307016g) && this.f307017h == gigUploadDocDocumentItem.f307017h && this.f307018i == gigUploadDocDocumentItem.f307018i && this.f307019j == gigUploadDocDocumentItem.f307019j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF301123b() {
        return this.f307011b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.f307011b.hashCode() * 31, 31, this.f307012c), 31, this.f307013d), 31, this.f307014e);
        Uri uri = this.f307015f;
        int iHashCode = (iD2 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.f307016g;
        return Boolean.hashCode(this.f307019j) + r.i(r.i((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f307017h), 31, this.f307018i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigUploadDocDocumentItem(stringId=");
        sb2.append(this.f307011b);
        sb2.append(", type=");
        sb2.append(this.f307012c);
        sb2.append(", title=");
        sb2.append(this.f307013d);
        sb2.append(", hint=");
        sb2.append(this.f307014e);
        sb2.append(", imageUri=");
        sb2.append(this.f307015f);
        sb2.append(", imageId=");
        sb2.append(this.f307016g);
        sb2.append(", isRequired=");
        sb2.append(this.f307017h);
        sb2.append(", isLoading=");
        sb2.append(this.f307018i);
        sb2.append(", isError=");
        return r.x(sb2, this.f307019j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f307011b);
        parcel.writeString(this.f307012c);
        parcel.writeString(this.f307013d);
        parcel.writeString(this.f307014e);
        parcel.writeParcelable(this.f307015f, i12);
        parcel.writeString(this.f307016g);
        parcel.writeInt(this.f307017h ? 1 : 0);
        parcel.writeInt(this.f307018i ? 1 : 0);
        parcel.writeInt(this.f307019j ? 1 : 0);
    }
}
