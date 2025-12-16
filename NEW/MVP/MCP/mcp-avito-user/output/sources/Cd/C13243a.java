package Cd;

import androidx.view.M0;
import androidx.view.P0;
import kotlin.Metadata;

/* compiled from: LazyViewModelFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LCd/a;", "Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "_common_view-models_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cd.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13243a<VM extends M0> implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<VM> f2369a;

    /* JADX WARN: Multi-variable type inference failed */
    public C13243a(@Y61.k Y41.a<? extends VM> aVar) {
        this.f2369a = aVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <VM extends M0> VM create(@Y61.k Class<VM> cls) {
        return this.f2369a.invoke();
    }
}
