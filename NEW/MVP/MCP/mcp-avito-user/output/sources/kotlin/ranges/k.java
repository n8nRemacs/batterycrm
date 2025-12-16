package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.K0;

/* compiled from: ProgressionIterators.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/k;", "Lkotlin/collections/K0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k extends K0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f406908b;

    /* renamed from: c, reason: collision with root package name */
    public final int f406909c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f406910d;

    /* renamed from: e, reason: collision with root package name */
    public int f406911e;

    public k(int i12, int i13, int i14) {
        this.f406908b = i14;
        this.f406909c = i13;
        boolean z12 = false;
        if (i14 <= 0 ? i12 >= i13 : i12 <= i13) {
            z12 = true;
        }
        this.f406910d = z12;
        this.f406911e = z12 ? i12 : i13;
    }

    @Override // kotlin.collections.K0
    public final int a() {
        int i12 = this.f406911e;
        if (i12 != this.f406909c) {
            this.f406911e = this.f406908b + i12;
        } else {
            if (!this.f406910d) {
                throw new NoSuchElementException();
            }
            this.f406910d = false;
        }
        return i12;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f406910d;
    }
}
