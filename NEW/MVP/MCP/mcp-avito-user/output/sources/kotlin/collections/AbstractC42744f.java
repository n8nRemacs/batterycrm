package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;

/* compiled from: AbstractMutableList.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/collections/f;", "E", "", "Ljava/util/AbstractList;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* renamed from: kotlin.collections.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42744f<E> extends AbstractList<E> implements List<E>, Z41.e {
    public abstract E a(int i12);

    /* renamed from: getSize */
    public abstract int getF406741d();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i12) {
        return a(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getF406741d();
    }
}
