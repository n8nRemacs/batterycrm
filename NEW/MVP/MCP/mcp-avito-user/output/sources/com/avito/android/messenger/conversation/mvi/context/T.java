package com.avito.android.messenger.conversation.mvi.context;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.util.UnauthorizedException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "R", "Larrow/core/Y0;", "Lru/avito/messenger/MessengerUserHashInfo;", "userIdOption", "Lio/reactivex/rxjava3/core/O;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class T<T, R> implements l41.o {
    @Override // l41.o
    public final Object apply(Object obj) throws UnauthorizedException {
        Y0 y02 = (Y0) obj;
        if (y02 instanceof X0) {
            throw new UnauthorizedException(null, 1, null);
        }
        if (y02 instanceof C23703n1) {
            throw null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
