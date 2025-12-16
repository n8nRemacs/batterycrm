package com.avito.android.select.group_clearance_select.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.select.group_clearance_select.mvi.entity.GroupClearanceInternalAction;
import cq0.InterfaceC39398b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GroupClearanceOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select/group_clearance_select/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction;", "Lcq0/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements t<GroupClearanceInternalAction, InterfaceC39398b> {
    @Inject
    public h() {
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC39398b b(GroupClearanceInternalAction groupClearanceInternalAction) {
        GroupClearanceInternalAction groupClearanceInternalAction2 = groupClearanceInternalAction;
        if (groupClearanceInternalAction2 instanceof GroupClearanceInternalAction.LeaveWithoutChanges) {
            return InterfaceC39398b.a.f392961a;
        }
        if (groupClearanceInternalAction2 instanceof GroupClearanceInternalAction.ResetSelectionAndLeave) {
            return InterfaceC39398b.C10992b.f392962a;
        }
        if (groupClearanceInternalAction2 instanceof GroupClearanceInternalAction.OnSubmitClicked) {
            return new InterfaceC39398b.c(((GroupClearanceInternalAction.OnSubmitClicked) groupClearanceInternalAction2).f265517b);
        }
        return null;
    }
}
