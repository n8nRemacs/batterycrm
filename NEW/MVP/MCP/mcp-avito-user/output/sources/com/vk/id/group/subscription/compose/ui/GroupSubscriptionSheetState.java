package com.vk.id.group.subscription.compose.ui;

import androidx.compose.material3.Me;
import androidx.compose.runtime.F3;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GroupSubscriptionSheetState.kt */
@F3
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;", "", "Landroidx/compose/material3/Me;", "materialSheetState", "<init>", "(Landroidx/compose/material3/Me;)V", "Lkotlin/G0;", "show", "()V", ConstraintKt.CONDITION_FLOW_HIDE, "Landroidx/compose/material3/Me;", "getMaterialSheetState$group_subscription_compose_release", "()Landroidx/compose/material3/Me;", "Lkotlin/Function1;", "", "showSheet", "LY41/l;", "getShowSheet$group_subscription_compose_release", "()LY41/l;", "setShowSheet$group_subscription_compose_release", "(LY41/l;)V", "isVisible", "()Z", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GroupSubscriptionSheetState {

    @Y61.k
    private final Me materialSheetState;

    @Y61.k
    private Y41.l<? super Boolean, G0> showSheet = new P11.a(8);

    public GroupSubscriptionSheetState(@Y61.k Me me2) {
        this.materialSheetState = me2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 showSheet$lambda$0(boolean z12) {
        return G0.f406611a;
    }

    @Y61.k
    /* renamed from: getMaterialSheetState$group_subscription_compose_release, reason: from getter */
    public final Me getMaterialSheetState() {
        return this.materialSheetState;
    }

    public final void hide() {
        this.showSheet.invoke(Boolean.FALSE);
    }

    public final boolean isVisible() {
        return this.materialSheetState.d();
    }

    public final void setShowSheet$group_subscription_compose_release(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.showSheet = lVar;
    }

    public final void show() {
        this.showSheet.invoke(Boolean.TRUE);
    }
}
