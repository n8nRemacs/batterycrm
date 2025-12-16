package net.bytebuddy.implementation.bind.annotation;

import androidx.camera.view.k;
import androidx.compose.ui.graphics.colorspace.e;
import com.yandex.div2.D8;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.enumeration.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.FieldLocator;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.AllArguments;
import net.bytebuddy.implementation.bind.annotation.Argument;
import net.bytebuddy.implementation.bind.annotation.Default;
import net.bytebuddy.implementation.bind.annotation.DefaultCall;
import net.bytebuddy.implementation.bind.annotation.DefaultMethod;
import net.bytebuddy.implementation.bind.annotation.Empty;
import net.bytebuddy.implementation.bind.annotation.FieldValue;
import net.bytebuddy.implementation.bind.annotation.Origin;
import net.bytebuddy.implementation.bind.annotation.StubValue;
import net.bytebuddy.implementation.bind.annotation.Super;
import net.bytebuddy.implementation.bind.annotation.SuperCall;
import net.bytebuddy.implementation.bind.annotation.SuperMethod;
import net.bytebuddy.implementation.bind.annotation.This;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import net.bytebuddy.implementation.bytecode.constant.DoubleConstant;
import net.bytebuddy.implementation.bytecode.constant.FloatConstant;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.constant.JavaConstantValue;
import net.bytebuddy.implementation.bytecode.constant.LongConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.C44413w;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.K;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.JavaType;

/* compiled from: TargetMethodAnnotationDrivenBinder.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class c implements MethodDelegationBinder {

    /* renamed from: a, reason: collision with root package name */
    public final a f417770a;

    /* compiled from: TargetMethodAnnotationDrivenBinder.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f417771a;

        /* compiled from: TargetMethodAnnotationDrivenBinder.java */
        /* renamed from: net.bytebuddy.implementation.bind.annotation.c$a$a, reason: collision with other inner class name */
        public interface InterfaceC12097a {

            /* compiled from: TargetMethodAnnotationDrivenBinder.java */
            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.bind.annotation.c$a$a$a, reason: collision with other inner class name */
            public static class C12098a<T extends Annotation> implements InterfaceC12097a {

                /* renamed from: a, reason: collision with root package name */
                public final net.bytebuddy.description.method.c f417772a;

                /* renamed from: b, reason: collision with root package name */
                public final b<T> f417773b;

                /* renamed from: c, reason: collision with root package name */
                public final AnnotationDescription.g<T> f417774c;

                /* renamed from: d, reason: collision with root package name */
                public final Assigner.Typing f417775d;

                public C12098a(net.bytebuddy.description.method.c cVar, b<T> bVar, AnnotationDescription.g<T> gVar, Assigner.Typing typing) {
                    this.f417772a = cVar;
                    this.f417773b = bVar;
                    this.f417774c = gVar;
                    this.f417775d = typing;
                }

                @Override // net.bytebuddy.implementation.bind.annotation.c.a.InterfaceC12097a
                public final boolean a() {
                    return true;
                }

                @Override // net.bytebuddy.implementation.bind.annotation.c.a.InterfaceC12097a
                public final MethodDelegationBinder.ParameterBinding b(net.bytebuddy.description.method.a aVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar) {
                    return this.f417773b.a(this.f417774c, aVar, this.f417772a, target, bVar, this.f417775d);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    C12098a c12098a = (C12098a) obj;
                    return this.f417775d.equals(c12098a.f417775d) && this.f417772a.equals(c12098a.f417772a) && this.f417773b.equals(c12098a.f417773b) && this.f417774c.equals(c12098a.f417774c);
                }

                public final int hashCode() {
                    return this.f417775d.hashCode() + ((this.f417774c.hashCode() + ((this.f417773b.hashCode() + ((this.f417772a.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31)) * 31);
                }
            }

            /* compiled from: TargetMethodAnnotationDrivenBinder.java */
            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.bind.annotation.c$a$a$b */
            public static class b implements InterfaceC12097a {

                /* renamed from: a, reason: collision with root package name */
                public final net.bytebuddy.description.method.c f417776a;

                /* renamed from: b, reason: collision with root package name */
                public final Assigner.Typing f417777b;

                /* compiled from: TargetMethodAnnotationDrivenBinder.java */
                /* renamed from: net.bytebuddy.implementation.bind.annotation.c$a$a$b$a, reason: collision with other inner class name */
                public static class C12099a implements Argument {

                    /* renamed from: A, reason: collision with root package name */
                    public final int f417778A;

                    public C12099a(int i12) {
                        this.f417778A = i12;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final Class<Argument> annotationType() {
                        return Argument.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this != obj) {
                            if (obj instanceof Argument) {
                                if (this.f417778A == ((Argument) obj).value()) {
                                }
                            }
                            return false;
                        }
                        return true;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return (Argument.BindingMechanic.f417663b.hashCode() ^ 1957906263) + (1335633679 ^ this.f417778A);
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("@");
                        e.u(Argument.class, sb2, "(bindingMechanic=");
                        sb2.append(Argument.BindingMechanic.f417663b);
                        sb2.append(", value=");
                        return AK.c.i(this.f417778A, ")", sb2);
                    }

                    @Override // net.bytebuddy.implementation.bind.annotation.Argument
                    public final int value() {
                        return this.f417778A;
                    }
                }

                public b(net.bytebuddy.description.method.c cVar, Assigner.Typing typing) {
                    this.f417776a = cVar;
                    this.f417777b = typing;
                }

                @Override // net.bytebuddy.implementation.bind.annotation.c.a.InterfaceC12097a
                public final boolean a() {
                    return false;
                }

                @Override // net.bytebuddy.implementation.bind.annotation.c.a.InterfaceC12097a
                public final MethodDelegationBinder.ParameterBinding b(net.bytebuddy.description.method.a aVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar) {
                    Argument.Binder binder = Argument.Binder.f417659b;
                    net.bytebuddy.description.method.c cVar = this.f417776a;
                    return binder.a(new AnnotationDescription.e(Argument.class, new C12099a(cVar.getIndex())), aVar, cVar, target, bVar, this.f417777b);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.f417777b.equals(bVar.f417777b) && this.f417776a.equals(bVar.f417776a);
                }

                public final int hashCode() {
                    return this.f417777b.hashCode() + ((this.f417776a.hashCode() + (getClass().hashCode() * 31)) * 31);
                }
            }

            boolean a();

            MethodDelegationBinder.ParameterBinding b(net.bytebuddy.description.method.a aVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar);
        }

        public a(HashMap map) {
            this.f417771a = map;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f417771a.equals(((a) obj).f417771a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f417771a.hashCode() + (getClass().hashCode() * 31);
        }
    }

    /* compiled from: TargetMethodAnnotationDrivenBinder.java */
    @SuppressFBWarnings(justification = "Safe initialization is implied.", value = {"IC_SUPERCLASS_USES_SUBCLASS_DURING_INITIALIZATION"})
    public interface b<T extends Annotation> {

        /* renamed from: L2, reason: collision with root package name */
        public static final List<b<?>> f417779L2 = Collections.unmodifiableList(Arrays.asList(Argument.Binder.f417659b, AllArguments.Binder.f417654b, Origin.Binder.f417724b, This.Binder.f417767b, Super.Binder.f417739b, Default.Binder.f417668b, SuperCall.Binder.f417753b, DefaultCall.Binder.f417675b, SuperMethod.Binder.f417758b, DefaultMethod.Binder.f417683b, FieldValue.Binder.f417709c, StubValue.Binder.f417737b, Empty.Binder.f417695b));

        /* compiled from: TargetMethodAnnotationDrivenBinder.java */
        public static abstract class a<S extends Annotation> implements b<S> {
            @Override // net.bytebuddy.implementation.bind.annotation.c.b
            public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
                FieldLocator.Resolution resolutionK;
                String strSubstring;
                TypeDescription typeDescriptionD = d(gVar);
                Class cls = Void.TYPE;
                boolean zQ2 = typeDescriptionD.Q2(cls);
                MethodDelegationBinder.ParameterBinding.Illegal illegal = MethodDelegationBinder.ParameterBinding.Illegal.f417632b;
                if (!zQ2) {
                    if (d(gVar).w5() || d(gVar).w2()) {
                        throw new IllegalStateException(D8.m("A primitive type or array type cannot declare a field: ", aVar));
                    }
                    if (!target.a().m5(d(gVar))) {
                        return illegal;
                    }
                }
                FieldLocator forClassHierarchy = d(gVar).Q2(cls) ? new FieldLocator.ForClassHierarchy(target.a()) : new FieldLocator.c(d(gVar), target.a());
                if (e(gVar).equals("")) {
                    if (C44411u.w("set").a(C44411u.z(1)).a(new K(new C44413w(C44411u.f(TypeDescription.f416321E2)))).b(aVar)) {
                        strSubstring = aVar.V().substring(3);
                    } else if (((InterfaceC44410t.a.b) C44411u.o()).b(aVar)) {
                        strSubstring = aVar.V().substring(aVar.V().startsWith("is") ? 2 : 3);
                    } else {
                        resolutionK = FieldLocator.Resolution.Illegal.f416821b;
                    }
                    resolutionK = forClassHierarchy.K(Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1));
                } else {
                    resolutionK = forClassHierarchy.K(e(gVar));
                }
                return resolutionK.b() ? (!aVar.b() || resolutionK.a().b()) ? c(resolutionK.a(), cVar, bVar) : illegal : illegal;
            }

            public abstract MethodDelegationBinder.ParameterBinding c(net.bytebuddy.description.field.a aVar, net.bytebuddy.description.method.c cVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar);

            public abstract TypeDescription d(AnnotationDescription.g<S> gVar);

            public abstract String e(AnnotationDescription.g<S> gVar);
        }

        /* compiled from: TargetMethodAnnotationDrivenBinder.java */
        /* renamed from: net.bytebuddy.implementation.bind.annotation.c$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC12100b<S extends Annotation> implements b<S> {

            /* compiled from: TargetMethodAnnotationDrivenBinder.java */
            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.bind.annotation.c$b$b$a */
            public static class a<U extends Annotation> extends AbstractC12100b<U> {

                /* renamed from: b, reason: collision with root package name */
                public final Class<U> f417780b;

                /* renamed from: c, reason: collision with root package name */
                @HashCodeAndEqualsPlugin.ValueHandling
                @net.bytebuddy.utility.nullability.b
                public final String f417781c;

                public a(Class cls, @net.bytebuddy.utility.nullability.b String str) {
                    this.f417780b = cls;
                    this.f417781c = str;
                }

                public static a d(Class cls, @net.bytebuddy.utility.nullability.b String str) {
                    return new a(cls, str);
                }

                @Override // net.bytebuddy.implementation.bind.annotation.c.b
                public final Class<U> b() {
                    return this.f417780b;
                }

                @Override // net.bytebuddy.implementation.bind.annotation.c.b.AbstractC12100b
                @net.bytebuddy.utility.nullability.b
                public final Object c() {
                    return this.f417781c;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean equals(@net.bytebuddy.utility.nullability.b java.lang.Object r5) {
                    /*
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        net.bytebuddy.implementation.bind.annotation.c$b$b$a r5 = (net.bytebuddy.implementation.bind.annotation.c.b.AbstractC12100b.a) r5
                        java.lang.Class<U extends java.lang.annotation.Annotation> r2 = r5.f417780b
                        java.lang.Class<U extends java.lang.annotation.Annotation> r3 = r4.f417780b
                        boolean r2 = r3.equals(r2)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.lang.String r2 = r4.f417781c
                        java.lang.String r5 = r5.f417781c
                        if (r5 == 0) goto L2f
                        if (r2 == 0) goto L31
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L32
                        return r1
                    L2f:
                        if (r2 == 0) goto L32
                    L31:
                        return r1
                    L32:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.implementation.bind.annotation.c.b.AbstractC12100b.a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    int iHashCode = (this.f417780b.hashCode() + (getClass().hashCode() * 31)) * 31;
                    String str = this.f417781c;
                    return str != null ? iHashCode + str.hashCode() : iHashCode;
                }
            }

            @Override // net.bytebuddy.implementation.bind.annotation.c.b
            public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
                TypeDescription typeDescriptionA0;
                StackManipulation javaConstantValue;
                TypeDescription typeDescriptionT;
                JavaConstantValue javaConstantValue2;
                StackManipulation stackManipulationC;
                Object objC = c();
                if (objC == null) {
                    return new MethodDelegationBinder.ParameterBinding.a(DefaultValue.c(cVar.getType()));
                }
                if (objC instanceof Boolean) {
                    stackManipulationC = ((Boolean) objC).booleanValue() ? IntegerConstant.ONE : IntegerConstant.ZERO;
                    typeDescriptionA0 = TypeDescription.d.A0(Boolean.TYPE);
                } else if (objC instanceof Byte) {
                    stackManipulationC = IntegerConstant.c(((Byte) objC).byteValue());
                    typeDescriptionA0 = TypeDescription.d.A0(Byte.TYPE);
                } else if (objC instanceof Short) {
                    stackManipulationC = IntegerConstant.c(((Short) objC).shortValue());
                    typeDescriptionA0 = TypeDescription.d.A0(Short.TYPE);
                } else if (objC instanceof Character) {
                    stackManipulationC = IntegerConstant.c(((Character) objC).charValue());
                    typeDescriptionA0 = TypeDescription.d.A0(Character.TYPE);
                } else if (objC instanceof Integer) {
                    stackManipulationC = IntegerConstant.c(((Integer) objC).intValue());
                    typeDescriptionA0 = TypeDescription.d.A0(Integer.TYPE);
                } else if (objC instanceof Long) {
                    stackManipulationC = LongConstant.c(((Long) objC).longValue());
                    typeDescriptionA0 = TypeDescription.d.A0(Long.TYPE);
                } else if (objC instanceof Float) {
                    stackManipulationC = FloatConstant.c(((Float) objC).floatValue());
                    typeDescriptionA0 = TypeDescription.d.A0(Float.TYPE);
                } else if (objC instanceof Double) {
                    stackManipulationC = DoubleConstant.c(((Double) objC).doubleValue());
                    typeDescriptionA0 = TypeDescription.d.A0(Double.TYPE);
                } else {
                    if (objC instanceof String) {
                        javaConstantValue = new net.bytebuddy.implementation.bytecode.constant.c((String) objC);
                        typeDescriptionT = TypeDescription.f416318B2;
                    } else if (objC instanceof Class) {
                        stackManipulationC = ClassConstant.c(TypeDescription.d.A0((Class) objC));
                        typeDescriptionA0 = TypeDescription.f416319C2;
                    } else if (objC instanceof TypeDescription) {
                        stackManipulationC = ClassConstant.c((TypeDescription) objC);
                        typeDescriptionA0 = TypeDescription.f416319C2;
                    } else if (objC instanceof Enum) {
                        Enum r32 = (Enum) objC;
                        javaConstantValue = FieldAccess.a(new a.b(r32));
                        typeDescriptionT = TypeDescription.d.A0(r32.getDeclaringClass());
                    } else if (objC instanceof net.bytebuddy.description.enumeration.a) {
                        net.bytebuddy.description.enumeration.a aVar2 = (net.bytebuddy.description.enumeration.a) objC;
                        javaConstantValue = FieldAccess.a(aVar2);
                        typeDescriptionT = aVar2.w();
                    } else {
                        JavaType javaType = JavaType.f418902f;
                        boolean zB2 = javaType.b(objC);
                        typeDescriptionA0 = javaType.f418912b;
                        if (zB2) {
                            javaConstantValue2 = new JavaConstantValue(JavaConstant.MethodHandle.b(objC));
                        } else if (objC instanceof JavaConstant.MethodHandle) {
                            javaConstantValue2 = new JavaConstantValue((JavaConstant.MethodHandle) objC);
                        } else if (JavaType.f418903g.b(objC)) {
                            javaConstantValue2 = new JavaConstantValue(JavaConstant.c.b(objC));
                        } else {
                            if (!(objC instanceof JavaConstant)) {
                                throw new IllegalStateException(k.a(objC, "Not able to save in class's constant pool: "));
                            }
                            JavaConstant javaConstant = (JavaConstant) objC;
                            javaConstantValue = new JavaConstantValue(javaConstant);
                            typeDescriptionT = javaConstant.t();
                        }
                        stackManipulationC = javaConstantValue2;
                    }
                    StackManipulation stackManipulation = javaConstantValue;
                    typeDescriptionA0 = typeDescriptionT;
                    stackManipulationC = stackManipulation;
                }
                return new MethodDelegationBinder.ParameterBinding.a(new StackManipulation.b(stackManipulationC, bVar.a(typeDescriptionA0.P0(), cVar.getType(), typing)));
            }

            @net.bytebuddy.utility.nullability.b
            public abstract Object c();
        }

        MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing);

        Class<T> b();
    }

    /* compiled from: TargetMethodAnnotationDrivenBinder.java */
    @HashCodeAndEqualsPlugin.Enhance
    /* renamed from: net.bytebuddy.implementation.bind.annotation.c$c, reason: collision with other inner class name */
    public static class C12101c implements MethodDelegationBinder.Record {

        /* renamed from: b, reason: collision with root package name */
        public final net.bytebuddy.description.method.a f417782b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f417783c;

        /* renamed from: d, reason: collision with root package name */
        public final Assigner.Typing f417784d;

        public C12101c(net.bytebuddy.description.method.a aVar, ArrayList arrayList, Assigner.Typing typing) {
            this.f417782b = aVar;
            this.f417783c = arrayList;
            this.f417784d = typing;
        }

        @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.Record
        public final MethodDelegationBinder.MethodBinding a(Implementation.Target target, net.bytebuddy.description.method.a aVar, MethodDelegationBinder.TerminationHandler.Default r12, MethodDelegationBinder.MethodInvoker methodInvoker, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar) {
            LinkedHashMap<Object, Integer> linkedHashMap;
            Object objK;
            int i12;
            TypeDescription typeDescriptionA = target.a();
            net.bytebuddy.description.method.a aVar2 = this.f417782b;
            boolean zP2 = aVar2.P(typeDescriptionA);
            MethodDelegationBinder.MethodBinding.Illegal illegal = MethodDelegationBinder.MethodBinding.Illegal.f417618b;
            if (!zP2) {
                return illegal;
            }
            StackManipulation stackManipulationA = r12.a(bVar, this.f417784d, aVar, aVar2);
            if (!stackManipulationA.isValid()) {
                return illegal;
            }
            MethodDelegationBinder.MethodBinding.a aVar3 = new MethodDelegationBinder.MethodBinding.a(methodInvoker, aVar2);
            Iterator it = this.f417783c.iterator();
            do {
                boolean zHasNext = it.hasNext();
                linkedHashMap = aVar3.f417623d;
                ArrayList arrayList = aVar3.f417622c;
                if (!zHasNext) {
                    net.bytebuddy.description.method.a aVar4 = aVar3.f417621b;
                    if (aVar4.getParameters().size() == aVar3.f417624e) {
                        return new MethodDelegationBinder.MethodBinding.a.C12092a(aVar4, linkedHashMap, aVar3.f417620a.a(aVar4), arrayList, stackManipulationA);
                    }
                    throw new IllegalStateException("The number of parameters bound does not equal the target's number of parameters");
                }
                MethodDelegationBinder.ParameterBinding parameterBindingB = ((a.InterfaceC12097a) it.next()).b(aVar, target, bVar);
                if (!parameterBindingB.isValid()) {
                    break;
                }
                arrayList.add(parameterBindingB);
                objK = parameterBindingB.k();
                i12 = aVar3.f417624e;
                aVar3.f417624e = i12 + 1;
            } while (linkedHashMap.put(objK, Integer.valueOf(i12)) == null);
            return illegal;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C12101c c12101c = (C12101c) obj;
            return this.f417784d.equals(c12101c.f417784d) && this.f417782b.equals(c12101c.f417782b) && this.f417783c.equals(c12101c.f417783c);
        }

        public final int hashCode() {
            return this.f417784d.hashCode() + e.g(this.f417783c, D8.h(this.f417782b, getClass().hashCode() * 31, 31), 31);
        }

        public final String toString() {
            return this.f417782b.toString();
        }
    }

    public c(a aVar) {
        this.f417770a = aVar;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f417770a.equals(((c) obj).f417770a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f417770a.hashCode() + (getClass().hashCode() * 31);
    }
}
