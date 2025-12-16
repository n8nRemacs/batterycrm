package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public final class fm<E> implements Iterable<E> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f385416a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @j.B
    private final HashMap f385417b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    @j.B
    private Set<E> f385418c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    @j.B
    private List<E> f385419d = Collections.emptyList();

    public final void a(E e12) {
        synchronized (this.f385416a) {
            try {
                ArrayList arrayList = new ArrayList(this.f385419d);
                arrayList.add(e12);
                this.f385419d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f385417b.get(e12);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f385418c);
                    hashSet.add(e12);
                    this.f385418c = Collections.unmodifiableSet(hashSet);
                }
                this.f385417b.put(e12, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int b(E e12) {
        int iIntValue;
        synchronized (this.f385416a) {
            try {
                iIntValue = this.f385417b.containsKey(e12) ? ((Integer) this.f385417b.get(e12)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public final void c(E e12) {
        synchronized (this.f385416a) {
            try {
                Integer num = (Integer) this.f385417b.get(e12);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f385419d);
                arrayList.remove(e12);
                this.f385419d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f385417b.remove(e12);
                    HashSet hashSet = new HashSet(this.f385418c);
                    hashSet.remove(e12);
                    this.f385418c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f385417b.put(e12, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f385416a) {
            it = this.f385419d.iterator();
        }
        return it;
    }

    public final Set<E> a() {
        Set<E> set;
        synchronized (this.f385416a) {
            set = this.f385418c;
        }
        return set;
    }
}
