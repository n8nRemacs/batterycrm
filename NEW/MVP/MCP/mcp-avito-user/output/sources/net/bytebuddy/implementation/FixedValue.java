package net.bytebuddy.implementation;

import com.yandex.div2.D8;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.FieldAccess.b.C12105b;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44411u;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public abstract class FixedValue implements Implementation {

    public interface b extends Implementation {
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class g extends FixedValue implements b {

        @HashCodeAndEqualsPlugin.Enhance
        public class a implements net.bytebuddy.implementation.bytecode.a {

            /* renamed from: b, reason: collision with root package name */
            public final FieldAccess.b.C12105b f417252b;

            public a(TypeDescription typeDescription, a aVar) {
                net.bytebuddy.description.field.b<a.c> bVarX = typeDescription.x();
                g.this.getClass();
                this.f417252b = FieldAccess.b((a.c) bVarX.P1(C44411u.x(null)).M2()).new C12105b();
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.f417252b.equals(((a) obj).f417252b);
            }

            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                g.this.getClass();
                throw null;
            }

            public final int hashCode() {
                return this.f417252b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            throw null;
        }

        @Override // net.bytebuddy.implementation.FixedValue
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

        @Override // net.bytebuddy.implementation.FixedValue
        public final int hashCode() {
            super.hashCode();
            throw null;
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return new a(target.a(), null);
        }
    }

    public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Object obj2 = Assigner.Typing.STATIC;
        if (!obj2.equals(obj2)) {
            return false;
        }
        net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
        return bVar.equals(bVar);
    }

    public int hashCode() {
        return Assigner.Typing.STATIC.hashCode() + ((Assigner.f417851M2.hashCode() + (getClass().hashCode() * 31)) * 31);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ForNullValue implements Implementation, net.bytebuddy.implementation.bytecode.a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ForNullValue[] f417248b = {new ForNullValue("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        ForNullValue EF5;

        public ForNullValue() {
            throw null;
        }

        public static ForNullValue valueOf(String str) {
            return (ForNullValue) Enum.valueOf(ForNullValue.class, str);
        }

        public static ForNullValue[] values() {
            return (ForNullValue[]) f417248b.clone();
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            if (aVar.getReturnType().w5()) {
                throw new IllegalStateException(D8.m("Cannot return null from ", aVar));
            }
            return new a.b(NullConstant.f418029b, MethodReturn.f418076i).h(sVar, context, aVar);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            return instrumentedType;
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return this;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c extends FixedValue implements b, net.bytebuddy.implementation.bytecode.a {
        @Override // net.bytebuddy.implementation.FixedValue
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
            return true;
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            if (aVar.getParameters().size() <= 0) {
                throw new IllegalStateException(aVar + " does not define a parameter with index 0");
            }
            net.bytebuddy.description.method.c cVar = (net.bytebuddy.description.method.c) aVar.getParameters().get(0);
            StackManipulation.b bVar = new StackManipulation.b(MethodVariableAccess.b(cVar), Assigner.f417851M2.a(cVar.getType(), aVar.getReturnType(), Assigner.Typing.STATIC), MethodReturn.c(aVar.getReturnType()));
            if (bVar.isValid()) {
                return new a.c(bVar.n(sVar, context).f417834b, aVar.p());
            }
            throw new IllegalStateException("Cannot assign " + aVar.getReturnType() + " to " + cVar);
        }

        @Override // net.bytebuddy.implementation.FixedValue
        public final int hashCode() {
            return super.hashCode() * 31;
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            return instrumentedType;
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return this;
        }
    }

    public static class d extends FixedValue implements b {

        @HashCodeAndEqualsPlugin.Enhance
        public class a implements net.bytebuddy.implementation.bytecode.a {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417249b;

            public a(TypeDescription typeDescription) {
                this.f417249b = typeDescription;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f417249b.equals(aVar.f417249b) && d.this.equals(d.this);
            }

            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                TypeDescription.Generic genericY0 = TypeDescription.Generic.d.b.y0(TypeDescription.f416319C2.f416504e);
                StackManipulation stackManipulationC = ClassConstant.c(this.f417249b);
                d.this.getClass();
                StackManipulation stackManipulationA = Assigner.f417851M2.a(genericY0, aVar.getReturnType(), Assigner.Typing.STATIC);
                if (stackManipulationA.isValid()) {
                    return new a.c(new StackManipulation.b(stackManipulationC, stackManipulationA, MethodReturn.c(aVar.getReturnType())).n(sVar, context).f417834b, aVar.p());
                }
                throw new IllegalArgumentException("Cannot return value of type " + genericY0 + " for " + aVar);
            }

            public final int hashCode() {
                return d.this.hashCode() + D8.j(this.f417249b, getClass().hashCode() * 31, 31);
            }
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return new a(target.f().f5());
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            return instrumentedType;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class e extends FixedValue implements b, net.bytebuddy.implementation.bytecode.a {
        @Override // net.bytebuddy.implementation.FixedValue
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

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            throw null;
        }

        @Override // net.bytebuddy.implementation.FixedValue
        public final int hashCode() {
            super.hashCode();
            throw null;
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            return instrumentedType;
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return this;
        }
    }

    public static class f extends FixedValue implements b {

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements net.bytebuddy.implementation.bytecode.a {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417251b;

            public a(TypeDescription typeDescription) {
                this.f417251b = typeDescription;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417251b.equals(((a) obj).f417251b);
                }
                return false;
            }

            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                if (aVar.b() || !this.f417251b.m5(aVar.getReturnType().f5())) {
                    throw new IllegalStateException(D8.m("Cannot return 'this' from ", aVar));
                }
                return new a.b(MethodVariableAccess.c(), MethodReturn.f418076i).h(sVar, context, aVar);
            }

            public final int hashCode() {
                return this.f417251b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return new a(target.a());
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            return instrumentedType;
        }
    }
}
