package net.bytebuddy.implementation.bytecode;

import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public class Removal implements StackManipulation {

    /* renamed from: d, reason: collision with root package name */
    public static final Removal f417809d;

    /* renamed from: e, reason: collision with root package name */
    public static final Removal f417810e;

    /* renamed from: f, reason: collision with root package name */
    public static final Removal f417811f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Removal[] f417812g;

    /* renamed from: b, reason: collision with root package name */
    public final StackManipulation.d f417813b;

    /* renamed from: c, reason: collision with root package name */
    public final int f417814c;

    public enum a extends Removal {
        @Override // net.bytebuddy.implementation.bytecode.Removal, net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            return StackManipulation.d.f417832c;
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f417815a;

        static {
            int[] iArr = new int[StackSize.values().length];
            f417815a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f417815a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f417815a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        a aVar = new a("ZERO", 0, StackSize.ZERO, 0, null);
        f417809d = aVar;
        Removal removal = new Removal(1, 87, "SINGLE", StackSize.SINGLE);
        f417810e = removal;
        Removal removal2 = new Removal(2, 88, "DOUBLE", StackSize.DOUBLE);
        f417811f = removal2;
        f417812g = new Removal[]{aVar, removal, removal2};
    }

    public /* synthetic */ Removal(String str, int i12, StackSize stackSize, int i13, a aVar) {
        this(i12, i13, str, stackSize);
    }

    public static Removal c(TypeDefinition typeDefinition) {
        int iOrdinal = typeDefinition.p().ordinal();
        if (iOrdinal == 0) {
            return f417809d;
        }
        if (iOrdinal == 1) {
            return f417810e;
        }
        if (iOrdinal == 2) {
            return f417811f;
        }
        throw new AssertionError();
    }

    public static Removal valueOf(String str) {
        return (Removal) Enum.valueOf(Removal.class, str);
    }

    public static Removal[] values() {
        return (Removal[]) f417812g.clone();
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(this.f417814c);
        return this.f417813b;
    }

    public Removal(int i12, int i13, String str, StackSize stackSize) {
        this.f417813b = stackSize.b();
        this.f417814c = i13;
    }
}
