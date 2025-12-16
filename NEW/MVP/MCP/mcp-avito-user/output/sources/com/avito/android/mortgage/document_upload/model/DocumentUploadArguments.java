package com.avito.android.mortgage.document_upload.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.mortgage.api.model.RemoteValidFile;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: DocumentUploadArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/model/DocumentUploadArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DocumentUploadArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<DocumentUploadArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f199378b;

    /* renamed from: c, reason: collision with root package name */
    public final int f199379c;

    /* renamed from: d, reason: collision with root package name */
    public final int f199380d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f199381e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AttributedText f199382f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f199383g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f199384h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f199385i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f199386j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f199387k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f199388l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f199389m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final List<String> f199390n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final List<RemoteValidFile> f199391o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final String f199392p;

    /* compiled from: DocumentUploadArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DocumentUploadArguments> {
        @Override // android.os.Parcelable.Creator
        public final DocumentUploadArguments createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DocumentUploadArguments.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iC2 = 0;
            while (iC2 != i14) {
                iC2 = com.avito.android.actions_sheet.a.c(RemoteValidFile.CREATOR, parcel, arrayList, iC2, 1);
                i14 = i14;
                string9 = string9;
            }
            return new DocumentUploadArguments(string, i12, i13, string2, attributedText, string3, string4, string5, string6, string7, string8, string9, arrayListCreateStringArrayList, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DocumentUploadArguments[] newArray(int i12) {
            return new DocumentUploadArguments[i12];
        }
    }

    public DocumentUploadArguments(@k String str, int i12, int i13, @k String str2, @k AttributedText attributedText, @k String str3, @k String str4, @k String str5, @k String str6, @l String str7, @l String str8, @k String str9, @k List<String> list, @k List<RemoteValidFile> list2, @l String str10) {
        this.f199378b = str;
        this.f199379c = i12;
        this.f199380d = i13;
        this.f199381e = str2;
        this.f199382f = attributedText;
        this.f199383g = str3;
        this.f199384h = str4;
        this.f199385i = str5;
        this.f199386j = str6;
        this.f199387k = str7;
        this.f199388l = str8;
        this.f199389m = str9;
        this.f199390n = list;
        this.f199391o = list2;
        this.f199392p = str10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentUploadArguments)) {
            return false;
        }
        DocumentUploadArguments documentUploadArguments = (DocumentUploadArguments) obj;
        return L.f(this.f199378b, documentUploadArguments.f199378b) && this.f199379c == documentUploadArguments.f199379c && this.f199380d == documentUploadArguments.f199380d && L.f(this.f199381e, documentUploadArguments.f199381e) && L.f(this.f199382f, documentUploadArguments.f199382f) && L.f(this.f199383g, documentUploadArguments.f199383g) && L.f(this.f199384h, documentUploadArguments.f199384h) && L.f(this.f199385i, documentUploadArguments.f199385i) && L.f(this.f199386j, documentUploadArguments.f199386j) && L.f(this.f199387k, documentUploadArguments.f199387k) && L.f(this.f199388l, documentUploadArguments.f199388l) && L.f(this.f199389m, documentUploadArguments.f199389m) && L.f(this.f199390n, documentUploadArguments.f199390n) && L.f(this.f199391o, documentUploadArguments.f199391o) && L.f(this.f199392p, documentUploadArguments.f199392p);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(H.d(com.avito.android.actions_sheet.a.b(H.d(r.e(this.f199380d, r.e(this.f199379c, this.f199378b.hashCode() * 31, 31), 31), 31, this.f199381e), 31, this.f199382f), 31, this.f199383g), 31, this.f199384h), 31, this.f199385i), 31, this.f199386j);
        String str = this.f199387k;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f199388l;
        int iE2 = H.e(H.e(H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f199389m), 31, this.f199390n), 31, this.f199391o);
        String str3 = this.f199392p;
        return iE2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentUploadArguments(name=");
        sb2.append(this.f199378b);
        sb2.append(", screenNumber=");
        sb2.append(this.f199379c);
        sb2.append(", screensCount=");
        sb2.append(this.f199380d);
        sb2.append(", title=");
        sb2.append(this.f199381e);
        sb2.append(", description=");
        sb2.append(this.f199382f);
        sb2.append(", fileLimits=");
        sb2.append(this.f199383g);
        sb2.append(", packageId=");
        sb2.append(this.f199384h);
        sb2.append(", documentId=");
        sb2.append(this.f199385i);
        sb2.append(", clientProfileId=");
        sb2.append(this.f199386j);
        sb2.append(", applicationId=");
        sb2.append(this.f199387k);
        sb2.append(", applicantType=");
        sb2.append(this.f199388l);
        sb2.append(", analyticsAttrTitle=");
        sb2.append(this.f199389m);
        sb2.append(", documents=");
        sb2.append(this.f199390n);
        sb2.append(", files=");
        sb2.append(this.f199391o);
        sb2.append(", error=");
        return C22026a.c(sb2, this.f199392p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f199378b);
        parcel.writeInt(this.f199379c);
        parcel.writeInt(this.f199380d);
        parcel.writeString(this.f199381e);
        parcel.writeParcelable(this.f199382f, i12);
        parcel.writeString(this.f199383g);
        parcel.writeString(this.f199384h);
        parcel.writeString(this.f199385i);
        parcel.writeString(this.f199386j);
        parcel.writeString(this.f199387k);
        parcel.writeString(this.f199388l);
        parcel.writeString(this.f199389m);
        parcel.writeStringList(this.f199390n);
        Iterator itJ = C0.j(this.f199391o, parcel);
        while (itJ.hasNext()) {
            ((RemoteValidFile) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f199392p);
    }

    public /* synthetic */ DocumentUploadArguments(String str, int i12, int i13, String str2, AttributedText attributedText, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2, String str10, int i14, C42822w c42822w) {
        this(str, i12, i13, str2, attributedText, str3, str4, str5, str6, str7, str8, str9, list, list2, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str10);
    }
}
