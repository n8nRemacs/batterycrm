package com.yandex.div.internal.util;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/internal/util/y;", "T", "Lkotlin/properties/h;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class y<T> implements kotlin.properties.h<Object, T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final WeakReference<T> f370189b;

    /* JADX WARN: Illegal instructions before constructor call */
    public y() {
        C42822w c42822w = null;
        this(c42822w, 1, c42822w);
    }

    @Override // kotlin.properties.g
    @Y61.l
    public final T getValue(@Y61.l Object obj, @Y61.k kotlin.reflect.n<?> nVar) {
        WeakReference<T> weakReference = this.f370189b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // kotlin.properties.h
    public final void setValue(@Y61.l Object obj, @Y61.k kotlin.reflect.n<?> nVar, @Y61.l T t12) {
        throw null;
    }

    public y(@Y61.l T t12) {
        this.f370189b = t12 == null ? null : new WeakReference<>(t12);
    }

    public /* synthetic */ y(Object obj, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : obj);
    }
}
