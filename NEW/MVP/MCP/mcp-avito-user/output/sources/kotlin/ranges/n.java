package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.L0;

/* compiled from: ProgressionIterators.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/n;", "Lkotlin/collections/L0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n extends L0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f406918b;

    /* renamed from: c, reason: collision with root package name */
    public final long f406919c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f406920d;

    /* renamed from: e, reason: collision with root package name */
    public long f406921e;

    public n(long j12, long j13, long j14) {
        this.f406918b = j14;
        this.f406919c = j13;
        boolean z12 = false;
        if (j14 <= 0 ? j12 >= j13 : j12 <= j13) {
            z12 = true;
        }
        this.f406920d = z12;
        this.f406921e = z12 ? j12 : j13;
    }

    @Override // kotlin.collections.L0
    public final long a() {
        long j12 = this.f406921e;
        if (j12 != this.f406919c) {
            this.f406921e = this.f406918b + j12;
        } else {
            if (!this.f406920d) {
                throw new NoSuchElementException();
            }
            this.f406920d = false;
        }
        return j12;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f406920d;
    }
}
