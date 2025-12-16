package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.persistence.messenger.Q1;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MessengerVoiceFileUploadCanceller.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/o0;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/k0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.o0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32087o0 implements InterfaceC32079k0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_upload.worker.c f191198a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.n f191199b;

    @Inject
    public C32087o0(@Y61.k com.avito.android.messenger.conversation.mvi.file_upload.worker.c cVar, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.n nVar) {
        this.f191198a = cVar;
        this.f191199b = nVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32079k0
    @Y61.k
    public final AbstractC41768a a(@Y61.k AbstractC32094s0.a aVar, @Y61.l Q1 q12, boolean z12) {
        String str;
        if (z12) {
            return this.f191198a.b(aVar).g((q12 == null || (str = q12.f215285d) == null) ? AbstractC41768a.o(new IllegalStateException("No URI found for this voice message")) : new io.reactivex.rxjava3.internal.operators.completable.v(this.f191199b.j(str).k(new C32083m0(str)).i(C32085n0.f191196b)).r()).l(C32081l0.f191191b).r();
        }
        return C41823n.f402260b;
    }
}
