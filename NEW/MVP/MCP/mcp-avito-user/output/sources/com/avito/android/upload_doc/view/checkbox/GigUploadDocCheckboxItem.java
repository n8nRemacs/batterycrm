package com.avito.android.upload_doc.view.checkbox;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigUploadDocCheckboxItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/view/checkbox/GigUploadDocCheckboxItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GigUploadDocCheckboxItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<GigUploadDocCheckboxItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f306970b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f306971c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f306972d;

    /* compiled from: GigUploadDocCheckboxItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigUploadDocCheckboxItem> {
        @Override // android.os.Parcelable.Creator
        public final GigUploadDocCheckboxItem createFromParcel(Parcel parcel) {
            return new GigUploadDocCheckboxItem((AttributedText) parcel.readParcelable(GigUploadDocCheckboxItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GigUploadDocCheckboxItem[] newArray(int i12) {
            return new GigUploadDocCheckboxItem[i12];
        }
    }

    public GigUploadDocCheckboxItem(@k AttributedText attributedText, @k String str, boolean z12) {
        this.f306970b = str;
        this.f306971c = attributedText;
        this.f306972d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GigUploadDocCheckboxItem)) {
            return false;
        }
        GigUploadDocCheckboxItem gigUploadDocCheckboxItem = (GigUploadDocCheckboxItem) obj;
        return L.f(this.f306970b, gigUploadDocCheckboxItem.f306970b) && L.f(this.f306971c, gigUploadDocCheckboxItem.f306971c) && this.f306972d == gigUploadDocCheckboxItem.f306972d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF302516b() {
        return this.f306970b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f306972d) + com.avito.android.actions_sheet.a.b(this.f306970b.hashCode() * 31, 31, this.f306971c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigUploadDocCheckboxItem(stringId=");
        sb2.append(this.f306970b);
        sb2.append(", text=");
        sb2.append(this.f306971c);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f306972d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f306970b);
        parcel.writeParcelable(this.f306971c, i12);
        parcel.writeInt(this.f306972d ? 1 : 0);
    }
}
