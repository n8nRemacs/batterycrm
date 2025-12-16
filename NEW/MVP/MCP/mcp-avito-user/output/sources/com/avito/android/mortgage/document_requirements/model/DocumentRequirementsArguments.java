package com.avito.android.mortgage.document_requirements.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DocumentRequirementsArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_requirements/model/DocumentRequirementsArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DocumentRequirementsArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<DocumentRequirementsArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Document f198972b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f198973c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f198974d;

    /* compiled from: DocumentRequirementsArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DocumentRequirementsArguments> {
        @Override // android.os.Parcelable.Creator
        public final DocumentRequirementsArguments createFromParcel(Parcel parcel) {
            Document documentCreateFromParcel = parcel.readInt() == 0 ? null : Document.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Document.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new DocumentRequirementsArguments(documentCreateFromParcel, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DocumentRequirementsArguments[] newArray(int i12) {
            return new DocumentRequirementsArguments[i12];
        }
    }

    public DocumentRequirementsArguments(@l Document document, @k ArrayList arrayList, @l String str) {
        this.f198972b = document;
        this.f198973c = arrayList;
        this.f198974d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentRequirementsArguments)) {
            return false;
        }
        DocumentRequirementsArguments documentRequirementsArguments = (DocumentRequirementsArguments) obj;
        return this.f198972b == documentRequirementsArguments.f198972b && this.f198973c.equals(documentRequirementsArguments.f198973c) && L.f(this.f198974d, documentRequirementsArguments.f198974d);
    }

    public final int hashCode() {
        Document document = this.f198972b;
        int iG2 = e.g(this.f198973c, (document == null ? 0 : document.hashCode()) * 31, 31);
        String str = this.f198974d;
        return iG2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentRequirementsArguments(selectedDocument=");
        sb2.append(this.f198972b);
        sb2.append(", documents=");
        sb2.append(this.f198973c);
        sb2.append(", applicationId=");
        return C22026a.c(sb2, this.f198974d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Document document = this.f198972b;
        if (document == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            document.writeToParcel(parcel, i12);
        }
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f198973c, parcel);
        while (itZ.hasNext()) {
            ((Document) itZ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f198974d);
    }
}
