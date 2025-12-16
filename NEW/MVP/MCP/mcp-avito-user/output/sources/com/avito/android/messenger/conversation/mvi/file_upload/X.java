package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.persistence.messenger.Q1;
import io.reactivex.rxjava3.core.AbstractC41768a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MessengerFileUploadCanceller.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/X;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/T;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class X implements T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_upload.worker.c f191103a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.n f191104b;

    @Inject
    public X(@Y61.k com.avito.android.messenger.conversation.mvi.file_upload.worker.c cVar, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.n nVar) {
        this.f191103a = cVar;
        this.f191104b = nVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_upload.T
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.I a(@Y61.k AbstractC32094s0.a aVar, @Y61.l Q1 q12) {
        String str;
        return this.f191103a.b(aVar).g((q12 == null || (str = q12.f215285d) == null) ? AbstractC41768a.o(new IllegalStateException("No URI found for this file message")) : new io.reactivex.rxjava3.internal.operators.completable.v(this.f191104b.b(str).k(new V(str)).i(W.f191101b)).r()).l(U.f191097b).r();
    }
}
