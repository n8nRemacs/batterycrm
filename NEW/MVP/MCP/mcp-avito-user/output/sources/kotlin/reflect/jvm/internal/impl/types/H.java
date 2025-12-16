package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import u51.InterfaceC48804f;

/* compiled from: KotlinType.kt */
/* loaded from: classes8.dex */
public abstract class H extends J0 implements InterfaceC48804f {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y f410024c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y f410025d;

    public H(@Y61.k Y y12, @Y61.k Y y13) {
        super(null);
        this.f410024c = y12;
        this.f410025d = y13;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final List<x0> F0() {
        return O0().F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public n0 G0() {
        return O0().G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final q0 H0() {
        return O0().H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public boolean I0() {
        return O0().I0();
    }

    @Y61.k
    public abstract Y O0();

    @Y61.k
    public abstract String P0(@Y61.k kotlin.reflect.jvm.internal.impl.renderer.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.renderer.c cVar2);

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.j n() {
        return O0().n();
    }

    @Y61.k
    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.b.f409471d.Y(this);
    }
}
