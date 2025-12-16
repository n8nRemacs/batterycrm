package Cd;

import androidx.view.M0;
import androidx.view.P0;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;

/* compiled from: ViewModelFactory.kt */
@h31.j
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd/D;", "Landroidx/lifecycle/P0$c;", "_common_view-models_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class D implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<Class<?>, Provider<M0>> f2367a;

    @Inject
    public D(@Y61.k Map<Class<?>, Provider<M0>> map) {
        this.f2367a = map;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        Provider<M0> provider = this.f2367a.get(cls);
        T t12 = provider != null ? (T) provider.get() : null;
        if (t12 != null) {
            return t12;
        }
        throw new IllegalArgumentException("ViewModel Provider doesn't exist for " + cls + '!');
    }
}
