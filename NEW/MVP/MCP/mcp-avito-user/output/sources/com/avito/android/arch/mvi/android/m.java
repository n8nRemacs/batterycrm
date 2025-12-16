package com.avito.android.arch.mvi.android;

import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.n2;

/* compiled from: MviViewModelContract.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/arch/mvi/android/m;", "", "State", "OneTimeEvent", "_common_mvi-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface m<State, OneTimeEvent> {
    @Y61.k
    InterfaceC43160i<OneTimeEvent> getEvents();

    @Y61.k
    n2<State> getState();
}
