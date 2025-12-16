package com.avito.android.lib.beduin_v2.feature.mvi;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PublicFeature.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0001\u0010\u0003 \u0001*\u00020\u0001*\n\b\u0002\u0010\u0004 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "", "Action", "State", "OneTimeEvent", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "a", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface x<Action, State, OneTimeEvent> extends InterfaceC43160i<State>, InterfaceC43172j<Action> {

    /* compiled from: PublicFeature.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0003\u0010\u0002 \u0000*\u00020\u0001*\b\b\u0004\u0010\u0003*\u00020\u0001*\n\b\u0005\u0010\u0004 \u0001*\u00020\u00012\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x$a;", "", "Action", "State", "OneTimeEvent", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a<Action, State, OneTimeEvent> {

        /* compiled from: PublicFeature.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.beduin_v2.feature.mvi.x$a$a, reason: collision with other inner class name */
        public static final class C5226a {
        }

        @Y61.k
        y a(@Y61.k T t12);
    }

    @Y61.k
    InterfaceC43160i<OneTimeEvent> getEvents();

    @Y61.k
    State getState();

    @Y61.l
    Object ya(@Y61.k Action action, @Y61.k Continuation<? super G0> continuation);
}
