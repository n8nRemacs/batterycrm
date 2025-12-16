package androidx.compose.material3;

import androidx.compose.runtime.internal.C22096n;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/y0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/y0;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.t5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21878t5 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.lazy.grid.y0, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.l f37299l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.grid.I0 f37300m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f37301n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f37302o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f37303p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f37304q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f37305r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, kotlin.G0> f37306s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Ce f37307t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y3 f37308u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21878t5(kotlin.ranges.l lVar, androidx.compose.foundation.lazy.grid.I0 i02, kotlinx.coroutines.T t12, String str, String str2, int i12, int i13, Y41.l<? super Integer, kotlin.G0> lVar2, Ce ce2, Y3 y32) {
        super(1);
        this.f37299l = lVar;
        this.f37300m = i02;
        this.f37301n = t12;
        this.f37302o = str;
        this.f37303p = str2;
        this.f37304q = i12;
        this.f37305r = i13;
        this.f37306s = lVar2;
        this.f37307t = ce2;
        this.f37308u = y32;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.foundation.lazy.grid.y0 y0Var) {
        int size;
        androidx.compose.foundation.lazy.grid.y0 y0Var2 = y0Var;
        Iterable iterable = this.f37299l;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            kotlin.ranges.k it = iterable.iterator();
            int i12 = 0;
            while (it.f406910d) {
                it.next();
                i12++;
                if (i12 < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
            size = i12;
        }
        androidx.compose.foundation.lazy.grid.y0.e(y0Var2, size, null, new C22096n(1040623618, new C21855s5(this.f37299l, this.f37300m, this.f37301n, this.f37302o, this.f37303p, this.f37304q, this.f37305r, this.f37306s, this.f37307t, this.f37308u), true), 14);
        return kotlin.G0.f406611a;
    }
}
