package com.vk.id.network.groupsubscription.data;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import androidx.media3.exoplayer.C23179x;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.vk.id.common.InternalVKIDApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InternalVKIDGroupData.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b\f\u0010!¨\u0006\""}, d2 = {"Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupData;", "", "", "imageUrl", "name", "description", "", "userImageUrls", "", "subscriberCount", "friendsCount", "", "isVerified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getName", "getDescription", "Ljava/util/List;", "getUserImageUrls", "()Ljava/util/List;", "I", "getSubscriberCount", "getFriendsCount", "Z", "()Z", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InternalVKIDGroupData {

    @k
    private final String description;
    private final int friendsCount;

    @k
    private final String imageUrl;
    private final boolean isVerified;

    @k
    private final String name;
    private final int subscriberCount;

    @k
    private final List<String> userImageUrls;

    public InternalVKIDGroupData(@k String str, @k String str2, @k String str3, @k List<String> list, int i12, int i13, boolean z12) {
        this.imageUrl = str;
        this.name = str2;
        this.description = str3;
        this.userImageUrls = list;
        this.subscriberCount = i12;
        this.friendsCount = i13;
        this.isVerified = z12;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalVKIDGroupData)) {
            return false;
        }
        InternalVKIDGroupData internalVKIDGroupData = (InternalVKIDGroupData) other;
        return L.f(this.imageUrl, internalVKIDGroupData.imageUrl) && L.f(this.name, internalVKIDGroupData.name) && L.f(this.description, internalVKIDGroupData.description) && L.f(this.userImageUrls, internalVKIDGroupData.userImageUrls) && this.subscriberCount == internalVKIDGroupData.subscriberCount && this.friendsCount == internalVKIDGroupData.friendsCount && this.isVerified == internalVKIDGroupData.isVerified;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    public final int getFriendsCount() {
        return this.friendsCount;
    }

    @k
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final int getSubscriberCount() {
        return this.subscriberCount;
    }

    @k
    public final List<String> getUserImageUrls() {
        return this.userImageUrls;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isVerified) + r.e(this.friendsCount, r.e(this.subscriberCount, H.e(H.d(H.d(this.imageUrl.hashCode() * 31, 31, this.name), 31, this.description), 31, this.userImageUrls), 31), 31);
    }

    /* renamed from: isVerified, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    @k
    public String toString() {
        String str = this.imageUrl;
        String str2 = this.name;
        String str3 = this.description;
        List<String> list = this.userImageUrls;
        int i12 = this.subscriberCount;
        int i13 = this.friendsCount;
        boolean z12 = this.isVerified;
        StringBuilder sbB = C23088b.b("InternalVKIDGroupData(imageUrl=", str, ", name=", str2, ", description=");
        sbB.append(str3);
        sbB.append(", userImageUrls=");
        sbB.append(list);
        sbB.append(", subscriberCount=");
        C23179x.a(sbB, i12, ", friendsCount=", i13, ", isVerified=");
        return r.s(")", sbB, z12);
    }
}
