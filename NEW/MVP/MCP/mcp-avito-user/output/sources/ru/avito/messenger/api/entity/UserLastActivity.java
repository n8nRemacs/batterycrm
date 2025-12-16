package ru.avito.messenger.api.entity;

import Y61.k;
import Y61.l;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserLastActivity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/avito/messenger/api/entity/UserLastActivity;", "", "", ChannelContext.Item.USER_ID, "", "lastActionTime", "timeDiff", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "Ljava/lang/Long;", "getLastActionTime", "()Ljava/lang/Long;", "getTimeDiff", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UserLastActivity {

    @c("lastActionTime")
    @l
    private final Long lastActionTime;

    @c("timeDiff")
    @l
    private final Long timeDiff;

    @c("id")
    @k
    private final String userId;

    public UserLastActivity(@k String str, @l Long l12, @l Long l13) {
        this.userId = str;
        this.lastActionTime = l12;
        this.timeDiff = l13;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserLastActivity)) {
            return false;
        }
        UserLastActivity userLastActivity = (UserLastActivity) other;
        return L.f(this.userId, userLastActivity.userId) && L.f(this.lastActionTime, userLastActivity.lastActionTime) && L.f(this.timeDiff, userLastActivity.timeDiff);
    }

    @l
    public final Long getLastActionTime() {
        return this.lastActionTime;
    }

    @k
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.userId.hashCode() * 31;
        Long l12 = this.lastActionTime;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.timeDiff;
        return iHashCode2 + (l13 != null ? l13.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserLastActivity(userId=");
        sb2.append(this.userId);
        sb2.append(", lastActionTime=");
        sb2.append(this.lastActionTime);
        sb2.append(", timeDiff=");
        return m.m(sb2, this.timeDiff, ')');
    }
}
