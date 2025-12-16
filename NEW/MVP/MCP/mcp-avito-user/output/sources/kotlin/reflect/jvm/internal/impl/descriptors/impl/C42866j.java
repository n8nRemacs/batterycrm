package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.types.E0;

/* compiled from: ClassConstructorDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42866j extends AbstractC42878w implements InterfaceC42850c {

    /* renamed from: F, reason: collision with root package name */
    public final boolean f407673F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42866j(@Y61.k InterfaceC42851d interfaceC42851d, @Y61.l InterfaceC42881j interfaceC42881j, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z12, @Y61.k CallableMemberDescriptor.Kind kind, @Y61.k b0 b0Var) {
        super(kind, interfaceC42851d, interfaceC42881j, b0Var, gVar, kotlin.reflect.jvm.internal.impl.name.h.f409261f);
        if (interfaceC42851d == null) {
            L(0);
            throw null;
        }
        if (gVar == null) {
            L(1);
            throw null;
        }
        if (kind == null) {
            L(2);
            throw null;
        }
        if (b0Var == null) {
            L(3);
            throw null;
        }
        this.f407673F = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void L(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.C42866j.L(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final <R, D> R A(InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return (R) interfaceC42884m.g(this, d12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j
    public final boolean J() {
        return this.f407673F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    @Y61.k
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public C42866j F0(@Y61.k CallableMemberDescriptor.Kind kind, @Y61.k InterfaceC42882k interfaceC42882k, @Y61.l InterfaceC42905x interfaceC42905x, @Y61.k b0 b0Var, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        if (interfaceC42882k == null) {
            L(23);
            throw null;
        }
        if (kind == null) {
            L(24);
            throw null;
        }
        if (gVar == null) {
            L(25);
            throw null;
        }
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.f407408b;
        if (kind == kind2 || kind == CallableMemberDescriptor.Kind.f407411e) {
            return new C42866j((InterfaceC42851d) interfaceC42882k, this, gVar, this.f407673F, kind2, b0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC42882k + "\nkind: " + kind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC42851d f() {
        InterfaceC42851d interfaceC42851d = (InterfaceC42851d) super.f();
        if (interfaceC42851d != null) {
            return interfaceC42851d;
        }
        L(17);
        throw null;
    }

    public final void Q0(@Y61.k List list, @Y61.k AbstractC42900s abstractC42900s) {
        if (list == null) {
            L(13);
            throw null;
        }
        if (abstractC42900s != null) {
            R0(list, abstractC42900s, f().r());
        } else {
            L(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R0(@Y61.k java.util.List r12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s r13, @Y61.k java.util.List r14) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L63
            if (r13 == 0) goto L5d
            if (r14 == 0) goto L57
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r11.f()
            boolean r2 = r1.Y()
            if (r2 == 0) goto L21
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r1.f()
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
            if (r2 == 0) goto L21
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d) r1
            kotlin.reflect.jvm.internal.impl.descriptors.X r1 = r1.p0()
            r4 = r1
            goto L22
        L21:
            r4 = r0
        L22:
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r11.f()
            java.util.List r2 = r1.u0()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3e
            java.util.List r1 = r1.u0()
            if (r1 == 0) goto L38
        L36:
            r5 = r1
            goto L45
        L38:
            r12 = 15
            L(r12)
            throw r0
        L3e:
            java.util.List r1 = java.util.Collections.emptyList()
            if (r1 == 0) goto L51
            goto L36
        L45:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r9 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.f407439c
            r3 = 0
            r8 = 0
            r2 = r11
            r6 = r14
            r7 = r12
            r10 = r13
            r2.I0(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L51:
            r12 = 16
            L(r12)
            throw r0
        L57:
            r12 = 12
            L(r12)
            throw r0
        L5d:
            r12 = 11
            L(r12)
            throw r0
        L63:
            r12 = 10
            L(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.C42866j.R0(java.util.List, kotlin.reflect.jvm.internal.impl.descriptors.s, java.util.List):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @Y61.k
    /* renamed from: V */
    public final CallableMemberDescriptor n0(InterfaceC42851d interfaceC42851d, Modality modality, AbstractC42887p abstractC42887p) {
        return (InterfaceC42850c) super.n0(interfaceC42851d, modality, abstractC42887p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j
    @Y61.k
    public final InterfaceC42851d h0() {
        InterfaceC42851d interfaceC42851dF = f();
        if (interfaceC42851dF != null) {
            return interfaceC42851dF;
        }
        L(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void l0(@Y61.k Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != null) {
            return;
        }
        L(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    @Y61.k
    public final InterfaceC42905x n0(InterfaceC42851d interfaceC42851d, Modality modality, AbstractC42887p abstractC42887p) {
        return (InterfaceC42850c) super.n0(interfaceC42851d, modality, abstractC42887p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final Collection<? extends InterfaceC42905x> p() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        L(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x, kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.m0
    @Y61.l
    public final InterfaceC42850c b(@Y61.k E0 e02) {
        if (e02 != null) {
            return (InterfaceC42850c) super.b(e02);
        }
        L(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    /* renamed from: a */
    public final InterfaceC42850c n0() {
        InterfaceC42850c interfaceC42850c = (InterfaceC42850c) super.n0();
        if (interfaceC42850c != null) {
            return interfaceC42850c;
        }
        L(19);
        throw null;
    }
}
