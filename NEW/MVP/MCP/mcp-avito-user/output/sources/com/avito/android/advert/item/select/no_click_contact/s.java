package com.avito.android.advert.item.select.no_click_contact;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.select.no_click_contact.AutoSelectNoClickContactItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectNoClickContactScreenState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/select/no_click_contact/s;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f79491a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AutoSelectNoClickContactItem.NoClickContactCard f79492b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AutoSelectNoClickContactItem.NoClickContactCard f79493c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.select.number_input.f f79494d;

    public s(@Y61.k String str, @Y61.k AutoSelectNoClickContactItem.NoClickContactCard noClickContactCard, @Y61.k AutoSelectNoClickContactItem.NoClickContactCard noClickContactCard2, @Y61.k com.avito.android.advert.item.select.number_input.f fVar) {
        this.f79491a = str;
        this.f79492b = noClickContactCard;
        this.f79493c = noClickContactCard2;
        this.f79494d = fVar;
    }

    public static s a(s sVar, com.avito.android.advert.item.select.number_input.f fVar) {
        return new s(sVar.f79491a, sVar.f79492b, sVar.f79493c, fVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return L.f(this.f79491a, sVar.f79491a) && L.f(this.f79492b, sVar.f79492b) && L.f(this.f79493c, sVar.f79493c) && L.f(this.f79494d, sVar.f79494d);
    }

    public final int hashCode() {
        return this.f79494d.hashCode() + ((this.f79493c.hashCode() + ((this.f79492b.hashCode() + (this.f79491a.hashCode() * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "AutoSelectNoClickContactScreenState(title=" + this.f79491a + ", leftCard=" + this.f79492b + ", rightCard=" + this.f79493c + ", inputState=" + this.f79494d + ')';
    }
}
