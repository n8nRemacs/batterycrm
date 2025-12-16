package com.avito.android.beduin.network.parse;

import Y61.k;
import Y61.l;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BeduinMapByTypeAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinMapByTypeAdapter;", "T", "Lcom/google/gson/h;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BeduinMapByTypeAdapter<T> implements h<T> {
    @k
    public abstract Map<String, Type> a();

    @Override // com.google.gson.h
    @l
    public final T deserialize(@k i iVar, @k Type type, @k g gVar) {
        com.google.gson.k kVarI = iVar.i();
        i iVarD = kVarI.D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Type type2 = a().get(strS);
        if (type2 == null) {
            return null;
        }
        return (T) gVar.b(kVarI, type2);
    }
}
