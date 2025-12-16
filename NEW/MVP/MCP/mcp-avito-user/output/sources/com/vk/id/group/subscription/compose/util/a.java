package com.vk.id.group.subscription.compose.util;

import Y41.q;
import android.content.Context;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.unit.C22712b;
import com.vk.id.group.subscription.common.style.GroupSubscriptionButtonsCornersStyle;
import com.vk.id.group.subscription.common.style.GroupSubscriptionButtonsSizeStyle;
import com.vk.id.group.subscription.common.style.GroupSubscriptionSheetCornersStyle;
import com.vk.id.group.subscription.xml.GroupSubscriptionAttrsKt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f366955c;

    public /* synthetic */ a(Object obj, int i12) {
        this.f366954b = i12;
        this.f366955c = obj;
    }

    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f366954b) {
            case 0:
                return TightWrapTextKt.TightWrapText_pNBRTJQ$lambda$7$lambda$6((InterfaceC22204y1) this.f366955c, (InterfaceC22369k0) obj, (InterfaceC22363h0) obj2, (C22712b) obj3);
            default:
                return GroupSubscriptionAttrsKt.vkidInternalGetGroupSubscriptionStyleConstructor$lambda$0((Context) this.f366955c, (GroupSubscriptionSheetCornersStyle) obj, (GroupSubscriptionButtonsCornersStyle) obj2, (GroupSubscriptionButtonsSizeStyle) obj3);
        }
    }
}
