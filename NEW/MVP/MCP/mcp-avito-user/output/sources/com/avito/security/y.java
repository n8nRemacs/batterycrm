package com.avito.security;

import androidx.camera.camera2.internal.G;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
class y extends x {
    public static final <T, A extends Appendable> A a(Iterable<? extends T> iterable, A a12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i12, CharSequence charSequence4, r0<? super T, ? extends CharSequence> r0Var) throws IOException {
        y0.b(iterable, "$this$joinTo");
        y0.b(a12, "buffer");
        y0.b(charSequence, "separator");
        y0.b(charSequence2, "prefix");
        y0.b(charSequence3, "postfix");
        y0.b(charSequence4, "truncated");
        a12.append(charSequence2);
        int i13 = 0;
        for (T t12 : iterable) {
            i13++;
            if (i13 > 1) {
                a12.append(charSequence);
            }
            if (i12 >= 0 && i13 > i12) {
                break;
            }
            f2.a(a12, t12, r0Var);
        }
        if (i12 >= 0 && i13 > i12) {
            a12.append(charSequence4);
        }
        a12.append(charSequence3);
        return a12;
    }

    public static <T> T b(Iterable<? extends T> iterable) {
        y0.b(iterable, "$this$single");
        if (iterable instanceof List) {
            return (T) c((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T c(List<? extends T> list) {
        y0.b(list, "$this$single");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final <T> List<T> d(Iterable<? extends T> iterable) {
        y0.b(iterable, "$this$toMutableList");
        return iterable instanceof Collection ? a((Collection) iterable) : (List) a(iterable, new ArrayList());
    }

    public static final <T> T a(Iterable<? extends T> iterable) {
        y0.b(iterable, "$this$first");
        if (iterable instanceof List) {
            return (T) b((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T b(List<? extends T> list) {
        y0.b(list, "$this$first");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final <T> List<T> c(Iterable<? extends T> iterable) {
        y0.b(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return q.a(d(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return q.a();
        }
        if (size != 1) {
            return a(collection);
        }
        return p.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> String a(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i12, CharSequence charSequence4, r0<? super T, ? extends CharSequence> r0Var) {
        y0.b(iterable, "$this$joinToString");
        y0.b(charSequence, "separator");
        y0.b(charSequence2, "prefix");
        y0.b(charSequence3, "postfix");
        y0.b(charSequence4, "truncated");
        String string = ((StringBuilder) a(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i12, charSequence4, r0Var)).toString();
        y0.a((Object) string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static <T> List<T> b(Iterable<? extends T> iterable, int i12) {
        y0.b(iterable, "$this$take");
        if (i12 < 0) {
            throw new IllegalArgumentException(G.e(i12, "Requested element count ", " is less than zero.").toString());
        }
        if (i12 == 0) {
            return q.a();
        }
        if (iterable instanceof Collection) {
            if (i12 >= ((Collection) iterable).size()) {
                return c(iterable);
            }
            if (i12 == 1) {
                return p.a(a((Iterable) iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i12);
        Iterator<? extends T> it = iterable.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i13++;
            if (i13 == i12) {
                break;
            }
        }
        return q.a((List) arrayList);
    }

    public static /* synthetic */ String a(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i12, CharSequence charSequence4, r0 r0Var, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i13 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i13 & 4) == 0 ? charSequence3 : "";
        if ((i13 & 8) != 0) {
            i12 = -1;
        }
        int i14 = i12;
        if ((i13 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i13 & 32) != 0) {
            r0Var = null;
        }
        return a(iterable, charSequence, charSequence5, charSequence6, i14, charSequence7, r0Var);
    }

    public static final <T, C extends Collection<? super T>> C a(Iterable<? extends T> iterable, C c12) {
        y0.b(iterable, "$this$toCollection");
        y0.b(c12, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c12.add(it.next());
        }
        return c12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> a(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        y0.b(iterable, "$this$sortedWith");
        y0.b(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listD = d(iterable);
            u.a(listD, comparator);
            return listD;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return c(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        e.a(array, comparator);
        return e.a(array);
    }

    public static final <T> List<T> a(Collection<? extends T> collection) {
        y0.b(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }
}
