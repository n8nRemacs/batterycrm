package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileInfoResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileInfoResponse;", "", "verticalId", "", "specificId", "name", "", "userHash", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSpecificId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUserHash", "getVerticalId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/ExtendedProfileInfoResponse;", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileInfoResponse {

    @c("name")
    @l
    private final String name;

    @c("specificId")
    @l
    private final Integer specificId;

    @c("userHash")
    @l
    private final String userHash;

    @c("verticalId")
    @l
    private final Integer verticalId;

    public ExtendedProfileInfoResponse(@l Integer num, @l Integer num2, @l String str, @l String str2) {
        this.verticalId = num;
        this.specificId = num2;
        this.name = str;
        this.userHash = str2;
    }

    public static /* synthetic */ ExtendedProfileInfoResponse copy$default(ExtendedProfileInfoResponse extendedProfileInfoResponse, Integer num, Integer num2, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = extendedProfileInfoResponse.verticalId;
        }
        if ((i12 & 2) != 0) {
            num2 = extendedProfileInfoResponse.specificId;
        }
        if ((i12 & 4) != 0) {
            str = extendedProfileInfoResponse.name;
        }
        if ((i12 & 8) != 0) {
            str2 = extendedProfileInfoResponse.userHash;
        }
        return extendedProfileInfoResponse.copy(num, num2, str, str2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getVerticalId() {
        return this.verticalId;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getSpecificId() {
        return this.specificId;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getUserHash() {
        return this.userHash;
    }

    @k
    public final ExtendedProfileInfoResponse copy(@l Integer verticalId, @l Integer specificId, @l String name, @l String userHash) {
        return new ExtendedProfileInfoResponse(verticalId, specificId, name, userHash);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileInfoResponse)) {
            return false;
        }
        ExtendedProfileInfoResponse extendedProfileInfoResponse = (ExtendedProfileInfoResponse) other;
        return L.f(this.verticalId, extendedProfileInfoResponse.verticalId) && L.f(this.specificId, extendedProfileInfoResponse.specificId) && L.f(this.name, extendedProfileInfoResponse.name) && L.f(this.userHash, extendedProfileInfoResponse.userHash);
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final Integer getSpecificId() {
        return this.specificId;
    }

    @l
    public final String getUserHash() {
        return this.userHash;
    }

    @l
    public final Integer getVerticalId() {
        return this.verticalId;
    }

    public int hashCode() {
        Integer num = this.verticalId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.specificId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userHash;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileInfoResponse(verticalId=");
        sb2.append(this.verticalId);
        sb2.append(", specificId=");
        sb2.append(this.specificId);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", userHash=");
        return C22026a.c(sb2, this.userHash, ')');
    }
}
