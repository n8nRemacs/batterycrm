package com.vk.id.group.subscription.compose.ui;

import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.InterfaceC22204y1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Y41.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f366884c;

    public /* synthetic */ b(int i12, InterfaceC22204y1 interfaceC22204y1) {
        this.f366883b = i12;
        this.f366884c = interfaceC22204y1;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        switch (this.f366883b) {
            case 0:
                return GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$24$lambda$23(this.f366884c, (GroupSubscriptionSheetStatus) obj);
            case 1:
                return GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$26$lambda$25(this.f366884c, ((Boolean) obj).booleanValue());
            default:
                return Boolean.valueOf(GroupSubscriptionSheetKt.rememberGroupSubscriptionSheetStateInternal$lambda$77$lambda$76(this.f366884c, (SheetValue) obj));
        }
    }
}
