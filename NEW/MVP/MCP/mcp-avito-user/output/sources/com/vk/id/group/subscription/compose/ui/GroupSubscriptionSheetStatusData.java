package com.vk.id.group.subscription.compose.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import androidx.media3.common.C23088b;
import androidx.media3.exoplayer.C23179x;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GroupSubscriptionSheetStatusData.kt */
@F3
@K51.d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b'\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b\f\u0010)¨\u0006*"}, d2 = {"Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "Landroid/os/Parcelable;", "", "groupImageUrl", "groupDescription", "groupName", "", "userImageUrls", "", "subscriberCount", "friendsCount", "", "isGroupVerified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIZ)V", "Landroid/os/Parcel;", "dest", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGroupImageUrl", "getGroupDescription", "getGroupName", "Ljava/util/List;", "getUserImageUrls", "()Ljava/util/List;", "I", "getSubscriberCount", "getFriendsCount", "Z", "()Z", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GroupSubscriptionSheetStatusData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<GroupSubscriptionSheetStatusData> CREATOR = new Creator();
    private final int friendsCount;

    @Y61.k
    private final String groupDescription;

    @Y61.k
    private final String groupImageUrl;

    @Y61.k
    private final String groupName;
    private final boolean isGroupVerified;
    private final int subscriberCount;

    @Y61.k
    private final List<String> userImageUrls;

    /* compiled from: GroupSubscriptionSheetStatusData.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GroupSubscriptionSheetStatusData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupSubscriptionSheetStatusData createFromParcel(Parcel parcel) {
            return new GroupSubscriptionSheetStatusData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupSubscriptionSheetStatusData[] newArray(int i12) {
            return new GroupSubscriptionSheetStatusData[i12];
        }
    }

    public GroupSubscriptionSheetStatusData(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k List<String> list, int i12, int i13, boolean z12) {
        this.groupImageUrl = str;
        this.groupDescription = str2;
        this.groupName = str3;
        this.userImageUrls = list;
        this.subscriberCount = i12;
        this.friendsCount = i13;
        this.isGroupVerified = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupSubscriptionSheetStatusData)) {
            return false;
        }
        GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData = (GroupSubscriptionSheetStatusData) other;
        return L.f(this.groupImageUrl, groupSubscriptionSheetStatusData.groupImageUrl) && L.f(this.groupDescription, groupSubscriptionSheetStatusData.groupDescription) && L.f(this.groupName, groupSubscriptionSheetStatusData.groupName) && L.f(this.userImageUrls, groupSubscriptionSheetStatusData.userImageUrls) && this.subscriberCount == groupSubscriptionSheetStatusData.subscriberCount && this.friendsCount == groupSubscriptionSheetStatusData.friendsCount && this.isGroupVerified == groupSubscriptionSheetStatusData.isGroupVerified;
    }

    public final int getFriendsCount() {
        return this.friendsCount;
    }

    @Y61.k
    public final String getGroupDescription() {
        return this.groupDescription;
    }

    @Y61.k
    public final String getGroupImageUrl() {
        return this.groupImageUrl;
    }

    @Y61.k
    public final String getGroupName() {
        return this.groupName;
    }

    public final int getSubscriberCount() {
        return this.subscriberCount;
    }

    @Y61.k
    public final List<String> getUserImageUrls() {
        return this.userImageUrls;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isGroupVerified) + r.e(this.friendsCount, r.e(this.subscriberCount, H.e(H.d(H.d(this.groupImageUrl.hashCode() * 31, 31, this.groupDescription), 31, this.groupName), 31, this.userImageUrls), 31), 31);
    }

    /* renamed from: isGroupVerified, reason: from getter */
    public final boolean getIsGroupVerified() {
        return this.isGroupVerified;
    }

    @Y61.k
    public String toString() {
        String str = this.groupImageUrl;
        String str2 = this.groupDescription;
        String str3 = this.groupName;
        List<String> list = this.userImageUrls;
        int i12 = this.subscriberCount;
        int i13 = this.friendsCount;
        boolean z12 = this.isGroupVerified;
        StringBuilder sbB = C23088b.b("GroupSubscriptionSheetStatusData(groupImageUrl=", str, ", groupDescription=", str2, ", groupName=");
        sbB.append(str3);
        sbB.append(", userImageUrls=");
        sbB.append(list);
        sbB.append(", subscriberCount=");
        C23179x.a(sbB, i12, ", friendsCount=", i13, ", isGroupVerified=");
        return r.s(")", sbB, z12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel dest, int flags) {
        dest.writeString(this.groupImageUrl);
        dest.writeString(this.groupDescription);
        dest.writeString(this.groupName);
        dest.writeStringList(this.userImageUrls);
        dest.writeInt(this.subscriberCount);
        dest.writeInt(this.friendsCount);
        dest.writeInt(this.isGroupVerified ? 1 : 0);
    }
}
