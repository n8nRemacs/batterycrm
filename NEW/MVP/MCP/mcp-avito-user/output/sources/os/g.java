package os;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostResponse.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Los/g;", "", "Los/k;", "hint", "Los/v;", "input", "", "Los/A;", "steps", "<init>", "(Los/k;Los/v;Ljava/util/List;)V", "Los/k;", "a", "()Los/k;", "Los/v;", "b", "()Los/v;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {

    @com.google.gson.annotations.c("hint")
    @Y61.k
    private final k hint;

    @com.google.gson.annotations.c("input")
    @Y61.k
    private final v input;

    @com.google.gson.annotations.c("steps")
    @Y61.k
    private final List<C44929A> steps;

    public g(@Y61.k k kVar, @Y61.k v vVar, @Y61.k List<C44929A> list) {
        this.hint = kVar;
        this.input = vVar;
        this.steps = list;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final k getHint() {
        return this.hint;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final v getInput() {
        return this.input;
    }

    @Y61.k
    public final List<C44929A> c() {
        return this.steps;
    }
}
