package com.avito.android.code_check.phone_list;

import com.avito.android.code_check.phone_list.adapter.PhoneListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneListViewStateMapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check/phone_list/u;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class u extends com.avito.android.analytics.screens.mvi.q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<PhoneListItem> f119029b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f119030c;

    public /* synthetic */ u(List list, boolean z12, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? false : z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return L.f(this.f119029b, uVar.f119029b) && this.f119030c == uVar.f119030c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119030c) + (this.f119029b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneListViewState(phones=");
        sb2.append(this.f119029b);
        sb2.append(", isLoading=");
        return androidx.appcompat.app.r.x(sb2, this.f119030c, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(@Y61.k List<? extends PhoneListItem> list, boolean z12) {
        this.f119029b = list;
        this.f119030c = z12;
    }
}
