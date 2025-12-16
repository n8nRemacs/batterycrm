package org.koin.core.instance;

import Y61.k;
import Y61.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SingleInstanceFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/koin/core/instance/g;", "T", "Lorg/koin/core/instance/e;", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class g<T> extends e<T> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public T f421462b;

    /* compiled from: SingleInstanceFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g<T> f421463l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f421464m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g<T> gVar, d dVar) {
            super(0);
            this.f421463l = gVar;
            this.f421464m = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            g<T> gVar = this.f421463l;
            if (gVar.f421462b == null) {
                gVar.f421462b = gVar.a(this.f421464m);
            }
            return G0.f406611a;
        }
    }

    public g() {
        throw null;
    }

    @Override // org.koin.core.instance.e
    public final T a(@k d dVar) {
        T t12 = this.f421462b;
        if (t12 == null) {
            return (T) super.a(dVar);
        }
        if (t12 != null) {
            return t12;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override // org.koin.core.instance.e
    public final T b(@k d dVar) {
        org.koin.mp.d dVar2 = org.koin.mp.d.f421487a;
        a aVar = new a(this, dVar);
        dVar2.getClass();
        org.koin.mp.d.a(aVar, this);
        T t12 = this.f421462b;
        if (t12 != null) {
            return t12;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }
}
