package com.avito.android.tariff.remote.parse.adapter;

import ZB0.a;
import ZB0.b;
import ZB0.c;
import ZB0.d;
import androidx.compose.runtime.internal.P;
import com.google.gson.JsonParseException;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.x;
import com.google.gson.k;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffBenefitAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/remote/parse/adapter/TariffBenefitAdapter;", "Lcom/google/gson/h;", "LZB0/c;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffBenefitAdapter implements h<c> {
    @Override // com.google.gson.h
    public final c deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        x<String, i> xVar = kVarI.f362194b;
        if (xVar.containsKey("text")) {
            return new d(kVarI.i().D("text").s());
        }
        if (xVar.containsKey("checkmarkText")) {
            return new a(kVarI.i().D("checkmarkText").s());
        }
        if (xVar.containsKey("plusText")) {
            return new b(kVarI.i().D("plusText").s());
        }
        throw new JsonParseException("unknown type of TariffBenefit");
    }
}
