package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.l61;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.yandex.mobile.ads.impl.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC39321f<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    private int f385149a = 2;

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    private String f385150b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int iA2;
        int i12 = this.f385149a;
        if (i12 == 4) {
            throw new IllegalStateException();
        }
        int iA3 = n6.a(i12);
        if (iA3 == 0) {
            return true;
        }
        if (iA3 == 2) {
            return false;
        }
        this.f385149a = 4;
        l61.a aVar = (l61.a) this;
        int i13 = aVar.f387401f;
        while (true) {
            int i14 = aVar.f387401f;
            if (i14 == -1) {
                aVar.f385149a = 3;
                string = null;
                break;
            }
            j61 j61Var = (j61) aVar;
            iA2 = j61Var.f386767h.f387067a.a(j61Var.f387398c, i14);
            if (iA2 == -1) {
                iA2 = aVar.f387398c.length();
                aVar.f387401f = -1;
            } else {
                aVar.f387401f = iA2 + 1;
            }
            int i15 = aVar.f387401f;
            if (i15 == i13) {
                int i16 = i15 + 1;
                aVar.f387401f = i16;
                if (i16 > aVar.f387398c.length()) {
                    aVar.f387401f = -1;
                }
            } else {
                while (i13 < iA2 && aVar.f387399d.a(aVar.f387398c.charAt(i13))) {
                    i13++;
                }
                while (iA2 > i13 && aVar.f387399d.a(aVar.f387398c.charAt(iA2 - 1))) {
                    iA2--;
                }
                if (!aVar.f387400e || i13 != iA2) {
                    break;
                }
                i13 = aVar.f387401f;
            }
        }
        int i17 = aVar.f387402g;
        if (i17 == 1) {
            iA2 = aVar.f387398c.length();
            aVar.f387401f = -1;
            while (iA2 > i13 && aVar.f387399d.a(aVar.f387398c.charAt(iA2 - 1))) {
                iA2--;
            }
        } else {
            aVar.f387402g = i17 - 1;
        }
        string = aVar.f387398c.subSequence(i13, iA2).toString();
        this.f385150b = string;
        if (this.f385149a == 3) {
            return false;
        }
        this.f385149a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f385149a = 2;
        T t12 = (T) this.f385150b;
        this.f385150b = null;
        return t12;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
