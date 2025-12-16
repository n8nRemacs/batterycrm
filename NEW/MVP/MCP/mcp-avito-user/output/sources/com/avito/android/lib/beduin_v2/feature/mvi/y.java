package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.lib.beduin_v2.feature.mvi.x;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PublicFeatureImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\b\u0012\u0004\u0012\u00028\u00010\u00062\b\u0012\u0004\u0012\u00028\u00000\u0007:\u0001\b¨\u0006\t"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/y;", "", "Action", "State", "OneTimeEvent", "Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class y<Action, State, OneTimeEvent> implements x<Action, State, OneTimeEvent>, InterfaceC43160i<State>, InterfaceC43172j<Action> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.c<Action, ?, State, OneTimeEvent> f176363b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<OneTimeEvent> f176364c;

    /* compiled from: PublicFeatureImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u0001*\b\b\u0004\u0010\u0003*\u00020\u0001*\b\b\u0005\u0010\u0004*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/y$a;", "", "Action", "State", "OneTimeEvent", "Lcom/avito/android/lib/beduin_v2/feature/mvi/x$a;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<Action, State, OneTimeEvent> implements x.a<Action, State, OneTimeEvent> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final p f176365a;

        public a(@Y61.k p pVar) {
            this.f176365a = pVar;
        }

        @Override // com.avito.android.lib.beduin_v2.feature.mvi.x.a
        @Y61.k
        public final y a(@Y61.k T t12) {
            return new y(this.f176365a.a(null, t12));
        }
    }

    public y(@Y61.k com.avito.android.arch.mvi.c<Action, ?, State, OneTimeEvent> cVar) {
        this.f176363b = cVar;
        this.f176364c = cVar.f91928q;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super State> interfaceC43172j, @Y61.k Continuation<? super G0> continuation) {
        return this.f176363b.collect(interfaceC43172j, continuation);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    public final Object emit(@Y61.k Action action, @Y61.k Continuation<? super G0> continuation) {
        return this.f176363b.emit(action, continuation);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.mvi.x
    @Y61.k
    public final InterfaceC43160i<OneTimeEvent> getEvents() {
        return this.f176364c;
    }

    @Override // com.avito.android.lib.beduin_v2.feature.mvi.x
    @Y61.k
    public final State getState() {
        return this.f176363b.f91929r.get();
    }

    @Override // com.avito.android.lib.beduin_v2.feature.mvi.x
    @Y61.l
    public final Object ya(@Y61.k Action action, @Y61.k Continuation<? super G0> continuation) {
        Object objYa = this.f176363b.ya(action, continuation);
        return objYa == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objYa : G0.f406611a;
    }
}
