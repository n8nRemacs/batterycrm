package com.avito.android.travel_payment_selector.view.items.description;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DescriptionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_selector/view/items/description/c;", "Lcom/avito/conveyor_item/a;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f302737b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f302738c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f302739d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f302740e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f302741f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<kF0.b> f302742g;

    public c(@k String str, @k AttributedText attributedText, @k AttributedText attributedText2, @l String str2, boolean z12, @k List<kF0.b> list) {
        this.f302737b = str;
        this.f302738c = attributedText;
        this.f302739d = attributedText2;
        this.f302740e = str2;
        this.f302741f = z12;
        this.f302742g = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f302737b, cVar.f302737b) && L.f(this.f302738c, cVar.f302738c) && L.f(this.f302739d, cVar.f302739d) && L.f(this.f302740e, cVar.f302740e) && this.f302741f == cVar.f302741f && L.f(this.f302742g, cVar.f302742g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80070b() {
        return getF283214b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283214b() {
        return this.f302737b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(this.f302737b.hashCode() * 31, 31, this.f302738c), 31, this.f302739d);
        String str = this.f302740e;
        return this.f302742g.hashCode() + r.i((iB2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f302741f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DescriptionItem(stringId=");
        sb2.append(this.f302737b);
        sb2.append(", text=");
        sb2.append(this.f302738c);
        sb2.append(", description=");
        sb2.append(this.f302739d);
        sb2.append(", hint=");
        sb2.append(this.f302740e);
        sb2.append(", isCollapsed=");
        sb2.append(this.f302741f);
        sb2.append(", innerItems=");
        return H.p(sb2, this.f302742g, ')');
    }

    public c(String str, AttributedText attributedText, AttributedText attributedText2, String str2, boolean z12, List list, int i12, C42822w c42822w) {
        this(str, attributedText, attributedText2, str2, (i12 & 16) != 0 ? true : z12, (i12 & 32) != 0 ? C42784z0.f406748b : list);
    }
}
