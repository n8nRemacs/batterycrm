package ru.avito.messenger.api.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BlacklistUserRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/avito/messenger/api/entity/BlacklistUserRequest;", "", "", ChannelContext.Item.USER_ID, "channelId", "itemId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "getChannelId", "getItemId", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class BlacklistUserRequest {

    @c("channelId")
    @k
    private final String channelId;

    @c("itemId")
    @l
    private final String itemId;

    @c(ChannelContext.Item.USER_ID)
    @k
    private final String userId;

    public BlacklistUserRequest(@k String str, @k String str2, @l String str3) {
        this.userId = str;
        this.channelId = str2;
        this.itemId = str3;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlacklistUserRequest)) {
            return false;
        }
        BlacklistUserRequest blacklistUserRequest = (BlacklistUserRequest) other;
        return L.f(this.userId, blacklistUserRequest.userId) && L.f(this.channelId, blacklistUserRequest.channelId) && L.f(this.itemId, blacklistUserRequest.itemId);
    }

    public int hashCode() {
        int iD2 = H.d(this.userId.hashCode() * 31, 31, this.channelId);
        String str = this.itemId;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BlacklistUserRequest(userId=");
        sb2.append(this.userId);
        sb2.append(", channelId=");
        sb2.append(this.channelId);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.itemId, ')');
    }
}
