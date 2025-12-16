package com.avito.android.remote.parse.adapter;

import android.util.SparseArray;
import com.avito.android.remote.model.CaseText;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CaseTextTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/CaseTextTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/CaseText;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CaseTextTypeAdapter implements com.google.gson.h<CaseText> {

    /* renamed from: a, reason: collision with root package name */
    public final Type f254159a = new a().getType();

    /* compiled from: CaseTextTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"com/avito/android/remote/parse/adapter/CaseTextTypeAdapter$a", "Lcom/google/gson/reflect/a;", "", "", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.google.gson.reflect.a<Map<Integer, ? extends String>> {
    }

    @Override // com.google.gson.h
    public final CaseText deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        Map map = (Map) gVar.b(iVar, this.f254159a);
        SparseArray sparseArray = new SparseArray(map.size());
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.append(((Number) entry.getKey()).intValue(), entry.getValue());
        }
        return new CaseText((SparseArray<String>) sparseArray);
    }
}
