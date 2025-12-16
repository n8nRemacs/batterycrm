package com.avito.android.app.task;

import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;

/* compiled from: PendingMessageHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "body", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "invoke", "(Lcom/avito/android/remote/model/messenger/message/MessageBody;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class R0 extends kotlin.jvm.internal.N implements Y41.l<MessageBody, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final R0 f91506l = new R0();

    public R0() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(MessageBody messageBody) {
        MessageBody messageBody2 = messageBody;
        return Boolean.valueOf((messageBody2 instanceof MessageBody.File) || (messageBody2 instanceof MessageBody.Video));
    }
}
