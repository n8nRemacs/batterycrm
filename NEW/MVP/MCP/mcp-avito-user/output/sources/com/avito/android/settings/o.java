package com.avito.android.settings;

import Nv0.c;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.avito.android.InterfaceC27635a0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.T;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.license.LicenseFragment;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.Location;
import com.avito.android.replace_main.toggle.d;
import com.avito.android.settings.ui.SettingsFragment;
import com.avito.android.suggest_locations.InterfaceC35139d;
import com.avito.android.suggest_locations.OpenEventFromBlock;
import com.avito.android.webview.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import okhttp3.internal.http2.Http2;
import wN.InterfaceC49541a;

/* compiled from: SettingsView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class o extends H implements Y41.l<Nv0.c, G0> {
    public final void f(@Y61.k Nv0.c cVar) {
        q qVar = (q) this.receiver;
        qVar.getClass();
        boolean z12 = cVar instanceof c.h;
        SettingsFragment settingsFragment = qVar.f280963b;
        if (z12) {
            InterfaceC30751h interfaceC30751h = settingsFragment.f280992x0;
            if (interfaceC30751h == null) {
                interfaceC30751h = null;
            }
            settingsFragment.startActivity(interfaceC30751h.a(null));
            return;
        }
        if (cVar instanceof c.f) {
            com.avito.android.webview.l lVar = settingsFragment.f280993y0;
            if (lVar == null) {
                lVar = null;
            }
            l lVar2 = settingsFragment.f280985J0;
            settingsFragment.startActivity(l.a.a(lVar, Uri.parse((lVar2 != null ? lVar2 : null).f280891a.getString(R.string.b2b_hub_url)), new WebViewLinkSettings(false, true, false, false, false, null, null, false, false, false, false, 2045, null), 4));
            return;
        }
        if (cVar instanceof c.d) {
            InterfaceC49541a interfaceC49541a = settingsFragment.f280994z0;
            settingsFragment.startActivity((interfaceC49541a != null ? interfaceC49541a : null).d());
            return;
        }
        if (cVar instanceof c.p) {
            InterfaceC49541a interfaceC49541a2 = settingsFragment.f280994z0;
            settingsFragment.startActivity((interfaceC49541a2 != null ? interfaceC49541a2 : null).e());
            return;
        }
        if (cVar instanceof c.l) {
            InterfaceC49541a interfaceC49541a3 = settingsFragment.f280994z0;
            settingsFragment.startActivity((interfaceC49541a3 != null ? interfaceC49541a3 : null).b());
            return;
        }
        if (cVar instanceof c.n) {
            FragmentManager childFragmentManager = settingsFragment.getChildFragmentManager();
            if (childFragmentManager.H("LicensesFragment") == null) {
                androidx.fragment.app.H hE2 = childFragmentManager.e();
                LicenseFragment.f181489l0.getClass();
                hE2.j(0, new LicenseFragment(), "LicensesFragment", 1);
                hE2.f();
                return;
            }
            return;
        }
        if (cVar instanceof c.g) {
            InterfaceC27635a0 interfaceC27635a0 = settingsFragment.f280983H0;
            (interfaceC27635a0 != null ? interfaceC27635a0 : null).getClass();
            return;
        }
        if (cVar instanceof c.C0772c) {
            com.avito.android.ab_groups.l lVar3 = settingsFragment.f280977B0;
            settingsFragment.startActivity((lVar3 != null ? lVar3 : null).a());
            return;
        }
        if (cVar instanceof c.o) {
            b bVar = settingsFragment.f280976A0;
            settingsFragment.startActivity((bVar != null ? bVar : null).a());
            return;
        }
        if (cVar instanceof c.j) {
            Location location = ((c.j) cVar).f11852a;
            InterfaceC35139d interfaceC35139d = settingsFragment.f280978C0;
            InterfaceC35139d interfaceC35139d2 = interfaceC35139d != null ? interfaceC35139d : null;
            String id2 = location.getId();
            OpenEventFromBlock[] openEventFromBlockArr = OpenEventFromBlock.f292117b;
            Intent intentA = interfaceC35139d2.a(id2, null, 6, null, null, settingsFragment.q5(), (32576 & 64) != 0 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : null, (32576 & 128) != 0 ? null : null, (32576 & 256) != 0 ? null : null, (32576 & 2048) != 0 ? null : null, (32576 & 8192) != 0 ? null : null, (32576 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : Boolean.TRUE);
            if (settingsFragment.q5() != null) {
                settingsFragment.C5(1, intentA);
                return;
            } else {
                settingsFragment.startActivityForResult(intentA, 1);
                return;
            }
        }
        if (cVar instanceof c.k) {
            Y30.a aVar = settingsFragment.f280979D0;
            settingsFragment.startActivity((aVar != null ? aVar : null).a());
            return;
        }
        if (cVar instanceof c.e) {
            InterfaceC28373a interfaceC28373a = settingsFragment.f280986K0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new T());
            x xVar = settingsFragment.f280982G0;
            if (xVar == null) {
                xVar = null;
            }
            l lVar4 = settingsFragment.f280985J0;
            if (lVar4 == null) {
                lVar4 = null;
            }
            DeepLink deepLinkB = xVar.b(lVar4.f280891a.getString(R.string.avito_care_uri));
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = settingsFragment.f280981F0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            b.a.a(aVar2, deepLinkB, null, null, 6);
            return;
        }
        if (cVar instanceof c.m) {
            com.avito.android.webview.l lVar5 = settingsFragment.f280993y0;
            if (lVar5 == null) {
                lVar5 = null;
            }
            l lVar6 = settingsFragment.f280985J0;
            settingsFragment.startActivity(l.a.a(lVar5, Uri.parse((lVar6 != null ? lVar6 : null).f280891a.getString(R.string.rec_technologies_url)), new WebViewLinkSettings(false, true, false, false, false, null, null, false, false, false, false, 2045, null), 4));
            return;
        }
        if (cVar instanceof c.i) {
            YQ.a aVar3 = settingsFragment.f280980E0;
            settingsFragment.startActivity((aVar3 != null ? aVar3 : null).a());
            return;
        }
        if (cVar instanceof c.r) {
            c.r rVar = (c.r) cVar;
            com.avito.android.replace_main.toast.a aVar4 = qVar.f280970i;
            if (aVar4 != null) {
                aVar4.dismiss();
            }
            d.c cVar2 = rVar.f11861b;
            qVar.f280970i = qVar.f280965d.a(new com.avito.android.replace_main.toast.h(qVar.f280967f, rVar.f11860a, cVar2.f254625a, false, null, cVar2.f254626b.f254624a, new r(qVar, rVar), new s(qVar, rVar), 24, null));
            return;
        }
        if (cVar instanceof c.b) {
            com.avito.android.replace_main.toast.a aVar5 = qVar.f280970i;
            if (aVar5 != null) {
                aVar5.dismiss();
                return;
            }
            return;
        }
        if (cVar instanceof c.a) {
            settingsFragment.r5();
            return;
        }
        if (cVar instanceof c.s) {
            com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, qVar.f280967f, com.avito.android.printable_text.b.f(((c.s) cVar).f11862a), null, null, null, null, 0, ToastBarPosition.f181046d, null, false, false, null, null, 4030);
            return;
        }
        if (cVar instanceof c.q) {
            com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(((c.q) cVar).f11859a);
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            f.c.f125255c.getClass();
            com.avito.android.component.toast.c.b(cVar3, qVar.f280967f, printableTextF, null, null, null, f.c.a.b(), 0, toastBarPosition, null, false, false, null, null, 4014);
        }
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(Nv0.c cVar) {
        f(cVar);
        return G0.f406611a;
    }
}
