package org.koin.core.instance;

import Y61.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import w71.InterfaceC49462a;

/* compiled from: ScopedInstanceFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/koin/core/instance/f;", "T", "Lorg/koin/core/instance/e;", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f<T> extends e<T> {

    /* compiled from: ScopedInstanceFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f<T> f421461l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f<T> fVar, d dVar) {
            super(0);
            this.f421461l = fVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f421461l.getClass();
            throw null;
        }
    }

    public f() {
        throw null;
    }

    @Override // org.koin.core.instance.e
    public final T a(@k d dVar) {
        String str = dVar.f421458b.f421472b;
        throw null;
    }

    @Override // org.koin.core.instance.e
    public final T b(@k d dVar) {
        org.koin.core.scope.a aVar = dVar.f421458b;
        InterfaceC49462a interfaceC49462a = aVar.f421471a;
        org.koin.core.definition.a<T> aVar2 = this.f421460a;
        if (L.f(interfaceC49462a, aVar2.f421446a)) {
            org.koin.mp.d dVar2 = org.koin.mp.d.f421487a;
            a aVar3 = new a(this, dVar);
            dVar2.getClass();
            org.koin.mp.d.a(aVar3, this);
            throw null;
        }
        throw new IllegalStateException(("Wrong Scope: trying to open instance for " + aVar.f421472b + " in " + aVar2).toString());
    }
}
