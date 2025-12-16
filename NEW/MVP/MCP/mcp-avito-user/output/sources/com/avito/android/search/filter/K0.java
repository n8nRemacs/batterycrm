package com.avito.android.search.filter;

import com.avito.android.location.r;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import kotlin.Metadata;

/* compiled from: FiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000f\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/G0;", "it", "Lorg/reactivestreams/c;", "Lcom/avito/android/remote/model/Location;", "Lj41/e;", "apply", "(Lkotlin/G0;)Lorg/reactivestreams/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class K0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f261872b;

    public K0(C34574h0 c34574h0) {
        this.f261872b = c34574h0;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return r.a.b(this.f261872b.f263346n, false, 1).G0(BackpressureStrategy.f401954c);
    }
}
