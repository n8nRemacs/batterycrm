package net.bytebuddy.description.method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.description.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.z;
import net.bytebuddy.utility.ConstructorComparator;
import net.bytebuddy.utility.GraalImageCode;
import net.bytebuddy.utility.MethodComparator;

/* compiled from: MethodList.java */
/* loaded from: classes8.dex */
public interface b<T extends net.bytebuddy.description.method.a> extends z<T, b<T>> {

    /* compiled from: MethodList.java */
    public static abstract class a<S extends net.bytebuddy.description.method.a> extends z.a<S, b<S>> implements b<S> {
        @Override // net.bytebuddy.description.method.b
        public final List D2(InterfaceC44410t.a.AbstractC12113a abstractC12113a, TypeDescription typeDescription) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<S> it = iterator();
            while (it.hasNext()) {
                arrayList.add(((a.h) it.next().a(abstractC12113a)).c(typeDescription));
            }
            return arrayList;
        }

        @Override // net.bytebuddy.description.method.b
        public final List<a.g> V3() {
            ArrayList arrayList = new ArrayList(size());
            Iterator<S> it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().e());
            }
            return arrayList;
        }

        @Override // net.bytebuddy.matcher.z.a
        public final z a(List list) {
            return new c(list);
        }

        @Override // net.bytebuddy.description.method.b
        public final a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<S> it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(abstractC12113a));
            }
            return new a.InterfaceC11963a.C11964a(arrayList);
        }
    }

    /* compiled from: MethodList.java */
    /* renamed from: net.bytebuddy.description.method.b$b, reason: collision with other inner class name */
    public static class C11978b<S extends net.bytebuddy.description.method.a> extends z.b<S, b<S>> implements b<S> {
        @Override // net.bytebuddy.description.method.b
        public final List D2(InterfaceC44410t.a.AbstractC12113a abstractC12113a, TypeDescription typeDescription) {
            return Collections.emptyList();
        }

        @Override // net.bytebuddy.description.method.b
        public final List<a.g> V3() {
            return Collections.emptyList();
        }

        @Override // net.bytebuddy.description.method.b
        public final a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
            return new a.InterfaceC11963a.C11964a(new a.h[0]);
        }
    }

    /* compiled from: MethodList.java */
    public static class c<S extends net.bytebuddy.description.method.a> extends a<S> {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends S> f416209b;

        public c(List<? extends S> list) {
            this.f416209b = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return this.f416209b.get(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416209b.size();
        }
    }

    /* compiled from: MethodList.java */
    public static class d extends a<a.d> {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends Method> f416210b;

        /* renamed from: c, reason: collision with root package name */
        public final List<? extends Constructor<?>> f416211c;

        public d() {
            throw null;
        }

        public d(Class<?> cls) throws SecurityException {
            GraalImageCode graalImageCodeA = GraalImageCode.a();
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            graalImageCodeA.b(declaredConstructors, ConstructorComparator.f418849b);
            GraalImageCode graalImageCodeA2 = GraalImageCode.a();
            Method[] declaredMethods = cls.getDeclaredMethods();
            graalImageCodeA2.b(declaredMethods, MethodComparator.f418915b);
            List<? extends Constructor<?>> listAsList = Arrays.asList(declaredConstructors);
            List<? extends Method> listAsList2 = Arrays.asList(declaredMethods);
            this.f416211c = listAsList;
            this.f416210b = listAsList2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            List<? extends Constructor<?>> list = this.f416211c;
            if (i12 < list.size()) {
                return new a.b(list.get(i12));
            }
            return new a.c(this.f416210b.get(i12 - list.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416210b.size() + this.f416211c.size();
        }
    }

    /* compiled from: MethodList.java */
    public static class e extends a<a.d> {

        /* renamed from: b, reason: collision with root package name */
        public final InstrumentedType.b f416212b;

        /* renamed from: c, reason: collision with root package name */
        public final List<? extends a.h> f416213c;

        public e(InstrumentedType.b bVar, List list) {
            this.f416212b = bVar;
            this.f416213c = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return new a.f(this.f416212b, this.f416213c.get(i12));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416213c.size();
        }
    }

    /* compiled from: MethodList.java */
    public static class f extends a<a.e> {

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription.Generic.a f416214b;

        /* renamed from: c, reason: collision with root package name */
        public final b f416215c;

        /* renamed from: d, reason: collision with root package name */
        public final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> f416216d;

        public f(TypeDescription.Generic.a aVar, b bVar, TypeDescription.Generic.Visitor visitor) {
            this.f416214b = aVar;
            this.f416215c = bVar;
            this.f416216d = visitor;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return new a.i(this.f416214b, (net.bytebuddy.description.method.a) this.f416215c.get(i12), this.f416216d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416215c.size();
        }
    }

    List D2(InterfaceC44410t.a.AbstractC12113a abstractC12113a, TypeDescription typeDescription);

    List<a.g> V3();

    a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a);
}
