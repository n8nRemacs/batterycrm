package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/D3;", "Landroidx/compose/runtime/tooling/c;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class D3 implements androidx.compose.runtime.tooling.c, Iterable<androidx.compose.runtime.tooling.c>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L2 f37957b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37958c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E0 f37959d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C22209z2 f37960e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Iterable<androidx.compose.runtime.tooling.c> f37961f;

    public D3(@Y61.k L2 l22, int i12, @Y61.k E0 e02, @Y61.k C22209z2 c22209z2) {
        this.f37957b = l22;
        this.f37958c = i12;
        this.f37959d = e02;
        this.f37960e = c22209z2;
        e02.getClass();
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<androidx.compose.runtime.tooling.c> iterator() {
        return new B3(this.f37957b, this.f37958c, this.f37959d, this.f37960e);
    }
}
