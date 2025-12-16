package com.avito.android.user_advert.advert.items.anon_number;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AnonNumberItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/anon_number/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309198b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f309199c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f309200d;

    public a(@k String str, @l String str2, @l String str3) {
        this.f309198b = str;
        this.f309199c = str2;
        this.f309200d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309198b, aVar.f309198b) && L.f(this.f309199c, aVar.f309199c) && L.f(this.f309200d, aVar.f309200d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287660b() {
        return getF309949b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309949b() {
        return this.f309198b;
    }

    public final int hashCode() {
        int iHashCode = this.f309198b.hashCode() * 31;
        String str = this.f309199c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f309200d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnonNumberItem(stringId=");
        sb2.append(this.f309198b);
        sb2.append(", title=");
        sb2.append(this.f309199c);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f309200d, ')');
    }
}
