package com.avito.android.publish.select;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.select.SelectViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectParameterState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/select/g;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f242695a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SelectViewModel.MainActionState f242696b;

    public g(@Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.k SelectViewModel.MainActionState mainActionState) {
        this.f242695a = list;
        this.f242696b = mainActionState;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f242695a, gVar.f242695a) && this.f242696b == gVar.f242696b;
    }

    public final int hashCode() {
        return this.f242696b.hashCode() + (this.f242695a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "SelectParameterState(items=" + this.f242695a + ", mainActionState=" + this.f242696b + ')';
    }
}
