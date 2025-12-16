package com.avito.android.util.rx3;

import io.reactivex.rxjava3.core.AbstractC41777j;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: Flowables.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_rx_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes5.dex */
public final class r {

    /* compiled from: Flowables.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class a implements l41.g {
        @Override // l41.g
        public final /* synthetic */ void accept(Object obj) {
            throw null;
        }
    }

    /* compiled from: Flowables.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f319038b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l lVar) {
            this.f319038b = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final /* synthetic */ void accept(Object obj) {
            this.f319038b.invoke(obj);
        }
    }

    @Y61.k
    @InterfaceC42830m
    public static final io.reactivex.rxjava3.internal.subscribers.n a(@Y61.k AbstractC41777j abstractC41777j, @Y61.k Y41.l lVar) {
        return (io.reactivex.rxjava3.internal.subscribers.n) abstractC41777j.p(new b(lVar), new l41.g() { // from class: com.avito.android.util.rx3.u
            @Override // l41.g
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }
}
