package com.avito.android.hotel_booking.deserializers;

import Y61.k;
import com.avito.android.hotel_booking.InputConstraint;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: InputConstraintTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/hotel_booking/deserializers/InputConstraintTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/hotel_booking/InputConstraint;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InputConstraintTypeAdapter implements h<InputConstraint> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<String, Type> f163336a = Collections.singletonMap("regularExpression", InputConstraint.Pattern.class);

    @Override // com.google.gson.h
    public final InputConstraint deserialize(i iVar, Type type, g gVar) {
        com.google.gson.k kVarI = iVar.i();
        i iVarD = kVarI.D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Type type2 = this.f163336a.get(strS);
        if (type2 == null) {
            return null;
        }
        i iVarD2 = kVarI.D("value");
        com.google.gson.k kVarI2 = iVarD2 != null ? iVarD2.i() : null;
        if (kVarI2 == null) {
            return null;
        }
        return (InputConstraint) gVar.b(kVarI2, type2);
    }
}
