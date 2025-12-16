package com.google.protobuf;

import com.google.protobuf.C37670d0;
import com.google.protobuf.s1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* renamed from: com.google.protobuf.j0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37682j0 extends AbstractC37667c<String> implements InterfaceC37684k0, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f362881d = 0;

    /* renamed from: c, reason: collision with root package name */
    public final List<Object> f362882c;

    /* compiled from: LazyStringArrayList.java */
    /* renamed from: com.google.protobuf.j0$a */
    public static class a extends AbstractList<byte[]> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i12, Object obj) {
            int i13 = C37682j0.f362881d;
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i12) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i12, Object obj) {
            int i13 = C37682j0.f362881d;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* compiled from: LazyStringArrayList.java */
    /* renamed from: com.google.protobuf.j0$b */
    public static class b extends AbstractList<AbstractC37700t> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i12, Object obj) {
            int i13 = C37682j0.f362881d;
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i12) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i12, Object obj) {
            int i13 = C37682j0.f362881d;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    static {
        new C37682j0((Object) null);
    }

    public C37682j0() {
        this(10);
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        b();
        this.f362882c.add(i12, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f362882c.size(), collection);
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f362882c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        String str;
        List<Object> list = this.f362882c;
        Object obj = list.get(i12);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC37700t) {
            AbstractC37700t abstractC37700t = (AbstractC37700t) obj;
            str = abstractC37700t.N();
            if (abstractC37700t.t()) {
                list.set(i12, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C37670d0.f362857a);
            s1.b bVar = s1.f362953a;
            if (s1.f362953a.f(0, bArr, 0, bArr.length) == 0) {
                list.set(i12, str);
            }
        }
        return str;
    }

    @Override // com.google.protobuf.InterfaceC37684k0
    public final Object getRaw(int i12) {
        return this.f362882c.get(i12);
    }

    @Override // com.google.protobuf.InterfaceC37684k0
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f362882c);
    }

    @Override // com.google.protobuf.InterfaceC37684k0
    public final InterfaceC37684k0 getUnmodifiableView() {
        return this.f362852b ? new p1(this) : this;
    }

    @Override // com.google.protobuf.AbstractC37667c, com.google.protobuf.C37670d0.k
    public final boolean isModifiable() {
        return this.f362852b;
    }

    @Override // com.google.protobuf.C37670d0.k, com.google.protobuf.C37670d0.b
    /* renamed from: mutableCopyWithCapacity */
    public final C37670d0.k mutableCopyWithCapacity2(int i12) {
        List<Object> list = this.f362882c;
        if (i12 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i12);
        arrayList.addAll(list);
        return new C37682j0((ArrayList<Object>) arrayList);
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        Object objRemove = this.f362882c.remove(i12);
        ((AbstractList) this).modCount++;
        return objRemove instanceof String ? (String) objRemove : objRemove instanceof AbstractC37700t ? ((AbstractC37700t) objRemove).N() : new String((byte[]) objRemove, C37670d0.f362857a);
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        b();
        Object obj2 = this.f362882c.set(i12, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof AbstractC37700t ? ((AbstractC37700t) obj2).N() : new String((byte[]) obj2, C37670d0.f362857a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f362882c.size();
    }

    @Override // com.google.protobuf.InterfaceC37684k0
    public final void u0(AbstractC37700t abstractC37700t) {
        b();
        this.f362882c.add(abstractC37700t);
        ((AbstractList) this).modCount++;
    }

    public C37682j0(Object obj) {
        super(false);
        this.f362882c = Collections.emptyList();
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i12, Collection<? extends String> collection) {
        b();
        if (collection instanceof InterfaceC37684k0) {
            collection = ((InterfaceC37684k0) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f362882c.addAll(i12, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public C37682j0(int i12) {
        this((ArrayList<Object>) new ArrayList(i12));
    }

    public C37682j0(ArrayList<Object> arrayList) {
        this.f362882c = arrayList;
    }
}
