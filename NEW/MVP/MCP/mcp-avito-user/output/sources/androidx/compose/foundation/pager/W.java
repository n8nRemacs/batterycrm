package androidx.compose.foundation.pager;

import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22713c;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: PagerMeasurePolicy.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "width", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "Lkotlin/w;", "placement", "Landroidx/compose/ui/layout/j0;", "invoke", "(IILY41/l;)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class W extends kotlin.jvm.internal.N implements Y41.q<Integer, Integer, Y41.l<? super K0.a, ? extends G0>, InterfaceC22367j0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.Q f29849l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f29850m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29851n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f29852o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(androidx.compose.foundation.lazy.layout.Q q12, long j12, int i12, int i13) {
        super(3);
        this.f29849l = q12;
        this.f29850m = j12;
        this.f29851n = i12;
        this.f29852o = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.q
    public final InterfaceC22367j0 invoke(Integer num, Integer num2, Y41.l<? super K0.a, ? extends G0> lVar) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int i12 = iIntValue + this.f29851n;
        long j12 = this.f29850m;
        int iG2 = C22713c.g(i12, j12);
        int iF2 = C22713c.f(iIntValue2 + this.f29852o, j12);
        Map mapC = P0.c();
        return this.f29849l.L0(iG2, iF2, mapC, lVar);
    }
}
