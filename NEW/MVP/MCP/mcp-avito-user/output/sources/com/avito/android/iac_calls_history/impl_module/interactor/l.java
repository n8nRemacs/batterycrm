package com.avito.android.iac_calls_history.impl_module.interactor;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CallsHistoryListInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/interactor/l;", "", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f164751a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f164752b;

    public l(boolean z12, @Y61.k List<? extends CallsHistoryScreenState.Item> list) {
        this.f164751a = z12;
        this.f164752b = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f164751a == lVar.f164751a && L.f(this.f164752b, lVar.f164752b);
    }

    public final int hashCode() {
        return this.f164752b.hashCode() + (Boolean.hashCode(this.f164751a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetCallsHistoryResponse(hasMore=");
        sb2.append(this.f164751a);
        sb2.append(", items=");
        return H.n(sb2, this.f164752b, ')');
    }
}
