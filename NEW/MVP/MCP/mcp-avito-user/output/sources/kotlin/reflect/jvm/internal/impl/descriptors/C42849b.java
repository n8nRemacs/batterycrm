package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* compiled from: typeParameterUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42849b implements g0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g0 f407536b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42854g f407537c;

    /* renamed from: d, reason: collision with root package name */
    public final int f407538d;

    public C42849b(@Y61.k g0 g0Var, @Y61.k InterfaceC42854g interfaceC42854g, int i12) {
        this.f407536b = g0Var;
        this.f407537c = interfaceC42854g;
        this.f407538d = i12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final <R, D> R A(InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return (R) this.f407536b.A(interfaceC42884m, d12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    /* renamed from: a */
    public final InterfaceC42853f n0() {
        return this.f407536b.n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42885n
    @Y61.k
    public final b0 e() {
        return this.f407536b.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    public final InterfaceC42882k f() {
        return this.f407537c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f407536b.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public final int getIndex() {
        return this.f407536b.getIndex() + this.f407538d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.G
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.f getName() {
        return this.f407536b.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.p getStorageManager() {
        return this.f407536b.getStorageManager();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.types.O> getUpperBounds() {
        return this.f407536b.getUpperBounds();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    public final q0 l() {
        return this.f407536b.l();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    @Y61.k
    public final Variance o() {
        return this.f407536b.o();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.Y q() {
        return this.f407536b.q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public final boolean s() {
        return this.f407536b.s();
    }

    @Y61.k
    public final String toString() {
        return this.f407536b + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public final boolean u() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    /* renamed from: a */
    public final InterfaceC42882k n0() {
        return this.f407536b.n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    /* renamed from: a */
    public final g0 n0() {
        return this.f407536b.n0();
    }
}
