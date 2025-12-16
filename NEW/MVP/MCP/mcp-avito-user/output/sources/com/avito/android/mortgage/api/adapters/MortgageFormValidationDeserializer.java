package com.avito.android.mortgage.api.adapters;

import JZ.k;
import JZ.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageFormValidationDeserializer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/api/adapters/MortgageFormValidationDeserializer;", "Lcom/google/gson/h;", "LJZ/l;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MortgageFormValidationDeserializer implements h<l> {
    @Override // com.google.gson.h
    public final l deserialize(i iVar, Type type, g gVar) {
        if (!iVar.i().f362194b.containsKey("validation")) {
            return new l(C42784z0.f406748b);
        }
        ArrayList arrayList = iVar.i().E("validation").f362000b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(gVar.b((i) it.next(), k.class));
        }
        return new l(arrayList2);
    }
}
