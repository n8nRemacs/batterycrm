package YF0;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: ApiTrxPromoConfigureV7Response.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"LYF0/i;", "", "LYF0/f;", "equal", PluralsKeys.OTHER, "sameMonth", "sameYear", "<init>", "(LYF0/f;LYF0/f;LYF0/f;LYF0/f;)V", "LYF0/f;", "a", "()LYF0/f;", "b", "c", "d", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i {

    @com.google.gson.annotations.c("equal")
    @Y61.k
    private final f equal;

    @com.google.gson.annotations.c(PluralsKeys.OTHER)
    @Y61.k
    private final f other;

    @com.google.gson.annotations.c("sameMonth")
    @Y61.k
    private final f sameMonth;

    @com.google.gson.annotations.c("sameYear")
    @Y61.k
    private final f sameYear;

    public i(@Y61.k f fVar, @Y61.k f fVar2, @Y61.k f fVar3, @Y61.k f fVar4) {
        this.equal = fVar;
        this.other = fVar2;
        this.sameMonth = fVar3;
        this.sameYear = fVar4;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final f getEqual() {
        return this.equal;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final f getOther() {
        return this.other;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final f getSameMonth() {
        return this.sameMonth;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final f getSameYear() {
        return this.sameYear;
    }
}
