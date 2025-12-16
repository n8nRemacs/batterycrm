package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.context.W;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Observables.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u000b\u0010\u000b\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "T1", "T2", "T3", "R", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/avito/android/util/rx3/Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class Y<T1, T2, T3, R> implements l41.h {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.h
    @Y61.k
    public final R a(@Y61.k T1 t12, @Y61.k T2 t22, @Y61.k T3 t32) {
        return (R) new W.a((InterfaceC31987a.C5631a) t12, (ChannelIacInteractor.State) t22, ((InterfaceC32208e.a) t32).f194496a);
    }
}
