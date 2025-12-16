package androidx.compose.foundation.lazy.layout;

import java.util.Comparator;
import kotlin.Metadata;

/* compiled from: Comparisons.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.lazy.layout.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20743w<T> implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f29549b;

    public C20743w(I i12) {
        this.f29549b = i12;
    }

    @Override // java.util.Comparator
    public final int compare(T t12, T t13) {
        Object key = ((T) t13).getKey();
        I i12 = this.f29549b;
        return kotlin.comparisons.a.b(Integer.valueOf(i12.b(key)), Integer.valueOf(i12.b(((T) t12).getKey())));
    }
}
