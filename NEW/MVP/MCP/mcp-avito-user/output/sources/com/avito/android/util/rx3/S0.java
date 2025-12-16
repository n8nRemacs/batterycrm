package com.avito.android.util.rx3;

import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: Singles.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_rx_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes5.dex */
public final class S0 {

    /* compiled from: Singles.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f319007b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l lVar) {
            this.f319007b = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final /* synthetic */ void accept(Object obj) {
            this.f319007b.invoke(obj);
        }
    }

    @Y61.k
    @InterfaceC42830m
    public static final io.reactivex.rxjava3.internal.observers.m a(@Y61.k io.reactivex.rxjava3.core.I i12) {
        return (io.reactivex.rxjava3.internal.observers.m) i12.x(T0.f319009b, new l41.g() { // from class: com.avito.android.util.rx3.U0
            @Override // l41.g
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    @Y61.k
    @InterfaceC42830m
    public static final void b(@Y61.k io.reactivex.rxjava3.internal.operators.single.S s5, @Y61.k Y41.l lVar) {
        s5.x(new a(lVar), new l41.g() { // from class: com.avito.android.util.rx3.V0
            @Override // l41.g
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }
}
