package net.bytebuddy.description.field;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.description.a;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.z;

/* compiled from: FieldList.java */
/* loaded from: classes8.dex */
public interface b<T extends net.bytebuddy.description.field.a> extends z<T, b<T>> {

    /* compiled from: FieldList.java */
    public static abstract class a<S extends net.bytebuddy.description.field.a> extends z.a<S, b<S>> implements b<S> {
        @Override // net.bytebuddy.matcher.z.a
        public final z a(List list) {
            return new c(list);
        }

        @Override // net.bytebuddy.description.field.b
        public final a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<S> it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(abstractC12113a));
            }
            return new a.InterfaceC11963a.C11964a(arrayList);
        }
    }

    /* compiled from: FieldList.java */
    /* renamed from: net.bytebuddy.description.field.b$b, reason: collision with other inner class name */
    public static class C11973b<S extends net.bytebuddy.description.field.a> extends z.b<S, b<S>> implements b<S> {
        @Override // net.bytebuddy.description.field.b
        public final a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
            return new a.InterfaceC11963a.C11964a(new a.g[0]);
        }
    }

    /* compiled from: FieldList.java */
    public static class c<S extends net.bytebuddy.description.field.a> extends a<S> {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends S> f416161b;

        public c(List<? extends S> list) {
            this.f416161b = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return this.f416161b.get(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416161b.size();
        }
    }

    /* compiled from: FieldList.java */
    public static class d extends a<a.c> {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends Field> f416162b;

        public d() {
            throw null;
        }

        public d(Field... fieldArr) {
            this.f416162b = Arrays.asList(fieldArr);
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return new a.b(this.f416162b.get(i12));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416162b.size();
        }
    }

    /* compiled from: FieldList.java */
    public static class e extends a<a.c> {

        /* renamed from: b, reason: collision with root package name */
        public final InstrumentedType.b f416163b;

        /* renamed from: c, reason: collision with root package name */
        public final List<? extends a.g> f416164c;

        public e(InstrumentedType.b bVar, List list) {
            this.f416163b = bVar;
            this.f416164c = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return new a.e(this.f416163b, this.f416164c.get(i12));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416164c.size();
        }
    }

    /* compiled from: FieldList.java */
    public static class f extends a<a.d> {

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription.Generic.a f416165b;

        /* renamed from: c, reason: collision with root package name */
        public final b f416166c;

        /* renamed from: d, reason: collision with root package name */
        public final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> f416167d;

        public f(TypeDescription.Generic.a aVar, b bVar, TypeDescription.Generic.Visitor visitor) {
            this.f416165b = aVar;
            this.f416166c = bVar;
            this.f416167d = visitor;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return new a.h(this.f416165b, (net.bytebuddy.description.field.a) this.f416166c.get(i12), this.f416167d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416166c.size();
        }
    }

    a.InterfaceC11963a.C11964a c(InterfaceC44410t.a.AbstractC12113a abstractC12113a);
}
