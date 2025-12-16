package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractC42780x0;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/e;", "Lkotlin/collections/x0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42805e extends AbstractC42780x0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final double[] f406827b;

    /* renamed from: c, reason: collision with root package name */
    public int f406828c;

    public C42805e(@Y61.k double[] dArr) {
        this.f406827b = dArr;
    }

    @Override // kotlin.collections.AbstractC42780x0
    public final double a() {
        try {
            double[] dArr = this.f406827b;
            int i12 = this.f406828c;
            this.f406828c = i12 + 1;
            return dArr[i12];
        } catch (ArrayIndexOutOfBoundsException e12) {
            this.f406828c--;
            throw new NoSuchElementException(e12.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f406828c < this.f406827b.length;
    }
}
