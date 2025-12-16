package com.avito.android.remote.model.category_parameters;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.IterableParameters;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ParametersTree.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/ParametersTree;", "Lcom/avito/android/remote/model/IterableParameters;", "applyPretendResult", "", "pretendResult", "", "", "Lcom/avito/android/remote/model/PretendErrorValue;", "getParametersExceptOwnedBySlots", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ParametersTree extends IterableParameters {

    /* compiled from: ParametersTree.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @k
        public static Iterator<ParameterSlot> iterator(@k ParametersTree parametersTree) {
            return IterableParameters.DefaultImpls.iterator(parametersTree);
        }
    }

    boolean applyPretendResult(@l Map<String, ? extends PretendErrorValue> pretendResult);

    @Override // com.avito.android.remote.model.IterableParameters, UV0.a
    /* synthetic */ int getCount();

    @Override // com.avito.android.remote.model.IterableParameters, UV0.a
    /* synthetic */ Object getItem(int i12);

    @k
    List<ParameterSlot> getParametersExceptOwnedBySlots();

    @Override // com.avito.android.remote.model.IterableParameters, UV0.a
    /* synthetic */ boolean isEmpty();
}
