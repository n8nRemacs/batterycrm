package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32275m;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;

/* compiled from: MessageAndQuoteBodyResolver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/m$a;", "message", "", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/sync/m$a;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class E extends kotlin.jvm.internal.N implements Y41.l<C32275m.a, String> {

    /* renamed from: l, reason: collision with root package name */
    public static final E f194587l = new E();

    public E() {
        super(1);
    }

    @Override // Y41.l
    public final String invoke(C32275m.a aVar) {
        MessageBody.Unknown unknown = (MessageBody.Unknown) aVar.f194813c;
        String fallbackText = unknown.getFallbackText();
        if (fallbackText == null || fallbackText.length() == 0) {
            return unknown.getType();
        }
        return null;
    }
}
