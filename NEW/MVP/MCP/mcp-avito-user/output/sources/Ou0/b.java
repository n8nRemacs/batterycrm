package OU0;

import Y61.k;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* compiled from: KotlinxJson.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOU0/b;", "", "LPU0/f;", "kotlinx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements ListIterator<PU0.f>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListIterator<JsonElement> f12287b;

    public b(Integer num, c cVar) {
        ListIterator<JsonElement> listIterator;
        JsonArray jsonArray = cVar.f12288b;
        if (num == null) {
            listIterator = jsonArray.f412948b.listIterator();
        } else {
            listIterator = jsonArray.f412948b.listIterator(num.intValue());
        }
        this.f12287b = listIterator;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(PU0.f fVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12287b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12287b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return f.b(this.f12287b.next());
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12287b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final PU0.f previous() {
        return f.b(this.f12287b.previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12287b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(PU0.f fVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
