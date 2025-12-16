package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.L0;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/k;", "Lkotlin/collections/L0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42811k extends L0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final long[] f406835b;

    /* renamed from: c, reason: collision with root package name */
    public int f406836c;

    public C42811k(@Y61.k long[] jArr) {
        this.f406835b = jArr;
    }

    @Override // kotlin.collections.L0
    public final long a() {
        try {
            long[] jArr = this.f406835b;
            int i12 = this.f406836c;
            this.f406836c = i12 + 1;
            return jArr[i12];
        } catch (ArrayIndexOutOfBoundsException e12) {
            this.f406836c--;
            throw new NoSuchElementException(e12.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f406836c < this.f406835b.length;
    }
}
