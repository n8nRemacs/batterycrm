package kotlin.sequences;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: _Sequences.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/sequences/e0;", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e0 implements InterfaceC43030m<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C43025h f410499a;

    public e0(C43025h c43025h) {
        this.f410499a = c43025h;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    public final Iterator<Object> iterator() {
        ArrayList arrayListE = C43033p.E(this.f410499a);
        C42745f0.y0(arrayListE);
        return arrayListE.iterator();
    }
}
