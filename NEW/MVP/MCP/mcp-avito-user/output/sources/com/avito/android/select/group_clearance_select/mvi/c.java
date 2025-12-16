package com.avito.android.select.group_clearance_select.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.ClearanceValue;
import com.avito.android.select.group_clearance_select.ClearanceTitle;
import com.avito.android.select.group_clearance_select.GroupClearanceParams;
import com.avito.android.select.group_clearance_select.g;
import com.avito.android.select.group_clearance_select.mvi.entity.GroupClearanceInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GroupClearanceBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/group_clearance_select/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.arch.mvi.b<GroupClearanceInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.group_clearance_select.g f265509a;

    @Inject
    public c(@Y61.k com.avito.android.select.group_clearance_select.g gVar) {
        this.f265509a = gVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<GroupClearanceInternalAction> a() {
        com.avito.android.select.group_clearance_select.a aVarA;
        Object next;
        com.avito.android.select.group_clearance_select.g gVar = this.f265509a;
        GroupClearanceParams groupClearanceParams = gVar.f265498a;
        int i12 = groupClearanceParams.f265446e;
        Iterator<T> it = groupClearanceParams.f265445d.iterator();
        while (true) {
            aVarA = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ClearanceValue clearanceValue = (ClearanceValue) next;
            if (clearanceValue.getFrom() == i12 && clearanceValue.getTo() == groupClearanceParams.f265447f) {
                break;
            }
        }
        ClearanceValue clearanceValue2 = (ClearanceValue) next;
        if (clearanceValue2 != null) {
            g.a aVar = g.a.f265499a;
            ClearanceTitle clearanceTitleA = com.avito.android.select.group_clearance_select.g.a(clearanceValue2.getButtonTitle());
            if (clearanceTitleA != null) {
                int to2 = clearanceValue2.getTo();
                int from = clearanceValue2.getFrom();
                String title = clearanceValue2.getTitle();
                String buttonTitle = clearanceValue2.getButtonTitle();
                String description = clearanceValue2.getDescription();
                aVar.getClass();
                aVarA = g.a.a(clearanceTitleA, to2, from, title, buttonTitle, description);
            }
        }
        List<ClearanceValue> list = gVar.f265498a.f265445d;
        ArrayList arrayList = new ArrayList();
        for (ClearanceValue clearanceValue3 : list) {
            g.a aVar2 = g.a.f265499a;
            ClearanceTitle clearanceTitleA2 = com.avito.android.select.group_clearance_select.g.a(clearanceValue3.getButtonTitle());
            int to3 = clearanceValue3.getTo();
            int from2 = clearanceValue3.getFrom();
            String title2 = clearanceValue3.getTitle();
            String buttonTitle2 = clearanceValue3.getButtonTitle();
            String description2 = clearanceValue3.getDescription();
            aVar2.getClass();
            com.avito.android.select.group_clearance_select.a aVarA2 = g.a.a(clearanceTitleA2, to3, from2, title2, buttonTitle2, description2);
            if (aVarA2 != null) {
                arrayList.add(aVarA2);
            }
        }
        return new C43210w(new GroupClearanceInternalAction.SetClearances(aVarA, arrayList));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
