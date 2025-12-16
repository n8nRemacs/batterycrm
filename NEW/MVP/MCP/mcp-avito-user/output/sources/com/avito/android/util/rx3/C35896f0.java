package com.avito.android.util.rx3;

import io.reactivex.rxjava3.internal.operators.observable.C41948f0;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.C41988t;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: Observables.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_rx_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* renamed from: com.avito.android.util.rx3.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35896f0 {

    /* compiled from: Observables.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.rx3.f0$a */
    public static final class a implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f319022b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l lVar) {
            this.f319022b = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final /* synthetic */ void accept(Object obj) {
            this.f319022b.invoke(obj);
        }
    }

    @Y61.k
    public static final C41988t a(@Y61.k Y41.l lVar, @Y61.k ArrayList arrayList) {
        return io.reactivex.rxjava3.core.z.m(arrayList, new G(lVar));
    }

    @Y61.k
    public static final io.reactivex.rxjava3.core.z b(@Y61.k io.reactivex.rxjava3.core.z zVar, @Y61.k TimeUnit timeUnit, @Y61.k io.reactivex.rxjava3.core.H h12) {
        return io.reactivex.rxjava3.core.z.W(new com.avito.android.iac_dialer_watcher.impl_module.logging.repository.c(4)).T(new N(zVar), Integer.MAX_VALUE).T(new O(timeUnit, h12), Integer.MAX_VALUE);
    }

    @Y61.k
    public static final io.reactivex.rxjava3.core.z c(@Y61.k C41982q1 c41982q1, boolean z12, @Y61.k Y41.l lVar) {
        return z12 ? c41982q1.K(new a(lVar)) : c41982q1;
    }

    @Y61.k
    public static final io.reactivex.rxjava3.internal.operators.observable.B0 d(@Y61.k C41948f0 c41948f0) {
        return c41948f0.N(T.f319008b).d0(U.f319010b);
    }

    @Y61.k
    public static final io.reactivex.rxjava3.internal.operators.observable.W e(@Y61.k io.reactivex.rxjava3.core.z zVar, @Y61.k Y41.l lVar) {
        return zVar.N(new V(lVar));
    }

    @Y61.k
    @InterfaceC42830m
    public static final void f(@Y61.k C41982q1 c41982q1) {
        c41982q1.v0(C35898g0.f319024b, new l41.g() { // from class: com.avito.android.util.rx3.h0
            @Override // l41.g
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Y61.k
    @InterfaceC42830m
    public static final io.reactivex.rxjava3.internal.observers.y g(@Y61.k io.reactivex.rxjava3.core.z zVar, @Y61.k Y41.l lVar) {
        return (io.reactivex.rxjava3.internal.observers.y) zVar.v0(new a(lVar), new l41.g() { // from class: com.avito.android.util.rx3.i0
            @Override // l41.g
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }
}
