package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core;

import Y61.k;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import dL.d;
import kotlin.Metadata;

/* compiled from: IacMiddleware.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u00012\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddleware;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/b;", "LdL/d;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;)V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacMiddleware extends b, d {

    /* compiled from: IacMiddleware.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    /* synthetic */ String getName();

    void process(@k IacMiddlewareProcessing iacMiddlewareProcessing);
}
