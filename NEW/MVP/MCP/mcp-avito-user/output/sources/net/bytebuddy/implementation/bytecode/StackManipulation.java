package net.bytebuddy.implementation.bytecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.jar.asm.s;

/* loaded from: classes7.dex */
public interface StackManipulation {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Illegal implements StackManipulation {

        /* renamed from: b, reason: collision with root package name */
        public static final Illegal f417827b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Illegal[] f417828c;

        static {
            Illegal illegal = new Illegal("INSTANCE", 0);
            f417827b = illegal;
            f417828c = new Illegal[]{illegal};
        }

        public Illegal() {
            throw null;
        }

        public static Illegal valueOf(String str) {
            return (Illegal) Enum.valueOf(Illegal.class, str);
        }

        public static Illegal[] values() {
            return (Illegal[]) f417828c.clone();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return false;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final d n(s sVar, Implementation.Context context) {
            throw new IllegalStateException("An illegal stack manipulation must not be applied");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Trivial implements StackManipulation {

        /* renamed from: b, reason: collision with root package name */
        public static final Trivial f417829b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Trivial[] f417830c;

        static {
            Trivial trivial = new Trivial("INSTANCE", 0);
            f417829b = trivial;
            f417830c = new Trivial[]{trivial};
        }

        public Trivial() {
            throw null;
        }

        public static Trivial valueOf(String str) {
            return (Trivial) Enum.valueOf(Trivial.class, str);
        }

        public static Trivial[] values() {
            return (Trivial[]) f417830c.clone();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return true;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final d n(s sVar, Implementation.Context context) {
            return StackSize.ZERO.c();
        }
    }

    public static abstract class a implements StackManipulation {
        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return true;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements StackManipulation {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f417831b;

        public b(StackManipulation... stackManipulationArr) {
            this((List<? extends StackManipulation>) Arrays.asList(stackManipulationArr));
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f417831b.equals(((b) obj).f417831b);
        }

        public final int hashCode() {
            return this.f417831b.hashCode() + (getClass().hashCode() * 31);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            Iterator it = this.f417831b.iterator();
            while (it.hasNext()) {
                if (!((StackManipulation) it.next()).isValid()) {
                    return false;
                }
            }
            return true;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final d n(s sVar, Implementation.Context context) {
            d dVarA = d.f417832c;
            Iterator it = this.f417831b.iterator();
            while (it.hasNext()) {
                dVarA = dVarA.a(((StackManipulation) it.next()).n(sVar, context));
            }
            return dVarA;
        }

        public b(List<? extends StackManipulation> list) {
            this.f417831b = new ArrayList();
            for (StackManipulation stackManipulation : list) {
                if (stackManipulation instanceof b) {
                    this.f417831b.addAll(((b) stackManipulation).f417831b);
                } else if (!(stackManipulation instanceof Trivial)) {
                    this.f417831b.add(stackManipulation);
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c extends a {

        public interface a {
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
        public final d n(s sVar, Implementation.Context context) {
            throw null;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d {

        /* renamed from: c, reason: collision with root package name */
        public static final d f417832c = new d(0, 0);

        /* renamed from: a, reason: collision with root package name */
        public final int f417833a;

        /* renamed from: b, reason: collision with root package name */
        public final int f417834b;

        public d(int i12, int i13) {
            this.f417833a = i12;
            this.f417834b = i13;
        }

        public final d a(d dVar) {
            int i12 = dVar.f417833a;
            int i13 = this.f417833a;
            return new d(i12 + i13, Math.max(this.f417834b, i13 + dVar.f417834b));
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f417833a == dVar.f417833a && this.f417834b == dVar.f417834b;
        }

        public final int hashCode() {
            return (((getClass().hashCode() * 31) + this.f417833a) * 31) + this.f417834b;
        }
    }

    boolean isValid();

    d n(s sVar, Implementation.Context context);
}
