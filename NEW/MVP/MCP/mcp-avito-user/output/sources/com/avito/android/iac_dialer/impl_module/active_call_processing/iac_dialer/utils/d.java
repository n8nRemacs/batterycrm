package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.clickstream.D;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.concurrent.Executors;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.C43315z0;

/* compiled from: IacDialerDispatcherProvider.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/d;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/c;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.c
    @Y61.k
    public final C43315z0 a() {
        return new C43315z0(Executors.newSingleThreadExecutor(new D(4)));
    }
}
