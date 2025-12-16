package com.avito.android.navigation_config.manager;

import Y61.l;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: NavigationConfigManagerStub.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/navigation_config/manager/g;", "Lcom/avito/android/navigation_config/manager/a;", "<init>", "()V", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements a {
    @Inject
    public g() {
    }

    @Override // U20.e
    @l
    public final Object c(@Y61.k BottomNavigationSpace bottomNavigationSpace, boolean z12, @Y61.k SuspendLambda suspendLambda) {
        return new TypedResult.Success(G0.f406611a);
    }

    @Override // U20.c
    @Y61.k
    public final U20.g e() {
        return new U20.g(BottomNavigationSpace.f107065b);
    }

    @Override // com.avito.android.navigation_config.manager.a
    public final void b() {
    }

    @Override // com.avito.android.navigation_config.manager.a
    public final void d() {
    }

    @Override // U20.b
    public final void load() {
    }

    @Override // U20.e
    public final void a(@Y61.k BottomNavigationSpace bottomNavigationSpace) {
    }
}
