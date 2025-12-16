package com.avito.android.remote.parse.adapter;

import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RuntimeTypeAdapter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001e\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00148$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "T", "Lcom/google/gson/h;", "", "typeKey", "valueKey", "Ljava/lang/Class;", "fallbackObjectType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", "Lcom/google/gson/i;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/g;", "context", "deserialize", "(Lcom/google/gson/i;Ljava/lang/reflect/Type;Lcom/google/gson/g;)Ljava/lang/Object;", "Ljava/lang/String;", "Ljava/lang/Class;", "", "getMapping", "()Ljava/util/Map;", "mapping", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class RuntimeTypeAdapter<T> implements com.google.gson.h<T> {

    @Y61.l
    private final Class<? extends T> fallbackObjectType;

    @Y61.k
    private final String typeKey;

    @Y61.k
    private final String valueKey;

    public RuntimeTypeAdapter() {
        this(null, null, null, 7, null);
    }

    @Override // com.google.gson.h
    @Y61.l
    public T deserialize(@Y61.k com.google.gson.i json, @Y61.k Type typeOfT, @Y61.k com.google.gson.g context) {
        com.google.gson.k kVarI = json.i();
        com.google.gson.i iVarD = kVarI.D(this.typeKey);
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Type type = getMapping().get(strS);
        if (type == null && (type = this.fallbackObjectType) == null) {
            return null;
        }
        com.google.gson.i iVarD2 = kVarI.D(this.valueKey);
        com.google.gson.k kVarI2 = iVarD2 != null ? iVarD2.i() : null;
        if (kVarI2 == null) {
            return null;
        }
        return (T) context.b(kVarI2, type);
    }

    @Y61.k
    public abstract Map<String, Type> getMapping();

    public RuntimeTypeAdapter(@Y61.k String str, @Y61.k String str2, @Y61.l Class<? extends T> cls) {
        this.typeKey = str;
        this.valueKey = str2;
        this.fallbackObjectType = cls;
    }

    public /* synthetic */ RuntimeTypeAdapter(String str, String str2, Class cls, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "type" : str, (i12 & 2) != 0 ? "value" : str2, (i12 & 4) != 0 ? null : cls);
    }
}
