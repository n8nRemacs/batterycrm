package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42810j;

/* compiled from: Iterables.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u001c\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/collections/j0", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A implements Iterable<Integer>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f406636b;

    public A(int[] iArr) {
        this.f406636b = iArr;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return C42810j.f(this.f406636b);
    }
}
