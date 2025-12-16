package androidx.compose.runtime.collection;

import Y41.l;
import java.util.Comparator;
import kotlin.Metadata;

/* compiled from: Comparisons.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b<T> implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f38258b;

    public b(l lVar) {
        this.f38258b = lVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t12, T t13) {
        l lVar = this.f38258b;
        return kotlin.comparisons.a.b((Comparable) lVar.invoke(t12), (Comparable) lVar.invoke(t13));
    }
}
