package kotlin.reflect.jvm.internal.impl.types.error;

import Y61.k;
import Y61.l;
import java.util.Collection;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.collections.B0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.D;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.descriptors.P;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* compiled from: ErrorModuleDescriptor.kt */
/* loaded from: classes8.dex */
public final class c implements E {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final c f410178b = new c();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final kotlin.reflect.jvm.internal.impl.name.f f410179c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C42784z0 f410180d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final InterfaceC42726C f410181e;

    /* compiled from: ErrorModuleDescriptor.kt */
    public static final class a extends N implements Y41.a<kotlin.reflect.jvm.internal.impl.builtins.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f410182l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.reflect.jvm.internal.impl.builtins.e invoke() {
            kotlin.reflect.jvm.internal.impl.builtins.e.f407194g.getClass();
            return kotlin.reflect.jvm.internal.impl.builtins.e.f407195h.getValue();
        }
    }

    static {
        ErrorEntity[] errorEntityArr = ErrorEntity.f410134b;
        f410179c = kotlin.reflect.jvm.internal.impl.name.f.h("<Error module>");
        f410180d = C42784z0.f406748b;
        B0 b02 = B0.f406639b;
        f410181e = C42727D.c(a.f410182l);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @l
    public final <R, D> R A(@k InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.E
    public final boolean b0(@k E e12) {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @l
    public final InterfaceC42882k f() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        return g.a.f407524b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.G
    @k
    public final kotlin.reflect.jvm.internal.impl.name.f getName() {
        return f410179c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.E
    @k
    public final P i0(@k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        throw new IllegalStateException("Should not be called!");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.E
    @k
    public final Collection<kotlin.reflect.jvm.internal.impl.name.c> j(@k kotlin.reflect.jvm.internal.impl.name.c cVar, @k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.E
    @k
    public final kotlin.reflect.jvm.internal.impl.builtins.k m() {
        return (kotlin.reflect.jvm.internal.impl.builtins.k) f410181e.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.E
    @l
    public final <T> T o0(@k D<T> d12) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.E
    @k
    public final List<E> y() {
        return f410180d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @k
    /* renamed from: a */
    public final InterfaceC42882k n0() {
        return this;
    }
}
