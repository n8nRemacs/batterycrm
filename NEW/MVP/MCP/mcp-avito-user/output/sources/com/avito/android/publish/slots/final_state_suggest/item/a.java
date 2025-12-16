package com.avito.android.publish.slots.final_state_suggest.item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.final_state_suggest.FinalStateSuggestResponse;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FinalStateSuggestItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/final_state_suggest/item/a;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f243916b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final P2<FinalStateSuggestResponse> f243917c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k String str, @k P2<? super FinalStateSuggestResponse> p22) {
        this.f243916b = str;
        this.f243917c = p22;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f243916b, aVar.f243916b) && L.f(this.f243917c, aVar.f243917c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124032b() {
        return getF218012b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF218012b() {
        return this.f243916b;
    }

    public final int hashCode() {
        return this.f243917c.hashCode() + (this.f243916b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "FinalStateSuggestItem(stringId=" + this.f243916b + ", finalStateSuggestState=" + this.f243917c + ')';
    }
}
