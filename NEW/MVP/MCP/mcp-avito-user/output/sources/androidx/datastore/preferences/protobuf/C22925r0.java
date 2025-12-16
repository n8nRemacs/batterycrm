package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import androidx.datastore.preferences.protobuf.L1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22925r0 extends AbstractC22883c<String> implements InterfaceC22927s0, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f45916d = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f45917c;

    /* compiled from: LazyStringArrayList.java */
    /* renamed from: androidx.datastore.preferences.protobuf.r0$a */
    public static class a extends AbstractList<byte[]> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i12, Object obj) {
            int i13 = C22925r0.f45916d;
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
            int i13 = C22925r0.f45916d;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* compiled from: LazyStringArrayList.java */
    /* renamed from: androidx.datastore.preferences.protobuf.r0$b */
    public static class b extends AbstractList<AbstractC22934w> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i12, Object obj) {
            int i13 = C22925r0.f45916d;
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
            int i13 = C22925r0.f45916d;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    static {
        new C22925r0().f45804b = false;
    }

    public C22925r0() {
        this(10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        b();
        this.f45917c.add(i12, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f45917c.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f45917c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        String str;
        ArrayList arrayList = this.f45917c;
        Object obj = arrayList.get(i12);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC22934w) {
            AbstractC22934w abstractC22934w = (AbstractC22934w) obj;
            abstractC22934w.getClass();
            str = abstractC22934w.size() == 0 ? "" : abstractC22934w.E(C22914m0.f45874a);
            if (abstractC22934w.s()) {
                arrayList.set(i12, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C22914m0.f45874a);
            L1.b bVar = L1.f45728a;
            if (L1.f45728a.e(bArr, 0, bArr.length)) {
                arrayList.set(i12, str);
            }
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22927s0
    public final Object getRaw(int i12) {
        return this.f45917c.get(i12);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22927s0
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f45917c);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22927s0
    public final InterfaceC22927s0 getUnmodifiableView() {
        return this.f45804b ? new J1(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, androidx.datastore.preferences.protobuf.C22914m0.k
    public final boolean isModifiable() {
        return this.f45804b;
    }

    @Override // androidx.datastore.preferences.protobuf.C22914m0.k
    public final C22914m0.k mutableCopyWithCapacity(int i12) {
        ArrayList arrayList = this.f45917c;
        if (i12 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i12);
        arrayList2.addAll(arrayList);
        return new C22925r0((ArrayList<Object>) arrayList2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22927s0
    public final void n4(AbstractC22934w abstractC22934w) {
        b();
        this.f45917c.add(abstractC22934w);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        Object objRemove = this.f45917c.remove(i12);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC22934w)) {
            return new String((byte[]) objRemove, C22914m0.f45874a);
        }
        AbstractC22934w abstractC22934w = (AbstractC22934w) objRemove;
        abstractC22934w.getClass();
        return abstractC22934w.size() == 0 ? "" : abstractC22934w.E(C22914m0.f45874a);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        b();
        Object obj2 = this.f45917c.set(i12, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC22934w)) {
            return new String((byte[]) obj2, C22914m0.f45874a);
        }
        AbstractC22934w abstractC22934w = (AbstractC22934w) obj2;
        abstractC22934w.getClass();
        return abstractC22934w.size() == 0 ? "" : abstractC22934w.E(C22914m0.f45874a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45917c.size();
    }

    public C22925r0(int i12) {
        this((ArrayList<Object>) new ArrayList(i12));
    }

    public C22925r0(ArrayList<Object> arrayList) {
        this.f45917c = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i12, Collection<? extends String> collection) {
        b();
        if (collection instanceof InterfaceC22927s0) {
            collection = ((InterfaceC22927s0) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f45917c.addAll(i12, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
