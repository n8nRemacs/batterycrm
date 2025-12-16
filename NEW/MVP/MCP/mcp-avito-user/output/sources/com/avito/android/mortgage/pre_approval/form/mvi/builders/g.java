package com.avito.android.mortgage.pre_approval.form.mvi.builders;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.dictionary.Parameter;
import com.avito.android.mortgage.pre_approval.form.list.items.chips.c;
import com.avito.android.mortgage.pre_approval.form.list.items.select.SelectItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PreApprovalFormListBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/builders/g;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/builders/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f201861a;

    @Inject
    public g(@Y61.k l lVar) {
        this.f201861a = lVar;
    }

    public static ArrayList b(List list) {
        List<Parameter> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (Parameter parameter : list2) {
            arrayList.add(new c.a(parameter.getValue(), parameter.getLabel()));
        }
        return arrayList;
    }

    public static ArrayList c(List list) {
        List<Parameter> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (Parameter parameter : list2) {
            arrayList.add(new SelectItem.Option(parameter.getValue(), parameter.getLabel()));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:133:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x037b  */
    @Override // com.avito.android.mortgage.pre_approval.form.mvi.builders.f
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.k java.util.Map r28, @Y61.k com.avito.android.mortgage.pre_approval.form.model.PreApprovalFormStep r29) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.pre_approval.form.mvi.builders.g.a(java.util.Map, com.avito.android.mortgage.pre_approval.form.model.PreApprovalFormStep):java.util.ArrayList");
    }
}
