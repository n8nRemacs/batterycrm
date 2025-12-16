package net.bytebuddy.implementation.bytecode.collection;

import java.util.ArrayList;
import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.jar.asm.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class ArrayAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayAccess f417929d;

    /* renamed from: e, reason: collision with root package name */
    public static final ArrayAccess f417930e;

    /* renamed from: f, reason: collision with root package name */
    public static final ArrayAccess f417931f;

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayAccess f417932g;

    /* renamed from: h, reason: collision with root package name */
    public static final ArrayAccess f417933h;

    /* renamed from: i, reason: collision with root package name */
    public static final ArrayAccess f417934i;

    /* renamed from: j, reason: collision with root package name */
    public static final ArrayAccess f417935j;

    /* renamed from: k, reason: collision with root package name */
    public static final ArrayAccess f417936k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ ArrayAccess[] f417937l;

    /* renamed from: b, reason: collision with root package name */
    public final int f417938b;

    /* renamed from: c, reason: collision with root package name */
    public final StackSize f417939c;

    @HashCodeAndEqualsPlugin.Enhance
    public class a extends StackManipulation.a {
        public a() {
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return ArrayAccess.this.equals(ArrayAccess.this);
            }
            return false;
        }

        public final int hashCode() {
            return ArrayAccess.this.hashCode() + (getClass().hashCode() * 31);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            ArrayAccess arrayAccess = ArrayAccess.this;
            sVar.m(arrayAccess.f417938b);
            return arrayAccess.f417939c.c().a(new StackManipulation.d(-2, 0));
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public class b extends StackManipulation.a {
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
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            throw null;
        }
    }

    static {
        StackSize stackSize = StackSize.SINGLE;
        ArrayAccess arrayAccess = new ArrayAccess("BYTE", 0, 51, 84, stackSize);
        f417929d = arrayAccess;
        ArrayAccess arrayAccess2 = new ArrayAccess("SHORT", 1, 53, 86, stackSize);
        f417930e = arrayAccess2;
        ArrayAccess arrayAccess3 = new ArrayAccess("CHARACTER", 2, 52, 85, stackSize);
        f417931f = arrayAccess3;
        ArrayAccess arrayAccess4 = new ArrayAccess("INTEGER", 3, 46, 79, stackSize);
        f417932g = arrayAccess4;
        StackSize stackSize2 = StackSize.DOUBLE;
        ArrayAccess arrayAccess5 = new ArrayAccess("LONG", 4, 47, 80, stackSize2);
        f417933h = arrayAccess5;
        ArrayAccess arrayAccess6 = new ArrayAccess("FLOAT", 5, 48, 81, stackSize);
        f417934i = arrayAccess6;
        ArrayAccess arrayAccess7 = new ArrayAccess("DOUBLE", 6, 49, 82, stackSize2);
        f417935j = arrayAccess7;
        ArrayAccess arrayAccess8 = new ArrayAccess("REFERENCE", 7, 50, 83, stackSize);
        f417936k = arrayAccess8;
        f417937l = new ArrayAccess[]{arrayAccess, arrayAccess2, arrayAccess3, arrayAccess4, arrayAccess5, arrayAccess6, arrayAccess7, arrayAccess8};
    }

    public ArrayAccess(String str, int i12, int i13, int i14, StackSize stackSize) {
        this.f417938b = i13;
        this.f417939c = stackSize;
    }

    public static ArrayAccess b(TypeDefinition typeDefinition) {
        if (!typeDefinition.w5()) {
            return f417936k;
        }
        if (typeDefinition.Q2(Boolean.TYPE) || typeDefinition.Q2(Byte.TYPE)) {
            return f417929d;
        }
        if (typeDefinition.Q2(Short.TYPE)) {
            return f417930e;
        }
        if (typeDefinition.Q2(Character.TYPE)) {
            return f417931f;
        }
        if (typeDefinition.Q2(Integer.TYPE)) {
            return f417932g;
        }
        if (typeDefinition.Q2(Long.TYPE)) {
            return f417933h;
        }
        if (typeDefinition.Q2(Float.TYPE)) {
            return f417934i;
        }
        if (typeDefinition.Q2(Double.TYPE)) {
            return f417935j;
        }
        throw new IllegalArgumentException("Not a legal array type: " + typeDefinition);
    }

    public static ArrayAccess valueOf(String str) {
        return (ArrayAccess) Enum.valueOf(ArrayAccess.class, str);
    }

    public static ArrayAccess[] values() {
        return (ArrayAccess[]) f417937l.clone();
    }

    public final StackManipulation.b a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            arrayList2.add(new StackManipulation.b(Duplication.f417792d, IntegerConstant.c(i12), new a(), (StackManipulation) it.next()));
            i12++;
        }
        return new StackManipulation.b(arrayList2);
    }
}
