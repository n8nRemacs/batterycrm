package com.avito.android.inline_filters.dialog.select;

import com.avito.android.R;
import com.avito.android.remote.model.counter.ChangingParametersForButtons;
import com.avito.android.remote.model.counter.CounterButton;
import kotlin.Metadata;

/* compiled from: RadioSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/counter/ChangingParametersForButtons;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/counter/ChangingParametersForButtons;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f172211b;

    public z(B b12) {
        this.f172211b = b12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String string;
        ChangingParametersForButtons changingParametersForButtons = (ChangingParametersForButtons) obj;
        B b12 = this.f172211b;
        com.avito.android.inline_filters.dialog.E e12 = b12.f171147c;
        if (e12 instanceof D) {
            D d12 = (D) e12;
            CounterButton counterButton = changingParametersForButtons.getCounterButton();
            if (counterButton == null || (string = counterButton.getTitle()) == null) {
                string = b12.f172001f.getContext().getString(R.string.apply_inline_filter);
            }
            d12.f172008n.setText(string);
        }
    }
}
