package androidx.compose.runtime.external.kotlinx.collections.immutable;

import Y61.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;

/* compiled from: ImmutableList.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/b;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c<E> extends List<E>, b<E>, Z41.a {

    /* compiled from: ImmutableList.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/c$a;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "Lkotlin/collections/c;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<E> extends AbstractC42738c<E> implements c<E> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final c<E> f38289c;

        /* renamed from: d, reason: collision with root package name */
        public final int f38290d;

        /* renamed from: e, reason: collision with root package name */
        public final int f38291e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k c<? extends E> cVar, int i12, int i13) {
            this.f38289c = cVar;
            this.f38290d = i12;
            i0.e.c(i12, i13, cVar.size());
            this.f38291e = i13 - i12;
        }

        @Override // kotlin.collections.AbstractC42738c, java.util.List
        public final E get(int i12) {
            i0.e.a(i12, this.f38291e);
            return this.f38289c.get(this.f38290d + i12);
        }

        @Override // kotlin.collections.AbstractC42734a
        /* renamed from: getSize, reason: from getter */
        public final int getF38291e() {
            return this.f38291e;
        }

        @Override // kotlin.collections.AbstractC42738c, java.util.List
        public final List subList(int i12, int i13) {
            i0.e.c(i12, i13, this.f38291e);
            int i14 = this.f38290d;
            return new a(this.f38289c, i12 + i14, i14 + i13);
        }
    }

    @Override // java.util.List
    @k
    default c<E> subList(int i12, int i13) {
        return new a(this, i12, i13);
    }
}
