package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.s0;

/* compiled from: UIntRange.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/ranges/w;", "", "Lkotlin/s0;", "first", "last", "", "step", "<init>", "(IIILkotlin/jvm/internal/w;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
final class w implements Iterator<s0>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f406927b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f406928c;

    /* renamed from: d, reason: collision with root package name */
    public final int f406929d;

    /* renamed from: e, reason: collision with root package name */
    public int f406930e;

    public w(int i12, int i13, int i14, C42822w c42822w) {
        this.f406927b = i13;
        boolean z12 = false;
        int iCompareUnsigned = Integer.compareUnsigned(i12, i13);
        if (i14 <= 0 ? iCompareUnsigned >= 0 : iCompareUnsigned <= 0) {
            z12 = true;
        }
        this.f406928c = z12;
        int i15 = s0.f410475c;
        this.f406929d = i14;
        this.f406930e = z12 ? i12 : i13;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f406928c;
    }

    @Override // java.util.Iterator
    public final s0 next() {
        int i12 = this.f406930e;
        if (i12 != this.f406927b) {
            int i13 = this.f406929d + i12;
            int i14 = s0.f410475c;
            this.f406930e = i13;
        } else {
            if (!this.f406928c) {
                throw new NoSuchElementException();
            }
            this.f406928c = false;
        }
        return s0.a(i12);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
