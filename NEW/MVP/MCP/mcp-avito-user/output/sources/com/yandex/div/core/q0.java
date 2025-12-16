package com.yandex.div.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.InterfaceC43072x;

/* compiled from: ObserverList.java */
/* loaded from: classes7.dex */
public class q0<E> implements Iterable<E> {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f367630b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f367631c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f367632d;

    /* compiled from: ObserverList.java */
    public class b implements d<E> {

        /* renamed from: b, reason: collision with root package name */
        public final int f367633b;

        /* renamed from: c, reason: collision with root package name */
        public int f367634c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f367635d;

        public b(a aVar) {
            q0.this.f367631c++;
            this.f367633b = q0.this.f367630b.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i12;
            q0 q0Var;
            int i13 = this.f367634c;
            while (true) {
                i12 = this.f367633b;
                q0Var = q0.this;
                if (i13 >= i12 || q0Var.f367630b.get(i13) != null) {
                    break;
                }
                i13++;
            }
            if (i13 < i12) {
                return true;
            }
            if (this.f367635d) {
                return false;
            }
            this.f367635d = true;
            q0.a(q0Var);
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            int i12;
            q0 q0Var;
            while (true) {
                int i13 = this.f367634c;
                i12 = this.f367633b;
                q0Var = q0.this;
                if (i13 >= i12 || q0Var.f367630b.get(i13) != null) {
                    break;
                }
                this.f367634c++;
            }
            int i14 = this.f367634c;
            if (i14 < i12) {
                this.f367634c = i14 + 1;
                return (E) q0Var.f367630b.get(i14);
            }
            if (!this.f367635d) {
                this.f367635d = true;
                q0.a(q0Var);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ObserverList.java */
    public class c implements d<E> {

        /* renamed from: b, reason: collision with root package name */
        public int f367637b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f367638c;

        public c(a aVar) {
            q0.this.f367631c++;
            this.f367637b = q0.this.f367630b.size() - 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            q0 q0Var;
            int i12 = this.f367637b;
            while (true) {
                q0Var = q0.this;
                if (i12 < 0 || q0Var.f367630b.get(i12) != null) {
                    break;
                }
                i12--;
            }
            if (i12 >= 0) {
                return true;
            }
            if (this.f367638c) {
                return false;
            }
            this.f367638c = true;
            q0.a(q0Var);
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            q0 q0Var;
            while (true) {
                int i12 = this.f367637b;
                q0Var = q0.this;
                if (i12 < 0 || q0Var.f367630b.get(i12) != null) {
                    break;
                }
                this.f367637b--;
            }
            int i13 = this.f367637b;
            if (i13 >= 0) {
                this.f367637b = i13 - 1;
                return (E) q0Var.f367630b.get(i13);
            }
            if (!this.f367638c) {
                this.f367638c = true;
                q0.a(q0Var);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ObserverList.java */
    public interface d<E> extends Iterator<E> {
    }

    public static void a(q0 q0Var) {
        int i12 = q0Var.f367631c - 1;
        q0Var.f367631c = i12;
        if (i12 <= 0 && q0Var.f367632d) {
            q0Var.f367632d = false;
            ArrayList arrayList = q0Var.f367630b;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
        }
    }

    public final void b(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f367630b;
            if (arrayList.contains(obj)) {
                return;
            }
            arrayList.add(obj);
        }
    }

    public final void d(InterfaceC43072x interfaceC43072x) {
        ArrayList arrayList;
        int iIndexOf;
        if (interfaceC43072x == null || (iIndexOf = (arrayList = this.f367630b).indexOf(interfaceC43072x)) == -1) {
            return;
        }
        if (this.f367631c == 0) {
            arrayList.remove(iIndexOf);
        } else {
            this.f367632d = true;
            arrayList.set(iIndexOf, null);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        return new b(null);
    }
}
