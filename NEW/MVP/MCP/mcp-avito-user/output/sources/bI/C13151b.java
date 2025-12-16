package Bi;

import Y61.k;
import androidx.view.M0;
import androidx.view.P0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ComponentViewModelFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LBi/b;", "Component", "Landroidx/lifecycle/P0$c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bi.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13151b<Component> implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final N f1630a;

    /* JADX WARN: Multi-variable type inference failed */
    public C13151b(@k Y41.a<? extends Component> aVar) {
        this.f1630a = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        return new C13150a(this.f1630a.invoke());
    }
}
