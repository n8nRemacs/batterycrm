package com.avito.android.imv_goods_poll.items.list_radio_button;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.ImvGoodsPollLinkBodyOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RadioButtonItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_poll/items/list_radio_button/a;", "Lcom/avito/conveyor_item/a;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<ImvGoodsPollLinkBodyOption> f170653b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f170654c;

    public a(@k List list, @l String str) {
        this.f170653b = list;
        this.f170654c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return L.f(this.f170653b, aVar.f170653b) && L.f(this.f170654c, aVar.f170654c);
    }

    @Override // TV0.a
    public final long getId() {
        return -902265784;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF169855b() {
        return "single";
    }

    public final int hashCode() {
        int iE2 = H.e(2094531768, 31, this.f170653b);
        String str = this.f170654c;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RadioButtonItem(stringId=single, options=");
        sb2.append(this.f170653b);
        sb2.append(", error=");
        return C22026a.c(sb2, this.f170654c, ')');
    }
}
