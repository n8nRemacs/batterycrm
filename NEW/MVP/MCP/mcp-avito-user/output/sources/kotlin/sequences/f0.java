package kotlin.sequences;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: _Sequences.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/sequences/f0;", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f0 implements InterfaceC43030m<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43030m<Object> f410500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator<Object> f410501b;

    public f0(InterfaceC43030m<Object> interfaceC43030m, Comparator<Object> comparator) {
        this.f410500a = interfaceC43030m;
        this.f410501b = comparator;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    public final Iterator<Object> iterator() {
        ArrayList arrayListE = C43033p.E(this.f410500a);
        C42745f0.z0(arrayListE, this.f410501b);
        return arrayListE.iterator();
    }
}
