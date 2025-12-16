package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.types.A0;
import kotlin.reflect.jvm.internal.impl.types.E0;

/* compiled from: FunctionDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC42905x extends CallableMemberDescriptor {

    /* compiled from: FunctionDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x$a */
    public interface a<D extends InterfaceC42905x> {
        @Y61.k
        a a(@Y61.k C42784z0 c42784z0);

        @Y61.k
        a<D> b(@Y61.l X x12);

        @Y61.l
        D build();

        @Y61.k
        a<D> c(@Y61.k A0 a02);

        @Y61.k
        a<D> d();

        @Y61.k
        a<D> e(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar);

        @Y61.k
        a<D> f(@Y61.k kotlin.reflect.jvm.internal.impl.types.O o12);

        @Y61.k
        a<D> g(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar);

        @Y61.k
        a h(@Y61.k InterfaceC42848a.InterfaceC11651a interfaceC11651a);

        @Y61.k
        a i();

        @Y61.k
        a<D> j(@Y61.k AbstractC42900s abstractC42900s);

        @Y61.k
        a k(@Y61.k InterfaceC42851d interfaceC42851d);

        @Y61.k
        a l(@Y61.l InterfaceC42850c interfaceC42850c);

        @Y61.k
        a<D> m();

        @Y61.k
        a<D> n(@Y61.k List<k0> list);

        @Y61.k
        a<D> o();

        @Y61.k
        a<D> p(@Y61.k Modality modality);

        @Y61.k
        a<D> q(@Y61.k CallableMemberDescriptor.Kind kind);

        @Y61.k
        a<D> r();
    }

    @Y61.l
    InterfaceC42905x A0();

    boolean E0();

    boolean Z();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    InterfaceC42905x a();

    @Y61.l
    InterfaceC42905x b(@Y61.k E0 e02);

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    @Y61.k
    a<? extends InterfaceC42905x> m0();

    boolean z();
}
