package com.avito.android.publish.details;

import android.content.Intent;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.publish.details.K1;
import com.avito.android.publish.details.PublishDetailsFragment;
import com.avito.android.publish.details.iac.IacPermissionRequestSource;
import com.avito.android.publish.details.seller_protection.SellerProtectionBottomSheet;
import com.avito.android.publish.realty_address_submission.RealtyAddressSubmissionActivity;
import com.avito.android.publish.slots.contact_info.d;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.publish.details.v0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C33796v0 implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PublishDetailsFragment f235074b;

    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(Object obj) {
        InterfaceC33777o1 interfaceC33777o1;
        String shortTitle;
        Intent intentC;
        K1.AbstractC33668b abstractC33668b = (K1.AbstractC33668b) obj;
        PublishDetailsFragment.a aVar = PublishDetailsFragment.f233085Y2;
        boolean z12 = abstractC33668b instanceof K1.AbstractC33668b.C7076b;
        PublishDetailsFragment publishDetailsFragment = this.f235074b;
        if (z12) {
            com.avito.android.publish.confirmation_dialog.c.a(publishDetailsFragment, ((K1.AbstractC33668b.C7076b) abstractC33668b).f233017a, new PublishDetailsFragment.e(publishDetailsFragment, abstractC33668b));
            return;
        }
        if (abstractC33668b instanceof K1.AbstractC33668b.e) {
            publishDetailsFragment.E0();
            return;
        }
        if (abstractC33668b instanceof K1.AbstractC33668b.f) {
            publishDetailsFragment.K2(((K1.AbstractC33668b.f) abstractC33668b).f233026a, null);
            return;
        }
        if (abstractC33668b instanceof K1.AbstractC33668b.g) {
            d.b bVar = ((K1.AbstractC33668b.g) abstractC33668b).f233027a;
            com.avito.android.phone_confirmation.P p12 = publishDetailsFragment.f233091H0;
            if (p12 == null) {
                p12 = null;
            }
            Intent intentA = p12.a(bVar.f243241a, bVar.f243242b, bVar.f243243c, false);
            com.avito.android.publish.view.result_handler.a aVar2 = publishDetailsFragment.f245620B0;
            (aVar2 != null ? aVar2 : null).c(publishDetailsFragment.l1(), publishDetailsFragment, intentA, 5, false);
            return;
        }
        if (abstractC33668b instanceof K1.AbstractC33668b.h) {
            K1.AbstractC33668b.h hVar = (K1.AbstractC33668b.h) abstractC33668b;
            String str = hVar.f233028a;
            boolean z13 = hVar.f233031d;
            String str2 = hVar.f233029b;
            String str3 = hVar.f233030c;
            if (z13) {
                com.avito.android.phone_reverification_info.d dVar = publishDetailsFragment.f233094I0;
                if (dVar == null) {
                    dVar = null;
                }
                intentC = dVar.b(str, str2, str3);
            } else {
                com.avito.android.phone_reverification_info.d dVar2 = publishDetailsFragment.f233094I0;
                if (dVar2 == null) {
                    dVar2 = null;
                }
                intentC = dVar2.c(str, str2, str3, "additem/add_phone/this_phone_in_another_account");
            }
            Intent intent = intentC;
            com.avito.android.publish.view.result_handler.a aVar3 = publishDetailsFragment.f245620B0;
            (aVar3 != null ? aVar3 : null).c(publishDetailsFragment.l1(), publishDetailsFragment, intent, 7, false);
            return;
        }
        if (abstractC33668b instanceof K1.AbstractC33668b.j) {
            C33789t c33789t = publishDetailsFragment.f233108S2;
            (c33789t != null ? c33789t : null).j3(((K1.AbstractC33668b.j) abstractC33668b).f233035a);
            return;
        }
        if (abstractC33668b instanceof K1.AbstractC33668b.l) {
            C33789t c33789t2 = publishDetailsFragment.f233108S2;
            C33789t c33789t3 = c33789t2 != null ? c33789t2 : null;
            ToastBarState toastBarState = new ToastBarState(com.avito.android.printable_text.b.f(((K1.AbstractC33668b.l) abstractC33668b).f233037a), null, null, null, null, null, null, 0, false, false, null, null, 4094, null);
            InterfaceC33778p interfaceC33778p = c33789t3.f234942b.get();
            if (interfaceC33778p != null) {
                interfaceC33778p.i(toastBarState);
                return;
            }
            return;
        }
        if (abstractC33668b instanceof K1.AbstractC33668b.i) {
            K1.AbstractC33668b.i iVar = (K1.AbstractC33668b.i) abstractC33668b;
            C33789t c33789t4 = publishDetailsFragment.f233108S2;
            if (c33789t4 == null) {
                c33789t4 = null;
            }
            PrintableText printableText = iVar.f233032a;
            PrintableText printableText2 = iVar.f233033b;
            C33802x0 c33802x0 = printableText2 != null ? new C33802x0(publishDetailsFragment, iVar) : null;
            InterfaceC33778p interfaceC33778p2 = c33789t4.f234942b.get();
            if (interfaceC33778p2 != null) {
                interfaceC33778p2.l(printableText, printableText2, c33802x0);
                return;
            }
            return;
        }
        if (abstractC33668b instanceof K1.AbstractC33668b.c) {
            com.avito.android.publish.details.iac.e eVar = publishDetailsFragment.f233128g1;
            com.avito.android.publish.details.iac.e eVar2 = eVar != null ? eVar : null;
            K1.AbstractC33668b.c cVar = (K1.AbstractC33668b.c) abstractC33668b;
            IacPermissionRequestSource iacPermissionRequestSource = cVar.f233021a;
            PublishDetailsFragment.f fVar = PublishDetailsFragment.f.f233146l;
            PublishDetailsFragment.g gVar = PublishDetailsFragment.g.f233147l;
            PublishDetailsFragment.h hVar2 = PublishDetailsFragment.h.f233148l;
            Y41.a<kotlin.G0> aVar4 = cVar.f233022b;
            Y41.a<kotlin.G0> aVar5 = cVar.f233023c;
            eVar2.b(iacPermissionRequestSource, aVar4, aVar4, aVar5, fVar, gVar, aVar5, aVar4, hVar2);
            return;
        }
        if (!(abstractC33668b instanceof K1.AbstractC33668b.m)) {
            if (abstractC33668b instanceof K1.AbstractC33668b.a) {
                publishDetailsFragment.startActivity(new Intent(publishDetailsFragment.requireContext(), (Class<?>) RealtyAddressSubmissionActivity.class).putExtra("RealtyAddressSubmissionInfo", ((K1.AbstractC33668b.a) abstractC33668b).f233016a));
                return;
            }
            if (abstractC33668b instanceof K1.AbstractC33668b.k) {
                com.avito.android.lib.util.g.b(new SellerProtectionBottomSheet(), publishDetailsFragment.requireContext(), publishDetailsFragment.getChildFragmentManager(), "SELLER_PROTECTION_DIALOG_TAG");
                return;
            } else {
                if (!kotlin.jvm.internal.L.f(abstractC33668b, K1.AbstractC33668b.d.f233024a) || (interfaceC33777o1 = publishDetailsFragment.f233119X2) == null) {
                    return;
                }
                interfaceC33777o1.j0();
                return;
            }
        }
        C33789t c33789t5 = publishDetailsFragment.f233108S2;
        if (c33789t5 == null) {
            c33789t5 = null;
        }
        CategoryPublishStep categoryPublishStep = ((K1.AbstractC33668b.m) abstractC33668b).f233038a;
        if (categoryPublishStep instanceof CategoryPublishStep.Params) {
            CategoryPublishStep.Params params = (CategoryPublishStep.Params) categoryPublishStep;
            CategoryPublishStep.Params.Config config = params.getConfig();
            Boolean isCloseButtonHidden = config != null ? config.getIsCloseButtonHidden() : null;
            c33789t5.n((isCloseButtonHidden == null || !isCloseButtonHidden.booleanValue()) ? ItemDetailsView.RightTopButtonStyle.f232948b : ItemDetailsView.RightTopButtonStyle.f232950d);
            CategoryPublishStep.Params.Config config2 = params.getConfig();
            String backButtonStyle = config2 != null ? config2.getBackButtonStyle() : null;
            if (!kotlin.jvm.internal.L.f(backButtonStyle, "back") && kotlin.jvm.internal.L.f(backButtonStyle, "close")) {
                c33789t5.o(R.attr.ic_close24);
            } else {
                c33789t5.o(R.attr.ic_arrowBack24);
            }
        } else {
            c33789t5.n(ItemDetailsView.RightTopButtonStyle.f232948b);
            c33789t5.o(R.attr.ic_arrowBack24);
        }
        com.avito.android.publish.C0 c02 = publishDetailsFragment.f233129h1;
        if (c02 == null) {
            c02 = null;
        }
        if (c02.Be()) {
            if (categoryPublishStep == null || (shortTitle = categoryPublishStep.getShortTitle()) == null) {
                String title = categoryPublishStep != null ? categoryPublishStep.getTitle() : null;
                shortTitle = title == null ? "" : title;
            }
            c33789t5.p(shortTitle);
        }
    }
}
