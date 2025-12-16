package net.bytebuddy.description.type;

import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.description.a;
import net.bytebuddy.description.type.b;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.z;

/* compiled from: RecordComponentList.java */
/* loaded from: classes8.dex */
public interface c<T extends net.bytebuddy.description.type.b> extends z<T, c<T>> {

    /* compiled from: RecordComponentList.java */
    public static abstract class a<S extends net.bytebuddy.description.type.b> extends z.a<S, c<S>> implements c<S> {
        @Override // net.bytebuddy.matcher.z.a
        public final z a(List list) {
            return new C12000c(list);
        }

        @Override // net.bytebuddy.description.type.c
        public final a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<S> it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(abstractC12113a));
            }
            return new a.InterfaceC11963a.C11964a(arrayList);
        }
    }

    /* compiled from: RecordComponentList.java */
    public static class b<S extends net.bytebuddy.description.type.b> extends z.b<S, c<S>> implements c<S> {
        @Override // net.bytebuddy.description.type.c
        public final a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
            return new a.InterfaceC11963a.C11964a(new b.f[0]);
        }
    }

    /* compiled from: RecordComponentList.java */
    /* renamed from: net.bytebuddy.description.type.c$c, reason: collision with other inner class name */
    public static class C12000c<S extends net.bytebuddy.description.type.b> extends a<S> {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends S> f416525b;

        public C12000c(List<? extends S> list) {
            this.f416525b = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return this.f416525b.get(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416525b.size();
        }
    }

    /* compiled from: RecordComponentList.java */
    public static class d extends a<b.c> {

        /* renamed from: b, reason: collision with root package name */
        public final List<?> f416526b;

        public d() {
            throw null;
        }

        public d(Object... objArr) {
            this.f416526b = Arrays.asList(objArr);
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return new b.C11999b((AnnotatedElement) this.f416526b.get(i12));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416526b.size();
        }
    }

    /* compiled from: RecordComponentList.java */
    public static class e extends a<b.c> {

        /* renamed from: b, reason: collision with root package name */
        public final InstrumentedType.b f416527b;

        /* renamed from: c, reason: collision with root package name */
        public final List<? extends b.f> f416528c;

        public e(InstrumentedType.b bVar, List list) {
            this.f416527b = bVar;
            this.f416528c = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return new b.e(this.f416527b, this.f416528c.get(i12));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416528c.size();
        }
    }

    /* compiled from: RecordComponentList.java */
    public static class f extends a<b.d> {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a);
}
