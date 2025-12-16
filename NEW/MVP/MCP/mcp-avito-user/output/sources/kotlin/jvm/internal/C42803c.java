package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractC42741d0;

/* compiled from: ArrayIterators.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/c;", "Lkotlin/collections/d0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42803c extends AbstractC42741d0 {

    /* renamed from: b, reason: collision with root package name */
    public int f406824b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // kotlin.collections.AbstractC42741d0
    public final byte nextByte() {
        try {
            this.f406824b++;
            throw null;
        } catch (ArrayIndexOutOfBoundsException e12) {
            this.f406824b--;
            throw new NoSuchElementException(e12.getMessage());
        }
    }
}
