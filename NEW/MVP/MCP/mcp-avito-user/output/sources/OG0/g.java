package oG0;

import Y61.k;
import Y61.l;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.B;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.universal_map.map.di.InterfaceC35307m;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UniversalMapViewModel.kt */
@B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoG0/g;", "Landroidx/lifecycle/P0$c;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.universal_map.map.common.marker.j f419665a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f419666b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ParametrizedEvent f419667c;

    @Inject
    public g(@k com.avito.android.universal_map.map.common.marker.j jVar, @k InterfaceC28373a interfaceC28373a, @l @InterfaceC35307m ParametrizedEvent parametrizedEvent) {
        this.f419665a = jVar;
        this.f419666b = interfaceC28373a;
        this.f419667c = parametrizedEvent;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        if (!cls.isAssignableFrom(i.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new i(this.f419665a, this.f419666b, this.f419667c);
    }
}
