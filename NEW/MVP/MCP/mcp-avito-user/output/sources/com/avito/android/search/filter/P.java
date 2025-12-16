package com.avito.android.search.filter;

import com.avito.android.remote.model.counter.ChangingParametersForButtons;
import com.avito.android.remote.model.counter.CounterButton;
import com.avito.android.remote.model.counter.MapButton;
import kotlin.Metadata;

/* compiled from: FiltersInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class P<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f261888b;

    public P(E e12) {
        this.f261888b = e12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ChangingParametersForButtons changingParametersForButtons = this.f261888b.f261755D;
        if (changingParametersForButtons != null) {
            CounterButton counterButton = changingParametersForButtons.getCounterButton();
            if (counterButton != null) {
                counterButton.setTitle(null);
            }
            CounterButton counterButton2 = changingParametersForButtons.getCounterButton();
            if (counterButton2 != null) {
                counterButton2.setEnabled(Boolean.TRUE);
            }
            MapButton mapButton = changingParametersForButtons.getMapButton();
            if (mapButton == null) {
                return;
            }
            mapButton.setEnabled(Boolean.FALSE);
        }
    }
}
