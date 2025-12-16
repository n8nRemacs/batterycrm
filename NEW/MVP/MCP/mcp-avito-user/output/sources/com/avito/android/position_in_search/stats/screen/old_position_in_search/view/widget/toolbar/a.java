package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar;

import Db0.InterfaceC13382a;
import Eg0.InterfaceC13484a;
import K90.a;
import Rm0.InterfaceC15059a;
import Sh0.InterfaceC15186a;
import Ua0.InterfaceC15503a;
import Zc0.InterfaceC19538a;
import ad0.InterfaceC19870a;
import android.view.View;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.k;
import com.avito.android.profile.remove.ProfileRemoveActivity;
import com.avito.android.profile.remove.i;
import com.avito.android.profile.user_profile.D;
import com.avito.android.profile_management_core.images.entity.h;
import com.avito.android.profile_phones.phones_list.DialogC33420e;
import com.avito.android.profile_settings.p;
import com.avito.android.profile_vk_linking.start.n;
import com.avito.android.promoblock.l;
import com.avito.android.publish.date_picker.e;
import com.avito.android.publish.date_picker.f;
import com.avito.android.publish.iac_devices.j;
import com.avito.android.publish.iac_for_pro.c;
import com.avito.android.publish.realty_address_submission.RealtyAddressSubmissionBottomSheetDialog;
import com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog;
import com.avito.android.rating.details.text_sheet.TextSheetDialog;
import com.avito.android.rating.details.text_sheet.d;
import com.avito.android.rating.user_contacts.UserContactsActivity;
import com.avito.android.rating.user_contacts.mvi.entity.a;
import com.avito.android.rating.user_contacts.mvi.entity.b;
import com.avito.android.rating_form.RatingFormActivity;
import com.avito.android.rating_form.select_item.RatingFormSelectItemFragment;
import com.avito.android.registration_self_employment_redirect_screen.ui.SelfEmploymentRedirectRenderer;
import com.avito.android.related_products.bottom_sheet.RelatedProductsPageFragment;
import com.avito.android.reputation.ui.ReputationFragment;
import com.avito.android.util.N0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import fh0.InterfaceC40422a;
import java.util.GregorianCalendar;
import kotlin.G0;
import wf0.InterfaceC49616a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f221305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f221306c;

    public /* synthetic */ a(Object obj, int i12) {
        this.f221305b = i12;
        this.f221306c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r9v20, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.a<G0> aVar;
        k<?> thirdWheelValue;
        k<?> secondWheelValue;
        k<?> firstWheelValue;
        lValueOf = null;
        Long lValueOf = null;
        Object obj = this.f221306c;
        switch (this.f221305b) {
            case 0:
                b bVar = ((SearchPositionToolbar) obj).f221304h;
                if (bVar != null && (aVar = bVar.f221309c) != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 1:
                i iVar = ((ProfileRemoveActivity) obj).f223758m;
                (iVar != null ? iVar : null).accept(a.d.f9285a);
                break;
            case 2:
                ((D) obj).f224200d.accept(InterfaceC15503a.o.f16464a);
                break;
            case 3:
                h hVar = (h) obj;
                hVar.f226718d.invoke(hVar.f226717c);
                break;
            case 4:
                int i12 = DialogC33420e.f227734K;
                ((DialogC33420e) obj).r();
                break;
            case 5:
                ((p) obj).f228497a.accept(InterfaceC13382a.C0171a.f3253a);
                break;
            case 6:
                ((com.avito.android.profile_vk_linking.request_token.k) obj).f231360b.accept(InterfaceC19538a.C1441a.f20290a);
                break;
            case 7:
                ((n) obj).f231487c.accept(InterfaceC19870a.C1500a.f21083a);
                break;
            case 8:
                ((l) obj).f231804i.accept(G0.f406611a);
                break;
            case 9:
                e eVar = (e) obj;
                com.avito.android.publish.date_picker.h hVar2 = eVar.f232495J;
                if (hVar2 == null) {
                    hVar2 = null;
                }
                Picker picker = hVar2.f232506d;
                k<?> firstWheelValue2 = picker.getFirstWheelValue();
                k<?> secondWheelValue2 = picker.getSecondWheelValue();
                if (firstWheelValue2 != null && secondWheelValue2 != null) {
                    GregorianCalendar gregorianCalendar = hVar2.f232503a;
                    gregorianCalendar.set(2, ((Integer) firstWheelValue2.f180046a).intValue());
                    gregorianCalendar.set(1, ((Integer) secondWheelValue2.f180046a).intValue());
                    gregorianCalendar.set(5, gregorianCalendar.getActualMinimum(5));
                    lValueOf = Long.valueOf(gregorianCalendar.getTimeInMillis());
                }
                if (lValueOf != null) {
                    eVar.f232494I.invoke(Long.valueOf(lValueOf.longValue()));
                }
                eVar.r();
                break;
            case 10:
                f fVar = (f) obj;
                Picker picker2 = fVar.f232501G;
                Integer num = (picker2 == null || (firstWheelValue = picker2.getFirstWheelValue()) == null) ? null : firstWheelValue.f180046a;
                Integer num2 = num instanceof Integer ? num : null;
                Picker picker3 = fVar.f232501G;
                Integer num3 = (picker3 == null || (secondWheelValue = picker3.getSecondWheelValue()) == null) ? null : secondWheelValue.f180046a;
                Integer num4 = num3 instanceof Integer ? num3 : null;
                Picker picker4 = fVar.f232501G;
                Integer num5 = (picker4 == null || (thirdWheelValue = picker4.getThirdWheelValue()) == null) ? null : thirdWheelValue.f180046a;
                Integer num6 = num5 instanceof Integer ? num5 : null;
                GregorianCalendar gregorianCalendar2 = fVar.f232502H;
                if (num2 != null) {
                    gregorianCalendar2.set(5, num2.intValue());
                }
                if (num4 != null) {
                    gregorianCalendar2.set(2, num4.intValue());
                }
                if (num6 != null) {
                    gregorianCalendar2.set(1, num6.intValue());
                }
                fVar.f232500F.invoke(Long.valueOf(gregorianCalendar2.getTimeInMillis()));
                fVar.r();
                break;
            case 11:
                int i13 = com.avito.android.publish.iac_devices.a.f236033E;
                ((com.avito.android.publish.iac_devices.a) obj).dismiss();
                break;
            case 12:
                int i14 = com.avito.android.publish.iac_devices.b.f236034E;
                ((com.avito.android.publish.iac_devices.b) obj).dismiss();
                break;
            case 13:
                j jVar = (j) obj;
                jVar.f236049E.invoke(jVar.f236050F);
                jVar.dismiss();
                break;
            case 14:
                int i15 = c.f236060E;
                ((c) obj).dismiss();
                break;
            case 15:
                com.avito.android.publish.items.iac_for_pro_enabled.i iVar2 = (com.avito.android.publish.items.iac_for_pro_enabled.i) obj;
                iVar2.f236957f.invoke(Boolean.valueOf(iVar2.f236954c.isChecked()));
                break;
            case 16:
                RealtyAddressSubmissionBottomSheetDialog.a aVar2 = RealtyAddressSubmissionBottomSheetDialog.f239040k0;
                ((com.avito.android.publish.realty_address_submission.c) obj).r();
                break;
            case 17:
                com.avito.android.publish.screen.step.params.view.j jVar2 = (com.avito.android.publish.screen.step.params.view.j) obj;
                com.avito.android.lib.design.tooltip.k kVar = jVar2.f241622t;
                if (kVar != null) {
                    kVar.dismiss();
                }
                jVar2.f241622t = null;
                break;
            case 18:
                com.avito.android.publish.slots.delivery_all_toggles.item.c cVar = (com.avito.android.publish.slots.delivery_all_toggles.item.c) obj;
                Boolean boolValueOf = Boolean.valueOf(cVar.f243486J.isChecked());
                Y41.p<String, Boolean, G0> pVar = cVar.f243481E;
                pVar.invoke("deliveryPvz", boolValueOf);
                pVar.invoke("deliveryCourier", Boolean.valueOf(cVar.f243487K.isChecked()));
                pVar.invoke("deliveryPostamat", Boolean.valueOf(cVar.f243488L.isChecked()));
                pVar.invoke("deliveryDbs", Boolean.valueOf(cVar.f243489M.isChecked()));
                pVar.invoke("deliveryDbsCourier", Boolean.valueOf(cVar.f243490N.isChecked()));
                cVar.f243482F.invoke();
                N0.a(cVar);
                break;
            case 19:
                SleepingPlacesBedTypesDialog.a aVar3 = SleepingPlacesBedTypesDialog.f244929m0;
                SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog = (SleepingPlacesBedTypesDialog) obj;
                Integer num7 = sleepingPlacesBedTypesDialog.f5().getState().getValue().f441727b;
                if (num7 != null) {
                    sleepingPlacesBedTypesDialog.f5().accept(new InterfaceC49616a.b(num7.intValue()));
                    break;
                }
                break;
            case 20:
                TextSheetDialog.a aVar4 = TextSheetDialog.f247525s0;
                ((d) ((TextSheetDialog) obj).f247527i0.getValue()).accept(InterfaceC13484a.b.f4139a);
                break;
            case 21:
                UserContactsActivity.a aVar5 = UserContactsActivity.f247653z;
                ((UserContactsActivity) obj).a2().accept(new a.e(b.InterfaceC7440b.a.f247814a));
                break;
            case 22:
                RatingFormActivity.a aVar6 = RatingFormActivity.f247887w;
                ((RatingFormActivity) obj).onBackPressed();
                break;
            case 23:
                RatingFormSelectItemFragment.a aVar7 = RatingFormSelectItemFragment.f248870z0;
                ((RatingFormSelectItemFragment) obj).q5().accept(InterfaceC40422a.C11168a.f396041a);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                ((com.avito.android.re_agent_landing.landing.d) obj).f250574a.invoke(InterfaceC15186a.e.f15117a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((com.avito.android.realty_agency.inline_filters.district.e) obj).f251585c.invoke();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((com.avito.android.referral_contacts.ui.f) obj).f252591b.invoke();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((SelfEmploymentRedirectRenderer) obj).f252800d.invoke();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Y41.a<G0> aVar8 = ((RelatedProductsPageFragment) obj).f252838v0;
                if (aVar8 != null) {
                    aVar8.invoke();
                    break;
                }
                break;
            default:
                ReputationFragment.a aVar9 = ReputationFragment.f254766A0;
                ((ReputationFragment) obj).s5().accept(InterfaceC15059a.c.f14607a);
                break;
        }
    }
}
