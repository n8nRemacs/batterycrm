package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.K0;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/g;", "Lkotlin/collections/K0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42807g extends K0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final int[] f406831b;

    /* renamed from: c, reason: collision with root package name */
    public int f406832c;

    public C42807g(@Y61.k int[] iArr) {
        this.f406831b = iArr;
    }

    @Override // kotlin.collections.K0
    public final int a() {
        try {
            int[] iArr = this.f406831b;
            int i12 = this.f406832c;
            this.f406832c = i12 + 1;
            return iArr[i12];
        } catch (ArrayIndexOutOfBoundsException e12) {
            this.f406832c--;
            throw new NoSuchElementException(e12.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f406832c < this.f406831b.length;
    }
}
