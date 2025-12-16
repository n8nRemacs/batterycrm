package com.vk.id.group.subscription.compose.ui;

import Y41.p;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.A;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetStatus;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class e implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366901b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupSubscriptionStyle f366902c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a f366903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GroupSubscriptionSheetState f366904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y41.l f366905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f366906g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f366907h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f366908i;

    public /* synthetic */ e(Y41.l lVar, Y41.l lVar2, GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, GroupSubscriptionSheetStatus.Loaded loaded, Y41.a aVar, int i12) {
        this.f366905f = lVar;
        this.f366908i = lVar2;
        this.f366902c = groupSubscriptionStyle;
        this.f366904e = groupSubscriptionSheetState;
        this.f366906g = loaded;
        this.f366903d = aVar;
        this.f366907h = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f366901b) {
            case 0:
                A a12 = (A) obj;
                int iIntValue = ((Integer) obj2).intValue();
                return GroupSubscriptionSheetKt.DataState$lambda$51(this.f366902c, this.f366904e, (GroupSubscriptionSheetStatusData) this.f366908i, this.f366905f, this.f366903d, (p) this.f366906g, this.f366907h, a12, iIntValue);
            case 1:
                A a13 = (A) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                return GroupSubscriptionSheetKt.DataStateButtons$lambda$54((J) this.f366908i, this.f366902c, this.f366903d, this.f366904e, this.f366905f, (p) this.f366906g, this.f366907h, a13, iIntValue2);
            default:
                return GroupSubscriptionSheetKt.LoadedState$lambda$40(this.f366905f, (Y41.l) this.f366908i, this.f366902c, this.f366904e, (GroupSubscriptionSheetStatus.Loaded) this.f366906g, this.f366903d, this.f366907h, (A) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ e(J j12, GroupSubscriptionStyle groupSubscriptionStyle, Y41.a aVar, GroupSubscriptionSheetState groupSubscriptionSheetState, Y41.l lVar, p pVar, int i12) {
        this.f366908i = j12;
        this.f366902c = groupSubscriptionStyle;
        this.f366903d = aVar;
        this.f366904e = groupSubscriptionSheetState;
        this.f366905f = lVar;
        this.f366906g = pVar;
        this.f366907h = i12;
    }

    public /* synthetic */ e(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, Y41.l lVar, Y41.a aVar, p pVar, int i12) {
        this.f366902c = groupSubscriptionStyle;
        this.f366904e = groupSubscriptionSheetState;
        this.f366908i = groupSubscriptionSheetStatusData;
        this.f366905f = lVar;
        this.f366903d = aVar;
        this.f366906g = pVar;
        this.f366907h = i12;
    }
}
