package com.avito.android.lib.design.list_item;

import android.view.View;
import com.avito.android.lib.design.modal.f;
import com.avito.android.lib.design.modal.i;
import com.avito.android.lib.design.select.Select;
import com.avito.android.lib.design.tooltip.k;
import com.avito.android.loyalty.ui.badge_details_v3.items.error.h;
import com.avito.android.map_core.view.zoom.ZoomButton;
import com.avito.android.messenger.channels.adapter.konveyor.iac_problem_banner.p;
import com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.j;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f179574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f179575c;

    public /* synthetic */ a(int i12, Y41.a aVar) {
        this.f179574b = i12;
        this.f179575c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.a aVar = this.f179575c;
        switch (this.f179574b) {
            case 0:
                int i12 = BaseListItem.f179488m;
                aVar.invoke();
                break;
            case 1:
                int i13 = BaseListItem.f179488m;
                aVar.invoke();
                break;
            case 2:
                int i14 = BaseListItem.f179488m;
                aVar.invoke();
                break;
            case 3:
                int i15 = ListItem.f179506t;
                aVar.invoke();
                break;
            case 4:
                int i16 = ListItem.f179506t;
                aVar.invoke();
                break;
            case 5:
                int i17 = ListItemCheckbox.f179513B;
                aVar.invoke();
                break;
            case 6:
                int i18 = ListItemCheckmark.f179533x;
                aVar.invoke();
                break;
            case 7:
                int i19 = ListItemRadio.f179549A;
                aVar.invoke();
                break;
            case 8:
                int i22 = ListItemSwitcher.f179564z;
                aVar.invoke();
                break;
            case 9:
                int i23 = f.f179741G;
                aVar.invoke();
                break;
            case 10:
                int i24 = i.f179776H;
                aVar.invoke();
                break;
            case 11:
                int i25 = Select.f180249i0;
                aVar.invoke();
                break;
            case 12:
                int i26 = k.f181215q;
                aVar.invoke();
                break;
            case 13:
                int i27 = k.f181215q;
                aVar.invoke();
                break;
            case 14:
                int i28 = k.f181215q;
                aVar.invoke();
                break;
            case 15:
                int i29 = h.f183304c;
                aVar.invoke();
                break;
            case 16:
                int i32 = com.avito.android.loyalty.ui.items.action.i.f183652c;
                aVar.invoke();
                break;
            case 17:
                int i33 = com.avito.android.loyalty.ui.items.collapse.h.f183677d;
                aVar.invoke();
                break;
            case 18:
                int i34 = com.avito.android.loyalty.ui.quality_service.items.faq.h.f183864f;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 19:
                int i35 = com.avito.android.loyalty.ui.quality_service.items.faq.h.f183864f;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 20:
                int i36 = ZoomButton.f185826d;
                aVar.invoke();
                break;
            case 21:
                int i37 = ZoomButton.f185826d;
                aVar.invoke();
                break;
            case 22:
                int i38 = com.avito.android.master_plan.adapter.info.h.f186008c;
                aVar.invoke();
                break;
            case 23:
                int i39 = p.f186967d;
                aVar.invoke();
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i42 = p.f186967d;
                aVar.invoke();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i43 = j.f186995c;
                aVar.invoke();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i44 = j.f186995c;
                aVar.invoke();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                aVar.invoke();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                aVar.invoke();
                break;
            default:
                aVar.invoke();
                break;
        }
    }
}
