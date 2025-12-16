package com.avito.android.upload_doc.view.sections;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigUploadDocSectionsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/view/sections/GigUploadDocSectionsItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GigUploadDocSectionsItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<GigUploadDocSectionsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f307045b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f307046c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f307047d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f307048e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<GigUploadDocDocumentItem> f307049f;

    /* compiled from: GigUploadDocSectionsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigUploadDocSectionsItem> {
        @Override // android.os.Parcelable.Creator
        public final GigUploadDocSectionsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(GigUploadDocSectionsItem.class.getClassLoader());
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(GigUploadDocDocumentItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new GigUploadDocSectionsItem(string, string2, deepLink, z12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GigUploadDocSectionsItem[] newArray(int i12) {
            return new GigUploadDocSectionsItem[i12];
        }
    }

    public GigUploadDocSectionsItem(@k String str, @l String str2, @l DeepLink deepLink, boolean z12, @k List<GigUploadDocDocumentItem> list) {
        this.f307045b = str;
        this.f307046c = str2;
        this.f307047d = deepLink;
        this.f307048e = z12;
        this.f307049f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GigUploadDocSectionsItem)) {
            return false;
        }
        GigUploadDocSectionsItem gigUploadDocSectionsItem = (GigUploadDocSectionsItem) obj;
        return L.f(this.f307045b, gigUploadDocSectionsItem.f307045b) && L.f(this.f307046c, gigUploadDocSectionsItem.f307046c) && L.f(this.f307047d, gigUploadDocSectionsItem.f307047d) && this.f307048e == gigUploadDocSectionsItem.f307048e && L.f(this.f307049f, gigUploadDocSectionsItem.f307049f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF298293b() {
        return this.f307045b;
    }

    public final int hashCode() {
        int iHashCode = this.f307045b.hashCode() * 31;
        String str = this.f307046c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f307047d;
        return this.f307049f.hashCode() + r.i((iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31, 31, this.f307048e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigUploadDocSectionsItem(stringId=");
        sb2.append(this.f307045b);
        sb2.append(", title=");
        sb2.append(this.f307046c);
        sb2.append(", hint=");
        sb2.append(this.f307047d);
        sb2.append(", isRequired=");
        sb2.append(this.f307048e);
        sb2.append(", documents=");
        return H.p(sb2, this.f307049f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f307045b);
        parcel.writeString(this.f307046c);
        parcel.writeParcelable(this.f307047d, i12);
        parcel.writeInt(this.f307048e ? 1 : 0);
        Iterator itJ = C0.j(this.f307049f, parcel);
        while (itJ.hasNext()) {
            ((GigUploadDocDocumentItem) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
