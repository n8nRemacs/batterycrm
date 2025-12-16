package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core;

import Y61.k;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewarePayload;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacMiddleware.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0006\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareDistinctBy;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;", "Payload", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddleware;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", VoiceInfo.STATE, "getPayloadFromState", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;", "oldPayload", "newPayload", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;)V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacMiddlewareDistinctBy<Payload extends IacMiddlewarePayload> extends IacMiddleware {

    /* compiled from: IacMiddleware.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static <Payload extends IacMiddlewarePayload> void a(@k IacMiddlewareDistinctBy<Payload> iacMiddlewareDistinctBy, @k IacMiddlewareProcessing iacMiddlewareProcessing) {
            IacMiddlewarePayload payloadFromState = iacMiddlewareDistinctBy.getPayloadFromState(iacMiddlewareProcessing.getOldState());
            IacMiddlewarePayload payloadFromState2 = iacMiddlewareDistinctBy.getPayloadFromState(iacMiddlewareProcessing.getNewState());
            if (L.f(payloadFromState, payloadFromState2)) {
                return;
            }
            iacMiddlewareDistinctBy.process(iacMiddlewareProcessing, payloadFromState, payloadFromState2);
        }
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    @k
    /* synthetic */ String getName();

    @k
    Payload getPayloadFromState(@k IacState state);

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    void process(@k IacMiddlewareProcessing iacMiddlewareProcessing);

    void process(@k IacMiddlewareProcessing iacMiddlewareProcessing, @k Payload payload, @k Payload payload2);
}
