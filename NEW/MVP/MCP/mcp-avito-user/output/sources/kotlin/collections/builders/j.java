package kotlin.collections.builders;

import Y61.k;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC42748h;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.C42822w;

/* compiled from: SetBuilder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\u000bB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/collections/builders/j;", "E", "", "Lkotlin/collections/h;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "writeReplace", "()Ljava/lang/Object;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class j<E> extends AbstractC42748h<E> implements Set<E>, Serializable, Z41.h {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final j f406710c;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d<E, ?> f406711b;

    /* compiled from: SetBuilder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/j$a;", "", "<init>", "()V", "Lkotlin/collections/builders/j;", "", "Empty", "Lkotlin/collections/builders/j;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        d.f406683o.getClass();
        f406710c = new j(d.f406684p);
    }

    public j(@k d<E, ?> dVar) {
        this.f406711b = dVar;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f406711b.f406697n) {
            return new h(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e12) {
        return this.f406711b.a(e12) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(@k Collection<? extends E> collection) {
        this.f406711b.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f406711b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f406711b.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC42748h
    /* renamed from: getSize */
    public final int getF395508f() {
        return this.f406711b.f406693j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f406711b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @k
    public final Iterator<E> iterator() {
        d<E, ?> dVar = this.f406711b;
        dVar.getClass();
        return new d.e(dVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        d<E, ?> dVar = this.f406711b;
        dVar.c();
        int iG2 = dVar.g(obj);
        if (iG2 < 0) {
            return false;
        }
        dVar.l(iG2);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(@k Collection<? extends Object> collection) {
        this.f406711b.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(@k Collection<? extends Object> collection) {
        this.f406711b.c();
        return super.retainAll(collection);
    }

    public j() {
        this(new d());
    }
}
