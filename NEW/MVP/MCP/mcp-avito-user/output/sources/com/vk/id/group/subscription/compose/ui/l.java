package com.vk.id.group.subscription.compose.ui;

import Y41.p;
import androidx.compose.runtime.A;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class l implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupSubscriptionStyle f366941c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GroupSubscriptionSheetState f366942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y41.l f366943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y41.a f366944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f366945g;

    public /* synthetic */ l(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, Y41.l lVar, Y41.a aVar, int i12, int i13) {
        this.f366940b = i13;
        this.f366941c = groupSubscriptionStyle;
        this.f366942d = groupSubscriptionSheetState;
        this.f366943e = lVar;
        this.f366944f = aVar;
        this.f366945g = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f366940b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return GroupSubscriptionSheetKt.FailureState$lambda$45(this.f366941c, this.f366942d, this.f366943e, this.f366944f, this.f366945g, (A) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return GroupSubscriptionSheetKt.ResubscribingState$lambda$44(this.f366941c, this.f366942d, this.f366943e, this.f366944f, this.f366945g, (A) obj, iIntValue2);
        }
    }
}
