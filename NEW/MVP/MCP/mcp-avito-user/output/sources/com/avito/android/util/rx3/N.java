package com.avito.android.util.rx3;

import kotlin.Metadata;

/* compiled from: Observables.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00060\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "", "kotlin.jvm.PlatformType", "startTime", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Q;", "apply", "(Ljava/lang/Long;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class N<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.z<T> f319004b;

    public N(io.reactivex.rxjava3.core.z<T> zVar) {
        this.f319004b = zVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f319004b.d0(new M((Long) obj));
    }
}
