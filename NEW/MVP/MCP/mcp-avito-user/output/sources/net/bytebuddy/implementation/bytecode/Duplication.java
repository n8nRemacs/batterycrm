package net.bytebuddy.implementation.bytecode;

import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public abstract class Duplication implements StackManipulation {

    /* renamed from: d, reason: collision with root package name */
    public static final Duplication f417792d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Duplication[] f417793e;

    /* renamed from: b, reason: collision with root package name */
    public final StackManipulation.d f417794b;

    /* renamed from: c, reason: collision with root package name */
    public final int f417795c;

    /* JADX INFO: Fake field, exist only in values array */
    Duplication EF6;

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
    public static final class WithFlip implements StackManipulation {

        /* renamed from: d, reason: collision with root package name */
        public static final WithFlip f417796d;

        /* renamed from: e, reason: collision with root package name */
        public static final WithFlip f417797e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ WithFlip[] f417798f;

        /* renamed from: b, reason: collision with root package name */
        public final int f417799b;

        /* renamed from: c, reason: collision with root package name */
        public final StackSize f417800c;

        static {
            StackSize stackSize = StackSize.SINGLE;
            WithFlip withFlip = new WithFlip(0, 90, "SINGLE_SINGLE", stackSize);
            f417796d = withFlip;
            WithFlip withFlip2 = new WithFlip(1, 91, "SINGLE_DOUBLE", stackSize);
            f417797e = withFlip2;
            StackSize stackSize2 = StackSize.DOUBLE;
            f417798f = new WithFlip[]{withFlip, withFlip2, new WithFlip(2, 93, "DOUBLE_SINGLE", stackSize2), new WithFlip(3, 94, "DOUBLE_DOUBLE", stackSize2)};
        }

        public WithFlip(int i12, int i13, String str, StackSize stackSize) {
            this.f417799b = i13;
            this.f417800c = stackSize;
        }

        public static WithFlip valueOf(String str) {
            return (WithFlip) Enum.valueOf(WithFlip.class, str);
        }

        public static WithFlip[] values() {
            return (WithFlip[]) f417798f.clone();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return true;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            sVar.m(this.f417799b);
            return this.f417800c.c();
        }
    }

    public enum a extends Duplication {
        @Override // net.bytebuddy.implementation.bytecode.Duplication
        public final StackManipulation c(TypeDefinition typeDefinition) {
            throw null;
        }

        @Override // net.bytebuddy.implementation.bytecode.Duplication, net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            return this.f417794b;
        }
    }

    public enum b extends Duplication {
        @Override // net.bytebuddy.implementation.bytecode.Duplication
        public final StackManipulation c(TypeDefinition typeDefinition) {
            int iOrdinal = typeDefinition.p().ordinal();
            if (iOrdinal == 1) {
                return WithFlip.f417796d;
            }
            if (iOrdinal == 2) {
                return WithFlip.f417797e;
            }
            throw new IllegalArgumentException("Cannot flip: " + typeDefinition);
        }
    }

    public enum c extends Duplication {
        @Override // net.bytebuddy.implementation.bytecode.Duplication
        public final StackManipulation c(TypeDefinition typeDefinition) {
            throw null;
        }
    }

    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f417801a;

        static {
            int[] iArr = new int[StackSize.values().length];
            f417801a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f417801a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f417801a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        a aVar = new a("ZERO", 0, StackSize.ZERO, 0, null);
        b bVar = new b("SINGLE", 1, StackSize.SINGLE, 89, null);
        f417792d = bVar;
        f417793e = new Duplication[]{aVar, bVar, new c("DOUBLE", 2, StackSize.DOUBLE, 92, null)};
    }

    public Duplication() {
        throw null;
    }

    public Duplication(String str, int i12, StackSize stackSize, int i13, a aVar) {
        this.f417794b = stackSize.c();
        this.f417795c = i13;
    }

    public static Duplication valueOf(String str) {
        return (Duplication) Enum.valueOf(Duplication.class, str);
    }

    public static Duplication[] values() {
        return (Duplication[]) f417793e.clone();
    }

    public abstract StackManipulation c(TypeDefinition typeDefinition);

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(this.f417795c);
        return this.f417794b;
    }
}
