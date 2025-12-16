package com.avito.android.delivery_location_suggest.konveyor.suggest;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.delivery_location_suggest.Coordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_location_suggest/konveyor/suggest/c;", "Lcom/avito/conveyor_item/a;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f135128b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f135129c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f135130d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Coordinates f135131e;

    public c(@k String str, @k String str2, @k String str3, @l Coordinates coordinates) {
        this.f135128b = str;
        this.f135129c = str2;
        this.f135130d = str3;
        this.f135131e = coordinates;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f135128b, cVar.f135128b) && L.f(this.f135129c, cVar.f135129c) && L.f(this.f135130d, cVar.f135130d) && L.f(this.f135131e, cVar.f135131e);
    }

    @Override // TV0.a
    public final long getId() {
        return getF106194b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF106194b() {
        return this.f135128b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f135128b.hashCode() * 31, 31, this.f135129c), 31, this.f135130d);
        Coordinates coordinates = this.f135131e;
        return iD2 + (coordinates == null ? 0 : coordinates.hashCode());
    }

    @k
    public final String toString() {
        return "SuggestItem(stringId=" + this.f135128b + ", title=" + this.f135129c + ", subTitle=" + this.f135130d + ", coordinates=" + this.f135131e + ')';
    }
}
