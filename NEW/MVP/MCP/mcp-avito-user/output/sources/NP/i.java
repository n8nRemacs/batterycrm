package Np;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"LNp/i;", "", "", "calls", "chats", "favorites", "targetCalls", "targetChats", "views", "<init>", "(JJJJJJ)V", "J", "getCalls", "()J", "getChats", "getFavorites", "getTargetCalls", "getTargetChats", "getViews", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i {

    @com.google.gson.annotations.c("calls")
    private final long calls;

    @com.google.gson.annotations.c("chats")
    private final long chats;

    @com.google.gson.annotations.c("favorites")
    private final long favorites;

    @com.google.gson.annotations.c("targetCalls")
    private final long targetCalls;

    @com.google.gson.annotations.c("targetChats")
    private final long targetChats;

    @com.google.gson.annotations.c("views")
    private final long views;

    public i(long j12, long j13, long j14, long j15, long j16, long j17) {
        this.calls = j12;
        this.chats = j13;
        this.favorites = j14;
        this.targetCalls = j15;
        this.targetChats = j16;
        this.views = j17;
    }
}
