package com.avito.android.confirm_documents_bottom_sheet.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DocumentButtonItem.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/models/DocumentButtonItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_confirm_documents_bottom_sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DocumentButtonItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<DocumentButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f125589b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f125590c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DocumentStatus f125591d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f125592e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ParametrizedClickStreamEvent f125593f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f125594g;

    /* compiled from: DocumentButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DocumentButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final DocumentButtonItem createFromParcel(Parcel parcel) {
            return new DocumentButtonItem(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DocumentStatus.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(DocumentButtonItem.class.getClassLoader()), (ParametrizedClickStreamEvent) parcel.readParcelable(DocumentButtonItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DocumentButtonItem[] newArray(int i12) {
            return new DocumentButtonItem[i12];
        }
    }

    public DocumentButtonItem(@k String str, @k String str2, @l DocumentStatus documentStatus, @l DeepLink deepLink, @l ParametrizedClickStreamEvent parametrizedClickStreamEvent, @k String str3) {
        this.f125589b = str;
        this.f125590c = str2;
        this.f125591d = documentStatus;
        this.f125592e = deepLink;
        this.f125593f = parametrizedClickStreamEvent;
        this.f125594g = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentButtonItem)) {
            return false;
        }
        DocumentButtonItem documentButtonItem = (DocumentButtonItem) obj;
        return L.f(this.f125589b, documentButtonItem.f125589b) && L.f(this.f125590c, documentButtonItem.f125590c) && this.f125591d == documentButtonItem.f125591d && L.f(this.f125592e, documentButtonItem.f125592e) && L.f(this.f125593f, documentButtonItem.f125593f) && L.f(this.f125594g, documentButtonItem.f125594g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF154316b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154316b() {
        return this.f125594g;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f125589b.hashCode() * 31, 31, this.f125590c);
        DocumentStatus documentStatus = this.f125591d;
        int iHashCode = (iD2 + (documentStatus == null ? 0 : documentStatus.hashCode())) * 31;
        DeepLink deepLink = this.f125592e;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        ParametrizedClickStreamEvent parametrizedClickStreamEvent = this.f125593f;
        return this.f125594g.hashCode() + ((iHashCode2 + (parametrizedClickStreamEvent != null ? parametrizedClickStreamEvent.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentButtonItem(title=");
        sb2.append(this.f125589b);
        sb2.append(", description=");
        sb2.append(this.f125590c);
        sb2.append(", status=");
        sb2.append(this.f125591d);
        sb2.append(", deeplink=");
        sb2.append(this.f125592e);
        sb2.append(", event=");
        sb2.append(this.f125593f);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f125594g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f125589b);
        parcel.writeString(this.f125590c);
        DocumentStatus documentStatus = this.f125591d;
        if (documentStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(documentStatus.name());
        }
        parcel.writeParcelable(this.f125592e, i12);
        parcel.writeParcelable(this.f125593f, i12);
        parcel.writeString(this.f125594g);
    }

    public /* synthetic */ DocumentButtonItem(String str, String str2, DocumentStatus documentStatus, DeepLink deepLink, ParametrizedClickStreamEvent parametrizedClickStreamEvent, String str3, int i12, C42822w c42822w) {
        this(str, str2, documentStatus, deepLink, parametrizedClickStreamEvent, (i12 & 32) != 0 ? str : str3);
    }
}
