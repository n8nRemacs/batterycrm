package com.avito.android.publish.params_suggest;

import com.avito.android.remote.model.publish.ParamsSuggest;
import com.avito.android.remote.model.suggests.ParamsSuggestResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ParamsSuggestionsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/suggests/ParamsSuggestResponse;", "response", "", "Lcom/avito/android/publish/params_suggest/d;", "apply", "(Lcom/avito/android/remote/model/suggests/ParamsSuggestResponse;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final i<T, R> f238213b = new i<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        List<ParamsSuggest> result = ((ParamsSuggestResponse) obj).getResult();
        ArrayList arrayList = new ArrayList();
        for (ParamsSuggest paramsSuggest : result) {
            String value = paramsSuggest.getValue();
            d dVar = value != null ? new d(paramsSuggest.getId(), Collections.singletonList(value)) : null;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }
}
