package ru.rustore.sdk.reactive.observable;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ObservableSwitchMap.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
/* loaded from: classes9.dex */
final class W extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y<Object, Object>.a f436906l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y<Object, Object> f436907m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y<Object, Object>.a aVar, Y<Object, Object> y12) {
        super(0);
        this.f436906l = aVar;
        this.f436907m = y12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        if (!this.f436906l.f436915b.compareAndSet(false, true)) {
            return G0.f406611a;
        }
        this.f436907m.getClass();
        throw null;
    }
}
