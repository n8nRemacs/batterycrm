package net.bytebuddy.matcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

/* compiled from: ElementMatcher.java */
/* renamed from: net.bytebuddy.matcher.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC44410t<T> {

    /* compiled from: ElementMatcher.java */
    /* renamed from: net.bytebuddy.matcher.t$a */
    public interface a<S> extends InterfaceC44410t<S> {

        /* compiled from: ElementMatcher.java */
        /* renamed from: net.bytebuddy.matcher.t$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC12113a<V> implements a<V> {
            public final b a(InterfaceC44410t interfaceC44410t) {
                return new b(this, interfaceC44410t);
            }

            @Override // net.bytebuddy.matcher.InterfaceC44410t.a
            public final c d(InterfaceC44410t interfaceC44410t) {
                return new c(this, interfaceC44410t);
            }
        }

        /* compiled from: ElementMatcher.java */
        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.matcher.t$a$b */
        public static class b<W> extends AbstractC12113a<W> {

            /* renamed from: b, reason: collision with root package name */
            public final ArrayList f418436b;

            public b() {
                throw null;
            }

            public b(InterfaceC44410t<? super W>... interfaceC44410tArr) {
                List<InterfaceC44410t> listAsList = Arrays.asList(interfaceC44410tArr);
                this.f418436b = new ArrayList(listAsList.size());
                for (InterfaceC44410t interfaceC44410t : listAsList) {
                    if (interfaceC44410t instanceof b) {
                        this.f418436b.addAll(((b) interfaceC44410t).f418436b);
                    } else {
                        this.f418436b.add(interfaceC44410t);
                    }
                }
            }

            @Override // net.bytebuddy.matcher.InterfaceC44410t
            public final boolean b(@net.bytebuddy.utility.nullability.d W w12) {
                Iterator it = this.f418436b.iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC44410t) it.next()).b(w12)) {
                        return false;
                    }
                }
                return true;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.f418436b.equals(((b) obj).f418436b);
            }

            public final int hashCode() {
                return this.f418436b.hashCode() + (getClass().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("(");
                Iterator it = this.f418436b.iterator();
                boolean z12 = true;
                while (it.hasNext()) {
                    InterfaceC44410t interfaceC44410t = (InterfaceC44410t) it.next();
                    if (z12) {
                        z12 = false;
                    } else {
                        sb2.append(" and ");
                    }
                    sb2.append(interfaceC44410t);
                }
                sb2.append(")");
                return sb2.toString();
            }
        }

        /* compiled from: ElementMatcher.java */
        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.matcher.t$a$c */
        public static class c<W> extends AbstractC12113a<W> {

            /* renamed from: b, reason: collision with root package name */
            public final ArrayList f418437b;

            public c() {
                throw null;
            }

            public c(InterfaceC44410t<? super W>... interfaceC44410tArr) {
                List<InterfaceC44410t> listAsList = Arrays.asList(interfaceC44410tArr);
                this.f418437b = new ArrayList(listAsList.size());
                for (InterfaceC44410t interfaceC44410t : listAsList) {
                    if (interfaceC44410t instanceof c) {
                        this.f418437b.addAll(((c) interfaceC44410t).f418437b);
                    } else {
                        this.f418437b.add(interfaceC44410t);
                    }
                }
            }

            @Override // net.bytebuddy.matcher.InterfaceC44410t
            public final boolean b(@net.bytebuddy.utility.nullability.d W w12) {
                Iterator it = this.f418437b.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC44410t) it.next()).b(w12)) {
                        return true;
                    }
                }
                return false;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.f418437b.equals(((c) obj).f418437b);
            }

            public final int hashCode() {
                return this.f418437b.hashCode() + (getClass().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("(");
                Iterator it = this.f418437b.iterator();
                boolean z12 = true;
                while (it.hasNext()) {
                    InterfaceC44410t interfaceC44410t = (InterfaceC44410t) it.next();
                    if (z12) {
                        z12 = false;
                    } else {
                        sb2.append(" or ");
                    }
                    sb2.append(interfaceC44410t);
                }
                sb2.append(")");
                return sb2.toString();
            }
        }

        /* compiled from: ElementMatcher.java */
        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.matcher.t$a$d */
        public static abstract class d<W> extends AbstractC12113a<W> {
            @Override // net.bytebuddy.matcher.InterfaceC44410t
            public final boolean b(@net.bytebuddy.utility.nullability.b W w12) {
                return w12 != null && c(w12);
            }

            public abstract boolean c(W w12);

            public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass();
            }

            public int hashCode() {
                return getClass().hashCode();
            }
        }

        c d(InterfaceC44410t interfaceC44410t);
    }

    boolean b(@net.bytebuddy.utility.nullability.d T t12);
}
