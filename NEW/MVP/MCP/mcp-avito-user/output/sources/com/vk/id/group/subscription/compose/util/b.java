package com.vk.id.group.subscription.compose.util;

import Y41.l;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.text.o0;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.xml.GroupSubscriptionSheet;
import com.vk.id.group.subscription.xml.GroupSubscriptionSnackbarHost;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f366957c;

    public /* synthetic */ b(int i12, InterfaceC22204y1 interfaceC22204y1) {
        this.f366956b = i12;
        this.f366957c = interfaceC22204y1;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        switch (this.f366956b) {
            case 0:
                return TightWrapTextKt.TightWrapText_pNBRTJQ$lambda$9$lambda$8(this.f366957c, (o0) obj);
            case 1:
                return GroupSubscriptionSheet.Content$lambda$10$lambda$9(this.f366957c, (String) obj);
            case 2:
                return GroupSubscriptionSheet.Content$lambda$15$lambda$14(this.f366957c, (GroupSubscriptionSnackbarHost) obj);
            case 3:
                return GroupSubscriptionSheet.Content$lambda$20$lambda$19(this.f366957c, (GroupSubscriptionStyle) obj);
            default:
                return GroupSubscriptionSnackbarHost.Content$lambda$6$lambda$5(this.f366957c, (GroupSubscriptionStyle) obj);
        }
    }
}
