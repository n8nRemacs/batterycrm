package iB0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: CprConfigureAdvanceManualResult.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LiB0/j;", "", "", "price", "LiB0/f;", "messagePatternPlurals", "<init>", "(FLiB0/f;)V", "F", "b", "()F", "LiB0/f;", "a", "()LiB0/f;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    @com.google.gson.annotations.c("messagePatternPlurals")
    @l
    private final f messagePatternPlurals;

    @com.google.gson.annotations.c("price")
    private final float price;

    public j(float f12, @l f fVar) {
        this.price = f12;
        this.messagePatternPlurals = fVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final f getMessagePatternPlurals() {
        return this.messagePatternPlurals;
    }

    /* renamed from: b, reason: from getter */
    public final float getPrice() {
        return this.price;
    }
}
