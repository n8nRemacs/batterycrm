package com.avito.android.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Observables.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lio/reactivex/rxjava3/core/z;", "obs", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lio/reactivex/rxjava3/core/z;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/util/rx3/S", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.analytics.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28375c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f89692b;

    public C28375c(r rVar) {
        this.f89692b = rVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        io.reactivex.rxjava3.core.z zVar = (io.reactivex.rxjava3.core.z) obj;
        return io.reactivex.rxjava3.core.z.g0(zVar.q0(1L), zVar.z0(1L).K(new C28374b(this.f89692b)));
    }
}
