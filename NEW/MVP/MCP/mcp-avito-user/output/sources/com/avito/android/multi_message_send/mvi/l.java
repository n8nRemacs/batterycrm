package com.avito.android.multi_message_send.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MultiMessageSendBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/l;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements com.avito.android.arch.mvi.b<MultiMessageSendInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.multi_message_send.domain.e f206790a;

    @Inject
    public l(@Y61.k com.avito.android.multi_message_send.domain.e eVar) {
        this.f206790a = eVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<MultiMessageSendInternalAction> a() {
        return this.f206790a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
