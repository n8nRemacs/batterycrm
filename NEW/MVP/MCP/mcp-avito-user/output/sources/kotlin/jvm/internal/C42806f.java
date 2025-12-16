package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C0;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/f;", "Lkotlin/collections/C0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42806f extends C0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final float[] f406829b;

    /* renamed from: c, reason: collision with root package name */
    public int f406830c;

    public C42806f(@Y61.k float[] fArr) {
        this.f406829b = fArr;
    }

    @Override // kotlin.collections.C0
    public final float a() {
        try {
            float[] fArr = this.f406829b;
            int i12 = this.f406830c;
            this.f406830c = i12 + 1;
            return fArr[i12];
        } catch (ArrayIndexOutOfBoundsException e12) {
            this.f406830c--;
            throw new NoSuchElementException(e12.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f406830c < this.f406829b.length;
    }
}
