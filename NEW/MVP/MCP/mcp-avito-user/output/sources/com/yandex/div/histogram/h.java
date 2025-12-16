package com.yandex.div.histogram;

import javax.inject.Provider;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: HistogramConfiguration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/histogram/h;", "T", "Ljavax/inject/Provider;", "div-histogram_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class h<T> implements Provider<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f370016a;

    public h(@Y61.k Y41.a<? extends T> aVar) {
        this.f370016a = C42727D.c(aVar);
    }

    @Override // javax.inject.Provider
    public final T get() {
        return (T) this.f370016a.getValue();
    }
}
