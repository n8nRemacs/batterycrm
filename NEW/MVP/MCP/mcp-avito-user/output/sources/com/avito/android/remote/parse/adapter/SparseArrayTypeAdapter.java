package com.avito.android.remote.parse.adapter;

import android.util.SparseArray;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SparseArrayTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SparseArrayTypeAdapter;", "T", "Lcom/google/gson/h;", "Landroid/util/SparseArray;", "Lcom/google/gson/o;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SparseArrayTypeAdapter<T> implements com.google.gson.h<SparseArray<T>>, com.google.gson.o<SparseArray<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final Type f254247a = new a().getType();

    /* compiled from: SparseArrayTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004"}, d2 = {"com/avito/android/remote/parse/adapter/SparseArrayTypeAdapter$a", "Lcom/google/gson/reflect/a;", "", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.google.gson.reflect.a<Map<Integer, ? extends T>> {
    }

    @Override // com.google.gson.o
    public final com.google.gson.i a(Object obj, com.google.gson.n nVar) {
        SparseArray sparseArray = (SparseArray) obj;
        com.google.gson.internal.x xVar = new com.google.gson.internal.x();
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            xVar.put(Integer.valueOf(sparseArray.keyAt(i12)), sparseArray.valueAt(i12));
        }
        com.google.gson.i iVarA = nVar != null ? nVar.a(xVar, this.f254247a) : null;
        return iVarA == null ? com.google.gson.j.f362193b : iVarA;
    }

    @Override // com.google.gson.h
    public final Object deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        Map map = (Map) gVar.b(iVar, this.f254247a);
        SparseArray sparseArray = new SparseArray(map.size());
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.append(((Number) entry.getKey()).intValue(), entry.getValue());
        }
        return sparseArray;
    }
}
