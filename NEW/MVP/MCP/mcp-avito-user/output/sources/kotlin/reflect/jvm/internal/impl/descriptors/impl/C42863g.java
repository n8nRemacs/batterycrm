package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* compiled from: AbstractTypeAliasDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42863g implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC42861e f407658a;

    public C42863g(AbstractC42861e abstractC42861e) {
        this.f407658a = abstractC42861e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    public final Collection<kotlin.reflect.jvm.internal.impl.types.O> C() {
        kotlin.reflect.jvm.internal.impl.types.Y y12 = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.z) this.f407658a).f409893q;
        if (y12 == null) {
            y12 = null;
        }
        return y12.H0().C();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    public final InterfaceC42853f b() {
        return this.f407658a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    public final boolean c() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    public final List<g0> getParameters() {
        return this.f407658a.F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.builtins.k m() {
        return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(this.f407658a);
    }

    @Y61.k
    public final String toString() {
        return "[typealias " + this.f407658a.getName().b() + ']';
    }
}
