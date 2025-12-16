package net.bytebuddy.implementation.bytecode.member;

import androidx.compose.foundation.H;
import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.p;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.utility.JavaConstant;

/* loaded from: classes7.dex */
public enum MethodInvocation {
    VIRTUAL(182, 5, 182, 5),
    INTERFACE(185, 9, 185, 9),
    STATIC(184, 6, 184, 6),
    SPECIAL(183, 7, 183, 7),
    SPECIAL_CONSTRUCTOR(183, 8, 183, 8),
    VIRTUAL_PRIVATE(182, 5, 183, 7),
    INTERFACE_PRIVATE(185, 9, 183, 7);


    /* renamed from: b, reason: collision with root package name */
    public final int f418053b;

    /* renamed from: c, reason: collision with root package name */
    public final int f418054c;

    /* renamed from: d, reason: collision with root package name */
    public final int f418055d;

    /* renamed from: e, reason: collision with root package name */
    public final int f418056e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HandleType {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ HandleType[] f418057b = {new HandleType("EXACT", 0), new HandleType("REGULAR", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        HandleType EF5;

        public static HandleType valueOf(String str) {
            return (HandleType) Enum.valueOf(HandleType.class, str);
        }

        public static HandleType[] values() {
            return (HandleType[]) f418057b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IllegalInvocation implements e {

        /* renamed from: b, reason: collision with root package name */
        public static final IllegalInvocation f418058b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ IllegalInvocation[] f418059c;

        static {
            IllegalInvocation illegalInvocation = new IllegalInvocation("INSTANCE", 0);
            f418058b = illegalInvocation;
            f418059c = new IllegalInvocation[]{illegalInvocation};
        }

        public IllegalInvocation() {
            throw null;
        }

        public static IllegalInvocation valueOf(String str) {
            return (IllegalInvocation) Enum.valueOf(IllegalInvocation.class, str);
        }

        public static IllegalInvocation[] values() {
            return (IllegalInvocation[]) f418059c.clone();
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.e
        public final StackManipulation a(String str, TypeDescription typeDescription, List list, ArrayList arrayList) {
            return StackManipulation.Illegal.f417827b;
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.e
        public final StackManipulation h(TypeDescription typeDescription) {
            return StackManipulation.Illegal.f417827b;
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.e
        public final StackManipulation i(TypeDescription typeDescription) {
            return StackManipulation.Illegal.f417827b;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return false;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            StackManipulation.Illegal.f417827b.n(sVar, context);
            throw null;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public class a extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final String f418060b;

        /* renamed from: c, reason: collision with root package name */
        public final TypeDescription f418061c;

        /* renamed from: d, reason: collision with root package name */
        public final d.C12001d f418062d;

        /* renamed from: e, reason: collision with root package name */
        public final a.d f418063e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f418064f;

        public a(String str, TypeDescription typeDescription, d.C12001d c12001d, a.d dVar, ArrayList arrayList) {
            this.f418060b = str;
            this.f418061c = typeDescription;
            this.f418062d = c12001d;
            this.f418063e = dVar;
            this.f418064f = arrayList;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return MethodInvocation.this.equals(MethodInvocation.this) && this.f418060b.equals(aVar.f418060b) && this.f418061c.equals(aVar.f418061c) && this.f418062d.equals(aVar.f418062d) && this.f418063e.equals(aVar.f418063e) && this.f418064f.equals(aVar.f418064f);
        }

        public final int hashCode() {
            return MethodInvocation.this.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f418064f, (this.f418063e.hashCode() + ((this.f418062d.hashCode() + D8.j(this.f418061c, H.d(getClass().hashCode() * 31, 31, this.f418060b), 31)) * 31)) * 31, 31);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            StringBuilder sb2 = new StringBuilder("(");
            d.C12001d c12001d = this.f418062d;
            Iterator<TypeDescription> it = c12001d.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().getDescriptor());
            }
            sb2.append(')');
            TypeDescription typeDescription = this.f418061c;
            sb2.append(typeDescription.getDescriptor());
            String string = sb2.toString();
            ArrayList arrayList = this.f418064f;
            Object[] objArr = new Object[arrayList.size()];
            Iterator it2 = arrayList.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                objArr[i12] = ((JavaConstant) it2.next()).a();
                i12++;
            }
            MethodInvocation methodInvocation = MethodInvocation.this;
            int i13 = methodInvocation.f418054c;
            int i14 = methodInvocation.f418056e;
            int i15 = (i13 == i14 || context.b().c(ClassFileVersion.f415301m)) ? methodInvocation.f418054c : i14;
            a.d dVar = this.f418063e;
            sVar.p(this.f418060b, string, new p(dVar.n().V(), dVar.V(), dVar.getDescriptor(), i15, dVar.n().E()), objArr);
            int iA2 = typeDescription.p().f417839b - StackSize.a(c12001d);
            return new StackManipulation.d(iA2, Math.max(iA2, 0));
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b extends StackManipulation.a {
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

    @HashCodeAndEqualsPlugin.Enhance
    public class c extends StackManipulation.a implements e {

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f418066b;

        /* renamed from: c, reason: collision with root package name */
        public final a.d f418067c;

        public c(a.d dVar, TypeDescription typeDescription) {
            this.f418066b = typeDescription;
            this.f418067c = dVar;
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.e
        public final StackManipulation a(String str, TypeDescription typeDescription, List list, ArrayList arrayList) {
            a.d dVar = this.f418067c;
            if (!dVar.r0()) {
                return StackManipulation.Illegal.f417827b;
            }
            return MethodInvocation.this.new a(str, typeDescription, new d.C12001d((List<? extends TypeDescription>) list), dVar.i(), arrayList);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return MethodInvocation.this.equals(MethodInvocation.this) && this.f418066b.equals(cVar.f418066b) && this.f418067c.equals(cVar.f418067c);
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.e
        public final StackManipulation h(TypeDescription typeDescription) {
            a.d dVar = this.f418067c;
            return dVar.s(typeDescription) ? MethodInvocation.SPECIAL.new c(dVar, typeDescription) : StackManipulation.Illegal.f417827b;
        }

        public final int hashCode() {
            return MethodInvocation.this.hashCode() + ((this.f418067c.hashCode() + D8.j(this.f418066b, getClass().hashCode() * 31, 31)) * 31);
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.e
        public final StackManipulation i(TypeDescription typeDescription) {
            a.d dVar = this.f418067c;
            boolean zV02 = dVar.v0();
            StackManipulation.Illegal illegal = StackManipulation.Illegal.f417827b;
            return (zV02 || dVar.b()) ? illegal : dVar.O() ? dVar.n().equals(typeDescription) ? this : illegal : typeDescription.E() ? dVar.n().Q2(Object.class) ? this : MethodInvocation.INTERFACE.new c(dVar, typeDescription) : MethodInvocation.VIRTUAL.new c(dVar, typeDescription);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            MethodInvocation methodInvocation = MethodInvocation.this;
            int i12 = methodInvocation.f418053b;
            int i13 = methodInvocation.f418055d;
            if (i12 == i13 || context.b().c(ClassFileVersion.f415301m)) {
                i13 = methodInvocation.f418053b;
            }
            int i14 = i13;
            TypeDescription typeDescription = this.f418066b;
            String strV = typeDescription.V();
            a.d dVar = this.f418067c;
            sVar.A(strV, dVar.V(), dVar.getDescriptor(), i14, typeDescription.E());
            int iP2 = dVar.getReturnType().p().f417839b - dVar.p();
            return new StackManipulation.d(iP2, Math.max(0, iP2));
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d implements e {

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f418069b;

        /* renamed from: c, reason: collision with root package name */
        public final e f418070c;

        public d(TypeDescription typeDescription, e eVar) {
            this.f418069b = typeDescription;
            this.f418070c = eVar;
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.e
        public final StackManipulation a(String str, TypeDescription typeDescription, List list, ArrayList arrayList) {
            return this.f418070c.a(str, typeDescription, list, arrayList);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f418069b.equals(dVar.f418069b) && this.f418070c.equals(dVar.f418070c);
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.e
        public final StackManipulation h(TypeDescription typeDescription) {
            return new StackManipulation.b(this.f418070c.h(typeDescription), net.bytebuddy.implementation.bytecode.assign.b.g(this.f418069b));
        }

        public final int hashCode() {
            return this.f418070c.hashCode() + D8.j(this.f418069b, getClass().hashCode() * 31, 31);
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.e
        public final StackManipulation i(TypeDescription typeDescription) {
            return new StackManipulation.b(this.f418070c.i(typeDescription), net.bytebuddy.implementation.bytecode.assign.b.g(this.f418069b));
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return this.f418070c.isValid();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            return new StackManipulation.b(this.f418070c, net.bytebuddy.implementation.bytecode.assign.b.g(this.f418069b)).n(sVar, context);
        }
    }

    public interface e extends StackManipulation {
        StackManipulation a(String str, TypeDescription typeDescription, List list, ArrayList arrayList);

        StackManipulation h(TypeDescription typeDescription);

        StackManipulation i(TypeDescription typeDescription);
    }

    MethodInvocation(int i12, int i13, int i14, int i15) {
        this.f418053b = i12;
        this.f418054c = i13;
        this.f418055d = i14;
        this.f418056e = i15;
    }

    public static e a(a.d dVar) {
        if (dVar.d0()) {
            return IllegalInvocation.f418058b;
        }
        if (dVar.b()) {
            return STATIC.new c(dVar, dVar.n());
        }
        if (dVar.v0()) {
            return SPECIAL_CONSTRUCTOR.new c(dVar, dVar.n());
        }
        if (dVar.O()) {
            return (dVar.n().E() ? INTERFACE_PRIVATE : VIRTUAL_PRIVATE).new c(dVar, dVar.n());
        }
        return dVar.n().E() ? INTERFACE.new c(dVar, dVar.n()) : VIRTUAL.new c(dVar, dVar.n());
    }

    public static e b(net.bytebuddy.description.method.a aVar) {
        a.d dVarI = aVar.i();
        if (dVarI.getReturnType().f5().equals(aVar.getReturnType().f5())) {
            return a(dVarI);
        }
        return new d(aVar.getReturnType().f5(), a(dVarI));
    }
}
