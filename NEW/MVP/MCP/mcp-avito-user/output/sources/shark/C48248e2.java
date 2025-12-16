package shark;

import java.util.Comparator;
import kotlin.Metadata;

/* compiled from: Comparisons.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.e2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48248e2<T> implements Comparator<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t12, T t13) {
        return kotlin.comparisons.a.b(Long.valueOf(((shark.internal.X) ((shark.internal.hppc.f) t12).f438541b).getF438480b()), Long.valueOf(((shark.internal.X) ((shark.internal.hppc.f) t13).f438541b).getF438480b()));
    }
}
