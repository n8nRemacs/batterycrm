package net.bytebuddy.implementation;

import androidx.compose.foundation.H;
import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.b;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44396e;
import net.bytebuddy.matcher.ModifierMatcher;

/* compiled from: MethodDelegation.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class d implements Implementation.b {

    /* renamed from: b, reason: collision with root package name */
    public final b.e f418104b;

    /* renamed from: c, reason: collision with root package name */
    public final List<c.b<?>> f418105c;

    /* renamed from: d, reason: collision with root package name */
    public final MethodDelegationBinder.AmbiguityResolver.a f418106d;

    /* renamed from: e, reason: collision with root package name */
    public final MethodDelegationBinder.TerminationHandler.Default f418107e;

    /* renamed from: f, reason: collision with root package name */
    public final MethodDelegationBinder.BindingResolver.Default f418108f;

    /* renamed from: g, reason: collision with root package name */
    public final net.bytebuddy.implementation.bytecode.assign.primitive.b f418109g;

    /* compiled from: MethodDelegation.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements net.bytebuddy.implementation.bytecode.a {

        /* renamed from: b, reason: collision with root package name */
        public final Implementation.Target f418110b;

        /* renamed from: c, reason: collision with root package name */
        public final MethodDelegationBinder.b f418111c;

        /* renamed from: d, reason: collision with root package name */
        public final MethodDelegationBinder.TerminationHandler.Default f418112d;

        /* renamed from: e, reason: collision with root package name */
        public final net.bytebuddy.implementation.bytecode.assign.primitive.b f418113e;

        /* renamed from: f, reason: collision with root package name */
        public final b.a f418114f;

        public a(Implementation.Target target, MethodDelegationBinder.b bVar, MethodDelegationBinder.TerminationHandler.Default r32, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar2, b.a aVar) {
            this.f418110b = target;
            this.f418111c = bVar;
            this.f418112d = r32;
            this.f418113e = bVar2;
            this.f418114f = aVar;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f418110b.equals(aVar.f418110b) && this.f418111c.equals(aVar.f418111c) && this.f418112d.equals(aVar.f418112d) && this.f418113e.equals(aVar.f418113e) && this.f418114f.equals(aVar.f418114f);
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            b.a aVar2 = this.f418114f;
            return new a.c(new StackManipulation.b(aVar2.a(aVar), this.f418111c.a(this.f418110b, aVar, this.f418112d, aVar2.invoke(), this.f418113e)).n(sVar, context).f417834b, aVar.p());
        }

        public final int hashCode() {
            return this.f418114f.hashCode() + ((this.f418113e.hashCode() + ((this.f418112d.hashCode() + ((this.f418111c.hashCode() + ((this.f418110b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
        }
    }

    /* compiled from: MethodDelegation.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final MethodDelegationBinder.AmbiguityResolver.a f418117a;

        /* renamed from: b, reason: collision with root package name */
        public final List<c.b<?>> f418118b;

        /* renamed from: c, reason: collision with root package name */
        public final MethodDelegationBinder.BindingResolver.Default f418119c;

        /* renamed from: d, reason: collision with root package name */
        public final C44396e f418120d;

        public c() {
            throw null;
        }

        public c(MethodDelegationBinder.AmbiguityResolver.a aVar, List list, MethodDelegationBinder.BindingResolver.Default r32, C44396e c44396e) {
            this.f418117a = aVar;
            this.f418118b = list;
            this.f418119c = r32;
            this.f418120d = c44396e;
        }

        public final d a(Class<?> cls) {
            Object c12101c;
            TypeDescription typeDescriptionA0 = TypeDescription.d.A0(cls);
            if (typeDescriptionA0.w2()) {
                throw new IllegalArgumentException(D8.o("Cannot delegate to array ", typeDescriptionA0));
            }
            if (typeDescriptionA0.w5()) {
                throw new IllegalArgumentException(D8.o("Cannot delegate to primitive ", typeDescriptionA0));
            }
            net.bytebuddy.description.method.b<net.bytebuddy.description.method.a> bVarP1 = typeDescriptionA0.q().P1(ModifierMatcher.Mode.STATIC.f418407d.a(this.f418120d));
            HashMap map = new HashMap();
            for (c.b<?> bVar : this.f418118b) {
                if (map.put(TypeDescription.d.A0(bVar.b()), bVar) != null) {
                    throw new IllegalArgumentException("Attempt to bind two handlers to " + bVar.b());
                }
            }
            net.bytebuddy.implementation.bind.annotation.c cVar = new net.bytebuddy.implementation.bind.annotation.c(new c.a(map));
            ArrayList arrayList = new ArrayList(bVarP1.size());
            for (net.bytebuddy.description.method.a aVar : bVarP1) {
                if (aVar.getDeclaredAnnotations().isAnnotationPresent(net.bytebuddy.implementation.bind.annotation.a.class)) {
                    c12101c = MethodDelegationBinder.Record.Illegal.f417638b;
                } else {
                    ArrayList arrayList2 = new ArrayList(aVar.getParameters().size());
                    Iterator<?> it = aVar.getParameters().iterator();
                    while (it.hasNext()) {
                        net.bytebuddy.description.method.c cVar2 = (net.bytebuddy.description.method.c) it.next();
                        c.a aVar2 = cVar.f417770a;
                        Assigner.Typing typingA = b.a.a(cVar2);
                        c.a.InterfaceC12097a bVar2 = new c.a.InterfaceC12097a.b(cVar2, typingA);
                        for (AnnotationDescription annotationDescription : cVar2.getDeclaredAnnotations()) {
                            c.b bVar3 = (c.b) aVar2.f417771a.get(annotationDescription.a());
                            if (bVar3 != null && bVar2.a()) {
                                throw new IllegalStateException("Ambiguous binding for parameter annotated with two handled annotation types");
                            }
                            if (bVar3 != null) {
                                bVar2 = new c.a.InterfaceC12097a.C12098a(cVar2, bVar3, annotationDescription.c(bVar3.b()), typingA);
                            }
                        }
                        arrayList2.add(bVar2);
                    }
                    c12101c = new c.C12101c(aVar, arrayList2, b.a.a(aVar));
                }
                arrayList.add(c12101c);
            }
            return new d(new b.e(arrayList), this.f418118b, this.f418117a, MethodDelegationBinder.TerminationHandler.Default.f417640b, this.f418119c, Assigner.f417851M2);
        }

        public final c b(c.b<?>... bVarArr) {
            return new c(this.f418117a, net.bytebuddy.utility.a.a(this.f418118b, Arrays.asList(bVarArr)), this.f418119c, this.f418120d);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f418117a.equals(cVar.f418117a) && this.f418118b.equals(cVar.f418118b) && this.f418119c.equals(cVar.f418119c) && this.f418120d.equals(cVar.f418120d);
        }

        public final int hashCode() {
            return this.f418120d.hashCode() + ((this.f418119c.hashCode() + H.e((this.f418117a.hashCode() + (getClass().hashCode() * 31)) * 31, 31, this.f418118b)) * 31);
        }
    }

    public d() {
        throw null;
    }

    public d(b.e eVar, List list, MethodDelegationBinder.AmbiguityResolver.a aVar, MethodDelegationBinder.TerminationHandler.Default r42, MethodDelegationBinder.BindingResolver.Default r52, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar) {
        this.f418104b = eVar;
        this.f418105c = list;
        this.f418107e = r42;
        this.f418106d = aVar;
        this.f418108f = r52;
        this.f418109g = bVar;
    }

    public static c a() {
        return new c(MethodDelegationBinder.AmbiguityResolver.f417604K2, c.b.f417779L2, MethodDelegationBinder.BindingResolver.Default.f417615b, C44396e.f418422c);
    }

    @Override // net.bytebuddy.implementation.Implementation.b
    public final Implementation.b c(Implementation.b bVar) {
        MethodDelegationBinder.TerminationHandler.Default r52 = MethodDelegationBinder.TerminationHandler.Default.f417641c;
        net.bytebuddy.implementation.bytecode.assign.primitive.b bVar2 = this.f418109g;
        return new Implementation.c.a(new d(this.f418104b, this.f418105c, this.f418106d, r52, this.f418108f, bVar2), bVar);
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public final InstrumentedType e(InstrumentedType instrumentedType) {
        this.f418104b.getClass();
        return instrumentedType;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f418104b.equals(dVar.f418104b) && this.f418105c.equals(dVar.f418105c) && this.f418106d.equals(dVar.f418106d) && this.f418107e.equals(dVar.f418107e) && this.f418108f.equals(dVar.f418108f) && this.f418109g.equals(dVar.f418109g);
    }

    public final int hashCode() {
        return this.f418109g.hashCode() + ((this.f418108f.hashCode() + ((this.f418107e.hashCode() + ((this.f418106d.hashCode() + H.e((this.f418104b.hashCode() + (getClass().hashCode() * 31)) * 31, 31, this.f418105c)) * 31)) * 31)) * 31);
    }

    @Override // net.bytebuddy.implementation.Implementation
    public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
        target.a();
        ArrayList arrayList = this.f418104b.f418116b;
        b.a.C12109d c12109d = new b.a.C12109d(arrayList);
        return new a(target, new MethodDelegationBinder.b(arrayList, this.f418106d, this.f418108f), this.f418107e, this.f418109g, c12109d);
    }

    /* compiled from: MethodDelegation.java */
    public interface b extends InstrumentedType.Prepareable {

        /* compiled from: MethodDelegation.java */
        public interface a {

            /* compiled from: MethodDelegation.java */
            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.d$b$a$a, reason: collision with other inner class name */
            public static class C12107a implements a {
                @Override // net.bytebuddy.implementation.d.b.a
                public final StackManipulation a(net.bytebuddy.description.method.a aVar) {
                    net.bytebuddy.implementation.bytecode.b.g(null);
                    throw null;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    throw null;
                }

                public final int hashCode() {
                    getClass().hashCode();
                    throw null;
                }

                @Override // net.bytebuddy.implementation.d.b.a
                public final MethodDelegationBinder.MethodInvoker invoke() {
                    return MethodDelegationBinder.MethodInvoker.Simple.f417630b;
                }
            }

            /* compiled from: MethodDelegation.java */
            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.d$b$a$b, reason: collision with other inner class name */
            public static class C12108b implements a {
                public C12108b() {
                    throw null;
                }

                @Override // net.bytebuddy.implementation.d.b.a
                public final StackManipulation a(net.bytebuddy.description.method.a aVar) {
                    aVar.b();
                    throw null;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    throw null;
                }

                public final int hashCode() {
                    getClass().hashCode();
                    throw null;
                }

                @Override // net.bytebuddy.implementation.d.b.a
                public final MethodDelegationBinder.MethodInvoker invoke() {
                    throw null;
                }
            }

            /* compiled from: MethodDelegation.java */
            @HashCodeAndEqualsPlugin.Enhance
            public static class c implements a {
                public c() {
                    throw null;
                }

                @Override // net.bytebuddy.implementation.d.b.a
                public final StackManipulation a(net.bytebuddy.description.method.a aVar) {
                    aVar.b();
                    throw null;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    throw null;
                }

                public final int hashCode() {
                    getClass().hashCode();
                    throw null;
                }

                @Override // net.bytebuddy.implementation.d.b.a
                public final MethodDelegationBinder.MethodInvoker invoke() {
                    throw null;
                }
            }

            /* compiled from: MethodDelegation.java */
            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.d$b$a$d, reason: collision with other inner class name */
            public static class C12109d implements a {

                /* renamed from: a, reason: collision with root package name */
                public final ArrayList f418115a;

                public C12109d(ArrayList arrayList) {
                    this.f418115a = arrayList;
                }

                @Override // net.bytebuddy.implementation.d.b.a
                public final StackManipulation a(net.bytebuddy.description.method.a aVar) {
                    return StackManipulation.Trivial.f417829b;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f418115a.equals(((C12109d) obj).f418115a);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f418115a.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.d.b.a
                public final MethodDelegationBinder.MethodInvoker invoke() {
                    return MethodDelegationBinder.MethodInvoker.Simple.f417630b;
                }
            }

            StackManipulation a(net.bytebuddy.description.method.a aVar);

            MethodDelegationBinder.MethodInvoker invoke();
        }

        /* compiled from: MethodDelegation.java */
        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class c implements b {

            /* compiled from: MethodDelegation.java */
            @HashCodeAndEqualsPlugin.Enhance
            public static class a extends c {
                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType.r3(new a.g(null, 4169, null), null);
                }

                @Override // net.bytebuddy.implementation.d.b.c
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    throw null;
                }

                @Override // net.bytebuddy.implementation.d.b.c
                public final int hashCode() {
                    super.hashCode();
                    throw null;
                }
            }

            public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                throw null;
            }

            public int hashCode() {
                getClass().hashCode();
                throw null;
            }

            /* compiled from: MethodDelegation.java */
            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.d$b$c$b, reason: collision with other inner class name */
            public static class C12111b extends c {
                @Override // net.bytebuddy.implementation.d.b.c
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    throw null;
                }

                @Override // net.bytebuddy.implementation.d.b.c
                public final int hashCode() {
                    super.hashCode();
                    throw null;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        /* compiled from: MethodDelegation.java */
        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.implementation.d$b$b, reason: collision with other inner class name */
        public static class C12110b implements b {
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                throw null;
            }

            public final int hashCode() {
                getClass().hashCode();
                throw null;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        /* compiled from: MethodDelegation.java */
        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.implementation.d$b$d, reason: collision with other inner class name */
        public static class C12112d implements b {
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                throw null;
            }

            public final int hashCode() {
                getClass().hashCode();
                throw null;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        /* compiled from: MethodDelegation.java */
        @HashCodeAndEqualsPlugin.Enhance
        public static class e implements b {

            /* renamed from: b, reason: collision with root package name */
            public final ArrayList f418116b;

            public e(ArrayList arrayList) {
                this.f418116b = arrayList;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f418116b.equals(((e) obj).f418116b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f418116b.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }
    }
}
