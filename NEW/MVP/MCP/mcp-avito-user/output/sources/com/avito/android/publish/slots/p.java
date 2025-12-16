package com.avito.android.publish.slots;

import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.publish.details.C33771m1;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.edit_category.EditCategorySlot;
import com.avito.android.remote.model.category_parameters.slot.edit_category.EditCategorySlotConfig;
import com.avito.android.remote.model.category_parameters.slot.edit_category.EditCategorySlotField;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: EditCategorySlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/p;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/edit_category/EditCategorySlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p extends com.avito.android.category_parameters.k<EditCategorySlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final EditCategorySlot f244666b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Q1 f244667c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C33771m1 f244668d;

    public p(@Y61.k EditCategorySlot editCategorySlot, @Y61.k Q1 q12, @Y61.k C33771m1 c33771m1) {
        this.f244666b = editCategorySlot;
        this.f244667c = q12;
        this.f244668d = c33771m1;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244666b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        Object kVar;
        EditCategorySlot editCategorySlot = this.f244666b;
        EditCategorySlotField field = ((EditCategorySlotConfig) editCategorySlot.getWidget().getConfig()).getField();
        String strMo56getErrorMessage = editCategorySlot.mo56getErrorMessage();
        ItemWithState.State normal = (strMo56getErrorMessage == null || strMo56getErrorMessage.length() == 0) ? new ItemWithState.State.Normal(null, 1, null) : new ItemWithState.State.Error.ErrorWithMessage(strMo56getErrorMessage);
        Q1 q12 = this.f244667c;
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[60];
        if (((Boolean) q12.f67479c0.a().invoke()).booleanValue()) {
            kVar = new ParameterElement.C.b(editCategorySlot.getId(), this.f244668d.f234846m, null, (C43066x.K(field.getParentTitle()) || C43066x.K(field.getTitle())) ? null : field.getParentTitle() + " · " + field.getTitle(), null, null, null, null, null, ParameterElement.DisplayType.i.f117262a, null, false, false, false, null, normal, false, false, null, null, null, false, false, false, null, null, null, null, null, 0, null, null, false, -41484, 1, null);
        } else {
            kVar = new ParameterElement.k(editCategorySlot.getId(), field.getTitle(), field.getParentTitle(), null, normal, false, 40, null);
        }
        return Collections.singletonList(kVar);
    }
}
