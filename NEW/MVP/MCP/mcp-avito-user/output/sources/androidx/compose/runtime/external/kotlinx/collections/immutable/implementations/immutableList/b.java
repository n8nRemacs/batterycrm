package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.P;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AbstractPersistentList.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/b;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "Lkotlin/collections/c;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class b<E> extends AbstractC42738c<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> {

    /* compiled from: AbstractPersistentList.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<E, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Collection<E> f38294l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends E> collection) {
            super(1);
            this.f38294l = collection;
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f38294l.contains(obj));
        }
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> addAll(@Y61.k Collection<? extends E> collection) {
        g gVarBuilder = builder();
        gVarBuilder.addAll(collection);
        return gVarBuilder.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.Collection, java.lang.Iterable, java.util.List
    @Y61.k
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    @Y61.k
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> remove(E e12) {
        int iIndexOf = indexOf(e12);
        return iIndexOf != -1 ? X4(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> removeAll(@Y61.k Collection<? extends E> collection) {
        return q5(new a(collection));
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final List subList(int i12, int i13) {
        return super.subList(i12, i13);
    }
}
