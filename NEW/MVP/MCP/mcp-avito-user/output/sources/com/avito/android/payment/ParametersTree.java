package com.avito.android.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.IterableParameters;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.category_parameters.DateTimeIntervalParameter;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ParametersTree.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/ParametersTree;", "Lcom/avito/android/remote/model/IterableParameters;", "_avito_payment-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ParametersTree implements IterableParameters {

    @Y61.k
    public static final Parcelable.Creator<ParametersTree> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<ParameterSlot> f213984b;

    /* compiled from: ParametersTree.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ParametersTree> {
        @Override // android.os.Parcelable.Creator
        public final ParametersTree createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ParametersTree.class, parcel, arrayList, iL2, 1);
            }
            return new ParametersTree(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ParametersTree[] newArray(int i12) {
            return new ParametersTree[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ParametersTree(@Y61.k List<? extends ParameterSlot> list) {
        this.f213984b = list;
    }

    @Override // com.avito.android.remote.model.IterableParameters, UV0.a
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ParameterSlot getItem(int i12) {
        List<ParameterSlot> list = this.f213984b;
        if (i12 <= list.size() - 1) {
            return list.get(i12);
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean applyPretendResult(@Y61.l Map<String, ? extends PretendErrorValue> map) {
        Map<Integer, Map<String, PretendErrorValue>> objectsErrorParams;
        int size = this.f213984b.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            ParameterSlot item = getItem(i12);
            PretendErrorValue pretendErrorValue = (!(item instanceof CategoryParameter) || map == null) ? null : map.get(item.getId());
            if (pretendErrorValue != null) {
                z12 = true;
            }
            if (item instanceof ObjectsParameter) {
                PretendErrorValue.ObjectsMessages objectsMessages = pretendErrorValue instanceof PretendErrorValue.ObjectsMessages ? (PretendErrorValue.ObjectsMessages) pretendErrorValue : null;
                ObjectsParameter objectsParameter = (ObjectsParameter) item;
                objectsParameter.setErrorMessage(objectsMessages != null ? objectsMessages.getMessage() : null);
                List<? extends List<? extends ParameterSlot>> value = objectsParameter.getValue();
                if (value != null) {
                    int i13 = 0;
                    for (Object obj : value) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        new ParametersTree((List) obj).applyPretendResult((objectsMessages == null || (objectsErrorParams = objectsMessages.getObjectsErrorParams()) == null) ? null : objectsErrorParams.get(Integer.valueOf(i13)));
                        i13 = i14;
                    }
                } else {
                    continue;
                }
            } else if (item instanceof DateTimeIntervalParameter) {
                DateTimeIntervalParameter dateTimeIntervalParameter = (DateTimeIntervalParameter) item;
                DateTimeParameter start = dateTimeIntervalParameter.getStart();
                if (start != null) {
                    start.applyPretendResult(map != null ? map.get(start.getId()) : null);
                }
                DateTimeParameter end = dateTimeIntervalParameter.getEnd();
                if (end != null) {
                    end.applyPretendResult(map != null ? map.get(end.getId()) : null);
                }
            } else if (item instanceof HasError) {
                ((HasError) item).applyPretendResult(pretendErrorValue);
            } else if (pretendErrorValue != null) {
                V2.f318762a.e("parameter " + item + " has no error field but it has pretend error with message: " + pretendErrorValue.getSingleMessage(), null);
            }
        }
        return z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @Y61.l
    public final ParameterSlot findParameter(@Y61.k String str) {
        Object next;
        Iterator<T> it = this.f213984b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((ParameterSlot) next).getId(), str)) {
                break;
            }
        }
        return (ParameterSlot) next;
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @Y61.k
    public final <T extends ParameterSlot> List<T> findParametersOfType(@Y61.k Class<T> cls) {
        List<ParameterSlot> list = this.f213984b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (cls.isInstance((ParameterSlot) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            T tCast = cls.cast((ParameterSlot) it.next());
            if (tCast != null) {
                arrayList2.add(tCast);
            }
        }
        return arrayList2;
    }

    @Override // com.avito.android.remote.model.IterableParameters, UV0.a
    public final int getCount() {
        return this.f213984b.size();
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @Y61.l
    public final <T extends ParameterSlot> T getFirstParameterOfType(@Y61.k Class<T> cls) {
        Object next;
        Iterator<T> it = this.f213984b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (cls.isInstance((ParameterSlot) next)) {
                break;
            }
        }
        if (next instanceof ParameterSlot) {
            return (T) next;
        }
        return null;
    }

    @Override // com.avito.android.remote.model.IterableParameters, UV0.a
    public final boolean isEmpty() {
        return this.f213984b.isEmpty();
    }

    @Override // com.avito.android.remote.model.IterableParameters, java.lang.Iterable
    @Y61.k
    public final Iterator<ParameterSlot> iterator() {
        return IterableParameters.DefaultImpls.iterator(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f213984b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
