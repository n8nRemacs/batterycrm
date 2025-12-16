package com.avito.android.developments_agency_search.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UploadDealDocumentResponse.kt */
@P
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/UploadDealDocumentResponse;", "Landroid/os/Parcelable;", "", "allDocumentsUploaded", "", "downloadUrl", "fileId", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/avito/android/developments_agency_search/domain/UploadDealDocumentResponse;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getAllDocumentsUploaded", "Ljava/lang/String;", "getDownloadUrl", "getFileId", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes13.dex */
public final /* data */ class UploadDealDocumentResponse implements Parcelable {
    public static final int $stable = 0;

    @k
    public static final Parcelable.Creator<UploadDealDocumentResponse> CREATOR = new a();

    @c("allDocumentsUploaded")
    private final boolean allDocumentsUploaded;

    @c("downloadURL")
    @k
    private final String downloadUrl;

    @c("fileID")
    @k
    private final String fileId;

    /* compiled from: UploadDealDocumentResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UploadDealDocumentResponse> {
        @Override // android.os.Parcelable.Creator
        public final UploadDealDocumentResponse createFromParcel(Parcel parcel) {
            return new UploadDealDocumentResponse(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UploadDealDocumentResponse[] newArray(int i12) {
            return new UploadDealDocumentResponse[i12];
        }
    }

    public UploadDealDocumentResponse(boolean z12, @k String str, @k String str2) {
        this.allDocumentsUploaded = z12;
        this.downloadUrl = str;
        this.fileId = str2;
    }

    public static /* synthetic */ UploadDealDocumentResponse copy$default(UploadDealDocumentResponse uploadDealDocumentResponse, boolean z12, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = uploadDealDocumentResponse.allDocumentsUploaded;
        }
        if ((i12 & 2) != 0) {
            str = uploadDealDocumentResponse.downloadUrl;
        }
        if ((i12 & 4) != 0) {
            str2 = uploadDealDocumentResponse.fileId;
        }
        return uploadDealDocumentResponse.copy(z12, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAllDocumentsUploaded() {
        return this.allDocumentsUploaded;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    @k
    public final UploadDealDocumentResponse copy(boolean allDocumentsUploaded, @k String downloadUrl, @k String fileId) {
        return new UploadDealDocumentResponse(allDocumentsUploaded, downloadUrl, fileId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadDealDocumentResponse)) {
            return false;
        }
        UploadDealDocumentResponse uploadDealDocumentResponse = (UploadDealDocumentResponse) other;
        return this.allDocumentsUploaded == uploadDealDocumentResponse.allDocumentsUploaded && L.f(this.downloadUrl, uploadDealDocumentResponse.downloadUrl) && L.f(this.fileId, uploadDealDocumentResponse.fileId);
    }

    public final boolean getAllDocumentsUploaded() {
        return this.allDocumentsUploaded;
    }

    @k
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @k
    public final String getFileId() {
        return this.fileId;
    }

    public int hashCode() {
        return this.fileId.hashCode() + H.d(Boolean.hashCode(this.allDocumentsUploaded) * 31, 31, this.downloadUrl);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UploadDealDocumentResponse(allDocumentsUploaded=");
        sb2.append(this.allDocumentsUploaded);
        sb2.append(", downloadUrl=");
        sb2.append(this.downloadUrl);
        sb2.append(", fileId=");
        return C22026a.c(sb2, this.fileId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.allDocumentsUploaded ? 1 : 0);
        parcel.writeString(this.downloadUrl);
        parcel.writeString(this.fileId);
    }
}
