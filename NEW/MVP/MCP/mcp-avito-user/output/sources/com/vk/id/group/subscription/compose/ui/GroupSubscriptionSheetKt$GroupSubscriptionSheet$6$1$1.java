package com.vk.id.group.subscription.compose.ui;

import com.avito.android.remote.model.category_parameters.ConstraintKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: GroupSubscriptionSheet.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$1$1 extends H implements Y41.a<G0> {
    public GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$1$1(Object obj) {
        super(0, obj, GroupSubscriptionSheetState.class, ConstraintKt.CONDITION_FLOW_HIDE, "hide()V", 0);
    }

    @Override // Y41.a
    public /* bridge */ /* synthetic */ G0 invoke() {
        invoke2();
        return G0.f406611a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GroupSubscriptionSheetState) this.receiver).hide();
    }
}
