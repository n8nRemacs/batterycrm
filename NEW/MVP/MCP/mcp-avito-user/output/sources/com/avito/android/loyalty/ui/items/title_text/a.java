package com.avito.android.loyalty.ui.items.title_text;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TitleTextItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/items/title_text/a;", "Lcom/avito/conveyor_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183757b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f183758c;

    public a(@k String str, @k String str2) {
        this.f183757b = str;
        this.f183758c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f183757b, aVar.f183757b) && L.f(this.f183758c, aVar.f183758c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF139156b() {
        return getF183297b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183297b() {
        return this.f183757b;
    }

    public final int hashCode() {
        return this.f183758c.hashCode() + (this.f183757b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TitleTextItem(stringId=");
        sb2.append(this.f183757b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f183758c, ')');
    }
}
