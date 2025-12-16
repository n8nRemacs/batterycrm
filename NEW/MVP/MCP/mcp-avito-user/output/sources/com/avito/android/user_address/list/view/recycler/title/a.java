package com.avito.android.user_address.list.view.recycler.title;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TitleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/list/view/recycler/title/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f307480b;

    public a(@l String str) {
        this.f307480b = str;
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
        return L.f(this.f307480b, aVar.f307480b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287660b() {
        return 1267378912;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF302758b() {
        return "title_item_id";
    }

    public final int hashCode() {
        String str = this.f307480b;
        return 634040608 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("TitleItem(stringId=title_item_id, text="), this.f307480b, ')');
    }
}
