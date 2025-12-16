package ru.avito.messenger.internal.state_machine;

import Y61.k;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.observable.L;
import kotlin.Metadata;

/* compiled from: StateMachine.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/internal/state_machine/g;", "", "S", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface g<S> {

    /* compiled from: StateMachine.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/state_machine/g$a;", "", "S", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a<S> {
        @k
        I<S> apply(@k S s5);
    }

    @k
    L M0();

    void a(@k a<S> aVar);

    void start();
}
