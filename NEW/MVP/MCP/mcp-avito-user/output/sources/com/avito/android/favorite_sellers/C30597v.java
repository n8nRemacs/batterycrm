package com.avito.android.favorite_sellers;

import FC.a;
import Ju.AbstractC14250d;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.messenger_icebreakers_dialog.deeplink.MessengerIcebreakerDialogDeeplink;
import com.avito.android.vas_discount.VasDiscountActivity;
import com.avito.android.vas_performance.screens.applied_services.ui.AppliedServicesActivity;
import vY.InterfaceC49282a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.favorite_sellers.v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C30597v implements i.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f156141b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f156142c;

    public /* synthetic */ C30597v(Object obj, int i12) {
        this.f156141b = i12;
        this.f156142c = obj;
    }

    @Override // com.avito.android.lib.design.toast_bar.i.b
    public final void invoke() {
        Object obj = this.f156142c;
        switch (this.f156141b) {
            case 0:
                H h12 = (H) obj;
                h12.f155430d.accept(a.h.f4606a);
                h12.f155443q = null;
                break;
            case 1:
                ((com.avito.android.master_plan.r) obj).f186098e.a2().accept(InterfaceC49282a.b.f440826a);
                break;
            case 2:
                ((com.avito.android.messenger.search.D) obj).f197022j = null;
                break;
            case 3:
                ((com.avito.android.messenger_icebreakers_dialog.deeplink.a) obj).j(MessengerIcebreakerDialogDeeplink.b.c.f197554b);
                break;
            case 4:
                ((com.avito.android.multi_message_send.deeplink.c) obj).j(AbstractC14250d.c.f9171c);
                break;
            case 5:
                int i12 = VasDiscountActivity.f319603q;
                ((VasDiscountActivity) obj).finish();
                break;
            default:
                int i13 = AppliedServicesActivity.f320323o;
                ((AppliedServicesActivity) obj).finish();
                break;
        }
    }
}
