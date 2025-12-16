package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.f1;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/l;", "Lkotlin/collections/f1;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42812l extends f1 {

    /* renamed from: b, reason: collision with root package name */
    public int f406837b;

    @Override // kotlin.collections.f1
    public final short a() {
        try {
            this.f406837b++;
            throw null;
        } catch (ArrayIndexOutOfBoundsException e12) {
            this.f406837b--;
            throw new NoSuchElementException(e12.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }
}
