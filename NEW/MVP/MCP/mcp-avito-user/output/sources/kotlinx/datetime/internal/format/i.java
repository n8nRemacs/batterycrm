package kotlinx.datetime.internal.format;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Predicate.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/i;", "T", "Lkotlinx/datetime/internal/format/w;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class i<T> implements w<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f412525a;

    public i(@Y61.k ArrayList arrayList) {
        this.f412525a = arrayList;
    }

    @Override // kotlinx.datetime.internal.format.w
    public final boolean test(T t12) {
        ArrayList arrayList = this.f412525a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((w) it.next()).test(t12)) {
                return false;
            }
        }
        return true;
    }
}
