package com.vk.id.group.subscription.compose.ui;

import Y41.p;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.A;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class j implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f366930c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GroupSubscriptionStyle f366931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GroupSubscriptionSheetStatusData f366932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f366933f;

    public /* synthetic */ j(J j12, GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, int i12, int i13) {
        this.f366929b = i13;
        this.f366930c = j12;
        this.f366931d = groupSubscriptionStyle;
        this.f366932e = groupSubscriptionSheetStatusData;
        this.f366933f = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f366929b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData = this.f366932e;
                int i12 = this.f366933f;
                return GroupSubscriptionSheetKt.DataStateLabels$lambda$64(this.f366930c, this.f366931d, groupSubscriptionSheetStatusData, i12, (A) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData2 = this.f366932e;
                int i13 = this.f366933f;
                return GroupSubscriptionSheetKt.DataStateSubscribers$lambda$60(this.f366930c, this.f366931d, groupSubscriptionSheetStatusData2, i13, (A) obj, iIntValue2);
        }
    }
}
