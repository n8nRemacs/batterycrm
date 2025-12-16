package com.avito.android.publish.slots.delivery_summary_edit.item;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: DeliverySummaryEditSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary_edit/item/o;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ApiError f243820a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f243821b;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@Y61.k ApiError apiError, @Y61.k Y41.a<G0> aVar) {
        this.f243820a = apiError;
        this.f243821b = (N) aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f243820a, oVar.f243820a) && this.f243821b.equals(oVar.f243821b);
    }

    public final int hashCode() {
        return this.f243821b.hashCode() + (this.f243820a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliverySummaryError(cause=");
        sb2.append(this.f243820a);
        sb2.append(", errorAction=");
        return C22026a.d(sb2, this.f243821b, ')');
    }
}
