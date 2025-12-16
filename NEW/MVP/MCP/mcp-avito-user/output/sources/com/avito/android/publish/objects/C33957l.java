package com.avito.android.publish.objects;

import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.AbstractC35806h3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: ObjectFillFormInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/h3;", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "response", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/h3;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.objects.l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33957l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33967q f238051b;

    public C33957l(C33967q c33967q) {
        this.f238051b = c33967q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        T next;
        AbstractC35806h3 abstractC35806h3 = (AbstractC35806h3) obj;
        if (abstractC35806h3 instanceof AbstractC35806h3.d) {
            CategoryParameters categoryParameters = (CategoryParameters) ((AbstractC35806h3.d) abstractC35806h3).f318893a;
            C33967q c33967q = this.f238051b;
            ParameterSlot parameterSlotFindParameter = categoryParameters.findParameter(c33967q.a().getId());
            T t12 = null;
            ObjectsParameter objectsParameter = parameterSlotFindParameter instanceof ObjectsParameter ? (ObjectsParameter) parameterSlotFindParameter : null;
            List<? extends List<? extends ParameterSlot>> value = c33967q.a().getValue();
            if (value != null) {
                List<? extends List<? extends ParameterSlot>> list = value;
                List<? extends List<? extends ParameterSlot>> value2 = objectsParameter != null ? objectsParameter.getValue() : null;
                if (value2 == null) {
                    value2 = C42784z0.f406748b;
                }
                List<? extends List<? extends ParameterSlot>> list2 = value2;
                Iterator<T> it = list.iterator();
                Iterator<T> it2 = list2.iterator();
                ArrayList arrayList = new ArrayList(Math.min(C42745f0.q(list, 10), C42745f0.q(list2, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    List list3 = (List) it.next();
                    List<ParameterSlot> list4 = (List) it2.next();
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(list4, 10));
                    for (ParameterSlot parameterSlot : list4) {
                        Iterator<T> it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (kotlin.jvm.internal.L.f(parameterSlot.getId(), ((ParameterSlot) next).getId())) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        ParameterSlot parameterSlot2 = (ParameterSlot) next;
                        if ((parameterSlot instanceof HasError) && parameterSlot2 != null && (parameterSlot2 instanceof HasError)) {
                            ((HasError) parameterSlot).setError(((HasError) parameterSlot2).getError());
                        }
                        arrayList2.add(parameterSlot);
                    }
                    arrayList.add(arrayList2);
                }
                t12 = arrayList;
            }
            c33967q.a().setValue(t12);
            ArrayList arrayList3 = c33967q.f238069j;
            arrayList3.clear();
            arrayList3.addAll(c33967q.c(Integer.valueOf(c33967q.f238070k)));
        }
    }
}
