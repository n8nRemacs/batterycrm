package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link;

import Gy0.InterfaceC13931a;
import M90.a;
import Sh0.InterfaceC15186a;
import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.profile_settings_extended.adapter.about.g;
import com.avito.android.profile_settings_extended.adapter.carousel.j;
import com.avito.android.profile_settings_extended.adapter.phones.i;
import com.avito.android.publish.objects.C33975x;
import com.avito.android.publish.objects.ObjectFillFormFragment;
import com.avito.android.publish.slots.market_price_v2.item.n;
import com.avito.android.rating_form.step.RatingFormStepFragment;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.a;
import com.avito.android.safety.password_change.PasswordChangeFragment;
import com.avito.android.safety.sessions.info.o;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import eA0.InterfaceC39979a;
import ih0.InterfaceC41402a;
import kotlin.G0;
import kotlin.jvm.internal.C42822w;
import yc0.k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class e implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f221137b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f221138c;

    public /* synthetic */ e(com.avito.android.publish_limits_info.item.f fVar, com.avito.android.publish_limits_info.item.a aVar) {
        this.f221137b = 16;
        this.f221138c = fVar;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        C42822w c42822w = null;
        Object obj = this.f221138c;
        switch (this.f221137b) {
            case 0:
                a aVar = ((f) obj).f221142e;
                if (aVar != null) {
                    aVar.f221133e.invoke(aVar.f221131c, deepLink);
                    return;
                }
                return;
            case 1:
                ((com.avito.android.profile.remove.screen.items.text.e) obj).f224136b.invoke(new a.b(deepLink));
                return;
            case 2:
                ((com.avito.android.profile.remove.screen.items.text_area_item.e) obj).f224148b.invoke(new a.b(deepLink));
                return;
            case 3:
                ((g) obj).f229115b.invoke(new k.a(deepLink));
                return;
            case 4:
                ((com.avito.android.profile_settings_extended.adapter.banner.g) obj).f229190b.invoke(new k.a(deepLink));
                return;
            case 5:
                ((j) obj).f229332b.invoke(new k.a(deepLink));
                return;
            case 6:
                ((com.avito.android.profile_settings_extended.adapter.gallery.gallery_header.e) obj).f229413b.invoke(new k.a(deepLink));
                return;
            case 7:
                ((com.avito.android.profile_settings_extended.adapter.link_edit.f) obj).f229664b.invoke(new k.a(deepLink));
                return;
            case 8:
                ((i) obj).f229711b.invoke(new k.a(deepLink));
                return;
            case 9:
                ((com.avito.android.publish.items.atributed_text.e) obj).f236776b.accept(deepLink);
                return;
            case 10:
                ((com.avito.android.publish.items.iac_for_pro_enabled.f) obj).f236951c.accept(deepLink);
                return;
            case 11:
                ObjectFillFormFragment objectFillFormFragment = ((C33975x) obj).f238130e0;
                if (objectFillFormFragment != null) {
                    objectFillFormFragment.K2(deepLink, null);
                    return;
                }
                return;
            case 12:
                ((com.avito.android.publish.screen.objects.domain.repository.g) obj).f240036n.K5(deepLink);
                return;
            case 13:
                com.avito.android.publish.slots.imv.item.d dVar = (com.avito.android.publish.slots.imv.item.d) obj;
                dVar.f244275b.d0();
                dVar.f244277d.accept(deepLink);
                return;
            case 14:
                ((com.avito.android.publish.slots.information_with_user_id.a) obj).f244322c.accept(deepLink);
                return;
            case 15:
                ((n) obj).f244583g.accept(deepLink);
                return;
            case 16:
                throw null;
            case 17:
                RatingFormStepFragment.a aVar2 = RatingFormStepFragment.f249120R0;
                ((RatingFormStepFragment) obj).r5().accept(new InterfaceC41402a.p(deepLink));
                return;
            case 18:
                ((com.avito.android.re_agent_landing.landing.flows_dialog.e) obj).f250660a.invoke(new a.c(deepLink));
                return;
            case 19:
                ((com.avito.android.re_agent_landing.landing.items.question.e) obj).f250785b.invoke(new InterfaceC15186a.b(deepLink, false, 2, c42822w));
                return;
            case 20:
                PasswordChangeFragment.a aVar3 = PasswordChangeFragment.f257203H0;
                ((PasswordChangeFragment) obj).i7(deepLink);
                return;
            case 21:
                ((o) obj).f257986e.accept(deepLink);
                return;
            case 22:
                ((com.avito.android.services_realty_sheet.c) obj).f280408F.invoke(deepLink);
                return;
            case 23:
                l<? super DeepLink, G0> lVar = ((com.avito.android.services_transportation_widget.item.k) obj).f280662j;
                if (lVar != null) {
                    lVar.invoke(deepLink);
                    return;
                }
                return;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                ((com.avito.android.short_term_rent.bookingform.items.text.e) obj).f281681b.invoke(deepLink);
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((com.avito.android.str_calendar.seller.calandar_parameters.items.chips.c) obj).f287098b.invoke(new InterfaceC13931a.j(deepLink));
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((com.avito.android.str_calendar.seller.calandar_parameters.items.disclaimer.f) obj).f287133b.invoke(new InterfaceC13931a.n(deepLink));
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.g) obj).f287280b.invoke(new InterfaceC13931a.j(deepLink));
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((com.avito.android.success.konveyor.service.d) obj).f291653c.invoke(new InterfaceC39979a.C11056a(deepLink));
                return;
            default:
                ((com.avito.android.success.konveyor.title.d) obj).f291663c.invoke(new InterfaceC39979a.C11056a(deepLink));
                return;
        }
    }

    public /* synthetic */ e(Object obj, int i12) {
        this.f221137b = i12;
        this.f221138c = obj;
    }
}
