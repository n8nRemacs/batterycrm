package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DocumentsForm.kt */
@d
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/mortgage/api/model/DocumentsForm;", "Landroid/os/Parcelable;", "", "analyticsAttrTitle", "title", "Lcom/avito/android/remote/model/text/AttributedText;", RequestReviewResultKt.INFO_TYPE, "limitsInfo", "", "Lcom/avito/android/mortgage/api/model/RemoteValidFile;", "uploadedFiles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DocumentsForm implements Parcelable {

    @k
    public static final Parcelable.Creator<DocumentsForm> CREATOR = new a();

    @c("analyticsAttrTitle")
    @k
    private final String analyticsAttrTitle;

    @c(RequestReviewResultKt.INFO_TYPE)
    @k
    private final AttributedText info;

    @c("limitsInfo")
    @k
    private final String limitsInfo;

    @c("title")
    @k
    private final String title;

    @c("uploadedFiles")
    @l
    private final List<RemoteValidFile> uploadedFiles;

    /* compiled from: DocumentsForm.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DocumentsForm> {
        @Override // android.os.Parcelable.Creator
        public final DocumentsForm createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DocumentsForm.class.getClassLoader());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(RemoteValidFile.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new DocumentsForm(string, string2, attributedText, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DocumentsForm[] newArray(int i12) {
            return new DocumentsForm[i12];
        }
    }

    public DocumentsForm(@k String str, @k String str2, @k AttributedText attributedText, @k String str3, @l List<RemoteValidFile> list) {
        this.analyticsAttrTitle = str;
        this.title = str2;
        this.info = attributedText;
        this.limitsInfo = str3;
        this.uploadedFiles = list;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAnalyticsAttrTitle() {
        return this.analyticsAttrTitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getInfo() {
        return this.info;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getLimitsInfo() {
        return this.limitsInfo;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentsForm)) {
            return false;
        }
        DocumentsForm documentsForm = (DocumentsForm) obj;
        return L.f(this.analyticsAttrTitle, documentsForm.analyticsAttrTitle) && L.f(this.title, documentsForm.title) && L.f(this.info, documentsForm.info) && L.f(this.limitsInfo, documentsForm.limitsInfo) && L.f(this.uploadedFiles, documentsForm.uploadedFiles);
    }

    @l
    public final List<RemoteValidFile> f() {
        return this.uploadedFiles;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iD2 = H.d(com.avito.android.actions_sheet.a.b(H.d(this.analyticsAttrTitle.hashCode() * 31, 31, this.title), 31, this.info), 31, this.limitsInfo);
        List<RemoteValidFile> list = this.uploadedFiles;
        return iD2 + (list == null ? 0 : list.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentsForm(analyticsAttrTitle=");
        sb2.append(this.analyticsAttrTitle);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", info=");
        sb2.append(this.info);
        sb2.append(", limitsInfo=");
        sb2.append(this.limitsInfo);
        sb2.append(", uploadedFiles=");
        return H.p(sb2, this.uploadedFiles, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.analyticsAttrTitle);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.info, i12);
        parcel.writeString(this.limitsInfo);
        List<RemoteValidFile> list = this.uploadedFiles;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((RemoteValidFile) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
