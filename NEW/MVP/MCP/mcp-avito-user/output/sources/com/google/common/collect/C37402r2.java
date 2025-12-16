package com.google.common.collect;

import com.google.common.collect.C37391p2;
import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: LinkedListMultimap.java */
/* renamed from: com.google.common.collect.r2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37402r2 extends AbstractSequentialList<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37391p2 f359984b;

    /* compiled from: LinkedListMultimap.java */
    /* renamed from: com.google.common.collect.r2$a */
    public class a extends A4<Map.Entry<Object, Object>, Object> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C37391p2.f f359985c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ListIterator listIterator, C37391p2.f fVar) {
            super(listIterator);
            this.f359985c = fVar;
        }

        @Override // com.google.common.collect.z4
        @InterfaceC37434x3
        public final Object a(Object obj) {
            return ((Map.Entry) obj).getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.A4, java.util.ListIterator
        public final void set(@InterfaceC37434x3 Object obj) {
            C37391p2.f fVar = this.f359985c;
            com.google.common.base.M.q(fVar.f359938d != null);
            fVar.f359938d.f359931c = obj;
        }
    }

    public C37402r2(C37391p2 c37391p2) {
        this.f359984b = c37391p2;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<Object> listIterator(int i12) {
        C37391p2.f fVar = new C37391p2.f(i12);
        return new a(fVar, fVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f359984b.f359917j;
    }
}
