package com.avito.android.search.filter;

import com.avito.android.remote.model.counter.ChangingParametersForButtons;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: FiltersInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/counter/ChangingParametersForButtons;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/counter/ChangingParametersForButtons;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class O<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f261886b;

    public O(E e12) {
        this.f261886b = e12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ChangingParametersForButtons changingParametersForButtons = (ChangingParametersForButtons) obj;
        this.f261886b.f261755D = changingParametersForButtons;
        return new P2.b(changingParametersForButtons);
    }
}
