package com.avito.android.app.task;

import arrow.core.C23703n1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PendingMessageHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "message", "Lkotlin/Q;", "", "", "apply", "(Larrow/core/Y0;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class W0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final W0<T, R> f91546b = new W0<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        arrow.core.Y0 y02 = (arrow.core.Y0) obj;
        if (y02 instanceof arrow.core.X0) {
            return arrow.core.X0.f56264b;
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        LocalMessage localMessage = (LocalMessage) ((C23703n1) y02).f56288b;
        return new C23703n1(new kotlin.Q(localMessage.getLocalId(), Long.valueOf(localMessage.getCreated())));
    }
}
