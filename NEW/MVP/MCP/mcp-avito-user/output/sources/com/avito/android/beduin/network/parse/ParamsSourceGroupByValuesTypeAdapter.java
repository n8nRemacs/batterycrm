package com.avito.android.beduin.network.parse;

import Y61.k;
import com.avito.android.beduin.common.component.params_source.ParamsSourceGroupByValues;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ParamsSourceGroupByValuesAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/network/parse/ParamsSourceGroupByValuesTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/beduin/common/component/params_source/ParamsSourceGroupByValues;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParamsSourceGroupByValuesTypeAdapter extends TypeAdapter<ParamsSourceGroupByValues> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f104050a;

    public ParamsSourceGroupByValuesTypeAdapter(@k Gson gson) {
        this.f104050a = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ParamsSourceGroupByValues read(com.google.gson.stream.a aVar) throws IOException {
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362204j;
        if (jsonTokenF == jsonToken) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF2 = aVar.F();
        JsonToken jsonToken2 = JsonToken.f362198d;
        if (jsonTokenF2 != jsonToken2) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
        }
        aVar.b();
        String strB = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Object obj = null;
        while (aVar.k()) {
            if (!L.f(aVar.x(), "value")) {
                aVar.L();
            } else {
                if (aVar.F() == jsonToken) {
                    throw new JsonParseException("");
                }
                if (aVar.F() != jsonToken2) {
                    throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken2, " but was "), " at ", aVar));
                }
                aVar.b();
                while (aVar.k()) {
                    String strX = aVar.x();
                    if (strX != null) {
                        int iHashCode = strX.hashCode();
                        JsonToken jsonToken3 = JsonToken.f362196b;
                        Gson gson = this.f104050a;
                        switch (iHashCode) {
                            case -823812830:
                                if (!strX.equals("values")) {
                                    break;
                                } else {
                                    arrayList2 = new ArrayList();
                                    if (aVar.F() != jsonToken3) {
                                        throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken3, " but was "), " at ", aVar));
                                    }
                                    aVar.a();
                                    while (aVar.k()) {
                                        Object obj2 = gson.g(Object.class).read(aVar);
                                        if (obj2 != null) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    aVar.f();
                                }
                            case -677467308:
                                if (!strX.equals("formIds")) {
                                    break;
                                } else {
                                    arrayList = new ArrayList();
                                    if (aVar.F() != jsonToken3) {
                                        throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken3, " but was "), " at ", aVar));
                                    }
                                    aVar.a();
                                    while (aVar.k()) {
                                        String strB2 = aVar.B();
                                        if (strB2 != null) {
                                            arrayList.add(strB2);
                                        }
                                    }
                                    aVar.f();
                                }
                            case -454553838:
                                if (!strX.equals("groupStrategy")) {
                                    break;
                                } else {
                                    obj = gson.g(ParamsSourceGroupByValues.GroupStrategy.class).read(aVar);
                                }
                            case 293428218:
                                if (!strX.equals("groupId")) {
                                    break;
                                } else {
                                    strB = aVar.B();
                                }
                        }
                    }
                    aVar.L();
                }
                aVar.g();
            }
        }
        aVar.g();
        if (strB != null) {
            return new ParamsSourceGroupByValues(strB, arrayList, arrayList2, (ParamsSourceGroupByValues.GroupStrategy) obj);
        }
        throw new NullPointerException("groupId can't be null");
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, ParamsSourceGroupByValues paramsSourceGroupByValues) {
        throw new UnsupportedOperationException();
    }
}
