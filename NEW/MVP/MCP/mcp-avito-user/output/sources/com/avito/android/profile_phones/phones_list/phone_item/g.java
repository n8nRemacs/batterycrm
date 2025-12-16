package com.avito.android.profile_phones.phones_list.phone_item;

import android.view.View;
import com.avito.android.profile_settings_basic.adapter.basic_info.s;
import com.avito.android.profile_settings_basic.adapter.error_item.h;
import com.avito.android.profile_settings_extended.adapter.about.j;
import com.avito.android.profile_settings_extended.adapter.banner.k;
import com.avito.android.profile_settings_extended.adapter.carousel.m;
import com.avito.android.profile_settings_extended.adapter.link_edit.i;
import com.avito.android.promo_snippet.PromoSnippetList;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f228160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f228161c;

    public /* synthetic */ g(int i12, Y41.a aVar) {
        this.f228160b = i12;
        this.f228161c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.a aVar = this.f228161c;
        switch (this.f228160b) {
            case 0:
                int i12 = PhoneListItemView.f228145c;
                aVar.invoke();
                break;
            case 1:
                int i13 = s.f228645k;
                aVar.invoke();
                break;
            case 2:
                int i14 = h.f228663c;
                aVar.invoke();
                break;
            case 3:
                int i15 = com.avito.android.profile_settings_basic.adapter.verification_item.h.f228727g;
                aVar.invoke();
                break;
            case 4:
                int i16 = j.f229117m;
                aVar.invoke();
                break;
            case 5:
                int i17 = k.f229194m;
                aVar.invoke();
                break;
            case 6:
                int i18 = m.f229334p;
                aVar.invoke();
                break;
            case 7:
                int i19 = m.f229334p;
                aVar.invoke();
                break;
            case 8:
                int i22 = com.avito.android.profile_settings_extended.adapter.count.g.f229381f;
                aVar.invoke();
                break;
            case 9:
                int i23 = com.avito.android.profile_settings_extended.adapter.gallery.appending.h.f229400d;
                aVar.invoke();
                break;
            case 10:
                int i24 = com.avito.android.profile_settings_extended.adapter.gallery.image.h.f229438i;
                aVar.invoke();
                break;
            case 11:
                int i25 = com.avito.android.profile_settings_extended.adapter.geo.m.f229472h;
                aVar.invoke();
                break;
            case 12:
                int i26 = com.avito.android.profile_settings_extended.adapter.geo_v2.footer.d.f229500d;
                aVar.invoke();
                break;
            case 13:
                int i27 = com.avito.android.profile_settings_extended.adapter.item_selections.adapter.create.h.f229547d;
                aVar.invoke();
                break;
            case 14:
                int i28 = com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.h.f229578q;
                aVar.invoke();
                break;
            case 15:
                int i29 = i.f229666i;
                aVar.invoke();
                break;
            case 16:
                int i32 = i.f229666i;
                aVar.invoke();
                break;
            case 17:
                int i33 = com.avito.android.profile_settings_extended.adapter.popup_banner.g.f229751e;
                aVar.invoke();
                break;
            case 18:
                int i34 = com.avito.android.profile_settings_extended.adapter.re_agent_empty_info_banner.g.f229772e;
                aVar.invoke();
                break;
            case 19:
                int i35 = com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner.h.f229796f;
                aVar.invoke();
                break;
            case 20:
                int i36 = com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner.h.f229796f;
                aVar.invoke();
                break;
            case 21:
                int i37 = com.avito.android.profile_settings_extended.adapter.select.g.f229836f;
                aVar.invoke();
                break;
            case 22:
                int i38 = com.avito.android.profile_settings_extended.adapter.universal.create.h.f229898d;
                aVar.invoke();
                break;
            case 23:
                int i39 = com.avito.android.profile_settings_extended.adapter.universal.section.k.f229945k;
                aVar.invoke();
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i42 = com.avito.android.profile_settings_extended.adapter.universal.section.k.f229945k;
                aVar.invoke();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i43 = com.avito.android.profile_settings_extended.adapter.universal.section.k.f229945k;
                aVar.invoke();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i44 = com.avito.android.profile_settings_extended.adapter.universal.section.k.f229945k;
                aVar.invoke();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                aVar.invoke();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i45 = PromoSnippetList.f231706h;
                aVar.invoke();
                break;
            default:
                int i46 = PromoSnippetList.f231706h;
                aVar.invoke();
                break;
        }
    }
}
