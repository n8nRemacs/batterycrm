package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.analytics.graphite_counter.ChatLoadingResult;
import kotlin.Metadata;

/* compiled from: MessageListInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32185y<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f193651b;

    public C32185y(C32141e c32141e) {
        this.f193651b = c32141e;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f193651b.f192905Y.b(ChatLoadingResult.f186284c);
    }
}
