package com.avito.android.remote.parse.adapter.inline_filters;

import com.avito.android.remote.model.search.InlineFilterValue;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.c;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFilterSectionedMultiselectValueTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/inline_filters/InlineFilterSectionedMultiselectValueTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterSectionedMultiSelectValue;", "<init>", "()V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InlineFilterSectionedMultiselectValueTypeAdapter extends TypeAdapter<InlineFilterValue.InlineFilterSectionedMultiSelectValue> {
    @Override // com.google.gson.TypeAdapter
    public final InlineFilterValue.InlineFilterSectionedMultiSelectValue read(com.google.gson.stream.a aVar) {
        Object bVar;
        try {
            int i12 = Z.f406624c;
            String strB = aVar != null ? aVar.B() : null;
            bVar = strB != null ? new InlineFilterValue.InlineFilterSectionedMultiSelectValue(C42745f0.e0(strB)) : null;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        InlineFilterValue.InlineFilterSectionedMultiSelectValue inlineFilterSectionedMultiSelectValue = (InlineFilterValue.InlineFilterSectionedMultiSelectValue) (bVar instanceof Z.b ? null : bVar);
        if (inlineFilterSectionedMultiSelectValue != null) {
            return inlineFilterSectionedMultiSelectValue;
        }
        ArrayList arrayList = new ArrayList();
        if (aVar != null) {
            try {
                JsonToken jsonTokenF = aVar.F();
                JsonToken jsonToken = JsonToken.f362196b;
                if (jsonTokenF != jsonToken) {
                    throw new IllegalStateException("Expected " + jsonToken + " but was " + aVar.F() + " at " + aVar);
                }
                aVar.a();
                while (aVar.k()) {
                    arrayList.add(aVar.B());
                }
                aVar.f();
                G0 g02 = G0.f406611a;
                int i14 = Z.f406624c;
            } catch (Throwable unused) {
                int i15 = Z.f406624c;
            }
        } else {
            int i142 = Z.f406624c;
        }
        return new InlineFilterValue.InlineFilterSectionedMultiSelectValue(arrayList);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, InlineFilterValue.InlineFilterSectionedMultiSelectValue inlineFilterSectionedMultiSelectValue) {
        throw new UnsupportedOperationException();
    }
}
