package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import Y61.k;
import Y61.l;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.m;
import kotlin.reflect.jvm.internal.impl.types.x0;

/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes8.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x0 f409580a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public m f409581b;

    public c(@k x0 x0Var) {
        this.f409580a = x0Var;
        x0Var.a();
        Variance variance = Variance.f410069d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @k
    public final Collection<O> C() {
        x0 x0Var = this.f409580a;
        return Collections.singletonList(x0Var.a() == Variance.f410071f ? x0Var.getType() : m().n());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    public final /* bridge */ /* synthetic */ InterfaceC42853f b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    public final boolean c() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @k
    public final List<g0> getParameters() {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b
    @k
    public final x0 h() {
        return this.f409580a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @k
    public final kotlin.reflect.jvm.internal.impl.builtins.k m() {
        return this.f409580a.getType().H0().m();
    }

    @k
    public final String toString() {
        return "CapturedTypeConstructor(" + this.f409580a + ')';
    }
}
