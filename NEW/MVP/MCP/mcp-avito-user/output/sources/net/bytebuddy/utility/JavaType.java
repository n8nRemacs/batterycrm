package net.bytebuddy.utility;

import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import net.bytebuddy.build.k;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF5' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class JavaType {

    /* renamed from: e, reason: collision with root package name */
    public static final JavaType f418901e;

    /* renamed from: f, reason: collision with root package name */
    public static final JavaType f418902f;

    /* renamed from: g, reason: collision with root package name */
    public static final JavaType f418903g;

    /* renamed from: h, reason: collision with root package name */
    public static final JavaType f418904h;

    /* renamed from: i, reason: collision with root package name */
    public static final JavaType f418905i;

    /* renamed from: j, reason: collision with root package name */
    public static final JavaType f418906j;

    /* renamed from: k, reason: collision with root package name */
    public static final JavaType f418907k;

    /* renamed from: l, reason: collision with root package name */
    public static final JavaType f418908l;

    /* renamed from: m, reason: collision with root package name */
    public static final JavaType f418909m;

    /* renamed from: n, reason: collision with root package name */
    public static final JavaType f418910n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ JavaType[] f418911o;

    /* renamed from: b, reason: collision with root package name */
    public final a f418912b;

    /* renamed from: c, reason: collision with root package name */
    public transient /* synthetic */ Class f418913c;

    /* renamed from: d, reason: collision with root package name */
    public transient /* synthetic */ Boolean f418914d;

    /* JADX INFO: Fake field, exist only in values array */
    JavaType EF10;

    /* JADX INFO: Fake field, exist only in values array */
    JavaType EF5;

    public static class a extends TypeDescription.f {
        public a() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b.a, net.bytebuddy.description.type.TypeDescription
        public final String l0() {
            String str = this.f416508e;
            int iMax = Math.max(str.lastIndexOf(36), str.lastIndexOf(46));
            return iMax == -1 ? str : str.substring(iMax + 1);
        }
    }

    static {
        TypeDescription.d dVar = TypeDescription.f416317A2;
        JavaType javaType = new JavaType("CONSTABLE", 0, "java.lang.constant.Constable", 1537, (TypeDefinition) null, new TypeDefinition[0]);
        JavaType javaType2 = new JavaType("TYPE_DESCRIPTOR", 1, "java.lang.invoke.TypeDescriptor", 1537, (TypeDefinition) null, new TypeDefinition[0]);
        f418901e = javaType2;
        a aVar = javaType2.f418912b;
        JavaType javaType3 = new JavaType("TYPE_DESCRIPTOR_OF_FIELD", 2, "java.lang.invoke.TypeDescriptor$OfField", 1537, (TypeDefinition) null, aVar);
        JavaType javaType4 = new JavaType("TYPE_DESCRIPTOR_OF_METHOD", 3, "java.lang.invoke.TypeDescriptor$OfMethod", 1537, (TypeDefinition) null, aVar);
        JavaType javaType5 = new JavaType("CONSTANT_DESCRIPTION", 4, "java.lang.constant.ConstantDesc", 1537, (TypeDefinition) null, new TypeDefinition[0]);
        TypeDescription.d dVar2 = TypeDescription.f416317A2;
        a aVar2 = javaType5.f418912b;
        JavaType javaType6 = new JavaType("DYNAMIC_CONSTANT_DESCRIPTION", 5, "java.lang.constant.DynamicConstantDesc", 1025, dVar2, aVar2);
        JavaType javaType7 = new JavaType("CLASS_DESCRIPTION", 6, "java.lang.constant.ClassDesc", 1537, (TypeDefinition) null, aVar2, javaType3.f418912b);
        a aVar3 = javaType4.f418912b;
        JavaType javaType8 = new JavaType("METHOD_TYPE_DESCRIPTION", 7, "java.lang.constant.MethodTypeDesc", 1537, (TypeDefinition) null, aVar2, aVar3);
        JavaType javaType9 = new JavaType("METHOD_HANDLE_DESCRIPTION", 8, "java.lang.constant.MethodHandleDesc", 1537, (TypeDefinition) null, aVar2);
        JavaType javaType10 = new JavaType("DIRECT_METHOD_HANDLE_DESCRIPTION", 9, "java.lang.constant.DirectMethodHandleDesc", 1537, (TypeDefinition) null, javaType9.f418912b);
        a aVar4 = javaType.f418912b;
        JavaType javaType11 = new JavaType("METHOD_HANDLE", 10, "java.lang.invoke.MethodHandle", 1025, dVar2, aVar4);
        f418902f = javaType11;
        JavaType javaType12 = new JavaType("METHOD_HANDLES", 11, "java.lang.invoke.MethodHandles", 1, Object.class, new Type[0]);
        JavaType javaType13 = new JavaType("METHOD_TYPE", 12, "java.lang.invoke.MethodType", 17, dVar2, aVar4, aVar3, TypeDescription.d.A0(Serializable.class));
        f418903g = javaType13;
        JavaType javaType14 = new JavaType("METHOD_HANDLES_LOOKUP", 13, "java.lang.invoke.MethodHandles$Lookup", 25, Object.class, new Type[0]);
        f418904h = javaType14;
        JavaType javaType15 = new JavaType("CALL_SITE", 14, "java.lang.invoke.CallSite", 1025, Object.class, new Type[0]);
        f418905i = javaType15;
        JavaType javaType16 = new JavaType("VAR_HANDLE", 15, "java.lang.invoke.VarHandle", 1025, TypeDescription.Generic.f416323x2, aVar4);
        JavaType javaType17 = new JavaType("PARAMETER", 16, "java.lang.reflect.Parameter", 17, Object.class, AnnotatedElement.class);
        JavaType javaType18 = new JavaType("EXECUTABLE", 17, "java.lang.reflect.Executable", 1025, AccessibleObject.class, Member.class, GenericDeclaration.class);
        f418906j = javaType18;
        JavaType javaType19 = new JavaType("MODULE", 18, "java.lang.Module", 17, Object.class, AnnotatedElement.class);
        f418907k = javaType19;
        JavaType javaType20 = new JavaType("CONSTANT_BOOTSTRAPS", 19, "java.lang.invoke.ConstantBootstraps", 17, Object.class, new Type[0]);
        JavaType javaType21 = new JavaType("RECORD", 20, "java.lang.Record", 1025, Object.class, new Type[0]);
        f418908l = javaType21;
        JavaType javaType22 = new JavaType("OBJECT_METHODS", 21, "java.lang.runtime.ObjectMethods", 1, Object.class, new Type[0]);
        f418909m = javaType22;
        JavaType javaType23 = new JavaType("ACCESS_CONTROL_CONTEXT", 22, "java.security.AccessControlContext", 17, (TypeDefinition) null, new TypeDefinition[0]);
        f418910n = javaType23;
        f418911o = new JavaType[]{javaType, javaType2, javaType3, javaType4, javaType5, javaType6, javaType7, javaType8, javaType9, javaType10, javaType11, javaType12, javaType13, javaType14, javaType15, javaType16, javaType17, javaType18, javaType19, javaType20, javaType21, javaType22, javaType23};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JavaType(String str, int i12, @net.bytebuddy.utility.nullability.b String str2, int i13, TypeDefinition typeDefinition, TypeDefinition... typeDefinitionArr) {
        TypeDescription.Generic genericP0;
        if (typeDefinition == null) {
            TypeDescription.Generic.d.b bVar = TypeDescription.Generic.f416323x2;
            genericP0 = null;
        } else {
            genericP0 = typeDefinition.P0();
        }
        this(str, i12, str2, i13, genericP0, new d.f.c(typeDefinitionArr));
    }

    public static JavaType valueOf(String str) {
        return (JavaType) Enum.valueOf(JavaType.class, str);
    }

    public static JavaType[] values() {
        return (JavaType[]) f418911o.clone();
    }

    public final boolean a() {
        Boolean bool;
        if (this.f418914d != null) {
            bool = null;
        } else {
            try {
                c();
                bool = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                bool = Boolean.FALSE;
            }
        }
        if (bool == null) {
            bool = this.f418914d;
        } else {
            this.f418914d = bool;
        }
        return bool.booleanValue();
    }

    public final boolean b(Object obj) {
        if (!a()) {
            return false;
        }
        try {
            return c().isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @k.c
    public final Class<?> c() {
        Class<?> cls = this.f418913c == null ? Class.forName(this.f418912b.f416508e, false, null) : null;
        if (cls == null) {
            return this.f418913c;
        }
        this.f418913c = cls;
        return cls;
    }

    public JavaType(String str, int i12, @net.bytebuddy.utility.nullability.b String str2, int i13, TypeDescription.Generic generic, d.f.a aVar) {
        this.f418912b = new a(str2, i13, generic, aVar);
    }

    public JavaType(String str, int i12, @net.bytebuddy.utility.nullability.b String str2, int i13, Class cls, Type... typeArr) {
        this(str, i12, str2, i13, TypeDefinition.Sort.a(cls, TypeDescription.Generic.AnnotationReader.NoOp.f416326b), new d.f.e(typeArr));
    }
}
