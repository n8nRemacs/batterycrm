package net.bytebuddy.asm;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.jar.asm.f;
import net.bytebuddy.jar.asm.m;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44396e;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.pool.TypePool;

/* loaded from: classes8.dex */
public interface AsmVisitorWrapper {

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements AsmVisitorWrapper {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f415886b;

        public b() {
            throw null;
        }

        public b(AsmVisitorWrapper... asmVisitorWrapperArr) {
            List<AsmVisitorWrapper> listAsList = Arrays.asList(asmVisitorWrapperArr);
            this.f415886b = new ArrayList();
            for (AsmVisitorWrapper asmVisitorWrapper : listAsList) {
                if (asmVisitorWrapper instanceof b) {
                    this.f415886b.addAll(((b) asmVisitorWrapper).f415886b);
                } else if (!(asmVisitorWrapper instanceof NoOp)) {
                    this.f415886b.add(asmVisitorWrapper);
                }
            }
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public final int a(int i12) {
            Iterator it = this.f415886b.iterator();
            while (it.hasNext()) {
                i12 = ((AsmVisitorWrapper) it.next()).a(i12);
            }
            return i12;
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public final f b(TypeDescription typeDescription, f fVar, Implementation.Context context, TypePool typePool, net.bytebuddy.description.field.b<a.c> bVar, net.bytebuddy.description.method.b<?> bVar2, int i12, int i13) {
            Iterator it = this.f415886b.iterator();
            f fVarB = fVar;
            while (it.hasNext()) {
                fVarB = ((AsmVisitorWrapper) it.next()).b(typeDescription, fVarB, context, typePool, bVar, bVar2, i12, i13);
            }
            return fVarB;
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public final int c(int i12) {
            Iterator it = this.f415886b.iterator();
            while (it.hasNext()) {
                i12 = ((AsmVisitorWrapper) it.next()).c(i12);
            }
            return i12;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f415886b.equals(((b) obj).f415886b);
        }

        public final int hashCode() {
            return this.f415886b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c extends a {

        /* renamed from: b, reason: collision with root package name */
        public final List<b> f415887b = Collections.emptyList();

        public class a extends f {

            /* renamed from: d, reason: collision with root package name */
            public final TypeDescription f415888d;

            /* renamed from: e, reason: collision with root package name */
            public final HashMap f415889e;

            public a(f fVar, TypeDescription typeDescription, HashMap map) {
                super(net.bytebuddy.utility.e.f418981b, fVar);
                this.f415888d = typeDescription;
                this.f415889e = map;
            }

            @Override // net.bytebuddy.jar.asm.f
            @net.bytebuddy.utility.nullability.b
            public final m g(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b Object obj) {
                m mVarG = super.g(i12, str, str2, str3, obj);
                a.c cVar = (a.c) this.f415889e.get(r.q(str, str2));
                if (mVarG != null && cVar != null) {
                    Iterator<b> it = c.this.f415887b.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw null;
                    }
                }
                return mVarG;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements InterfaceC44410t<a.c>, InterfaceC11937c {
            @Override // net.bytebuddy.matcher.InterfaceC44410t
            public final boolean b(@net.bytebuddy.utility.nullability.b a.c cVar) {
                throw null;
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
        }

        /* renamed from: net.bytebuddy.asm.AsmVisitorWrapper$c$c, reason: collision with other inner class name */
        public interface InterfaceC11937c {
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public final f b(TypeDescription typeDescription, f fVar, Implementation.Context context, TypePool typePool, net.bytebuddy.description.field.b<a.c> bVar, net.bytebuddy.description.method.b<?> bVar2, int i12, int i13) {
            HashMap map = new HashMap();
            for (a.c cVar : bVar) {
                map.put(cVar.V() + cVar.getDescriptor(), cVar);
            }
            return new a(fVar, typeDescription, map);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f415887b.equals(((c) obj).f415887b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f415887b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d implements AsmVisitorWrapper {

        /* renamed from: b, reason: collision with root package name */
        public final List<b> f415891b;

        public class a extends f {

            /* renamed from: d, reason: collision with root package name */
            public final TypeDescription f415892d;

            /* renamed from: e, reason: collision with root package name */
            public final Implementation.Context f415893e;

            /* renamed from: f, reason: collision with root package name */
            public final TypePool f415894f;

            /* renamed from: g, reason: collision with root package name */
            public final int f415895g;

            /* renamed from: h, reason: collision with root package name */
            public final int f415896h;

            /* renamed from: i, reason: collision with root package name */
            public final HashMap f415897i;

            public a(f fVar, TypeDescription typeDescription, Implementation.Context context, TypePool typePool, HashMap map, int i12, int i13) {
                super(net.bytebuddy.utility.e.f418981b, fVar);
                this.f415892d = typeDescription;
                this.f415893e = context;
                this.f415894f = typePool;
                this.f415897i = map;
                this.f415895g = i12;
                this.f415896h = i13;
            }

            @Override // net.bytebuddy.jar.asm.f
            @net.bytebuddy.utility.nullability.b
            public final s i(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
                b next;
                s sVarI = super.i(i12, str, str2, str3, strArr);
                net.bytebuddy.description.method.a aVar = (net.bytebuddy.description.method.a) this.f415897i.get(r.q(str, str2));
                if (sVarI == null || aVar == null) {
                    return sVarI;
                }
                Iterator<b> it = d.this.f415891b.iterator();
                while (true) {
                    s sVar = sVarI;
                    while (it.hasNext()) {
                        next = it.next();
                        if (next.f415899b.b(aVar)) {
                            break;
                        }
                    }
                    return sVar;
                    sVarI = next.a(this.f415892d, aVar, sVar, this.f415893e, this.f415894f, this.f415895g, this.f415896h);
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements InterfaceC44410t<net.bytebuddy.description.method.a>, c {

            /* renamed from: b, reason: collision with root package name */
            public final InterfaceC44410t.a f415899b;

            /* renamed from: c, reason: collision with root package name */
            public final List<? extends c> f415900c;

            public b(InterfaceC44410t.a aVar, List list) {
                this.f415899b = aVar;
                this.f415900c = list;
            }

            @Override // net.bytebuddy.asm.AsmVisitorWrapper.d.c
            public final s a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, s sVar, Implementation.Context context, TypePool typePool, int i12, int i13) {
                Iterator<? extends c> it = this.f415900c.iterator();
                s sVarA = sVar;
                while (it.hasNext()) {
                    sVarA = it.next().a(typeDescription, aVar, sVarA, context, typePool, i12, i13);
                }
                return sVarA;
            }

            @Override // net.bytebuddy.matcher.InterfaceC44410t
            public final boolean b(@net.bytebuddy.utility.nullability.b net.bytebuddy.description.method.a aVar) {
                return this.f415899b.b(aVar);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f415899b.equals(bVar.f415899b) && this.f415900c.equals(bVar.f415900c);
            }

            public final int hashCode() {
                return this.f415900c.hashCode() + ((this.f415899b.hashCode() + (getClass().hashCode() * 31)) * 31);
            }
        }

        public interface c {
            s a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, s sVar, Implementation.Context context, TypePool typePool, int i12, int i13);
        }

        public d() {
            this(Collections.emptyList());
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public final f b(TypeDescription typeDescription, f fVar, Implementation.Context context, TypePool typePool, net.bytebuddy.description.field.b<a.c> bVar, net.bytebuddy.description.method.b<?> bVar2, int i12, int i13) {
            HashMap map = new HashMap();
            for (net.bytebuddy.description.method.a aVar : net.bytebuddy.utility.a.d(bVar2, new a.f.C11977a(typeDescription))) {
                map.put(aVar.V() + aVar.getDescriptor(), aVar);
            }
            return new a(fVar, typeDescription, context, typePool, map, i12, i13);
        }

        public final d d(C44396e c44396e, c... cVarArr) {
            return e(MethodSortMatcher.Sort.f418387e.f418392c.a(c44396e), Arrays.asList(cVarArr));
        }

        public final d e(InterfaceC44410t.a aVar, List list) {
            return new d(net.bytebuddy.utility.a.d(this.f415891b, new b(aVar, list)));
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f415891b.equals(((d) obj).f415891b);
        }

        public final d f(InterfaceC44410t.a aVar, c... cVarArr) {
            return e(MethodSortMatcher.Sort.f418386d.f418392c.a(aVar), Arrays.asList(cVarArr));
        }

        public final int hashCode() {
            return H.e(getClass().hashCode() * 31, 961, this.f415891b);
        }

        public d(List list) {
            this.f415891b = list;
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public final int a(int i12) {
            return i12;
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public final int c(int i12) {
            return i12;
        }
    }

    int a(int i12);

    f b(TypeDescription typeDescription, f fVar, Implementation.Context context, TypePool typePool, net.bytebuddy.description.field.b<a.c> bVar, net.bytebuddy.description.method.b<?> bVar2, int i12, int i13);

    int c(int i12);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoOp implements AsmVisitorWrapper {

        /* renamed from: b, reason: collision with root package name */
        public static final NoOp f415884b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ NoOp[] f415885c;

        static {
            NoOp noOp = new NoOp("INSTANCE", 0);
            f415884b = noOp;
            f415885c = new NoOp[]{noOp};
        }

        public NoOp() {
            throw null;
        }

        public static NoOp valueOf(String str) {
            return (NoOp) Enum.valueOf(NoOp.class, str);
        }

        public static NoOp[] values() {
            return (NoOp[]) f415885c.clone();
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public final int a(int i12) {
            return i12;
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public final int c(int i12) {
            return i12;
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public final f b(TypeDescription typeDescription, f fVar, Implementation.Context context, TypePool typePool, net.bytebuddy.description.field.b<a.c> bVar, net.bytebuddy.description.method.b<?> bVar2, int i12, int i13) {
            return fVar;
        }
    }

    public static abstract class a implements AsmVisitorWrapper {
        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public final int a(int i12) {
            return i12;
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper
        public final int c(int i12) {
            return i12;
        }
    }
}
