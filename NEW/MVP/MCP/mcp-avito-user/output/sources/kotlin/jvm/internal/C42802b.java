package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractC42739c0;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/b;", "Lkotlin/collections/c0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42802b extends AbstractC42739c0 {

    /* renamed from: b, reason: collision with root package name */
    public int f406823b;

    @Override // kotlin.collections.AbstractC42739c0
    public final boolean a() {
        try {
            this.f406823b++;
            throw null;
        } catch (ArrayIndexOutOfBoundsException e12) {
            this.f406823b--;
            throw new NoSuchElementException(e12.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }
}
