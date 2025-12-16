package com.avito.android.remote.model.category_parameters;

import Y61.l;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47203a;

/* compiled from: ObjectsParameter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¨\u0006\u0004"}, d2 = {"hasChildError", "", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class ObjectsParameterKt {
    public static final boolean hasChildError(@l List<? extends ParameterSlot> list) {
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ParameterSlot parameterSlot = (ParameterSlot) next;
                if ((parameterSlot instanceof HasError) && ((HasError) parameterSlot).hasError()) {
                    obj = next;
                    break;
                }
            }
            obj = (ParameterSlot) obj;
        }
        return obj != null;
    }
}
