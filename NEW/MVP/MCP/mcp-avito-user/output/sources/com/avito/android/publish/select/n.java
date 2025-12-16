package com.avito.android.publish.select;

import com.avito.android.publish.C0;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "param", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectViewModel f242706b;

    public n(SelectViewModel selectViewModel) {
        this.f242706b = selectViewModel;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        T next;
        EditableParameter<?> editableParameter = (EditableParameter) obj;
        String id2 = editableParameter.getId();
        SelectViewModel selectViewModel = this.f242706b;
        SelectParameter selectParameter = selectViewModel.f242641P;
        if (selectParameter == null) {
            selectParameter = null;
        }
        if (L.f(id2, selectParameter.getId())) {
            SelectParameter selectParameter2 = selectViewModel.f242641P;
            if (selectParameter2 == null) {
                selectParameter2 = null;
            }
            String value = selectParameter2.getValue();
            SelectParameter selectParameter3 = selectViewModel.f242641P;
            if (selectParameter3 == null) {
                selectParameter3 = null;
            }
            Iterator<T> it = selectParameter3.getListToShow().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (L.f(((ParcelableEntity) next).getId(), value)) {
                        break;
                    }
                }
            }
            ParcelableEntity parcelableEntity = (ParcelableEntity) next;
            C0 c02 = selectViewModel.f242640O;
            if (parcelableEntity != null) {
                if (!(parcelableEntity instanceof SelectParameter.Value)) {
                    parcelableEntity = null;
                }
                SelectParameter.Value value2 = (SelectParameter.Value) parcelableEntity;
                if (value2 != null) {
                    SelectParameter selectParameter4 = selectViewModel.f242641P;
                    if (selectParameter4 == null) {
                        selectParameter4 = null;
                    }
                    String id3 = selectParameter4.getId();
                    SelectParameter selectParameter5 = selectViewModel.f242641P;
                    if (selectParameter5 == null) {
                        selectParameter5 = null;
                    }
                    selectViewModel.f242635J.O(c02.f231861Y.getNavigation(), id3, selectParameter5.getTitle(), value2.getTitle());
                }
            }
            ItemBrief itemBrief = c02.f231867e0;
            selectViewModel.f242636K.W8(editableParameter, itemBrief != null ? itemBrief.getId() : null, c02.f231861Y.getNavigation().getCategoryId(), c02.f231873k0);
        }
    }
}
