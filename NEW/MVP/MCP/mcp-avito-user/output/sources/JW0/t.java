package jw0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1StrBookingFormGetResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Ljw0/t;", "", "", "blockSpacing", "", "Ljw0/u;", "blocks", "dashHeight", "leftBlock", "rightBlock", "<init>", "(JLjava/util/List;JLjw0/u;Ljw0/u;)V", "J", "a", "()J", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "Ljw0/u;", "d", "()Ljw0/u;", "e", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t {

    @com.google.gson.annotations.c("blockSpacing")
    private final long blockSpacing;

    @com.google.gson.annotations.c("blocks")
    @Y61.l
    private final List<u> blocks;

    @com.google.gson.annotations.c("dashHeight")
    private final long dashHeight;

    @com.google.gson.annotations.c("leftBlock")
    @Y61.k
    private final u leftBlock;

    @com.google.gson.annotations.c("rightBlock")
    @Y61.k
    private final u rightBlock;

    public t(long j12, @Y61.l List<u> list, long j13, @Y61.k u uVar, @Y61.k u uVar2) {
        this.blockSpacing = j12;
        this.blocks = list;
        this.dashHeight = j13;
        this.leftBlock = uVar;
        this.rightBlock = uVar2;
    }

    /* renamed from: a, reason: from getter */
    public final long getBlockSpacing() {
        return this.blockSpacing;
    }

    @Y61.l
    public final List<u> b() {
        return this.blocks;
    }

    /* renamed from: c, reason: from getter */
    public final long getDashHeight() {
        return this.dashHeight;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final u getLeftBlock() {
        return this.leftBlock;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final u getRightBlock() {
        return this.rightBlock;
    }
}
