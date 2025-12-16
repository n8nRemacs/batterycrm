package com.avito.android.loyalty.ui.quality_service.items.effects;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EffectsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/effects/a;", "Lcom/avito/conveyor_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183828b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f183829c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f183830d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f183831e;

    public a() {
        throw null;
    }

    public a(String str, String str2, AttributedText attributedText, List list, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? UUID.randomUUID().toString() : str;
        attributedText = (i12 & 4) != 0 ? null : attributedText;
        this.f183828b = str;
        this.f183829c = str2;
        this.f183830d = attributedText;
        this.f183831e = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f183828b, aVar.f183828b) && L.f(this.f183829c, aVar.f183829c) && L.f(this.f183830d, aVar.f183830d) && L.f(this.f183831e, aVar.f183831e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74796b() {
        return getF76032b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF76032b() {
        return this.f183828b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f183828b.hashCode() * 31, 31, this.f183829c);
        AttributedText attributedText = this.f183830d;
        return this.f183831e.hashCode() + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EffectsItem(stringId=");
        sb2.append(this.f183828b);
        sb2.append(", title=");
        sb2.append(this.f183829c);
        sb2.append(", subtitle=");
        sb2.append(this.f183830d);
        sb2.append(", items=");
        return H.p(sb2, this.f183831e, ')');
    }
}
