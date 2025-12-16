package com.avito.android.imv_goods_poll.items.check_box;

import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.ImvGoodsPollLinkBodyOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckboxItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_poll/items/check_box/a;", "Lcom/avito/conveyor_item/a;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<ImvGoodsPollLinkBodyOption> f170633b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f170634c;

    public a(@Y61.k List list, @l String str) {
        this.f170633b = list;
        this.f170634c = str;
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
        return L.f(this.f170633b, aVar.f170633b) && L.f(this.f170634c, aVar.f170634c);
    }

    @Override // TV0.a
    public final long getId() {
        return 104256825;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF169855b() {
        return "multi";
    }

    public final int hashCode() {
        int iE2 = H.e(-1063005721, 31, this.f170633b);
        String str = this.f170634c;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckboxItem(stringId=multi, options=");
        sb2.append(this.f170633b);
        sb2.append(", error=");
        return C22026a.c(sb2, this.f170634c, ')');
    }
}
