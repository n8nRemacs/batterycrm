package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.AbstractC20735o;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: LazyListIntervalContent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/E;", "Landroidx/compose/foundation/lazy/layout/o$a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E implements AbstractC20735o.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final kotlin.jvm.internal.N f28813a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, Object> f28814b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C22096n f28815c;

    /* JADX WARN: Multi-variable type inference failed */
    public E(@Y61.l Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k C22096n c22096n) {
        this.f28813a = (kotlin.jvm.internal.N) lVar;
        this.f28814b = lVar2;
        this.f28815c = c22096n;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l<java.lang.Integer, java.lang.Object>, kotlin.jvm.internal.N] */
    @Override // androidx.compose.foundation.lazy.layout.AbstractC20735o.a
    @Y61.l
    public final Y41.l<Integer, Object> getKey() {
        return this.f28813a;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC20735o.a
    @Y61.k
    public final Y41.l<Integer, Object> getType() {
        return this.f28814b;
    }
}
