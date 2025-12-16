package com.google.common.collect;

import com.google.common.collect.C37374m3;
import com.google.common.collect.InterfaceC37338g3;
import java.util.Iterator;

/* compiled from: DescendingMultiset.java */
/* renamed from: com.google.common.collect.c0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37311c0 extends C37374m3.d<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC37317d0 f359657b;

    public C37311c0(AbstractC37317d0 abstractC37317d0) {
        this.f359657b = abstractC37317d0;
    }

    @Override // com.google.common.collect.C37374m3.d
    public final InterfaceC37338g3<Object> e() {
        return this.f359657b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<InterfaceC37338g3.a<Object>> iterator() {
        return this.f359657b.c0();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f359657b.d0().entrySet().size();
    }
}
