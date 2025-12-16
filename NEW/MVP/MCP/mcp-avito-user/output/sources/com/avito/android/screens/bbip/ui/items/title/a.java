package com.avito.android.screens.bbip.ui.items.title;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TitleItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/title/a;", "Lcom/avito/conveyor_item/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f260390b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f260391c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f260392d;

    public a(@k String str, @k String str2, @l String str3) {
        this.f260390b = str;
        this.f260391c = str2;
        this.f260392d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f260390b, aVar.f260390b) && L.f(this.f260391c, aVar.f260391c) && L.f(this.f260392d, aVar.f260392d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF247713b() {
        return getF255769b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF255769b() {
        return this.f260390b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f260390b.hashCode() * 31, 31, this.f260391c);
        String str = this.f260392d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TitleItem(stringId=");
        sb2.append(this.f260390b);
        sb2.append(", title=");
        sb2.append(this.f260391c);
        sb2.append(", subTitle=");
        return C22026a.c(sb2, this.f260392d, ')');
    }

    public /* synthetic */ a(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3);
    }
}
