package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42810j;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: Sequences.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/sequences/t", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class K implements InterfaceC43030m<Long> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long[] f406648a;

    public K(long[] jArr) {
        this.f406648a = jArr;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    public final Iterator<Long> iterator() {
        return C42810j.g(this.f406648a);
    }
}
