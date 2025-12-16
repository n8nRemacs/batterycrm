package com.avito.android.remote.model.evidence;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceData.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJN\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b/\u0010\u000eR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b0\u0010\u000e¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/evidence/EvidenceData;", "Landroid/os/Parcelable;", "", "appealId", "Lcom/avito/android/remote/model/evidence/ProofType;", "proofType", "appealUrl", "Lcom/avito/android/remote/model/evidence/AppealStatus;", "appealStatus", "userEmail", "userName", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/evidence/ProofType;Ljava/lang/String;Lcom/avito/android/remote/model/evidence/AppealStatus;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/evidence/ProofType;", "component3", "component4", "()Lcom/avito/android/remote/model/evidence/AppealStatus;", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/evidence/ProofType;Ljava/lang/String;Lcom/avito/android/remote/model/evidence/AppealStatus;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/evidence/EvidenceData;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAppealId", "Lcom/avito/android/remote/model/evidence/ProofType;", "getProofType", "getAppealUrl", "Lcom/avito/android/remote/model/evidence/AppealStatus;", "getAppealStatus", "getUserEmail", "getUserName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EvidenceData implements Parcelable {

    @k
    public static final Parcelable.Creator<EvidenceData> CREATOR = new Creator();

    @c("appealId")
    @k
    private final String appealId;

    @c("appealStatus")
    @k
    private final AppealStatus appealStatus;

    @c("appealUrl")
    @k
    private final String appealUrl;

    @c("proofType")
    @l
    private final ProofType proofType;

    @c("userEmail")
    @k
    private final String userEmail;

    @c("userName")
    @k
    private final String userName;

    /* compiled from: EvidenceData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EvidenceData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EvidenceData createFromParcel(@k Parcel parcel) {
            return new EvidenceData(parcel.readString(), parcel.readInt() == 0 ? null : ProofType.valueOf(parcel.readString()), parcel.readString(), AppealStatus.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EvidenceData[] newArray(int i12) {
            return new EvidenceData[i12];
        }
    }

    public EvidenceData(@k String str, @l ProofType proofType, @k String str2, @k AppealStatus appealStatus, @k String str3, @k String str4) {
        this.appealId = str;
        this.proofType = proofType;
        this.appealUrl = str2;
        this.appealStatus = appealStatus;
        this.userEmail = str3;
        this.userName = str4;
    }

    public static /* synthetic */ EvidenceData copy$default(EvidenceData evidenceData, String str, ProofType proofType, String str2, AppealStatus appealStatus, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = evidenceData.appealId;
        }
        if ((i12 & 2) != 0) {
            proofType = evidenceData.proofType;
        }
        ProofType proofType2 = proofType;
        if ((i12 & 4) != 0) {
            str2 = evidenceData.appealUrl;
        }
        String str5 = str2;
        if ((i12 & 8) != 0) {
            appealStatus = evidenceData.appealStatus;
        }
        AppealStatus appealStatus2 = appealStatus;
        if ((i12 & 16) != 0) {
            str3 = evidenceData.userEmail;
        }
        String str6 = str3;
        if ((i12 & 32) != 0) {
            str4 = evidenceData.userName;
        }
        return evidenceData.copy(str, proofType2, str5, appealStatus2, str6, str4);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getAppealId() {
        return this.appealId;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final ProofType getProofType() {
        return this.proofType;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getAppealUrl() {
        return this.appealUrl;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final AppealStatus getAppealStatus() {
        return this.appealStatus;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getUserEmail() {
        return this.userEmail;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @k
    public final EvidenceData copy(@k String appealId, @l ProofType proofType, @k String appealUrl, @k AppealStatus appealStatus, @k String userEmail, @k String userName) {
        return new EvidenceData(appealId, proofType, appealUrl, appealStatus, userEmail, userName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvidenceData)) {
            return false;
        }
        EvidenceData evidenceData = (EvidenceData) other;
        return L.f(this.appealId, evidenceData.appealId) && this.proofType == evidenceData.proofType && L.f(this.appealUrl, evidenceData.appealUrl) && this.appealStatus == evidenceData.appealStatus && L.f(this.userEmail, evidenceData.userEmail) && L.f(this.userName, evidenceData.userName);
    }

    @k
    public final String getAppealId() {
        return this.appealId;
    }

    @k
    public final AppealStatus getAppealStatus() {
        return this.appealStatus;
    }

    @k
    public final String getAppealUrl() {
        return this.appealUrl;
    }

    @l
    public final ProofType getProofType() {
        return this.proofType;
    }

    @k
    public final String getUserEmail() {
        return this.userEmail;
    }

    @k
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iHashCode = this.appealId.hashCode() * 31;
        ProofType proofType = this.proofType;
        return this.userName.hashCode() + H.d((this.appealStatus.hashCode() + H.d((iHashCode + (proofType == null ? 0 : proofType.hashCode())) * 31, 31, this.appealUrl)) * 31, 31, this.userEmail);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EvidenceData(appealId=");
        sb2.append(this.appealId);
        sb2.append(", proofType=");
        sb2.append(this.proofType);
        sb2.append(", appealUrl=");
        sb2.append(this.appealUrl);
        sb2.append(", appealStatus=");
        sb2.append(this.appealStatus);
        sb2.append(", userEmail=");
        sb2.append(this.userEmail);
        sb2.append(", userName=");
        return C22026a.c(sb2, this.userName, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.appealId);
        ProofType proofType = this.proofType;
        if (proofType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(proofType.name());
        }
        parcel.writeString(this.appealUrl);
        parcel.writeString(this.appealStatus.name());
        parcel.writeString(this.userEmail);
        parcel.writeString(this.userName);
    }
}
