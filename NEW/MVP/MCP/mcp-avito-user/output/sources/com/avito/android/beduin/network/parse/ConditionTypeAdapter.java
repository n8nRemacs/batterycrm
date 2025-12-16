package com.avito.android.beduin.network.parse;

import com.avito.android.beduin.network.model.Condition;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ConditionTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/network/parse/ConditionTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/beduin/network/model/Condition;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConditionTypeAdapter extends TypeAdapter<Condition> {
    @Override // com.google.gson.TypeAdapter
    public final Condition read(com.google.gson.stream.a aVar) throws IOException {
        boolean z12;
        String strB;
        Integer numY0;
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362198d;
        if (jsonTokenF != jsonToken) {
            aVar.L();
            return null;
        }
        JsonToken jsonTokenF2 = aVar.F();
        JsonToken jsonToken2 = JsonToken.f362204j;
        if (jsonTokenF2 == jsonToken2) {
            throw new JsonParseException("");
        }
        if (aVar.F() != jsonToken) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken, " but was "), " at ", aVar));
        }
        aVar.b();
        Condition.Equals equals = null;
        Integer numY02 = null;
        Integer numY03 = null;
        while (aVar.k()) {
            String strX = aVar.x();
            if (strX != null) {
                int iHashCode = strX.hashCode();
                if (iHashCode != -1295482945) {
                    if (iHashCode != 100571) {
                        if (iHashCode == 109757538 && strX.equals("start")) {
                            z12 = aVar.F() == jsonToken2;
                            if (z12) {
                                aVar.L();
                            }
                            if (!z12) {
                                String strB2 = aVar.B();
                                numY02 = strB2 != null ? C43066x.y0(strB2) : null;
                            }
                        }
                    } else if (strX.equals("end")) {
                        z12 = aVar.F() == jsonToken2;
                        if (z12) {
                            aVar.L();
                        }
                        if (!z12) {
                            String strB3 = aVar.B();
                            numY03 = strB3 != null ? C43066x.y0(strB3) : null;
                        }
                    }
                } else if (strX.equals("equals")) {
                    z12 = aVar.F() == jsonToken2;
                    if (z12) {
                        aVar.L();
                    }
                    if (!z12 && (strB = aVar.B()) != null && (numY0 = C43066x.y0(strB)) != null) {
                        equals = new Condition.Equals(numY0.intValue());
                    }
                }
            }
            aVar.L();
        }
        aVar.g();
        return equals == null ? new Condition.Range(numY02, numY03) : equals;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, Condition condition) {
        throw new UnsupportedOperationException();
    }
}
