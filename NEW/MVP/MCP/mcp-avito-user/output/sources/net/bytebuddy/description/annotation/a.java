package net.bytebuddy.description.annotation;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.matcher.z;

/* compiled from: AnnotationList.java */
/* loaded from: classes8.dex */
public interface a extends z<AnnotationDescription, a> {

    /* compiled from: AnnotationList.java */
    /* renamed from: net.bytebuddy.description.annotation.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC11967a extends z.a<AnnotationDescription, a> implements a {
        @Override // net.bytebuddy.matcher.z.a
        public final z a(List<AnnotationDescription> list) {
            return new c(list);
        }

        @Override // net.bytebuddy.description.annotation.a
        public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
            Iterator<AnnotationDescription> it = iterator();
            while (it.hasNext()) {
                if (it.next().a().Q2(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // net.bytebuddy.description.annotation.a
        public final a l2(HashSet hashSet) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<AnnotationDescription> it = iterator();
            while (it.hasNext()) {
                AnnotationDescription next = it.next();
                if (!hashSet.contains(next.a()) && next.e()) {
                    arrayList.add(next);
                }
            }
            return new c(arrayList);
        }

        @Override // net.bytebuddy.description.annotation.a
        @net.bytebuddy.utility.nullability.b
        public final <T extends Annotation> AnnotationDescription.g<T> m6(Class<T> cls) {
            Iterator<AnnotationDescription> it = iterator();
            while (it.hasNext()) {
                AnnotationDescription next = it.next();
                if (next.a().Q2(cls)) {
                    return next.c(cls);
                }
            }
            return null;
        }
    }

    /* compiled from: AnnotationList.java */
    public static class c extends AbstractC11967a {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends AnnotationDescription> f416136b;

        public c(List<? extends AnnotationDescription> list) {
            this.f416136b = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return this.f416136b.get(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416136b.size();
        }
    }

    /* compiled from: AnnotationList.java */
    public static class d extends AbstractC11967a {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends Annotation> f416137b;

        public d(Annotation... annotationArr) {
            this((List<? extends Annotation>) Arrays.asList(annotationArr));
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            Annotation annotation = this.f416137b.get(i12);
            return new AnnotationDescription.e(annotation.annotationType(), annotation);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416137b.size();
        }

        public d(List<? extends Annotation> list) {
            this.f416137b = list;
        }
    }

    boolean isAnnotationPresent(Class<? extends Annotation> cls);

    a l2(HashSet hashSet);

    @net.bytebuddy.utility.nullability.b
    <T extends Annotation> AnnotationDescription.g<T> m6(Class<T> cls);

    /* compiled from: AnnotationList.java */
    public static class b extends z.b<AnnotationDescription, a> implements a {
        @Override // net.bytebuddy.description.annotation.a
        public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
            return false;
        }

        @Override // net.bytebuddy.description.annotation.a
        @net.bytebuddy.utility.nullability.a
        public final <T extends Annotation> AnnotationDescription.g<T> m6(Class<T> cls) {
            return null;
        }

        @Override // net.bytebuddy.description.annotation.a
        public final a l2(HashSet hashSet) {
            return this;
        }
    }
}
