package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: SequencesJVM.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/sequences/a;", "T", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43018a<T> implements InterfaceC43030m<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<InterfaceC43030m<T>> f410489a;

    public C43018a(@Y61.k InterfaceC43030m<? extends T> interfaceC43030m) {
        this.f410489a = new AtomicReference<>(interfaceC43030m);
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<T> iterator() {
        InterfaceC43030m<T> andSet = this.f410489a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
