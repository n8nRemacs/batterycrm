package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;

/* compiled from: Comparisons.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/comparisons/n;", "Ljava/util/Comparator;", "", "", "Lkotlin/Comparator;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class n implements Comparator<Comparable<? super Object>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final n f406749b = new n();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    @Y61.k
    public final Comparator<Comparable<? super Object>> reversed() {
        return o.f406750b;
    }
}
