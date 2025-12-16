package com.avito.android.remote.parse.adapter.stream_gson;

import Y61.k;
import android.util.SparseArray;
import com.avito.android.remote.model.CaseText;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CaseTextTypeAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/CaseTextTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/CaseText;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CaseTextTypeAdapter extends TypeAdapter<CaseText> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f254289a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f254290b = new a();

    /* compiled from: CaseTextTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"com/avito/android/remote/parse/adapter/stream_gson/CaseTextTypeAdapter$a", "Lcom/google/gson/reflect/a;", "", "", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.google.gson.reflect.a<Map<Integer, ? extends String>> {
    }

    public CaseTextTypeAdapter(@k Gson gson) {
        this.f254289a = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CaseText read(com.google.gson.stream.a aVar) {
        Map map = (Map) this.f254289a.f(this.f254290b).read(aVar);
        SparseArray sparseArray = new SparseArray(map.size());
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.append(((Number) entry.getKey()).intValue(), entry.getValue());
        }
        return new CaseText((SparseArray<String>) sparseArray);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, CaseText caseText) {
        throw new UnsupportedOperationException();
    }
}
