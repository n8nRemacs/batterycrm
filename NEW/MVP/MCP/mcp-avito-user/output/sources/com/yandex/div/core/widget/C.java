package com.yandex.div.core.widget;

import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GridContainer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/widget/C;", "T", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class C<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final N f369240a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public T f369241b;

    /* JADX WARN: Multi-variable type inference failed */
    public C(@Y61.k Y41.a<? extends T> aVar) {
        this.f369240a = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Y41.a, kotlin.jvm.internal.N] */
    public final T a() {
        if (this.f369241b == null) {
            this.f369241b = (T) this.f369240a.invoke();
        }
        T t12 = this.f369241b;
        if (t12 != null) {
            return t12;
        }
        throw new ConcurrentModificationException("Set to null by another thread");
    }
}
