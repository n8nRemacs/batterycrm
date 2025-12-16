package com.vk.id.group.subscription.compose.ui;

import Y41.p;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.A;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetStatus;
import com.vk.id.group.subscription.compose.util.PrimaryButtonKt;
import com.vk.id.group.subscription.compose.util.SecondaryButtonKt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class k implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f366935c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f366936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f366937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f366938f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f366939g;

    public /* synthetic */ k(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, GroupSubscriptionSheetStatus.Subscribing subscribing, Y41.l lVar, int i12) {
        this.f366934b = 1;
        this.f366938f = groupSubscriptionStyle;
        this.f366935c = groupSubscriptionSheetState;
        this.f366939g = subscribing;
        this.f366936d = lVar;
        this.f366937e = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f366934b) {
            case 0:
                A a12 = (A) obj;
                int iIntValue = ((Integer) obj2).intValue();
                return GroupSubscriptionSheetKt.DataStateHeader$lambda$69((J) this.f366938f, (Y41.l) this.f366936d, (GroupSubscriptionSheetState) this.f366935c, (GroupSubscriptionSheetStatusData) this.f366939g, this.f366937e, a12, iIntValue);
            case 1:
                return GroupSubscriptionSheetKt.SubscribingState$lambda$43((GroupSubscriptionStyle) this.f366938f, (GroupSubscriptionSheetState) this.f366935c, (GroupSubscriptionSheetStatus.Subscribing) this.f366939g, (Y41.l) this.f366936d, this.f366937e, (A) obj, ((Integer) obj2).intValue());
            case 2:
                return PrimaryButtonKt.PrimaryButton$lambda$0((GroupSubscriptionStyle) this.f366938f, (String) this.f366936d, (Y41.a) this.f366935c, (p) this.f366939g, this.f366937e, (A) obj, ((Integer) obj2).intValue());
            default:
                return SecondaryButtonKt.SecondaryButton$lambda$0((GroupSubscriptionStyle) this.f366938f, (String) this.f366936d, (String) this.f366935c, (Y41.a) this.f366939g, this.f366937e, (A) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, Object obj4, int i12, int i13) {
        this.f366934b = i13;
        this.f366938f = obj;
        this.f366936d = obj2;
        this.f366935c = obj3;
        this.f366939g = obj4;
        this.f366937e = i12;
    }
}
