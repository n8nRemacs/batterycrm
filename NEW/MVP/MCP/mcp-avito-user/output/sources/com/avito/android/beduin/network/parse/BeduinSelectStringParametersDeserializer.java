package com.avito.android.beduin.network.parse;

import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.selectStringParameters.BeduinSelectStringParametersModel;
import com.avito.android.beduin.common.component.selectStringParameters.SelectItem;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.utils.z;
import com.avito.android.beduin.network.model.Constraint;
import com.avito.android.beduin.network.model.SelectValue;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSelectStringParametersDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinSelectStringParametersDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/beduin/common/component/selectStringParameters/BeduinSelectStringParametersModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinSelectStringParametersDeserializer implements h<BeduinSelectStringParametersModel> {
    public static String a(k kVar, String str) {
        i iVarD = kVar.D(str);
        if (iVarD != null) {
            return C34328m0.e(iVarD);
        }
        return null;
    }

    @Override // com.google.gson.h
    public final BeduinSelectStringParametersModel deserialize(i iVar, Type type, g gVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        k kVarI = iVar.i().D("content").i();
        String strA = z.a(kVarI);
        i iVarD = kVarI.D(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE);
        DisplayingPredicate displayingPredicate = (DisplayingPredicate) (iVarD == null ? null : gVar.b(iVarD, DisplayingPredicate.class));
        i iVarD2 = kVarI.D(BeduinPromoBlockModel.SERIALIZED_NAME_THEME);
        BeduinComponentTheme beduinComponentTheme = (BeduinComponentTheme) (iVarD2 == null ? null : gVar.b(iVarD2, BeduinComponentTheme.class));
        String strA2 = a(kVarI, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE);
        i iVarD3 = kVarI.D("selectValue");
        SelectValue selectValue = (SelectValue) (iVarD3 == null ? null : gVar.b(iVarD3, SelectValue.class));
        String strA3 = a(kVarI, "text");
        String strA4 = a(kVarI, "details");
        String strA5 = a(kVarI, ChannelContext.Item.PLACEHOLDER);
        i iVarD4 = kVarI.D("leftItem");
        SelectItem selectItem = (SelectItem) (iVarD4 == null ? null : gVar.b(iVarD4, SelectItem.class));
        i iVarD5 = kVarI.D("rightItem");
        SelectItem selectItem2 = (SelectItem) (iVarD5 == null ? null : gVar.b(iVarD5, SelectItem.class));
        i iVarD6 = kVarI.D("showClearButton");
        Boolean boolA = iVarD6 != null ? C34328m0.a(iVarD6) : null;
        i iVarD7 = kVarI.D("onClearedActions");
        f fVarC = iVarD7 != null ? C34328m0.c(iVarD7) : null;
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
        i iVarD8 = kVarI.D("maximumLinesNumber");
        Integer numB = iVarD8 != null ? C34328m0.b(iVarD8) : null;
        String strA6 = a(kVarI, "errorMessage");
        i iVarD9 = kVarI.D("constraints");
        f fVarC2 = iVarD9 != null ? C34328m0.c(iVarD9) : null;
        if (fVarC2 == null) {
            arrayList2 = null;
        } else {
            int size2 = fVarC2.f362000b.size();
            ArrayList arrayList5 = new ArrayList(size2);
            int iC3 = 0;
            while (iC3 < size2) {
                i iVarW2 = fVarC2.w(iC3);
                iC3 = com.avito.android.authorization.auto_recovery.phone_confirm.b.c(gVar, iVarW2 != null ? iVarW2.i() : null, Constraint.class, arrayList5, iC3, 1);
                size2 = size2;
                arrayList5 = arrayList5;
            }
            arrayList2 = arrayList5;
        }
        i iVarD10 = kVarI.D("actions");
        f fVarC3 = iVarD10 != null ? C34328m0.c(iVarD10) : null;
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
        i iVarD11 = kVarI.D("isEnabled");
        return new BeduinSelectStringParametersModel(strA, strA, displayingPredicate, beduinComponentTheme, strA2, selectValue, strA3, strA4, strA5, selectItem, selectItem2, boolA, arrayList, numB, strA6, arrayList2, arrayList3, iVarD11 != null ? C34328m0.a(iVarD11) : null);
    }
}
