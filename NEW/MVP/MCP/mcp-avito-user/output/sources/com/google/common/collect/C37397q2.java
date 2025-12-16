package com.google.common.collect;

import com.google.common.collect.C37391p2;
import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: LinkedListMultimap.java */
/* renamed from: com.google.common.collect.q2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37397q2 extends AbstractSequentialList<Map.Entry<Object, Object>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37391p2 f359957b;

    public C37397q2(C37391p2 c37391p2) {
        this.f359957b = c37391p2;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<Map.Entry<Object, Object>> listIterator(int i12) {
        return new C37391p2.f(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f359957b.f359917j;
    }
}
