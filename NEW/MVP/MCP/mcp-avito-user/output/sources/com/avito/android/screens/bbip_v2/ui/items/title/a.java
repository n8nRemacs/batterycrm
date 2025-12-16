package com.avito.android.screens.bbip_v2.ui.items.title;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BbipV2TitleItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/title/a;", "Lcom/avito/conveyor_item/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f261674b;

    public a(@k String str) {
        this.f261674b = str;
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
        return L.f(this.f261674b, aVar.f261674b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return 384864941;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF262901b() {
        return "bbip_v2_title";
    }

    public final int hashCode() {
        return this.f261674b.hashCode() - 954088717;
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("BbipV2TitleItem(stringId=bbip_v2_title, title="), this.f261674b, ')');
    }
}
