package androidx.compose.runtime.external.kotlinx.collections.immutable;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.external.kotlinx.collections.immutable.f;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ImmutableList.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface g<E> extends c<E>, f<E> {

    /* compiled from: ImmutableList.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/g$a;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/f$a;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a<E> extends List<E>, f.a<E>, Z41.e {
    }

    @k
    g<E> X4(int i12);

    @Override // java.util.List
    @k
    g<E> add(int i12, E e12);

    @Override // java.util.List, java.util.Collection
    @k
    g<E> add(E e12);

    @Override // java.util.List, java.util.Collection
    @k
    g<E> addAll(@k Collection<? extends E> collection);

    @k
    androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.g builder();

    @k
    g<E> q5(@k l<? super E, Boolean> lVar);

    @Override // java.util.List, java.util.Collection
    @k
    g<E> remove(E e12);

    @Override // java.util.List, java.util.Collection
    @k
    g<E> removeAll(@k Collection<? extends E> collection);

    @Override // java.util.List
    @k
    g<E> set(int i12, E e12);
}
