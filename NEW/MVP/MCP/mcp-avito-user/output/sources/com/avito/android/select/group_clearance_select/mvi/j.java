package com.avito.android.select.group_clearance_select.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.auto_cx.EasterEggType;
import com.avito.android.arch.mvi.u;
import com.avito.android.select.group_clearance_select.a;
import com.avito.android.select.group_clearance_select.mvi.entity.GroupClearanceInternalAction;
import cq0.C39399c;
import gc.C40654a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GroupClearanceReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/group_clearance_select/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction;", "Lcq0/c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements u<GroupClearanceInternalAction, C39399c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f265527b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.a f265528c;

    /* renamed from: d, reason: collision with root package name */
    public int f265529d;

    @Inject
    public j(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.analytics.provider.a aVar) {
        this.f265527b = interfaceC28373a;
        this.f265528c = aVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    public final C39399c a(GroupClearanceInternalAction groupClearanceInternalAction, C39399c c39399c) {
        int iIndexOf;
        GroupClearanceInternalAction groupClearanceInternalAction2 = groupClearanceInternalAction;
        C39399c c39399c2 = c39399c;
        if (!(groupClearanceInternalAction2 instanceof GroupClearanceInternalAction.SetClearances)) {
            return groupClearanceInternalAction2 instanceof GroupClearanceInternalAction.ResetSelectionAndLeave ? new C39399c(null, c39399c2.f392967c, false, 0.5f, false) : c39399c2;
        }
        GroupClearanceInternalAction.SetClearances setClearances = (GroupClearanceInternalAction.SetClearances) groupClearanceInternalAction2;
        if (setClearances.f265519b instanceof a.e) {
            this.f265529d++;
        } else {
            this.f265529d = 0;
        }
        boolean z12 = this.f265529d == 3;
        if (z12) {
            this.f265529d = 0;
            String strA = this.f265528c.a();
            EasterEggType[] easterEggTypeArr = EasterEggType.f90011b;
            this.f265527b.c(new C40654a(strA, "filter_clearance_godzilla", null, 4, null));
        }
        com.avito.android.select.group_clearance_select.a aVar = setClearances.f265519b;
        boolean z13 = aVar != null;
        ?? r52 = setClearances.f265520c;
        float size = 0.5f;
        if (aVar != null && (iIndexOf = r52.indexOf(aVar)) != -1) {
            size = iIndexOf / (r52.size() - 1);
        }
        return new C39399c(aVar, r52, z13, size, z12);
    }
}
