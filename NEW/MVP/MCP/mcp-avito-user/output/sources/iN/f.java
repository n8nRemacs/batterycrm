package in;

import androidx.recyclerview.widget.C23424o;
import kotlin.Metadata;

/* compiled from: CartSimilarItemsKonveyorModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lin/f;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends C23424o.f<TV0.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.recycler.data_aware.a f398758a;

    public f(com.avito.android.recycler.data_aware.a aVar) {
        this.f398758a = aVar;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF287615b() == aVar4.getF287615b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        return this.f398758a.a(aVar, aVar2);
    }
}
