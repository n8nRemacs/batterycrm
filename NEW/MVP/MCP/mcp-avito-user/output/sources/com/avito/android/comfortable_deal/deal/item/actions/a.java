package com.avito.android.comfortable_deal.deal.item.actions;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActionsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/actions/a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f121140a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f121141b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ActionTransition f121142c;

    public a(@k String str, @k String str2, @k ActionTransition actionTransition) {
        this.f121140a = str;
        this.f121141b = str2;
        this.f121142c = actionTransition;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f121140a, aVar.f121140a) && L.f(this.f121141b, aVar.f121141b) && this.f121142c == aVar.f121142c;
    }

    public final int hashCode() {
        return this.f121142c.hashCode() + H.d(this.f121140a.hashCode() * 31, 31, this.f121141b);
    }

    @k
    public final String toString() {
        return "Action(id=" + this.f121140a + ", label=" + this.f121141b + ", transition=" + this.f121142c + ')';
    }
}
