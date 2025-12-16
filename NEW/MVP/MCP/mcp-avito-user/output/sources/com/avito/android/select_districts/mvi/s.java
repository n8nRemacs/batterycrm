package com.avito.android.select_districts.mvi;

import com.avito.android.select_districts.mvi.entity.SelectDistrictsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import pq0.b;

/* compiled from: SelectDistrictsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select_districts/mvi/s;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction;", "Lpq0/b;", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s implements com.avito.android.arch.mvi.t<SelectDistrictsInternalAction, pq0.b> {
    @Inject
    public s() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final pq0.b b(SelectDistrictsInternalAction selectDistrictsInternalAction) {
        SelectDistrictsInternalAction selectDistrictsInternalAction2 = selectDistrictsInternalAction;
        if (selectDistrictsInternalAction2 instanceof SelectDistrictsInternalAction.SendResultAndCloseScreen) {
            return new b.a(((SelectDistrictsInternalAction.SendResultAndCloseScreen) selectDistrictsInternalAction2).f267034b);
        }
        return null;
    }
}
