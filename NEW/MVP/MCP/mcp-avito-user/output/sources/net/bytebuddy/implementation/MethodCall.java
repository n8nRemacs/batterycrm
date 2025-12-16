package net.bytebuddy.implementation;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.yandex.div2.D8;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.enumeration.a;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.FieldLocator;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.Removal;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.collection.ArrayAccess;
import net.bytebuddy.implementation.bytecode.collection.ArrayAccess.a;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory.a;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.DoubleConstant;
import net.bytebuddy.implementation.bytecode.constant.FloatConstant;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.constant.JavaConstantValue;
import net.bytebuddy.implementation.bytecode.constant.LongConstant;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.FieldAccess.b.C12105b;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.M;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.W;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.JavaType;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class MethodCall implements Implementation.b {

    /* renamed from: b, reason: collision with root package name */
    public final MethodLocator.a f417366b;

    /* renamed from: c, reason: collision with root package name */
    public final TargetHandler.a f417367c;

    /* renamed from: d, reason: collision with root package name */
    public final List<ArgumentLoader.b> f417368d;

    /* renamed from: e, reason: collision with root package name */
    public final Enum f417369e;

    /* renamed from: f, reason: collision with root package name */
    public final TerminationHandler.a f417370f;

    public interface ArgumentLoader {

        public interface a {
            List<ArgumentLoader> d(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2);
        }

        public interface b extends InstrumentedType.Prepareable {
            a b(Implementation.Target target);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class d implements ArgumentLoader, a {

            /* renamed from: b, reason: collision with root package name */
            public final net.bytebuddy.description.field.a f417388b;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements b {

                /* renamed from: b, reason: collision with root package name */
                public final Object f417389b;

                /* renamed from: c, reason: collision with root package name */
                @HashCodeAndEqualsPlugin.ValueHandling
                public final String f417390c;

                public a(Object obj) {
                    this.f417389b = obj;
                    char[] cArr = net.bytebuddy.utility.g.f418986c;
                    this.f417390c = "methodCall$".concat(net.bytebuddy.utility.g.a(System.identityHashCode(obj) ^ obj.getClass().hashCode()));
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.b
                public final a b(Implementation.Target target) {
                    return new d((net.bytebuddy.description.field.a) target.a().x().P1(C44411u.x(this.f417390c)).M2());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    Object obj = this.f417389b;
                    return instrumentedType.r3(new a.g(this.f417390c, 4105, TypeDescription.Generic.d.b.y0(obj.getClass())), obj);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417389b.equals(((a) obj).f417389b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f417389b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            public d(net.bytebuddy.description.field.a aVar) {
                this.f417388b = aVar;
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public final StackManipulation a(net.bytebuddy.description.method.c cVar) {
                net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
                Assigner.Typing typing = Assigner.Typing.STATIC;
                net.bytebuddy.description.field.a aVar = this.f417388b;
                StackManipulation.b bVar2 = new StackManipulation.b(FieldAccess.c(aVar).read(), bVar.a(aVar.getType(), cVar.getType(), typing));
                if (bVar2.isValid()) {
                    return bVar2;
                }
                throw new IllegalStateException("Cannot assign " + aVar.getType() + " to " + cVar);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.a
            public final List<ArgumentLoader> d(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                return Collections.singletonList(this);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417388b.equals(((d) obj).f417388b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417388b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class e implements ArgumentLoader {

            /* renamed from: b, reason: collision with root package name */
            public final b f417391b;

            /* renamed from: c, reason: collision with root package name */
            public final net.bytebuddy.description.method.a f417392c;

            /* renamed from: d, reason: collision with root package name */
            public final net.bytebuddy.description.method.a f417393d;

            /* renamed from: e, reason: collision with root package name */
            public final TargetHandler.g f417394e;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements a {

                /* renamed from: b, reason: collision with root package name */
                public final b f417395b;

                public a(b bVar) {
                    this.f417395b = bVar;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.a
                public final List<ArgumentLoader> d(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                    b bVar = this.f417395b;
                    TargetHandler.g gVarA = bVar.f417442f.a(aVar);
                    return Collections.singletonList(new e(bVar, bVar.f417439c.b(aVar, gVarA.t()), aVar, gVarA));
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417395b.equals(((a) obj).f417395b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f417395b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements b {

                /* renamed from: b, reason: collision with root package name */
                public final MethodCall f417396b;

                public b(MethodCall methodCall) {
                    this.f417396b = methodCall;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.b
                public final a b(Implementation.Target target) {
                    return new a(this.f417396b.new b(target, TerminationHandler.Simple.f417435d));
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return this.f417396b.e(instrumentedType);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417396b.equals(((b) obj).f417396b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f417396b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            public e(b bVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2, TargetHandler.g gVar) {
                this.f417391b = bVar;
                this.f417392c = aVar;
                this.f417393d = aVar2;
                this.f417394e = gVar;
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public final StackManipulation a(net.bytebuddy.description.method.c cVar) {
                net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
                Assigner.Typing typing = Assigner.Typing.STATIC;
                TargetHandler.g gVar = this.f417394e;
                b bVar2 = this.f417391b;
                net.bytebuddy.description.method.a aVar = this.f417393d;
                net.bytebuddy.description.method.a aVar2 = this.f417392c;
                StackManipulation.b bVar3 = new StackManipulation.b(bVar2.b(aVar, aVar2, gVar), bVar.a(aVar2.v0() ? aVar2.n().P0() : aVar2.getReturnType(), cVar.getType(), typing));
                if (bVar3.isValid()) {
                    return bVar3;
                }
                throw new IllegalStateException("Cannot assign return type of " + aVar2 + " to " + cVar);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                e eVar = (e) obj;
                return this.f417391b.equals(eVar.f417391b) && this.f417392c.equals(eVar.f417392c) && this.f417393d.equals(eVar.f417393d) && this.f417394e.equals(eVar.f417394e);
            }

            public final int hashCode() {
                return this.f417394e.hashCode() + D8.h(this.f417393d, D8.h(this.f417392c, (this.f417391b.hashCode() + (getClass().hashCode() * 31)) * 31, 31), 31);
            }
        }

        StackManipulation a(net.bytebuddy.description.method.c cVar);

        @HashCodeAndEqualsPlugin.Enhance
        public static class g implements ArgumentLoader, a, b {

            /* renamed from: b, reason: collision with root package name */
            public final StackManipulation f417399b;

            /* renamed from: c, reason: collision with root package name */
            public final Object f417400c;

            public g(StackManipulation stackManipulation, Class cls) {
                this(TypeDefinition.Sort.a(cls, TypeDescription.Generic.AnnotationReader.NoOp.f416326b), stackManipulation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, net.bytebuddy.description.type.TypeDefinition] */
            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public final StackManipulation a(net.bytebuddy.description.method.c cVar) {
                net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
                Assigner.Typing typing = Assigner.Typing.STATIC;
                ?? r22 = this.f417400c;
                StackManipulation stackManipulationA = bVar.a(r22.P0(), cVar.getType(), typing);
                if (stackManipulationA.isValid()) {
                    return new StackManipulation.b(this.f417399b, stackManipulationA);
                }
                throw new IllegalStateException("Cannot assign " + cVar + " to " + ((Object) r22));
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.a
            public final List<ArgumentLoader> d(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                return Collections.singletonList(this);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                g gVar = (g) obj;
                return this.f417399b.equals(gVar.f417399b) && this.f417400c.equals(gVar.f417400c);
            }

            public final int hashCode() {
                return this.f417400c.hashCode() + ((this.f417399b.hashCode() + (getClass().hashCode() * 31)) * 31);
            }

            public g(TypeDefinition typeDefinition, StackManipulation stackManipulation) {
                this.f417399b = stackManipulation;
                this.f417400c = typeDefinition;
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.b
            public final a b(Implementation.Target target) {
                return this;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForInstrumentedType implements ArgumentLoader, a {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417371b;

            public ForInstrumentedType(TypeDescription typeDescription) {
                this.f417371b = typeDescription;
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public final StackManipulation a(net.bytebuddy.description.method.c cVar) {
                StackManipulation.b bVar = new StackManipulation.b(ClassConstant.c(this.f417371b), Assigner.f417851M2.a(TypeDescription.Generic.f416324y2, cVar.getType(), Assigner.Typing.STATIC));
                if (bVar.isValid()) {
                    return bVar;
                }
                throw new IllegalStateException("Cannot assign Class value to " + cVar);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.a
            public final List<ArgumentLoader> d(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                return Collections.singletonList(this);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417371b.equals(((ForInstrumentedType) obj).f417371b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417371b.hashCode() + (getClass().hashCode() * 31);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Factory implements b {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Factory[] f417372b = {new Factory("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                Factory EF5;

                public Factory() {
                    throw null;
                }

                public static Factory valueOf(String str) {
                    return (Factory) Enum.valueOf(Factory.class, str);
                }

                public static Factory[] values() {
                    return (Factory[]) f417372b.clone();
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.b
                public final a b(Implementation.Target target) {
                    return new ForInstrumentedType(target.a());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodParameter implements ArgumentLoader {

            /* renamed from: b, reason: collision with root package name */
            public final int f417373b;

            /* renamed from: c, reason: collision with root package name */
            public final net.bytebuddy.description.method.a f417374c;

            public ForMethodParameter(int i12, net.bytebuddy.description.method.a aVar) {
                this.f417373b = i12;
                this.f417374c = aVar;
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public final StackManipulation a(net.bytebuddy.description.method.c cVar) {
                net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
                Assigner.Typing typing = Assigner.Typing.STATIC;
                net.bytebuddy.description.method.a aVar = this.f417374c;
                net.bytebuddy.description.method.c cVar2 = (net.bytebuddy.description.method.c) aVar.getParameters().get(this.f417373b);
                StackManipulation.b bVar2 = new StackManipulation.b(MethodVariableAccess.b(cVar2), bVar.a(cVar2.getType(), cVar.getType(), typing));
                if (bVar2.isValid()) {
                    return bVar2;
                }
                throw new IllegalStateException("Cannot assign " + cVar2 + " to " + cVar + " for " + aVar);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForMethodParameter forMethodParameter = (ForMethodParameter) obj;
                return this.f417373b == forMethodParameter.f417373b && this.f417374c.equals(forMethodParameter.f417374c);
            }

            public final int hashCode() {
                return this.f417374c.hashCode() + (((getClass().hashCode() * 31) + this.f417373b) * 31);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class OfInstrumentedMethod implements b, a {

                /* renamed from: b, reason: collision with root package name */
                public static final OfInstrumentedMethod f417375b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ OfInstrumentedMethod[] f417376c;

                static {
                    OfInstrumentedMethod ofInstrumentedMethod = new OfInstrumentedMethod("INSTANCE", 0);
                    f417375b = ofInstrumentedMethod;
                    f417376c = new OfInstrumentedMethod[]{ofInstrumentedMethod};
                }

                public OfInstrumentedMethod() {
                    throw null;
                }

                public static OfInstrumentedMethod valueOf(String str) {
                    return (OfInstrumentedMethod) Enum.valueOf(OfInstrumentedMethod.class, str);
                }

                public static OfInstrumentedMethod[] values() {
                    return (OfInstrumentedMethod[]) f417376c.clone();
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.a
                public final List<ArgumentLoader> d(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                    ArrayList arrayList = new ArrayList(aVar.getParameters().size());
                    Iterator<?> it = aVar.getParameters().iterator();
                    while (it.hasNext()) {
                        arrayList.add(new ForMethodParameter(((net.bytebuddy.description.method.c) it.next()).getIndex(), aVar));
                    }
                    return arrayList;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.b
                public final a b(Implementation.Target target) {
                    return this;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements b, a {

                /* renamed from: b, reason: collision with root package name */
                public final int f417377b;

                public a(int i12) {
                    this.f417377b = i12;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.a
                public final List<ArgumentLoader> d(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                    int size = aVar.getParameters().size();
                    int i12 = this.f417377b;
                    if (i12 < size) {
                        return Collections.singletonList(new ForMethodParameter(i12, aVar));
                    }
                    throw new IllegalStateException(aVar + " does not have a parameter with index " + i12 + ", " + aVar.getParameters().size() + " defined");
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417377b == ((a) obj).f417377b;
                    }
                    return false;
                }

                public final int hashCode() {
                    return (getClass().hashCode() * 31) + this.f417377b;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.b
                public final a b(Implementation.Target target) {
                    return this;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodParameterArray implements ArgumentLoader {

            /* renamed from: b, reason: collision with root package name */
            public final net.bytebuddy.description.method.d<?> f417378b;

            public ForMethodParameterArray(net.bytebuddy.description.method.d<?> dVar) {
                this.f417378b = dVar;
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public final StackManipulation a(net.bytebuddy.description.method.c cVar) {
                TypeDescription.Generic genericM;
                net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
                Assigner.Typing typing = Assigner.Typing.STATIC;
                if (cVar.getType().Q2(Object.class)) {
                    genericM = TypeDescription.Generic.f416323x2;
                } else {
                    if (!cVar.getType().w2()) {
                        throw new IllegalStateException("Cannot set method parameter array for non-array type: " + cVar);
                    }
                    genericM = cVar.getType().m();
                }
                net.bytebuddy.description.method.d<?> dVar = this.f417378b;
                ArrayList arrayList = new ArrayList(dVar.size());
                Iterator<?> it = dVar.iterator();
                while (it.hasNext()) {
                    net.bytebuddy.description.method.c cVar2 = (net.bytebuddy.description.method.c) it.next();
                    StackManipulation.b bVar2 = new StackManipulation.b(MethodVariableAccess.b(cVar2), bVar.a(cVar2.getType(), genericM, typing));
                    if (!bVar2.isValid()) {
                        throw new IllegalStateException("Cannot assign " + cVar2 + " to " + genericM);
                    }
                    arrayList.add(bVar2);
                }
                return new StackManipulation.b(ArrayFactory.a(genericM).new a(arrayList));
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417378b.equals(((ForMethodParameterArray) obj).f417378b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417378b.hashCode() + (getClass().hashCode() * 31);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class ForInstrumentedMethod implements b, a {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ ForInstrumentedMethod[] f417379b = {new ForInstrumentedMethod("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                ForInstrumentedMethod EF5;

                public ForInstrumentedMethod() {
                    throw null;
                }

                public static ForInstrumentedMethod valueOf(String str) {
                    return (ForInstrumentedMethod) Enum.valueOf(ForInstrumentedMethod.class, str);
                }

                public static ForInstrumentedMethod[] values() {
                    return (ForInstrumentedMethod[]) f417379b.clone();
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.a
                public final List<ArgumentLoader> d(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                    return Collections.singletonList(new ForMethodParameterArray(aVar.getParameters()));
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.b
                public final a b(Implementation.Target target) {
                    return this;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForThisReference implements ArgumentLoader, a {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417382b;

            public ForThisReference(TypeDescription typeDescription) {
                this.f417382b = typeDescription;
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public final StackManipulation a(net.bytebuddy.description.method.c cVar) {
                net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
                Assigner.Typing typing = Assigner.Typing.STATIC;
                StackManipulation stackManipulationC = MethodVariableAccess.c();
                TypeDescription typeDescription = this.f417382b;
                StackManipulation.b bVar2 = new StackManipulation.b(stackManipulationC, bVar.a(typeDescription.P0(), cVar.getType(), typing));
                if (bVar2.isValid()) {
                    return bVar2;
                }
                throw new IllegalStateException("Cannot assign " + typeDescription + " to " + cVar);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.a
            public final List<ArgumentLoader> d(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                if (!aVar.b()) {
                    return Collections.singletonList(this);
                }
                throw new IllegalStateException(aVar + " is static and cannot supply an invoker instance");
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417382b.equals(((ForThisReference) obj).f417382b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417382b.hashCode() + (getClass().hashCode() * 31);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Factory implements b {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Factory[] f417383b = {new Factory("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                Factory EF5;

                public Factory() {
                    throw null;
                }

                public static Factory valueOf(String str) {
                    return (Factory) Enum.valueOf(Factory.class, str);
                }

                public static Factory[] values() {
                    return (Factory[]) f417383b.clone();
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.b
                public final a b(Implementation.Target target) {
                    return new ForThisReference(target.a());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements ArgumentLoader {

            /* renamed from: b, reason: collision with root package name */
            public final net.bytebuddy.description.field.a f417384b;

            /* renamed from: c, reason: collision with root package name */
            public final net.bytebuddy.description.method.a f417385c;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements a {

                /* renamed from: b, reason: collision with root package name */
                public final net.bytebuddy.description.field.a f417386b;

                public a(net.bytebuddy.description.field.a aVar) {
                    this.f417386b = aVar;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.a
                public final List<ArgumentLoader> d(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                    return Collections.singletonList(new c(this.f417386b, aVar));
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417386b.equals(((a) obj).f417386b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f417386b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            public c(net.bytebuddy.description.field.a aVar, net.bytebuddy.description.method.a aVar2) {
                this.f417384b = aVar;
                this.f417385c = aVar2;
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public final StackManipulation a(net.bytebuddy.description.method.c cVar) {
                net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
                Assigner.Typing typing = Assigner.Typing.STATIC;
                net.bytebuddy.description.field.a aVar = this.f417384b;
                if (!aVar.b()) {
                    net.bytebuddy.description.method.a aVar2 = this.f417385c;
                    if (aVar2.b()) {
                        throw new IllegalStateException("Cannot access non-static " + aVar + " from " + aVar2);
                    }
                }
                StackManipulation.b bVar2 = new StackManipulation.b(aVar.b() ? StackManipulation.Trivial.f417829b : MethodVariableAccess.c(), FieldAccess.c(aVar).read(), bVar.a(aVar.getType(), cVar.getType(), typing));
                if (bVar2.isValid()) {
                    return bVar2;
                }
                throw new IllegalStateException("Cannot assign " + aVar + " to " + cVar);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f417384b.equals(cVar.f417384b) && this.f417385c.equals(cVar.f417385c);
            }

            public final int hashCode() {
                return this.f417385c.hashCode() + ((this.f417384b.hashCode() + (getClass().hashCode() * 31)) * 31);
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements b {

                /* renamed from: b, reason: collision with root package name */
                public final String f417387b;

                public b(String str) {
                    this.f417387b = str;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.b
                public final a b(Implementation.Target target) {
                    FieldLocator.ForClassHierarchy forClassHierarchy = new FieldLocator.ForClassHierarchy(target.a());
                    String str = this.f417387b;
                    FieldLocator.Resolution resolutionK = forClassHierarchy.K(str);
                    if (resolutionK.b()) {
                        return new a(resolutionK.a());
                    }
                    StringBuilder sbA = r.A("Could not locate field '", str, "' on ");
                    sbA.append(target.a());
                    throw new IllegalStateException(sbA.toString());
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    if (!this.f417387b.equals(((b) obj).f417387b)) {
                        return false;
                    }
                    Object obj2 = FieldLocator.ForClassHierarchy.Factory.f416817b;
                    return obj2.equals(obj2);
                }

                public final int hashCode() {
                    return FieldLocator.ForClassHierarchy.Factory.f416817b.hashCode() + H.d(getClass().hashCode() * 31, 31, this.f417387b);
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class f implements ArgumentLoader {

            /* renamed from: b, reason: collision with root package name */
            public final net.bytebuddy.description.method.c f417397b;

            /* renamed from: c, reason: collision with root package name */
            public final int f417398c;

            public f(net.bytebuddy.description.method.c cVar, int i12) {
                this.f417397b = cVar;
                this.f417398c = i12;
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public final StackManipulation a(net.bytebuddy.description.method.c cVar) {
                net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
                Assigner.Typing typing = Assigner.Typing.STATIC;
                net.bytebuddy.description.method.c cVar2 = this.f417397b;
                StackManipulation.b bVar2 = new StackManipulation.b(MethodVariableAccess.b(cVar2), IntegerConstant.c(this.f417398c), ArrayAccess.b(cVar2.getType().m()).new a(), bVar.a(cVar2.getType().m(), cVar.getType(), typing));
                if (bVar2.isValid()) {
                    return bVar2;
                }
                throw new IllegalStateException("Cannot assign " + cVar2.getType().m() + " to " + cVar);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f417398c == fVar.f417398c && this.f417397b.equals(fVar.f417397b);
            }

            public final int hashCode() {
                return ((this.f417397b.hashCode() + (getClass().hashCode() * 31)) * 31) + this.f417398c;
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements b, a {
                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.a
                public final List<ArgumentLoader> d(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                    if (aVar.getParameters().size() <= 0) {
                        throw new IllegalStateException(aVar + " does not declare a parameter with index 0, " + aVar.getParameters().size() + " defined");
                    }
                    if (!((net.bytebuddy.description.method.c) aVar.getParameters().get(0)).getType().w2()) {
                        throw new IllegalStateException("Cannot access an item from non-array parameter " + aVar.getParameters().get(0) + " at index 0");
                    }
                    ArrayList arrayList = new ArrayList(aVar2.getParameters().size());
                    for (int i12 = 0; i12 < aVar2.getParameters().size(); i12++) {
                        arrayList.add(new f((net.bytebuddy.description.method.c) aVar.getParameters().get(0), i12));
                    }
                    return arrayList;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    return getClass().hashCode() * 31;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.b
                public final a b(Implementation.Target target) {
                    return this;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements b, a {
                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.a
                public final List<ArgumentLoader> d(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                    if (aVar.getParameters().size() > 0) {
                        if (((net.bytebuddy.description.method.c) aVar.getParameters().get(0)).getType().w2()) {
                            return Collections.singletonList(new f((net.bytebuddy.description.method.c) aVar.getParameters().get(0), 0));
                        }
                        throw new IllegalStateException("Cannot access an item from non-array parameter " + aVar.getParameters().get(0) + " at index 0");
                    }
                    throw new IllegalStateException(aVar + " does not declare a parameter with index 0, " + aVar.getParameters().size() + " defined");
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    return getClass().hashCode() * 961;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.b
                public final a b(Implementation.Target target) {
                    return this;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForNullConstant implements ArgumentLoader, a, b {

            /* renamed from: b, reason: collision with root package name */
            public static final ForNullConstant f417380b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForNullConstant[] f417381c;

            static {
                ForNullConstant forNullConstant = new ForNullConstant("INSTANCE", 0);
                f417380b = forNullConstant;
                f417381c = new ForNullConstant[]{forNullConstant};
            }

            public ForNullConstant() {
                throw null;
            }

            public static ForNullConstant valueOf(String str) {
                return (ForNullConstant) Enum.valueOf(ForNullConstant.class, str);
            }

            public static ForNullConstant[] values() {
                return (ForNullConstant[]) f417381c.clone();
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public final StackManipulation a(net.bytebuddy.description.method.c cVar) {
                if (!cVar.getType().w5()) {
                    return NullConstant.f418029b;
                }
                throw new IllegalStateException("Cannot assign null to " + cVar);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.a
            public final List<ArgumentLoader> d(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                return Collections.singletonList(this);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.b
            public final a b(Implementation.Target target) {
                return this;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class FieldSetting implements Implementation.b {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Appender implements net.bytebuddy.implementation.bytecode.a {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Appender[] f417401b = {new Appender("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            Appender EF5;

            public Appender() {
                throw null;
            }

            public static Appender valueOf(String str) {
                return (Appender) Enum.valueOf(Appender.class, str);
            }

            public static Appender[] values() {
                return (Appender[]) f417401b.clone();
            }

            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                if (aVar.getReturnType().Q2(Void.TYPE)) {
                    return new a.c(MethodReturn.f418075h.n(sVar, context).f417834b, aVar.p());
                }
                throw new IllegalStateException("Instrumented method " + aVar + " does not return void for field setting method call");
            }
        }

        @Override // net.bytebuddy.implementation.Implementation.b
        public final Implementation.b c(Implementation.b bVar) {
            return new Implementation.c.a((Implementation) null, bVar);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
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

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            throw null;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public class b implements net.bytebuddy.implementation.bytecode.a {

        /* renamed from: b, reason: collision with root package name */
        public final Implementation.Target f417438b;

        /* renamed from: c, reason: collision with root package name */
        public final MethodLocator f417439c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f417440d;

        /* renamed from: e, reason: collision with root package name */
        public final MethodInvoker f417441e;

        /* renamed from: f, reason: collision with root package name */
        public final TargetHandler f417442f;

        /* renamed from: g, reason: collision with root package name */
        public final TerminationHandler f417443g;

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Enum, net.bytebuddy.implementation.MethodCall$MethodInvoker$a] */
        public b(Implementation.Target target, TerminationHandler terminationHandler) {
            this.f417438b = target;
            this.f417439c = MethodCall.this.f417366b.a(target.a());
            List<ArgumentLoader.b> list = MethodCall.this.f417368d;
            this.f417440d = new ArrayList(list.size());
            Iterator<ArgumentLoader.b> it = list.iterator();
            while (it.hasNext()) {
                this.f417440d.add(it.next().b(target));
            }
            this.f417441e = MethodCall.this.f417369e.a(target.a());
            this.f417442f = MethodCall.this.f417367c.b(target);
            this.f417443g = terminationHandler;
        }

        public final StackManipulation.b b(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2, TargetHandler.g gVar) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f417440d.iterator();
            while (it.hasNext()) {
                arrayList.addAll(((ArgumentLoader.a) it.next()).d(aVar, aVar2));
            }
            net.bytebuddy.description.method.d<?> parameters = aVar2.getParameters();
            if (parameters.size() != arrayList.size()) {
                throw new IllegalStateException(aVar2 + " does not accept " + arrayList.size() + " arguments");
            }
            Iterator<?> it2 = parameters.iterator();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it3 = arrayList.iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                MethodCall methodCall = MethodCall.this;
                if (!zHasNext) {
                    methodCall.getClass();
                    return new StackManipulation.b(gVar.d(aVar2), new StackManipulation.b(arrayList2), this.f417441e.b(aVar2, this.f417438b), this.f417443g.b(aVar2, aVar));
                }
                ArgumentLoader argumentLoader = (ArgumentLoader) it3.next();
                net.bytebuddy.description.method.c cVar = (net.bytebuddy.description.method.c) it2.next();
                methodCall.getClass();
                arrayList2.add(argumentLoader.a(cVar));
            }
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f417438b.equals(bVar.f417438b) && this.f417439c.equals(bVar.f417439c) && this.f417440d.equals(bVar.f417440d) && this.f417441e.equals(bVar.f417441e) && this.f417442f.equals(bVar.f417442f) && this.f417443g.equals(bVar.f417443g) && MethodCall.this.equals(MethodCall.this);
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            TargetHandler.g gVarA = this.f417442f.a(aVar);
            return new a.c(new StackManipulation.b(this.f417443g.prepare(), b(aVar, this.f417439c.b(aVar, gVarA.t()), gVarA)).n(sVar, context).f417834b, aVar.p());
        }

        public final int hashCode() {
            return MethodCall.this.hashCode() + ((this.f417443g.hashCode() + ((this.f417442f.hashCode() + ((this.f417441e.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f417440d, (this.f417439c.hashCode() + ((this.f417438b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31);
        }
    }

    public static class c extends MethodCall {
        public final MethodCall k() {
            TargetHandler.e eVar = new TargetHandler.e();
            MethodInvoker.ForVirtualInvocation.WithImplicitType withImplicitType = MethodInvoker.ForVirtualInvocation.WithImplicitType.f417402b;
            return new MethodCall(this.f417366b, eVar, this.f417368d, withImplicitType, this.f417370f);
        }

        public final MethodCall l(MethodCall methodCall) {
            TargetHandler.d.a aVar = new TargetHandler.d.a(methodCall);
            MethodInvoker.ForVirtualInvocation.WithImplicitType withImplicitType = MethodInvoker.ForVirtualInvocation.WithImplicitType.f417402b;
            return new MethodCall(this.f417366b, aVar, this.f417368d, withImplicitType, this.f417370f);
        }

        public final MethodCall m() {
            TargetHandler.ForSelfOrStaticInvocation.Factory factory = TargetHandler.ForSelfOrStaticInvocation.Factory.f417416b;
            MethodInvoker.d.a aVar = MethodInvoker.d.a.f417410b;
            return new MethodCall(this.f417366b, factory, this.f417368d, aVar, this.f417370f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MethodCall(MethodLocator.a aVar, TargetHandler.a aVar2, List list, MethodInvoker.a aVar3, TerminationHandler.a aVar4) {
        this.f417366b = aVar;
        this.f417367c = aVar2;
        this.f417368d = list;
        this.f417369e = (Enum) aVar3;
        this.f417370f = aVar4;
    }

    public static c a(Method method) {
        return d(new a.c(method));
    }

    public static c d(net.bytebuddy.description.method.a aVar) {
        return new c(new MethodLocator.c(aVar), TargetHandler.ForSelfOrStaticInvocation.Factory.f417416b, Collections.emptyList(), MethodInvoker.b.a.f417405b, TerminationHandler.Simple.f417433b);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, net.bytebuddy.implementation.MethodCall$MethodInvoker$a] */
    @Override // net.bytebuddy.implementation.Implementation.b
    public final Implementation.b c(Implementation.b bVar) {
        TerminationHandler.Simple simple = TerminationHandler.Simple.f417434c;
        return new Implementation.c.a(new MethodCall(this.f417366b, this.f417367c, this.f417368d, this.f417369e, simple), bVar);
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public final InstrumentedType e(InstrumentedType instrumentedType) {
        Iterator<ArgumentLoader.b> it = this.f417368d.iterator();
        while (it.hasNext()) {
            instrumentedType = it.next().e(instrumentedType);
        }
        return this.f417367c.e(instrumentedType);
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MethodCall methodCall = (MethodCall) obj;
        Object obj2 = Assigner.Typing.STATIC;
        if (!obj2.equals(obj2) || !this.f417366b.equals(methodCall.f417366b) || !this.f417367c.equals(methodCall.f417367c) || !this.f417368d.equals(methodCall.f417368d) || !this.f417369e.equals(methodCall.f417369e) || !this.f417370f.equals(methodCall.f417370f)) {
            return false;
        }
        net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
        return bVar.equals(bVar);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, net.bytebuddy.implementation.MethodCall$MethodInvoker$a] */
    public final MethodCall g(List<? extends ArgumentLoader.b> list) {
        ArrayList arrayListA = net.bytebuddy.utility.a.a(this.f417368d, list);
        return new MethodCall(this.f417366b, this.f417367c, arrayListA, this.f417369e, this.f417370f);
    }

    public final MethodCall h(Object... objArr) {
        ArgumentLoader.b aVar;
        ArgumentLoader.b gVar;
        ArgumentLoader.b gVar2;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj == null) {
                gVar2 = ArgumentLoader.ForNullConstant.f417380b;
            } else {
                if (obj instanceof Boolean) {
                    aVar = new ArgumentLoader.g(((Boolean) obj).booleanValue() ? IntegerConstant.ONE : IntegerConstant.ZERO, Boolean.TYPE);
                } else if (obj instanceof Byte) {
                    aVar = new ArgumentLoader.g(IntegerConstant.c(((Byte) obj).byteValue()), Byte.TYPE);
                } else if (obj instanceof Short) {
                    aVar = new ArgumentLoader.g(IntegerConstant.c(((Short) obj).shortValue()), Short.TYPE);
                } else if (obj instanceof Character) {
                    aVar = new ArgumentLoader.g(IntegerConstant.c(((Character) obj).charValue()), Character.TYPE);
                } else if (obj instanceof Integer) {
                    aVar = new ArgumentLoader.g(IntegerConstant.c(((Integer) obj).intValue()), Integer.TYPE);
                } else if (obj instanceof Long) {
                    aVar = new ArgumentLoader.g(LongConstant.c(((Long) obj).longValue()), Long.TYPE);
                } else if (obj instanceof Float) {
                    aVar = new ArgumentLoader.g(FloatConstant.c(((Float) obj).floatValue()), Float.TYPE);
                } else if (obj instanceof Double) {
                    aVar = new ArgumentLoader.g(DoubleConstant.c(((Double) obj).doubleValue()), Double.TYPE);
                } else if (obj instanceof String) {
                    aVar = new ArgumentLoader.g(new net.bytebuddy.implementation.bytecode.constant.c((String) obj), String.class);
                } else if (obj instanceof Class) {
                    aVar = new ArgumentLoader.g(ClassConstant.c(TypeDescription.d.A0((Class) obj)), Class.class);
                } else if (obj instanceof TypeDescription) {
                    aVar = new ArgumentLoader.g(ClassConstant.c((TypeDescription) obj), Class.class);
                } else if (obj instanceof Enum) {
                    a.b bVar = new a.b((Enum) obj);
                    gVar2 = new ArgumentLoader.g(bVar.w(), FieldAccess.a(bVar));
                } else if (obj instanceof net.bytebuddy.description.enumeration.a) {
                    net.bytebuddy.description.enumeration.a aVar2 = (net.bytebuddy.description.enumeration.a) obj;
                    aVar = new ArgumentLoader.g(aVar2.w(), FieldAccess.a(aVar2));
                } else {
                    JavaType javaType = JavaType.f418902f;
                    if (javaType.b(obj)) {
                        gVar = new ArgumentLoader.g(javaType.f418912b, new JavaConstantValue(JavaConstant.MethodHandle.b(obj)));
                    } else {
                        JavaType javaType2 = JavaType.f418903g;
                        if (javaType2.b(obj)) {
                            gVar = new ArgumentLoader.g(javaType2.f418912b, new JavaConstantValue(JavaConstant.c.b(obj)));
                        } else if (obj instanceof JavaConstant) {
                            JavaConstant javaConstant = (JavaConstant) obj;
                            aVar = new ArgumentLoader.g(javaConstant.t(), new JavaConstantValue(javaConstant));
                        } else {
                            aVar = new ArgumentLoader.d.a(obj);
                        }
                    }
                    gVar2 = gVar;
                }
                gVar2 = aVar;
            }
            arrayList.add(gVar2);
        }
        return g(arrayList);
    }

    public final int hashCode() {
        return Assigner.Typing.STATIC.hashCode() + ((Assigner.f417851M2.hashCode() + ((this.f417370f.hashCode() + ((this.f417369e.hashCode() + H.e((this.f417367c.hashCode() + ((this.f417366b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31, 31, this.f417368d)) * 31)) * 31)) * 31);
    }

    @Override // net.bytebuddy.implementation.Implementation
    public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
        return new b(target, this.f417370f.a(target.a()));
    }

    public final MethodCall j(int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i12 : iArr) {
            if (i12 < 0) {
                throw new IllegalArgumentException(AK.c.g(i12, "Negative index: "));
            }
            arrayList.add(new ArgumentLoader.ForMethodParameter.a(i12));
        }
        return g(arrayList);
    }

    public interface MethodInvoker {

        public interface a {
            MethodInvoker a(TypeDescription typeDescription);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements MethodInvoker {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417404b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class a implements a {

                /* renamed from: b, reason: collision with root package name */
                public static final a f417405b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ a[] f417406c;

                static {
                    a aVar = new a("INSTANCE", 0);
                    f417405b = aVar;
                    f417406c = new a[]{aVar};
                }

                public a() {
                    throw null;
                }

                public static a valueOf(String str) {
                    return (a) Enum.valueOf(a.class, str);
                }

                public static a[] values() {
                    return (a[]) f417406c.clone();
                }

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.a
                public final MethodInvoker a(TypeDescription typeDescription) {
                    return new b(typeDescription);
                }
            }

            public b(TypeDescription typeDescription) {
                this.f417404b = typeDescription;
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
            public final StackManipulation b(net.bytebuddy.description.method.a aVar, Implementation.Target target) {
                boolean zQ02 = aVar.q0();
                TypeDescription typeDescription = this.f417404b;
                if (!zQ02 || aVar.t0(typeDescription)) {
                    return aVar.q0() ? MethodInvocation.b(aVar).i(typeDescription) : MethodInvocation.b(aVar);
                }
                throw new IllegalStateException("Cannot invoke " + aVar + " on " + typeDescription);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417404b.equals(((b) obj).f417404b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417404b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements MethodInvoker {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417407b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class a implements a {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ a[] f417408b = {new a("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                a EF5;

                public a() {
                    throw null;
                }

                public static a valueOf(String str) {
                    return (a) Enum.valueOf(a.class, str);
                }

                public static a[] values() {
                    return (a[]) f417408b.clone();
                }

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.a
                public final MethodInvoker a(TypeDescription typeDescription) {
                    return new c(typeDescription);
                }
            }

            public c(TypeDescription typeDescription) {
                this.f417407b = typeDescription;
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
            public final StackManipulation b(net.bytebuddy.description.method.a aVar, Implementation.Target target) {
                TypeDescription typeDescription = this.f417407b;
                if (!aVar.t0(typeDescription)) {
                    throw new IllegalStateException("Cannot invoke " + aVar + " as default method of " + typeDescription);
                }
                Implementation.SpecialMethodInvocation specialMethodInvocationE = target.d(aVar.e(), aVar.n().f5()).e(aVar.f0());
                if (specialMethodInvocationE.isValid()) {
                    return specialMethodInvocationE;
                }
                throw new IllegalStateException("Cannot invoke " + aVar + " on " + typeDescription);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417407b.equals(((c) obj).f417407b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417407b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class d implements MethodInvoker {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417409b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class a implements a {

                /* renamed from: b, reason: collision with root package name */
                public static final a f417410b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ a[] f417411c;

                static {
                    a aVar = new a("INSTANCE", 0);
                    f417410b = aVar;
                    f417411c = new a[]{aVar};
                }

                public a() {
                    throw null;
                }

                public static a valueOf(String str) {
                    return (a) Enum.valueOf(a.class, str);
                }

                public static a[] values() {
                    return (a[]) f417411c.clone();
                }

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.a
                public final MethodInvoker a(TypeDescription typeDescription) {
                    if (typeDescription.C3() != null) {
                        return new d(typeDescription);
                    }
                    throw new IllegalStateException(D8.o("Cannot invoke super method for ", typeDescription));
                }
            }

            public d(TypeDescription typeDescription) {
                this.f417409b = typeDescription;
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
            public final StackManipulation b(net.bytebuddy.description.method.a aVar, Implementation.Target target) {
                if (!aVar.t0(target.f().f5())) {
                    throw new IllegalStateException("Cannot invoke " + aVar + " as super method of " + this.f417409b);
                }
                Implementation.SpecialMethodInvocation specialMethodInvocationE = target.e(aVar.e()).e(aVar.f0());
                if (specialMethodInvocationE.isValid()) {
                    return specialMethodInvocationE;
                }
                throw new IllegalStateException("Cannot invoke " + aVar + " as a super method");
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417409b.equals(((d) obj).f417409b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417409b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        StackManipulation b(net.bytebuddy.description.method.a aVar, Implementation.Target target);

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForVirtualInvocation implements MethodInvoker {

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements a {
                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.a
                public final MethodInvoker a(TypeDescription typeDescription) {
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
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
            public final StackManipulation b(net.bytebuddy.description.method.a aVar, Implementation.Target target) {
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

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class WithImplicitType implements MethodInvoker, a {

                /* renamed from: b, reason: collision with root package name */
                public static final WithImplicitType f417402b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ WithImplicitType[] f417403c;

                static {
                    WithImplicitType withImplicitType = new WithImplicitType("INSTANCE", 0);
                    f417402b = withImplicitType;
                    f417403c = new WithImplicitType[]{withImplicitType};
                }

                public WithImplicitType() {
                    throw null;
                }

                public static WithImplicitType valueOf(String str) {
                    return (WithImplicitType) Enum.valueOf(WithImplicitType.class, str);
                }

                public static WithImplicitType[] values() {
                    return (WithImplicitType[]) f417403c.clone();
                }

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
                public final StackManipulation b(net.bytebuddy.description.method.a aVar, Implementation.Target target) {
                    if (aVar.P(target.a()) && aVar.q0()) {
                        return MethodInvocation.b(aVar);
                    }
                    throw new IllegalStateException("Cannot invoke " + aVar + " virtually");
                }

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.a
                public final MethodInvoker a(TypeDescription typeDescription) {
                    return this;
                }
            }
        }
    }

    public interface TargetHandler {

        public interface a extends InstrumentedType.Prepareable {
            TargetHandler b(Implementation.Target target);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class d implements TargetHandler {

            /* renamed from: b, reason: collision with root package name */
            public final b f417425b;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements a {

                /* renamed from: b, reason: collision with root package name */
                public final MethodCall f417426b;

                public a(MethodCall methodCall) {
                    this.f417426b = methodCall;
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.a
                public final TargetHandler b(Implementation.Target target) {
                    return new d(this.f417426b.new b(target, TerminationHandler.Simple.f417435d));
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return this.f417426b.e(instrumentedType);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417426b.equals(((a) obj).f417426b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f417426b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements g {

                /* renamed from: b, reason: collision with root package name */
                public final b f417427b;

                /* renamed from: c, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f417428c;

                /* renamed from: d, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f417429d;

                /* renamed from: e, reason: collision with root package name */
                public final g f417430e;

                public b(b bVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2, g gVar) {
                    this.f417427b = bVar;
                    this.f417428c = aVar;
                    this.f417429d = aVar2;
                    this.f417430e = gVar;
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.g
                public final StackManipulation d(net.bytebuddy.description.method.a aVar) {
                    net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
                    Assigner.Typing typing = Assigner.Typing.STATIC;
                    net.bytebuddy.description.method.a aVar2 = this.f417428c;
                    StackManipulation stackManipulationA = bVar.a(aVar2.v0() ? aVar2.n().P0() : aVar2.getReturnType(), aVar.n().P0(), typing);
                    if (stackManipulationA.isValid()) {
                        return new StackManipulation.b(this.f417427b.b(this.f417429d, aVar2, this.f417430e), stackManipulationA);
                    }
                    StringBuilder sb2 = new StringBuilder("Cannot invoke ");
                    sb2.append(aVar);
                    sb2.append(" on ");
                    sb2.append(aVar2.v0() ? aVar2.n() : aVar2.getReturnType());
                    throw new IllegalStateException(sb2.toString());
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.f417427b.equals(bVar.f417427b) && this.f417428c.equals(bVar.f417428c) && this.f417429d.equals(bVar.f417429d) && this.f417430e.equals(bVar.f417430e);
                }

                public final int hashCode() {
                    return this.f417430e.hashCode() + D8.h(this.f417429d, D8.h(this.f417428c, (this.f417427b.hashCode() + (getClass().hashCode() * 31)) * 31, 31), 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.g
                public final TypeDescription t() {
                    net.bytebuddy.description.method.a aVar = this.f417428c;
                    return aVar.v0() ? aVar.n().f5() : aVar.getReturnType().f5();
                }
            }

            public d(b bVar) {
                this.f417425b = bVar;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public final g a(net.bytebuddy.description.method.a aVar) {
                b bVar = this.f417425b;
                g gVarA = bVar.f417442f.a(aVar);
                return new b(bVar, bVar.f417439c.b(aVar, gVarA.t()), aVar, gVarA);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417425b.equals(((d) obj).f417425b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417425b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        public interface g {
            StackManipulation d(net.bytebuddy.description.method.a aVar);

            TypeDescription t();
        }

        g a(net.bytebuddy.description.method.a aVar);

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForSelfOrStaticInvocation implements TargetHandler {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417415b;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements g {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f417418b;

                /* renamed from: c, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f417419c;

                public a(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                    this.f417418b = typeDescription;
                    this.f417419c = aVar;
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.g
                @SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public final StackManipulation d(net.bytebuddy.description.method.a aVar) {
                    net.bytebuddy.description.method.a aVar2 = this.f417419c;
                    if (aVar2.b() && !aVar.b() && !aVar.v0()) {
                        throw new IllegalStateException("Cannot invoke " + aVar + " from " + aVar2);
                    }
                    if (aVar.v0()) {
                        boolean zV02 = aVar2.v0();
                        TypeDescription typeDescription = this.f417418b;
                        if (!zV02 || (!typeDescription.equals(aVar.n().f5()) && (typeDescription.C3() == null || !typeDescription.C3().f5().equals(aVar.n().f5())))) {
                            throw new IllegalStateException("Cannot invoke " + aVar + " from " + aVar2 + " in " + typeDescription);
                        }
                    }
                    StackManipulation[] stackManipulationArr = new StackManipulation[2];
                    boolean zB2 = aVar.b();
                    StackManipulation stackManipulation = StackManipulation.Trivial.f417829b;
                    stackManipulationArr[0] = zB2 ? stackManipulation : MethodVariableAccess.c();
                    if (aVar.v0()) {
                        stackManipulation = Duplication.f417792d;
                    }
                    stackManipulationArr[1] = stackManipulation;
                    return new StackManipulation.b(stackManipulationArr);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f417418b.equals(aVar.f417418b) && this.f417419c.equals(aVar.f417419c);
                }

                public final int hashCode() {
                    return this.f417419c.hashCode() + D8.j(this.f417418b, getClass().hashCode() * 31, 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.g
                public final TypeDescription t() {
                    return this.f417418b;
                }
            }

            public ForSelfOrStaticInvocation(TypeDescription typeDescription) {
                this.f417415b = typeDescription;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public final g a(net.bytebuddy.description.method.a aVar) {
                return new a(aVar, this.f417415b);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417415b.equals(((ForSelfOrStaticInvocation) obj).f417415b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417415b.hashCode() + (getClass().hashCode() * 31);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Factory implements a {

                /* renamed from: b, reason: collision with root package name */
                public static final Factory f417416b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ Factory[] f417417c;

                static {
                    Factory factory = new Factory("INSTANCE", 0);
                    f417416b = factory;
                    f417417c = new Factory[]{factory};
                }

                public Factory() {
                    throw null;
                }

                public static Factory valueOf(String str) {
                    return (Factory) Enum.valueOf(Factory.class, str);
                }

                public static Factory[] values() {
                    return (Factory[]) f417417c.clone();
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.a
                public final TargetHandler b(Implementation.Target target) {
                    return new ForSelfOrStaticInvocation(target.a());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements TargetHandler, g {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417420b;

            public b(TypeDescription typeDescription) {
                this.f417420b = typeDescription;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.g
            public final StackManipulation d(net.bytebuddy.description.method.a aVar) {
                return new StackManipulation.b(net.bytebuddy.implementation.bytecode.b.g(aVar.n().f5()), Duplication.f417792d);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417420b.equals(((b) obj).f417420b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417420b.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.g
            public final TypeDescription t() {
                return this.f417420b;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class a implements a {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ a[] f417421b = {new a("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                a EF5;

                public a() {
                    throw null;
                }

                public static a valueOf(String str) {
                    return (a) Enum.valueOf(a.class, str);
                }

                public static a[] values() {
                    return (a[]) f417421b.clone();
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.a
                public final TargetHandler b(Implementation.Target target) {
                    return new b(target.a());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public final g a(net.bytebuddy.description.method.a aVar) {
                return this;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements TargetHandler, g {

            /* renamed from: b, reason: collision with root package name */
            public final net.bytebuddy.description.field.a f417422b;

            public interface b {

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements b {

                    /* renamed from: a, reason: collision with root package name */
                    public final a.b f417424a;

                    public a(a.b bVar) {
                        this.f417424a = bVar;
                    }

                    @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.c.b
                    public final net.bytebuddy.description.field.a a(TypeDescription typeDescription) {
                        return this.f417424a;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f417424a.equals(((a) obj).f417424a);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f417424a.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.implementation.MethodCall$TargetHandler$c$b$b, reason: collision with other inner class name */
                public static class C12081b implements b {
                    @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.c.b
                    public final net.bytebuddy.description.field.a a(TypeDescription typeDescription) {
                        FieldLocator.Resolution resolutionK = new FieldLocator.ForClassHierarchy(typeDescription).K("type");
                        if (resolutionK.b()) {
                            return resolutionK.a();
                        }
                        throw new IllegalStateException(D8.o("Could not locate field name type on ", typeDescription));
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Object obj2 = FieldLocator.ForClassHierarchy.Factory.f416817b;
                        return obj2.equals(obj2);
                    }

                    public final int hashCode() {
                        return FieldLocator.ForClassHierarchy.Factory.f416817b.hashCode() + (((getClass().hashCode() * 31) + 3575610) * 31);
                    }
                }

                net.bytebuddy.description.field.a a(TypeDescription typeDescription);
            }

            public c(net.bytebuddy.description.field.a aVar) {
                this.f417422b = aVar;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.g
            public final StackManipulation d(net.bytebuddy.description.method.a aVar) {
                net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
                Assigner.Typing typing = Assigner.Typing.STATIC;
                boolean zC2 = aVar.C();
                net.bytebuddy.description.field.a aVar2 = this.f417422b;
                if (!zC2 || !aVar.q0() || !aVar.o0(aVar2.getType().f5())) {
                    throw new IllegalStateException("Cannot invoke " + aVar + " on " + aVar2);
                }
                StackManipulation stackManipulationA = bVar.a(aVar2.getType(), aVar.n().P0(), typing);
                if (stackManipulationA.isValid()) {
                    return new StackManipulation.b((aVar.b() || aVar2.b()) ? StackManipulation.Trivial.f417829b : MethodVariableAccess.c(), FieldAccess.c(aVar2).read(), stackManipulationA);
                }
                throw new IllegalStateException("Cannot invoke " + aVar + " on " + aVar2);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417422b.equals(((c) obj).f417422b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417422b.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.g
            public final TypeDescription t() {
                return this.f417422b.getType().f5();
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements a {

                /* renamed from: b, reason: collision with root package name */
                public final b f417423b;

                public a(b bVar) {
                    this.f417423b = bVar;
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.a
                @SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public final TargetHandler b(Implementation.Target target) {
                    net.bytebuddy.description.field.a aVarA = this.f417423b.a(target.a());
                    if (aVarA.b() || target.a().m5(aVarA.n().f5())) {
                        return new c(aVarA);
                    }
                    throw new IllegalStateException("Cannot access " + aVarA + " from " + target.a());
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417423b.equals(((a) obj).f417423b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f417423b.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public final g a(net.bytebuddy.description.method.a aVar) {
                return this;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class e implements TargetHandler, a {

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements g {

                /* renamed from: b, reason: collision with root package name */
                public final net.bytebuddy.description.method.c f417431b;

                public a(net.bytebuddy.description.method.c cVar) {
                    this.f417431b = cVar;
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.g
                public final StackManipulation d(net.bytebuddy.description.method.a aVar) {
                    net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
                    Assigner.Typing typing = Assigner.Typing.STATIC;
                    net.bytebuddy.description.method.c cVar = this.f417431b;
                    StackManipulation stackManipulationA = bVar.a(cVar.getType(), aVar.n().P0(), typing);
                    if (stackManipulationA.isValid()) {
                        return new StackManipulation.b(MethodVariableAccess.b(cVar), stackManipulationA);
                    }
                    throw new IllegalStateException("Cannot invoke " + aVar + " on " + cVar.getType());
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417431b.equals(((a) obj).f417431b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f417431b.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.g
                public final TypeDescription t() {
                    return this.f417431b.getType().f5();
                }
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public final g a(net.bytebuddy.description.method.a aVar) {
                if (aVar.getParameters().size() > 0) {
                    return new a((net.bytebuddy.description.method.c) aVar.getParameters().get(0));
                }
                throw new IllegalArgumentException(aVar + " does not have a parameter with index 0");
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return getClass().hashCode() * 31;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.a
            public final TargetHandler b(Implementation.Target target) {
                return this;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class f implements TargetHandler, g {

            /* renamed from: b, reason: collision with root package name */
            public final a.c f417432b;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements a {
                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.a
                public final TargetHandler b(Implementation.Target target) {
                    return new f((a.c) target.a().x().P1(C44411u.x(null)).M2());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType.r3(new a.g(null, 4169, null), null);
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
            }

            public f(a.c cVar) {
                this.f417432b = cVar;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.g
            public final StackManipulation d(net.bytebuddy.description.method.a aVar) {
                net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
                Assigner.Typing typing = Assigner.Typing.STATIC;
                a.c cVar = this.f417432b;
                StackManipulation stackManipulationA = bVar.a(cVar.getType(), aVar.n().P0(), typing);
                if (stackManipulationA.isValid()) {
                    return new StackManipulation.b(FieldAccess.b(cVar).new C12105b(), stackManipulationA);
                }
                throw new IllegalStateException("Cannot invoke " + aVar + " on " + cVar);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417432b.equals(((f) obj).f417432b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417432b.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.g
            public final TypeDescription t() {
                return this.f417432b.getType().f5();
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public final g a(net.bytebuddy.description.method.a aVar) {
                return this;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class h implements TargetHandler, a, g {
            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.g
            public final StackManipulation d(net.bytebuddy.description.method.a aVar) {
                return null;
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

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.g
            public final TypeDescription t() {
                return null;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public final g a(net.bytebuddy.description.method.a aVar) {
                return this;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.a
            public final TargetHandler b(Implementation.Target target) {
                return this;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }
    }

    public interface MethodLocator {

        public interface a {
            MethodLocator a(TypeDescription typeDescription);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements MethodLocator {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417413b;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements a {
                @Override // net.bytebuddy.implementation.MethodCall.MethodLocator.a
                public final MethodLocator a(TypeDescription typeDescription) {
                    return new b(typeDescription);
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
            }

            public b(TypeDescription typeDescription) {
                this.f417413b = typeDescription;
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator
            public final net.bytebuddy.description.method.a b(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                TypeDescription typeDescription2 = this.f417413b;
                TypeDescription.Generic genericC3 = typeDescription2.C3();
                if (genericC3 == null) {
                    Collections.emptyList();
                } else {
                    genericC3.q().P1(MethodSortMatcher.Sort.f418387e.f418392c.a(null));
                }
                typeDescription2.q().P1(new M(MethodSortMatcher.Sort.f418389g.f418392c).a(null));
                throw null;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                if (this.f417413b.equals(((b) obj).f417413b)) {
                    throw null;
                }
                return false;
            }

            public final int hashCode() {
                getClass().hashCode();
                this.f417413b.hashCode();
                throw null;
            }
        }

        net.bytebuddy.description.method.a b(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription);

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForInstrumentedMethod implements MethodLocator, a {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ForInstrumentedMethod[] f417412b = {new ForInstrumentedMethod("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            ForInstrumentedMethod EF5;

            public ForInstrumentedMethod() {
                throw null;
            }

            public static ForInstrumentedMethod valueOf(String str) {
                return (ForInstrumentedMethod) Enum.valueOf(ForInstrumentedMethod.class, str);
            }

            public static ForInstrumentedMethod[] values() {
                return (ForInstrumentedMethod[]) f417412b.clone();
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator.a
            public final MethodLocator a(TypeDescription typeDescription) {
                return this;
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator
            public final net.bytebuddy.description.method.a b(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                return aVar;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements MethodLocator, a {

            /* renamed from: b, reason: collision with root package name */
            public final net.bytebuddy.description.method.a f417414b;

            public c(net.bytebuddy.description.method.a aVar) {
                this.f417414b = aVar;
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator
            public final net.bytebuddy.description.method.a b(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                return this.f417414b;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417414b.equals(((c) obj).f417414b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417414b.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator.a
            public final MethodLocator a(TypeDescription typeDescription) {
                return this;
            }
        }
    }

    public interface TerminationHandler {

        public interface a {
            TerminationHandler a(TypeDescription typeDescription);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements TerminationHandler {

            /* renamed from: b, reason: collision with root package name */
            public final net.bytebuddy.description.field.a f417437b;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements a {
                @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler.a
                @SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public final TerminationHandler a(TypeDescription typeDescription) {
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
            }

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.MethodCall$TerminationHandler$b$b, reason: collision with other inner class name */
            public static class C12082b implements a {
                @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler.a
                public final TerminationHandler a(TypeDescription typeDescription) {
                    TypeDefinition typeDefinitionC3 = typeDescription;
                    do {
                        net.bytebuddy.description.field.b bVarP1 = typeDefinitionC3.x().P1(new W(typeDescription).a(null));
                        if (bVarP1.size() == 1) {
                            return new b((net.bytebuddy.description.field.a) bVarP1.M2());
                        }
                        if (bVarP1.size() == 2) {
                            throw new IllegalStateException("null is ambiguous and resolved: " + bVarP1);
                        }
                        typeDefinitionC3 = typeDefinitionC3.C3();
                    } while (typeDefinitionC3 != null);
                    throw new IllegalStateException(D8.o("null does not locate any accessible fields for ", typeDescription));
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
            }

            public b(net.bytebuddy.description.field.a aVar) {
                this.f417437b = aVar;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
            public final StackManipulation b(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
                Assigner.Typing typing = Assigner.Typing.STATIC;
                TypeDescription.Generic genericP0 = aVar.v0() ? aVar.n().P0() : aVar.getReturnType();
                net.bytebuddy.description.field.a aVar3 = this.f417437b;
                StackManipulation stackManipulationA = bVar.a(genericP0, aVar3.getType(), typing);
                if (stackManipulationA.isValid()) {
                    return new StackManipulation.b(stackManipulationA, FieldAccess.c(aVar3).a());
                }
                throw new IllegalStateException("Cannot assign result of " + aVar + " to " + aVar3);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417437b.equals(((b) obj).f417437b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417437b.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
            public final StackManipulation prepare() {
                return this.f417437b.b() ? StackManipulation.Trivial.f417829b : MethodVariableAccess.c();
            }
        }

        StackManipulation b(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2);

        StackManipulation prepare();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class Simple implements TerminationHandler, a {

            /* renamed from: b, reason: collision with root package name */
            public static final Simple f417433b;

            /* renamed from: c, reason: collision with root package name */
            public static final Simple f417434c;

            /* renamed from: d, reason: collision with root package name */
            public static final Simple f417435d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ Simple[] f417436e;

            public enum a extends Simple {
                @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
                public final StackManipulation b(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                    StackManipulation stackManipulationA = Assigner.f417851M2.a(aVar.v0() ? aVar.n().P0() : aVar.getReturnType(), aVar2.getReturnType(), Assigner.Typing.STATIC);
                    if (stackManipulationA.isValid()) {
                        return new StackManipulation.b(stackManipulationA, MethodReturn.c(aVar2.getReturnType()));
                    }
                    throw new IllegalStateException("Cannot return " + aVar.getReturnType() + " from " + aVar2);
                }
            }

            public enum b extends Simple {
                @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
                public final StackManipulation b(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                    return Removal.c(aVar.v0() ? aVar.n() : aVar.getReturnType());
                }
            }

            public enum c extends Simple {
                @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
                public final StackManipulation b(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2) {
                    return StackManipulation.Trivial.f417829b;
                }
            }

            static {
                a aVar = new a("RETURNING", 0, null);
                f417433b = aVar;
                b bVar = new b("DROPPING", 1, null);
                f417434c = bVar;
                c cVar = new c("IGNORING", 2, null);
                f417435d = cVar;
                f417436e = new Simple[]{aVar, bVar, cVar};
            }

            public Simple() {
                throw null;
            }

            public Simple(String str, int i12, a aVar) {
            }

            public static Simple valueOf(String str) {
                return (Simple) Enum.valueOf(Simple.class, str);
            }

            public static Simple[] values() {
                return (Simple[]) f417436e.clone();
            }

            @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
            public final StackManipulation prepare() {
                return StackManipulation.Trivial.f417829b;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler.a
            public final TerminationHandler a(TypeDescription typeDescription) {
                return this;
            }
        }
    }
}
