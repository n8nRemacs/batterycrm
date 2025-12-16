package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.X;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42875t;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.V;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.b;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.I;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C42947b;

/* compiled from: MemberDeserializer.kt */
@s0
/* loaded from: classes8.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C42956m f409968a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C42948e f409969b;

    /* compiled from: MemberDeserializer.kt */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f409971m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ProtoBuf.h f409972n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, ProtoBuf.h hVar) {
            super(0);
            this.f409971m = z12;
            this.f409972n = hVar;
        }

        @Override // Y41.a
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> listM0;
            z zVar = z.this;
            I iA2 = zVar.a(zVar.f409968a.f409938c);
            if (iA2 != null) {
                C42956m c42956m = zVar.f409968a;
                boolean z12 = this.f409971m;
                ProtoBuf.h hVar = this.f409972n;
                listM0 = z12 ? C42745f0.M0(c42956m.f409936a.f409918e.k(iA2, hVar)) : C42745f0.M0(c42956m.f409936a.f409918e.j(iA2, hVar));
            } else {
                listM0 = null;
            }
            return listM0 == null ? C42784z0.f406748b : listM0;
        }
    }

    public z(@Y61.k C42956m c42956m) {
        this.f409968a = c42956m;
        C42954k c42954k = c42956m.f409936a;
        this.f409969b = new C42948e(c42954k.f409915b, c42954k.f409925l);
    }

    public final I a(InterfaceC42882k interfaceC42882k) {
        if (interfaceC42882k instanceof kotlin.reflect.jvm.internal.impl.descriptors.K) {
            kotlin.reflect.jvm.internal.impl.name.c cVarD = ((kotlin.reflect.jvm.internal.impl.descriptors.K) interfaceC42882k).d();
            C42956m c42956m = this.f409968a;
            return new I.b(cVarD, c42956m.f409937b, c42956m.f409939d, c42956m.f409942g);
        }
        if (interfaceC42882k instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) {
            return ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) interfaceC42882k).f409819y;
        }
        return null;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b(h.d dVar, int i12, AnnotatedCallableKind annotatedCallableKind) {
        if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409112c.e(i12).booleanValue()) {
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.B(this.f409968a.f409936a.f409914a, new y(this, dVar, annotatedCallableKind));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        return g.a.f407524b;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g c(ProtoBuf.h hVar, boolean z12) {
        if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409112c.e(hVar.f408988e).booleanValue()) {
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.B(this.f409968a.f409936a.f409914a, new a(z12, hVar));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        return g.a.f407524b;
    }

    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d d(@Y61.k ProtoBuf.b bVar, boolean z12) {
        C42956m c42956m = this.f409968a;
        InterfaceC42851d interfaceC42851d = (InterfaceC42851d) c42956m.f409938c;
        int i12 = bVar.f408890e;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.f409716b;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d dVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d(interfaceC42851d, null, b(bVar, i12, annotatedCallableKind), z12, CallableMemberDescriptor.Kind.f407408b, bVar, c42956m.f409937b, c42956m.f409939d, c42956m.f409940e, c42956m.f409942g, null, 1024, null);
        List listG = c42956m.a(dVar, C42784z0.f406748b, c42956m.f409937b, c42956m.f409939d, c42956m.f409940e, c42956m.f409941f).f409944i.g(bVar.f408891f, bVar, annotatedCallableKind);
        J j12 = J.f409752a;
        dVar.Q0(listG, K.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409113d.c(bVar.f408890e)));
        dVar.N0(interfaceC42851d.q());
        dVar.f407720s = interfaceC42851d.O();
        dVar.f407725x = !kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409124o.e(bVar.f408890e).booleanValue();
        return dVar;
    }

    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.y e(@Y61.k ProtoBuf.e eVar) {
        int i12;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g c42947b;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar;
        ProtoBuf.Type typeA;
        ProtoBuf.Type typeA2;
        kotlin.reflect.jvm.internal.impl.types.O oG2;
        if ((eVar.f408919d & 1) == 1) {
            i12 = eVar.f408920e;
        } else {
            int i13 = eVar.f408921f;
            i12 = ((i13 >> 8) << 6) + (i13 & 63);
        }
        int i14 = i12;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.f409716b;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVarB = b(eVar, i14, annotatedCallableKind);
        boolean zP2 = eVar.p();
        C42956m c42956m = this.f409968a;
        if (zP2 || (eVar.f408919d & 64) == 64) {
            c42947b = new C42947b(c42956m.f409936a.f409914a, new A(this, eVar, annotatedCallableKind));
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
            c42947b = g.a.f407524b;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2 = c42947b;
        kotlin.reflect.jvm.internal.impl.name.c cVarG = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.g(c42956m.f409938c);
        int i15 = eVar.f408922g;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar = c42956m.f409937b;
        if (cVarG.c(G.b(cVar, i15)).equals(L.f409757a)) {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f409142b.getClass();
            hVar = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f409143c;
        } else {
            hVar = c42956m.f409940e;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar2 = hVar;
        kotlin.reflect.jvm.internal.impl.name.f fVarB = G.b(cVar, eVar.f408922g);
        J j12 = J.f409752a;
        CallableMemberDescriptor.Kind kindB = K.b(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409125p.c(i14));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar3 = c42956m.f409939d;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.y yVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.y(c42956m.f409938c, null, gVarB, fVarB, kindB, eVar, c42956m.f409937b, gVar3, hVar2, c42956m.f409942g, null, 1024, null);
        C42956m c42956mA = c42956m.a(yVar, eVar.f408925j, c42956m.f409937b, c42956m.f409939d, c42956m.f409940e, c42956m.f409941f);
        if (eVar.p()) {
            typeA = eVar.f408926k;
            gVar = gVar3;
        } else if ((eVar.f408919d & 64) == 64) {
            gVar = gVar3;
            typeA = gVar.a(eVar.f408927l);
        } else {
            gVar = gVar3;
            typeA = null;
        }
        M m12 = c42956mA.f409943h;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.O oH2 = (typeA == null || (oG2 = m12.g(typeA)) == null) ? null : kotlin.reflect.jvm.internal.impl.resolve.i.h(yVar, oG2, gVar2);
        InterfaceC42882k interfaceC42882k = c42956m.f409938c;
        InterfaceC42851d interfaceC42851d = interfaceC42882k instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42882k : null;
        X xP02 = interfaceC42851d != null ? interfaceC42851d.p0() : null;
        List<ProtoBuf.Type> list = eVar.f408928m;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = eVar.f408929n;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(gVar.a(((Integer) it.next()).intValue()));
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i16 = 0;
        for (Object obj : list) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                C42745f0.H0();
                throw null;
            }
            kotlin.reflect.jvm.internal.impl.types.O oG3 = m12.g((ProtoBuf.Type) obj);
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
            kotlin.reflect.jvm.internal.impl.descriptors.impl.O oB2 = kotlin.reflect.jvm.internal.impl.resolve.i.b(yVar, oG3, null, g.a.f407524b, i16);
            if (oB2 != null) {
                arrayList2.add(oB2);
            }
            i16 = i17;
        }
        List<g0> listB = m12.b();
        List listG = c42956mA.f409944i.g(eVar.f408931p, eVar, annotatedCallableKind);
        int i18 = eVar.f408919d;
        if ((i18 & 8) == 8) {
            typeA2 = eVar.f408923h;
        } else {
            if ((i18 & 16) != 16) {
                throw new IllegalStateException("No returnType in ProtoBuf.Function");
            }
            typeA2 = gVar.a(eVar.f408924i);
        }
        kotlin.reflect.jvm.internal.impl.types.O oG4 = m12.g(typeA2);
        J j13 = J.f409752a;
        ProtoBuf.Modality modalityC = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409114e.c(i14);
        j13.getClass();
        yVar.S0(oH2, xP02, arrayList2, listB, listG, oG4, J.a(modalityC), K.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409113d.c(i14)), P0.c());
        yVar.f407715n = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409126q.e(i14).booleanValue();
        yVar.f407716o = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409127r.e(i14).booleanValue();
        yVar.f407717p = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409130u.e(i14).booleanValue();
        yVar.f407718q = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409128s.e(i14).booleanValue();
        yVar.f407719r = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409129t.e(i14).booleanValue();
        yVar.f407724w = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409131v.e(i14).booleanValue();
        yVar.f407720s = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409132w.e(i14).booleanValue();
        yVar.f407725x = !kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409133x.e(i14).booleanValue();
        c42956m.f409936a.f409926m.getClass();
        return yVar;
    }

    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x f(@Y61.k ProtoBuf.h hVar) {
        int i12;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g c42947b;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar;
        ProtoBuf.Type typeA;
        C42956m c42956m;
        C42956m c42956m2;
        b.C11675b c11675b;
        b.C11675b c11675b2;
        b.C11675b c11675b3;
        b.d<ProtoBuf.Modality> dVar;
        b.d<ProtoBuf.Visibility> dVar2;
        int i13;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.M m12;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.M m13;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.N nD2;
        z zVar;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.M mC2;
        kotlin.reflect.jvm.internal.impl.types.O oG2;
        if ((hVar.f408987d & 1) == 1) {
            i12 = hVar.f408988e;
        } else {
            int i14 = hVar.f408989f;
            i12 = ((i14 >> 8) << 6) + (i14 & 63);
        }
        int i15 = i12;
        C42956m c42956m3 = this.f409968a;
        InterfaceC42882k interfaceC42882k = c42956m3.f409938c;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVarB = b(hVar, i15, AnnotatedCallableKind.f409717c);
        J j12 = J.f409752a;
        ProtoBuf.Modality modalityC = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409114e.c(i15);
        j12.getClass();
        Modality modalityA = J.a(modalityC);
        AbstractC42887p abstractC42887pA = K.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409113d.c(i15));
        boolean zBooleanValue = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409134y.e(i15).booleanValue();
        kotlin.reflect.jvm.internal.impl.name.f fVarB = G.b(c42956m3.f409937b, hVar.f408990g);
        CallableMemberDescriptor.Kind kindB = K.b(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409125p.c(i15));
        boolean zBooleanValue2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409098C.e(i15).booleanValue();
        boolean zBooleanValue3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409097B.e(i15).booleanValue();
        boolean zBooleanValue4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409100E.e(i15).booleanValue();
        boolean zBooleanValue5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409101F.e(i15).booleanValue();
        boolean zBooleanValue6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409102G.e(i15).booleanValue();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2 = c42956m3.f409939d;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x xVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x(interfaceC42882k, null, gVarB, modalityA, abstractC42887pA, zBooleanValue, fVarB, kindB, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, hVar, c42956m3.f409937b, gVar2, c42956m3.f409940e, c42956m3.f409942g);
        C42956m c42956mA = c42956m3.a(xVar, hVar.f408993j, c42956m3.f409937b, c42956m3.f409939d, c42956m3.f409940e, c42956m3.f409941f);
        boolean zBooleanValue7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409135z.e(i15).booleanValue();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.f409718d;
        if (zBooleanValue7 && (hVar.p() || (hVar.f408987d & 64) == 64)) {
            c42947b = new C42947b(c42956m3.f409936a.f409914a, new A(this, hVar, annotatedCallableKind));
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
            c42947b = g.a.f407524b;
        }
        int i16 = hVar.f408987d;
        if ((i16 & 8) == 8) {
            typeA = hVar.f408991h;
            gVar = gVar2;
        } else {
            if ((i16 & 16) != 16) {
                throw new IllegalStateException("No returnType in ProtoBuf.Property");
            }
            gVar = gVar2;
            typeA = gVar.a(hVar.f408992i);
        }
        M m14 = c42956mA.f409943h;
        kotlin.reflect.jvm.internal.impl.types.O oG3 = m14.g(typeA);
        List<g0> listB = m14.b();
        InterfaceC42882k interfaceC42882k2 = c42956m3.f409938c;
        InterfaceC42851d interfaceC42851d = interfaceC42882k2 instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42882k2 : null;
        X xP02 = interfaceC42851d != null ? interfaceC42851d.p0() : null;
        ProtoBuf.Type typeA2 = hVar.p() ? hVar.f408994k : (hVar.f408987d & 64) == 64 ? gVar.a(hVar.f408995l) : null;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.O oH2 = (typeA2 == null || (oG2 = m14.g(typeA2)) == null) ? null : kotlin.reflect.jvm.internal.impl.resolve.i.h(xVar, oG2, c42947b);
        List<ProtoBuf.Type> list = hVar.f408996m;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = hVar.f408997n;
            c42956m = c42956m3;
            c42956m2 = c42956mA;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(gVar.a(((Integer) it.next()).intValue()));
            }
            list = arrayList;
        } else {
            c42956m = c42956m3;
            c42956m2 = c42956mA;
        }
        List<ProtoBuf.Type> list3 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
        int i17 = 0;
        for (Iterator it2 = list3.iterator(); it2.hasNext(); it2 = it2) {
            Object next = it2.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                C42745f0.H0();
                throw null;
            }
            kotlin.reflect.jvm.internal.impl.types.O oG4 = m14.g((ProtoBuf.Type) next);
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
            arrayList2.add(kotlin.reflect.jvm.internal.impl.resolve.i.b(xVar, oG4, null, g.a.f407524b, i17));
            i17 = i18;
        }
        xVar.L0(oG3, listB, xP02, oH2, arrayList2);
        b.C11675b c11675b4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409112c;
        boolean zBooleanValue8 = c11675b4.e(i15).booleanValue();
        b.d<ProtoBuf.Visibility> dVar3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409113d;
        ProtoBuf.Visibility visibilityC = dVar3.c(i15);
        b.d<ProtoBuf.Modality> dVar4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409114e;
        ProtoBuf.Modality modalityC2 = dVar4.c(i15);
        if (visibilityC == null) {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.a(10);
            throw null;
        }
        if (modalityC2 == null) {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.a(11);
            throw null;
        }
        int iD2 = (zBooleanValue8 ? 1 << c11675b4.f409137a : 0) | dVar4.d(modalityC2) | dVar3.d(visibilityC);
        b.C11675b c11675b5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409106K;
        c11675b5.getClass();
        b.C11675b c11675b6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409107L;
        c11675b6.getClass();
        b.C11675b c11675b7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409108M;
        c11675b7.getClass();
        if (zBooleanValue7) {
            int i19 = (hVar.f408987d & 256) == 256 ? hVar.f409000q : iD2;
            boolean zBooleanValue9 = c11675b5.e(i19).booleanValue();
            boolean zBooleanValue10 = c11675b6.e(i19).booleanValue();
            boolean zBooleanValue11 = c11675b7.e(i19).booleanValue();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVarB2 = b(hVar, i19, annotatedCallableKind);
            if (zBooleanValue9) {
                J j13 = J.f409752a;
                ProtoBuf.Modality modalityC3 = dVar4.c(i19);
                j13.getClass();
                c11675b = c11675b7;
                c11675b3 = c11675b5;
                c11675b2 = c11675b6;
                dVar2 = dVar3;
                dVar = dVar4;
                i13 = i15;
                mC2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.M(xVar, gVarB2, J.a(modalityC3), K.a(dVar3.c(i19)), !zBooleanValue9, zBooleanValue10, zBooleanValue11, xVar.getKind(), null, b0.f407539a);
            } else {
                c11675b = c11675b7;
                c11675b2 = c11675b6;
                c11675b3 = c11675b5;
                dVar = dVar4;
                dVar2 = dVar3;
                i13 = i15;
                mC2 = kotlin.reflect.jvm.internal.impl.resolve.i.c(xVar, gVarB2);
            }
            mC2.H0(xVar.getReturnType());
            m12 = mC2;
        } else {
            c11675b = c11675b7;
            c11675b2 = c11675b6;
            c11675b3 = c11675b5;
            dVar = dVar4;
            dVar2 = dVar3;
            i13 = i15;
            m12 = null;
        }
        if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409096A.e(i13).booleanValue()) {
            int i22 = (hVar.f408987d & 512) == 512 ? hVar.f409001r : iD2;
            boolean zBooleanValue12 = c11675b3.e(i22).booleanValue();
            boolean zBooleanValue13 = c11675b2.e(i22).booleanValue();
            boolean zBooleanValue14 = c11675b.e(i22).booleanValue();
            AnnotatedCallableKind annotatedCallableKind2 = AnnotatedCallableKind.f409719e;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVarB3 = b(hVar, i22, annotatedCallableKind2);
            if (zBooleanValue12) {
                J j14 = J.f409752a;
                ProtoBuf.Modality modalityC4 = dVar.c(i22);
                j14.getClass();
                m13 = m12;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.N n12 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.N(xVar, gVarB3, J.a(modalityC4), K.a(dVar2.c(i22)), !zBooleanValue12, zBooleanValue13, zBooleanValue14, xVar.getKind(), null, b0.f407539a);
                C42956m c42956m4 = c42956m2;
                k0 k0Var = (k0) C42745f0.u0(c42956m4.a(n12, C42784z0.f406748b, c42956m4.f409937b, c42956m4.f409939d, c42956m4.f409940e, c42956m4.f409941f).f409944i.g(Collections.singletonList(hVar.f408999p), hVar, annotatedCallableKind2));
                if (k0Var == null) {
                    kotlin.reflect.jvm.internal.impl.descriptors.impl.N.L(6);
                    throw null;
                }
                n12.f407613n = k0Var;
                nD2 = n12;
            } else {
                m13 = m12;
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
                nD2 = kotlin.reflect.jvm.internal.impl.resolve.i.d(xVar, gVarB3, g.a.f407524b);
            }
        } else {
            m13 = m12;
            nD2 = null;
        }
        if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409099D.e(i13).booleanValue()) {
            zVar = this;
            xVar.F0(null, new C(zVar, hVar, xVar));
        } else {
            zVar = this;
        }
        InterfaceC42882k interfaceC42882k3 = c42956m.f409938c;
        InterfaceC42851d interfaceC42851d2 = interfaceC42882k3 instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42882k3 : null;
        if ((interfaceC42851d2 != null ? interfaceC42851d2.getKind() : null) == ClassKind.f407417f) {
            xVar.F0(null, new E(zVar, hVar, xVar));
        }
        xVar.J0(m13, nD2, new C42875t(zVar.c(hVar, false), xVar), new C42875t(zVar.c(hVar, true), xVar));
        return xVar;
    }

    public final List g(List list, h.d dVar, AnnotatedCallableKind annotatedCallableKind) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b12;
        C42956m c42956m = this.f409968a;
        InterfaceC42848a interfaceC42848a = (InterfaceC42848a) c42956m.f409938c;
        I iA2 = a(interfaceC42848a.f());
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            ProtoBuf.l lVar = (ProtoBuf.l) obj;
            int i14 = (lVar.f409067d & 1) == 1 ? lVar.f409068e : 0;
            if (iA2 == null || !kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409112c.e(i14).booleanValue()) {
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
                b12 = g.a.f407524b;
            } else {
                b12 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.B(c42956m.f409936a.f409914a, new F(this, iA2, dVar, annotatedCallableKind, i12, lVar));
            }
            kotlin.reflect.jvm.internal.impl.name.f fVarB = G.b(c42956m.f409937b, lVar.f409069f);
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = c42956m.f409939d;
            ProtoBuf.Type typeA = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(lVar, gVar);
            M m12 = c42956m.f409943h;
            kotlin.reflect.jvm.internal.impl.types.O oG2 = m12.g(typeA);
            boolean zBooleanValue = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409103H.e(i14).booleanValue();
            boolean zBooleanValue2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409104I.e(i14).booleanValue();
            boolean zBooleanValue3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409105J.e(i14).booleanValue();
            int i15 = lVar.f409067d;
            ProtoBuf.Type typeA2 = (i15 & 16) == 16 ? lVar.f409072i : (i15 & 32) == 32 ? gVar.a(lVar.f409073j) : null;
            kotlin.reflect.jvm.internal.impl.types.O oG3 = typeA2 != null ? m12.g(typeA2) : null;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new V(interfaceC42848a, null, i12, b12, fVarB, oG2, zBooleanValue, zBooleanValue2, zBooleanValue3, oG3, b0.f407539a));
            arrayList = arrayList2;
            i12 = i13;
        }
        return C42745f0.M0(arrayList);
    }
}
