package com.avito.android.messenger.conversation.mvi.data;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DatabaseErrorHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/data/MessengerDbException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerDbException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f190424b;

    public /* synthetic */ MessengerDbException(boolean z12, String str, Throwable th2, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : th2, z12);
    }

    public MessengerDbException(@Y61.l String str, @Y61.l Throwable th2, boolean z12) {
        super(str, th2);
        this.f190424b = z12;
    }
}
