package androidx.compose.runtime.external.kotlinx.collections.immutable;

import Y61.k;
import androidx.compose.runtime.external.kotlinx.collections.immutable.f;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ImmutableSet.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface i<E> extends e<E>, f<E> {

    /* compiled from: ImmutableSet.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/i$a;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/f$a;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a<E> extends Set<E>, f.a<E>, Z41.h {
        @k
        i<E> build();
    }

    @Override // java.util.Set, java.util.Collection
    @k
    i<E> add(E e12);

    @Override // java.util.Set, java.util.Collection
    @k
    i<E> addAll(@k Collection<? extends E> collection);

    @k
    a<E> builder();

    @Override // java.util.Set, java.util.Collection
    @k
    i<E> remove(E e12);

    @Override // java.util.Set, java.util.Collection
    @k
    i<E> removeAll(@k Collection<? extends E> collection);
}
