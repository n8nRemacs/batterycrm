package com.avito.android.beduin.network.parse;

import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.checkbox_group_aggregator.CheckboxGroupAggregatorModel;
import com.avito.android.beduin.common.component.checkbox_list_item.CheckboxTapArea;
import com.avito.android.beduin.common.component.checkbox_list_item.CheckboxVerticalPosition;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.utils.z;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCheckboxGroupAggregatorDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinCheckboxGroupAggregatorDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/beduin/common/component/checkbox_group_aggregator/CheckboxGroupAggregatorModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinCheckboxGroupAggregatorDeserializer implements h<CheckboxGroupAggregatorModel> {
    @Override // com.google.gson.h
    public final CheckboxGroupAggregatorModel deserialize(i iVar, Type type, g gVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        k kVarI = iVar.i().D("content").i();
        i iVarD = kVarI.D(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE);
        DisplayingPredicate displayingPredicate = (DisplayingPredicate) (iVarD == null ? null : gVar.b(iVarD, DisplayingPredicate.class));
        CheckboxGroupAggregatorModel.Header header = (CheckboxGroupAggregatorModel.Header) gVar.b(kVarI.D("header"), CheckboxGroupAggregatorModel.Header.class);
        CheckboxGroupAggregatorModel.Body body = (CheckboxGroupAggregatorModel.Body) gVar.b(kVarI.D("body"), CheckboxGroupAggregatorModel.Body.class);
        i iVarD2 = kVarI.D(BeduinPromoBlockModel.SERIALIZED_NAME_THEME);
        BeduinComponentTheme beduinComponentTheme = (BeduinComponentTheme) (iVarD2 == null ? null : gVar.b(iVarD2, BeduinComponentTheme.class));
        i iVarD3 = kVarI.D("checkboxTapArea");
        CheckboxTapArea checkboxTapArea = (CheckboxTapArea) (iVarD3 == null ? null : gVar.b(iVarD3, CheckboxTapArea.class));
        i iVarD4 = kVarI.D("onCheckboxTapActions");
        f fVarC = iVarD4 != null ? C34328m0.c(iVarD4) : null;
        if (fVarC == null) {
            arrayList = null;
        } else {
            int size = fVarC.f362000b.size();
            ArrayList arrayList4 = new ArrayList(size);
            int iC2 = 0;
            while (iC2 < size) {
                i iVarW = fVarC.w(iC2);
                iC2 = com.avito.android.authorization.auto_recovery.phone_confirm.b.c(gVar, iVarW != null ? iVarW.i() : null, BeduinAction.class, arrayList4, iC2, 1);
                size = size;
                arrayList4 = arrayList4;
            }
            arrayList = arrayList4;
        }
        i iVarD5 = kVarI.D("onCheckedActions");
        f fVarC2 = iVarD5 != null ? C34328m0.c(iVarD5) : null;
        if (fVarC2 == null) {
            arrayList2 = null;
        } else {
            int size2 = fVarC2.f362000b.size();
            ArrayList arrayList5 = new ArrayList(size2);
            int iC3 = 0;
            while (iC3 < size2) {
                i iVarW2 = fVarC2.w(iC3);
                iC3 = com.avito.android.authorization.auto_recovery.phone_confirm.b.c(gVar, iVarW2 != null ? iVarW2.i() : null, BeduinAction.class, arrayList5, iC3, 1);
                size2 = size2;
                arrayList5 = arrayList5;
            }
            arrayList2 = arrayList5;
        }
        i iVarD6 = kVarI.D("onUncheckedActions");
        f fVarC3 = iVarD6 != null ? C34328m0.c(iVarD6) : null;
        if (fVarC3 == null) {
            arrayList3 = null;
        } else {
            int size3 = fVarC3.f362000b.size();
            ArrayList arrayList6 = new ArrayList(size3);
            int iC4 = 0;
            while (iC4 < size3) {
                i iVarW3 = fVarC3.w(iC4);
                iC4 = com.avito.android.authorization.auto_recovery.phone_confirm.b.c(gVar, iVarW3 != null ? iVarW3.i() : null, BeduinAction.class, arrayList6, iC4, 1);
                size3 = size3;
                arrayList6 = arrayList6;
            }
            arrayList3 = arrayList6;
        }
        i iVarD7 = kVarI.D(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING);
        BeduinContainerIndent beduinContainerIndent = (BeduinContainerIndent) (iVarD7 == null ? null : gVar.b(iVarD7, BeduinContainerIndent.class));
        i iVarD8 = kVarI.D("selectedBackgroundColor");
        UniversalColor universalColor = (UniversalColor) (iVarD8 == null ? null : gVar.b(iVarD8, UniversalColor.class));
        i iVarD9 = kVarI.D("checkboxVerticalPosition");
        return new CheckboxGroupAggregatorModel(z.a(kVarI), displayingPredicate, header, body, beduinComponentTheme, checkboxTapArea, arrayList, arrayList2, arrayList3, beduinContainerIndent, universalColor, (CheckboxVerticalPosition) (iVarD9 != null ? gVar.b(iVarD9, CheckboxVerticalPosition.class) : null));
    }
}
