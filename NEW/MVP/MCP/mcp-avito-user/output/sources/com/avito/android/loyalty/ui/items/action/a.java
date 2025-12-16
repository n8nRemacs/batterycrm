package com.avito.android.loyalty.ui.items.action;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActionItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/items/action/a;", "Lcom/avito/conveyor_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183641b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f183642c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f183643d;

    public a(@k String str, @k String str2, @k DeepLink deepLink) {
        this.f183641b = str;
        this.f183642c = str2;
        this.f183643d = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f183641b, aVar.f183641b) && L.f(this.f183642c, aVar.f183642c) && L.f(this.f183643d, aVar.f183643d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF182863b() {
        return getF183680b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183680b() {
        return this.f183641b;
    }

    public final int hashCode() {
        return this.f183643d.hashCode() + H.d(this.f183641b.hashCode() * 31, 31, this.f183642c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionItem(stringId=");
        sb2.append(this.f183641b);
        sb2.append(", title=");
        sb2.append(this.f183642c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f183643d, ')');
    }
}
