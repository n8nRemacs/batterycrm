package com.avito.android.employee_stub_impl.view;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.view.C23038g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeliveryOrderCancelLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deep_linking.links.PayoutLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.i;
import com.avito.android.messenger.conversation.ChannelActivityFragment;
import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.str_core.toggle_booking.ToggleOnlineBookingDeepLink;
import com.avito.android.tariff_cpt.configure.landing.TariffCptConfigureLandingFragment;
import com.avito.android.tariff_cpt.configure.migration.CptMigrationFragment;
import com.avito.android.tariff_cpt.configure.migration.viewmodel.h;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.vas_union.VasUnionV2Fragment;
import com.avito.android.vas_union.deeplink.VasUnionContextLink;
import h31.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.collections.C42745f0;
import oC0.InterfaceC44623a;
import qM0.InterfaceC47320a;
import sC0.C48030a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class a implements a.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f147608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f147609c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f147610d;

    public /* synthetic */ a(Object obj, i iVar, int i12) {
        this.f147608b = i12;
        this.f147610d = obj;
        this.f147609c = iVar;
    }

    @Override // com.avito.android.deeplink_handler.view.a.g
    public final void g(com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        boolean z13 = false;
        G0 g02 = null;
        i iVar = this.f147609c;
        Object obj = this.f147610d;
        switch (this.f147608b) {
            case 0:
                com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d dVar = ((EmployeeStubFragment) obj).f147605r0;
                if (dVar != null) {
                    dVar.g(aVar, z12);
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    iVar.a(z12);
                    break;
                }
                break;
            case 1:
                ChannelActivityFragment.a aVar2 = ChannelActivityFragment.f188908G0;
                DeepLink deepLink = aVar != null ? aVar.f134520a : null;
                if (!(deepLink instanceof PayoutLink) && !(deepLink instanceof DeliveryOrderCancelLink)) {
                    iVar.a(z12);
                    break;
                } else {
                    List<Fragment> listP = ((ChannelActivityFragment) obj).getChildFragmentManager().P();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listP) {
                        if (obj2 instanceof ChannelFragment) {
                            arrayList.add(obj2);
                        }
                    }
                    ChannelFragment channelFragment = (ChannelFragment) C42745f0.G(arrayList);
                    if (channelFragment != null) {
                        if (z12) {
                            e<f> eVar = channelFragment.f188936D0;
                            (eVar != null ? eVar : null).get().r5();
                            break;
                        } else {
                            e<f> eVar2 = channelFragment.f188936D0;
                            (eVar2 != null ? eVar2 : null).get().T5();
                            break;
                        }
                    }
                }
                break;
            case 2:
                TariffCptConfigureLandingFragment.a aVar3 = TariffCptConfigureLandingFragment.f297658s0;
                if (aVar != null && (bundle = aVar.f134522c) != null) {
                    z13 = bundle.getBoolean("show_button_progress", false);
                }
                if (z13) {
                    ((com.avito.android.tariff_cpt.configure.landing.e) ((TariffCptConfigureLandingFragment) obj).f297662q0.getValue()).accept(new InterfaceC44623a.e(z12));
                    break;
                } else {
                    iVar.a(z12);
                    break;
                }
            case 3:
                CptMigrationFragment.a aVar4 = CptMigrationFragment.f297998v0;
                if (aVar != null && (bundle2 = aVar.f134522c) != null) {
                    z13 = bundle2.getBoolean("show_button_progress", false);
                }
                if (z13) {
                    C23038g0<h.b> c23038g0 = ((h) ((CptMigrationFragment) obj).f298003r0.getValue()).f298088Q;
                    h.b value = c23038g0.getValue();
                    if (value instanceof h.b.c) {
                        ArrayList<com.avito.conveyor_item.a> arrayList2 = ((h.b.c) value).f298092a.f437543a;
                        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
                        for (com.avito.conveyor_item.a aVar5 : arrayList2) {
                            if (aVar5 instanceof com.avito.android.tariff_cpt.common.item.button.a) {
                                com.avito.android.tariff_cpt.common.item.button.a aVar6 = (com.avito.android.tariff_cpt.common.item.button.a) aVar5;
                                aVar5 = new com.avito.android.tariff_cpt.common.item.button.a(aVar6.f297517b, aVar6.f297518c, aVar6.f297519d, aVar6.f297520e, z12);
                            }
                            arrayList3.add(aVar5);
                        }
                        c23038g0.setValue(new h.b.c(new C48030a(arrayList3)));
                        break;
                    }
                } else {
                    iVar.a(z12);
                    break;
                }
                break;
            case 4:
                int i12 = MyAdvertDetailsActivity.f308263Q0;
                if (!((aVar != null ? aVar.f134520a : null) instanceof MyAdvertLink.Deactivate)) {
                    if (!((aVar != null ? aVar.f134520a : null) instanceof ToggleOnlineBookingDeepLink)) {
                        iVar.a(z12);
                        break;
                    }
                }
                MyAdvertDetailsActivity myAdvertDetailsActivity = (MyAdvertDetailsActivity) obj;
                if (z12) {
                    InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
                    (interfaceC35426j0 != null ? interfaceC35426j0 : null).lb();
                    break;
                } else {
                    InterfaceC35426j0 interfaceC35426j02 = myAdvertDetailsActivity.f308326q;
                    (interfaceC35426j02 != null ? interfaceC35426j02 : null).Z8();
                    break;
                }
            default:
                VasUnionV2Fragment.a aVar7 = VasUnionV2Fragment.f323084D0;
                Integer numValueOf = (aVar == null || (bundle3 = aVar.f134522c) == null || !bundle3.containsKey("vas_union_key_button_id")) ? null : Integer.valueOf(bundle3.getInt("vas_union_key_button_id"));
                if ((aVar != null ? aVar.f134520a : null) instanceof VasUnionContextLink) {
                    ((VasUnionV2Fragment) obj).q5().accept(new InterfaceC47320a.i(z12, numValueOf));
                    break;
                } else {
                    iVar.a(z12);
                    break;
                }
        }
    }
}
