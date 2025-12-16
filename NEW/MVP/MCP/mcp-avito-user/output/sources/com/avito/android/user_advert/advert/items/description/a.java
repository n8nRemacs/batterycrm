package com.avito.android.user_advert.advert.items.description;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MyAdvertDescriptionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/description/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309355b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CharSequence f309356c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f309357d;

    public a(@k String str, @k CharSequence charSequence, boolean z12) {
        this.f309355b = str;
        this.f309356c = charSequence;
        this.f309357d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309355b, aVar.f309355b) && L.f(this.f309356c, aVar.f309356c) && this.f309357d == aVar.f309357d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return getF309355b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF310078b() {
        return this.f309355b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f309357d) + com.avito.android.advert.item.delivery_suggests.l.c(this.f309355b.hashCode() * 31, 31, this.f309356c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MyAdvertDescriptionItem(stringId=");
        sb2.append(this.f309355b);
        sb2.append(", description=");
        sb2.append((Object) this.f309356c);
        sb2.append(", isExpanded=");
        return r.x(sb2, this.f309357d, ')');
    }
}
