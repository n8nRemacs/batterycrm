package com.avito.android.sbc;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.sbc.Offer;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: CreateDiscountDispatchOffersTypeAdapter.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sbc/CreateDiscountDispatchOffersTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/sbc/Offer;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateDiscountDispatchOffersTypeAdapter implements h<Offer> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f258808a = P0.g(new Q("text", Offer.Text.class), new Q("discount", Offer.Discount.class), new Q("discount_percent", Offer.DiscountPercent.class));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.gson.h
    public final Offer deserialize(i iVar, Type type, g gVar) {
        i iVarD = iVar.i().D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Type type2 = (Type) this.f258808a.get(strS);
        if (type2 == null) {
            return null;
        }
        return (Offer) gVar.b(iVar, type2);
    }
}
