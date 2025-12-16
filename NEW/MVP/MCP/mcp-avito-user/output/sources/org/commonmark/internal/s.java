package org.commonmark.internal;

import Q61.A;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: StaggeredDelimiterProcessor.java */
/* loaded from: classes7.dex */
class s implements S61.a {

    /* renamed from: a, reason: collision with root package name */
    public final char f420362a;

    /* renamed from: b, reason: collision with root package name */
    public int f420363b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList<S61.a> f420364c = new LinkedList<>();

    public s(char c12) {
        this.f420362a = c12;
    }

    @Override // S61.a
    public final char a() {
        return this.f420362a;
    }

    @Override // S61.a
    public final int b() {
        return this.f420363b;
    }

    @Override // S61.a
    public final char c() {
        return this.f420362a;
    }

    @Override // S61.a
    public final int d(f fVar, f fVar2) {
        S61.a first;
        int i12 = fVar.f420275g;
        LinkedList<S61.a> linkedList = this.f420364c;
        Iterator<S61.a> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                first = linkedList.getFirst();
                break;
            }
            first = it.next();
            if (first.b() <= i12) {
                break;
            }
        }
        return first.d(fVar, fVar2);
    }

    @Override // S61.a
    public final void e(A a12, A a13, int i12) {
        S61.a first;
        LinkedList<S61.a> linkedList = this.f420364c;
        Iterator<S61.a> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                first = linkedList.getFirst();
                break;
            } else {
                first = it.next();
                if (first.b() <= i12) {
                    break;
                }
            }
        }
        first.e(a12, a13, i12);
    }

    public final void f(S61.a aVar) {
        int iB2 = aVar.b();
        LinkedList<S61.a> linkedList = this.f420364c;
        ListIterator<S61.a> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int iB3 = listIterator.next().b();
            if (iB2 > iB3) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (iB2 == iB3) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f420362a + "' and minimum length " + iB2);
            }
        }
        linkedList.add(aVar);
        this.f420363b = iB2;
    }
}
