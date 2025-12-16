package net.bytebuddy.asm;

import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.div2.D8;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.build.k;
import net.bytebuddy.build.m;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.c;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.scaffold.FieldLocator;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.FieldAccessor;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.SuperMethodCall;
import net.bytebuddy.implementation.bytecode.Addition;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.Removal;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.implementation.bytecode.Throw;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.collection.ArrayAccess;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory.a;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.constant.JavaConstantValue;
import net.bytebuddy.implementation.bytecode.constant.MethodConstant;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.b;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.c;
import net.bytebuddy.jar.asm.AbstractC44388a;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.jar.asm.C;
import net.bytebuddy.jar.asm.C44390c;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.C44413w;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.K;
import net.bytebuddy.matcher.ModifierMatcher;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.JavaType;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class Advice implements AsmVisitorWrapper.d.c, Implementation {

    /* renamed from: g, reason: collision with root package name */
    public static final a.d f415511g;

    /* renamed from: h, reason: collision with root package name */
    public static final a.d f415512h;

    /* renamed from: i, reason: collision with root package name */
    public static final a.d f415513i;

    /* renamed from: j, reason: collision with root package name */
    public static final a.d f415514j;

    /* renamed from: k, reason: collision with root package name */
    public static final a.d f415515k;

    /* renamed from: l, reason: collision with root package name */
    public static final a.d f415516l;

    /* renamed from: m, reason: collision with root package name */
    public static final a.d f415517m;

    /* renamed from: n, reason: collision with root package name */
    public static final a.d f415518n;

    /* renamed from: o, reason: collision with root package name */
    public static final a.d f415519o;

    /* renamed from: b, reason: collision with root package name */
    public final Dispatcher.d.b f415520b;

    /* renamed from: c, reason: collision with root package name */
    public final Dispatcher.d.c f415521c;

    /* renamed from: d, reason: collision with root package name */
    public final net.bytebuddy.implementation.bytecode.assign.primitive.b f415522d;

    /* renamed from: e, reason: collision with root package name */
    public final ExceptionHandler.Default f415523e;

    /* renamed from: f, reason: collision with root package name */
    public final SuperMethodCall f415524f;

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class AssignReturned implements PostProcessor {

        @HashCodeAndEqualsPlugin.Enhance
        public static class DefaultValueSkip implements StackManipulation {

            /* renamed from: b, reason: collision with root package name */
            public final StackManipulation f415538b;

            /* renamed from: c, reason: collision with root package name */
            public final StackMapFrameHandler.c f415539c;

            /* renamed from: d, reason: collision with root package name */
            public final int f415540d;

            /* renamed from: e, reason: collision with root package name */
            public final Dispatcher f415541e;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static abstract class Dispatcher {

                /* renamed from: b, reason: collision with root package name */
                public static final Dispatcher f415542b;

                /* renamed from: c, reason: collision with root package name */
                public static final Dispatcher f415543c;

                /* renamed from: d, reason: collision with root package name */
                public static final Dispatcher f415544d;

                /* renamed from: e, reason: collision with root package name */
                public static final Dispatcher f415545e;

                /* renamed from: f, reason: collision with root package name */
                public static final Dispatcher f415546f;

                /* renamed from: g, reason: collision with root package name */
                public static final /* synthetic */ Dispatcher[] f415547g;

                public enum a extends Dispatcher {
                    @Override // net.bytebuddy.asm.Advice.AssignReturned.DefaultValueSkip.Dispatcher
                    public final StackManipulation.d a(net.bytebuddy.jar.asm.s sVar, int i12, net.bytebuddy.jar.asm.r rVar) {
                        sVar.J(21, i12);
                        sVar.r(153, rVar);
                        return new StackManipulation.d(0, 1);
                    }
                }

                public enum b extends Dispatcher {
                    @Override // net.bytebuddy.asm.Advice.AssignReturned.DefaultValueSkip.Dispatcher
                    public final StackManipulation.d a(net.bytebuddy.jar.asm.s sVar, int i12, net.bytebuddy.jar.asm.r rVar) {
                        sVar.J(22, i12);
                        sVar.m(9);
                        sVar.m(148);
                        sVar.r(153, rVar);
                        return new StackManipulation.d(0, 4);
                    }
                }

                public enum c extends Dispatcher {
                    @Override // net.bytebuddy.asm.Advice.AssignReturned.DefaultValueSkip.Dispatcher
                    public final StackManipulation.d a(net.bytebuddy.jar.asm.s sVar, int i12, net.bytebuddy.jar.asm.r rVar) {
                        sVar.J(23, i12);
                        sVar.m(11);
                        sVar.m(149);
                        sVar.r(153, rVar);
                        return new StackManipulation.d(0, 2);
                    }
                }

                public enum d extends Dispatcher {
                    @Override // net.bytebuddy.asm.Advice.AssignReturned.DefaultValueSkip.Dispatcher
                    public final StackManipulation.d a(net.bytebuddy.jar.asm.s sVar, int i12, net.bytebuddy.jar.asm.r rVar) {
                        sVar.J(24, i12);
                        sVar.m(14);
                        sVar.m(151);
                        sVar.r(153, rVar);
                        return new StackManipulation.d(0, 4);
                    }
                }

                public enum e extends Dispatcher {
                    @Override // net.bytebuddy.asm.Advice.AssignReturned.DefaultValueSkip.Dispatcher
                    public final StackManipulation.d a(net.bytebuddy.jar.asm.s sVar, int i12, net.bytebuddy.jar.asm.r rVar) {
                        sVar.J(25, i12);
                        sVar.r(198, rVar);
                        return new StackManipulation.d(0, 2);
                    }
                }

                static {
                    a aVar = new a("INTEGER", 0, null);
                    f415542b = aVar;
                    b bVar = new b("LONG", 1, null);
                    f415543c = bVar;
                    c cVar = new c("FLOAT", 2, null);
                    f415544d = cVar;
                    d dVar = new d("DOUBLE", 3, null);
                    f415545e = dVar;
                    e eVar = new e("REFERENCE", 4, null);
                    f415546f = eVar;
                    f415547g = new Dispatcher[]{aVar, bVar, cVar, dVar, eVar};
                }

                public Dispatcher() {
                    throw null;
                }

                public Dispatcher(String str, int i12, a aVar) {
                }

                public static Dispatcher valueOf(String str) {
                    return (Dispatcher) Enum.valueOf(Dispatcher.class, str);
                }

                public static Dispatcher[] values() {
                    return (Dispatcher[]) f415547g.clone();
                }

                public abstract StackManipulation.d a(net.bytebuddy.jar.asm.s sVar, int i12, net.bytebuddy.jar.asm.r rVar);
            }

            public DefaultValueSkip(StackManipulation stackManipulation, StackMapFrameHandler.c cVar, int i12, Dispatcher dispatcher) {
                this.f415538b = stackManipulation;
                this.f415539c = cVar;
                this.f415540d = i12;
                this.f415541e = dispatcher;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                DefaultValueSkip defaultValueSkip = (DefaultValueSkip) obj;
                return this.f415540d == defaultValueSkip.f415540d && this.f415541e.equals(defaultValueSkip.f415541e) && this.f415538b.equals(defaultValueSkip.f415538b) && this.f415539c.equals(defaultValueSkip.f415539c);
            }

            public final int hashCode() {
                return this.f415541e.hashCode() + ((((this.f415539c.hashCode() + ((this.f415538b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31) + this.f415540d) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final boolean isValid() {
                return this.f415538b.isValid();
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                net.bytebuddy.jar.asm.r rVar = new net.bytebuddy.jar.asm.r();
                StackManipulation.d dVarA = this.f415541e.a(sVar, this.f415540d, rVar).a(this.f415538b.n(sVar, context));
                sVar.s(rVar);
                this.f415539c.l(sVar, Collections.emptyList());
                sVar.m(0);
                return dVarA;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ExceptionHandler implements StackManipulation {

            public interface Factory {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class NoOp implements Factory {

                    /* renamed from: b, reason: collision with root package name */
                    public static final NoOp f415548b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ NoOp[] f415549c;

                    static {
                        NoOp noOp = new NoOp("INSTANCE", 0);
                        f415548b = noOp;
                        f415549c = new NoOp[]{noOp};
                    }

                    public NoOp() {
                        throw null;
                    }

                    public static NoOp valueOf(String str) {
                        return (NoOp) Enum.valueOf(NoOp.class, str);
                    }

                    public static NoOp[] values() {
                        return (NoOp[]) f415549c.clone();
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements Factory {
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

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final boolean isValid() {
                throw null;
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(net.bytebuddy.jar.asm.s sVar, Implementation.Context context) {
                new net.bytebuddy.jar.asm.r();
                new net.bytebuddy.jar.asm.r();
                new net.bytebuddy.jar.asm.r();
                throw null;
            }
        }

        /* JADX WARN: Method from annotation default annotation not found: index */
        /* JADX WARN: Method from annotation default annotation not found: typing */
        @Target({ElementType.METHOD})
        @Documented
        @Retention(RetentionPolicy.RUNTIME)
        public @interface ToAllArguments {

            @HashCodeAndEqualsPlugin.Enhance
            public static class Handler implements e {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class Factory implements e.a<ToAllArguments> {

                    /* renamed from: b, reason: collision with root package name */
                    public static final Factory f415550b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final a.d f415551c;

                    /* renamed from: d, reason: collision with root package name */
                    public static final a.d f415552d;

                    /* renamed from: e, reason: collision with root package name */
                    public static final /* synthetic */ Factory[] f415553e;

                    static {
                        Factory factory = new Factory("INSTANCE", 0);
                        f415550b = factory;
                        f415553e = new Factory[]{factory};
                        net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(ToAllArguments.class).q();
                        f415551c = (a.d) bVarQ.P1(C44411u.x("index")).M2();
                        f415552d = (a.d) bVarQ.P1(C44411u.x("typing")).M2();
                    }

                    public Factory() {
                        throw null;
                    }

                    public static Factory valueOf(String str) {
                        return (Factory) Enum.valueOf(Factory.class, str);
                    }

                    public static Factory[] values() {
                        return (Factory[]) f415553e.clone();
                    }
                }

                @Override // net.bytebuddy.asm.Advice.AssignReturned.e
                @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public final StackManipulation a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler argumentHandler, TypeDescription.Generic generic, StackManipulation stackManipulation) {
                    StackManipulation bVar2;
                    TypeDescription.Generic genericA = generic;
                    ArrayList arrayList = new ArrayList(aVar.getParameters().size());
                    Assigner.Typing typing = null;
                    if (generic.w2()) {
                        bVar2 = stackManipulation;
                    } else {
                        TypeDescription.Generic.AnnotationReader.NoOp noOp = TypeDescription.Generic.AnnotationReader.NoOp.f416326b;
                        StackManipulation stackManipulationA = bVar.a(genericA, TypeDefinition.Sort.a(Object[].class, noOp), null);
                        if (!stackManipulationA.isValid()) {
                            throw new IllegalStateException("Cannot assign " + genericA + " to " + Object[].class);
                        }
                        genericA = TypeDefinition.Sort.a(Object[].class, noOp);
                        bVar2 = new StackManipulation.b(stackManipulation, stackManipulationA);
                    }
                    Iterator<?> it = aVar.getParameters().iterator();
                    while (it.hasNext()) {
                        net.bytebuddy.description.method.c cVar = (net.bytebuddy.description.method.c) it.next();
                        StackManipulation stackManipulationA2 = bVar.a(genericA.m(), cVar.getType(), typing);
                        if (!stackManipulationA2.isValid()) {
                            throw new IllegalStateException("Cannot assign " + genericA.m() + " to " + cVar);
                        }
                        arrayList.add(new StackManipulation.b(stackManipulationA2, MethodVariableAccess.d(cVar.getType()).new c(argumentHandler.d(cVar.getOffset()))));
                        typing = null;
                    }
                    return new StackManipulation.b(bVar2, ArrayAccess.b(genericA.m()).a(arrayList), Removal.f417810e);
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
        }

        @Target({ElementType.METHOD})
        @Documented
        @Retention(RetentionPolicy.RUNTIME)
        public @interface ToArguments {

            @HashCodeAndEqualsPlugin.Enhance
            public static class Handler implements e {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class Factory implements e.a<ToArguments> {

                    /* renamed from: b, reason: collision with root package name */
                    public static final Factory f415554b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final a.d f415555c;

                    /* renamed from: d, reason: collision with root package name */
                    public static final a.d f415556d;

                    /* renamed from: e, reason: collision with root package name */
                    public static final a.d f415557e;

                    /* renamed from: f, reason: collision with root package name */
                    public static final a.d f415558f;

                    /* renamed from: g, reason: collision with root package name */
                    public static final /* synthetic */ Factory[] f415559g;

                    static {
                        Factory factory = new Factory("INSTANCE", 0);
                        f415554b = factory;
                        f415559g = new Factory[]{factory};
                        f415555c = (a.d) TypeDescription.d.A0(ToArguments.class).q().P1(C44411u.x("value")).M2();
                        net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(a.class).q();
                        f415556d = (a.d) bVarQ.P1(C44411u.x("value")).M2();
                        f415557e = (a.d) bVarQ.P1(C44411u.x("index")).M2();
                        f415558f = (a.d) bVarQ.P1(C44411u.x("typing")).M2();
                    }

                    public Factory() {
                        throw null;
                    }

                    public static Factory valueOf(String str) {
                        return (Factory) Enum.valueOf(Factory.class, str);
                    }

                    public static Factory[] values() {
                        return (Factory[]) f415559g.clone();
                    }
                }

                @Override // net.bytebuddy.asm.Advice.AssignReturned.e
                public final StackManipulation a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler argumentHandler, TypeDescription.Generic generic, StackManipulation stackManipulation) {
                    if (aVar.getParameters().size() < 0) {
                        throw new IllegalStateException(aVar + " declares less then 0 parameters");
                    }
                    StackManipulation stackManipulationA = bVar.a(generic, ((net.bytebuddy.description.method.c) aVar.getParameters().get(0)).getType(), null);
                    if (stackManipulationA.isValid()) {
                        return new StackManipulation.b(stackManipulation, stackManipulationA, MethodVariableAccess.d(((net.bytebuddy.description.method.c) aVar.getParameters().get(0)).getType()).new c(argumentHandler.d(((net.bytebuddy.description.method.c) aVar.getParameters().get(0)).getOffset())));
                    }
                    throw new IllegalStateException("Cannot assign " + generic + " to " + ((net.bytebuddy.description.method.c) aVar.getParameters().get(0)).getType());
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

            /* JADX WARN: Method from annotation default annotation not found: index */
            /* JADX WARN: Method from annotation default annotation not found: typing */
            @Target({})
            @m.a
            @Repeatable(ToArguments.class)
            public @interface a {
            }
        }

        @Target({ElementType.METHOD})
        @Documented
        @Retention(RetentionPolicy.RUNTIME)
        public @interface ToFields {

            @HashCodeAndEqualsPlugin.Enhance
            public static class Handler implements e {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class Factory implements e.a<ToFields> {

                    /* renamed from: b, reason: collision with root package name */
                    public static final Factory f415560b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final a.d f415561c;

                    /* renamed from: d, reason: collision with root package name */
                    public static final a.d f415562d;

                    /* renamed from: e, reason: collision with root package name */
                    public static final a.d f415563e;

                    /* renamed from: f, reason: collision with root package name */
                    public static final a.d f415564f;

                    /* renamed from: g, reason: collision with root package name */
                    public static final a.d f415565g;

                    /* renamed from: h, reason: collision with root package name */
                    public static final /* synthetic */ Factory[] f415566h;

                    static {
                        Factory factory = new Factory("INSTANCE", 0);
                        f415560b = factory;
                        f415566h = new Factory[]{factory};
                        f415561c = (a.d) TypeDescription.d.A0(ToFields.class).q().P1(C44411u.x("value")).M2();
                        net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(a.class).q();
                        f415562d = (a.d) bVarQ.P1(C44411u.x("value")).M2();
                        f415563e = (a.d) bVarQ.P1(C44411u.x("index")).M2();
                        f415564f = (a.d) bVarQ.P1(C44411u.x("declaringType")).M2();
                        f415565g = (a.d) bVarQ.P1(C44411u.x("typing")).M2();
                    }

                    public Factory() {
                        throw null;
                    }

                    public static Factory valueOf(String str) {
                        return (Factory) Enum.valueOf(Factory.class, str);
                    }

                    public static Factory[] values() {
                        return (Factory[]) f415566h.clone();
                    }
                }

                @Override // net.bytebuddy.asm.Advice.AssignReturned.e
                @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public final StackManipulation a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler argumentHandler, TypeDescription.Generic generic, StackManipulation stackManipulation) {
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
                    D8.j(null, H.d(((getClass().hashCode() * 31) + 0) * 31, 31, null), 31);
                    throw null;
                }
            }

            /* JADX WARN: Method from annotation default annotation not found: declaringType */
            /* JADX WARN: Method from annotation default annotation not found: index */
            /* JADX WARN: Method from annotation default annotation not found: typing */
            /* JADX WARN: Method from annotation default annotation not found: value */
            @Target({})
            @m.a
            @Repeatable(ToFields.class)
            public @interface a {
            }
        }

        /* JADX WARN: Method from annotation default annotation not found: index */
        /* JADX WARN: Method from annotation default annotation not found: typing */
        @Target({ElementType.METHOD})
        @Documented
        @Retention(RetentionPolicy.RUNTIME)
        public @interface ToReturned {

            @HashCodeAndEqualsPlugin.Enhance
            public static class Handler implements e {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class Factory implements e.a<ToReturned> {

                    /* renamed from: b, reason: collision with root package name */
                    public static final Factory f415567b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final a.d f415568c;

                    /* renamed from: d, reason: collision with root package name */
                    public static final a.d f415569d;

                    /* renamed from: e, reason: collision with root package name */
                    public static final /* synthetic */ Factory[] f415570e;

                    static {
                        Factory factory = new Factory("INSTANCE", 0);
                        f415567b = factory;
                        f415570e = new Factory[]{factory};
                        net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(ToReturned.class).q();
                        f415568c = (a.d) bVarQ.P1(C44411u.x("index")).M2();
                        f415569d = (a.d) bVarQ.P1(C44411u.x("typing")).M2();
                    }

                    public Factory() {
                        throw null;
                    }

                    public static Factory valueOf(String str) {
                        return (Factory) Enum.valueOf(Factory.class, str);
                    }

                    public static Factory[] values() {
                        return (Factory[]) f415570e.clone();
                    }
                }

                @Override // net.bytebuddy.asm.Advice.AssignReturned.e
                public final StackManipulation a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler argumentHandler, TypeDescription.Generic generic, StackManipulation stackManipulation) {
                    if (aVar.getReturnType().Q2(Void.TYPE)) {
                        return StackManipulation.Trivial.f417829b;
                    }
                    StackManipulation stackManipulationA = bVar.a(generic, aVar.getReturnType(), null);
                    if (stackManipulationA.isValid()) {
                        return new StackManipulation.b(stackManipulation, stackManipulationA, MethodVariableAccess.d(aVar.getReturnType()).new c(argumentHandler.i()));
                    }
                    throw new IllegalStateException("Cannot assign " + generic + " to " + aVar.getReturnType());
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
        }

        /* JADX WARN: Method from annotation default annotation not found: index */
        /* JADX WARN: Method from annotation default annotation not found: typing */
        @Target({ElementType.METHOD})
        @Documented
        @Retention(RetentionPolicy.RUNTIME)
        public @interface ToThis {

            @HashCodeAndEqualsPlugin.Enhance
            public static class Handler implements e {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class Factory implements e.a<ToThis> {

                    /* renamed from: b, reason: collision with root package name */
                    public static final Factory f415571b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final a.d f415572c;

                    /* renamed from: d, reason: collision with root package name */
                    public static final a.d f415573d;

                    /* renamed from: e, reason: collision with root package name */
                    public static final /* synthetic */ Factory[] f415574e;

                    static {
                        Factory factory = new Factory("INSTANCE", 0);
                        f415571b = factory;
                        f415574e = new Factory[]{factory};
                        net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(ToThis.class).q();
                        f415572c = (a.d) bVarQ.P1(C44411u.x("index")).M2();
                        f415573d = (a.d) bVarQ.P1(C44411u.x("typing")).M2();
                    }

                    public Factory() {
                        throw null;
                    }

                    public static Factory valueOf(String str) {
                        return (Factory) Enum.valueOf(Factory.class, str);
                    }

                    public static Factory[] values() {
                        return (Factory[]) f415574e.clone();
                    }
                }

                @Override // net.bytebuddy.asm.Advice.AssignReturned.e
                public final StackManipulation a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler argumentHandler, TypeDescription.Generic generic, StackManipulation stackManipulation) {
                    if (aVar.b()) {
                        throw new IllegalStateException(D8.m("Cannot assign this reference for static method ", aVar));
                    }
                    if (aVar.v0()) {
                        throw new IllegalStateException(D8.m("Cannot assign this reference in constructor prior to initialization for ", aVar));
                    }
                    StackManipulation stackManipulationA = bVar.a(generic, typeDescription.P0(), null);
                    if (stackManipulationA.isValid()) {
                        return new StackManipulation.b(stackManipulation, stackManipulationA, MethodVariableAccess.f418084i.new c(argumentHandler.d(0)));
                    }
                    throw new IllegalStateException("Cannot assign " + generic + " to " + typeDescription);
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
        }

        /* JADX WARN: Method from annotation default annotation not found: index */
        /* JADX WARN: Method from annotation default annotation not found: typing */
        @Target({ElementType.METHOD})
        @Documented
        @Retention(RetentionPolicy.RUNTIME)
        public @interface ToThrown {

            @HashCodeAndEqualsPlugin.Enhance
            public static class Handler implements e {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class Factory implements e.a<ToThrown> {

                    /* renamed from: b, reason: collision with root package name */
                    public static final Factory f415575b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final a.d f415576c;

                    /* renamed from: d, reason: collision with root package name */
                    public static final a.d f415577d;

                    /* renamed from: e, reason: collision with root package name */
                    public static final /* synthetic */ Factory[] f415578e;

                    static {
                        Factory factory = new Factory("INSTANCE", 0);
                        f415575b = factory;
                        f415578e = new Factory[]{factory};
                        net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(ToThrown.class).q();
                        f415576c = (a.d) bVarQ.P1(C44411u.x("index")).M2();
                        f415577d = (a.d) bVarQ.P1(C44411u.x("typing")).M2();
                    }

                    public Factory() {
                        throw null;
                    }

                    public static Factory valueOf(String str) {
                        return (Factory) Enum.valueOf(Factory.class, str);
                    }

                    public static Factory[] values() {
                        return (Factory[]) f415578e.clone();
                    }
                }

                @Override // net.bytebuddy.asm.Advice.AssignReturned.e
                public final StackManipulation a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler argumentHandler, TypeDescription.Generic generic, StackManipulation stackManipulation) {
                    if (aVar.getReturnType().Q2(Void.TYPE)) {
                        return StackManipulation.Trivial.f417829b;
                    }
                    StackManipulation stackManipulationA = bVar.a(generic, TypeDefinition.Sort.a(Throwable.class, TypeDescription.Generic.AnnotationReader.NoOp.f416326b), null);
                    if (stackManipulationA.isValid()) {
                        return new StackManipulation.b(stackManipulation, stackManipulationA, MethodVariableAccess.f418084i.new c(argumentHandler.h()));
                    }
                    throw new IllegalStateException("Cannot assign " + generic + " to " + Throwable.class.getName());
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
        }

        /* JADX WARN: Method from annotation default annotation not found: skipOnDefaultValue */
        @Target({ElementType.METHOD})
        @Documented
        @Retention(RetentionPolicy.RUNTIME)
        public @interface a {
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements PostProcessor.b {

            /* renamed from: d, reason: collision with root package name */
            public static final a.d f415579d = (a.d) TypeDescription.d.A0(a.class).q().P1(C44411u.x("skipOnDefaultValue")).M2();

            /* renamed from: b, reason: collision with root package name */
            public final List<? extends e.a<?>> f415580b;

            /* renamed from: c, reason: collision with root package name */
            public final ExceptionHandler.Factory.NoOp f415581c;

            public b() {
                List<? extends e.a<?>> listAsList = Arrays.asList(ToArguments.Handler.Factory.f415554b, ToAllArguments.Handler.Factory.f415550b, ToThis.Handler.Factory.f415571b, ToFields.Handler.Factory.f415560b, ToReturned.Handler.Factory.f415567b, ToThrown.Handler.Factory.f415575b);
                ExceptionHandler.Factory.NoOp noOp = ExceptionHandler.Factory.NoOp.f415548b;
                this.f415580b = listAsList;
                this.f415581c = noOp;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f415580b.equals(bVar.f415580b) && this.f415581c.equals(bVar.f415581c);
            }

            public final int hashCode() {
                return this.f415581c.hashCode() + H.e(getClass().hashCode() * 31, 31, this.f415580b);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c extends AssignReturned {
            @Override // net.bytebuddy.asm.Advice.AssignReturned
            public final Collection<e> b() {
                throw null;
            }

            @Override // net.bytebuddy.asm.Advice.AssignReturned
            @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public final TypeDescription.Generic c() {
                throw null;
            }

            @Override // net.bytebuddy.asm.Advice.AssignReturned
            @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public final StackManipulation d(e eVar, int i12) {
                MethodVariableAccess.f418084i.new b(i12);
                throw null;
            }

            @Override // net.bytebuddy.asm.Advice.AssignReturned
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

            @Override // net.bytebuddy.asm.Advice.AssignReturned
            public final int hashCode() {
                super.hashCode();
                throw null;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class d extends AssignReturned {
            @Override // net.bytebuddy.asm.Advice.AssignReturned
            public final Collection<e> b() {
                return null;
            }

            @Override // net.bytebuddy.asm.Advice.AssignReturned
            public final TypeDescription.Generic c() {
                return null;
            }

            @Override // net.bytebuddy.asm.Advice.AssignReturned
            public final StackManipulation d(e eVar, int i12) {
                return MethodVariableAccess.d(null).new b(i12);
            }

            @Override // net.bytebuddy.asm.Advice.AssignReturned
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

            @Override // net.bytebuddy.asm.Advice.AssignReturned
            public final int hashCode() {
                super.hashCode();
                throw null;
            }
        }

        public interface e {

            public interface a<T extends Annotation> {

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.asm.Advice$AssignReturned$e$a$a, reason: collision with other inner class name */
                public static class C11912a<S extends Annotation> implements a<S> {
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
            }

            StackManipulation a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler argumentHandler, TypeDescription.Generic generic, StackManipulation stackManipulation);
        }

        @Override // net.bytebuddy.asm.Advice.PostProcessor
        public final StackManipulation a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler argumentHandler, StackMapFrameHandler.c cVar, StackManipulation stackManipulation) {
            ArrayList arrayList = new ArrayList(b().size());
            for (e eVar : b()) {
                arrayList.add(eVar.a(typeDescription, aVar, bVar, argumentHandler, c(), d(eVar, argumentHandler.k())));
            }
            new StackManipulation.b(arrayList);
            throw null;
        }

        public abstract Collection<e> b();

        public abstract TypeDescription.Generic c();

        public abstract StackManipulation d(e eVar, int i12);

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
            D8.i(null, getClass().hashCode() * 31, 31);
            throw null;
        }
    }

    public interface Delegator {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForStaticInvocation implements Delegator {

            /* renamed from: b, reason: collision with root package name */
            public static final ForStaticInvocation f415582b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForStaticInvocation[] f415583c;

            static {
                ForStaticInvocation forStaticInvocation = new ForStaticInvocation("INSTANCE", 0);
                f415582b = forStaticInvocation;
                f415583c = new ForStaticInvocation[]{forStaticInvocation};
            }

            public ForStaticInvocation() {
                throw null;
            }

            public static ForStaticInvocation valueOf(String str) {
                return (ForStaticInvocation) Enum.valueOf(ForStaticInvocation.class, str);
            }

            public static ForStaticInvocation[] values() {
                return (ForStaticInvocation[]) f415583c.clone();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements Delegator {
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
    }

    public interface ExceptionHandler {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class Default implements ExceptionHandler {

            /* renamed from: b, reason: collision with root package name */
            public static final Default f415685b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Default[] f415686c;

            public enum a extends Default {
                @Override // net.bytebuddy.asm.Advice.ExceptionHandler
                public final StackManipulation a() {
                    return Removal.f417810e;
                }
            }

            public enum b extends Default {
                @Override // net.bytebuddy.asm.Advice.ExceptionHandler
                public final StackManipulation a() {
                    try {
                        return MethodInvocation.a(new a.c(Throwable.class.getMethod("printStackTrace", new Class[0])));
                    } catch (NoSuchMethodException unused) {
                        throw new IllegalStateException("Cannot locate Throwable::printStackTrace");
                    }
                }
            }

            public enum c extends Default {
                @Override // net.bytebuddy.asm.Advice.ExceptionHandler
                public final StackManipulation a() {
                    return Throw.f417844b;
                }
            }

            static {
                a aVar = new a("SUPPRESSING", 0, null);
                f415685b = aVar;
                f415686c = new Default[]{aVar, new b("PRINTING", 1, null), new c("RETHROWING", 2, null)};
            }

            public Default() {
                throw null;
            }

            public Default(String str, int i12, a aVar) {
            }

            public static Default valueOf(String str) {
                return (Default) Enum.valueOf(Default.class, str);
            }

            public static Default[] values() {
                return (Default[]) f415686c.clone();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements ExceptionHandler {
            @Override // net.bytebuddy.asm.Advice.ExceptionHandler
            public final StackManipulation a() {
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
        }

        StackManipulation a();
    }

    public interface OffsetMapping {

        public interface Factory<T extends Annotation> {

            public enum AdviceType {
                DELEGATION(true),
                INLINING(false);


                /* renamed from: b, reason: collision with root package name */
                public final boolean f415703b;

                AdviceType(boolean z12) {
                    this.f415703b = z12;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a<T extends Annotation> implements Factory<T> {

                /* renamed from: b, reason: collision with root package name */
                public final Class<T> f415704b;

                public a(Class<T> cls) {
                    this.f415704b = cls;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<T> a() {
                    return this.f415704b;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<T> gVar, AdviceType adviceType) {
                    throw new IllegalStateException("Usage of " + this.f415704b + " is not allowed on " + interfaceC11982c);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f415704b.equals(((a) obj).f415704b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f415704b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b<T extends Annotation> implements Factory<T> {

                /* renamed from: b, reason: collision with root package name */
                public final k.b f415705b;

                public b(k.b bVar) {
                    this.f415705b = bVar;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<T> a() {
                    return k.a.class;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<T> gVar, AdviceType adviceType) {
                    return this.f415705b;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return k.a.class.equals(k.a.class) && this.f415705b.equals(((b) obj).f415705b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f415705b.hashCode() + ((k.a.class.hashCode() + (getClass().hashCode() * 31)) * 31);
                }
            }

            Class<T> a();

            OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<T> gVar, AdviceType adviceType);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForAllArguments implements OffsetMapping {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription.Generic f415706b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f415707c;

            /* renamed from: d, reason: collision with root package name */
            public final Assigner.Typing f415708d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f415709e;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Factory implements Factory<c> {

                /* renamed from: b, reason: collision with root package name */
                public static final Factory f415710b;

                /* renamed from: c, reason: collision with root package name */
                public static final a.d f415711c;

                /* renamed from: d, reason: collision with root package name */
                public static final a.d f415712d;

                /* renamed from: e, reason: collision with root package name */
                public static final a.d f415713e;

                /* renamed from: f, reason: collision with root package name */
                public static final /* synthetic */ Factory[] f415714f;

                static {
                    Factory factory = new Factory("INSTANCE", 0);
                    f415710b = factory;
                    f415714f = new Factory[]{factory};
                    net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(c.class).q();
                    f415711c = (a.d) bVarQ.P1(C44411u.x("readOnly")).M2();
                    f415712d = (a.d) bVarQ.P1(C44411u.x("typing")).M2();
                    f415713e = (a.d) bVarQ.P1(C44411u.x("nullIfEmpty")).M2();
                }

                public Factory() {
                    throw null;
                }

                public static Factory valueOf(String str) {
                    return (Factory) Enum.valueOf(Factory.class, str);
                }

                public static Factory[] values() {
                    return (Factory[]) f415714f.clone();
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<c> a() {
                    return c.class;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<c> gVar, Factory.AdviceType adviceType) {
                    if (!interfaceC11982c.getType().Q2(Object.class) && !interfaceC11982c.getType().w2()) {
                        throw new IllegalStateException("Cannot use AllArguments annotation on a non-array type");
                    }
                    if (!adviceType.f415703b || ((Boolean) gVar.d(f415711c).b(Boolean.class)).booleanValue()) {
                        return new ForAllArguments(interfaceC11982c.getType().Q2(Object.class) ? TypeDescription.Generic.f416323x2 : interfaceC11982c.getType().m(), gVar);
                    }
                    throw new IllegalStateException("Cannot define writable field access for " + interfaceC11982c);
                }
            }

            public ForAllArguments(TypeDescription.Generic generic, AnnotationDescription.g<c> gVar) {
                boolean zBooleanValue = ((Boolean) gVar.d(Factory.f415711c).b(Boolean.class)).booleanValue();
                Assigner.Typing typing = (Assigner.Typing) D8.l(c.class, gVar.d(Factory.f415712d), Assigner.Typing.class);
                boolean zBooleanValue2 = ((Boolean) gVar.d(Factory.f415713e).b(Boolean.class)).booleanValue();
                this.f415706b = generic;
                this.f415707c = zBooleanValue;
                this.f415708d = typing;
                this.f415709e = zBooleanValue2;
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                boolean z12 = this.f415709e;
                boolean z13 = this.f415707c;
                if (z12 && aVar.getParameters().isEmpty()) {
                    return z13 ? new f.e(NullConstant.f418029b) : new f.e.a(Removal.f417810e);
                }
                ArrayList arrayList = new ArrayList(aVar.getParameters().size());
                Iterator<?> it = aVar.getParameters().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    Assigner.Typing typing = this.f415708d;
                    TypeDescription.Generic generic = this.f415706b;
                    if (!zHasNext) {
                        if (z13) {
                            return new f.b.a(generic, arrayList);
                        }
                        ArrayList arrayList2 = new ArrayList(aVar.getParameters().size());
                        Iterator<?> it2 = aVar.getParameters().iterator();
                        while (it2.hasNext()) {
                            net.bytebuddy.description.method.c cVar = (net.bytebuddy.description.method.c) it2.next();
                            StackManipulation stackManipulationA = bVar.a(generic, cVar.getType(), typing);
                            if (!stackManipulationA.isValid()) {
                                throw new IllegalStateException("Cannot assign " + generic + " to " + cVar);
                            }
                            arrayList2.add(new StackManipulation.b(stackManipulationA, MethodVariableAccess.d(cVar.getType()).new c(aVar2.d(cVar.getOffset()))));
                        }
                        return new f.b.C11932b(generic, arrayList, arrayList2);
                    }
                    net.bytebuddy.description.method.c cVar2 = (net.bytebuddy.description.method.c) it.next();
                    StackManipulation stackManipulationA2 = bVar.a(cVar2.getType(), generic, typing);
                    if (!stackManipulationA2.isValid()) {
                        throw new IllegalStateException("Cannot assign " + cVar2 + " to " + generic);
                    }
                    arrayList.add(new StackManipulation.b(MethodVariableAccess.d(cVar2.getType()).new b(aVar2.d(cVar2.getOffset())), stackManipulationA2));
                }
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForAllArguments forAllArguments = (ForAllArguments) obj;
                return this.f415707c == forAllArguments.f415707c && this.f415709e == forAllArguments.f415709e && this.f415708d.equals(forAllArguments.f415708d) && this.f415706b.equals(forAllArguments.f415706b);
            }

            public final int hashCode() {
                return ((this.f415708d.hashCode() + ((D8.i(this.f415706b, getClass().hashCode() * 31, 31) + (this.f415707c ? 1 : 0)) * 31)) * 31) + (this.f415709e ? 1 : 0);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class ForArgument implements OffsetMapping {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription.Generic f415715b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f415716c;

            /* renamed from: d, reason: collision with root package name */
            public final Assigner.Typing f415717d;

            @HashCodeAndEqualsPlugin.Enhance
            public static class Unresolved extends ForArgument {

                /* renamed from: e, reason: collision with root package name */
                public final int f415718e;

                /* renamed from: f, reason: collision with root package name */
                public final boolean f415719f;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class Factory implements Factory<e> {

                    /* renamed from: b, reason: collision with root package name */
                    public static final Factory f415720b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final a.d f415721c;

                    /* renamed from: d, reason: collision with root package name */
                    public static final a.d f415722d;

                    /* renamed from: e, reason: collision with root package name */
                    public static final a.d f415723e;

                    /* renamed from: f, reason: collision with root package name */
                    public static final a.d f415724f;

                    /* renamed from: g, reason: collision with root package name */
                    public static final /* synthetic */ Factory[] f415725g;

                    static {
                        Factory factory = new Factory("INSTANCE", 0);
                        f415720b = factory;
                        f415725g = new Factory[]{factory};
                        net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(e.class).q();
                        f415721c = (a.d) bVarQ.P1(C44411u.x("value")).M2();
                        f415722d = (a.d) bVarQ.P1(C44411u.x("readOnly")).M2();
                        f415723e = (a.d) bVarQ.P1(C44411u.x("typing")).M2();
                        f415724f = (a.d) bVarQ.P1(C44411u.x("optional")).M2();
                    }

                    public Factory() {
                        throw null;
                    }

                    public static Factory valueOf(String str) {
                        return (Factory) Enum.valueOf(Factory.class, str);
                    }

                    public static Factory[] values() {
                        return (Factory[]) f415725g.clone();
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public final Class<e> a() {
                        return e.class;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<e> gVar, Factory.AdviceType adviceType) {
                        boolean z12 = adviceType.f415703b;
                        a.d dVar = f415722d;
                        if (!z12 || ((Boolean) gVar.d(dVar).b(Boolean.class)).booleanValue()) {
                            return new Unresolved(interfaceC11982c.getType(), ((Boolean) gVar.d(dVar).b(Boolean.class)).booleanValue(), (Assigner.Typing) D8.l(e.class, gVar.d(f415723e), Assigner.Typing.class), ((Integer) gVar.d(f415721c).b(Integer.class)).intValue(), ((Boolean) gVar.d(f415724f).b(Boolean.class)).booleanValue());
                        }
                        throw new IllegalStateException("Cannot define writable field access for " + interfaceC11982c + " when using delegation");
                    }
                }

                public Unresolved() {
                    throw null;
                }

                public Unresolved(TypeDescription.Generic generic, boolean z12, Assigner.Typing typing, int i12, boolean z13) {
                    super(generic, z12, typing);
                    this.f415718e = i12;
                    this.f415719f = z13;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForArgument
                public final net.bytebuddy.description.method.c a(net.bytebuddy.description.method.a aVar) {
                    net.bytebuddy.description.method.d<?> parameters = aVar.getParameters();
                    int size = parameters.size();
                    int i12 = this.f415718e;
                    if (size > i12) {
                        return (net.bytebuddy.description.method.c) parameters.get(i12);
                    }
                    throw new IllegalStateException(aVar + " does not define an index " + i12);
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForArgument, net.bytebuddy.asm.Advice.OffsetMapping
                public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                    if (!this.f415719f || aVar.getParameters().size() > this.f415718e) {
                        return super.c(typeDescription, aVar, bVar, aVar2, sort);
                    }
                    boolean z12 = this.f415716c;
                    TypeDescription.Generic generic = this.f415715b;
                    return z12 ? new f.c.a(generic) : new f.c.b(generic);
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForArgument
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
                    Unresolved unresolved = (Unresolved) obj;
                    return this.f415718e == unresolved.f415718e && this.f415719f == unresolved.f415719f;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForArgument
                public final int hashCode() {
                    return (((super.hashCode() * 31) + this.f415718e) * 31) + (this.f415719f ? 1 : 0);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a extends ForArgument {

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.asm.Advice$OffsetMapping$ForArgument$a$a, reason: collision with other inner class name */
                public static class C11929a<T extends Annotation> implements Factory<T> {
                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public final Class<T> a() {
                        return null;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<T> gVar, Factory.AdviceType adviceType) {
                        return new a(interfaceC11982c.getType(), false, null);
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

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForArgument
                public final net.bytebuddy.description.method.c a(net.bytebuddy.description.method.a aVar) {
                    throw null;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForArgument
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

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForArgument
                public final int hashCode() {
                    super.hashCode();
                    throw null;
                }
            }

            public ForArgument(TypeDescription.Generic generic, boolean z12, Assigner.Typing typing) {
                this.f415715b = generic;
                this.f415716c = z12;
                this.f415717d = typing;
            }

            public abstract net.bytebuddy.description.method.c a(net.bytebuddy.description.method.a aVar);

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                net.bytebuddy.description.method.c cVarA = a(aVar);
                TypeDescription.Generic type = cVarA.getType();
                TypeDescription.Generic generic = this.f415715b;
                Assigner.Typing typing = this.f415717d;
                StackManipulation stackManipulationA = bVar.a(type, generic, typing);
                if (!stackManipulationA.isValid()) {
                    throw new IllegalStateException("Cannot assign " + cVarA + " to " + generic);
                }
                if (this.f415716c) {
                    return new f.AbstractC11933f.a(cVarA.getType(), aVar2.d(cVarA.getOffset()), stackManipulationA);
                }
                StackManipulation stackManipulationA2 = bVar.a(generic, cVarA.getType(), typing);
                if (stackManipulationA2.isValid()) {
                    return new f.AbstractC11933f.b(cVarA.getType(), aVar2.d(cVarA.getOffset()), stackManipulationA, stackManipulationA2);
                }
                throw new IllegalStateException("Cannot assign " + cVarA + " to " + generic);
            }

            public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForArgument forArgument = (ForArgument) obj;
                return this.f415716c == forArgument.f415716c && this.f415717d.equals(forArgument.f415717d) && this.f415715b.equals(forArgument.f415715b);
            }

            public int hashCode() {
                return this.f415717d.hashCode() + ((D8.i(this.f415715b, getClass().hashCode() * 31, 31) + (this.f415716c ? 1 : 0)) * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class ForField implements OffsetMapping {

            /* renamed from: e, reason: collision with root package name */
            public static final a.d f415726e;

            /* renamed from: f, reason: collision with root package name */
            public static final a.d f415727f;

            /* renamed from: g, reason: collision with root package name */
            public static final a.d f415728g;

            /* renamed from: h, reason: collision with root package name */
            public static final a.d f415729h;

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription.Generic f415730b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f415731c;

            /* renamed from: d, reason: collision with root package name */
            public final Assigner.Typing f415732d;

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class Unresolved extends ForField {

                /* renamed from: i, reason: collision with root package name */
                public final String f415733i;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class Factory implements Factory<h> {

                    /* renamed from: b, reason: collision with root package name */
                    public static final Factory f415734b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ Factory[] f415735c;

                    static {
                        Factory factory = new Factory("INSTANCE", 0);
                        f415734b = factory;
                        f415735c = new Factory[]{factory};
                    }

                    public Factory() {
                        throw null;
                    }

                    public static Factory valueOf(String str) {
                        return (Factory) Enum.valueOf(Factory.class, str);
                    }

                    public static Factory[] values() {
                        return (Factory[]) f415735c.clone();
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public final Class<h> a() {
                        return h.class;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<h> gVar, Factory.AdviceType adviceType) {
                        if (!adviceType.f415703b || ((Boolean) gVar.d(ForField.f415728g).b(Boolean.class)).booleanValue()) {
                            TypeDescription typeDescription = (TypeDescription) gVar.d(ForField.f415727f).b(TypeDescription.class);
                            return typeDescription.Q2(Void.TYPE) ? new b(interfaceC11982c.getType(), ((Boolean) gVar.d(ForField.f415728g).b(Boolean.class)).booleanValue(), (Assigner.Typing) D8.l(Assigner.Typing.class, gVar.d(ForField.f415729h), Assigner.Typing.class), (String) gVar.d(ForField.f415726e).b(String.class)) : new a(interfaceC11982c.getType(), gVar, typeDescription);
                        }
                        throw new IllegalStateException("Cannot write to field for " + interfaceC11982c + " in read-only context");
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class a extends Unresolved {

                    /* renamed from: j, reason: collision with root package name */
                    public final TypeDescription f415736j;

                    public a(TypeDescription.Generic generic, AnnotationDescription.g<h> gVar, TypeDescription typeDescription) {
                        super(generic, ((Boolean) gVar.d(ForField.f415728g).b(Boolean.class)).booleanValue(), (Assigner.Typing) D8.l(Assigner.Typing.class, gVar.d(ForField.f415729h), Assigner.Typing.class), (String) gVar.d(ForField.f415726e).b(String.class));
                        this.f415736j = typeDescription;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForField.Unresolved
                    public final FieldLocator b(TypeDescription typeDescription) {
                        TypeDescription typeDescription2 = this.f415736j;
                        if (typeDescription2.Q2(net.bytebuddy.dynamic.c.class) || typeDescription.m5(typeDescription2)) {
                            TypeDescription typeDescriptionA = net.bytebuddy.dynamic.c.a(typeDescription2, typeDescription);
                            return new FieldLocator.c(typeDescriptionA, typeDescriptionA);
                        }
                        throw new IllegalStateException(typeDescription2 + " is no super type of " + typeDescription);
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForField.Unresolved, net.bytebuddy.asm.Advice.OffsetMapping.ForField
                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f415736j.equals(((a) obj).f415736j);
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForField.Unresolved, net.bytebuddy.asm.Advice.OffsetMapping.ForField
                    public final int hashCode() {
                        return this.f415736j.hashCode() + (super.hashCode() * 31);
                    }
                }

                public static class b extends Unresolved {
                    public b() {
                        throw null;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForField.Unresolved
                    public final FieldLocator b(TypeDescription typeDescription) {
                        return new FieldLocator.ForClassHierarchy(typeDescription);
                    }
                }

                public Unresolved(TypeDescription.Generic generic, boolean z12, Assigner.Typing typing, String str) {
                    super(generic, z12, typing);
                    this.f415733i = str;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForField
                public final net.bytebuddy.description.field.a a(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                    FieldLocator.Resolution resolutionK;
                    String strSubstring;
                    FieldLocator fieldLocatorB = b(typeDescription);
                    String str = this.f415733i;
                    if (str.equals("")) {
                        if (C44411u.w("set").a(C44411u.z(1)).a(new K(new C44413w(C44411u.f(TypeDescription.f416321E2)))).b(aVar)) {
                            strSubstring = aVar.V().substring(3);
                        } else if (((InterfaceC44410t.a.b) C44411u.o()).b(aVar)) {
                            strSubstring = aVar.V().substring(aVar.V().startsWith("is") ? 2 : 3);
                        } else {
                            resolutionK = FieldLocator.Resolution.Illegal.f416821b;
                        }
                        resolutionK = fieldLocatorB.K(Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1));
                    } else {
                        resolutionK = ((FieldLocator.a) fieldLocatorB).K(str);
                    }
                    if (resolutionK.b()) {
                        return resolutionK.a();
                    }
                    throw new IllegalStateException("Cannot locate field named " + str + " for " + typeDescription);
                }

                public abstract FieldLocator b(TypeDescription typeDescription);

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForField
                public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f415733i.equals(((Unresolved) obj).f415733i);
                    }
                    return false;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForField
                public int hashCode() {
                    return this.f415733i.hashCode() + (super.hashCode() * 31);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a extends ForField {

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.asm.Advice$OffsetMapping$ForField$a$a, reason: collision with other inner class name */
                public static class C11930a<T extends Annotation> implements Factory<T> {
                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public final Class<T> a() {
                        return null;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<T> gVar, Factory.AdviceType adviceType) {
                        return new a(interfaceC11982c.getType(), false, null);
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

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForField
                @SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public final net.bytebuddy.description.field.a a(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                    throw null;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForField
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

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForField
                public final int hashCode() {
                    super.hashCode();
                    throw null;
                }
            }

            static {
                net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(h.class).q();
                f415726e = (a.d) bVarQ.P1(C44411u.x("value")).M2();
                f415727f = (a.d) bVarQ.P1(C44411u.x("declaringType")).M2();
                f415728g = (a.d) bVarQ.P1(C44411u.x("readOnly")).M2();
                f415729h = (a.d) bVarQ.P1(C44411u.x("typing")).M2();
            }

            public ForField(TypeDescription.Generic generic, boolean z12, Assigner.Typing typing) {
                this.f415730b = generic;
                this.f415731c = z12;
                this.f415732d = typing;
            }

            public abstract net.bytebuddy.description.field.a a(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription);

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                net.bytebuddy.description.field.a aVarA = a(aVar, typeDescription);
                if (!aVarA.b() && aVar.b()) {
                    throw new IllegalStateException("Cannot read non-static field " + aVarA + " from static method " + aVar);
                }
                if (sort.a(aVar) && !aVarA.b()) {
                    throw new IllegalStateException(D8.m("Cannot access non-static field before calling constructor: ", aVar));
                }
                TypeDescription.Generic type = aVarA.getType();
                TypeDescription.Generic generic = this.f415730b;
                Assigner.Typing typing = this.f415732d;
                StackManipulation stackManipulationA = bVar.a(type, generic, typing);
                if (!stackManipulationA.isValid()) {
                    throw new IllegalStateException("Cannot assign " + aVarA + " to " + generic);
                }
                if (this.f415731c) {
                    return new f.d.a(aVarA, stackManipulationA);
                }
                StackManipulation stackManipulationA2 = bVar.a(generic, aVarA.getType(), typing);
                if (stackManipulationA2.isValid()) {
                    return new f.d.b(aVarA.i(), stackManipulationA, stackManipulationA2);
                }
                throw new IllegalStateException("Cannot assign " + generic + " to " + aVarA);
            }

            public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForField forField = (ForField) obj;
                return this.f415731c == forField.f415731c && this.f415732d.equals(forField.f415732d) && this.f415730b.equals(forField.f415730b);
            }

            public int hashCode() {
                return this.f415732d.hashCode() + ((D8.i(this.f415730b, getClass().hashCode() * 31, 31) + (this.f415731c ? 1 : 0)) * 31);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class ForInstrumentedMethod implements OffsetMapping {

            /* renamed from: b, reason: collision with root package name */
            public static final ForInstrumentedMethod f415737b;

            /* renamed from: c, reason: collision with root package name */
            public static final ForInstrumentedMethod f415738c;

            /* renamed from: d, reason: collision with root package name */
            public static final ForInstrumentedMethod f415739d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ ForInstrumentedMethod[] f415740e;

            public enum a extends ForInstrumentedMethod {
                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForInstrumentedMethod
                public final boolean a(net.bytebuddy.description.method.a aVar) {
                    return aVar.C();
                }
            }

            public enum b extends ForInstrumentedMethod {
                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForInstrumentedMethod
                public final boolean a(net.bytebuddy.description.method.a aVar) {
                    return aVar.v0();
                }
            }

            public enum c extends ForInstrumentedMethod {
                @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForInstrumentedMethod
                public final boolean a(net.bytebuddy.description.method.a aVar) {
                    return true;
                }
            }

            static {
                a aVar = new a("METHOD", 0, null);
                f415737b = aVar;
                b bVar = new b("CONSTRUCTOR", 1, null);
                f415738c = bVar;
                c cVar = new c("EXECUTABLE", 2, null);
                f415739d = cVar;
                f415740e = new ForInstrumentedMethod[]{aVar, bVar, cVar};
            }

            public ForInstrumentedMethod() {
                throw null;
            }

            public ForInstrumentedMethod(String str, int i12, a aVar) {
            }

            public static ForInstrumentedMethod valueOf(String str) {
                return (ForInstrumentedMethod) Enum.valueOf(ForInstrumentedMethod.class, str);
            }

            public static ForInstrumentedMethod[] values() {
                return (ForInstrumentedMethod[]) f415740e.clone();
            }

            public abstract boolean a(net.bytebuddy.description.method.a aVar);

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                if (a(aVar)) {
                    return new f.e(MethodConstant.p(aVar.i()));
                }
                throw new IllegalStateException("Cannot represent " + aVar + " as given method constant");
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForInstrumentedType implements OffsetMapping {

            /* renamed from: b, reason: collision with root package name */
            public static final ForInstrumentedType f415741b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForInstrumentedType[] f415742c;

            static {
                ForInstrumentedType forInstrumentedType = new ForInstrumentedType("INSTANCE", 0);
                f415741b = forInstrumentedType;
                f415742c = new ForInstrumentedType[]{forInstrumentedType};
            }

            public ForInstrumentedType() {
                throw null;
            }

            public static ForInstrumentedType valueOf(String str) {
                return (ForInstrumentedType) Enum.valueOf(ForInstrumentedType.class, str);
            }

            public static ForInstrumentedType[] values() {
                return (ForInstrumentedType[]) f415742c.clone();
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                return new f.e(ClassConstant.c(typeDescription));
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForOrigin implements OffsetMapping {

            /* renamed from: b, reason: collision with root package name */
            public final List<Renderer> f415743b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Factory implements Factory<o> {

                /* renamed from: b, reason: collision with root package name */
                public static final Factory f415744b;

                /* renamed from: c, reason: collision with root package name */
                public static final a.d f415745c;

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ Factory[] f415746d;

                static {
                    Factory factory = new Factory("INSTANCE", 0);
                    f415744b = factory;
                    f415746d = new Factory[]{factory};
                    f415745c = (a.d) TypeDescription.d.A0(o.class).q().P1(C44411u.x("value")).M2();
                }

                public Factory() {
                    throw null;
                }

                public static Factory valueOf(String str) {
                    return (Factory) Enum.valueOf(Factory.class, str);
                }

                public static Factory[] values() {
                    return (Factory[]) f415746d.clone();
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<o> a() {
                    return o.class;
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final net.bytebuddy.asm.Advice.OffsetMapping b(net.bytebuddy.description.method.c.InterfaceC11982c r8, net.bytebuddy.description.annotation.AnnotationDescription.g<net.bytebuddy.asm.Advice.o> r9, net.bytebuddy.asm.Advice.OffsetMapping.Factory.AdviceType r10) {
                    /*
                        Method dump skipped, instructions count: 414
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Factory.b(net.bytebuddy.description.method.c$c, net.bytebuddy.description.annotation.AnnotationDescription$g, net.bytebuddy.asm.Advice$OffsetMapping$Factory$AdviceType):net.bytebuddy.asm.Advice$OffsetMapping");
                }
            }

            public interface Renderer {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class ForDescriptor implements Renderer {

                    /* renamed from: b, reason: collision with root package name */
                    public static final ForDescriptor f415747b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ ForDescriptor[] f415748c;

                    static {
                        ForDescriptor forDescriptor = new ForDescriptor("INSTANCE", 0);
                        f415747b = forDescriptor;
                        f415748c = new ForDescriptor[]{forDescriptor};
                    }

                    public ForDescriptor() {
                        throw null;
                    }

                    public static ForDescriptor valueOf(String str) {
                        return (ForDescriptor) Enum.valueOf(ForDescriptor.class, str);
                    }

                    public static ForDescriptor[] values() {
                        return (ForDescriptor[]) f415748c.clone();
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public final String a(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                        return aVar.getDescriptor();
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class ForJavaSignature implements Renderer {

                    /* renamed from: b, reason: collision with root package name */
                    public static final ForJavaSignature f415749b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ ForJavaSignature[] f415750c;

                    static {
                        ForJavaSignature forJavaSignature = new ForJavaSignature("INSTANCE", 0);
                        f415749b = forJavaSignature;
                        f415750c = new ForJavaSignature[]{forJavaSignature};
                    }

                    public ForJavaSignature() {
                        throw null;
                    }

                    public static ForJavaSignature valueOf(String str) {
                        return (ForJavaSignature) Enum.valueOf(ForJavaSignature.class, str);
                    }

                    public static ForJavaSignature[] values() {
                        return (ForJavaSignature[]) f415750c.clone();
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public final String a(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                        StringBuilder sb2 = new StringBuilder("(");
                        boolean z12 = false;
                        for (TypeDescription typeDescription2 : aVar.getParameters().p2().f1()) {
                            if (z12) {
                                sb2.append(',');
                            } else {
                                z12 = true;
                            }
                            sb2.append(typeDescription2.getName());
                        }
                        sb2.append(')');
                        return sb2.toString();
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class ForMethodName implements Renderer {

                    /* renamed from: b, reason: collision with root package name */
                    public static final ForMethodName f415751b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ ForMethodName[] f415752c;

                    static {
                        ForMethodName forMethodName = new ForMethodName("INSTANCE", 0);
                        f415751b = forMethodName;
                        f415752c = new ForMethodName[]{forMethodName};
                    }

                    public ForMethodName() {
                        throw null;
                    }

                    public static ForMethodName valueOf(String str) {
                        return (ForMethodName) Enum.valueOf(ForMethodName.class, str);
                    }

                    public static ForMethodName[] values() {
                        return (ForMethodName[]) f415752c.clone();
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public final String a(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                        return aVar.V();
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class ForPropertyName implements Renderer {

                    /* renamed from: b, reason: collision with root package name */
                    public static final ForPropertyName f415753b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ ForPropertyName[] f415754c;

                    static {
                        ForPropertyName forPropertyName = new ForPropertyName("INSTANCE", 0);
                        f415753b = forPropertyName;
                        f415754c = new ForPropertyName[]{forPropertyName};
                    }

                    public ForPropertyName() {
                        throw null;
                    }

                    public static ForPropertyName valueOf(String str) {
                        return (ForPropertyName) Enum.valueOf(ForPropertyName.class, str);
                    }

                    public static ForPropertyName[] values() {
                        return (ForPropertyName[]) f415754c.clone();
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public final String a(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                        return FieldAccessor.FieldNameExtractor.ForBeanProperty.f417231b.a(aVar);
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class ForReturnTypeName implements Renderer {

                    /* renamed from: b, reason: collision with root package name */
                    public static final ForReturnTypeName f415755b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ ForReturnTypeName[] f415756c;

                    static {
                        ForReturnTypeName forReturnTypeName = new ForReturnTypeName("INSTANCE", 0);
                        f415755b = forReturnTypeName;
                        f415756c = new ForReturnTypeName[]{forReturnTypeName};
                    }

                    public ForReturnTypeName() {
                        throw null;
                    }

                    public static ForReturnTypeName valueOf(String str) {
                        return (ForReturnTypeName) Enum.valueOf(ForReturnTypeName.class, str);
                    }

                    public static ForReturnTypeName[] values() {
                        return (ForReturnTypeName[]) f415756c.clone();
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public final String a(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                        return aVar.getReturnType().f5().getName();
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class ForStringRepresentation implements Renderer {

                    /* renamed from: b, reason: collision with root package name */
                    public static final ForStringRepresentation f415757b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ ForStringRepresentation[] f415758c;

                    static {
                        ForStringRepresentation forStringRepresentation = new ForStringRepresentation("INSTANCE", 0);
                        f415757b = forStringRepresentation;
                        f415758c = new ForStringRepresentation[]{forStringRepresentation};
                    }

                    public ForStringRepresentation() {
                        throw null;
                    }

                    public static ForStringRepresentation valueOf(String str) {
                        return (ForStringRepresentation) Enum.valueOf(ForStringRepresentation.class, str);
                    }

                    public static ForStringRepresentation[] values() {
                        return (ForStringRepresentation[]) f415758c.clone();
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public final String a(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                        return aVar.toString();
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class ForTypeName implements Renderer {

                    /* renamed from: b, reason: collision with root package name */
                    public static final ForTypeName f415759b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ ForTypeName[] f415760c;

                    static {
                        ForTypeName forTypeName = new ForTypeName("INSTANCE", 0);
                        f415759b = forTypeName;
                        f415760c = new ForTypeName[]{forTypeName};
                    }

                    public ForTypeName() {
                        throw null;
                    }

                    public static ForTypeName valueOf(String str) {
                        return (ForTypeName) Enum.valueOf(ForTypeName.class, str);
                    }

                    public static ForTypeName[] values() {
                        return (ForTypeName[]) f415760c.clone();
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public final String a(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                        return typeDescription.getName();
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements Renderer {

                    /* renamed from: b, reason: collision with root package name */
                    public final String f415761b;

                    public a(String str) {
                        this.f415761b = str;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public final String a(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                        return this.f415761b;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f415761b.equals(((a) obj).f415761b);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f415761b.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                String a(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription);
            }

            public ForOrigin(List<Renderer> list) {
                this.f415743b = list;
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                StringBuilder sb2 = new StringBuilder();
                Iterator<Renderer> it = this.f415743b.iterator();
                while (it.hasNext()) {
                    sb2.append(it.next().a(aVar, typeDescription));
                }
                String string = sb2.toString();
                return string == null ? new f.e(NullConstant.f418029b) : new f.e(new net.bytebuddy.implementation.bytecode.constant.c(string));
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f415743b.equals(((ForOrigin) obj).f415743b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f415743b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForReturnValue implements OffsetMapping {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription.Generic f415762b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f415763c;

            /* renamed from: d, reason: collision with root package name */
            public final Assigner.Typing f415764d;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Factory implements Factory<p> {

                /* renamed from: b, reason: collision with root package name */
                public static final Factory f415765b;

                /* renamed from: c, reason: collision with root package name */
                public static final a.d f415766c;

                /* renamed from: d, reason: collision with root package name */
                public static final a.d f415767d;

                /* renamed from: e, reason: collision with root package name */
                public static final /* synthetic */ Factory[] f415768e;

                static {
                    Factory factory = new Factory("INSTANCE", 0);
                    f415765b = factory;
                    f415768e = new Factory[]{factory};
                    net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(p.class).q();
                    f415766c = (a.d) bVarQ.P1(C44411u.x("readOnly")).M2();
                    f415767d = (a.d) bVarQ.P1(C44411u.x("typing")).M2();
                }

                public Factory() {
                    throw null;
                }

                public static Factory valueOf(String str) {
                    return (Factory) Enum.valueOf(Factory.class, str);
                }

                public static Factory[] values() {
                    return (Factory[]) f415768e.clone();
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<p> a() {
                    return p.class;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<p> gVar, Factory.AdviceType adviceType) {
                    if (!adviceType.f415703b || ((Boolean) gVar.d(f415766c).b(Boolean.class)).booleanValue()) {
                        return new ForReturnValue(interfaceC11982c.getType(), gVar);
                    }
                    throw new IllegalStateException("Cannot write return value for " + interfaceC11982c + " in read-only context");
                }
            }

            public ForReturnValue(TypeDescription.Generic generic, AnnotationDescription.g<p> gVar) {
                boolean zBooleanValue = ((Boolean) gVar.d(Factory.f415766c).b(Boolean.class)).booleanValue();
                Assigner.Typing typing = (Assigner.Typing) D8.l(p.class, gVar.d(Factory.f415767d), Assigner.Typing.class);
                this.f415762b = generic;
                this.f415763c = zBooleanValue;
                this.f415764d = typing;
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                TypeDescription.Generic returnType = aVar.getReturnType();
                TypeDescription.Generic generic = this.f415762b;
                Assigner.Typing typing = this.f415764d;
                StackManipulation stackManipulationA = bVar.a(returnType, generic, typing);
                if (!stackManipulationA.isValid()) {
                    throw new IllegalStateException("Cannot assign " + aVar.getReturnType() + " to " + generic);
                }
                if (this.f415763c) {
                    return aVar.getReturnType().Q2(Void.TYPE) ? new f.c.a(generic) : new f.AbstractC11933f.a(aVar.getReturnType(), aVar2.i(), stackManipulationA);
                }
                StackManipulation stackManipulationA2 = bVar.a(generic, aVar.getReturnType(), typing);
                if (stackManipulationA2.isValid()) {
                    return aVar.getReturnType().Q2(Void.TYPE) ? new f.c.b(generic) : new f.AbstractC11933f.b(aVar.getReturnType(), aVar2.i(), stackManipulationA, stackManipulationA2);
                }
                throw new IllegalStateException("Cannot assign " + generic + " to " + aVar.getReturnType());
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForReturnValue forReturnValue = (ForReturnValue) obj;
                return this.f415763c == forReturnValue.f415763c && this.f415764d.equals(forReturnValue.f415764d) && this.f415762b.equals(forReturnValue.f415762b);
            }

            public final int hashCode() {
                return this.f415764d.hashCode() + ((D8.i(this.f415762b, getClass().hashCode() * 31, 31) + (this.f415763c ? 1 : 0)) * 31);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForStubValue implements OffsetMapping, Factory<q> {

            /* renamed from: b, reason: collision with root package name */
            public static final ForStubValue f415769b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForStubValue[] f415770c;

            static {
                ForStubValue forStubValue = new ForStubValue("INSTANCE", 0);
                f415769b = forStubValue;
                f415770c = new ForStubValue[]{forStubValue};
            }

            public ForStubValue() {
                throw null;
            }

            public static ForStubValue valueOf(String str) {
                return (ForStubValue) Enum.valueOf(ForStubValue.class, str);
            }

            public static ForStubValue[] values() {
                return (ForStubValue[]) f415770c.clone();
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
            public final Class<q> a() {
                return q.class;
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
            public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<q> gVar, Factory.AdviceType adviceType) {
                if (interfaceC11982c.getType().Q2(Object.class)) {
                    return this;
                }
                throw new IllegalStateException("Cannot use StubValue on non-Object parameter type " + interfaceC11982c);
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                return new f.c.a(aVar.getReturnType(), bVar.a(aVar.getReturnType(), TypeDescription.Generic.f416323x2, Assigner.Typing.DYNAMIC));
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForThisReference implements OffsetMapping {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription.Generic f415771b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f415772c;

            /* renamed from: d, reason: collision with root package name */
            public final Assigner.Typing f415773d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f415774e;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Factory implements Factory<r> {

                /* renamed from: b, reason: collision with root package name */
                public static final Factory f415775b;

                /* renamed from: c, reason: collision with root package name */
                public static final a.d f415776c;

                /* renamed from: d, reason: collision with root package name */
                public static final a.d f415777d;

                /* renamed from: e, reason: collision with root package name */
                public static final a.d f415778e;

                /* renamed from: f, reason: collision with root package name */
                public static final /* synthetic */ Factory[] f415779f;

                static {
                    Factory factory = new Factory("INSTANCE", 0);
                    f415775b = factory;
                    f415779f = new Factory[]{factory};
                    net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(r.class).q();
                    f415776c = (a.d) bVarQ.P1(C44411u.x("readOnly")).M2();
                    f415777d = (a.d) bVarQ.P1(C44411u.x("typing")).M2();
                    f415778e = (a.d) bVarQ.P1(C44411u.x("optional")).M2();
                }

                public Factory() {
                    throw null;
                }

                public static Factory valueOf(String str) {
                    return (Factory) Enum.valueOf(Factory.class, str);
                }

                public static Factory[] values() {
                    return (Factory[]) f415779f.clone();
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<r> a() {
                    return r.class;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<r> gVar, Factory.AdviceType adviceType) {
                    if (!adviceType.f415703b || ((Boolean) gVar.d(f415776c).b(Boolean.class)).booleanValue()) {
                        return new ForThisReference(interfaceC11982c.getType(), gVar);
                    }
                    throw new IllegalStateException("Cannot write to this reference for " + interfaceC11982c + " in read-only context");
                }
            }

            public ForThisReference(TypeDescription.Generic generic, AnnotationDescription.g<r> gVar) {
                boolean zBooleanValue = ((Boolean) gVar.d(Factory.f415776c).b(Boolean.class)).booleanValue();
                Assigner.Typing typing = (Assigner.Typing) D8.l(r.class, gVar.d(Factory.f415777d), Assigner.Typing.class);
                boolean zBooleanValue2 = ((Boolean) gVar.d(Factory.f415778e).b(Boolean.class)).booleanValue();
                this.f415771b = generic;
                this.f415772c = zBooleanValue;
                this.f415773d = typing;
                this.f415774e = zBooleanValue2;
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                boolean zB2 = aVar.b();
                boolean z12 = this.f415772c;
                if (zB2 || sort.a(aVar)) {
                    if (this.f415774e) {
                        return z12 ? new f.c.a(typeDescription) : new f.c.b(typeDescription);
                    }
                    throw new IllegalStateException(D8.m("Cannot map this reference for static method or constructor start: ", aVar));
                }
                TypeDescription.Generic genericP0 = typeDescription.P0();
                TypeDescription.Generic generic = this.f415771b;
                Assigner.Typing typing = this.f415773d;
                StackManipulation stackManipulationA = bVar.a(genericP0, generic, typing);
                if (!stackManipulationA.isValid()) {
                    throw new IllegalStateException("Cannot assign " + typeDescription + " to " + generic);
                }
                if (z12) {
                    return new f.AbstractC11933f.a(typeDescription.P0(), aVar2.d(0), stackManipulationA);
                }
                StackManipulation stackManipulationA2 = bVar.a(generic, typeDescription.P0(), typing);
                if (stackManipulationA2.isValid()) {
                    return new f.AbstractC11933f.b(typeDescription.P0(), aVar2.d(0), stackManipulationA, stackManipulationA2);
                }
                throw new IllegalStateException("Cannot assign " + generic + " to " + typeDescription);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForThisReference forThisReference = (ForThisReference) obj;
                return this.f415772c == forThisReference.f415772c && this.f415774e == forThisReference.f415774e && this.f415773d.equals(forThisReference.f415773d) && this.f415771b.equals(forThisReference.f415771b);
            }

            public final int hashCode() {
                return ((this.f415773d.hashCode() + ((D8.i(this.f415771b, getClass().hashCode() * 31, 31) + (this.f415772c ? 1 : 0)) * 31)) * 31) + (this.f415774e ? 1 : 0);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForThrowable implements OffsetMapping {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription.Generic f415780b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f415781c;

            /* renamed from: d, reason: collision with root package name */
            public final Assigner.Typing f415782d;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Factory implements Factory<s> {

                /* renamed from: b, reason: collision with root package name */
                public static final Factory f415783b;

                /* renamed from: c, reason: collision with root package name */
                public static final a.d f415784c;

                /* renamed from: d, reason: collision with root package name */
                public static final a.d f415785d;

                /* renamed from: e, reason: collision with root package name */
                public static final /* synthetic */ Factory[] f415786e;

                static {
                    Factory factory = new Factory("INSTANCE", 0);
                    f415783b = factory;
                    f415786e = new Factory[]{factory};
                    net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(s.class).q();
                    f415784c = (a.d) bVarQ.P1(C44411u.x("readOnly")).M2();
                    f415785d = (a.d) bVarQ.P1(C44411u.x("typing")).M2();
                }

                public Factory() {
                    throw null;
                }

                @SuppressFBWarnings(justification = "Assuming annotation for exit advice.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public static Factory<?> c(a.d dVar) {
                    return ((TypeDescription) dVar.getDeclaredAnnotations().m6(m.class).d(Advice.f415516l).b(TypeDescription.class)).Q2(j.class) ? new Factory.a(s.class) : f415783b;
                }

                public static Factory valueOf(String str) {
                    return (Factory) Enum.valueOf(Factory.class, str);
                }

                public static Factory[] values() {
                    return (Factory[]) f415786e.clone();
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<s> a() {
                    return s.class;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<s> gVar, Factory.AdviceType adviceType) {
                    if (!adviceType.f415703b || ((Boolean) gVar.d(f415784c).b(Boolean.class)).booleanValue()) {
                        return new ForThrowable(interfaceC11982c.getType(), gVar);
                    }
                    throw new IllegalStateException("Cannot use writable " + interfaceC11982c + " on read-only parameter");
                }
            }

            public ForThrowable(TypeDescription.Generic generic, AnnotationDescription.g<s> gVar) {
                boolean zBooleanValue = ((Boolean) gVar.d(Factory.f415784c).b(Boolean.class)).booleanValue();
                Assigner.Typing typing = (Assigner.Typing) D8.l(s.class, gVar.d(Factory.f415785d), Assigner.Typing.class);
                this.f415780b = generic;
                this.f415781c = zBooleanValue;
                this.f415782d = typing;
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                TypeDescription.d dVar = TypeDescription.f416320D2;
                TypeDescription.Generic genericY0 = TypeDescription.Generic.d.b.y0(dVar.f416504e);
                TypeDescription.Generic generic = this.f415780b;
                Assigner.Typing typing = this.f415782d;
                StackManipulation stackManipulationA = bVar.a(genericY0, generic, typing);
                if (!stackManipulationA.isValid()) {
                    throw new IllegalStateException("Cannot assign Throwable to " + generic);
                }
                if (this.f415781c) {
                    return new f.AbstractC11933f.a(dVar, aVar2.h(), stackManipulationA);
                }
                StackManipulation stackManipulationA2 = bVar.a(generic, TypeDescription.Generic.d.b.y0(dVar.f416504e), typing);
                if (stackManipulationA2.isValid()) {
                    return new f.AbstractC11933f.b(dVar, aVar2.h(), stackManipulationA, stackManipulationA2);
                }
                throw new IllegalStateException("Cannot assign " + generic + " to Throwable");
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForThrowable forThrowable = (ForThrowable) obj;
                return this.f415781c == forThrowable.f415781c && this.f415782d.equals(forThrowable.f415782d) && this.f415780b.equals(forThrowable.f415780b);
            }

            public final int hashCode() {
                return this.f415782d.hashCode() + ((D8.i(this.f415780b, getClass().hashCode() * 31, 31) + (this.f415781c ? 1 : 0)) * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForUnusedValue implements OffsetMapping {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription.Generic f415787b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Factory implements Factory<t> {

                /* renamed from: b, reason: collision with root package name */
                public static final Factory f415788b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ Factory[] f415789c;

                static {
                    Factory factory = new Factory("INSTANCE", 0);
                    f415788b = factory;
                    f415789c = new Factory[]{factory};
                }

                public Factory() {
                    throw null;
                }

                public static Factory valueOf(String str) {
                    return (Factory) Enum.valueOf(Factory.class, str);
                }

                public static Factory[] values() {
                    return (Factory[]) f415789c.clone();
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<t> a() {
                    return t.class;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<t> gVar, Factory.AdviceType adviceType) {
                    return new ForUnusedValue(interfaceC11982c.getType());
                }
            }

            public ForUnusedValue(TypeDescription.Generic generic) {
                this.f415787b = generic;
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                return new f.c.b(this.f415787b);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f415787b.equals(((ForUnusedValue) obj).f415787b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f415787b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class Sort {

            /* renamed from: b, reason: collision with root package name */
            public static final Sort f415790b;

            /* renamed from: c, reason: collision with root package name */
            public static final Sort f415791c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Sort[] f415792d;

            public enum a extends Sort {
                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Sort
                public final boolean a(net.bytebuddy.description.method.a aVar) {
                    return aVar.v0();
                }
            }

            public enum b extends Sort {
                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Sort
                public final boolean a(net.bytebuddy.description.method.a aVar) {
                    return false;
                }
            }

            static {
                a aVar = new a("ENTER", 0, null);
                f415790b = aVar;
                b bVar = new b("EXIT", 1, null);
                f415791c = bVar;
                f415792d = new Sort[]{aVar, bVar};
            }

            public Sort() {
                throw null;
            }

            public Sort(String str, int i12, a aVar) {
            }

            public static Sort valueOf(String str) {
                return (Sort) Enum.valueOf(Sort.class, str);
            }

            public static Sort[] values() {
                return (Sort[]) f415792d.clone();
            }

            public abstract boolean a(net.bytebuddy.description.method.a aVar);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements OffsetMapping {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription.Generic f415793b;

            /* renamed from: c, reason: collision with root package name */
            public final TypeDescription.Generic f415794c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f415795d;

            /* renamed from: e, reason: collision with root package name */
            public final Assigner.Typing f415796e;

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.asm.Advice$OffsetMapping$a$a, reason: collision with other inner class name */
            public static class C11931a implements Factory<f> {

                /* renamed from: c, reason: collision with root package name */
                public static final a.d f415797c;

                /* renamed from: d, reason: collision with root package name */
                public static final a.d f415798d;

                /* renamed from: b, reason: collision with root package name */
                public final TypeDefinition f415799b;

                static {
                    net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(f.class).q();
                    f415797c = (a.d) bVarQ.P1(C44411u.x("readOnly")).M2();
                    f415798d = (a.d) bVarQ.P1(C44411u.x("typing")).M2();
                }

                public C11931a(TypeDefinition typeDefinition) {
                    this.f415799b = typeDefinition;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<f> a() {
                    return f.class;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<f> gVar, Factory.AdviceType adviceType) {
                    if (!adviceType.f415703b || ((Boolean) gVar.d(f415797c).b(Boolean.class)).booleanValue()) {
                        return new a(interfaceC11982c.getType(), this.f415799b.P0(), gVar);
                    }
                    throw new IllegalStateException("Cannot use writable " + interfaceC11982c + " on read-only parameter");
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f415799b.equals(((C11931a) obj).f415799b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f415799b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            public a(TypeDescription.Generic generic, TypeDescription.Generic generic2, AnnotationDescription.g<f> gVar) {
                boolean zBooleanValue = ((Boolean) gVar.d(C11931a.f415797c).b(Boolean.class)).booleanValue();
                Assigner.Typing typing = (Assigner.Typing) D8.l(f.class, gVar.d(C11931a.f415798d), Assigner.Typing.class);
                this.f415793b = generic;
                this.f415794c = generic2;
                this.f415795d = zBooleanValue;
                this.f415796e = typing;
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                TypeDescription.Generic generic = this.f415794c;
                TypeDescription.Generic generic2 = this.f415793b;
                Assigner.Typing typing = this.f415796e;
                StackManipulation stackManipulationA = bVar.a(generic, generic2, typing);
                if (!stackManipulationA.isValid()) {
                    throw new IllegalStateException("Cannot assign " + generic + " to " + generic2);
                }
                if (this.f415795d) {
                    return new f.AbstractC11933f.a(generic2, aVar2.k(), stackManipulationA);
                }
                StackManipulation stackManipulationA2 = bVar.a(generic2, generic, typing);
                if (stackManipulationA2.isValid()) {
                    return new f.AbstractC11933f.b(generic2, aVar2.k(), stackManipulationA, stackManipulationA2);
                }
                throw new IllegalStateException("Cannot assign " + generic2 + " to " + generic);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f415795d == aVar.f415795d && this.f415796e.equals(aVar.f415796e) && this.f415793b.equals(aVar.f415793b) && this.f415794c.equals(aVar.f415794c);
            }

            public final int hashCode() {
                return this.f415796e.hashCode() + ((D8.i(this.f415794c, D8.i(this.f415793b, getClass().hashCode() * 31, 31), 31) + (this.f415795d ? 1 : 0)) * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements OffsetMapping {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription.Generic f415800b;

            /* renamed from: c, reason: collision with root package name */
            public final TypeDescription.Generic f415801c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f415802d;

            /* renamed from: e, reason: collision with root package name */
            public final Assigner.Typing f415803e;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements Factory<g> {

                /* renamed from: c, reason: collision with root package name */
                public static final a.d f415804c;

                /* renamed from: d, reason: collision with root package name */
                public static final a.d f415805d;

                /* renamed from: b, reason: collision with root package name */
                public final TypeDefinition f415806b;

                static {
                    net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(g.class).q();
                    f415804c = (a.d) bVarQ.P1(C44411u.x("readOnly")).M2();
                    f415805d = (a.d) bVarQ.P1(C44411u.x("typing")).M2();
                }

                public a(TypeDefinition typeDefinition) {
                    this.f415806b = typeDefinition;
                }

                public static Factory<g> c(TypeDefinition typeDefinition) {
                    return typeDefinition.Q2(Void.TYPE) ? new Factory.a(g.class) : new a(typeDefinition);
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<g> a() {
                    return g.class;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<g> gVar, Factory.AdviceType adviceType) {
                    if (!adviceType.f415703b || ((Boolean) gVar.d(f415804c).b(Boolean.class)).booleanValue()) {
                        return new b(interfaceC11982c.getType(), this.f415806b.P0(), gVar);
                    }
                    throw new IllegalStateException("Cannot use writable " + interfaceC11982c + " on read-only parameter");
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f415806b.equals(((a) obj).f415806b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f415806b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            public b(TypeDescription.Generic generic, TypeDescription.Generic generic2, AnnotationDescription.g<g> gVar) {
                boolean zBooleanValue = ((Boolean) gVar.d(a.f415804c).b(Boolean.class)).booleanValue();
                Assigner.Typing typing = (Assigner.Typing) D8.l(g.class, gVar.d(a.f415805d), Assigner.Typing.class);
                this.f415800b = generic;
                this.f415801c = generic2;
                this.f415802d = zBooleanValue;
                this.f415803e = typing;
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                TypeDescription.Generic generic = this.f415801c;
                TypeDescription.Generic generic2 = this.f415800b;
                Assigner.Typing typing = this.f415803e;
                StackManipulation stackManipulationA = bVar.a(generic, generic2, typing);
                if (!stackManipulationA.isValid()) {
                    throw new IllegalStateException("Cannot assign " + generic + " to " + generic2);
                }
                if (this.f415802d) {
                    return new f.AbstractC11933f.a(generic2, aVar2.f(), stackManipulationA);
                }
                StackManipulation stackManipulationA2 = bVar.a(generic2, generic, typing);
                if (stackManipulationA2.isValid()) {
                    return new f.AbstractC11933f.b(generic2, aVar2.f(), stackManipulationA, stackManipulationA2);
                }
                throw new IllegalStateException("Cannot assign " + generic2 + " to " + generic);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f415802d == bVar.f415802d && this.f415803e.equals(bVar.f415803e) && this.f415800b.equals(bVar.f415800b) && this.f415801c.equals(bVar.f415801c);
            }

            public final int hashCode() {
                return this.f415803e.hashCode() + ((D8.i(this.f415801c, D8.i(this.f415800b, getClass().hashCode() * 31, 31), 31) + (this.f415802d ? 1 : 0)) * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements OffsetMapping {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription.Generic f415807b;

            /* renamed from: c, reason: collision with root package name */
            public final TypeDescription.Generic f415808c;

            /* renamed from: d, reason: collision with root package name */
            public final String f415809d;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements Factory<i> {

                /* renamed from: c, reason: collision with root package name */
                public static final a.d f415810c = (a.d) TypeDescription.d.A0(i.class).q().P1(C44411u.x("value")).M2();

                /* renamed from: b, reason: collision with root package name */
                public final Map<String, TypeDefinition> f415811b;

                public a(Map<String, TypeDefinition> map) {
                    this.f415811b = map;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<i> a() {
                    return i.class;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<i> gVar, Factory.AdviceType adviceType) {
                    String str = (String) gVar.d(f415810c).b(String.class);
                    TypeDefinition typeDefinition = this.f415811b.get(str);
                    if (typeDefinition != null) {
                        return new c(interfaceC11982c.getType(), typeDefinition.P0(), str);
                    }
                    throw new IllegalStateException(G.f("Named local variable is unknown: ", str));
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f415811b.equals(((a) obj).f415811b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f415811b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            public c(TypeDescription.Generic generic, TypeDescription.Generic generic2, String str) {
                this.f415807b = generic;
                this.f415808c = generic2;
                this.f415809d = str;
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                Assigner.Typing typing = Assigner.Typing.STATIC;
                TypeDescription.Generic generic = this.f415808c;
                TypeDescription.Generic generic2 = this.f415807b;
                StackManipulation stackManipulationA = bVar.a(generic, generic2, typing);
                StackManipulation stackManipulationA2 = bVar.a(generic2, generic, typing);
                if (stackManipulationA.isValid() && stackManipulationA2.isValid()) {
                    return new f.AbstractC11933f.b(generic2, aVar2.e(this.f415809d), stackManipulationA, stackManipulationA2);
                }
                throw new IllegalStateException("Cannot assign " + generic + " to " + generic2);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f415809d.equals(cVar.f415809d) && this.f415807b.equals(cVar.f415807b) && this.f415808c.equals(cVar.f415808c);
            }

            public final int hashCode() {
                return this.f415809d.hashCode() + D8.i(this.f415808c, D8.i(this.f415807b, getClass().hashCode() * 31, 31), 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class d implements OffsetMapping {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription.Generic f415812b;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a<T extends Annotation> implements Factory<T> {
                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<T> a() {
                    return null;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<T> gVar, Factory.AdviceType adviceType) {
                    return new d(interfaceC11982c.getType());
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

            public d(TypeDescription.Generic generic) {
                this.f415812b = generic;
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                throw null;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                if (this.f415812b.equals(((d) obj).f415812b)) {
                    throw null;
                }
                return false;
            }

            public final int hashCode() {
                getClass().hashCode();
                this.f415812b.hashCode();
                throw null;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class e implements OffsetMapping {

            /* renamed from: b, reason: collision with root package name */
            public final StackManipulation f415813b;

            /* renamed from: c, reason: collision with root package name */
            public final TypeDescription.Generic f415814c;

            /* renamed from: d, reason: collision with root package name */
            public final TypeDescription.Generic f415815d;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a<T extends Annotation> implements Factory<T> {

                /* renamed from: b, reason: collision with root package name */
                public final Class<T> f415816b;

                /* renamed from: c, reason: collision with root package name */
                public final StackManipulation f415817c;

                /* renamed from: d, reason: collision with root package name */
                public final TypeDescription.Generic f415818d;

                public a() {
                    throw null;
                }

                public a(Class<T> cls, StackManipulation stackManipulation, TypeDescription.Generic generic) {
                    this.f415816b = cls;
                    this.f415817c = stackManipulation;
                    this.f415818d = generic;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<T> a() {
                    return this.f415816b;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<T> gVar, Factory.AdviceType adviceType) {
                    return new e(this.f415817c, this.f415818d, interfaceC11982c.getType());
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f415816b.equals(aVar.f415816b) && this.f415817c.equals(aVar.f415817c) && this.f415818d.equals(aVar.f415818d);
                }

                public final int hashCode() {
                    return this.f415818d.hashCode() + ((this.f415817c.hashCode() + ((this.f415816b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b<T extends Annotation> implements Factory<T> {
                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<T> a() {
                    return null;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<T> gVar, Factory.AdviceType adviceType) {
                    gVar.d(null);
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
            public static class c<T extends Annotation> implements Factory<T> {

                /* renamed from: b, reason: collision with root package name */
                public final Class<T> f415819b;

                public c(Class<T> cls) {
                    this.f415819b = cls;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<T> a() {
                    return this.f415819b;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<T> gVar, Factory.AdviceType adviceType) {
                    return new e(DefaultValue.c(interfaceC11982c.getType()), interfaceC11982c.getType(), interfaceC11982c.getType());
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f415819b.equals(((c) obj).f415819b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f415819b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class d<T extends Annotation> implements Factory<T> {
                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final Class<T> a() {
                    return null;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.Factory
                public final OffsetMapping b(c.InterfaceC11982c interfaceC11982c, AnnotationDescription.g<T> gVar, Factory.AdviceType adviceType) {
                    if (!interfaceC11982c.getType().E()) {
                        throw new IllegalArgumentException(interfaceC11982c.getType() + " is not an interface");
                    }
                    if (!interfaceC11982c.getType().J0().isEmpty()) {
                        throw new IllegalArgumentException(interfaceC11982c.getType() + " must not extend other interfaces");
                    }
                    if (!interfaceC11982c.getType().e0()) {
                        throw new IllegalArgumentException(interfaceC11982c.getType() + " is mot public");
                    }
                    if (interfaceC11982c.getType().q().P1(ModifierMatcher.Mode.ABSTRACT.f418407d).size() == 1) {
                        MethodInvocation.a(null);
                        throw null;
                    }
                    throw new IllegalArgumentException(interfaceC11982c.getType() + " must declare exactly one abstract method");
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

            public e(StackManipulation stackManipulation, TypeDescription.Generic generic, TypeDescription.Generic generic2) {
                this.f415813b = stackManipulation;
                this.f415814c = generic;
                this.f415815d = generic2;
            }

            @Override // net.bytebuddy.asm.Advice.OffsetMapping
            public final f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort) {
                Assigner.Typing typing = Assigner.Typing.STATIC;
                TypeDescription.Generic generic = this.f415814c;
                TypeDescription.Generic generic2 = this.f415815d;
                StackManipulation stackManipulationA = bVar.a(generic, generic2, typing);
                if (stackManipulationA.isValid()) {
                    return new f.e(new StackManipulation.b(this.f415813b, stackManipulationA));
                }
                throw new IllegalStateException("Cannot assign " + generic + " to " + generic2);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                e eVar = (e) obj;
                Object obj2 = Assigner.Typing.STATIC;
                return obj2.equals(obj2) && this.f415813b.equals(eVar.f415813b) && this.f415814c.equals(eVar.f415814c) && this.f415815d.equals(eVar.f415815d);
            }

            public final int hashCode() {
                return Assigner.Typing.STATIC.hashCode() + D8.i(this.f415815d, D8.i(this.f415814c, (this.f415813b.hashCode() + (getClass().hashCode() * 31)) * 31, 31), 31);
            }
        }

        public interface f {

            public static abstract class a implements f {
                @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                public final StackManipulation a() {
                    throw new IllegalStateException("Cannot write to read-only value");
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                public final StackManipulation c(int i12) {
                    throw new IllegalStateException("Cannot write to read-only value");
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class b implements f {

                /* renamed from: a, reason: collision with root package name */
                public final TypeDescription.Generic f415820a;

                /* renamed from: b, reason: collision with root package name */
                public final ArrayList f415821b;

                public static class a extends b {
                    public a() {
                        throw null;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation a() {
                        throw new IllegalStateException("Cannot write to read-only array value");
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.asm.Advice$OffsetMapping$f$b$b, reason: collision with other inner class name */
                public static class C11932b extends b {

                    /* renamed from: c, reason: collision with root package name */
                    public final ArrayList f415822c;

                    public C11932b(TypeDescription.Generic generic, ArrayList arrayList, ArrayList arrayList2) {
                        super(generic, arrayList);
                        this.f415822c = arrayList2;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation a() {
                        return new StackManipulation.b(ArrayAccess.b(this.f415820a).a(this.f415822c), Removal.f417810e);
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f.b
                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f415822c.equals(((C11932b) obj).f415822c);
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f.b
                    public final int hashCode() {
                        return this.f415822c.hashCode() + (super.hashCode() * 31);
                    }
                }

                public b(TypeDescription.Generic generic, ArrayList arrayList) {
                    this.f415820a = generic;
                    this.f415821b = arrayList;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                public final StackManipulation b() {
                    return ArrayFactory.a(this.f415820a).new a(this.f415821b);
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                public final StackManipulation c(int i12) {
                    throw new IllegalStateException("Cannot increment read-only array value");
                }

                public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.f415820a.equals(bVar.f415820a) && this.f415821b.equals(bVar.f415821b);
                }

                public int hashCode() {
                    return this.f415821b.hashCode() + D8.i(this.f415820a, getClass().hashCode() * 31, 31);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class c implements f {

                /* renamed from: a, reason: collision with root package name */
                public final TypeDefinition f415823a;

                /* renamed from: b, reason: collision with root package name */
                public final StackManipulation f415824b;

                public static class a extends c {
                    public a(TypeDefinition typeDefinition) {
                        super(typeDefinition, StackManipulation.Trivial.f417829b);
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation a() {
                        throw new IllegalStateException("Cannot write to read-only default value");
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation c(int i12) {
                        throw new IllegalStateException("Cannot write to read-only default value");
                    }
                }

                public static class b extends c {
                    public b(TypeDefinition typeDefinition) {
                        super(typeDefinition, StackManipulation.Trivial.f417829b);
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation a() {
                        return Removal.c(this.f415823a);
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation c(int i12) {
                        return StackManipulation.Trivial.f417829b;
                    }
                }

                public c(TypeDefinition typeDefinition, StackManipulation stackManipulation) {
                    this.f415823a = typeDefinition;
                    this.f415824b = stackManipulation;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                public final StackManipulation b() {
                    return new StackManipulation.b(DefaultValue.c(this.f415823a), this.f415824b);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return this.f415823a.equals(cVar.f415823a) && this.f415824b.equals(cVar.f415824b);
                }

                public final int hashCode() {
                    return this.f415824b.hashCode() + ((this.f415823a.hashCode() + (getClass().hashCode() * 31)) * 31);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class d implements f {

                /* renamed from: a, reason: collision with root package name */
                public final net.bytebuddy.description.field.a f415825a;

                /* renamed from: b, reason: collision with root package name */
                public final StackManipulation f415826b;

                public static class a extends d {
                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation a() {
                        throw new IllegalStateException("Cannot write to read-only field value");
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation c(int i12) {
                        throw new IllegalStateException("Cannot write to read-only field value");
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class b extends d {

                    /* renamed from: c, reason: collision with root package name */
                    public final StackManipulation f415827c;

                    public b(net.bytebuddy.description.field.a aVar, StackManipulation stackManipulation, StackManipulation stackManipulation2) {
                        super(aVar, stackManipulation);
                        this.f415827c = stackManipulation2;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation a() {
                        net.bytebuddy.description.field.a aVar = this.f415825a;
                        return new StackManipulation.b(this.f415827c, aVar.b() ? StackManipulation.Trivial.f417829b : new StackManipulation.b(MethodVariableAccess.c(), Duplication.f417792d.c(aVar.getType()), Removal.f417810e), FieldAccess.c(aVar).a());
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation c(int i12) {
                        return new StackManipulation.b(b(), IntegerConstant.c(i12), Addition.f417785d, a());
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f.d
                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f415827c.equals(((b) obj).f415827c);
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f.d
                    public final int hashCode() {
                        return this.f415827c.hashCode() + (super.hashCode() * 31);
                    }
                }

                public d(net.bytebuddy.description.field.a aVar, StackManipulation stackManipulation) {
                    this.f415825a = aVar;
                    this.f415826b = stackManipulation;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                public final StackManipulation b() {
                    net.bytebuddy.description.field.a aVar = this.f415825a;
                    return new StackManipulation.b(aVar.b() ? StackManipulation.Trivial.f417829b : MethodVariableAccess.c(), FieldAccess.c(aVar).read(), this.f415826b);
                }

                public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return this.f415825a.equals(dVar.f415825a) && this.f415826b.equals(dVar.f415826b);
                }

                public int hashCode() {
                    return this.f415826b.hashCode() + ((this.f415825a.hashCode() + (getClass().hashCode() * 31)) * 31);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class e implements f {

                /* renamed from: a, reason: collision with root package name */
                public final StackManipulation f415828a;

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements f {

                    /* renamed from: a, reason: collision with root package name */
                    public final Removal f415829a;

                    public a(Removal removal) {
                        this.f415829a = removal;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation a() {
                        return this.f415829a;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation b() {
                        return NullConstant.f418029b;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation c(int i12) {
                        throw new IllegalStateException("Cannot increment mutable constant value: " + this.f415829a);
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        a aVar = (a) obj;
                        Object obj2 = NullConstant.f418029b;
                        return obj2.equals(obj2) && this.f415829a.equals(aVar.f415829a);
                    }

                    public final int hashCode() {
                        return this.f415829a.hashCode() + ((NullConstant.f418029b.hashCode() + (getClass().hashCode() * 31)) * 31);
                    }
                }

                public e(StackManipulation stackManipulation) {
                    this.f415828a = stackManipulation;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                public final StackManipulation a() {
                    throw new IllegalStateException("Cannot write to constant value: " + this.f415828a);
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                public final StackManipulation b() {
                    return this.f415828a;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                public final StackManipulation c(int i12) {
                    throw new IllegalStateException("Cannot write to constant value: " + this.f415828a);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f415828a.equals(((e) obj).f415828a);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f415828a.hashCode() + (getClass().hashCode() * 31);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.asm.Advice$OffsetMapping$f$f, reason: collision with other inner class name */
            public static abstract class AbstractC11933f implements f {

                /* renamed from: a, reason: collision with root package name */
                public final TypeDefinition f415830a;

                /* renamed from: b, reason: collision with root package name */
                public final int f415831b;

                /* renamed from: c, reason: collision with root package name */
                public final StackManipulation f415832c;

                /* renamed from: net.bytebuddy.asm.Advice$OffsetMapping$f$f$a */
                public static class a extends AbstractC11933f {
                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation a() {
                        throw new IllegalStateException("Cannot write to read-only parameter " + this.f415830a + " at " + this.f415831b);
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation c(int i12) {
                        throw new IllegalStateException("Cannot write to read-only variable " + this.f415830a + " at " + this.f415831b);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.asm.Advice$OffsetMapping$f$f$b */
                public static class b extends AbstractC11933f {

                    /* renamed from: d, reason: collision with root package name */
                    public final StackManipulation f415833d;

                    public b(TypeDefinition typeDefinition, int i12, StackManipulation stackManipulation, StackManipulation stackManipulation2) {
                        super(typeDefinition, i12, stackManipulation);
                        this.f415833d = stackManipulation2;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation a() {
                        return new StackManipulation.b(this.f415833d, MethodVariableAccess.d(this.f415830a).new c(this.f415831b));
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                    public final StackManipulation c(int i12) {
                        Class cls = Integer.TYPE;
                        TypeDefinition typeDefinition = this.f415830a;
                        if (!typeDefinition.Q2(cls)) {
                            return new StackManipulation.b(b(), IntegerConstant.c(1), Addition.f417785d, a());
                        }
                        MethodVariableAccess methodVariableAccessD = MethodVariableAccess.d(typeDefinition);
                        if (methodVariableAccessD == MethodVariableAccess.f418080e) {
                            return new MethodVariableAccess.a(this.f415831b, i12);
                        }
                        throw new IllegalStateException("Cannot increment type: " + methodVariableAccessD);
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f.AbstractC11933f
                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f415833d.equals(((b) obj).f415833d);
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.asm.Advice.OffsetMapping.f.AbstractC11933f
                    public final int hashCode() {
                        return this.f415833d.hashCode() + (super.hashCode() * 31);
                    }
                }

                public AbstractC11933f(TypeDefinition typeDefinition, int i12, StackManipulation stackManipulation) {
                    this.f415830a = typeDefinition;
                    this.f415831b = i12;
                    this.f415832c = stackManipulation;
                }

                @Override // net.bytebuddy.asm.Advice.OffsetMapping.f
                public final StackManipulation b() {
                    return new StackManipulation.b(MethodVariableAccess.d(this.f415830a).new b(this.f415831b), this.f415832c);
                }

                public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    AbstractC11933f abstractC11933f = (AbstractC11933f) obj;
                    return this.f415831b == abstractC11933f.f415831b && this.f415830a.equals(abstractC11933f.f415830a) && this.f415832c.equals(abstractC11933f.f415832c);
                }

                public int hashCode() {
                    return this.f415832c.hashCode() + ((((this.f415830a.hashCode() + (getClass().hashCode() * 31)) * 31) + this.f415831b) * 31);
                }
            }

            StackManipulation a();

            StackManipulation b();

            StackManipulation c(int i12);
        }

        f c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.a aVar2, Sort sort);
    }

    public interface PostProcessor {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements PostProcessor, b {

            /* renamed from: b, reason: collision with root package name */
            public static final NoOp f415834b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f415835c;

            static {
                NoOp noOp = new NoOp("INSTANCE", 0);
                f415834b = noOp;
                f415835c = new NoOp[]{noOp};
            }

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f415835c.clone();
            }

            @Override // net.bytebuddy.asm.Advice.PostProcessor
            public final StackManipulation a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler argumentHandler, StackMapFrameHandler.c cVar, StackManipulation stackManipulation) {
                return StackManipulation.Trivial.f417829b;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements PostProcessor {
            public a() {
                throw null;
            }

            @Override // net.bytebuddy.asm.Advice.PostProcessor
            public final StackManipulation a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler argumentHandler, StackMapFrameHandler.c cVar, StackManipulation stackManipulation) {
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

        public interface b {

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements b {
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
        }

        StackManipulation a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler argumentHandler, StackMapFrameHandler.c cVar, StackManipulation stackManipulation);
    }

    /* JADX WARN: Method from annotation default annotation not found: nullIfEmpty */
    /* JADX WARN: Method from annotation default annotation not found: readOnly */
    /* JADX WARN: Method from annotation default annotation not found: typing */
    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
    }

    /* JADX WARN: Method from annotation default annotation not found: optional */
    /* JADX WARN: Method from annotation default annotation not found: readOnly */
    /* JADX WARN: Method from annotation default annotation not found: typing */
    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    /* JADX WARN: Method from annotation default annotation not found: readOnly */
    /* JADX WARN: Method from annotation default annotation not found: typing */
    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface f {
    }

    /* JADX WARN: Method from annotation default annotation not found: readOnly */
    /* JADX WARN: Method from annotation default annotation not found: typing */
    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface g {
    }

    /* JADX WARN: Method from annotation default annotation not found: declaringType */
    /* JADX WARN: Method from annotation default annotation not found: readOnly */
    /* JADX WARN: Method from annotation default annotation not found: typing */
    /* JADX WARN: Method from annotation default annotation not found: value */
    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface h {
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface i {
    }

    public static class j extends Throwable {

        /* renamed from: b, reason: collision with root package name */
        public static final TypeDescription f415880b = TypeDescription.d.A0(j.class);
        private static final long serialVersionUID = 1;

        public j() {
            throw new UnsupportedOperationException("This class only serves as a marker type and should not be instantiated");
        }
    }

    public static final class k {
        public k() {
            throw new UnsupportedOperationException("This class only serves as a marker type and should not be instantiated");
        }
    }

    /* JADX WARN: Method from annotation default annotation not found: inline */
    /* JADX WARN: Method from annotation default annotation not found: prependLineNumber */
    /* JADX WARN: Method from annotation default annotation not found: skipOn */
    /* JADX WARN: Method from annotation default annotation not found: suppress */
    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface l {
    }

    /* JADX WARN: Method from annotation default annotation not found: backupArguments */
    /* JADX WARN: Method from annotation default annotation not found: inline */
    /* JADX WARN: Method from annotation default annotation not found: onThrowable */
    /* JADX WARN: Method from annotation default annotation not found: repeatOn */
    /* JADX WARN: Method from annotation default annotation not found: suppress */
    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface m {
    }

    public static final class n {
        public n() {
            throw new UnsupportedOperationException("This class only serves as a marker type and should not be instantiated");
        }
    }

    /* JADX WARN: Method from annotation default annotation not found: value */
    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface o {
    }

    /* JADX WARN: Method from annotation default annotation not found: readOnly */
    /* JADX WARN: Method from annotation default annotation not found: typing */
    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface p {
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface q {
    }

    /* JADX WARN: Method from annotation default annotation not found: optional */
    /* JADX WARN: Method from annotation default annotation not found: readOnly */
    /* JADX WARN: Method from annotation default annotation not found: typing */
    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface r {
    }

    /* JADX WARN: Method from annotation default annotation not found: readOnly */
    /* JADX WARN: Method from annotation default annotation not found: typing */
    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface s {
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface t {
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class u {

        /* renamed from: a, reason: collision with root package name */
        public final PostProcessor.NoOp f415881a;

        /* renamed from: b, reason: collision with root package name */
        public final Delegator.ForStaticInvocation f415882b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<Class<? extends Annotation>, OffsetMapping.Factory<?>> f415883c;

        public u() {
            this(PostProcessor.NoOp.f415834b, Collections.emptyMap(), Delegator.ForStaticInvocation.f415582b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final u a(Class cls, String str) {
            StackManipulation javaConstantValue;
            TypeDescription typeDescriptionT;
            JavaConstantValue javaConstantValue2;
            OffsetMapping.Factory<?> aVar;
            if (str == 0) {
                aVar = new OffsetMapping.e.c<>(cls);
            } else {
                if (str instanceof String) {
                    javaConstantValue = new net.bytebuddy.implementation.bytecode.constant.c(str);
                    typeDescriptionT = TypeDescription.f416318B2;
                } else if (str instanceof TypeDescription) {
                    javaConstantValue = ClassConstant.c((TypeDescription) str);
                    typeDescriptionT = TypeDescription.f416319C2;
                } else if (str instanceof net.bytebuddy.description.enumeration.a) {
                    net.bytebuddy.description.enumeration.a aVar2 = (net.bytebuddy.description.enumeration.a) str;
                    javaConstantValue = FieldAccess.a(aVar2);
                    typeDescriptionT = aVar2.w();
                } else {
                    JavaType javaType = JavaType.f418902f;
                    if (javaType.b(str)) {
                        javaConstantValue2 = new JavaConstantValue(JavaConstant.MethodHandle.b(str));
                        typeDescriptionT = javaType.f418912b;
                    } else {
                        JavaType javaType2 = JavaType.f418903g;
                        if (javaType2.b(str)) {
                            javaConstantValue2 = new JavaConstantValue(JavaConstant.c.b(str));
                            typeDescriptionT = javaType2.f418912b;
                        } else {
                            if (!(str instanceof JavaConstant)) {
                                throw new IllegalStateException(androidx.camera.view.k.a(str, "Not a constant value: "));
                            }
                            JavaConstant javaConstant = (JavaConstant) str;
                            javaConstantValue = new JavaConstantValue(javaConstant);
                            typeDescriptionT = javaConstant.t();
                        }
                    }
                    javaConstantValue = javaConstantValue2;
                }
                aVar = new OffsetMapping.e.a(cls, javaConstantValue, typeDescriptionT.P0());
            }
            return b(aVar);
        }

        public final u b(OffsetMapping.Factory<?> factory) {
            HashMap map = new HashMap(this.f415883c);
            if (!factory.a().isAnnotation()) {
                throw new IllegalArgumentException("Not an annotation type: " + factory.a());
            }
            if (map.put(factory.a(), factory) == null) {
                return new u(this.f415881a, map, this.f415882b);
            }
            throw new IllegalArgumentException("Annotation type already mapped: " + factory.a());
        }

        public final Advice c(Class<?> cls) {
            return d(TypeDescription.d.A0(cls), ClassFileLocator.ForClassLoader.b(cls.getClassLoader()));
        }

        public final Advice d(TypeDescription typeDescription, ClassFileLocator.ForClassLoader forClassLoader) {
            PostProcessor.NoOp noOp = this.f415881a;
            ArrayList arrayList = new ArrayList(this.f415883c.values());
            a.d dVar = Advice.f415511g;
            Dispatcher.e eVarG = Dispatcher.Inactive.f415584b;
            Dispatcher.e eVarG2 = eVarG;
            for (a.d dVar2 : typeDescription.q()) {
                a.d dVar3 = Advice.f415513i;
                Delegator.ForStaticInvocation forStaticInvocation = this.f415882b;
                eVarG = Advice.g(l.class, dVar3, eVarG, dVar2, forStaticInvocation);
                eVarG2 = Advice.g(m.class, Advice.f415518n, eVarG2, dVar2, forStaticInvocation);
            }
            if (!eVarG.c() && !eVarG2.c()) {
                throw new IllegalArgumentException(D8.o("No advice defined by ", typeDescription));
            }
            try {
                net.bytebuddy.jar.asm.e eVarA = (eVarG.m() || eVarG2.m()) ? net.bytebuddy.utility.e.a(ClassFileLocator.ForClassLoader.a(forClassLoader.f416566b, typeDescription.getName()).a()) : null;
                return new Advice(eVarG.l(arrayList, eVarA, eVarG2, noOp), eVarG2.e(arrayList, eVarA, eVarG, noOp));
            } catch (IOException e12) {
                throw new IllegalStateException(D8.o("Error reading class file of ", typeDescription), e12);
            }
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            u uVar = (u) obj;
            return this.f415881a.equals(uVar.f415881a) && this.f415882b.equals(uVar.f415882b) && this.f415883c.equals(uVar.f415883c);
        }

        public final int hashCode() {
            return this.f415883c.hashCode() + ((this.f415882b.hashCode() + ((this.f415881a.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31);
        }

        public u(PostProcessor.NoOp noOp, Map map, Delegator.ForStaticInvocation forStaticInvocation) {
            this.f415881a = noOp;
            this.f415883c = map;
            this.f415882b = forStaticInvocation;
        }
    }

    static {
        net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(l.class).q();
        f415511g = (a.d) bVarQ.P1(C44411u.x("skipOn")).M2();
        f415512h = (a.d) bVarQ.P1(C44411u.x("prependLineNumber")).M2();
        f415513i = (a.d) bVarQ.P1(C44411u.x("inline")).M2();
        f415514j = (a.d) bVarQ.P1(C44411u.x("suppress")).M2();
        net.bytebuddy.description.method.b<a.d> bVarQ2 = TypeDescription.d.A0(m.class).q();
        f415515k = (a.d) bVarQ2.P1(C44411u.x("repeatOn")).M2();
        f415516l = (a.d) bVarQ2.P1(C44411u.x("onThrowable")).M2();
        f415517m = (a.d) bVarQ2.P1(C44411u.x("backupArguments")).M2();
        f415518n = (a.d) bVarQ2.P1(C44411u.x("inline")).M2();
        f415519o = (a.d) bVarQ2.P1(C44411u.x("suppress")).M2();
    }

    public Advice(Dispatcher.d.b bVar, Dispatcher.d.c cVar) {
        ExceptionHandler.Default r02 = ExceptionHandler.Default.f415685b;
        net.bytebuddy.implementation.bytecode.assign.primitive.b bVar2 = Assigner.f417851M2;
        SuperMethodCall superMethodCall = SuperMethodCall.f417447b;
        this.f415520b = bVar;
        this.f415521c = cVar;
        this.f415522d = bVar2;
        this.f415523e = r02;
        this.f415524f = superMethodCall;
    }

    public static Dispatcher.e g(Class cls, a.d dVar, Dispatcher.e eVar, a.d dVar2, Delegator.ForStaticInvocation forStaticInvocation) {
        AnnotationDescription.g gVarM6 = dVar2.getDeclaredAnnotations().m6(cls);
        if (gVarM6 == null) {
            return eVar;
        }
        if (eVar.c()) {
            throw new IllegalStateException("Duplicate advice for " + eVar + " and " + dVar2);
        }
        if (dVar2.b()) {
            return ((Boolean) gVarM6.d(dVar).b(Boolean.class)).booleanValue() ? new Dispatcher.c(dVar2) : new Dispatcher.b(dVar2, forStaticInvocation);
        }
        throw new IllegalStateException("Advice for " + dVar2 + " is not static");
    }

    public static u h() {
        return new u();
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper.d.c
    public final net.bytebuddy.jar.asm.s a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.jar.asm.s sVar, Implementation.Context context, TypePool typePool, int i12, int i13) {
        return (aVar.isAbstract() || aVar.m0()) ? sVar : d(typeDescription, aVar, sVar, context, i12, i13);
    }

    public final b d(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.jar.asm.s sVar, Implementation.Context context, int i12, int i13) {
        net.bytebuddy.jar.asm.s bVar = this.f415520b.d() ? new net.bytebuddy.utility.visitor.b(sVar) : sVar;
        Dispatcher.d.c cVar = this.f415521c;
        boolean zC2 = cVar.c();
        net.bytebuddy.implementation.bytecode.assign.primitive.b bVar2 = this.f415522d;
        ExceptionHandler.Default r22 = this.f415523e;
        if (!zC2) {
            return new b.C11936b(bVar, context, bVar2, r22.a(), typeDescription, aVar, this.f415520b, Dispatcher.Inactive.f415584b, Collections.emptyList(), i12, i13);
        }
        if (cVar.n().Q2(j.class)) {
            return new b.a.C11935b(bVar, context, bVar2, r22.a(), typeDescription, aVar, this.f415520b, this.f415521c, aVar.getReturnType().Q2(Void.TYPE) ? Collections.emptyList() : Collections.singletonList(aVar.getReturnType().f5()), i12, i13);
        }
        if (aVar.v0()) {
            throw new IllegalStateException(D8.m("Cannot catch exception during constructor call for ", aVar));
        }
        return new b.a.C11934a(bVar, context, bVar2, r22.a(), typeDescription, aVar, this.f415520b, cVar, i12, i13, cVar.n());
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public final InstrumentedType e(InstrumentedType instrumentedType) {
        this.f415524f.getClass();
        return instrumentedType;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Advice advice = (Advice) obj;
        return this.f415520b.equals(advice.f415520b) && this.f415521c.equals(advice.f415521c) && this.f415522d.equals(advice.f415522d) && this.f415523e.equals(advice.f415523e) && this.f415524f.equals(advice.f415524f);
    }

    public final int hashCode() {
        return this.f415524f.hashCode() + ((this.f415523e.hashCode() + ((this.f415522d.hashCode() + ((this.f415521c.hashCode() + ((this.f415520b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // net.bytebuddy.implementation.Implementation
    public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
        return new d(this, target, this.f415524f.i(target));
    }

    public interface Dispatcher {

        public interface a {
            void a();

            void apply();

            void prepare();
        }

        public interface d extends Dispatcher {

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class a implements d {

                /* renamed from: b, reason: collision with root package name */
                public final a.d f415680b;

                /* renamed from: c, reason: collision with root package name */
                public final PostProcessor f415681c;

                /* renamed from: d, reason: collision with root package name */
                public final LinkedHashMap f415682d;

                /* renamed from: e, reason: collision with root package name */
                public final SuppressionHandler f415683e;

                /* renamed from: f, reason: collision with root package name */
                public final RelocationHandler f415684f;

                public a(a.d dVar, PostProcessor postProcessor, ArrayList arrayList, TypeDescription typeDescription, TypeDescription typeDescription2, OffsetMapping.Factory.AdviceType adviceType) {
                    RelocationHandler bVar;
                    this.f415680b = dVar;
                    this.f415681c = postProcessor;
                    HashMap map = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        OffsetMapping.Factory factory = (OffsetMapping.Factory) it.next();
                        map.put(TypeDescription.d.A0(factory.a()), factory);
                    }
                    this.f415682d = new LinkedHashMap();
                    Iterator<?> it2 = dVar.getParameters().iterator();
                    while (it2.hasNext()) {
                        c.InterfaceC11982c interfaceC11982c = (c.InterfaceC11982c) it2.next();
                        OffsetMapping unresolved = null;
                        for (AnnotationDescription annotationDescription : interfaceC11982c.getDeclaredAnnotations()) {
                            OffsetMapping.Factory factory2 = (OffsetMapping.Factory) map.get(annotationDescription.a());
                            if (factory2 != null) {
                                OffsetMapping offsetMappingB = factory2.b(interfaceC11982c, annotationDescription.c(factory2.a()), adviceType);
                                if (unresolved != null) {
                                    throw new IllegalStateException(interfaceC11982c + " is bound to both " + offsetMappingB + " and " + unresolved);
                                }
                                unresolved = offsetMappingB;
                            }
                        }
                        LinkedHashMap linkedHashMap = this.f415682d;
                        Integer numValueOf = Integer.valueOf(interfaceC11982c.getOffset());
                        if (unresolved == null) {
                            unresolved = new OffsetMapping.ForArgument.Unresolved(interfaceC11982c.getType(), true, Assigner.Typing.STATIC, interfaceC11982c.getIndex(), false);
                        }
                        linkedHashMap.put(numValueOf, unresolved);
                    }
                    this.f415683e = typeDescription.Q2(j.class) ? SuppressionHandler.NoOp.f415608b : new SuppressionHandler.b(typeDescription);
                    TypeDescription.Generic returnType = dVar.getReturnType();
                    if (typeDescription2.Q2(Void.TYPE)) {
                        bVar = RelocationHandler.Disabled.f415586b;
                    } else if (typeDescription2.Q2(k.class)) {
                        bVar = RelocationHandler.ForValue.c(returnType, false);
                    } else if (typeDescription2.Q2(n.class)) {
                        bVar = RelocationHandler.ForValue.c(returnType, true);
                    } else {
                        if (typeDescription2.w5() || returnType.w5()) {
                            throw new IllegalStateException("Cannot skip method by instance type for primitive return type " + returnType);
                        }
                        bVar = new RelocationHandler.b(typeDescription2);
                    }
                    this.f415684f = bVar;
                }

                @Override // net.bytebuddy.asm.Advice.Dispatcher
                public final boolean c() {
                    return true;
                }

                public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f415680b.equals(aVar.f415680b) && this.f415681c.equals(aVar.f415681c) && this.f415682d.equals(aVar.f415682d) && this.f415683e.equals(aVar.f415683e) && this.f415684f.equals(aVar.f415684f);
                }

                public int hashCode() {
                    return this.f415684f.hashCode() + ((this.f415683e.hashCode() + ((this.f415682d.hashCode() + ((this.f415681c.hashCode() + ((this.f415680b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
                }
            }

            public interface b extends d {
                boolean d();

                TypeDefinition h();
            }

            public interface c extends d {
                ArgumentHandler.Factory i();

                TypeDescription n();
            }

            Map<String, TypeDefinition> b();

            a f(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.b bVar2, MethodSizeHandler.c cVar, StackMapFrameHandler.b bVar3, StackManipulation stackManipulation, RelocationHandler.c cVar2);
        }

        public interface e extends Dispatcher {
            Map<String, TypeDefinition> b();

            d.c e(ArrayList arrayList, @net.bytebuddy.utility.nullability.b net.bytebuddy.jar.asm.e eVar, e eVar2, PostProcessor.NoOp noOp);

            d.b l(ArrayList arrayList, @net.bytebuddy.utility.nullability.b net.bytebuddy.jar.asm.e eVar, e eVar2, PostProcessor.NoOp noOp);

            boolean m();
        }

        boolean c();

        TypeDefinition k();

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements e {

            /* renamed from: b, reason: collision with root package name */
            public final a.d f415615b;

            /* renamed from: c, reason: collision with root package name */
            public final Delegator.ForStaticInvocation f415616c;

            public b(a.d dVar, Delegator.ForStaticInvocation forStaticInvocation) {
                this.f415615b = dVar;
                this.f415616c = forStaticInvocation;
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.e, net.bytebuddy.asm.Advice.Dispatcher.d
            public final Map<String, TypeDefinition> b() {
                return Collections.emptyMap();
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher
            public final boolean c() {
                return true;
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.e
            public final d.c e(ArrayList arrayList, @net.bytebuddy.utility.nullability.b net.bytebuddy.jar.asm.e eVar, e eVar2, PostProcessor.NoOp noOp) {
                Map<String, TypeDefinition> mapB = eVar2.b();
                a.d dVar = this.f415615b;
                Iterator<?> it = dVar.getParameters().iterator();
                while (it.hasNext()) {
                    net.bytebuddy.description.method.c cVar = (net.bytebuddy.description.method.c) it.next();
                    AnnotationDescription.g gVarM6 = cVar.getDeclaredAnnotations().m6(i.class);
                    if (gVarM6 != null) {
                        String str = (String) gVarM6.d(OffsetMapping.c.a.f415810c).b(String.class);
                        TypeDefinition typeDefinition = mapB.get(str);
                        if (typeDefinition == null) {
                            throw new IllegalStateException(dVar + " attempts use of undeclared local variable " + str);
                        }
                        if (!typeDefinition.equals(cVar.getType())) {
                            throw new IllegalStateException(dVar + " does not read variable " + str + " as " + typeDefinition);
                        }
                    }
                }
                noOp.getClass();
                TypeDefinition typeDefinitionK = eVar2.k();
                TypeDescription typeDescription = (TypeDescription) dVar.getDeclaredAnnotations().m6(m.class).d(Advice.f415516l).b(TypeDescription.class);
                boolean zQ2 = typeDescription.Q2(j.class);
                Delegator.ForStaticInvocation forStaticInvocation = this.f415616c;
                return zQ2 ? new a.c.C11920b(dVar, noOp, mapB, arrayList, typeDefinitionK, forStaticInvocation) : new a.c.C11919a(dVar, noOp, mapB, arrayList, typeDefinitionK, typeDescription, forStaticInvocation);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f415615b.equals(bVar.f415615b) && this.f415616c.equals(bVar.f415616c);
            }

            public final int hashCode() {
                return this.f415616c.hashCode() + ((this.f415615b.hashCode() + (getClass().hashCode() * 31)) * 31);
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher
            public final TypeDefinition k() {
                return this.f415615b.getReturnType().f5();
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.e
            public final d.b l(ArrayList arrayList, @net.bytebuddy.utility.nullability.b net.bytebuddy.jar.asm.e eVar, e eVar2, PostProcessor.NoOp noOp) {
                noOp.getClass();
                TypeDefinition typeDefinitionK = eVar2.k();
                boolean zC2 = eVar2.c();
                a.d dVar = this.f415615b;
                Delegator.ForStaticInvocation forStaticInvocation = this.f415616c;
                return zC2 ? new a.AbstractC11916b.C11918b(dVar, noOp, arrayList, typeDefinitionK, forStaticInvocation) : new a.AbstractC11916b.C11917a(dVar, noOp, arrayList, typeDefinitionK, forStaticInvocation);
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.e
            public final boolean m() {
                return false;
            }

            public static abstract class a extends d.a {

                /* renamed from: g, reason: collision with root package name */
                public final Delegator.ForStaticInvocation f415617g;

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$b$a$b, reason: collision with other inner class name */
                public static abstract class AbstractC11916b extends a implements d.b {

                    /* renamed from: h, reason: collision with root package name */
                    public final boolean f415633h;

                    /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$b$a$b$a, reason: collision with other inner class name */
                    public static class C11917a extends AbstractC11916b {
                        public C11917a() {
                            throw null;
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher.b.a.AbstractC11916b
                        public final AbstractC11913a.C11914a g(ArgumentHandler.a aVar, RelocationHandler.a aVar2, SuppressionHandler.a aVar3, MethodSizeHandler.b bVar, StackMapFrameHandler.a aVar4, net.bytebuddy.description.method.a aVar5, TypeDescription typeDescription, Implementation.Context context, StackManipulation stackManipulation, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar2, net.bytebuddy.jar.asm.s sVar) {
                            bVar.i(this.f415680b.getReturnType().p().f417839b);
                            return super.g(aVar, aVar2, aVar3, bVar, aVar4, aVar5, typeDescription, context, stackManipulation, bVar2, sVar);
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher
                        public final TypeDefinition k() {
                            return TypeDescription.f416321E2;
                        }
                    }

                    /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$b$a$b$b, reason: collision with other inner class name */
                    public static class C11918b extends AbstractC11916b {
                        public C11918b() {
                            throw null;
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher
                        public final TypeDefinition k() {
                            return this.f415680b.getReturnType();
                        }
                    }

                    @SuppressFBWarnings(justification = "Assuming annotation for exit advice.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public AbstractC11916b(a.d dVar, PostProcessor postProcessor, ArrayList arrayList, TypeDefinition typeDefinition, Delegator.ForStaticInvocation forStaticInvocation) {
                        super(dVar, postProcessor, net.bytebuddy.utility.a.a(Arrays.asList(OffsetMapping.ForArgument.Unresolved.Factory.f415720b, OffsetMapping.ForAllArguments.Factory.f415710b, OffsetMapping.ForThisReference.Factory.f415775b, OffsetMapping.ForField.Unresolved.Factory.f415734b, OffsetMapping.ForOrigin.Factory.f415744b, OffsetMapping.ForUnusedValue.Factory.f415788b, OffsetMapping.ForStubValue.f415769b, OffsetMapping.b.a.c(typeDefinition), new OffsetMapping.Factory.a(s.class), new OffsetMapping.Factory.a(f.class), new OffsetMapping.Factory.a(i.class), new OffsetMapping.Factory.a(p.class)), arrayList), (TypeDescription) dVar.getDeclaredAnnotations().m6(l.class).d(Advice.f415514j).b(TypeDescription.class), (TypeDescription) dVar.getDeclaredAnnotations().m6(l.class).d(Advice.f415511g).b(TypeDescription.class), forStaticInvocation);
                        this.f415633h = ((Boolean) dVar.getDeclaredAnnotations().m6(l.class).d(Advice.f415512h).b(Boolean.class)).booleanValue();
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.b.a
                    public final a a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.b bVar2, MethodSizeHandler.c cVar, StackMapFrameHandler.b bVar3, StackManipulation stackManipulation, RelocationHandler.c cVar2) {
                        a.d dVar = this.f415680b;
                        ArgumentHandler.a.AbstractC11908a.C11909a c11909aA = bVar2.a(dVar);
                        MethodSizeHandler.b bVarB = cVar.b(dVar);
                        StackMapFrameHandler.a aVarB = bVar3.b(dVar);
                        return g(c11909aA, this.f415684f.a(aVar, cVar2), this.f415683e.c(stackManipulation), bVarB, aVarB, aVar, typeDescription, context, stackManipulation, bVar, sVar);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d.b
                    public final boolean d() {
                        return this.f415633h;
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d.a
                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f415633h == ((AbstractC11916b) obj).f415633h;
                        }
                        return false;
                    }

                    public AbstractC11913a.C11914a g(ArgumentHandler.a aVar, RelocationHandler.a aVar2, SuppressionHandler.a aVar3, MethodSizeHandler.b bVar, StackMapFrameHandler.a aVar4, net.bytebuddy.description.method.a aVar5, TypeDescription typeDescription, Implementation.Context context, StackManipulation stackManipulation, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar2, net.bytebuddy.jar.asm.s sVar) {
                        LinkedHashMap linkedHashMap = this.f415682d;
                        ArrayList arrayList = new ArrayList(linkedHashMap.size());
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            arrayList.add(((OffsetMapping) it.next()).c(typeDescription, aVar5, bVar2, aVar, OffsetMapping.Sort.f415790b));
                        }
                        return new AbstractC11913a.C11914a(this.f415680b, typeDescription, aVar5, bVar2, this.f415681c, arrayList, sVar, context, aVar, bVar, aVar4, aVar3, aVar2, stackManipulation, this.f415617g);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d.b
                    public final TypeDefinition h() {
                        return this.f415680b.getReturnType();
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d.a
                    public final int hashCode() {
                        return (super.hashCode() * 31) + (this.f415633h ? 1 : 0);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static abstract class c extends a implements d.c {

                    /* renamed from: h, reason: collision with root package name */
                    public final boolean f415634h;

                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$b$a$c$a, reason: collision with other inner class name */
                    public static class C11919a extends c {

                        /* renamed from: i, reason: collision with root package name */
                        public final TypeDescription f415635i;

                        public C11919a(a.d dVar, PostProcessor postProcessor, Map map, ArrayList arrayList, TypeDefinition typeDefinition, TypeDescription typeDescription, Delegator.ForStaticInvocation forStaticInvocation) {
                            super(dVar, postProcessor, map, arrayList, typeDefinition, forStaticInvocation);
                            this.f415635i = typeDescription;
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher.b.a.c, net.bytebuddy.asm.Advice.Dispatcher.d.a
                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (!super.equals(obj)) {
                                return false;
                            }
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return this.f415635i.equals(((C11919a) obj).f415635i);
                            }
                            return false;
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher.b.a.c, net.bytebuddy.asm.Advice.Dispatcher.d.a
                        public final int hashCode() {
                            return this.f415635i.hashCode() + (super.hashCode() * 31);
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher.d.c
                        public final TypeDescription n() {
                            return this.f415635i;
                        }
                    }

                    /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$b$a$c$b, reason: collision with other inner class name */
                    public static class C11920b extends c {
                        public C11920b() {
                            throw null;
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher.d.c
                        public final TypeDescription n() {
                            return j.f415880b;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    @SuppressFBWarnings(justification = "Assuming annotation for exit advice.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public c(a.d dVar, PostProcessor postProcessor, Map map, ArrayList arrayList, TypeDefinition typeDefinition, Delegator.ForStaticInvocation forStaticInvocation) {
                        super(dVar, postProcessor, net.bytebuddy.utility.a.a(Arrays.asList(OffsetMapping.ForArgument.Unresolved.Factory.f415720b, OffsetMapping.ForAllArguments.Factory.f415710b, OffsetMapping.ForThisReference.Factory.f415775b, OffsetMapping.ForField.Unresolved.Factory.f415734b, OffsetMapping.ForOrigin.Factory.f415744b, OffsetMapping.ForUnusedValue.Factory.f415788b, OffsetMapping.ForStubValue.f415769b, typeDefinition.Q2(Void.TYPE) ? new OffsetMapping.Factory.a(f.class) : new OffsetMapping.a.C11931a(typeDefinition), OffsetMapping.b.a.c(dVar.getReturnType()), new OffsetMapping.c.a(map), OffsetMapping.ForReturnValue.Factory.f415765b, OffsetMapping.ForThrowable.Factory.c(dVar)), arrayList), (TypeDescription) dVar.getDeclaredAnnotations().m6(m.class).d(Advice.f415519o).b(TypeDescription.class), (TypeDescription) dVar.getDeclaredAnnotations().m6(m.class).d(Advice.f415515k).b(TypeDescription.class), forStaticInvocation);
                        a.d dVar2 = OffsetMapping.a.C11931a.f415797c;
                        this.f415634h = ((Boolean) dVar.getDeclaredAnnotations().m6(m.class).d(Advice.f415517m).b(Boolean.class)).booleanValue();
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.b.a
                    public final a a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.b bVar2, MethodSizeHandler.c cVar, StackMapFrameHandler.b bVar3, StackManipulation stackManipulation, RelocationHandler.c cVar2) {
                        boolean zQ2 = n().Q2(j.class);
                        a.d dVar = this.f415680b;
                        ArgumentHandler.a.AbstractC11908a.b bVarG = bVar2.g(dVar, zQ2);
                        MethodSizeHandler.b bVarA = cVar.a(dVar);
                        StackMapFrameHandler.a aVarA = bVar3.a(dVar);
                        SuppressionHandler.a aVarC = this.f415683e.c(stackManipulation);
                        RelocationHandler.a aVarA2 = this.f415684f.a(aVar, cVar2);
                        LinkedHashMap linkedHashMap = this.f415682d;
                        ArrayList arrayList = new ArrayList(linkedHashMap.size());
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            arrayList.add(((OffsetMapping) it.next()).c(typeDescription, aVar, bVar, bVarG, OffsetMapping.Sort.f415791c));
                        }
                        return new AbstractC11913a.C11915b(this.f415680b, typeDescription, aVar, bVar, this.f415681c, arrayList, sVar, context, bVarG, bVarA, aVarA, aVarC, aVarA2, stackManipulation, this.f415617g);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d.a
                    public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f415634h == ((c) obj).f415634h;
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d.a
                    public int hashCode() {
                        return (super.hashCode() * 31) + (this.f415634h ? 1 : 0);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d.c
                    public final ArgumentHandler.Factory i() {
                        return this.f415634h ? ArgumentHandler.Factory.f415526c : ArgumentHandler.Factory.f415525b;
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher
                    public final TypeDefinition k() {
                        return this.f415680b.getReturnType();
                    }
                }

                public a(a.d dVar, PostProcessor postProcessor, ArrayList arrayList, TypeDescription typeDescription, TypeDescription typeDescription2, Delegator.ForStaticInvocation forStaticInvocation) {
                    super(dVar, postProcessor, arrayList, typeDescription, typeDescription2, OffsetMapping.Factory.AdviceType.DELEGATION);
                    this.f415617g = forStaticInvocation;
                }

                public abstract a a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.b bVar2, MethodSizeHandler.c cVar, StackMapFrameHandler.b bVar3, StackManipulation stackManipulation, RelocationHandler.c cVar2);

                @Override // net.bytebuddy.asm.Advice.Dispatcher.d
                public final Map<String, TypeDefinition> b() {
                    return Collections.emptyMap();
                }

                @Override // net.bytebuddy.asm.Advice.Dispatcher.d
                public final a f(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.b bVar2, MethodSizeHandler.c cVar, StackMapFrameHandler.b bVar3, StackManipulation stackManipulation, RelocationHandler.c cVar2) {
                    a.d dVar = this.f415680b;
                    if (dVar.o0(typeDescription)) {
                        return a(typeDescription, aVar, sVar, context, bVar, bVar2, cVar, bVar3, stackManipulation, cVar2);
                    }
                    throw new IllegalStateException(dVar + " is not visible to " + aVar.n());
                }

                /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$b$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC11913a implements a {

                    /* renamed from: b, reason: collision with root package name */
                    public final a.d f415618b;

                    /* renamed from: c, reason: collision with root package name */
                    public final TypeDescription f415619c;

                    /* renamed from: d, reason: collision with root package name */
                    public final net.bytebuddy.description.method.a f415620d;

                    /* renamed from: e, reason: collision with root package name */
                    public final net.bytebuddy.implementation.bytecode.assign.primitive.b f415621e;

                    /* renamed from: f, reason: collision with root package name */
                    public final ArrayList f415622f;

                    /* renamed from: g, reason: collision with root package name */
                    public final net.bytebuddy.jar.asm.s f415623g;

                    /* renamed from: h, reason: collision with root package name */
                    public final Implementation.Context f415624h;

                    /* renamed from: i, reason: collision with root package name */
                    public final ArgumentHandler.a f415625i;

                    /* renamed from: j, reason: collision with root package name */
                    public final MethodSizeHandler.b f415626j;

                    /* renamed from: k, reason: collision with root package name */
                    public final StackMapFrameHandler.a f415627k;

                    /* renamed from: l, reason: collision with root package name */
                    public final SuppressionHandler.a f415628l;

                    /* renamed from: m, reason: collision with root package name */
                    public final RelocationHandler.a f415629m;

                    /* renamed from: n, reason: collision with root package name */
                    public final StackManipulation f415630n;

                    /* renamed from: o, reason: collision with root package name */
                    public final PostProcessor f415631o;

                    /* renamed from: p, reason: collision with root package name */
                    public final Delegator.ForStaticInvocation f415632p;

                    /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$b$a$a$b, reason: collision with other inner class name */
                    public static class C11915b extends AbstractC11913a {
                        public C11915b() {
                            throw null;
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher.a
                        public final void a() {
                            a.d dVar = this.f415618b;
                            boolean zQ2 = dVar.getReturnType().Q2(Boolean.TYPE);
                            ArgumentHandler.a aVar = this.f415625i;
                            net.bytebuddy.jar.asm.s sVar = this.f415623g;
                            if (zQ2 || dVar.getReturnType().Q2(Byte.TYPE) || dVar.getReturnType().Q2(Short.TYPE) || dVar.getReturnType().Q2(Character.TYPE) || dVar.getReturnType().Q2(Integer.TYPE)) {
                                sVar.m(3);
                                sVar.J(54, aVar.f());
                            } else if (dVar.getReturnType().Q2(Long.TYPE)) {
                                sVar.m(9);
                                sVar.J(55, aVar.f());
                            } else if (dVar.getReturnType().Q2(Float.TYPE)) {
                                sVar.m(11);
                                sVar.J(56, aVar.f());
                            } else if (dVar.getReturnType().Q2(Double.TYPE)) {
                                sVar.m(14);
                                sVar.J(57, aVar.f());
                            } else if (!dVar.getReturnType().Q2(Void.TYPE)) {
                                sVar.m(1);
                                sVar.J(58, aVar.f());
                            }
                            this.f415626j.k(dVar.getReturnType().p().f417839b);
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher.b.a.AbstractC11913a
                        public final boolean b() {
                            return true;
                        }
                    }

                    public AbstractC11913a(a.d dVar, TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, PostProcessor postProcessor, ArrayList arrayList, net.bytebuddy.jar.asm.s sVar, Implementation.Context context, ArgumentHandler.a aVar2, MethodSizeHandler.b bVar2, StackMapFrameHandler.a aVar3, SuppressionHandler.a aVar4, RelocationHandler.a aVar5, StackManipulation stackManipulation, Delegator.ForStaticInvocation forStaticInvocation) {
                        this.f415618b = dVar;
                        this.f415619c = typeDescription;
                        this.f415620d = aVar;
                        this.f415621e = bVar;
                        this.f415631o = postProcessor;
                        this.f415622f = arrayList;
                        this.f415623g = sVar;
                        this.f415624h = context;
                        this.f415625i = aVar2;
                        this.f415626j = bVar2;
                        this.f415627k = aVar3;
                        this.f415628l = aVar4;
                        this.f415629m = aVar5;
                        this.f415630n = stackManipulation;
                        this.f415632p = forStaticInvocation;
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.a
                    public final void apply() {
                        Implementation.Context context;
                        a.d dVar;
                        SuppressionHandler.a aVar = this.f415628l;
                        net.bytebuddy.jar.asm.s sVar = this.f415623g;
                        aVar.d(sVar);
                        Iterator it = this.f415622f.iterator();
                        int i12 = 0;
                        int i13 = 0;
                        int iMax = 0;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            context = this.f415624h;
                            dVar = this.f415618b;
                            if (!zHasNext) {
                                break;
                            }
                            OffsetMapping.f fVar = (OffsetMapping.f) it.next();
                            i12 += ((c.InterfaceC11982c) dVar.getParameters().get(i13)).getType().p().f417839b;
                            iMax = Math.max(iMax, fVar.b().n(sVar, context).f417834b + i12);
                            i13++;
                        }
                        this.f415632p.getClass();
                        this.f415623g.A(dVar.n().V(), dVar.V(), dVar.getDescriptor(), 184, false);
                        this.f415628l.a(this.f415623g, this.f415624h, this.f415626j, this.f415627k, dVar.getReturnType());
                        boolean zQ2 = dVar.getReturnType().Q2(Boolean.TYPE);
                        ArgumentHandler.a aVar2 = this.f415625i;
                        if (zQ2 || dVar.getReturnType().Q2(Byte.TYPE) || dVar.getReturnType().Q2(Short.TYPE) || dVar.getReturnType().Q2(Character.TYPE) || dVar.getReturnType().Q2(Integer.TYPE)) {
                            sVar.J(54, b() ? aVar2.f() : aVar2.k());
                        } else if (dVar.getReturnType().Q2(Long.TYPE)) {
                            sVar.J(55, b() ? aVar2.f() : aVar2.k());
                        } else if (dVar.getReturnType().Q2(Float.TYPE)) {
                            sVar.J(56, b() ? aVar2.f() : aVar2.k());
                        } else if (dVar.getReturnType().Q2(Double.TYPE)) {
                            sVar.J(57, b() ? aVar2.f() : aVar2.k());
                        } else if (!dVar.getReturnType().Q2(Void.TYPE)) {
                            sVar.J(58, b() ? aVar2.f() : aVar2.k());
                        }
                        int i14 = this.f415631o.a(this.f415619c, this.f415620d, this.f415621e, this.f415625i, this.f415627k, this.f415630n).n(sVar, context).f417834b;
                        MethodSizeHandler.b bVar = this.f415626j;
                        bVar.k(i14);
                        bVar.k(this.f415629m.b(b() ? aVar2.f() : aVar2.k(), sVar));
                        this.f415627k.c(sVar);
                        bVar.k(Math.max(iMax, dVar.getReturnType().p().f417839b));
                        bVar.e(this.f415620d.p() + dVar.getReturnType().p().f417839b);
                    }

                    public abstract boolean b();

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.a
                    public final void prepare() {
                        this.f415628l.b(this.f415623g);
                    }

                    /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$b$a$a$a, reason: collision with other inner class name */
                    public static class C11914a extends AbstractC11913a {
                        public C11914a() {
                            throw null;
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher.b.a.AbstractC11913a
                        public final boolean b() {
                            return false;
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher.a
                        public final void a() {
                        }
                    }
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Inactive implements e, d.b, d.c, a {

            /* renamed from: b, reason: collision with root package name */
            public static final Inactive f415584b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Inactive[] f415585c;

            static {
                Inactive inactive = new Inactive("INSTANCE", 0);
                f415584b = inactive;
                f415585c = new Inactive[]{inactive};
            }

            public Inactive() {
                throw null;
            }

            public static Inactive valueOf(String str) {
                return (Inactive) Enum.valueOf(Inactive.class, str);
            }

            public static Inactive[] values() {
                return (Inactive[]) f415585c.clone();
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.e, net.bytebuddy.asm.Advice.Dispatcher.d
            public final Map<String, TypeDefinition> b() {
                return Collections.emptyMap();
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher
            public final boolean c() {
                return false;
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.d.b
            public final boolean d() {
                return false;
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.d.b
            public final TypeDefinition h() {
                return TypeDescription.f416321E2;
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.d.c
            public final ArgumentHandler.Factory i() {
                return ArgumentHandler.Factory.f415525b;
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher
            public final TypeDefinition k() {
                return TypeDescription.f416321E2;
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.e
            public final boolean m() {
                return false;
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.d.c
            public final TypeDescription n() {
                return j.f415880b;
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.a
            public final void a() {
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.a
            public final void apply() {
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.a
            public final void prepare() {
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.d
            public final a f(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.b bVar2, MethodSizeHandler.c cVar, StackMapFrameHandler.b bVar3, StackManipulation stackManipulation, RelocationHandler.c cVar2) {
                return this;
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.e
            public final d.c e(ArrayList arrayList, @net.bytebuddy.utility.nullability.b net.bytebuddy.jar.asm.e eVar, e eVar2, PostProcessor.NoOp noOp) {
                return this;
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.e
            public final d.b l(ArrayList arrayList, @net.bytebuddy.utility.nullability.b net.bytebuddy.jar.asm.e eVar, e eVar2, PostProcessor.NoOp noOp) {
                return this;
            }
        }

        public interface RelocationHandler {

            public interface a {
                int b(int i12, net.bytebuddy.jar.asm.s sVar);
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements RelocationHandler {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f415603b;

                @HashCodeAndEqualsPlugin.Enhance
                public class a implements a {

                    /* renamed from: b, reason: collision with root package name */
                    public final net.bytebuddy.description.method.a f415604b;

                    /* renamed from: c, reason: collision with root package name */
                    public final c f415605c;

                    public a(net.bytebuddy.description.method.a aVar, c cVar) {
                        this.f415604b = aVar;
                        this.f415605c = cVar;
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.a
                    public final int b(int i12, net.bytebuddy.jar.asm.s sVar) {
                        net.bytebuddy.description.method.a aVar = this.f415604b;
                        if (aVar.v0()) {
                            throw new IllegalStateException(D8.m("Cannot skip code execution from constructor: ", aVar));
                        }
                        sVar.J(25, i12);
                        sVar.I(193, b.this.f415603b.V());
                        net.bytebuddy.jar.asm.r rVar = new net.bytebuddy.jar.asm.r();
                        sVar.r(153, rVar);
                        this.f415605c.q(sVar);
                        sVar.s(rVar);
                        return 0;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        a aVar = (a) obj;
                        return this.f415604b.equals(aVar.f415604b) && this.f415605c.equals(aVar.f415605c) && b.this.equals(b.this);
                    }

                    public final int hashCode() {
                        return b.this.hashCode() + ((this.f415605c.hashCode() + D8.h(this.f415604b, getClass().hashCode() * 31, 31)) * 31);
                    }
                }

                public b(TypeDescription typeDescription) {
                    this.f415603b = typeDescription;
                }

                @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler
                public final a a(net.bytebuddy.description.method.a aVar, c cVar) {
                    return new a(aVar, cVar);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f415603b.equals(((b) obj).f415603b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f415603b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            public interface c {

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements c {

                    /* renamed from: b, reason: collision with root package name */
                    public final net.bytebuddy.jar.asm.r f415607b;

                    public a(net.bytebuddy.jar.asm.r rVar) {
                        this.f415607b = rVar;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f415607b.equals(((a) obj).f415607b);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f415607b.hashCode() + (getClass().hashCode() * 31);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.c
                    public final void q(net.bytebuddy.jar.asm.s sVar) {
                        sVar.r(167, this.f415607b);
                    }
                }

                void q(net.bytebuddy.jar.asm.s sVar);
            }

            a a(net.bytebuddy.description.method.a aVar, c cVar);

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static abstract class ForValue implements RelocationHandler {

                /* renamed from: f, reason: collision with root package name */
                public static final ForValue f415588f;

                /* renamed from: g, reason: collision with root package name */
                public static final ForValue f415589g;

                /* renamed from: h, reason: collision with root package name */
                public static final ForValue f415590h;

                /* renamed from: i, reason: collision with root package name */
                public static final ForValue f415591i;

                /* renamed from: j, reason: collision with root package name */
                public static final ForValue f415592j;

                /* renamed from: k, reason: collision with root package name */
                public static final /* synthetic */ ForValue[] f415593k;

                /* renamed from: b, reason: collision with root package name */
                public final int f415594b;

                /* renamed from: c, reason: collision with root package name */
                public final int f415595c;

                /* renamed from: d, reason: collision with root package name */
                public final int f415596d;

                /* renamed from: e, reason: collision with root package name */
                public final int f415597e;

                public enum b extends ForValue {
                    @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue
                    public final void b(net.bytebuddy.jar.asm.s sVar) {
                        sVar.m(136);
                    }
                }

                public enum c extends ForValue {
                    @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue
                    public final void b(net.bytebuddy.jar.asm.s sVar) {
                        sVar.m(11);
                        sVar.m(149);
                    }
                }

                public enum d extends ForValue {
                    @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue
                    public final void b(net.bytebuddy.jar.asm.s sVar) {
                        sVar.m(14);
                        sVar.m(151);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public class f implements a {

                    /* renamed from: b, reason: collision with root package name */
                    public final net.bytebuddy.description.method.a f415598b;

                    /* renamed from: c, reason: collision with root package name */
                    public final c f415599c;

                    /* renamed from: d, reason: collision with root package name */
                    public final boolean f415600d;

                    public f(net.bytebuddy.description.method.a aVar, c cVar, boolean z12) {
                        this.f415598b = aVar;
                        this.f415599c = cVar;
                        this.f415600d = z12;
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.a
                    public final int b(int i12, net.bytebuddy.jar.asm.s sVar) {
                        net.bytebuddy.description.method.a aVar = this.f415598b;
                        if (aVar.v0()) {
                            throw new IllegalStateException(D8.m("Cannot skip code execution from constructor: ", aVar));
                        }
                        ForValue forValue = ForValue.this;
                        sVar.J(forValue.f415594b, i12);
                        forValue.b(sVar);
                        net.bytebuddy.jar.asm.r rVar = new net.bytebuddy.jar.asm.r();
                        sVar.r(this.f415600d ? forValue.f415596d : forValue.f415595c, rVar);
                        this.f415599c.q(sVar);
                        sVar.s(rVar);
                        return forValue.f415597e;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        f fVar = (f) obj;
                        return this.f415600d == fVar.f415600d && ForValue.this.equals(ForValue.this) && this.f415598b.equals(fVar.f415598b) && this.f415599c.equals(fVar.f415599c);
                    }

                    public final int hashCode() {
                        return ForValue.this.hashCode() + ((((this.f415599c.hashCode() + D8.h(this.f415598b, getClass().hashCode() * 31, 31)) * 31) + (this.f415600d ? 1 : 0)) * 31);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public class g implements RelocationHandler {
                    public g() {
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler
                    public final a a(net.bytebuddy.description.method.a aVar, c cVar) {
                        return ForValue.this.new f(aVar, cVar, true);
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return ForValue.this.equals(ForValue.this);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return ForValue.this.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                static {
                    a aVar = new a("INTEGER", 0, 21, 154, 153, 0, null);
                    f415588f = aVar;
                    b bVar = new b("LONG", 1, 22, 154, 153, 0, null);
                    f415589g = bVar;
                    c cVar = new c("FLOAT", 2, 23, 154, 153, 2, null);
                    f415590h = cVar;
                    d dVar = new d("DOUBLE", 3, 24, 154, 153, 4, null);
                    f415591i = dVar;
                    e eVar = new e("REFERENCE", 4, 25, 199, 198, 0, null);
                    f415592j = eVar;
                    f415593k = new ForValue[]{aVar, bVar, cVar, dVar, eVar};
                }

                public ForValue() {
                    throw null;
                }

                public ForValue(String str, int i12, int i13, int i14, int i15, int i16, a aVar) {
                    this.f415594b = i13;
                    this.f415595c = i14;
                    this.f415596d = i15;
                    this.f415597e = i16;
                }

                public static RelocationHandler c(TypeDescription.Generic generic, boolean z12) {
                    ForValue forValue;
                    if (generic.Q2(Long.TYPE)) {
                        forValue = f415589g;
                    } else if (generic.Q2(Float.TYPE)) {
                        forValue = f415590h;
                    } else if (generic.Q2(Double.TYPE)) {
                        forValue = f415591i;
                    } else {
                        if (generic.Q2(Void.TYPE)) {
                            throw new IllegalStateException("Cannot skip on default value for void return type");
                        }
                        forValue = generic.w5() ? f415588f : f415592j;
                    }
                    if (!z12) {
                        return forValue;
                    }
                    forValue.getClass();
                    return forValue.new g();
                }

                public static ForValue valueOf(String str) {
                    return (ForValue) Enum.valueOf(ForValue.class, str);
                }

                public static ForValue[] values() {
                    return (ForValue[]) f415593k.clone();
                }

                @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler
                public final a a(net.bytebuddy.description.method.a aVar, c cVar) {
                    return new f(aVar, cVar, false);
                }

                public abstract void b(net.bytebuddy.jar.asm.s sVar);

                public enum a extends ForValue {
                    @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue
                    public final void b(net.bytebuddy.jar.asm.s sVar) {
                    }
                }

                public enum e extends ForValue {
                    @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue
                    public final void b(net.bytebuddy.jar.asm.s sVar) {
                    }
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Disabled implements RelocationHandler, a {

                /* renamed from: b, reason: collision with root package name */
                public static final Disabled f415586b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ Disabled[] f415587c;

                static {
                    Disabled disabled = new Disabled("INSTANCE", 0);
                    f415586b = disabled;
                    f415587c = new Disabled[]{disabled};
                }

                public Disabled() {
                    throw null;
                }

                public static Disabled valueOf(String str) {
                    return (Disabled) Enum.valueOf(Disabled.class, str);
                }

                public static Disabled[] values() {
                    return (Disabled[]) f415587c.clone();
                }

                @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.a
                public final int b(int i12, net.bytebuddy.jar.asm.s sVar) {
                    return 0;
                }

                @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler
                public final a a(net.bytebuddy.description.method.a aVar, c cVar) {
                    return this;
                }
            }
        }

        public interface SuppressionHandler {

            public interface a {
                void a(net.bytebuddy.jar.asm.s sVar, Implementation.Context context, MethodSizeHandler.b bVar, StackMapFrameHandler.a aVar, TypeDescription.Generic generic);

                void b(net.bytebuddy.jar.asm.s sVar);

                void d(net.bytebuddy.jar.asm.s sVar);

                void e(net.bytebuddy.jar.asm.s sVar, Implementation.Context context, MethodSizeHandler.b bVar, StackMapFrameHandler.a aVar, TypeDescription.Generic generic);
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements SuppressionHandler {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f415610b;

                public static class a implements a {

                    /* renamed from: b, reason: collision with root package name */
                    public final TypeDescription f415611b;

                    /* renamed from: c, reason: collision with root package name */
                    public final StackManipulation f415612c;

                    /* renamed from: d, reason: collision with root package name */
                    public final net.bytebuddy.jar.asm.r f415613d = new net.bytebuddy.jar.asm.r();

                    /* renamed from: e, reason: collision with root package name */
                    public final net.bytebuddy.jar.asm.r f415614e = new net.bytebuddy.jar.asm.r();

                    public a(TypeDescription typeDescription, StackManipulation stackManipulation) {
                        this.f415611b = typeDescription;
                        this.f415612c = stackManipulation;
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.a
                    public final void a(net.bytebuddy.jar.asm.s sVar, Implementation.Context context, MethodSizeHandler.b bVar, StackMapFrameHandler.a aVar, TypeDescription.Generic generic) {
                        net.bytebuddy.jar.asm.r rVar = new net.bytebuddy.jar.asm.r();
                        sVar.r(167, rVar);
                        e(sVar, context, bVar, aVar, generic);
                        sVar.s(rVar);
                        aVar.f(sVar);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.a
                    public final void b(net.bytebuddy.jar.asm.s sVar) {
                        String strV = this.f415611b.V();
                        net.bytebuddy.jar.asm.r rVar = this.f415613d;
                        net.bytebuddy.jar.asm.r rVar2 = this.f415614e;
                        sVar.G(rVar, rVar2, rVar2, strV);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.a
                    public final void d(net.bytebuddy.jar.asm.s sVar) {
                        sVar.s(this.f415613d);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.a
                    public final void e(net.bytebuddy.jar.asm.s sVar, Implementation.Context context, MethodSizeHandler.b bVar, StackMapFrameHandler.a aVar, TypeDescription.Generic generic) {
                        sVar.s(this.f415614e);
                        aVar.e(sVar);
                        bVar.k(this.f415612c.n(sVar, context).f417834b + 1);
                        if (generic.Q2(Boolean.TYPE) || generic.Q2(Byte.TYPE) || generic.Q2(Short.TYPE) || generic.Q2(Character.TYPE) || generic.Q2(Integer.TYPE)) {
                            sVar.m(3);
                            return;
                        }
                        if (generic.Q2(Long.TYPE)) {
                            sVar.m(9);
                            return;
                        }
                        if (generic.Q2(Float.TYPE)) {
                            sVar.m(11);
                        } else if (generic.Q2(Double.TYPE)) {
                            sVar.m(14);
                        } else {
                            if (generic.Q2(Void.TYPE)) {
                                return;
                            }
                            sVar.m(1);
                        }
                    }
                }

                public b(TypeDescription typeDescription) {
                    this.f415610b = typeDescription;
                }

                @Override // net.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler
                public final a c(StackManipulation stackManipulation) {
                    return new a(this.f415610b, stackManipulation);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f415610b.equals(((b) obj).f415610b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f415610b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            a c(StackManipulation stackManipulation);

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class NoOp implements SuppressionHandler, a {

                /* renamed from: b, reason: collision with root package name */
                public static final NoOp f415608b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ NoOp[] f415609c;

                static {
                    NoOp noOp = new NoOp("INSTANCE", 0);
                    f415608b = noOp;
                    f415609c = new NoOp[]{noOp};
                }

                public NoOp() {
                    throw null;
                }

                public static NoOp valueOf(String str) {
                    return (NoOp) Enum.valueOf(NoOp.class, str);
                }

                public static NoOp[] values() {
                    return (NoOp[]) f415609c.clone();
                }

                @Override // net.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.a
                public final void b(net.bytebuddy.jar.asm.s sVar) {
                }

                @Override // net.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler
                public final a c(StackManipulation stackManipulation) {
                    return this;
                }

                @Override // net.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.a
                public final void d(net.bytebuddy.jar.asm.s sVar) {
                }

                @Override // net.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.a
                public final void a(net.bytebuddy.jar.asm.s sVar, Implementation.Context context, MethodSizeHandler.b bVar, StackMapFrameHandler.a aVar, TypeDescription.Generic generic) {
                }

                @Override // net.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.a
                public final void e(net.bytebuddy.jar.asm.s sVar, Implementation.Context context, MethodSizeHandler.b bVar, StackMapFrameHandler.a aVar, TypeDescription.Generic generic) {
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements e {

            /* renamed from: b, reason: collision with root package name */
            public final a.d f415636b;

            /* renamed from: c, reason: collision with root package name */
            public final HashMap f415637c = new HashMap();

            public static abstract class b extends d.a {

                /* renamed from: g, reason: collision with root package name */
                public final net.bytebuddy.jar.asm.e f415654g;

                public class a extends net.bytebuddy.jar.asm.f implements a {

                    /* renamed from: d, reason: collision with root package name */
                    public final TypeDescription f415655d;

                    /* renamed from: e, reason: collision with root package name */
                    public final net.bytebuddy.description.method.a f415656e;

                    /* renamed from: f, reason: collision with root package name */
                    public final net.bytebuddy.jar.asm.s f415657f;

                    /* renamed from: g, reason: collision with root package name */
                    public final Implementation.Context f415658g;

                    /* renamed from: h, reason: collision with root package name */
                    public final net.bytebuddy.implementation.bytecode.assign.primitive.b f415659h;

                    /* renamed from: i, reason: collision with root package name */
                    public final ArgumentHandler.b f415660i;

                    /* renamed from: j, reason: collision with root package name */
                    public final MethodSizeHandler.c f415661j;

                    /* renamed from: k, reason: collision with root package name */
                    public final StackMapFrameHandler.b f415662k;

                    /* renamed from: l, reason: collision with root package name */
                    public final SuppressionHandler.a f415663l;

                    /* renamed from: m, reason: collision with root package name */
                    public final RelocationHandler.a f415664m;

                    /* renamed from: n, reason: collision with root package name */
                    public final StackManipulation f415665n;

                    /* renamed from: o, reason: collision with root package name */
                    public final net.bytebuddy.jar.asm.e f415666o;

                    /* renamed from: p, reason: collision with root package name */
                    public final ArrayList f415667p;

                    /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$c$b$a$a, reason: collision with other inner class name */
                    public class C11921a extends net.bytebuddy.jar.asm.s {

                        /* renamed from: d, reason: collision with root package name */
                        public final net.bytebuddy.jar.asm.s f415669d;

                        public C11921a(net.bytebuddy.jar.asm.s sVar) {
                            super(net.bytebuddy.utility.e.f418981b, null);
                            this.f415669d = sVar;
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        @net.bytebuddy.utility.nullability.b
                        public final AbstractC44388a F(int i12, @net.bytebuddy.utility.nullability.b C c12, String str, boolean z12) {
                            return this.f415669d.F(i12, c12, str, z12);
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void G(net.bytebuddy.jar.asm.r rVar, net.bytebuddy.jar.asm.r rVar2, net.bytebuddy.jar.asm.r rVar3, @net.bytebuddy.utility.nullability.b String str) {
                            this.f415669d.G(rVar, rVar2, rVar3, str);
                            a.this.f415667p.addAll(Arrays.asList(rVar, rVar2, rVar3));
                        }
                    }

                    /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$c$b$a$b, reason: collision with other inner class name */
                    public class C11922b extends net.bytebuddy.jar.asm.f {
                        public C11922b() {
                            super(net.bytebuddy.utility.e.f418981b, null);
                        }

                        @Override // net.bytebuddy.jar.asm.f
                        @net.bytebuddy.utility.nullability.b
                        public final net.bytebuddy.jar.asm.s i(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
                            a aVar = a.this;
                            if (b.this.f415680b.V().equals(str) && b.this.f415680b.getDescriptor().equals(str2)) {
                                return aVar.new C11921a(aVar.f415657f);
                            }
                            return null;
                        }
                    }

                    /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$c$b$a$c, reason: collision with other inner class name */
                    public class C11923c extends net.bytebuddy.jar.asm.s {

                        /* renamed from: d, reason: collision with root package name */
                        public final IdentityHashMap f415672d;

                        /* renamed from: e, reason: collision with root package name */
                        public int f415673e;

                        public C11923c(net.bytebuddy.jar.asm.s sVar) {
                            super(net.bytebuddy.utility.e.f418981b, sVar);
                            this.f415672d = new IdentityHashMap();
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void E(int i12, int i13, net.bytebuddy.jar.asm.r rVar, net.bytebuddy.jar.asm.r... rVarArr) {
                            net.bytebuddy.jar.asm.r[] rVarArr2 = new net.bytebuddy.jar.asm.r[rVarArr.length];
                            int length = rVarArr.length;
                            int i14 = 0;
                            int i15 = 0;
                            while (i14 < length) {
                                rVarArr2[i15] = K(rVarArr[i14]);
                                i14++;
                                i15++;
                            }
                            super.E(i12, i13, rVar, rVarArr2);
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        @net.bytebuddy.utility.nullability.b
                        public final AbstractC44388a F(int i12, @net.bytebuddy.utility.nullability.b C c12, String str, boolean z12) {
                            return null;
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void G(net.bytebuddy.jar.asm.r rVar, net.bytebuddy.jar.asm.r rVar2, net.bytebuddy.jar.asm.r rVar3, String str) {
                            IdentityHashMap identityHashMap = this.f415672d;
                            a aVar = a.this;
                            ArrayList arrayList = aVar.f415667p;
                            int i12 = this.f415673e;
                            this.f415673e = i12 + 1;
                            identityHashMap.put(rVar, arrayList.get(i12));
                            ArrayList arrayList2 = aVar.f415667p;
                            int i13 = this.f415673e;
                            this.f415673e = i13 + 1;
                            identityHashMap.put(rVar2, arrayList2.get(i13));
                            int i14 = this.f415673e;
                            this.f415673e = i14 + 1;
                            net.bytebuddy.jar.asm.r rVar4 = (net.bytebuddy.jar.asm.r) arrayList2.get(i14);
                            identityHashMap.put(rVar3, rVar4);
                            net.bytebuddy.utility.visitor.e eVar = (net.bytebuddy.utility.visitor.e) ((a) this.f418282c).f418282c;
                            eVar.f419005e.put(rVar4, Collections.singletonList(StackSize.SINGLE));
                        }

                        public final net.bytebuddy.jar.asm.r K(net.bytebuddy.jar.asm.r rVar) {
                            net.bytebuddy.jar.asm.r rVar2 = (net.bytebuddy.jar.asm.r) this.f415672d.get(rVar);
                            return rVar2 == null ? rVar : rVar2;
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void r(int i12, net.bytebuddy.jar.asm.r rVar) {
                            super.r(i12, K(rVar));
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void s(net.bytebuddy.jar.asm.r rVar) {
                            super.s(K(rVar));
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void x(net.bytebuddy.jar.asm.r rVar, int[] iArr, net.bytebuddy.jar.asm.r[] rVarArr) {
                            net.bytebuddy.jar.asm.r rVarK = K(rVar);
                            net.bytebuddy.jar.asm.r[] rVarArr2 = new net.bytebuddy.jar.asm.r[rVarArr.length];
                            int length = rVarArr.length;
                            int i12 = 0;
                            int i13 = 0;
                            while (i12 < length) {
                                rVarArr2[i13] = K(rVarArr[i12]);
                                i12++;
                                i13++;
                            }
                            super.x(rVarK, iArr, rVarArr2);
                        }
                    }

                    public a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.b bVar2, MethodSizeHandler.c cVar, StackMapFrameHandler.b bVar3, SuppressionHandler.a aVar2, RelocationHandler.a aVar3, StackManipulation stackManipulation, net.bytebuddy.jar.asm.e eVar) {
                        super(net.bytebuddy.utility.e.f418981b, null);
                        this.f415655d = typeDescription;
                        this.f415656e = aVar;
                        this.f415657f = sVar;
                        this.f415658g = context;
                        this.f415659h = bVar;
                        this.f415660i = bVar2;
                        this.f415661j = cVar;
                        this.f415662k = bVar3;
                        this.f415663l = aVar2;
                        this.f415664m = aVar3;
                        this.f415665n = stackManipulation;
                        this.f415666o = eVar;
                        this.f415667p = new ArrayList();
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.a
                    public final void a() {
                        for (Map.Entry entry : b.this.g(this.f415660i).entrySet()) {
                            boolean zQ2 = ((TypeDefinition) entry.getValue()).Q2(Boolean.TYPE);
                            net.bytebuddy.jar.asm.s sVar = this.f415657f;
                            if (zQ2 || ((TypeDefinition) entry.getValue()).Q2(Byte.TYPE) || ((TypeDefinition) entry.getValue()).Q2(Short.TYPE) || ((TypeDefinition) entry.getValue()).Q2(Character.TYPE) || ((TypeDefinition) entry.getValue()).Q2(Integer.TYPE)) {
                                sVar.m(3);
                                sVar.J(54, ((Integer) entry.getKey()).intValue());
                            } else if (((TypeDefinition) entry.getValue()).Q2(Long.TYPE)) {
                                sVar.m(9);
                                sVar.J(55, ((Integer) entry.getKey()).intValue());
                            } else if (((TypeDefinition) entry.getValue()).Q2(Float.TYPE)) {
                                sVar.m(11);
                                sVar.J(56, ((Integer) entry.getKey()).intValue());
                            } else if (((TypeDefinition) entry.getValue()).Q2(Double.TYPE)) {
                                sVar.m(14);
                                sVar.J(57, ((Integer) entry.getKey()).intValue());
                            } else {
                                sVar.m(1);
                                sVar.J(58, ((Integer) entry.getKey()).intValue());
                            }
                            this.f415661j.k(((TypeDefinition) entry.getValue()).p().f417839b);
                        }
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.a
                    public final void apply() {
                        this.f415666o.a(this.f415662k.m() | 2, this);
                    }

                    @Override // net.bytebuddy.jar.asm.f
                    @net.bytebuddy.utility.nullability.b
                    public final net.bytebuddy.jar.asm.s i(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
                        b bVar = b.this;
                        a.d dVar = bVar.f415680b;
                        if (!dVar.V().equals(str) || !dVar.getDescriptor().equals(str2)) {
                            return null;
                        }
                        return new C11923c(bVar.a(this.f415657f, this.f415658g, this.f415659h, this.f415660i, this.f415661j, this.f415662k, this.f415655d, this.f415656e, this.f415663l, this.f415664m, this.f415665n));
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.a
                    public final void prepare() {
                        this.f415666o.a(6, new C11922b());
                        this.f415663l.b(this.f415657f);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$c$b$b, reason: collision with other inner class name */
                public static abstract class AbstractC11924b extends b implements d.b {

                    /* renamed from: h, reason: collision with root package name */
                    public final HashMap f415675h;

                    /* renamed from: i, reason: collision with root package name */
                    public final boolean f415676i;

                    /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$c$b$b$a */
                    public static class a extends AbstractC11924b {
                        public a() {
                            throw null;
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher.c.b.AbstractC11924b
                        public final a j(ArgumentHandler.a aVar, RelocationHandler.a aVar2, SuppressionHandler.a aVar3, MethodSizeHandler.b bVar, StackMapFrameHandler.a aVar4, net.bytebuddy.description.method.a aVar5, TypeDescription typeDescription, Implementation.Context context, StackManipulation stackManipulation, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar2, net.bytebuddy.jar.asm.s sVar) {
                            bVar.i(this.f415680b.getReturnType().p().f417839b);
                            return super.j(aVar, aVar2, aVar3, bVar, aVar4, aVar5, typeDescription, context, stackManipulation, bVar2, sVar);
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher
                        public final TypeDefinition k() {
                            return TypeDescription.f416321E2;
                        }
                    }

                    /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$c$b$b$b, reason: collision with other inner class name */
                    public static class C11925b extends AbstractC11924b {
                        public C11925b() {
                            throw null;
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher
                        public final TypeDefinition k() {
                            return this.f415680b.getReturnType();
                        }
                    }

                    @SuppressFBWarnings(justification = "Assuming annotation for exit advice.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public AbstractC11924b(a.d dVar, PostProcessor postProcessor, HashMap map, ArrayList arrayList, TypeDefinition typeDefinition, net.bytebuddy.jar.asm.e eVar) {
                        super(dVar, postProcessor, net.bytebuddy.utility.a.a(Arrays.asList(OffsetMapping.ForArgument.Unresolved.Factory.f415720b, OffsetMapping.ForAllArguments.Factory.f415710b, OffsetMapping.ForThisReference.Factory.f415775b, OffsetMapping.ForField.Unresolved.Factory.f415734b, OffsetMapping.ForOrigin.Factory.f415744b, OffsetMapping.ForUnusedValue.Factory.f415788b, OffsetMapping.ForStubValue.f415769b, OffsetMapping.ForThrowable.Factory.f415783b, OffsetMapping.b.a.c(typeDefinition), new OffsetMapping.c.a(map), new OffsetMapping.Factory.a(s.class), new OffsetMapping.Factory.a(f.class), new OffsetMapping.Factory.a(p.class)), arrayList), (TypeDescription) dVar.getDeclaredAnnotations().m6(l.class).d(Advice.f415514j).b(TypeDescription.class), (TypeDescription) dVar.getDeclaredAnnotations().m6(l.class).d(Advice.f415511g).b(TypeDescription.class), eVar);
                        this.f415675h = map;
                        this.f415676i = ((Boolean) dVar.getDeclaredAnnotations().m6(l.class).d(Advice.f415512h).b(Boolean.class)).booleanValue();
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.c.b
                    public final net.bytebuddy.jar.asm.s a(net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.b bVar2, MethodSizeHandler.c cVar, StackMapFrameHandler.b bVar3, TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, SuppressionHandler.a aVar2, RelocationHandler.a aVar3, StackManipulation stackManipulation) {
                        a.d dVar = this.f415680b;
                        return j(bVar2.a(dVar), aVar3, aVar2, cVar.b(dVar), bVar3.b(dVar), aVar, typeDescription, context, stackManipulation, bVar, sVar);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d
                    public final Map<String, TypeDefinition> b() {
                        return this.f415675h;
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d.b
                    public final boolean d() {
                        return this.f415676i;
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d.a
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
                        AbstractC11924b abstractC11924b = (AbstractC11924b) obj;
                        return this.f415676i == abstractC11924b.f415676i && this.f415675h.equals(abstractC11924b.f415675h);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d
                    public final a f(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.b bVar2, MethodSizeHandler.c cVar, StackMapFrameHandler.b bVar3, StackManipulation stackManipulation, RelocationHandler.c cVar2) {
                        return new a(typeDescription, aVar, sVar, context, bVar, bVar2, cVar, bVar3, this.f415683e.c(stackManipulation), this.f415684f.a(aVar, cVar2), stackManipulation, this.f415654g);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.c.b
                    public final TreeMap g(ArgumentHandler argumentHandler) {
                        TreeMap treeMap = new TreeMap();
                        for (Map.Entry entry : this.f415675h.entrySet()) {
                            treeMap.put(Integer.valueOf(argumentHandler.e((String) entry.getKey())), entry.getValue());
                        }
                        return treeMap;
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d.b
                    public final TypeDefinition h() {
                        return this.f415680b.getReturnType();
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d.a
                    public final int hashCode() {
                        return ((this.f415675h.hashCode() + (super.hashCode() * 31)) * 31) + (this.f415676i ? 1 : 0);
                    }

                    public a j(ArgumentHandler.a aVar, RelocationHandler.a aVar2, SuppressionHandler.a aVar3, MethodSizeHandler.b bVar, StackMapFrameHandler.a aVar4, net.bytebuddy.description.method.a aVar5, TypeDescription typeDescription, Implementation.Context context, StackManipulation stackManipulation, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar2, net.bytebuddy.jar.asm.s sVar) {
                        HashMap map = new HashMap();
                        for (Map.Entry entry : this.f415682d.entrySet()) {
                            map.put(entry.getKey(), ((OffsetMapping) entry.getValue()).c(typeDescription, aVar5, bVar2, aVar, OffsetMapping.Sort.f415790b));
                        }
                        return new a(sVar, context, aVar, bVar, aVar4, typeDescription, aVar5, bVar2, this.f415680b, map, aVar3, aVar2, stackManipulation, this.f415681c, false);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$c$b$c, reason: collision with other inner class name */
                public static abstract class AbstractC11926c extends b implements d.c {

                    /* renamed from: h, reason: collision with root package name */
                    public final HashMap f415677h;

                    /* renamed from: i, reason: collision with root package name */
                    public final boolean f415678i;

                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$c$b$c$a */
                    public static class a extends AbstractC11926c {

                        /* renamed from: j, reason: collision with root package name */
                        public final TypeDescription f415679j;

                        public a(a.d dVar, PostProcessor postProcessor, HashMap map, HashMap map2, ArrayList arrayList, net.bytebuddy.jar.asm.e eVar, TypeDefinition typeDefinition, TypeDescription typeDescription) {
                            super(dVar, postProcessor, map, map2, arrayList, eVar, typeDefinition);
                            this.f415679j = typeDescription;
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher.c.b.AbstractC11926c, net.bytebuddy.asm.Advice.Dispatcher.d.a
                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (!super.equals(obj)) {
                                return false;
                            }
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return this.f415679j.equals(((a) obj).f415679j);
                            }
                            return false;
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher.c.b.AbstractC11926c, net.bytebuddy.asm.Advice.Dispatcher.d.a
                        public final int hashCode() {
                            return this.f415679j.hashCode() + (super.hashCode() * 31);
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher.d.c
                        public final TypeDescription n() {
                            return this.f415679j;
                        }
                    }

                    /* renamed from: net.bytebuddy.asm.Advice$Dispatcher$c$b$c$b, reason: collision with other inner class name */
                    public static class C11927b extends AbstractC11926c {
                        public C11927b() {
                            throw null;
                        }

                        @Override // net.bytebuddy.asm.Advice.Dispatcher.d.c
                        public final TypeDescription n() {
                            return j.f415880b;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    @SuppressFBWarnings(justification = "Assuming annotation for exit advice.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public AbstractC11926c(a.d dVar, PostProcessor postProcessor, HashMap map, HashMap map2, ArrayList arrayList, net.bytebuddy.jar.asm.e eVar, TypeDefinition typeDefinition) {
                        super(dVar, postProcessor, net.bytebuddy.utility.a.a(Arrays.asList(OffsetMapping.ForArgument.Unresolved.Factory.f415720b, OffsetMapping.ForAllArguments.Factory.f415710b, OffsetMapping.ForThisReference.Factory.f415775b, OffsetMapping.ForField.Unresolved.Factory.f415734b, OffsetMapping.ForOrigin.Factory.f415744b, OffsetMapping.ForUnusedValue.Factory.f415788b, OffsetMapping.ForStubValue.f415769b, typeDefinition.Q2(Void.TYPE) ? new OffsetMapping.Factory.a(f.class) : new OffsetMapping.a.C11931a(typeDefinition), OffsetMapping.b.a.c(dVar.getReturnType()), new OffsetMapping.c.a(map), OffsetMapping.ForReturnValue.Factory.f415765b, OffsetMapping.ForThrowable.Factory.c(dVar)), arrayList), (TypeDescription) dVar.getDeclaredAnnotations().m6(m.class).d(Advice.f415519o).b(TypeDescription.class), (TypeDescription) dVar.getDeclaredAnnotations().m6(m.class).d(Advice.f415515k).b(TypeDescription.class), eVar);
                        a.d dVar2 = OffsetMapping.a.C11931a.f415797c;
                        this.f415677h = map2;
                        this.f415678i = ((Boolean) dVar.getDeclaredAnnotations().m6(m.class).d(Advice.f415517m).b(Boolean.class)).booleanValue();
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.c.b
                    public final net.bytebuddy.jar.asm.s a(net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.b bVar2, MethodSizeHandler.c cVar, StackMapFrameHandler.b bVar3, TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, SuppressionHandler.a aVar2, RelocationHandler.a aVar3, StackManipulation stackManipulation) {
                        boolean zQ2 = n().Q2(j.class);
                        a.d dVar = this.f415680b;
                        ArgumentHandler.a.AbstractC11908a.b bVarG = bVar2.g(dVar, zQ2);
                        MethodSizeHandler.b bVarA = cVar.a(dVar);
                        StackMapFrameHandler.a aVarA = bVar3.a(dVar);
                        HashMap map = new HashMap();
                        for (Map.Entry entry : this.f415682d.entrySet()) {
                            map.put(entry.getKey(), ((OffsetMapping) entry.getValue()).c(typeDescription, aVar, bVar, bVarG, OffsetMapping.Sort.f415791c));
                        }
                        return new a(sVar, context, bVarG, bVarA, aVarA, typeDescription, aVar, bVar, this.f415680b, map, aVar2, aVar3, stackManipulation, this.f415681c, true);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d
                    public final Map<String, TypeDefinition> b() {
                        return this.f415677h;
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d.a
                    public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        AbstractC11926c abstractC11926c = (AbstractC11926c) obj;
                        return this.f415678i == abstractC11926c.f415678i && this.f415677h.equals(abstractC11926c.f415677h);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d
                    public final a f(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.b bVar2, MethodSizeHandler.c cVar, StackMapFrameHandler.b bVar3, StackManipulation stackManipulation, RelocationHandler.c cVar2) {
                        return new a(typeDescription, aVar, sVar, context, bVar, bVar2, cVar, bVar3, this.f415683e.c(stackManipulation), this.f415684f.a(aVar, cVar2), stackManipulation, this.f415654g);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.c.b
                    public final TreeMap g(ArgumentHandler argumentHandler) {
                        TreeMap treeMap = new TreeMap();
                        for (Map.Entry entry : this.f415677h.entrySet()) {
                            treeMap.put(Integer.valueOf(argumentHandler.e((String) entry.getKey())), entry.getValue());
                        }
                        a.d dVar = this.f415680b;
                        if (!dVar.getReturnType().Q2(Void.TYPE)) {
                            treeMap.put(Integer.valueOf(argumentHandler.f()), dVar.getReturnType());
                        }
                        return treeMap;
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d.a
                    public int hashCode() {
                        return ((this.f415677h.hashCode() + (super.hashCode() * 31)) * 31) + (this.f415678i ? 1 : 0);
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher.d.c
                    public final ArgumentHandler.Factory i() {
                        return this.f415678i ? ArgumentHandler.Factory.f415526c : ArgumentHandler.Factory.f415525b;
                    }

                    @Override // net.bytebuddy.asm.Advice.Dispatcher
                    public final TypeDefinition k() {
                        return this.f415680b.getReturnType();
                    }
                }

                public b(a.d dVar, PostProcessor postProcessor, ArrayList arrayList, TypeDescription typeDescription, TypeDescription typeDescription2, net.bytebuddy.jar.asm.e eVar) {
                    super(dVar, postProcessor, arrayList, typeDescription, typeDescription2, OffsetMapping.Factory.AdviceType.INLINING);
                    this.f415654g = eVar;
                }

                public abstract net.bytebuddy.jar.asm.s a(net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, ArgumentHandler.b bVar2, MethodSizeHandler.c cVar, StackMapFrameHandler.b bVar3, TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, SuppressionHandler.a aVar2, RelocationHandler.a aVar3, StackManipulation stackManipulation);

                public abstract TreeMap g(ArgumentHandler argumentHandler);
            }

            public c(a.d dVar) {
                this.f415636b = dVar;
                Iterator<?> it = dVar.getParameters().iterator();
                while (it.hasNext()) {
                    net.bytebuddy.description.method.c cVar = (net.bytebuddy.description.method.c) it.next();
                    AnnotationDescription.g gVarM6 = cVar.getDeclaredAnnotations().m6(i.class);
                    if (gVarM6 != null) {
                        String str = (String) gVarM6.d(OffsetMapping.c.a.f415810c).b(String.class);
                        TypeDefinition typeDefinition = (TypeDefinition) this.f415637c.put(str, cVar.getType());
                        if (typeDefinition != null && !typeDefinition.equals(cVar.getType())) {
                            throw new IllegalStateException(AK.c.k("Local variable for ", str, " is defined with inconsistent types"));
                        }
                    }
                }
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.e, net.bytebuddy.asm.Advice.Dispatcher.d
            public final Map<String, TypeDefinition> b() {
                return this.f415637c;
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher
            public final boolean c() {
                return true;
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.e
            public final d.c e(ArrayList arrayList, @net.bytebuddy.utility.nullability.b net.bytebuddy.jar.asm.e eVar, e eVar2, PostProcessor.NoOp noOp) {
                HashMap map = new HashMap(eVar2.b());
                HashMap map2 = new HashMap();
                for (Map.Entry entry : this.f415637c.entrySet()) {
                    TypeDefinition typeDefinition = (TypeDefinition) map.get(entry.getKey());
                    TypeDefinition typeDefinition2 = (TypeDefinition) map2.get(entry.getKey());
                    if (typeDefinition == null && typeDefinition2 == null) {
                        map.put(entry.getKey(), entry.getValue());
                        map2.put(entry.getKey(), entry.getValue());
                    } else {
                        if (typeDefinition == null) {
                            typeDefinition = typeDefinition2;
                        }
                        if (!typeDefinition.equals(entry.getValue())) {
                            throw new IllegalStateException(AK.c.s(new StringBuilder("Local variable for "), (String) entry.getKey(), " is defined with inconsistent types"));
                        }
                    }
                }
                noOp.getClass();
                TypeDefinition typeDefinitionK = eVar2.k();
                a.d dVar = this.f415636b;
                TypeDescription typeDescription = (TypeDescription) dVar.getDeclaredAnnotations().m6(m.class).d(Advice.f415516l).b(TypeDescription.class);
                return typeDescription.Q2(j.class) ? new b.AbstractC11926c.C11927b(dVar, noOp, map, map2, arrayList, eVar, typeDefinitionK) : new b.AbstractC11926c.a(dVar, noOp, map, map2, arrayList, eVar, typeDefinitionK, typeDescription);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f415636b.equals(cVar.f415636b) && this.f415637c.equals(cVar.f415637c);
            }

            public final int hashCode() {
                return this.f415637c.hashCode() + ((this.f415636b.hashCode() + (getClass().hashCode() * 31)) * 31);
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher
            public final TypeDefinition k() {
                return this.f415636b.getReturnType().f5();
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.e
            public final d.b l(ArrayList arrayList, @net.bytebuddy.utility.nullability.b net.bytebuddy.jar.asm.e eVar, e eVar2, PostProcessor.NoOp noOp) {
                if (eVar == null) {
                    throw new IllegalStateException("Class reader not expected null");
                }
                noOp.getClass();
                HashMap map = this.f415637c;
                TypeDefinition typeDefinitionK = eVar2.k();
                boolean zC2 = eVar2.c();
                a.d dVar = this.f415636b;
                return zC2 ? new b.AbstractC11924b.C11925b(dVar, noOp, map, arrayList, typeDefinitionK, eVar) : new b.AbstractC11924b.a(dVar, noOp, map, arrayList, typeDefinitionK, eVar);
            }

            @Override // net.bytebuddy.asm.Advice.Dispatcher.e
            public final boolean m() {
                return true;
            }

            public static class a extends net.bytebuddy.jar.asm.s {

                /* renamed from: d, reason: collision with root package name */
                public final net.bytebuddy.jar.asm.s f415638d;

                /* renamed from: e, reason: collision with root package name */
                public final Implementation.Context f415639e;

                /* renamed from: f, reason: collision with root package name */
                public final ArgumentHandler.a f415640f;

                /* renamed from: g, reason: collision with root package name */
                public final MethodSizeHandler.b f415641g;

                /* renamed from: h, reason: collision with root package name */
                public final StackMapFrameHandler.a f415642h;

                /* renamed from: i, reason: collision with root package name */
                public final TypeDescription f415643i;

                /* renamed from: j, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f415644j;

                /* renamed from: k, reason: collision with root package name */
                public final net.bytebuddy.implementation.bytecode.assign.primitive.b f415645k;

                /* renamed from: l, reason: collision with root package name */
                public final a.d f415646l;

                /* renamed from: m, reason: collision with root package name */
                public final HashMap f415647m;

                /* renamed from: n, reason: collision with root package name */
                public final SuppressionHandler.a f415648n;

                /* renamed from: o, reason: collision with root package name */
                public final RelocationHandler.a f415649o;

                /* renamed from: p, reason: collision with root package name */
                public final StackManipulation f415650p;

                /* renamed from: q, reason: collision with root package name */
                public final PostProcessor f415651q;

                /* renamed from: r, reason: collision with root package name */
                public final boolean f415652r;

                /* renamed from: s, reason: collision with root package name */
                public final net.bytebuddy.jar.asm.r f415653s;

                public a(net.bytebuddy.jar.asm.s sVar, Implementation.Context context, ArgumentHandler.a aVar, MethodSizeHandler.b bVar, StackMapFrameHandler.a aVar2, TypeDescription typeDescription, net.bytebuddy.description.method.a aVar3, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar2, a.d dVar, HashMap map, SuppressionHandler.a aVar4, RelocationHandler.a aVar5, StackManipulation stackManipulation, PostProcessor postProcessor, boolean z12) {
                    super(net.bytebuddy.utility.e.f418981b, net.bytebuddy.utility.visitor.e.f419001g ? sVar : new net.bytebuddy.utility.visitor.e(sVar, aVar3));
                    this.f415638d = sVar;
                    this.f415639e = context;
                    this.f415640f = aVar;
                    this.f415641g = bVar;
                    this.f415642h = aVar2;
                    this.f415643i = typeDescription;
                    this.f415644j = aVar3;
                    this.f415645k = bVar2;
                    this.f415646l = dVar;
                    this.f415647m = map;
                    this.f415648n = aVar4;
                    this.f415649o = aVar5;
                    this.f415650p = stackManipulation;
                    this.f415651q = postProcessor;
                    this.f415652r = z12;
                    this.f415653s = new net.bytebuddy.jar.asm.r();
                }

                @Override // net.bytebuddy.jar.asm.s
                @net.bytebuddy.utility.nullability.b
                public final AbstractC44388a D(int i12, String str, boolean z12) {
                    return null;
                }

                @Override // net.bytebuddy.jar.asm.s
                @net.bytebuddy.utility.nullability.b
                public final AbstractC44388a H(int i12, @net.bytebuddy.utility.nullability.b C c12, String str, boolean z12) {
                    return null;
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void J(int i12, int i13) {
                    StackManipulation stackManipulationB;
                    StackSize stackSize;
                    OffsetMapping.f fVar = (OffsetMapping.f) this.f415647m.get(Integer.valueOf(i13));
                    if (fVar == null) {
                        this.f418282c.J(i12, this.f415640f.j(i13));
                        return;
                    }
                    switch (i12) {
                        case 21:
                        case 23:
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            stackManipulationB = fVar.b();
                            stackSize = StackSize.SINGLE;
                            break;
                        case 22:
                        case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                            stackManipulationB = fVar.b();
                            stackSize = StackSize.DOUBLE;
                            break;
                        default:
                            switch (i12) {
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                    stackManipulationB = fVar.a();
                                    stackSize = StackSize.ZERO;
                                    break;
                                default:
                                    throw new IllegalStateException(AK.c.g(i12, "Unexpected opcode: "));
                            }
                    }
                    this.f415641g.f(stackManipulationB.n(this.f418282c, this.f415639e).f417834b - stackSize.f417839b);
                }

                @Override // net.bytebuddy.jar.asm.s
                @net.bytebuddy.utility.nullability.b
                public final AbstractC44388a e(String str, boolean z12) {
                    return null;
                }

                @Override // net.bytebuddy.jar.asm.s
                @net.bytebuddy.utility.nullability.b
                public final AbstractC44388a f() {
                    return null;
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void h() {
                    this.f415648n.d(this.f415638d);
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void i() {
                    a.d dVar = this.f415646l;
                    this.f415648n.e(this.f415638d, this.f415639e, this.f415641g, this.f415642h, dVar.getReturnType());
                    net.bytebuddy.jar.asm.s sVar = this.f415638d;
                    sVar.s(this.f415653s);
                    boolean zQ2 = dVar.getReturnType().Q2(Boolean.TYPE);
                    boolean z12 = this.f415652r;
                    StackMapFrameHandler.a aVar = this.f415642h;
                    ArgumentHandler.a aVar2 = this.f415640f;
                    if (zQ2 || dVar.getReturnType().Q2(Byte.TYPE) || dVar.getReturnType().Q2(Short.TYPE) || dVar.getReturnType().Q2(Character.TYPE) || dVar.getReturnType().Q2(Integer.TYPE)) {
                        aVar.f(sVar);
                        sVar.J(54, z12 ? aVar2.f() : aVar2.k());
                    } else if (dVar.getReturnType().Q2(Long.TYPE)) {
                        aVar.f(sVar);
                        sVar.J(55, z12 ? aVar2.f() : aVar2.k());
                    } else if (dVar.getReturnType().Q2(Float.TYPE)) {
                        aVar.f(sVar);
                        sVar.J(56, z12 ? aVar2.f() : aVar2.k());
                    } else if (dVar.getReturnType().Q2(Double.TYPE)) {
                        aVar.f(sVar);
                        sVar.J(57, z12 ? aVar2.f() : aVar2.k());
                    } else if (!dVar.getReturnType().Q2(Void.TYPE)) {
                        aVar.f(sVar);
                        sVar.J(58, z12 ? aVar2.f() : aVar2.k());
                    }
                    int i12 = this.f415651q.a(this.f415643i, this.f415644j, this.f415645k, this.f415640f, this.f415642h, this.f415650p).n(sVar, this.f415639e).f417834b;
                    MethodSizeHandler.b bVar = this.f415641g;
                    bVar.k(i12);
                    bVar.k(this.f415649o.b(z12 ? aVar2.f() : aVar2.k(), sVar));
                    aVar.c(sVar);
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void k(@net.bytebuddy.utility.nullability.b Object[] objArr, int i12, @net.bytebuddy.utility.nullability.b Object[] objArr2, int i13, int i14) {
                    this.f415642h.h(this.f415638d, i12, i13, objArr, i14, objArr2);
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void l(int i12, int i13) {
                    OffsetMapping.f fVar = (OffsetMapping.f) this.f415647m.get(Integer.valueOf(i12));
                    if (fVar == null) {
                        this.f418282c.l(this.f415640f.j(i12), i13);
                    } else {
                        this.f415641g.f(fVar.c(i13).n(this.f418282c, this.f415639e).f417834b);
                    }
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void m(int i12) {
                    StackSize stackSize = StackSize.DOUBLE;
                    StackSize stackSize2 = StackSize.SINGLE;
                    MethodSizeHandler.b bVar = this.f415641g;
                    switch (i12) {
                        case 172:
                            bVar.e(((net.bytebuddy.utility.visitor.e) this.f418282c).M(54, 21, stackSize2));
                            break;
                        case 173:
                            bVar.e(((net.bytebuddy.utility.visitor.e) this.f418282c).M(55, 22, stackSize));
                            break;
                        case 174:
                            bVar.e(((net.bytebuddy.utility.visitor.e) this.f418282c).M(56, 23, stackSize2));
                            break;
                        case 175:
                            bVar.e(((net.bytebuddy.utility.visitor.e) this.f418282c).M(57, 24, stackSize));
                            break;
                        case 176:
                            bVar.e(((net.bytebuddy.utility.visitor.e) this.f418282c).M(58, 25, stackSize2));
                            break;
                        case 177:
                            net.bytebuddy.utility.visitor.e eVar = (net.bytebuddy.utility.visitor.e) this.f418282c;
                            eVar.L(eVar.f419004d);
                            break;
                        default:
                            this.f418282c.m(i12);
                            return;
                    }
                    this.f418282c.r(167, this.f415653s);
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void y(int i12, int i13) {
                    this.f415641g.h(i12, i13);
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void g(C44390c c44390c) {
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void C(int i12, String str) {
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void d(int i12, boolean z12) {
                }
            }
        }
    }

    public static abstract class b extends net.bytebuddy.utility.visitor.a implements Dispatcher.RelocationHandler.c {

        /* renamed from: e, reason: collision with root package name */
        public final net.bytebuddy.description.method.a f415863e;

        /* renamed from: f, reason: collision with root package name */
        public final net.bytebuddy.jar.asm.r f415864f;

        /* renamed from: g, reason: collision with root package name */
        public final Dispatcher.a f415865g;

        /* renamed from: h, reason: collision with root package name */
        public final Dispatcher.a f415866h;

        /* renamed from: i, reason: collision with root package name */
        public final ArgumentHandler.b f415867i;

        /* renamed from: j, reason: collision with root package name */
        public final MethodSizeHandler.c f415868j;

        /* renamed from: k, reason: collision with root package name */
        public final StackMapFrameHandler.b f415869k;

        public b(net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, StackManipulation stackManipulation, TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, Dispatcher.d.b bVar2, Dispatcher.d.c cVar, List list, int i12, int i13) {
            StackMapFrameHandler.b bVar3;
            super(net.bytebuddy.utility.e.f418981b, sVar);
            this.f415863e = aVar;
            net.bytebuddy.jar.asm.r rVar = new net.bytebuddy.jar.asm.r();
            this.f415864f = rVar;
            TreeMap treeMap = new TreeMap();
            treeMap.putAll(bVar2.b());
            treeMap.putAll(cVar.b());
            ArgumentHandler.b bVarA = cVar.i().a(treeMap, aVar, bVar2.k(), cVar.k());
            this.f415867i = bVarA;
            TypeDefinition typeDefinitionK = cVar.k();
            Class cls = Void.TYPE;
            List listEmptyList = typeDefinitionK.Q2(cls) ? Collections.emptyList() : Collections.singletonList(cVar.k().f5());
            TreeMap treeMap2 = ((ArgumentHandler.b.a) bVarA).f415536c;
            ArrayList arrayList = new ArrayList(treeMap2.size());
            Iterator it = treeMap2.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeDefinition) it.next()).f5());
            }
            ArrayList arrayListA = net.bytebuddy.utility.a.a(listEmptyList, arrayList);
            List listEmptyList2 = bVar2.h().Q2(cls) ? Collections.emptyList() : Collections.singletonList(bVar2.h().f5());
            List listEmptyList3 = bVar2.k().Q2(cls) ? Collections.emptyList() : Collections.singletonList(bVar2.k().f5());
            MethodSizeHandler.c bVar4 = (i12 & 3) != 0 ? MethodSizeHandler.NoOp.f415687b : bVarA.l() ? new MethodSizeHandler.a.b(aVar, arrayListA, listEmptyList3, list) : new MethodSizeHandler.a.c(aVar, arrayListA, listEmptyList3, list);
            this.f415868j = bVar4;
            boolean zC2 = cVar.c();
            boolean zL2 = bVarA.l();
            ClassFileVersion classFileVersionB = context.b();
            if ((i12 & 2) != 0 || classFileVersionB.d(ClassFileVersion.f415296h)) {
                bVar3 = StackMapFrameHandler.NoOp.f415861b;
            } else {
                if (!zC2 && arrayListA.isEmpty()) {
                    bVar3 = new StackMapFrameHandler.Default.b(typeDescription, aVar, Collections.emptyList(), listEmptyList2, Collections.emptyList(), Collections.emptyList(), (i13 & 8) != 0);
                } else if (zL2) {
                    bVar3 = new StackMapFrameHandler.Default.c.a(typeDescription, aVar, arrayListA, listEmptyList2, listEmptyList3, list, (i13 & 8) != 0, true);
                } else {
                    bVar3 = new StackMapFrameHandler.Default.c.b(typeDescription, aVar, arrayListA, listEmptyList2, listEmptyList3, list, (i13 & 8) != 0, !aVar.v0());
                }
            }
            this.f415869k = bVar3;
            this.f415865g = bVar2.f(typeDescription, aVar, sVar, context, bVar, bVarA, bVar4, bVar3, stackManipulation, this);
            this.f415866h = cVar.f(typeDescription, aVar, sVar, context, bVar, bVarA, bVar4, bVar3, stackManipulation, new Dispatcher.RelocationHandler.c.a(rVar));
        }

        @Override // net.bytebuddy.utility.visitor.a
        public final void L() {
            Dispatcher.a aVar = this.f415865g;
            aVar.prepare();
            R();
            Dispatcher.a aVar2 = this.f415866h;
            aVar2.prepare();
            aVar.a();
            aVar2.a();
            net.bytebuddy.jar.asm.s sVar = this.f418282c;
            StackMapFrameHandler.b bVar = this.f415869k;
            bVar.d(sVar);
            aVar.apply();
            this.f418282c.s(this.f415864f);
            this.f415868j.k(this.f415867i.c(this.f418282c));
            bVar.i(this.f418282c);
            this.f418282c.m(0);
            S();
        }

        @Override // net.bytebuddy.utility.visitor.a
        public final void M(@net.bytebuddy.utility.nullability.b Object[] objArr, int i12, @net.bytebuddy.utility.nullability.b Object[] objArr2, int i13, int i14) {
            this.f415869k.h(this.f418282c, i12, i13, objArr, i14, objArr2);
        }

        @Override // net.bytebuddy.utility.visitor.a
        public final void N(int i12, int i13) {
            this.f418282c.l(this.f415867i.d(i12), i13);
        }

        @Override // net.bytebuddy.utility.visitor.a
        public final void P(int i12, int i13) {
            this.f418282c.J(i12, this.f415867i.d(i13));
        }

        public abstract void Q();

        public abstract void R();

        public abstract void S();

        @Override // net.bytebuddy.jar.asm.s
        public final void v(String str, String str2, String str3, net.bytebuddy.jar.asm.r rVar, net.bytebuddy.jar.asm.r rVar2, int i12) {
            net.bytebuddy.jar.asm.s sVar = this.f418282c;
            if (i12 != 0 || !"this".equals(str)) {
                i12 = this.f415867i.b(i12);
            }
            sVar.v(str, str2, str3, rVar, rVar2, i12);
        }

        @Override // net.bytebuddy.jar.asm.s
        public final AbstractC44388a w(int i12, C c12, net.bytebuddy.jar.asm.r[] rVarArr, net.bytebuddy.jar.asm.r[] rVarArr2, int[] iArr, String str, boolean z12) {
            int[] iArr2 = new int[iArr.length];
            for (int i13 = 0; i13 < iArr.length; i13++) {
                iArr2[i13] = this.f415867i.b(iArr[i13]);
            }
            return this.f418282c.w(i12, c12, rVarArr, rVarArr2, iArr2, str, z12);
        }

        @Override // net.bytebuddy.jar.asm.s
        public final void y(int i12, int i13) {
            Q();
            net.bytebuddy.jar.asm.s sVar = this.f418282c;
            MethodSizeHandler.c cVar = this.f415868j;
            sVar.y(cVar.c(i12), cVar.d(i13));
        }

        public static abstract class a extends b {

            /* renamed from: l, reason: collision with root package name */
            public final net.bytebuddy.jar.asm.r f415870l;

            /* renamed from: net.bytebuddy.asm.Advice$b$a$a, reason: collision with other inner class name */
            public static class C11934a extends a {

                /* renamed from: m, reason: collision with root package name */
                public final TypeDescription f415871m;

                /* renamed from: n, reason: collision with root package name */
                public final net.bytebuddy.jar.asm.r f415872n;

                /* renamed from: o, reason: collision with root package name */
                public final net.bytebuddy.jar.asm.r f415873o;

                public C11934a(net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, StackManipulation stackManipulation, TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, Dispatcher.d.b bVar2, Dispatcher.d.c cVar, int i12, int i13, TypeDescription typeDescription2) {
                    super(sVar, context, bVar, stackManipulation, typeDescription, aVar, bVar2, cVar, aVar.getReturnType().Q2(Void.TYPE) ? Collections.singletonList(TypeDescription.f416320D2) : Arrays.asList(aVar.getReturnType().f5(), TypeDescription.f416320D2), i12, i13);
                    this.f415871m = typeDescription2;
                    this.f415872n = new net.bytebuddy.jar.asm.r();
                    this.f415873o = new net.bytebuddy.jar.asm.r();
                }

                @Override // net.bytebuddy.asm.Advice.b
                public final void R() {
                    net.bytebuddy.jar.asm.s sVar = this.f418282c;
                    String strV = this.f415871m.V();
                    sVar.G(this.f415873o, this.f415870l, this.f415872n, strV);
                }

                @Override // net.bytebuddy.asm.Advice.b
                public final void S() {
                    this.f418282c.s(this.f415873o);
                }

                @Override // net.bytebuddy.asm.Advice.b.a
                public final void T() {
                    net.bytebuddy.jar.asm.s sVar = this.f418282c;
                    ArgumentHandler.b bVar = this.f415867i;
                    sVar.J(25, bVar.h());
                    net.bytebuddy.jar.asm.r rVar = new net.bytebuddy.jar.asm.r();
                    this.f418282c.r(198, rVar);
                    this.f418282c.J(25, bVar.h());
                    this.f418282c.m(191);
                    this.f418282c.s(rVar);
                    this.f415869k.k(this.f418282c);
                }

                @Override // net.bytebuddy.asm.Advice.b.a
                public final void U() {
                    net.bytebuddy.jar.asm.s sVar = this.f418282c;
                    StackMapFrameHandler.b bVar = this.f415869k;
                    bVar.f(sVar);
                    net.bytebuddy.description.method.a aVar = this.f415863e;
                    TypeDescription.Generic returnType = aVar.getReturnType();
                    Class cls = Boolean.TYPE;
                    boolean zQ2 = returnType.Q2(cls);
                    ArgumentHandler.b bVar2 = this.f415867i;
                    if (zQ2 || aVar.getReturnType().Q2(Byte.TYPE) || aVar.getReturnType().Q2(Short.TYPE) || aVar.getReturnType().Q2(Character.TYPE) || aVar.getReturnType().Q2(Integer.TYPE)) {
                        this.f418282c.J(54, bVar2.i());
                    } else if (aVar.getReturnType().Q2(Long.TYPE)) {
                        this.f418282c.J(55, bVar2.i());
                    } else if (aVar.getReturnType().Q2(Float.TYPE)) {
                        this.f418282c.J(56, bVar2.i());
                    } else if (aVar.getReturnType().Q2(Double.TYPE)) {
                        this.f418282c.J(57, bVar2.i());
                    } else if (!aVar.getReturnType().Q2(Void.TYPE)) {
                        this.f418282c.J(58, bVar2.i());
                    }
                    this.f418282c.m(1);
                    this.f418282c.J(58, bVar2.h());
                    net.bytebuddy.jar.asm.r rVar = new net.bytebuddy.jar.asm.r();
                    this.f418282c.r(167, rVar);
                    this.f418282c.s(this.f415872n);
                    bVar.e(this.f418282c);
                    this.f418282c.J(58, bVar2.h());
                    if (aVar.getReturnType().Q2(cls) || aVar.getReturnType().Q2(Byte.TYPE) || aVar.getReturnType().Q2(Short.TYPE) || aVar.getReturnType().Q2(Character.TYPE) || aVar.getReturnType().Q2(Integer.TYPE)) {
                        this.f418282c.m(3);
                        this.f418282c.J(54, bVar2.i());
                    } else if (aVar.getReturnType().Q2(Long.TYPE)) {
                        this.f418282c.m(9);
                        this.f418282c.J(55, bVar2.i());
                    } else if (aVar.getReturnType().Q2(Float.TYPE)) {
                        this.f418282c.m(11);
                        this.f418282c.J(56, bVar2.i());
                    } else if (aVar.getReturnType().Q2(Double.TYPE)) {
                        this.f418282c.m(14);
                        this.f418282c.J(57, bVar2.i());
                    } else if (!aVar.getReturnType().Q2(Void.TYPE)) {
                        this.f418282c.m(1);
                        this.f418282c.J(58, bVar2.i());
                    }
                    this.f418282c.s(rVar);
                    this.f415868j.k(1);
                }
            }

            public a(net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, StackManipulation stackManipulation, TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, Dispatcher.d.b bVar2, Dispatcher.d.c cVar, List list, int i12, int i13) {
                super(net.bytebuddy.utility.visitor.e.f419001g ? sVar : new net.bytebuddy.utility.visitor.e(sVar, aVar), context, bVar, stackManipulation, typeDescription, aVar, bVar2, cVar, list, i12, i13);
                this.f415870l = new net.bytebuddy.jar.asm.r();
            }

            @Override // net.bytebuddy.utility.visitor.a
            public final void O(int i12) {
                StackSize stackSize = StackSize.DOUBLE;
                StackSize stackSize2 = StackSize.SINGLE;
                MethodSizeHandler.c cVar = this.f415868j;
                switch (i12) {
                    case 172:
                        cVar.e(((net.bytebuddy.utility.visitor.e) this.f418282c).M(54, 21, stackSize2));
                        break;
                    case 173:
                        cVar.e(((net.bytebuddy.utility.visitor.e) this.f418282c).M(55, 22, stackSize));
                        break;
                    case 174:
                        cVar.e(((net.bytebuddy.utility.visitor.e) this.f418282c).M(56, 23, stackSize2));
                        break;
                    case 175:
                        cVar.e(((net.bytebuddy.utility.visitor.e) this.f418282c).M(57, 24, stackSize));
                        break;
                    case 176:
                        cVar.e(((net.bytebuddy.utility.visitor.e) this.f418282c).M(58, 25, stackSize2));
                        break;
                    case 177:
                        net.bytebuddy.utility.visitor.e eVar = (net.bytebuddy.utility.visitor.e) this.f418282c;
                        eVar.L(eVar.f419004d);
                        break;
                    default:
                        this.f418282c.m(i12);
                        return;
                }
                this.f418282c.r(167, this.f415870l);
            }

            @Override // net.bytebuddy.asm.Advice.b
            public final void Q() {
                this.f418282c.s(this.f415870l);
                U();
                this.f415869k.c(this.f418282c);
                this.f415866h.apply();
                T();
                net.bytebuddy.description.method.a aVar = this.f415863e;
                boolean zQ2 = aVar.getReturnType().Q2(Boolean.TYPE);
                ArgumentHandler.b bVar = this.f415867i;
                if (zQ2 || aVar.getReturnType().Q2(Byte.TYPE) || aVar.getReturnType().Q2(Short.TYPE) || aVar.getReturnType().Q2(Character.TYPE) || aVar.getReturnType().Q2(Integer.TYPE)) {
                    this.f418282c.J(21, bVar.i());
                    this.f418282c.m(172);
                } else if (aVar.getReturnType().Q2(Long.TYPE)) {
                    this.f418282c.J(22, bVar.i());
                    this.f418282c.m(173);
                } else if (aVar.getReturnType().Q2(Float.TYPE)) {
                    this.f418282c.J(23, bVar.i());
                    this.f418282c.m(174);
                } else if (aVar.getReturnType().Q2(Double.TYPE)) {
                    this.f418282c.J(24, bVar.i());
                    this.f418282c.m(175);
                } else if (aVar.getReturnType().Q2(Void.TYPE)) {
                    this.f418282c.m(177);
                } else {
                    this.f418282c.J(25, bVar.i());
                    this.f418282c.m(176);
                }
                this.f415868j.k(aVar.getReturnType().p().f417839b);
            }

            public abstract void T();

            public abstract void U();

            @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.c
            public final void q(net.bytebuddy.jar.asm.s sVar) {
                net.bytebuddy.description.method.a aVar = this.f415863e;
                if (aVar.getReturnType().Q2(Boolean.TYPE) || aVar.getReturnType().Q2(Byte.TYPE) || aVar.getReturnType().Q2(Short.TYPE) || aVar.getReturnType().Q2(Character.TYPE) || aVar.getReturnType().Q2(Integer.TYPE)) {
                    sVar.m(3);
                } else if (aVar.getReturnType().Q2(Long.TYPE)) {
                    sVar.m(9);
                } else if (aVar.getReturnType().Q2(Float.TYPE)) {
                    sVar.m(11);
                } else if (aVar.getReturnType().Q2(Double.TYPE)) {
                    sVar.m(14);
                } else if (!aVar.getReturnType().Q2(Void.TYPE)) {
                    sVar.m(1);
                }
                sVar.r(167, this.f415870l);
            }

            /* renamed from: net.bytebuddy.asm.Advice$b$a$b, reason: collision with other inner class name */
            public static class C11935b extends a {
                @Override // net.bytebuddy.asm.Advice.b.a
                public final void U() {
                    net.bytebuddy.description.method.a aVar = this.f415863e;
                    boolean zQ2 = aVar.getReturnType().Q2(Boolean.TYPE);
                    ArgumentHandler.b bVar = this.f415867i;
                    StackMapFrameHandler.b bVar2 = this.f415869k;
                    if (zQ2 || aVar.getReturnType().Q2(Byte.TYPE) || aVar.getReturnType().Q2(Short.TYPE) || aVar.getReturnType().Q2(Character.TYPE) || aVar.getReturnType().Q2(Integer.TYPE)) {
                        bVar2.f(this.f418282c);
                        this.f418282c.J(54, bVar.i());
                        return;
                    }
                    if (aVar.getReturnType().Q2(Long.TYPE)) {
                        bVar2.f(this.f418282c);
                        this.f418282c.J(55, bVar.i());
                        return;
                    }
                    if (aVar.getReturnType().Q2(Float.TYPE)) {
                        bVar2.f(this.f418282c);
                        this.f418282c.J(56, bVar.i());
                    } else if (aVar.getReturnType().Q2(Double.TYPE)) {
                        bVar2.f(this.f418282c);
                        this.f418282c.J(57, bVar.i());
                    } else {
                        if (aVar.getReturnType().Q2(Void.TYPE)) {
                            return;
                        }
                        bVar2.f(this.f418282c);
                        this.f418282c.J(58, bVar.i());
                    }
                }

                @Override // net.bytebuddy.asm.Advice.b
                public final void R() {
                }

                @Override // net.bytebuddy.asm.Advice.b
                public final void S() {
                }

                @Override // net.bytebuddy.asm.Advice.b.a
                public final void T() {
                }
            }
        }

        /* renamed from: net.bytebuddy.asm.Advice$b$b, reason: collision with other inner class name */
        public static class C11936b extends b {
            @Override // net.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.c
            public final void q(net.bytebuddy.jar.asm.s sVar) {
                net.bytebuddy.description.method.a aVar = this.f415863e;
                if (aVar.getReturnType().Q2(Boolean.TYPE) || aVar.getReturnType().Q2(Byte.TYPE) || aVar.getReturnType().Q2(Short.TYPE) || aVar.getReturnType().Q2(Character.TYPE) || aVar.getReturnType().Q2(Integer.TYPE)) {
                    sVar.m(3);
                    sVar.m(172);
                    return;
                }
                if (aVar.getReturnType().Q2(Long.TYPE)) {
                    sVar.m(9);
                    sVar.m(173);
                    return;
                }
                if (aVar.getReturnType().Q2(Float.TYPE)) {
                    sVar.m(11);
                    sVar.m(174);
                } else if (aVar.getReturnType().Q2(Double.TYPE)) {
                    sVar.m(14);
                    sVar.m(175);
                } else if (aVar.getReturnType().Q2(Void.TYPE)) {
                    sVar.m(177);
                } else {
                    sVar.m(1);
                    sVar.m(176);
                }
            }

            @Override // net.bytebuddy.asm.Advice.b
            public final void Q() {
            }

            @Override // net.bytebuddy.asm.Advice.b
            public final void R() {
            }

            @Override // net.bytebuddy.asm.Advice.b
            public final void S() {
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d implements net.bytebuddy.implementation.bytecode.a {

        /* renamed from: b, reason: collision with root package name */
        public final Advice f415874b;

        /* renamed from: c, reason: collision with root package name */
        public final Implementation.Target f415875c;

        /* renamed from: d, reason: collision with root package name */
        public final net.bytebuddy.implementation.bytecode.a f415876d;

        public d(Advice advice, Implementation.Target target, net.bytebuddy.implementation.bytecode.a aVar) {
            this.f415874b = advice;
            this.f415875c = target;
            this.f415876d = aVar;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f415874b.equals(dVar.f415874b) && this.f415875c.equals(dVar.f415875c) && this.f415876d.equals(dVar.f415876d);
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(net.bytebuddy.jar.asm.s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            a aVar2 = new a(sVar, this.f415876d);
            b bVarD = this.f415874b.d(this.f415875c.a(), aVar, aVar2, context, 0, 0);
            bVarD.h();
            a.c cVarH = aVar2.f415877d.h(bVarD, context, aVar);
            bVarD.y(cVarH.f417849a, cVarH.f417850b);
            bVarD.i();
            return new a.c(aVar2.f415878e, aVar2.f415879f);
        }

        public final int hashCode() {
            return this.f415876d.hashCode() + ((this.f415875c.hashCode() + ((this.f415874b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31);
        }

        public static class a extends net.bytebuddy.jar.asm.s {

            /* renamed from: d, reason: collision with root package name */
            public final net.bytebuddy.implementation.bytecode.a f415877d;

            /* renamed from: e, reason: collision with root package name */
            public int f415878e;

            /* renamed from: f, reason: collision with root package name */
            public int f415879f;

            public a(net.bytebuddy.jar.asm.s sVar, net.bytebuddy.implementation.bytecode.a aVar) {
                super(net.bytebuddy.utility.e.f418981b, sVar);
                this.f415877d = aVar;
            }

            @Override // net.bytebuddy.jar.asm.s
            public final void y(int i12, int i13) {
                this.f415878e = i12;
                this.f415879f = i13;
            }

            @Override // net.bytebuddy.jar.asm.s
            public final void h() {
            }

            @Override // net.bytebuddy.jar.asm.s
            public final void i() {
            }
        }
    }

    public interface StackMapFrameHandler {

        public interface a extends StackMapFrameHandler, c {
        }

        public interface b extends StackMapFrameHandler {
            a a(a.d dVar);

            a b(a.d dVar);

            void d(net.bytebuddy.jar.asm.s sVar);

            void i(net.bytebuddy.jar.asm.s sVar);

            void k(net.bytebuddy.jar.asm.s sVar);

            int m();
        }

        public interface c {
            void l(net.bytebuddy.jar.asm.s sVar, List<? extends TypeDescription> list);
        }

        void c(net.bytebuddy.jar.asm.s sVar);

        void e(net.bytebuddy.jar.asm.s sVar);

        void f(net.bytebuddy.jar.asm.s sVar);

        void h(net.bytebuddy.jar.asm.s sVar, int i12, int i13, @net.bytebuddy.utility.nullability.b Object[] objArr, int i14, @net.bytebuddy.utility.nullability.b Object[] objArr2);

        public static abstract class Default implements b {

            /* renamed from: j, reason: collision with root package name */
            public static final Object[] f415836j = new Object[0];

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f415837b;

            /* renamed from: c, reason: collision with root package name */
            public final net.bytebuddy.description.method.a f415838c;

            /* renamed from: d, reason: collision with root package name */
            public final List<? extends TypeDescription> f415839d;

            /* renamed from: e, reason: collision with root package name */
            public final List<? extends TypeDescription> f415840e;

            /* renamed from: f, reason: collision with root package name */
            public final List<? extends TypeDescription> f415841f;

            /* renamed from: g, reason: collision with root package name */
            public final List<? extends TypeDescription> f415842g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f415843h;

            /* renamed from: i, reason: collision with root package name */
            public int f415844i;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static abstract class Initialization {

                /* renamed from: b, reason: collision with root package name */
                public static final Initialization f415845b;

                /* renamed from: c, reason: collision with root package name */
                public static final Initialization f415846c;

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ Initialization[] f415847d;

                public enum a extends Initialization {
                    @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.Default.Initialization
                    public final Object a(TypeDescription typeDescription) {
                        if (typeDescription.w5()) {
                            throw new IllegalArgumentException(D8.o("Cannot assume primitive uninitialized value: ", typeDescription));
                        }
                        return 6;
                    }
                }

                public enum b extends Initialization {
                    @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.Default.Initialization
                    public final Object a(TypeDescription typeDescription) {
                        if (typeDescription.Q2(Boolean.TYPE) || typeDescription.Q2(Byte.TYPE) || typeDescription.Q2(Short.TYPE) || typeDescription.Q2(Character.TYPE) || typeDescription.Q2(Integer.TYPE)) {
                            return 1;
                        }
                        if (typeDescription.Q2(Long.TYPE)) {
                            return 4;
                        }
                        if (typeDescription.Q2(Float.TYPE)) {
                            return 2;
                        }
                        if (typeDescription.Q2(Double.TYPE)) {
                            return 3;
                        }
                        return typeDescription.V();
                    }
                }

                static {
                    a aVar = new a("UNITIALIZED", 0, null);
                    f415845b = aVar;
                    b bVar = new b("INITIALIZED", 1, null);
                    f415846c = bVar;
                    f415847d = new Initialization[]{aVar, bVar};
                }

                public Initialization() {
                    throw null;
                }

                public Initialization(String str, int i12, a aVar) {
                }

                public static Initialization valueOf(String str) {
                    return (Initialization) Enum.valueOf(Initialization.class, str);
                }

                public static Initialization[] values() {
                    return (Initialization[]) f415847d.clone();
                }

                public abstract Object a(TypeDescription typeDescription);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static abstract class TranslationMode {

                /* renamed from: b, reason: collision with root package name */
                public static final TranslationMode f415848b;

                /* renamed from: c, reason: collision with root package name */
                public static final TranslationMode f415849c;

                /* renamed from: d, reason: collision with root package name */
                public static final TranslationMode f415850d;

                /* renamed from: e, reason: collision with root package name */
                public static final /* synthetic */ TranslationMode[] f415851e;

                public enum a extends TranslationMode {
                    @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode
                    public final int a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, Object[] objArr, Object[] objArr2) {
                        int size = aVar.getParameters().size() + (!aVar.b() ? 1 : 0);
                        System.arraycopy(objArr, 0, objArr2, 0, size);
                        return size;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
                    @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean b(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.a r2, java.lang.Object r3) {
                        /*
                            r0 = this;
                            boolean r2 = r2.v0()
                            if (r2 == 0) goto L11
                            r2 = 6
                            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L1d
                        L11:
                            net.bytebuddy.asm.Advice$StackMapFrameHandler$Default$Initialization r2 = net.bytebuddy.asm.Advice.StackMapFrameHandler.Default.Initialization.f415846c
                            java.lang.Object r1 = r2.a(r1)
                            boolean r1 = r1.equals(r3)
                            if (r1 == 0) goto L1f
                        L1d:
                            r1 = 1
                            goto L20
                        L1f:
                            r1 = 0
                        L20:
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode.a.b(net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.method.a, java.lang.Object):boolean");
                    }
                }

                public enum b extends TranslationMode {
                    @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode
                    public final int a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, Object[] objArr, Object[] objArr2) {
                        int i12 = 0;
                        if (!aVar.b()) {
                            objArr2[0] = aVar.v0() ? 6 : Initialization.f415846c.a(typeDescription);
                            i12 = 1;
                        }
                        Iterator<TypeDescription> it = aVar.getParameters().p2().f1().iterator();
                        while (it.hasNext()) {
                            objArr2[i12] = Initialization.f415846c.a(it.next());
                            i12++;
                        }
                        return i12;
                    }

                    @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode
                    public final boolean b(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, Object obj) {
                        if (!aVar.v0()) {
                            return Initialization.f415846c.a(typeDescription).equals(obj);
                        }
                        Integer num = 6;
                        return num.equals(obj);
                    }
                }

                public enum c extends TranslationMode {
                    @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode
                    public final int a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, Object[] objArr, Object[] objArr2) {
                        int i12 = 0;
                        if (!aVar.b()) {
                            objArr2[0] = Initialization.f415846c.a(typeDescription);
                            i12 = 1;
                        }
                        Iterator<TypeDescription> it = aVar.getParameters().p2().f1().iterator();
                        while (it.hasNext()) {
                            objArr2[i12] = Initialization.f415846c.a(it.next());
                            i12++;
                        }
                        return i12;
                    }

                    @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode
                    public final boolean b(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, Object obj) {
                        return Initialization.f415846c.a(typeDescription).equals(obj);
                    }
                }

                static {
                    a aVar = new a("COPY", 0, null);
                    f415848b = aVar;
                    b bVar = new b("ENTER", 1, null);
                    f415849c = bVar;
                    c cVar = new c("EXIT", 2, null);
                    f415850d = cVar;
                    f415851e = new TranslationMode[]{aVar, bVar, cVar};
                }

                public TranslationMode() {
                    throw null;
                }

                public TranslationMode(String str, int i12, a aVar) {
                }

                public static TranslationMode valueOf(String str) {
                    return (TranslationMode) Enum.valueOf(TranslationMode.class, str);
                }

                public static TranslationMode[] values() {
                    return (TranslationMode[]) f415851e.clone();
                }

                public abstract int a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, Object[] objArr, Object[] objArr2);

                public abstract boolean b(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, Object obj);
            }

            public class a implements a {

                /* renamed from: b, reason: collision with root package name */
                public final a.d f415852b;

                /* renamed from: c, reason: collision with root package name */
                public final List<? extends TypeDescription> f415853c;

                /* renamed from: d, reason: collision with root package name */
                public final List<? extends TypeDescription> f415854d;

                /* renamed from: e, reason: collision with root package name */
                public final List<? extends TypeDescription> f415855e;

                /* renamed from: f, reason: collision with root package name */
                public final TranslationMode f415856f;

                /* renamed from: g, reason: collision with root package name */
                public final Initialization f415857g;

                /* renamed from: h, reason: collision with root package name */
                public boolean f415858h = false;

                public a(a.d dVar, List<? extends TypeDescription> list, List<? extends TypeDescription> list2, List<? extends TypeDescription> list3, TranslationMode translationMode, Initialization initialization) {
                    this.f415852b = dVar;
                    this.f415853c = list;
                    this.f415854d = list2;
                    this.f415855e = list3;
                    this.f415856f = translationMode;
                    this.f415857g = initialization;
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
                public final void c(net.bytebuddy.jar.asm.s sVar) {
                    Default r02 = Default.this;
                    boolean z12 = r02.f415843h;
                    List<? extends TypeDescription> list = this.f415853c;
                    Initialization initialization = this.f415857g;
                    List<? extends TypeDescription> list2 = this.f415855e;
                    if (z12) {
                        r02.g(sVar, initialization, net.bytebuddy.utility.a.a(list, list2), Collections.emptyList());
                        return;
                    }
                    int i12 = r02.f415844i;
                    Object[] objArr = Default.f415836j;
                    int i13 = 0;
                    if (i12 != 0 || (!this.f415858h && list2.size() >= 4)) {
                        if (r02.f415844i >= 3 || !list2.isEmpty()) {
                            r02.g(sVar, initialization, net.bytebuddy.utility.a.a(list, list2), Collections.emptyList());
                            return;
                        } else {
                            sVar.k(objArr, 2, objArr, r02.f415844i, 0);
                            r02.f415844i = 0;
                            return;
                        }
                    }
                    if (this.f415858h || list2.isEmpty()) {
                        sVar.k(objArr, 3, objArr, 0, 0);
                        return;
                    }
                    int size = list2.size();
                    Object[] objArr2 = new Object[size];
                    Iterator<? extends TypeDescription> it = list2.iterator();
                    while (it.hasNext()) {
                        objArr2[i13] = Initialization.f415846c.a(it.next());
                        i13++;
                    }
                    sVar.k(objArr2, 1, objArr, size, 0);
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
                public final void e(net.bytebuddy.jar.asm.s sVar) {
                    Default r02 = Default.this;
                    if (!r02.f415843h && r02.f415844i == 0) {
                        sVar.k(Default.f415836j, 4, new Object[]{B.l(Throwable.class)}, 0, 1);
                    } else {
                        r02.g(sVar, this.f415857g, this.f415853c, Collections.singletonList(TypeDescription.f416320D2));
                    }
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
                public final void f(net.bytebuddy.jar.asm.s sVar) {
                    Default r02 = Default.this;
                    boolean z12 = r02.f415843h;
                    a.d dVar = this.f415852b;
                    if (z12 || r02.f415844i != 0) {
                        r02.g(sVar, this.f415857g, this.f415853c, dVar.getReturnType().Q2(Void.TYPE) ? Collections.emptyList() : Collections.singletonList(dVar.getReturnType().f5()));
                        return;
                    }
                    boolean zQ2 = dVar.getReturnType().Q2(Void.TYPE);
                    Object[] objArr = Default.f415836j;
                    if (zQ2) {
                        sVar.k(objArr, 3, objArr, 0, 0);
                    } else {
                        sVar.k(objArr, 4, new Object[]{Initialization.f415846c.a(dVar.getReturnType().f5())}, 0, 1);
                    }
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
                public final void h(net.bytebuddy.jar.asm.s sVar, int i12, int i13, @net.bytebuddy.utility.nullability.b Object[] objArr, int i14, @net.bytebuddy.utility.nullability.b Object[] objArr2) {
                    Default.this.j(sVar, this.f415856f, this.f415852b, this.f415853c, i12, i13, objArr, i14, objArr2);
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.c
                public final void l(net.bytebuddy.jar.asm.s sVar, List<? extends TypeDescription> list) {
                    Default r02 = Default.this;
                    boolean z12 = r02.f415843h;
                    List<? extends TypeDescription> list2 = this.f415853c;
                    Initialization initialization = this.f415857g;
                    List<? extends TypeDescription> list3 = this.f415854d;
                    if (z12) {
                        r02.g(sVar, initialization, net.bytebuddy.utility.a.a(list2, list3), list);
                    } else {
                        boolean z13 = this.f415858h;
                        Object[] objArr = Default.f415836j;
                        int i12 = 0;
                        if (!z13 || list.size() >= 2) {
                            if (r02.f415844i != 0 || list3.size() >= 4 || (!list.isEmpty() && (list.size() >= 2 || !list3.isEmpty()))) {
                                if (r02.f415844i < 3 && list3.isEmpty() && list.isEmpty()) {
                                    sVar.k(objArr, 2, objArr, r02.f415844i, 0);
                                } else {
                                    r02.g(sVar, initialization, net.bytebuddy.utility.a.a(list2, list3), list);
                                }
                            } else if (!list3.isEmpty()) {
                                int size = list3.size();
                                Object[] objArr2 = new Object[size];
                                Iterator<? extends TypeDescription> it = list3.iterator();
                                while (it.hasNext()) {
                                    objArr2[i12] = Initialization.f415846c.a(it.next());
                                    i12++;
                                }
                                sVar.k(objArr2, 1, objArr, size, 0);
                            } else if (list.isEmpty()) {
                                sVar.k(objArr, 3, objArr, 0, 0);
                            } else {
                                sVar.k(objArr, 4, new Object[]{Initialization.f415846c.a(list.get(0))}, 0, 1);
                            }
                        } else if (list.isEmpty()) {
                            sVar.k(objArr, 3, objArr, 0, 0);
                        } else {
                            sVar.k(objArr, 4, new Object[]{Initialization.f415846c.a(list.get(0))}, 0, 1);
                        }
                    }
                    r02.f415844i = list3.size() - this.f415855e.size();
                    this.f415858h = true;
                }
            }

            public Default(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, List<? extends TypeDescription> list, List<? extends TypeDescription> list2, List<? extends TypeDescription> list3, List<? extends TypeDescription> list4, boolean z12) {
                this.f415837b = typeDescription;
                this.f415838c = aVar;
                this.f415839d = list;
                this.f415840e = list2;
                this.f415841f = list3;
                this.f415842g = list4;
                this.f415843h = z12;
            }

            @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
            public final a b(a.d dVar) {
                return new a(dVar, this.f415839d, this.f415840e, this.f415841f, TranslationMode.f415849c, this.f415838c.v0() ? Initialization.f415845b : Initialization.f415846c);
            }

            public final void g(net.bytebuddy.jar.asm.s sVar, Initialization initialization, List<? extends TypeDescription> list, List<? extends TypeDescription> list2) {
                net.bytebuddy.description.method.a aVar = this.f415838c;
                int i12 = 1;
                int size = list.size() + aVar.getParameters().size() + (!aVar.b() ? 1 : 0);
                Object[] objArr = new Object[size];
                if (aVar.b()) {
                    i12 = 0;
                } else {
                    objArr[0] = initialization.a(this.f415837b);
                }
                Iterator<TypeDescription> it = aVar.getParameters().p2().f1().iterator();
                while (it.hasNext()) {
                    objArr[i12] = Initialization.f415846c.a(it.next());
                    i12++;
                }
                Iterator<? extends TypeDescription> it2 = list.iterator();
                while (it2.hasNext()) {
                    objArr[i12] = Initialization.f415846c.a(it2.next());
                    i12++;
                }
                int size2 = list2.size();
                Object[] objArr2 = new Object[size2];
                Iterator<? extends TypeDescription> it3 = list2.iterator();
                int i13 = 0;
                while (it3.hasNext()) {
                    objArr2[i13] = Initialization.f415846c.a(it3.next());
                    i13++;
                }
                sVar.k(objArr, this.f415843h ? -1 : 0, objArr2, size, size2);
                this.f415844i = 0;
            }

            public void j(net.bytebuddy.jar.asm.s sVar, TranslationMode translationMode, net.bytebuddy.description.method.a aVar, List<? extends TypeDescription> list, int i12, int i13, @net.bytebuddy.utility.nullability.b Object[] objArr, int i14, @net.bytebuddy.utility.nullability.b Object[] objArr2) {
                int i15;
                int i16;
                Object[] objArr3;
                if (i12 == -1 || i12 == 0) {
                    if (aVar.getParameters().size() + (!aVar.b() ? 1 : 0) > i13) {
                        throw new IllegalStateException("Inconsistent frame length for " + aVar + ": " + i13);
                    }
                    boolean zB2 = aVar.b();
                    TypeDescription typeDescription = this.f415837b;
                    net.bytebuddy.description.method.a aVar2 = this.f415838c;
                    if (zB2) {
                        i15 = 0;
                    } else {
                        if (!translationMode.b(typeDescription, aVar2, objArr[0])) {
                            throw new IllegalStateException(aVar + " is inconsistent for 'this' reference: " + objArr[0]);
                        }
                        i15 = 1;
                    }
                    for (int i17 = 0; i17 < aVar.getParameters().size(); i17++) {
                        int i18 = i17 + i15;
                        if (!Initialization.f415846c.a(((net.bytebuddy.description.method.c) aVar.getParameters().get(i17)).getType().f5()).equals(objArr[i18])) {
                            throw new IllegalStateException(aVar + " is inconsistent at " + i17 + ": " + objArr[i18]);
                        }
                    }
                    int size = list.size() + aVar2.getParameters().size() + ((i13 - (!aVar.b() ? 1 : 0)) - aVar.getParameters().size()) + (!aVar2.b() ? 1 : 0);
                    Object[] objArr4 = new Object[size];
                    int iA2 = translationMode.a(typeDescription, aVar2, objArr, objArr4);
                    Iterator<? extends TypeDescription> it = list.iterator();
                    while (it.hasNext()) {
                        objArr4[iA2] = Initialization.f415846c.a(it.next());
                        iA2++;
                    }
                    int i19 = size - iA2;
                    System.arraycopy(objArr, aVar.getParameters().size() + (!aVar.b() ? 1 : 0), objArr4, iA2, i19);
                    this.f415844i = i19;
                    i16 = size;
                    objArr3 = objArr4;
                } else {
                    if (i12 == 1) {
                        this.f415844i += i13;
                    } else if (i12 == 2) {
                        int i22 = this.f415844i - i13;
                        this.f415844i = i22;
                        if (i22 < 0) {
                            throw new IllegalStateException(aVar + " dropped " + Math.abs(this.f415844i) + " implicit frames");
                        }
                    } else if (i12 != 3 && i12 != 4) {
                        throw new IllegalArgumentException(AK.c.g(i12, "Unexpected frame type: "));
                    }
                    objArr3 = objArr;
                    i16 = i13;
                }
                sVar.k(objArr3, i12, objArr2, i16, i14);
            }

            @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
            public final int m() {
                return this.f415843h ? 8 : 0;
            }

            public static abstract class c extends Default {

                /* renamed from: k, reason: collision with root package name */
                public boolean f415860k;

                public static class a extends c {
                    public a() {
                        throw null;
                    }

                    @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
                    @SuppressFBWarnings(justification = "ASM models frames by reference identity.", value = {"RC_REF_COMPARISON_BAD_PRACTICE"})
                    public final void h(net.bytebuddy.jar.asm.s sVar, int i12, int i13, @net.bytebuddy.utility.nullability.b Object[] objArr, int i14, @net.bytebuddy.utility.nullability.b Object[] objArr2) {
                        int i15;
                        Object[] objArr3 = objArr;
                        int i16 = 1;
                        if (i12 == -1 || i12 == 0) {
                            net.bytebuddy.description.method.a aVar = this.f415838c;
                            int size = aVar.getParameters().size() + (!aVar.b() ? 1 : 0) + i13;
                            List<? extends TypeDescription> list = this.f415839d;
                            int size2 = list.size() + size;
                            List<? extends TypeDescription> list2 = this.f415841f;
                            int size3 = list2.size() + size2;
                            Object[] objArr4 = new Object[size3];
                            boolean zV02 = aVar.v0();
                            TypeDescription typeDescription = this.f415837b;
                            if (zV02) {
                                Initialization initialization = Initialization.f415846c;
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= i13) {
                                        break;
                                    }
                                    if (objArr3[i17] == 6) {
                                        initialization = Initialization.f415845b;
                                        break;
                                    }
                                    i17++;
                                }
                                objArr4[0] = initialization.a(typeDescription);
                            } else if (aVar.b()) {
                                i16 = 0;
                            } else {
                                objArr4[0] = Initialization.f415846c.a(typeDescription);
                            }
                            Iterator<TypeDescription> it = aVar.getParameters().p2().f1().iterator();
                            while (it.hasNext()) {
                                objArr4[i16] = Initialization.f415846c.a(it.next());
                                i16++;
                            }
                            Iterator<? extends TypeDescription> it2 = list.iterator();
                            while (it2.hasNext()) {
                                objArr4[i16] = Initialization.f415846c.a(it2.next());
                                i16++;
                            }
                            Iterator<? extends TypeDescription> it3 = list2.iterator();
                            while (it3.hasNext()) {
                                objArr4[i16] = Initialization.f415846c.a(it3.next());
                                i16++;
                            }
                            if (i13 > 0) {
                                System.arraycopy(objArr3, 0, objArr4, i16, i13);
                            }
                            this.f415844i = size3;
                            objArr3 = objArr4;
                            i15 = size3;
                        } else {
                            if (i12 == 1) {
                                this.f415844i += i13;
                            } else if (i12 == 2) {
                                this.f415844i -= i13;
                            } else if (i12 != 3 && i12 != 4) {
                                throw new IllegalArgumentException(AK.c.g(i12, "Unexpected frame type: "));
                            }
                            i15 = i13;
                        }
                        sVar.k(objArr3, i12, objArr2, i15, i14);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[LOOP:0: B:18:0x006d->B:20:0x0073, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
                    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7 A[LOOP:1: B:35:0x00e1->B:37:0x00e7, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x0104 A[LOOP:2: B:39:0x00fe->B:41:0x0104, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x0120 A[LOOP:3: B:43:0x011a->B:45:0x0120, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x0169 A[LOOP:4: B:53:0x0163->B:55:0x0169, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x017d  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x0180  */
                    @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void i(net.bytebuddy.jar.asm.s r17) {
                        /*
                            Method dump skipped, instructions count: 411
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.asm.Advice.StackMapFrameHandler.Default.c.a.i(net.bytebuddy.jar.asm.s):void");
                    }
                }

                public c(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, ArrayList arrayList, List list, List list2, List list3, boolean z12, boolean z13) {
                    super(typeDescription, aVar, arrayList, list, list2, list3, z12);
                    this.f415860k = z13;
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
                public final a a(a.d dVar) {
                    return new a(dVar, net.bytebuddy.utility.a.b(this.f415839d, this.f415841f, this.f415842g), Collections.emptyList(), Collections.emptyList(), TranslationMode.f415850d, Initialization.f415846c);
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
                public final void c(net.bytebuddy.jar.asm.s sVar) {
                    boolean z12 = this.f415860k;
                    List<? extends TypeDescription> list = this.f415842g;
                    if (!z12 || this.f415843h || this.f415844i != 0 || list.size() >= 4) {
                        g(sVar, Initialization.f415846c, net.bytebuddy.utility.a.b(this.f415839d, this.f415841f, list), Collections.emptyList());
                        return;
                    }
                    boolean zIsEmpty = list.isEmpty();
                    Object[] objArr = Default.f415836j;
                    if (zIsEmpty) {
                        sVar.k(objArr, 3, objArr, 0, 0);
                        return;
                    }
                    int size = list.size();
                    Object[] objArr2 = new Object[size];
                    Iterator<? extends TypeDescription> it = list.iterator();
                    int i12 = 0;
                    while (it.hasNext()) {
                        objArr2[i12] = Initialization.f415846c.a(it.next());
                        i12++;
                    }
                    sVar.k(objArr2, 1, objArr, size, 0);
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
                public final void d(net.bytebuddy.jar.asm.s sVar) {
                    List<? extends TypeDescription> list = this.f415839d;
                    if (list.isEmpty()) {
                        return;
                    }
                    Object[] objArr = Default.f415836j;
                    boolean z12 = this.f415843h;
                    int i12 = 0;
                    if (!z12 && list.size() < 4) {
                        int size = list.size();
                        Object[] objArr2 = new Object[size];
                        Iterator<? extends TypeDescription> it = list.iterator();
                        while (it.hasNext()) {
                            objArr2[i12] = Initialization.f415846c.a(it.next());
                            i12++;
                        }
                        sVar.k(objArr2, 1, objArr, size, 0);
                        return;
                    }
                    net.bytebuddy.description.method.a aVar = this.f415838c;
                    int i13 = 1;
                    int size2 = aVar.getParameters().size() + (!aVar.b() ? 1 : 0) + list.size();
                    Object[] objArr3 = new Object[size2];
                    if (aVar.v0()) {
                        objArr3[0] = 6;
                    } else if (aVar.b()) {
                        i13 = 0;
                    } else {
                        objArr3[0] = Initialization.f415846c.a(this.f415837b);
                    }
                    Iterator<TypeDescription> it2 = aVar.getParameters().p2().f1().iterator();
                    while (it2.hasNext()) {
                        objArr3[i13] = Initialization.f415846c.a(it2.next());
                        i13++;
                    }
                    Iterator<? extends TypeDescription> it3 = list.iterator();
                    while (it3.hasNext()) {
                        objArr3[i13] = Initialization.f415846c.a(it3.next());
                        i13++;
                    }
                    sVar.k(objArr3, z12 ? -1 : 0, objArr, size2, 0);
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
                public final void e(net.bytebuddy.jar.asm.s sVar) {
                    if (this.f415843h || this.f415844i != 0) {
                        g(sVar, Initialization.f415846c, net.bytebuddy.utility.a.a(this.f415839d, this.f415841f), Collections.singletonList(TypeDescription.f416320D2));
                    } else {
                        sVar.k(Default.f415836j, 4, new Object[]{B.l(Throwable.class)}, 0, 1);
                    }
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
                public final void f(net.bytebuddy.jar.asm.s sVar) {
                    boolean z12 = this.f415843h;
                    net.bytebuddy.description.method.a aVar = this.f415838c;
                    if (z12 || this.f415844i != 0) {
                        g(sVar, Initialization.f415846c, net.bytebuddy.utility.a.a(this.f415839d, this.f415841f), aVar.getReturnType().Q2(Void.TYPE) ? Collections.emptyList() : Collections.singletonList(aVar.getReturnType().f5()));
                        return;
                    }
                    boolean zQ2 = aVar.getReturnType().Q2(Void.TYPE);
                    Object[] objArr = Default.f415836j;
                    if (zQ2) {
                        sVar.k(objArr, 3, objArr, 0, 0);
                    } else {
                        sVar.k(objArr, 4, new Object[]{Initialization.f415846c.a(aVar.getReturnType().f5())}, 0, 1);
                    }
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.Default
                @SuppressFBWarnings(justification = "ASM models frames by reference identity.", value = {"RC_REF_COMPARISON_BAD_PRACTICE"})
                public final void j(net.bytebuddy.jar.asm.s sVar, TranslationMode translationMode, net.bytebuddy.description.method.a aVar, List<? extends TypeDescription> list, int i12, int i13, @net.bytebuddy.utility.nullability.b Object[] objArr, int i14, @net.bytebuddy.utility.nullability.b Object[] objArr2) {
                    if (i12 == 0 && i13 > 0 && objArr[0] != 6) {
                        this.f415860k = true;
                    }
                    super.j(sVar, translationMode, aVar, list, i12, i13, objArr, i14, objArr2);
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
                public final void k(net.bytebuddy.jar.asm.s sVar) {
                    if (!this.f415843h && this.f415844i == 0) {
                        Object[] objArr = Default.f415836j;
                        sVar.k(objArr, 3, objArr, 0, 0);
                    } else {
                        g(sVar, Initialization.f415846c, net.bytebuddy.utility.a.b(this.f415839d, this.f415841f, this.f415842g), Collections.emptyList());
                    }
                }

                public static class b extends c {
                    public b() {
                        throw null;
                    }

                    @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
                    public final void h(net.bytebuddy.jar.asm.s sVar, int i12, int i13, @net.bytebuddy.utility.nullability.b Object[] objArr, int i14, @net.bytebuddy.utility.nullability.b Object[] objArr2) {
                        j(sVar, TranslationMode.f415848b, this.f415838c, net.bytebuddy.utility.a.a(this.f415839d, this.f415841f), i12, i13, objArr, i14, objArr2);
                    }

                    @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
                    public final void i(net.bytebuddy.jar.asm.s sVar) {
                    }
                }
            }

            public static class b extends Default {
                public b() {
                    throw null;
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
                public final a a(a.d dVar) {
                    throw new IllegalStateException("Did not expect exit advice " + dVar + " for " + this.f415838c);
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
                public final void c(net.bytebuddy.jar.asm.s sVar) {
                    throw new IllegalStateException("Did not expect completion frame for " + this.f415838c);
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
                public final void e(net.bytebuddy.jar.asm.s sVar) {
                    throw new IllegalStateException("Did not expect exception frame for " + this.f415838c);
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
                public final void f(net.bytebuddy.jar.asm.s sVar) {
                    throw new IllegalStateException("Did not expect return frame for " + this.f415838c);
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
                public final void h(net.bytebuddy.jar.asm.s sVar, int i12, int i13, @net.bytebuddy.utility.nullability.b Object[] objArr, int i14, @net.bytebuddy.utility.nullability.b Object[] objArr2) {
                    sVar.k(objArr, i12, objArr2, i13, i14);
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
                public final void k(net.bytebuddy.jar.asm.s sVar) {
                    throw new IllegalStateException("Did not expect post completion frame for " + this.f415838c);
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
                public final void d(net.bytebuddy.jar.asm.s sVar) {
                }

                @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
                public final void i(net.bytebuddy.jar.asm.s sVar) {
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements b, a {

            /* renamed from: b, reason: collision with root package name */
            public static final NoOp f415861b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f415862c;

            static {
                NoOp noOp = new NoOp("INSTANCE", 0);
                f415861b = noOp;
                f415862c = new NoOp[]{noOp};
            }

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f415862c.clone();
            }

            @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
            public final int m() {
                return 4;
            }

            @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
            public final a a(a.d dVar) {
                return this;
            }

            @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
            public final a b(a.d dVar) {
                return this;
            }

            @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
            public final void c(net.bytebuddy.jar.asm.s sVar) {
            }

            @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
            public final void d(net.bytebuddy.jar.asm.s sVar) {
            }

            @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
            public final void e(net.bytebuddy.jar.asm.s sVar) {
            }

            @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
            public final void f(net.bytebuddy.jar.asm.s sVar) {
            }

            @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
            public final void i(net.bytebuddy.jar.asm.s sVar) {
            }

            @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.b
            public final void k(net.bytebuddy.jar.asm.s sVar) {
            }

            @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler.c
            public final void l(net.bytebuddy.jar.asm.s sVar, List<? extends TypeDescription> list) {
            }

            @Override // net.bytebuddy.asm.Advice.StackMapFrameHandler
            public final void h(net.bytebuddy.jar.asm.s sVar, int i12, int i13, @net.bytebuddy.utility.nullability.b Object[] objArr, int i14, @net.bytebuddy.utility.nullability.b Object[] objArr2) {
            }
        }
    }

    public interface ArgumentHandler {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class Factory {

            /* renamed from: b, reason: collision with root package name */
            public static final Factory f415525b;

            /* renamed from: c, reason: collision with root package name */
            public static final Factory f415526c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Factory[] f415527d;

            public enum a extends Factory {
                @Override // net.bytebuddy.asm.Advice.ArgumentHandler.Factory
                public final b a(TreeMap treeMap, net.bytebuddy.description.method.a aVar, TypeDefinition typeDefinition, TypeDefinition typeDefinition2) {
                    return new b.a.C11911b(treeMap, aVar, typeDefinition2, typeDefinition);
                }
            }

            public enum b extends Factory {
                @Override // net.bytebuddy.asm.Advice.ArgumentHandler.Factory
                public final b a(TreeMap treeMap, net.bytebuddy.description.method.a aVar, TypeDefinition typeDefinition, TypeDefinition typeDefinition2) {
                    return new b.a.C11910a(treeMap, aVar, typeDefinition2, typeDefinition);
                }
            }

            static {
                a aVar = new a("SIMPLE", 0, null);
                f415525b = aVar;
                b bVar = new b("COPYING", 1, null);
                f415526c = bVar;
                f415527d = new Factory[]{aVar, bVar};
            }

            public Factory() {
                throw null;
            }

            public Factory(String str, int i12, a aVar) {
            }

            public static Factory valueOf(String str) {
                return (Factory) Enum.valueOf(Factory.class, str);
            }

            public static Factory[] values() {
                return (Factory[]) f415527d.clone();
            }

            public abstract b a(TreeMap treeMap, net.bytebuddy.description.method.a aVar, TypeDefinition typeDefinition, TypeDefinition typeDefinition2);
        }

        public interface b extends ArgumentHandler {

            public static abstract class a implements b {

                /* renamed from: a, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f415534a;

                /* renamed from: b, reason: collision with root package name */
                public final TypeDefinition f415535b;

                /* renamed from: c, reason: collision with root package name */
                public final TreeMap f415536c;

                /* renamed from: d, reason: collision with root package name */
                public final TypeDefinition f415537d;

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.asm.Advice$ArgumentHandler$b$a$a, reason: collision with other inner class name */
                public static class C11910a extends a {
                    public C11910a() {
                        throw null;
                    }

                    @Override // net.bytebuddy.asm.Advice.ArgumentHandler.b
                    public final int b(int i12) {
                        net.bytebuddy.description.method.a aVar = this.f415534a;
                        int size = aVar.getParameters().size() + (!aVar.b() ? 1 : 0);
                        Class cls = Void.TYPE;
                        return this.f415536c.size() + size + (!this.f415535b.Q2(cls) ? 1 : 0) + (!this.f415537d.Q2(cls) ? 1 : 0) + i12;
                    }

                    @Override // net.bytebuddy.asm.Advice.ArgumentHandler.b
                    public final int c(net.bytebuddy.jar.asm.s sVar) {
                        StackSize stackSize;
                        net.bytebuddy.description.method.a aVar = this.f415534a;
                        boolean zB2 = aVar.b();
                        TreeMap treeMap = this.f415536c;
                        TypeDefinition typeDefinition = this.f415537d;
                        TypeDefinition typeDefinition2 = this.f415535b;
                        if (zB2) {
                            stackSize = StackSize.ZERO;
                        } else {
                            sVar.J(25, 0);
                            sVar.J(58, StackSize.a(treeMap.values()) + aVar.p() + typeDefinition2.p().f417839b + typeDefinition.p().f417839b);
                            stackSize = StackSize.SINGLE;
                        }
                        Iterator<?> it = aVar.getParameters().iterator();
                        while (it.hasNext()) {
                            net.bytebuddy.description.method.c cVar = (net.bytebuddy.description.method.c) it.next();
                            B bV2 = B.v(cVar.getType().f5().getDescriptor());
                            sVar.J(bV2.q(21), cVar.getOffset());
                            sVar.J(bV2.q(54), cVar.getOffset() + StackSize.a(treeMap.values()) + aVar.p() + typeDefinition2.p().f417839b + typeDefinition.p().f417839b);
                            StackSize stackSizeP = cVar.getType().p();
                            int iOrdinal = stackSize.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    int iOrdinal2 = stackSizeP.ordinal();
                                    if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            throw new AssertionError();
                                        }
                                    }
                                } else if (iOrdinal != 2) {
                                    throw new AssertionError();
                                }
                            }
                            stackSize = stackSizeP;
                        }
                        return stackSize.f417839b;
                    }

                    @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                    public final int d(int i12) {
                        return StackSize.a(this.f415536c.values()) + this.f415534a.p() + this.f415535b.p().f417839b + this.f415537d.p().f417839b + i12;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass();
                    }

                    public final int hashCode() {
                        return getClass().hashCode();
                    }

                    @Override // net.bytebuddy.asm.Advice.ArgumentHandler.b
                    public final boolean l() {
                        return true;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.asm.Advice$ArgumentHandler$b$a$b, reason: collision with other inner class name */
                public static class C11911b extends a {
                    public C11911b() {
                        throw null;
                    }

                    @Override // net.bytebuddy.asm.Advice.ArgumentHandler.b
                    public final int b(int i12) {
                        net.bytebuddy.description.method.a aVar = this.f415534a;
                        if (i12 < aVar.getParameters().size() + (!aVar.b() ? 1 : 0)) {
                            return i12;
                        }
                        Class cls = Void.TYPE;
                        return (!this.f415537d.Q2(cls) ? 1 : 0) + this.f415536c.size() + i12 + (!this.f415535b.Q2(cls) ? 1 : 0);
                    }

                    @Override // net.bytebuddy.asm.Advice.ArgumentHandler.b
                    public final int c(net.bytebuddy.jar.asm.s sVar) {
                        return 0;
                    }

                    @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                    public final int d(int i12) {
                        if (i12 < this.f415534a.p()) {
                            return i12;
                        }
                        return this.f415537d.p().f417839b + StackSize.a(this.f415536c.values()) + i12 + this.f415535b.p().f417839b;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass();
                    }

                    public final int hashCode() {
                        return getClass().hashCode();
                    }

                    @Override // net.bytebuddy.asm.Advice.ArgumentHandler.b
                    public final boolean l() {
                        return false;
                    }
                }

                public a(TreeMap treeMap, net.bytebuddy.description.method.a aVar, TypeDefinition typeDefinition, TypeDefinition typeDefinition2) {
                    this.f415534a = aVar;
                    this.f415536c = treeMap;
                    this.f415535b = typeDefinition;
                    this.f415537d = typeDefinition2;
                }

                @Override // net.bytebuddy.asm.Advice.ArgumentHandler.b
                public final a.AbstractC11908a.C11909a a(net.bytebuddy.description.method.a aVar) {
                    return new a.AbstractC11908a.C11909a(this.f415534a, aVar, this.f415535b, this.f415536c);
                }

                @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                public final int e(String str) {
                    return StackSize.a(this.f415536c.headMap(str).values()) + this.f415534a.p() + this.f415535b.p().f417839b;
                }

                @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                public final int f() {
                    return this.f415534a.p();
                }

                @Override // net.bytebuddy.asm.Advice.ArgumentHandler.b
                public final a.AbstractC11908a.b g(net.bytebuddy.description.method.a aVar, boolean z12) {
                    return new a.AbstractC11908a.b(this.f415534a, aVar, this.f415535b, this.f415536c, this.f415537d, z12 ? StackSize.ZERO : StackSize.SINGLE);
                }

                @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                public final int h() {
                    net.bytebuddy.description.method.a aVar = this.f415534a;
                    return StackSize.a(this.f415536c.values()) + aVar.p() + this.f415535b.p().f417839b + this.f415537d.p().f417839b + aVar.getReturnType().p().f417839b;
                }

                @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                public final int i() {
                    return StackSize.a(this.f415536c.values()) + this.f415534a.p() + this.f415535b.p().f417839b + this.f415537d.p().f417839b;
                }

                @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                public final int k() {
                    return StackSize.a(this.f415536c.values()) + this.f415534a.p() + this.f415535b.p().f417839b;
                }
            }

            a.AbstractC11908a.C11909a a(net.bytebuddy.description.method.a aVar);

            int b(int i12);

            int c(net.bytebuddy.jar.asm.s sVar);

            a.AbstractC11908a.b g(net.bytebuddy.description.method.a aVar, boolean z12);

            boolean l();
        }

        int d(int i12);

        int e(String str);

        int f();

        int h();

        int i();

        int k();

        public interface a extends ArgumentHandler {
            int j(int i12);

            /* renamed from: net.bytebuddy.asm.Advice$ArgumentHandler$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC11908a implements a {

                /* renamed from: a, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f415528a;

                /* renamed from: b, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f415529b;

                /* renamed from: c, reason: collision with root package name */
                public final TypeDefinition f415530c;

                /* renamed from: d, reason: collision with root package name */
                public final TreeMap f415531d;

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.asm.Advice$ArgumentHandler$a$a$a, reason: collision with other inner class name */
                public static class C11909a extends AbstractC11908a {
                    public C11909a() {
                        throw null;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass();
                    }

                    @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                    public final int h() {
                        throw new IllegalStateException("Cannot resolve the thrown value offset during enter advice");
                    }

                    public final int hashCode() {
                        return getClass().hashCode();
                    }

                    @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                    public final int i() {
                        throw new IllegalStateException("Cannot resolve the return value offset during enter advice");
                    }

                    @Override // net.bytebuddy.asm.Advice.ArgumentHandler.a
                    public final int j(int i12) {
                        return ((StackSize.a(this.f415531d.values()) + (this.f415528a.p() + this.f415530c.p().f417839b)) - this.f415529b.p()) + i12;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.asm.Advice$ArgumentHandler$a$a$b */
                public static class b extends AbstractC11908a {

                    /* renamed from: e, reason: collision with root package name */
                    public final TypeDefinition f415532e;

                    /* renamed from: f, reason: collision with root package name */
                    public final StackSize f415533f;

                    public b(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2, TypeDefinition typeDefinition, TreeMap treeMap, TypeDefinition typeDefinition2, StackSize stackSize) {
                        super(aVar, aVar2, typeDefinition, treeMap);
                        this.f415532e = typeDefinition2;
                        this.f415533f = stackSize;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return this.f415533f.equals(bVar.f415533f) && this.f415532e.equals(bVar.f415532e);
                    }

                    @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                    public final int h() {
                        net.bytebuddy.description.method.a aVar = this.f415528a;
                        return StackSize.a(this.f415531d.values()) + aVar.p() + this.f415530c.p().f417839b + this.f415532e.p().f417839b + aVar.getReturnType().p().f417839b;
                    }

                    public final int hashCode() {
                        return this.f415533f.hashCode() + ((this.f415532e.hashCode() + (getClass().hashCode() * 31)) * 31);
                    }

                    @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                    public final int i() {
                        return StackSize.a(this.f415531d.values()) + this.f415528a.p() + this.f415530c.p().f417839b + this.f415532e.p().f417839b;
                    }

                    @Override // net.bytebuddy.asm.Advice.ArgumentHandler.a
                    public final int j(int i12) {
                        net.bytebuddy.description.method.a aVar = this.f415528a;
                        return (((((StackSize.a(this.f415531d.values()) + (aVar.p() + this.f415530c.p().f417839b)) + this.f415532e.p().f417839b) + aVar.getReturnType().p().f417839b) + this.f415533f.f417839b) - this.f415529b.p()) + i12;
                    }
                }

                public AbstractC11908a(net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.a aVar2, TypeDefinition typeDefinition, TreeMap treeMap) {
                    this.f415528a = aVar;
                    this.f415529b = aVar2;
                    this.f415530c = typeDefinition;
                    this.f415531d = treeMap;
                }

                @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                public final int e(String str) {
                    return StackSize.a(this.f415531d.headMap(str).values()) + this.f415528a.p() + this.f415530c.p().f417839b;
                }

                @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                public final int f() {
                    return this.f415528a.p();
                }

                @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                public final int k() {
                    return StackSize.a(this.f415531d.values()) + this.f415528a.p() + this.f415530c.p().f417839b;
                }

                @Override // net.bytebuddy.asm.Advice.ArgumentHandler
                public final int d(int i12) {
                    return i12;
                }
            }
        }
    }

    public interface MethodSizeHandler {

        public static abstract class a implements c {

            /* renamed from: b, reason: collision with root package name */
            public final net.bytebuddy.description.method.a f415689b;

            /* renamed from: c, reason: collision with root package name */
            public final ArrayList f415690c;

            /* renamed from: d, reason: collision with root package name */
            public final List<? extends TypeDescription> f415691d;

            /* renamed from: e, reason: collision with root package name */
            public final List<? extends TypeDescription> f415692e;

            /* renamed from: f, reason: collision with root package name */
            public int f415693f;

            /* renamed from: g, reason: collision with root package name */
            public int f415694g;

            /* renamed from: net.bytebuddy.asm.Advice$MethodSizeHandler$a$a, reason: collision with other inner class name */
            public class C11928a implements b {

                /* renamed from: b, reason: collision with root package name */
                public final a.d f415695b;

                /* renamed from: c, reason: collision with root package name */
                public final int f415696c;

                /* renamed from: d, reason: collision with root package name */
                public int f415697d;

                /* renamed from: e, reason: collision with root package name */
                public int f415698e;

                public C11928a(a.d dVar, int i12) {
                    this.f415695b = dVar;
                    this.f415696c = i12;
                }

                @Override // net.bytebuddy.asm.Advice.MethodSizeHandler
                public final void e(int i12) {
                    a.this.e(i12);
                }

                @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.b
                public final void f(int i12) {
                    this.f415697d = Math.max(this.f415697d, i12);
                }

                @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.b
                public final void h(int i12, int i13) {
                    int i14 = i12 + this.f415697d;
                    a aVar = a.this;
                    aVar.k(i14);
                    aVar.e((i13 - this.f415695b.p()) + this.f415696c + this.f415698e);
                }

                @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.b
                public final void i(int i12) {
                    this.f415698e = Math.max(this.f415698e, i12);
                }

                @Override // net.bytebuddy.asm.Advice.MethodSizeHandler
                public final void k(int i12) {
                    a.this.k(i12);
                }
            }

            public static class b extends a {
                public b() {
                    throw null;
                }

                @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.c
                public final b a(a.d dVar) {
                    return new C11928a(dVar, StackSize.a(this.f415692e) + StackSize.a(this.f415691d) + StackSize.a(this.f415690c) + (this.f415689b.p() * 2));
                }

                @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.a, net.bytebuddy.asm.Advice.MethodSizeHandler.c
                public final int d(int i12) {
                    return Math.max(this.f415694g, StackSize.a(this.f415691d) + StackSize.a(this.f415690c) + StackSize.a(this.f415692e) + this.f415689b.p() + i12);
                }
            }

            public static class c extends a {
                public c() {
                    throw null;
                }

                @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.c
                public final b a(a.d dVar) {
                    return new C11928a(dVar, StackSize.a(this.f415691d) + StackSize.a(this.f415690c) + StackSize.a(this.f415692e) + this.f415689b.p());
                }

                @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.a, net.bytebuddy.asm.Advice.MethodSizeHandler.c
                public final int d(int i12) {
                    return Math.max(this.f415694g, StackSize.a(this.f415691d) + StackSize.a(this.f415690c) + StackSize.a(this.f415692e) + i12);
                }
            }

            public a(net.bytebuddy.description.method.a aVar, ArrayList arrayList, List list, List list2) {
                this.f415689b = aVar;
                this.f415690c = arrayList;
                this.f415691d = list;
                this.f415692e = list2;
            }

            @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.c
            public final b b(a.d dVar) {
                return new C11928a(dVar, StackSize.a(this.f415690c) + this.f415689b.p());
            }

            @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.c
            public final int c(int i12) {
                return Math.max(this.f415693f, i12);
            }

            @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.c
            public int d(int i12) {
                return Math.max(this.f415694g, StackSize.a(this.f415691d) + StackSize.a(this.f415690c) + StackSize.a(this.f415692e) + i12);
            }

            @Override // net.bytebuddy.asm.Advice.MethodSizeHandler
            public final void e(int i12) {
                this.f415694g = Math.max(this.f415694g, i12);
            }

            @Override // net.bytebuddy.asm.Advice.MethodSizeHandler
            public final void k(int i12) {
                this.f415693f = Math.max(this.f415693f, i12);
            }
        }

        public interface b extends MethodSizeHandler {
            void f(int i12);

            void h(int i12, int i13);

            void i(int i12);
        }

        public interface c extends MethodSizeHandler {
            b a(a.d dVar);

            b b(a.d dVar);

            int c(int i12);

            int d(int i12);
        }

        void e(int i12);

        void k(int i12);

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements c, b {

            /* renamed from: b, reason: collision with root package name */
            public static final NoOp f415687b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f415688c;

            static {
                NoOp noOp = new NoOp("INSTANCE", 0);
                f415687b = noOp;
                f415688c = new NoOp[]{noOp};
            }

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f415688c.clone();
            }

            @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.c
            public final int c(int i12) {
                return 32767;
            }

            @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.c
            public final int d(int i12) {
                return 32767;
            }

            @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.c
            public final b a(a.d dVar) {
                return this;
            }

            @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.c
            public final b b(a.d dVar) {
                return this;
            }

            @Override // net.bytebuddy.asm.Advice.MethodSizeHandler
            public final void e(int i12) {
            }

            @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.b
            public final void f(int i12) {
            }

            @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.b
            public final void i(int i12) {
            }

            @Override // net.bytebuddy.asm.Advice.MethodSizeHandler
            public final void k(int i12) {
            }

            @Override // net.bytebuddy.asm.Advice.MethodSizeHandler.b
            public final void h(int i12, int i13) {
            }
        }
    }
}
