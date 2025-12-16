package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;

/* compiled from: PackageFragmentDescriptorImpl.kt */
/* loaded from: classes8.dex */
public abstract class I extends AbstractC42871o implements kotlin.reflect.jvm.internal.impl.descriptors.K {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.c f407568f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f407569g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.E e12, @Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        super(e12, g.a.f407524b, cVar.g(), b0.f407539a);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        this.f407568f = cVar;
        this.f407569g = "package " + cVar + " of " + e12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final <R, D> R A(@Y61.k InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return (R) interfaceC42884m.b(this, d12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.K
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.c d() {
        return this.f407568f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42885n
    @Y61.k
    public b0 e() {
        return b0.f407539a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final InterfaceC42882k f() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.E) super.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n
    @Y61.k
    public String toString() {
        return this.f407569g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.E f() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.E) super.f();
    }
}
