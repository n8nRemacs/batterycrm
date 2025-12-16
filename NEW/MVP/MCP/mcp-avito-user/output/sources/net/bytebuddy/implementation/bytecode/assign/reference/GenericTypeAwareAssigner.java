package net.bytebuddy.implementation.bytecode.assign.reference;

import com.yandex.div2.D8;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.assign.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class GenericTypeAwareAssigner implements Assigner {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ GenericTypeAwareAssigner[] f417920b = {new GenericTypeAwareAssigner("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    GenericTypeAwareAssigner EF5;

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements TypeDescription.Generic.Visitor<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription.Generic f417921b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f417922c;

        /* renamed from: net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$a$a, reason: collision with other inner class name */
        public static class C12103a extends b {
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public final /* bridge */ /* synthetic */ Object a(TypeDescription.Generic.OfParameterizedType ofParameterizedType) {
                return Boolean.FALSE;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(net.bytebuddy.description.type.TypeDescription.Generic.c r4) {
                /*
                    r3 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic$a r0 = r3.f417923b
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.m()
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.m()
                La:
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r0.o()
                    r1.getClass()
                    net.bytebuddy.description.type.TypeDefinition$Sort r2 = net.bytebuddy.description.type.TypeDefinition.Sort.f416308c
                    if (r1 != r2) goto L27
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r4.o()
                    r1.getClass()
                    if (r1 != r2) goto L27
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.m()
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.m()
                    goto La
                L27:
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r0.o()
                    r1.getClass()
                    if (r1 != r2) goto L31
                    goto L4e
                L31:
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r4.o()
                    r1.getClass()
                    if (r1 != r2) goto L3b
                    goto L4e
                L3b:
                    net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$a r1 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$a
                    r2 = 1
                    r1.<init>(r4, r2)
                    java.lang.Object r4 = r0.h0(r1)
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 == 0) goto L4e
                    goto L4f
                L4e:
                    r2 = 0
                L4f:
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner.a.C12103a.b(net.bytebuddy.description.type.TypeDescription$Generic$c):java.lang.Object");
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public final Object d(TypeDescription.Generic.a aVar) {
                TypeDescription.Generic.a aVar2 = this.f417923b;
                return Boolean.valueOf(this.f417924c ? aVar2.f5().m5(aVar.f5()) : aVar2.f5().equals(aVar.f5()));
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class b implements TypeDescription.Generic.Visitor<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription.Generic.a f417923b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f417924c;

            public b(TypeDescription.Generic.a aVar, boolean z12) {
                this.f417923b = aVar;
                this.f417924c = z12;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public final Object c(TypeDescription.Generic.f fVar) {
                TypeDescription.Generic.a aVar;
                Iterator<TypeDescription.Generic> it = fVar.getUpperBounds().iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    aVar = this.f417923b;
                    if (!zHasNext) {
                        Iterator<TypeDescription.Generic> it2 = fVar.getLowerBounds().iterator();
                        while (it2.hasNext()) {
                            if (!((Boolean) it2.next().h0(new a(aVar, true))).booleanValue()) {
                                return Boolean.FALSE;
                            }
                        }
                        return Boolean.TRUE;
                    }
                } while (((Boolean) aVar.h0(new a(it.next(), true))).booleanValue());
                return Boolean.FALSE;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public final Object e(TypeDescription.Generic.a aVar) {
                if (aVar.A3().T()) {
                    throw new UnsupportedOperationException("Assignability checks for type variables declared by methods arel not currently supported");
                }
                return Boolean.FALSE;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f417924c == bVar.f417924c && this.f417923b.equals(bVar.f417923b);
            }

            public final int hashCode() {
                return ((this.f417923b.hashCode() + (getClass().hashCode() * 31)) * 31) + (this.f417924c ? 1 : 0);
            }
        }

        public static class c extends e {
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public final Object b(TypeDescription.Generic.c cVar) {
                TypeDescription.Generic.a aVar = this.f417923b;
                return Boolean.valueOf(this.f417924c ? aVar.f5().m5(cVar.f5()) : aVar.f5().equals(cVar.f5()));
            }
        }

        public static class d extends e {
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public final /* bridge */ /* synthetic */ Object b(TypeDescription.Generic.c cVar) {
                return Boolean.FALSE;
            }
        }

        public static abstract class e extends b {
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public final Object a(TypeDescription.Generic.OfParameterizedType ofParameterizedType) {
                TypeDescription.Generic.a aVar = this.f417923b;
                Set setSingleton = Collections.singleton(aVar);
                Queue queueA = net.bytebuddy.utility.f.f418983b.f418985a.a();
                if (queueA == null) {
                    queueA = new LinkedList(setSingleton);
                }
                HashSet hashSet = new HashSet(Collections.singleton(aVar.f5()));
                do {
                    TypeDescription.Generic generic = (TypeDescription.Generic) queueA.remove();
                    if (generic.f5().equals(ofParameterizedType.f5())) {
                        if (generic.o().b()) {
                            return Boolean.TRUE;
                        }
                        d.f fVarJ = generic.J();
                        d.f fVarJ2 = ofParameterizedType.J();
                        int size = fVarJ2.size();
                        if (fVarJ.size() != size) {
                            return Boolean.FALSE;
                        }
                        for (int i12 = 0; i12 < size; i12++) {
                            if (!((Boolean) fVarJ.get(i12).h0(new a(fVarJ2.get(i12), false))).booleanValue()) {
                                return Boolean.FALSE;
                            }
                        }
                        TypeDescription.Generic ownerType = ofParameterizedType.getOwnerType();
                        return Boolean.valueOf(ownerType == null || ((Boolean) ownerType.h0(new a(ownerType, true))).booleanValue());
                    }
                    if (this.f417924c) {
                        TypeDescription.Generic genericC3 = generic.C3();
                        if (genericC3 != null && hashSet.add(genericC3.f5())) {
                            queueA.add(genericC3);
                        }
                        for (TypeDescription.Generic generic2 : generic.J0()) {
                            if (hashSet.add(generic2.f5())) {
                                queueA.add(generic2);
                            }
                        }
                    }
                } while (!queueA.isEmpty());
                return Boolean.FALSE;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public final Object d(TypeDescription.Generic.a aVar) {
                TypeDescription.Generic.a aVar2 = this.f417923b;
                return Boolean.valueOf(this.f417924c ? aVar2.f5().m5(aVar.f5()) : aVar2.f5().equals(aVar.f5()));
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class f implements TypeDescription.Generic.Visitor<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription.Generic.f f417925b;

            public f(TypeDescription.Generic.f fVar) {
                this.f417925b = fVar;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public final /* bridge */ /* synthetic */ Object a(TypeDescription.Generic.OfParameterizedType ofParameterizedType) {
                return Boolean.FALSE;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public final /* bridge */ /* synthetic */ Object b(TypeDescription.Generic.c cVar) {
                return Boolean.FALSE;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public final Object c(TypeDescription.Generic.f fVar) {
                boolean z12;
                Iterator<TypeDescription.Generic> it = fVar.getUpperBounds().iterator();
                boolean z13 = false;
                while (true) {
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        TypeDescription.Generic.f fVar2 = this.f417925b;
                        if (!zHasNext) {
                            boolean z14 = false;
                            for (TypeDescription.Generic generic : fVar.getLowerBounds()) {
                                Iterator<TypeDescription.Generic> it2 = fVar2.getLowerBounds().iterator();
                                while (it2.hasNext()) {
                                    if (!((Boolean) generic.h0(new a(it2.next(), true))).booleanValue()) {
                                        return Boolean.FALSE;
                                    }
                                }
                                z14 = true;
                            }
                            if (z12) {
                                return Boolean.valueOf(fVar2.getLowerBounds().isEmpty());
                            }
                            if (!z14) {
                                return Boolean.TRUE;
                            }
                            d.f upperBounds = fVar2.getUpperBounds();
                            if (upperBounds.size() == 0 || (upperBounds.size() == 1 && upperBounds.M2().Q2(Object.class))) {
                                z13 = true;
                            }
                            return Boolean.valueOf(z13);
                        }
                        TypeDescription.Generic next = it.next();
                        Iterator<TypeDescription.Generic> it3 = fVar2.getUpperBounds().iterator();
                        while (it3.hasNext()) {
                            if (!((Boolean) it3.next().h0(new a(next, true))).booleanValue()) {
                                return Boolean.FALSE;
                            }
                        }
                        z12 = z12 || !next.Q2(Object.class);
                    }
                }
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public final /* bridge */ /* synthetic */ Object d(TypeDescription.Generic.a aVar) {
                return Boolean.FALSE;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public final /* bridge */ /* synthetic */ Object e(TypeDescription.Generic.a aVar) {
                return Boolean.FALSE;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417925b.equals(((f) obj).f417925b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417925b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        public a(TypeDescription.Generic generic, boolean z12) {
            this.f417921b = generic;
            this.f417922c = z12;
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public final Object a(TypeDescription.Generic.OfParameterizedType ofParameterizedType) {
            return (Boolean) this.f417921b.h0(new d(ofParameterizedType, this.f417922c));
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public final Object b(TypeDescription.Generic.c cVar) {
            return (Boolean) this.f417921b.h0(new C12103a(cVar, this.f417922c));
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public final Object c(TypeDescription.Generic.f fVar) {
            return (Boolean) this.f417921b.h0(new f(fVar));
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public final Object d(TypeDescription.Generic.a aVar) {
            return (Boolean) this.f417921b.h0(new c(aVar, this.f417922c));
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public final Object e(TypeDescription.Generic.a aVar) {
            if (aVar.A3().T()) {
                throw new UnsupportedOperationException("Assignability checks for type variables declared by methods are not currently supported");
            }
            TypeDescription.Generic generic = this.f417921b;
            if (aVar.equals(generic)) {
                return Boolean.TRUE;
            }
            if (!this.f417922c) {
                return Boolean.FALSE;
            }
            d.f upperBounds = aVar.getUpperBounds();
            Queue queueA = net.bytebuddy.utility.f.f418983b.f418985a.a();
            if (queueA == null) {
                queueA = new LinkedList(upperBounds);
            }
            while (!queueA.isEmpty()) {
                TypeDescription.Generic generic2 = (TypeDescription.Generic) queueA.remove();
                if (((Boolean) generic2.h0(new a(generic, true))).booleanValue()) {
                    return Boolean.TRUE;
                }
                if (generic2.o().c()) {
                    queueA.addAll(generic2.getUpperBounds());
                }
            }
            return Boolean.FALSE;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f417922c == aVar.f417922c && this.f417921b.equals(aVar.f417921b);
        }

        public final int hashCode() {
            return D8.i(this.f417921b, getClass().hashCode() * 31, 31) + (this.f417922c ? 1 : 0);
        }
    }

    public GenericTypeAwareAssigner() {
        throw null;
    }

    public static GenericTypeAwareAssigner valueOf(String str) {
        return (GenericTypeAwareAssigner) Enum.valueOf(GenericTypeAwareAssigner.class, str);
    }

    public static GenericTypeAwareAssigner[] values() {
        return (GenericTypeAwareAssigner[]) f417920b.clone();
    }

    @Override // net.bytebuddy.implementation.bytecode.assign.Assigner
    public final StackManipulation a(TypeDescription.Generic generic, TypeDescription.Generic generic2, Assigner.Typing typing) {
        boolean zW5 = generic.w5();
        StackManipulation.Illegal illegal = StackManipulation.Illegal.f417827b;
        StackManipulation.Trivial trivial = StackManipulation.Trivial.f417829b;
        return (zW5 || generic2.w5()) ? generic.equals(generic2) ? trivial : illegal : ((Boolean) generic.h0(new a(generic2, true))).booleanValue() ? trivial : typing.f417857b ? generic.f5().m5(generic2.f5()) ? trivial : b.g(generic2) : illegal;
    }
}
