package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.category_parameters.Condition;
import com.avito.android.remote.model.category_parameters.Constraint;
import com.avito.android.remote.model.category_parameters.InvalidAddress;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ConstraintTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ConstraintTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConstraintTypeAdapter implements com.google.gson.h<Constraint> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254168a = P0.g(new kotlin.Q("limit", Constraint.Limit.class), new kotlin.Q("length", Constraint.Length.class), new kotlin.Q("regexp", Constraint.Regex.class), new kotlin.Q("equalTo", Constraint.EqualTo.class), new kotlin.Q("distinctFrom", Constraint.DistinctFrom.class), new kotlin.Q("range", Constraint.Range.class), new kotlin.Q("required", Constraint.Required.class), new kotlin.Q("invalidAddress", InvalidAddress.class));

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.gson.h
    public final Constraint deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        ArrayList arrayList;
        Constraint constraintCopy$default;
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Type type2 = (Type) this.f254168a.get(strS);
        if (type2 == null) {
            return null;
        }
        com.google.gson.i iVarD2 = kVarI.D("value");
        com.google.gson.k kVarI2 = iVarD2 != null ? iVarD2.i() : null;
        if (kVarI2 == null) {
            return null;
        }
        com.google.gson.i iVarD3 = kVarI.D("conditions");
        if (iVarD3 != null) {
            ArrayList arrayList2 = iVarD3.h().f362000b;
            arrayList = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(gVar.b((com.google.gson.i) it.next(), Condition.class));
            }
        } else {
            arrayList = null;
        }
        com.google.gson.i iVarD4 = kVarI.D("conditionFlow");
        String strS2 = iVarD4 != null ? iVarD4.s() : null;
        Constraint constraint = (Constraint) gVar.b(kVarI2, type2);
        if (constraint instanceof Constraint.Limit) {
            constraintCopy$default = Constraint.Limit.copy$default((Constraint.Limit) constraint, null, null, null, null, null, arrayList, strS2, 31, null);
        } else if (constraint instanceof Constraint.DistinctFrom) {
            constraintCopy$default = Constraint.DistinctFrom.copy$default((Constraint.DistinctFrom) constraint, null, null, null, null, arrayList, strS2, 15, null);
        } else if (constraint instanceof Constraint.EqualTo) {
            constraintCopy$default = Constraint.EqualTo.copy$default((Constraint.EqualTo) constraint, null, null, null, null, arrayList, strS2, 15, null);
        } else if (constraint instanceof Constraint.Length) {
            constraintCopy$default = Constraint.Length.copy$default((Constraint.Length) constraint, null, null, null, null, null, arrayList, strS2, 31, null);
        } else if (constraint instanceof Constraint.Regex) {
            constraintCopy$default = Constraint.Regex.copy$default((Constraint.Regex) constraint, null, null, null, null, null, arrayList, strS2, 31, null);
        } else if (constraint instanceof Constraint.Range) {
            constraintCopy$default = Constraint.Range.copy$default((Constraint.Range) constraint, false, null, null, null, arrayList, strS2, 15, null);
        } else if (constraint instanceof Constraint.Required) {
            constraintCopy$default = Constraint.Required.copy$default((Constraint.Required) constraint, null, null, null, arrayList, strS2, 7, null);
        } else {
            if (!(constraint instanceof InvalidAddress)) {
                throw new NoWhenBranchMatchedException();
            }
            constraintCopy$default = InvalidAddress.copy$default((InvalidAddress) constraint, null, null, null, arrayList, strS2, 7, null);
        }
        return constraintCopy$default;
    }
}
