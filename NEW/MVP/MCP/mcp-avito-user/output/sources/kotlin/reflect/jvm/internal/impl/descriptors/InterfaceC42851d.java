package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.A0;

/* compiled from: ClassDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC42851d extends InterfaceC42852e, InterfaceC42854g {
    @Y61.k
    Collection<InterfaceC42850c> G();

    @Y61.l
    i0<kotlin.reflect.jvm.internal.impl.types.Y> I();

    boolean M();

    @Y61.k
    kotlin.reflect.jvm.internal.impl.resolve.scopes.j P();

    @Y61.k
    kotlin.reflect.jvm.internal.impl.resolve.scopes.j R(@Y61.k A0 a02);

    boolean W();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    InterfaceC42851d a();

    @Y61.k
    kotlin.reflect.jvm.internal.impl.resolve.scopes.j f0();

    @Y61.k
    kotlin.reflect.jvm.internal.impl.resolve.scopes.j g0();

    @Y61.k
    ClassKind getKind();

    @Y61.k
    AbstractC42900s getVisibility();

    @Y61.k
    Modality i();

    boolean isInline();

    @Y61.k
    X p0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    kotlin.reflect.jvm.internal.impl.types.Y q();

    @Y61.k
    Collection<InterfaceC42851d> q0();

    @Y61.k
    List<g0> r();

    @Y61.l
    InterfaceC42850c t();

    @Y61.k
    List<X> u0();

    boolean v0();

    boolean w0();

    @Y61.l
    InterfaceC42851d x0();
}
