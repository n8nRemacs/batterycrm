package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic;

import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: IacBootstrapsProvider.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/b;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Set<IacBootstrap> f164978a;

    @Inject
    public b(@Y61.k Set<IacBootstrap> set) {
        this.f164978a = set;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.a
    @Y61.k
    public final List<IacBootstrap> a() {
        return C42745f0.M0(this.f164978a);
    }
}
