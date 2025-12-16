package kotlin.reflect.jvm.internal.impl.types.error;

import Y61.k;
import Y61.l;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.X;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.P;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.types.A0;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: ErrorFunctionDescriptor.kt */
/* loaded from: classes8.dex */
public final class b extends P {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.P, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    @k
    public final InterfaceC42905x.a<a0> m0() {
        return new a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @l
    public final <V> V x(@k InterfaceC42848a.InterfaceC11651a<V> interfaceC11651a) {
        return null;
    }

    /* compiled from: ErrorFunctionDescriptor.kt */
    public static final class a implements InterfaceC42905x.a<a0> {
        public a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        public final InterfaceC42905x build() {
            return b.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a<a0> d() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a i() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a<a0> m() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a<a0> o() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a<a0> r() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a a(@k C42784z0 c42784z0) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a<a0> b(@l X x12) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a<a0> c(@k A0 a02) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a<a0> e(@k kotlin.reflect.jvm.internal.impl.name.f fVar) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a<a0> f(@k O o12) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a<a0> g(@k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a h(@k InterfaceC42848a.InterfaceC11651a interfaceC11651a) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a<a0> j(@k AbstractC42900s abstractC42900s) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a k(@k InterfaceC42851d interfaceC42851d) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a l(@l InterfaceC42850c interfaceC42850c) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a<a0> n(@k List<? extends k0> list) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a<a0> p(@k Modality modality) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x.a
        @k
        public final InterfaceC42905x.a<a0> q(@k CallableMemberDescriptor.Kind kind) {
            return this;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void l0(@k Collection<? extends CallableMemberDescriptor> collection) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.P
    @k
    /* renamed from: O0 */
    public final a0 V(@k InterfaceC42851d interfaceC42851d, @k Modality modality, @k AbstractC42887p abstractC42887p) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.P, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: V */
    public final CallableMemberDescriptor n0(InterfaceC42851d interfaceC42851d, Modality modality, AbstractC42887p abstractC42887p) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.P, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    public final InterfaceC42905x n0(InterfaceC42851d interfaceC42851d, Modality modality, AbstractC42887p abstractC42887p) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.P, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    @k
    public final AbstractC42878w F0(@k CallableMemberDescriptor.Kind kind, @k InterfaceC42882k interfaceC42882k, @l InterfaceC42905x interfaceC42905x, @k b0 b0Var, @k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return this;
    }
}
