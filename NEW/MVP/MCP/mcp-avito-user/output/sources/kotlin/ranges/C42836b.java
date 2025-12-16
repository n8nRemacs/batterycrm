package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractC42743e0;
import kotlin.jvm.internal.L;

/* compiled from: ProgressionIterators.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/b;", "Lkotlin/collections/e0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42836b extends AbstractC42743e0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f406894b;

    /* renamed from: c, reason: collision with root package name */
    public final int f406895c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f406896d;

    /* renamed from: e, reason: collision with root package name */
    public int f406897e;

    public C42836b(char c12, char c13, int i12) {
        this.f406894b = i12;
        this.f406895c = c13;
        boolean z12 = false;
        if (i12 <= 0 ? L.g(c12, c13) >= 0 : L.g(c12, c13) <= 0) {
            z12 = true;
        }
        this.f406896d = z12;
        this.f406897e = z12 ? c12 : c13;
    }

    @Override // kotlin.collections.AbstractC42743e0
    public final char a() {
        int i12 = this.f406897e;
        if (i12 != this.f406895c) {
            this.f406897e = this.f406894b + i12;
        } else {
            if (!this.f406896d) {
                throw new NoSuchElementException();
            }
            this.f406896d = false;
        }
        return (char) i12;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f406896d;
    }
}
