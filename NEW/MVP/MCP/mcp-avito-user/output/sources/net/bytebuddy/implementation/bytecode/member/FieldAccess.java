package net.bytebuddy.implementation.bytecode.member;

import com.yandex.div2.D8;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44411u;

/* loaded from: classes7.dex */
public enum FieldAccess {
    STATIC(179, 178, StackSize.ZERO),
    INSTANCE(181, 180, StackSize.SINGLE);


    /* renamed from: b, reason: collision with root package name */
    public final int f418035b;

    /* renamed from: c, reason: collision with root package name */
    public final int f418036c;

    /* renamed from: d, reason: collision with root package name */
    public final int f418037d;

    @HashCodeAndEqualsPlugin.Enhance
    public class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final a.c f418038a;

        public abstract class a extends StackManipulation.a {
            public a(a aVar) {
            }

            public abstract int g();

            public abstract StackManipulation.d j(StackSize stackSize);

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                int iG2 = g();
                b bVar = b.this;
                String strV = bVar.f418038a.n().V();
                a.c cVar = bVar.f418038a;
                sVar.j(iG2, strV, cVar.V(), cVar.getDescriptor());
                return j(cVar.getType().p());
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.implementation.bytecode.member.FieldAccess$b$b, reason: collision with other inner class name */
        public class C12105b extends a {
            public C12105b() {
                super(null);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return b.this.equals(b.this);
                }
                return false;
            }

            @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.b.a
            public final int g() {
                return FieldAccess.this.f418036c;
            }

            public final int hashCode() {
                return b.this.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.b.a
            public final StackManipulation.d j(StackSize stackSize) {
                int i12 = stackSize.f417839b - FieldAccess.this.f418037d;
                return new StackManipulation.d(i12, i12);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public class c extends a {
            public c() {
                super(null);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return b.this.equals(b.this);
                }
                return false;
            }

            @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.b.a
            public final int g() {
                return FieldAccess.this.f418035b;
            }

            public final int hashCode() {
                return b.this.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.b.a
            public final StackManipulation.d j(StackSize stackSize) {
                return new StackManipulation.d((stackSize.f417839b + FieldAccess.this.f418037d) * (-1), 0);
            }
        }

        public b(a.c cVar) {
            this.f418038a = cVar;
        }

        @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.c
        public final StackManipulation a() {
            return new c();
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return FieldAccess.this.equals(FieldAccess.this) && this.f418038a.equals(bVar.f418038a);
        }

        public final int hashCode() {
            return FieldAccess.this.hashCode() + ((this.f418038a.hashCode() + (getClass().hashCode() * 31)) * 31);
        }

        @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.c
        public final StackManipulation read() {
            return new C12105b();
        }
    }

    public interface c {
        StackManipulation a();

        StackManipulation read();
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final TypeDescription.Generic f418043a;

        /* renamed from: b, reason: collision with root package name */
        public final b f418044b;

        public d(TypeDescription.Generic generic, b bVar) {
            this.f418043a = generic;
            this.f418044b = bVar;
        }

        @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.c
        public final StackManipulation a() {
            return this.f418044b.new c();
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f418043a.equals(dVar.f418043a) && this.f418044b.equals(dVar.f418044b);
        }

        public final int hashCode() {
            return this.f418044b.hashCode() + D8.i(this.f418043a, getClass().hashCode() * 31, 31);
        }

        @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.c
        public final StackManipulation read() {
            return new StackManipulation.b(this.f418044b.new C12105b(), net.bytebuddy.implementation.bytecode.assign.b.g(this.f418043a));
        }
    }

    FieldAccess(int i12, int i13, StackSize stackSize) {
        this.f418035b = i12;
        this.f418036c = i13;
        this.f418037d = stackSize.f417839b;
    }

    public static StackManipulation a(net.bytebuddy.description.enumeration.a aVar) {
        net.bytebuddy.description.field.b bVarP1 = aVar.w().x().P1(C44411u.x(aVar.getValue()));
        return (bVarP1.size() == 1 && ((a.c) bVarP1.M2()).b() && ((a.c) bVarP1.M2()).e0() && ((a.c) bVarP1.M2()).I()) ? STATIC.new b((a.c) bVarP1.M2()).new C12105b() : StackManipulation.Illegal.f417827b;
    }

    public static b b(a.c cVar) {
        return cVar.b() ? STATIC.new b(cVar) : INSTANCE.new b(cVar);
    }

    public static c c(net.bytebuddy.description.field.a aVar) {
        a.c cVarI = aVar.i();
        if (aVar.getType().f5().equals(cVarI.getType().f5())) {
            return b(cVarI);
        }
        return new d(aVar.getType(), b(cVarI));
    }
}
