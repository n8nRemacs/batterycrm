package com.avito.android.messenger.channels.mvi.view;

import C40.a;
import H40.b;
import PZ.a;
import VY.a;
import android.text.Editable;
import android.view.View;
import androidx.core.app.C22746d;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.messenger.analytics.C31654j;
import com.avito.android.messenger.conversation.create.CreateChannelFragment;
import com.avito.android.messenger.conversation.mvi.messages.q0;
import com.avito.android.messenger.conversation.mvi.send.Q0;
import com.avito.android.messenger.deeplink.bottom_sheet.BottomSheetInputDialogFragment;
import com.avito.android.messenger.map.search.GeoSearchFragment;
import com.avito.android.messenger.search.ChannelsSearchFragment;
import com.avito.android.mortgage.applicant_type.ApplicantTypeSelectorDialog;
import com.avito.android.mortgage.landing.list.items.programs.program.ProgramItem;
import com.avito.android.newcars_mark_model_filter.presentation.NewCarsBrandModelFilterFragment;
import com.avito.android.onboarding.dialog.analytics.OnboardingCloseType;
import com.avito.android.onboarding.steps.OnboardingStepsFragment;
import com.avito.android.onboarding.steps.q;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.collections.C42745f0;
import o30.InterfaceC44575a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.channels.mvi.view.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class ViewOnClickListenerC31873b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f188736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f188737c;

    public /* synthetic */ ViewOnClickListenerC31873b(Object obj, int i12) {
        this.f188736b = i12;
        this.f188737c = obj;
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        Editable editableM53getText;
        AvitoMap avitoMap;
        String str;
        Object obj = this.f188737c;
        switch (this.f188736b) {
            case 0:
                ChannelsFragment channelsFragment = (ChannelsFragment) obj;
                InterfaceC28373a interfaceC28373a = channelsFragment.f188614u0;
                if (interfaceC28373a == null) {
                    interfaceC28373a = null;
                }
                interfaceC28373a.c(new C31654j());
                ActivityC22955m activityC22955mL1 = channelsFragment.l1();
                C22746d c22746dB = activityC22955mL1 != null ? C22746d.b(activityC22955mL1, view, channelsFragment.getString(R.string.messenger_transition_search_field)) : null;
                com.avito.android.messenger.channels.b bVar = channelsFragment.f188606L0;
                if (bVar == null) {
                    bVar = null;
                }
                bVar.f187142a.startActivity(bVar.f187144c.e(), c22746dB != null ? c22746dB.c() : null);
                break;
            case 1:
                ?? r12 = ((com.avito.android.messenger.conversation.adapter.n) obj).f189258c;
                if (r12 != 0) {
                    r12.invoke();
                    break;
                }
                break;
            case 2:
                com.avito.android.messenger.conversation.create.s sVar = ((CreateChannelFragment) obj).f189503k0;
                if (sVar != null) {
                    sVar.p(0);
                    break;
                }
                break;
            case 3:
                ((q0) obj).f193098F.accept(G0.f406611a);
                break;
            case 4:
                BottomSheet bottomSheet = ((com.avito.android.messenger.conversation.mvi.platform_actions.z) obj).f194068o;
                if (bottomSheet.getVisibility().equals(BottomSheet.d.c.f177838a)) {
                    bottomSheet.k2();
                    break;
                } else {
                    bottomSheet.j2();
                    break;
                }
            case 5:
                Y41.a<G0> aVar = ((com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.b) obj).f194010i;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 6:
                ((Q0) obj).f194357J.accept(G0.f406611a);
                break;
            case 7:
                BottomSheetInputDialogFragment.a aVar2 = BottomSheetInputDialogFragment.f195452l0;
                BottomSheetInputDialogFragment bottomSheetInputDialogFragment = (BottomSheetInputDialogFragment) obj;
                com.avito.android.messenger.deeplink.bottom_sheet.d dVar = (com.avito.android.messenger.deeplink.bottom_sheet.d) bottomSheetInputDialogFragment.f195454i0.getValue();
                Input input = bottomSheetInputDialogFragment.f195455j0;
                if (input == null || (editableM53getText = input.m53getText()) == null || (string = editableM53getText.toString()) == null) {
                    string = "";
                }
                dVar.accept(new a.C1183a(string));
                break;
            case 8:
                GeoSearchFragment.a aVar3 = GeoSearchFragment.f196484B0;
                ActivityC22955m activityC22955mL12 = ((GeoSearchFragment) obj).l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.finish();
                    break;
                }
                break;
            case 9:
                com.avito.android.messenger.map.sharing.L l12 = (com.avito.android.messenger.map.sharing.L) obj;
                AvitoMapMarker avitoMapMarker = l12.f196680o;
                if (avitoMapMarker != null) {
                    Object data = avitoMapMarker.getData();
                    AvitoMapPoint avitoMapPoint = data instanceof AvitoMapPoint ? (AvitoMapPoint) data : null;
                    if (avitoMapPoint != null && (avitoMap = l12.f196669d) != null) {
                        avitoMap.moveTo(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude(), true, null);
                    }
                }
                l12.f196677l.accept(G0.f406611a);
                break;
            case 10:
                ((ChannelsSearchFragment) obj).q5();
                break;
            case 11:
                ((com.avito.android.mortgage.applicant_type.f) ((ApplicantTypeSelectorDialog) obj).f198267i0.getValue()).accept(a.C0850a.f13135a);
                break;
            case 12:
                com.avito.android.mortgage.landing.dialog.f fVar = (com.avito.android.mortgage.landing.dialog.f) obj;
                ProgramItem programItem = fVar.f199635L;
                if (programItem != null && (str = programItem.f199931l) != null) {
                    fVar.f199633J.invoke(str);
                }
                fVar.dismiss();
                break;
            case 13:
                Y41.a<G0> aVar4 = ((com.avito.android.mortgage.landing.list.items.action_banner.g) obj).f199665f;
                if (aVar4 != null) {
                    aVar4.invoke();
                    break;
                }
                break;
            case 14:
                Y41.a<G0> aVar5 = ((com.avito.android.mortgage.landing.list.items.expandable_block.g) obj).f199712f;
                if (aVar5 != null) {
                    aVar5.invoke();
                    break;
                }
                break;
            case 15:
                Checkbox checkbox = ((com.avito.android.mortgage.landing.list.items.offers.offer.h) obj).f199863e;
                checkbox.setChecked(true ^ checkbox.isChecked());
                break;
            case 16:
                ((com.avito.android.mortgage.landing.list.items.programs.program.h) obj).f199948e.setChecked(true);
                break;
            case 17:
                Y41.a<G0> aVar6 = ((com.avito.android.mortgage.person_form.list.items.action_banner.g) obj).f200580e;
                if (aVar6 != null) {
                    aVar6.invoke();
                    break;
                }
                break;
            case 18:
                Y41.a<G0> aVar7 = ((com.avito.android.mortgage.person_form.list.items.child.j) obj).f200634e;
                if (aVar7 != null) {
                    aVar7.invoke();
                    break;
                }
                break;
            case 19:
                Y41.a<G0> aVar8 = ((com.avito.android.mortgage.person_form.list.items.verification_banner.g) obj).f200842g;
                if (aVar8 != null) {
                    aVar8.invoke();
                    break;
                }
                break;
            case 20:
                Y41.a<G0> aVar9 = ((com.avito.android.mortgage.root.list.items.bank_banner.h) obj).f202404e;
                if (aVar9 != null) {
                    aVar9.invoke();
                    break;
                }
                break;
            case 21:
                Y41.a<G0> aVar10 = ((com.avito.android.mortgage.root.list.items.immutable_info.h) obj).f202635e;
                if (aVar10 != null) {
                    aVar10.invoke();
                    break;
                }
                break;
            case 22:
                Y41.a<G0> aVar11 = ((com.avito.android.mortgage.root.list.items.realty_object.h) obj).f202753e;
                if (aVar11 != null) {
                    aVar11.invoke();
                    break;
                }
                break;
            case 23:
                Y41.a<G0> aVar12 = ((com.avito.android.mortgage.root.list.items.realty_object_details.s) obj).f202804e;
                if (aVar12 != null) {
                    aVar12.invoke();
                    break;
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                NewCarsBrandModelFilterFragment.a aVar13 = NewCarsBrandModelFilterFragment.f207276u0;
                NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment = (NewCarsBrandModelFilterFragment) obj;
                o30.c value = newCarsBrandModelFilterFragment.f5().getState().getValue();
                boolean z12 = value.f419359k;
                List<Long> list = value.f419355g;
                if (z12) {
                    if (list != null) {
                        com.avito.android.newcars_mark_model_filter.analytics.b bVar2 = newCarsBrandModelFilterFragment.f207289t0;
                        if (bVar2 == null) {
                            bVar2 = null;
                        }
                        bVar2.a(list, true);
                    }
                    newCarsBrandModelFilterFragment.f5().accept(new InterfaceC44575a.C12161a(null, null, 3, null));
                    break;
                } else {
                    List<TV0.a> list2 = value.f419352d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        TV0.a aVar14 = (TV0.a) obj2;
                        com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b bVar3 = aVar14 instanceof com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b ? (com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b) aVar14 : null;
                        if (bVar3 != null ? bVar3.f207396e : false) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Long.valueOf(((TV0.a) it.next()).getF77493b()));
                    }
                    com.avito.android.newcars_mark_model_filter.analytics.b bVar4 = newCarsBrandModelFilterFragment.f207289t0;
                    (bVar4 != null ? bVar4 : null).a(arrayList2, false);
                    newCarsBrandModelFilterFragment.f5().accept(new InterfaceC44575a.C12161a(list, arrayList2));
                    break;
                }
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                com.avito.android.offlinization.ui.i iVar = ((com.avito.android.offlinization.ui.b) obj).toastProvider;
                if (iVar != null) {
                    iVar.a(view, com.avito.android.printable_text.b.c(R.string.offline_mode_warning, new Serializable[0]));
                    break;
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i12 = com.avito.android.onboarding.dialog.b.f208746K;
                com.avito.android.onboarding.dialog.b bVar5 = (com.avito.android.onboarding.dialog.b) obj;
                bVar5.dismiss();
                bVar5.f208747E.d(OnboardingCloseType.f208741c);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((com.avito.android.onboarding.dialog.view.carousel.o) obj).f209011d.invoke(a.d.f1912a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                OnboardingStepsFragment.a aVar15 = OnboardingStepsFragment.f209259v0;
                ((OnboardingStepsFragment) obj).requireActivity().onBackPressed();
                break;
            default:
                int i13 = q.a.f209374j;
                q.a aVar16 = (q.a) obj;
                aVar16.f209376c.invoke(new b.a(aVar16.getBindingAdapterPosition()));
                break;
        }
    }
}
