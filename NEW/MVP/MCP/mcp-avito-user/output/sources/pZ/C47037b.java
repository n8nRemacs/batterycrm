package pZ;

import Y61.k;
import kotlin.Metadata;

/* compiled from: UnreadMessagesCounter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LpZ/b;", "", "", "channelsCount", "<init>", "(I)V", "I", "a", "()I", "_avito_messenger-unread-counter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pZ.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C47037b {

    @com.google.gson.annotations.c("channelsCount")
    private final int channelsCount;

    public C47037b(int i12) {
        this.channelsCount = i12;
    }

    /* renamed from: a, reason: from getter */
    public final int getChannelsCount() {
        return this.channelsCount;
    }

    @k
    public final String toString() {
        return AK.c.i(this.channelsCount, " }", new StringBuilder("UnreadMessagesCounter { channelsCount = "));
    }
}
