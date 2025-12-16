package com.vk.id.network.groupsubscription.data;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.vk.id.common.InternalVKIDApi;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InternalVKIDGroupByIdData.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\b\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;", "", "", "groupId", "name", "imageUrl", "description", "", "isVerified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGroupId", "getName", "getImageUrl", "getDescription", "Z", "()Z", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InternalVKIDGroupByIdData {

    @k
    private final String description;

    @k
    private final String groupId;

    @k
    private final String imageUrl;
    private final boolean isVerified;

    @k
    private final String name;

    public InternalVKIDGroupByIdData(@k String str, @k String str2, @k String str3, @k String str4, boolean z12) {
        this.groupId = str;
        this.name = str2;
        this.imageUrl = str3;
        this.description = str4;
        this.isVerified = z12;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalVKIDGroupByIdData)) {
            return false;
        }
        InternalVKIDGroupByIdData internalVKIDGroupByIdData = (InternalVKIDGroupByIdData) other;
        return L.f(this.groupId, internalVKIDGroupByIdData.groupId) && L.f(this.name, internalVKIDGroupByIdData.name) && L.f(this.imageUrl, internalVKIDGroupByIdData.imageUrl) && L.f(this.description, internalVKIDGroupByIdData.description) && this.isVerified == internalVKIDGroupByIdData.isVerified;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isVerified) + H.d(H.d(H.d(this.groupId.hashCode() * 31, 31, this.name), 31, this.imageUrl), 31, this.description);
    }

    /* renamed from: isVerified, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    @k
    public String toString() {
        String str = this.groupId;
        String str2 = this.name;
        String str3 = this.imageUrl;
        String str4 = this.description;
        boolean z12 = this.isVerified;
        StringBuilder sbB = C23088b.b("InternalVKIDGroupByIdData(groupId=", str, ", name=", str2, ", imageUrl=");
        m.p(sbB, str3, ", description=", str4, ", isVerified=");
        return r.s(")", sbB, z12);
    }
}
