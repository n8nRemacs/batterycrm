package net.bytebuddy.asm;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.jar.asm.f;
import net.bytebuddy.jar.asm.m;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.pool.TypePool;

/* compiled from: ModifierAdjustment.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class c extends AsmVisitorWrapper.a {

    /* renamed from: b, reason: collision with root package name */
    public final List<a<TypeDescription>> f415927b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a<a.c>> f415928c;

    /* renamed from: d, reason: collision with root package name */
    public final List<a<net.bytebuddy.description.method.a>> f415929d;

    /* compiled from: ModifierAdjustment.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class a<T> implements InterfaceC44410t<T> {
        @Override // net.bytebuddy.matcher.InterfaceC44410t
        public final boolean b(@net.bytebuddy.utility.nullability.b T t12) {
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

    /* compiled from: ModifierAdjustment.java */
    public static class b extends f {

        /* renamed from: d, reason: collision with root package name */
        public final List<a<TypeDescription>> f415930d;

        /* renamed from: e, reason: collision with root package name */
        public final List<a<a.c>> f415931e;

        /* renamed from: f, reason: collision with root package name */
        public final List<a<net.bytebuddy.description.method.a>> f415932f;

        /* renamed from: g, reason: collision with root package name */
        public final TypeDescription f415933g;

        /* renamed from: h, reason: collision with root package name */
        public final HashMap f415934h;

        /* renamed from: i, reason: collision with root package name */
        public final HashMap f415935i;

        public b(f fVar, List list, List list2, List list3, TypeDescription typeDescription, HashMap map, HashMap map2) {
            super(net.bytebuddy.utility.e.f418981b, fVar);
            this.f415930d = list;
            this.f415931e = list2;
            this.f415932f = list3;
            this.f415933g = typeDescription;
            this.f415934h = map;
            this.f415935i = map2;
        }

        @Override // net.bytebuddy.jar.asm.f
        public final void c(int i12, int i13, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
            Iterator<a<TypeDescription>> it = this.f415930d.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw null;
            }
            super.c(i12, i13, str, str2, str3, strArr);
        }

        @Override // net.bytebuddy.jar.asm.f
        @net.bytebuddy.utility.nullability.b
        public final m g(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b Object obj) {
            if (((a.c) this.f415934h.get(r.q(str, str2))) != null) {
                Iterator<a<a.c>> it = this.f415931e.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw null;
                }
            }
            return super.g(i12, str, str2, str3, obj);
        }

        @Override // net.bytebuddy.jar.asm.f
        public final void h(int i12, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3) {
            if (this.f415933g.V().equals(str)) {
                Iterator<a<TypeDescription>> it = this.f415930d.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw null;
                }
            }
            super.h(i12, str, str2, str3);
        }

        @Override // net.bytebuddy.jar.asm.f
        @net.bytebuddy.utility.nullability.b
        public final s i(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
            if (((net.bytebuddy.description.method.a) this.f415935i.get(r.q(str, str2))) != null) {
                Iterator<a<net.bytebuddy.description.method.a>> it = this.f415932f.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw null;
                }
            }
            return super.i(i12, str, str2, str3, strArr);
        }
    }

    public c() {
        List<a<TypeDescription>> listEmptyList = Collections.emptyList();
        List<a<a.c>> listEmptyList2 = Collections.emptyList();
        List<a<net.bytebuddy.description.method.a>> listEmptyList3 = Collections.emptyList();
        this.f415927b = listEmptyList;
        this.f415928c = listEmptyList2;
        this.f415929d = listEmptyList3;
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper
    public final f b(TypeDescription typeDescription, f fVar, Implementation.Context context, TypePool typePool, net.bytebuddy.description.field.b bVar, net.bytebuddy.description.method.b bVar2, int i12, int i13) {
        HashMap map = new HashMap();
        Iterator<T> it = bVar.iterator();
        while (it.hasNext()) {
            a.c cVar = (a.c) it.next();
            map.put(cVar.V() + cVar.getDescriptor(), cVar);
        }
        HashMap map2 = new HashMap();
        for (net.bytebuddy.description.method.a aVar : net.bytebuddy.utility.a.d(bVar2, new a.f.C11977a(typeDescription))) {
            map2.put(aVar.V() + aVar.getDescriptor(), aVar);
        }
        return new b(fVar, this.f415927b, this.f415928c, this.f415929d, typeDescription, map, map2);
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f415927b.equals(cVar.f415927b) && this.f415928c.equals(cVar.f415928c) && this.f415929d.equals(cVar.f415929d);
    }

    public final int hashCode() {
        return this.f415929d.hashCode() + H.e(H.e(getClass().hashCode() * 31, 31, this.f415927b), 31, this.f415928c);
    }
}
