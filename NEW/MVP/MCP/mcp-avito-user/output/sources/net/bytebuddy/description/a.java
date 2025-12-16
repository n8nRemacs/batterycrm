package net.bytebuddy.description;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.description.annotation.AnnotationSource;
import net.bytebuddy.description.d;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.z;

/* compiled from: ByteCodeElement.java */
/* loaded from: classes8.dex */
public interface a extends d.InterfaceC11969d, d.a, c, net.bytebuddy.description.b, AnnotationSource {

    /* compiled from: ByteCodeElement.java */
    /* renamed from: net.bytebuddy.description.a$a, reason: collision with other inner class name */
    public interface InterfaceC11963a<T extends InterfaceC11963a<T>> {

        /* compiled from: ByteCodeElement.java */
        /* renamed from: net.bytebuddy.description.a$a$a, reason: collision with other inner class name */
        public static class C11964a<S extends InterfaceC11963a<S>> extends z.a<S, C11964a<S>> {

            /* renamed from: b, reason: collision with root package name */
            public final List<? extends S> f416033b;

            public C11964a(S... sArr) {
                this(Arrays.asList(sArr));
            }

            @Override // net.bytebuddy.matcher.z.a
            public final z a(List list) {
                return new C11964a(list);
            }

            public final C11964a b(TypeDescription.Generic.Visitor.d.b bVar) {
                List<? extends S> list = this.f416033b;
                ArrayList arrayList = new ArrayList(list.size());
                Iterator<? extends S> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a(bVar));
                }
                return new C11964a(arrayList);
            }

            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i12) {
                return this.f416033b.get(i12);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.f416033b.size();
            }

            public C11964a(List<? extends S> list) {
                this.f416033b = list;
            }
        }

        InterfaceC11963a a(TypeDescription.Generic.Visitor.d.b bVar);
    }

    /* compiled from: ByteCodeElement.java */
    public interface b<T extends b<?, S>, S extends InterfaceC11963a<S>> {
        InterfaceC11963a a(InterfaceC44410t.a.AbstractC12113a abstractC12113a);

        T i();
    }

    boolean P(TypeDescription typeDescription);

    boolean o0(TypeDescription typeDescription);
}
