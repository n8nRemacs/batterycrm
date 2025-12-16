package com.avito.android.comfortable_deal.common.view;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExpandedStepsList.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/common/view/y;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f120773a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f120774b;

    public y(@Y61.k String str, @Y61.k String str2) {
        this.f120773a = str;
        this.f120774b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return L.f(this.f120773a, yVar.f120773a) && L.f(this.f120774b, yVar.f120774b);
    }

    public final int hashCode() {
        return this.f120774b.hashCode() + (this.f120773a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StepItem(title=");
        sb2.append(this.f120773a);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f120774b, ')');
    }
}
