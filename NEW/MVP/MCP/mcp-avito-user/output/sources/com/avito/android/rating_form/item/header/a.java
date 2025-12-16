package com.avito.android.rating_form.item.header;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/header/a;", "Lcom/avito/conveyor_item/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f248438b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f248439c;

    public a(@k String str, boolean z12) {
        this.f248438b = str;
        this.f248439c = z12;
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
        return L.f(this.f248438b, aVar.f248438b) && this.f248439c == aVar.f248439c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return -1221270899;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF245886b() {
        return "header";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f248439c) + H.d(795307795, 31, this.f248438b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderItem(stringId=header, title=");
        sb2.append(this.f248438b);
        sb2.append(", centerContent=");
        return r.x(sb2, this.f248439c, ')');
    }
}
