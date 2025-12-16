package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.C43025h;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/c;", "T", "K", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43020c<T, K> implements InterfaceC43030m<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43025h f410493a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<T, K> f410494b;

    public C43020c(@Y61.k C43025h c43025h, @Y61.k Y41.l lVar) {
        this.f410493a = c43025h;
        this.f410494b = lVar;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<T> iterator() {
        return new C43019b(new C43025h.a(this.f410493a), this.f410494b);
    }
}
