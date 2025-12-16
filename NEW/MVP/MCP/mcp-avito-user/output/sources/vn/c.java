package Vn;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1PromoCategoryTreeItemsResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"LVn/c;", "", "", "current", "discount", "old", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;)V", "J", "a", "()J", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "c", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    @com.google.gson.annotations.c("current")
    private final long current;

    @com.google.gson.annotations.c("discount")
    @l
    private final Long discount;

    @com.google.gson.annotations.c("old")
    @l
    private final Long old;

    public c(long j12, @l Long l12, @l Long l13) {
        this.current = j12;
        this.discount = l12;
        this.old = l13;
    }

    /* renamed from: a, reason: from getter */
    public final long getCurrent() {
        return this.current;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Long getDiscount() {
        return this.discount;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getOld() {
        return this.old;
    }
}
