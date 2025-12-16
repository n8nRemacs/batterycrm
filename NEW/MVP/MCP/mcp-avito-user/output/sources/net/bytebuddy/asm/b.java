package net.bytebuddy.asm;

import androidx.appcompat.app.r;
import java.util.HashMap;
import net.bytebuddy.asm.AsmVisitorWrapper;
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
import net.bytebuddy.pool.TypePool;

/* compiled from: MemberRemoval.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class b extends AsmVisitorWrapper.a {

    /* renamed from: b, reason: collision with root package name */
    public final C44396e f415921b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC44410t.a<net.bytebuddy.description.method.a> f415922c;

    /* compiled from: MemberRemoval.java */
    public static class a extends f {

        /* renamed from: d, reason: collision with root package name */
        public final C44396e f415923d;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC44410t.a<net.bytebuddy.description.method.a> f415924e;

        /* renamed from: f, reason: collision with root package name */
        public final HashMap f415925f;

        /* renamed from: g, reason: collision with root package name */
        public final HashMap f415926g;

        public a(f fVar, C44396e c44396e, InterfaceC44410t.a aVar, HashMap map, HashMap map2) {
            super(net.bytebuddy.utility.e.f418981b, fVar);
            this.f415923d = c44396e;
            this.f415924e = aVar;
            this.f415925f = map;
            this.f415926g = map2;
        }

        @Override // net.bytebuddy.jar.asm.f
        @net.bytebuddy.utility.nullability.b
        public final m g(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b Object obj) {
            if (((a.c) this.f415925f.get(r.q(str, str2))) == null || !this.f415923d.f418424b) {
                return super.g(i12, str, str2, str3, obj);
            }
            return null;
        }

        @Override // net.bytebuddy.jar.asm.f
        @net.bytebuddy.utility.nullability.b
        public final s i(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
            net.bytebuddy.description.method.a aVar = (net.bytebuddy.description.method.a) this.f415926g.get(r.q(str, str2));
            if (aVar == null || !this.f415924e.b(aVar)) {
                return super.i(i12, str, str2, str3, strArr);
            }
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b() {
        C44396e<?> c44396e = C44396e.f418423d;
        this(c44396e, c44396e);
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper
    public final f b(TypeDescription typeDescription, f fVar, Implementation.Context context, TypePool typePool, net.bytebuddy.description.field.b<a.c> bVar, net.bytebuddy.description.method.b<?> bVar2, int i12, int i13) {
        HashMap map = new HashMap();
        for (a.c cVar : bVar) {
            map.put(cVar.V() + cVar.getDescriptor(), cVar);
        }
        HashMap map2 = new HashMap();
        for (net.bytebuddy.description.method.a aVar : net.bytebuddy.utility.a.d(bVar2, new a.f.C11977a(typeDescription))) {
            map2.put(aVar.V() + aVar.getDescriptor(), aVar);
        }
        return new a(fVar, this.f415921b, this.f415922c, map, map2);
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f415921b.equals(bVar.f415921b) && this.f415922c.equals(bVar.f415922c);
    }

    public final int hashCode() {
        return this.f415922c.hashCode() + ((this.f415921b.hashCode() + (getClass().hashCode() * 31)) * 31);
    }

    public b(C44396e c44396e, InterfaceC44410t.a aVar) {
        this.f415921b = c44396e;
        this.f415922c = aVar;
    }
}
