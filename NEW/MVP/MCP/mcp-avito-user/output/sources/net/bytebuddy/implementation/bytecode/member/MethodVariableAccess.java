package net.bytebuddy.implementation.bytecode.member;

import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.build.k;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class MethodVariableAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final MethodVariableAccess f418080e;

    /* renamed from: f, reason: collision with root package name */
    public static final MethodVariableAccess f418081f;

    /* renamed from: g, reason: collision with root package name */
    public static final MethodVariableAccess f418082g;

    /* renamed from: h, reason: collision with root package name */
    public static final MethodVariableAccess f418083h;

    /* renamed from: i, reason: collision with root package name */
    public static final MethodVariableAccess f418084i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ MethodVariableAccess[] f418085j;

    /* renamed from: k, reason: collision with root package name */
    public static /* synthetic */ b f418086k;

    /* renamed from: b, reason: collision with root package name */
    public final int f418087b;

    /* renamed from: c, reason: collision with root package name */
    public final int f418088c;

    /* renamed from: d, reason: collision with root package name */
    public final StackSize f418089d;

    @HashCodeAndEqualsPlugin.Enhance
    public static class MethodLoading extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final net.bytebuddy.description.method.a f418090b;

        /* renamed from: c, reason: collision with root package name */
        public final TypeCastingHandler f418091c;

        public interface TypeCastingHandler {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class NoOp implements TypeCastingHandler {

                /* renamed from: b, reason: collision with root package name */
                public static final NoOp f418092b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ NoOp[] f418093c;

                static {
                    NoOp noOp = new NoOp("INSTANCE", 0);
                    f418092b = noOp;
                    f418093c = new NoOp[]{noOp};
                }

                public NoOp() {
                    throw null;
                }

                public static NoOp valueOf(String str) {
                    return (NoOp) Enum.valueOf(NoOp.class, str);
                }

                public static NoOp[] values() {
                    return (NoOp[]) f418093c.clone();
                }

                @Override // net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler
                public final StackManipulation a(TypeDescription typeDescription, int i12) {
                    return StackManipulation.Trivial.f417829b;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements TypeCastingHandler {

                /* renamed from: b, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f418094b;

                public a(net.bytebuddy.description.method.a aVar) {
                    this.f418094b = aVar;
                }

                @Override // net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler
                public final StackManipulation a(TypeDescription typeDescription, int i12) {
                    TypeDescription typeDescriptionF5 = ((net.bytebuddy.description.method.c) this.f418094b.getParameters().get(i12)).getType().f5();
                    return typeDescription.equals(typeDescriptionF5) ? StackManipulation.Trivial.f417829b : net.bytebuddy.implementation.bytecode.assign.b.g(typeDescriptionF5);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f418094b.equals(((a) obj).f418094b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f418094b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            StackManipulation a(TypeDescription typeDescription, int i12);
        }

        public MethodLoading(net.bytebuddy.description.method.a aVar, TypeCastingHandler typeCastingHandler) {
            this.f418090b = aVar;
            this.f418091c = typeCastingHandler;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MethodLoading methodLoading = (MethodLoading) obj;
            return this.f418090b.equals(methodLoading.f418090b) && this.f418091c.equals(methodLoading.f418091c);
        }

        public final StackManipulation g() {
            return this.f418090b.b() ? this : new StackManipulation.b(MethodVariableAccess.c(), this);
        }

        public final int hashCode() {
            return this.f418091c.hashCode() + D8.h(this.f418090b, getClass().hashCode() * 31, 31);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = this.f418090b.getParameters().iterator();
            while (it.hasNext()) {
                net.bytebuddy.description.method.c cVar = (net.bytebuddy.description.method.c) it.next();
                TypeDescription typeDescriptionF5 = cVar.getType().f5();
                arrayList.add(MethodVariableAccess.d(typeDescriptionF5).new b(cVar.getOffset()));
                arrayList.add(this.f418091c.a(typeDescriptionF5, cVar.getIndex()));
            }
            return new StackManipulation.b(arrayList).n(sVar, context);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class a extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final int f418095b;

        /* renamed from: c, reason: collision with root package name */
        public final int f418096c;

        public a(int i12, int i13) {
            this.f418095b = i12;
            this.f418096c = i13;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f418095b == aVar.f418095b && this.f418096c == aVar.f418096c;
        }

        public final int hashCode() {
            return (((getClass().hashCode() * 31) + this.f418095b) * 31) + this.f418096c;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            sVar.l(this.f418095b, this.f418096c);
            return StackManipulation.d.f417832c;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public class b extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final int f418097b;

        public b(int i12) {
            this.f418097b = i12;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f418097b == bVar.f418097b && MethodVariableAccess.this.equals(MethodVariableAccess.this);
        }

        public final int hashCode() {
            return MethodVariableAccess.this.hashCode() + (((getClass().hashCode() * 31) + this.f418097b) * 31);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            MethodVariableAccess methodVariableAccess = MethodVariableAccess.this;
            sVar.J(methodVariableAccess.f418087b, this.f418097b);
            return methodVariableAccess.f418089d.c();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public class c extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final int f418099b;

        public c(int i12) {
            this.f418099b = i12;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f418099b == cVar.f418099b && MethodVariableAccess.this.equals(MethodVariableAccess.this);
        }

        public final int hashCode() {
            return MethodVariableAccess.this.hashCode() + (((getClass().hashCode() * 31) + this.f418099b) * 31);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            MethodVariableAccess methodVariableAccess = MethodVariableAccess.this;
            sVar.J(methodVariableAccess.f418088c, this.f418099b);
            return methodVariableAccess.f418089d.b();
        }
    }

    static {
        StackSize stackSize = StackSize.SINGLE;
        MethodVariableAccess methodVariableAccess = new MethodVariableAccess("INTEGER", 0, 21, 54, stackSize);
        f418080e = methodVariableAccess;
        StackSize stackSize2 = StackSize.DOUBLE;
        MethodVariableAccess methodVariableAccess2 = new MethodVariableAccess("LONG", 1, 22, 55, stackSize2);
        f418081f = methodVariableAccess2;
        MethodVariableAccess methodVariableAccess3 = new MethodVariableAccess("FLOAT", 2, 23, 56, stackSize);
        f418082g = methodVariableAccess3;
        MethodVariableAccess methodVariableAccess4 = new MethodVariableAccess("DOUBLE", 3, 24, 57, stackSize2);
        f418083h = methodVariableAccess4;
        MethodVariableAccess methodVariableAccess5 = new MethodVariableAccess("REFERENCE", 4, 25, 58, stackSize);
        f418084i = methodVariableAccess5;
        f418085j = new MethodVariableAccess[]{methodVariableAccess, methodVariableAccess2, methodVariableAccess3, methodVariableAccess4, methodVariableAccess5};
    }

    public MethodVariableAccess(String str, int i12, int i13, int i14, StackSize stackSize) {
        this.f418087b = i13;
        this.f418089d = stackSize;
        this.f418088c = i14;
    }

    public static MethodLoading a(net.bytebuddy.description.method.a aVar) {
        return new MethodLoading(aVar, MethodLoading.TypeCastingHandler.NoOp.f418092b);
    }

    public static b b(net.bytebuddy.description.method.c cVar) {
        return d(cVar.getType()).new b(cVar.getOffset());
    }

    @k.c
    public static StackManipulation c() {
        b bVar = f418086k != null ? null : f418084i.new b(0);
        if (bVar == null) {
            return f418086k;
        }
        f418086k = bVar;
        return bVar;
    }

    public static MethodVariableAccess d(TypeDefinition typeDefinition) {
        if (!typeDefinition.w5()) {
            return f418084i;
        }
        if (typeDefinition.Q2(Long.TYPE)) {
            return f418081f;
        }
        if (typeDefinition.Q2(Double.TYPE)) {
            return f418083h;
        }
        if (typeDefinition.Q2(Float.TYPE)) {
            return f418082g;
        }
        if (typeDefinition.Q2(Void.TYPE)) {
            throw new IllegalArgumentException("Variable type cannot be void");
        }
        return f418080e;
    }

    public static MethodVariableAccess valueOf(String str) {
        return (MethodVariableAccess) Enum.valueOf(MethodVariableAccess.class, str);
    }

    public static MethodVariableAccess[] values() {
        return (MethodVariableAccess[]) f418085j.clone();
    }
}
