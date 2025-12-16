package com.avito.android.select.group_clearance_select.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.select.group_clearance_select.mvi.entity.GroupClearanceInternalAction;
import cq0.C39399c;
import cq0.InterfaceC39397a;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GroupClearanceActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/select/group_clearance_select/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lcq0/a;", "Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction;", "Lcq0/c;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC39397a, GroupClearanceInternalAction, C39399c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<GroupClearanceInternalAction> b(InterfaceC39397a interfaceC39397a, C39399c c39399c) {
        Object onSubmitClicked;
        InterfaceC39397a interfaceC39397a2 = interfaceC39397a;
        C39399c c39399c2 = c39399c;
        if (interfaceC39397a2 instanceof InterfaceC39397a.c) {
            com.avito.android.select.group_clearance_select.a aVar = c39399c2.f392966b;
            if (aVar != null) {
                long f265479b = aVar.getF265479b();
                Long lValueOf = Long.valueOf(f265479b);
                if (f265479b == 0) {
                    lValueOf = null;
                }
                long f265478a = aVar.getF265478a();
                onSubmitClicked = new GroupClearanceInternalAction.OnSubmitClicked(P0.g(new Q(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, lValueOf), new Q(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, f265478a != 0 ? Long.valueOf(f265478a) : null)));
            } else {
                onSubmitClicked = GroupClearanceInternalAction.LeaveWithoutChanges.f265516b;
            }
            return new C43210w(onSubmitClicked);
        }
        if (interfaceC39397a2 instanceof InterfaceC39397a.b) {
            return new C43210w(GroupClearanceInternalAction.ResetSelectionAndLeave.f265518b);
        }
        if (!(interfaceC39397a2 instanceof InterfaceC39397a.C10991a)) {
            throw new NoWhenBranchMatchedException();
        }
        ?? r82 = c39399c2.f392967c;
        Iterator it = ((Iterable) r82).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (L.f(((com.avito.android.select.group_clearance_select.a) next).getF265481d(), ((InterfaceC39397a.C10991a) interfaceC39397a2).f392958a)) {
                obj = next;
                break;
            }
        }
        return new C43210w(new GroupClearanceInternalAction.SetClearances((com.avito.android.select.group_clearance_select.a) obj, r82));
    }
}
