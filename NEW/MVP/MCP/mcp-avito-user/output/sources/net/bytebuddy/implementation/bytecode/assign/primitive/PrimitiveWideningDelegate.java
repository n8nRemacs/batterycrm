package net.bytebuddy.implementation.bytecode.assign.primitive;

import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'j' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class PrimitiveWideningDelegate {

    /* renamed from: j, reason: collision with root package name */
    public static final PrimitiveWideningDelegate f417900j;

    /* renamed from: k, reason: collision with root package name */
    public static final PrimitiveWideningDelegate f417901k;

    /* renamed from: l, reason: collision with root package name */
    public static final PrimitiveWideningDelegate f417902l;

    /* renamed from: m, reason: collision with root package name */
    public static final PrimitiveWideningDelegate f417903m;

    /* renamed from: n, reason: collision with root package name */
    public static final PrimitiveWideningDelegate f417904n;

    /* renamed from: o, reason: collision with root package name */
    public static final PrimitiveWideningDelegate f417905o;

    /* renamed from: p, reason: collision with root package name */
    public static final PrimitiveWideningDelegate f417906p;

    /* renamed from: q, reason: collision with root package name */
    public static final PrimitiveWideningDelegate f417907q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ PrimitiveWideningDelegate[] f417908r;

    /* renamed from: b, reason: collision with root package name */
    public final Enum f417909b;

    /* renamed from: c, reason: collision with root package name */
    public final Enum f417910c;

    /* renamed from: d, reason: collision with root package name */
    public final Enum f417911d;

    /* renamed from: e, reason: collision with root package name */
    public final Enum f417912e;

    /* renamed from: f, reason: collision with root package name */
    public final Enum f417913f;

    /* renamed from: g, reason: collision with root package name */
    public final StackManipulation f417914g;

    /* renamed from: h, reason: collision with root package name */
    public final StackManipulation f417915h;

    /* renamed from: i, reason: collision with root package name */
    public final StackManipulation f417916i;

    static {
        StackManipulation.Trivial trivial = StackManipulation.Trivial.f417829b;
        StackManipulation.Illegal illegal = StackManipulation.Illegal.f417827b;
        PrimitiveWideningDelegate primitiveWideningDelegate = new PrimitiveWideningDelegate("BOOLEAN", 0, trivial, illegal, illegal, illegal, illegal, illegal, illegal, illegal);
        f417900j = primitiveWideningDelegate;
        StackSize stackSize = StackSize.SINGLE;
        int i12 = 133;
        StackManipulation.a aVar = new StackManipulation.a(i12, stackSize.c()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        };
        StackSize stackSize2 = StackSize.ZERO;
        PrimitiveWideningDelegate primitiveWideningDelegate2 = new PrimitiveWideningDelegate("BYTE", 1, illegal, trivial, trivial, illegal, trivial, aVar, new StackManipulation.a(134, stackSize2.c()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        }, new StackManipulation.a(i12, stackSize.c()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        });
        f417901k = primitiveWideningDelegate2;
        PrimitiveWideningDelegate primitiveWideningDelegate3 = new PrimitiveWideningDelegate("SHORT", 2, illegal, illegal, trivial, illegal, trivial, new StackManipulation.a(i12, stackSize.c()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        }, new StackManipulation.a(134, stackSize2.c()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        }, new StackManipulation.a(135, stackSize.c()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        });
        f417902l = primitiveWideningDelegate3;
        PrimitiveWideningDelegate primitiveWideningDelegate4 = new PrimitiveWideningDelegate("CHARACTER", 3, illegal, illegal, illegal, trivial, trivial, new StackManipulation.a(i12, stackSize.c()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        }, new StackManipulation.a(134, stackSize2.c()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        }, new StackManipulation.a(135, stackSize.c()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        });
        f417903m = primitiveWideningDelegate4;
        PrimitiveWideningDelegate primitiveWideningDelegate5 = new PrimitiveWideningDelegate("INTEGER", 4, illegal, illegal, illegal, illegal, trivial, new StackManipulation.a(i12, stackSize.c()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        }, new StackManipulation.a(134, stackSize2.c()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        }, new StackManipulation.a(135, stackSize.c()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        });
        f417904n = primitiveWideningDelegate5;
        PrimitiveWideningDelegate primitiveWideningDelegate6 = new PrimitiveWideningDelegate("LONG", 5, illegal, illegal, illegal, illegal, illegal, trivial, new StackManipulation.a(137, stackSize.b()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        }, new StackManipulation.a(138, stackSize2.c()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        });
        f417905o = primitiveWideningDelegate6;
        PrimitiveWideningDelegate primitiveWideningDelegate7 = new PrimitiveWideningDelegate("FLOAT", 6, illegal, illegal, illegal, illegal, illegal, illegal, trivial, new StackManipulation.a(141, stackSize.c()) { // from class: net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.a

            /* renamed from: b, reason: collision with root package name */
            public final int f417917b;

            /* renamed from: c, reason: collision with root package name */
            public final StackManipulation.d f417918c;

            {
                this.f417917b = i12;
                this.f417918c = dVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar2 = (a) obj;
                return this.f417917b == aVar2.f417917b && this.f417918c.equals(aVar2.f417918c);
            }

            public final int hashCode() {
                return this.f417918c.hashCode() + (((getClass().hashCode() * 31) + this.f417917b) * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.m(this.f417917b);
                return this.f417918c;
            }
        });
        f417906p = primitiveWideningDelegate7;
        PrimitiveWideningDelegate primitiveWideningDelegate8 = new PrimitiveWideningDelegate("DOUBLE", 7, illegal, illegal, illegal, illegal, illegal, illegal, illegal, trivial);
        f417907q = primitiveWideningDelegate8;
        f417908r = new PrimitiveWideningDelegate[]{primitiveWideningDelegate, primitiveWideningDelegate2, primitiveWideningDelegate3, primitiveWideningDelegate4, primitiveWideningDelegate5, primitiveWideningDelegate6, primitiveWideningDelegate7, primitiveWideningDelegate8};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrimitiveWideningDelegate(String str, int i12, StackManipulation stackManipulation, StackManipulation stackManipulation2, StackManipulation stackManipulation3, StackManipulation stackManipulation4, StackManipulation stackManipulation5, StackManipulation stackManipulation6, StackManipulation stackManipulation7, StackManipulation stackManipulation8) {
        this.f417909b = (Enum) stackManipulation;
        this.f417910c = (Enum) stackManipulation2;
        this.f417911d = (Enum) stackManipulation3;
        this.f417912e = (Enum) stackManipulation4;
        this.f417913f = (Enum) stackManipulation5;
        this.f417914g = stackManipulation6;
        this.f417915h = stackManipulation7;
        this.f417916i = stackManipulation8;
    }

    public static PrimitiveWideningDelegate a(TypeDefinition typeDefinition) {
        if (typeDefinition.Q2(Boolean.TYPE)) {
            return f417900j;
        }
        if (typeDefinition.Q2(Byte.TYPE)) {
            return f417901k;
        }
        if (typeDefinition.Q2(Short.TYPE)) {
            return f417902l;
        }
        if (typeDefinition.Q2(Character.TYPE)) {
            return f417903m;
        }
        if (typeDefinition.Q2(Integer.TYPE)) {
            return f417904n;
        }
        if (typeDefinition.Q2(Long.TYPE)) {
            return f417905o;
        }
        if (typeDefinition.Q2(Float.TYPE)) {
            return f417906p;
        }
        if (typeDefinition.Q2(Double.TYPE)) {
            return f417907q;
        }
        throw new IllegalArgumentException("Not a primitive, non-void type: " + typeDefinition);
    }

    public static PrimitiveWideningDelegate valueOf(String str) {
        return (PrimitiveWideningDelegate) Enum.valueOf(PrimitiveWideningDelegate.class, str);
    }

    public static PrimitiveWideningDelegate[] values() {
        return (PrimitiveWideningDelegate[]) f417908r.clone();
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Enum, net.bytebuddy.implementation.bytecode.StackManipulation] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Enum, net.bytebuddy.implementation.bytecode.StackManipulation] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Enum, net.bytebuddy.implementation.bytecode.StackManipulation] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Enum, net.bytebuddy.implementation.bytecode.StackManipulation] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Enum, net.bytebuddy.implementation.bytecode.StackManipulation] */
    public final StackManipulation b(TypeDescription.Generic generic) {
        if (generic.Q2(Boolean.TYPE)) {
            return this.f417909b;
        }
        if (generic.Q2(Byte.TYPE)) {
            return this.f417910c;
        }
        if (generic.Q2(Short.TYPE)) {
            return this.f417911d;
        }
        if (generic.Q2(Character.TYPE)) {
            return this.f417912e;
        }
        if (generic.Q2(Integer.TYPE)) {
            return this.f417913f;
        }
        if (generic.Q2(Long.TYPE)) {
            return this.f417914g;
        }
        if (generic.Q2(Float.TYPE)) {
            return this.f417915h;
        }
        if (generic.Q2(Double.TYPE)) {
            return this.f417916i;
        }
        throw new IllegalArgumentException("Not a primitive non-void type: " + generic);
    }
}
