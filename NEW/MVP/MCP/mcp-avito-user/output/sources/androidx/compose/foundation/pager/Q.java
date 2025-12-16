package androidx.compose.foundation.pager;

import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.layout.K0;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PagerMeasure.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Q extends kotlin.jvm.internal.N implements Y41.l<K0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<G0> f29828l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f29829m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(InterfaceC22204y1 interfaceC22204y1, ArrayList arrayList) {
        super(1);
        this.f29828l = interfaceC22204y1;
        this.f29829m = arrayList;
    }

    @Override // Y41.l
    public final G0 invoke(K0.a aVar) {
        K0.a aVar2 = aVar;
        P p12 = new P(this.f29829m);
        aVar2.f40350a = true;
        p12.invoke(aVar2);
        aVar2.f40350a = false;
        this.f29828l.getF42167b();
        return G0.f406611a;
    }
}
