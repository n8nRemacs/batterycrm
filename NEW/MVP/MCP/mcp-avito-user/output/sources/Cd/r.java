package Cd;

import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import kotlin.Metadata;

/* compiled from: SaveStateViewModelFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LCd/r;", "Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/a;", "_common_view-models_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r<VM extends M0> extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C23060r0, VM> f2370d;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k Y41.l<? super C23060r0, ? extends VM> lVar) {
        super(interfaceC23487e, null);
        this.f2370d = lVar;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <VM extends M0> VM create(@Y61.k String str, @Y61.k Class<VM> cls, @Y61.k C23060r0 c23060r0) {
        return this.f2370d.invoke(c23060r0);
    }
}
