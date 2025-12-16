package com.avito.android.messenger.service.media_session;

import arrow.core.Y0;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import l41.r;

/* compiled from: VoiceMessageMediaSessionService.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "messageOpt", "", "test", "(Larrow/core/Y0;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b<T> implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final b<T> f197293b = new b<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        Y0 y02 = (Y0) obj;
        if (!y02.b()) {
            LocalMessage localMessage = (LocalMessage) y02.c();
            if (!((localMessage != null ? localMessage.getBody() : null) instanceof MessageBody.Deleted)) {
                return false;
            }
        }
        return true;
    }
}
