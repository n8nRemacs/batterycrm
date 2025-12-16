package com.avito.android.app.task;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;

/* compiled from: MessageSendingTrackerFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/task/w0;", "Lcom/avito/android/app/task/v0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.app.task.w0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28604w0 implements InterfaceC28601v0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f91740a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f91741b;

    public C28604w0(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.server_time.h hVar) {
        this.f91740a = interfaceC28373a;
        this.f91741b = hVar;
    }

    @Override // com.avito.android.app.task.InterfaceC28601v0
    @Y61.k
    public final C28607x0 a(@Y61.k LocalMessage localMessage) {
        return new C28607x0(localMessage, this.f91740a, this.f91741b);
    }
}
