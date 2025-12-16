package k91;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserSession.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lk91/j;", "", "", ChannelContext.Item.USER_ID, "", "serverTime", "Lk91/i;", "options", "sequenceId", "Lk91/c;", Navigation.CONFIG, "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lk91/i;Ljava/lang/String;Lk91/c;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/lang/Long;", "getServerTime", "()Ljava/lang/Long;", "Lk91/i;", "getOptions", "()Lk91/i;", "b", "Lk91/c;", "a", "()Lk91/c;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k91.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* data */ class C42552j {

    @com.google.gson.annotations.c(Navigation.CONFIG)
    @l
    private final C42545c config;

    @com.google.gson.annotations.c("options")
    @l
    private final C42551i options;

    @com.google.gson.annotations.c("seq")
    @l
    private final String sequenceId;

    @com.google.gson.annotations.c("serverTime")
    @l
    private final Long serverTime;

    @com.google.gson.annotations.c(ChannelContext.Item.USER_ID)
    @k
    private final String userId;

    public C42552j(@k String str, @l Long l12, @l C42551i c42551i, @l String str2, @l C42545c c42545c) {
        this.userId = str;
        this.serverTime = l12;
        this.options = c42551i;
        this.sequenceId = str2;
        this.config = c42545c;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C42545c getConfig() {
        return this.config;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getSequenceId() {
        return this.sequenceId;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42552j)) {
            return false;
        }
        C42552j c42552j = (C42552j) obj;
        return L.f(this.userId, c42552j.userId) && L.f(this.serverTime, c42552j.serverTime) && L.f(this.options, c42552j.options) && L.f(this.sequenceId, c42552j.sequenceId) && L.f(this.config, c42552j.config);
    }

    public final int hashCode() {
        int iHashCode = this.userId.hashCode() * 31;
        Long l12 = this.serverTime;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        C42551i c42551i = this.options;
        int iHashCode3 = (iHashCode2 + (c42551i == null ? 0 : c42551i.hashCode())) * 31;
        String str = this.sequenceId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C42545c c42545c = this.config;
        return iHashCode4 + (c42545c != null ? c42545c.hashCode() : 0);
    }

    @k
    public final String toString() {
        return AK.c.s(new StringBuilder("UserSession(userId='"), this.userId, "')");
    }

    public /* synthetic */ C42552j(String str, Long l12, C42551i c42551i, String str2, C42545c c42545c, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : l12, (i12 & 4) != 0 ? null : c42551i, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : c42545c);
    }
}
