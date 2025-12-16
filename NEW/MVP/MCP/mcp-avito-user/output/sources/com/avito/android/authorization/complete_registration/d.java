package com.avito.android.authorization.complete_registration;

import android.content.Intent;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C22981N;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.auth.InterfaceC28641u;
import com.avito.android.authorization.complete_registration.CompleteRegistrationFragment;
import com.avito.android.authorization.gorelkin.ParsingPermissionFormContent;
import com.avito.android.authorization.gorelkin.ParsingPermissionFragment;
import com.avito.android.authorization.gorelkin.PpFlow;
import com.avito.android.deep_linking.links.ProfileLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import de.C39715a;
import ee.b;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import qK0.C47313c;

/* compiled from: CompleteRegistrationFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class d extends H implements Y41.l<ee.b, G0> {
    public final void f(@Y61.k ee.b bVar) {
        CompleteRegistrationFragment completeRegistrationFragment = (CompleteRegistrationFragment) this.receiver;
        CompleteRegistrationFragment.a aVar = CompleteRegistrationFragment.f93381E0;
        completeRegistrationFragment.getClass();
        if (L.f(bVar, b.a.f395269a)) {
            boolean z12 = completeRegistrationFragment.requireArguments().getBoolean("opened_by_register_link");
            ProfileLink profileLink = new ProfileLink(false, 1, null);
            InterfaceC28641u interfaceC28641u = completeRegistrationFragment.f93393t0;
            if (interfaceC28641u == null) {
                interfaceC28641u = null;
            }
            ScreenFlowLink screenFlowLink = new ScreenFlowLink(interfaceC28641u.build(), C39715a.f393985a);
            if (z12) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = completeRegistrationFragment.f93392s0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, new ScreenFlowLink(profileLink, screenFlowLink), null, null, 6);
                completeRegistrationFragment.requireActivity().finish();
                return;
            }
            ActivityC22955m activityC22955mRequireActivity = completeRegistrationFragment.requireActivity();
            InterfaceC28373a interfaceC28373a = completeRegistrationFragment.f93391r0;
            Intent intentPutExtra = Zd.n.b(activityC22955mRequireActivity, interfaceC28373a != null ? interfaceC28373a : null).putExtra("result", -1).putExtra("isRegistered", true);
            intentPutExtra.setFlags(603979776);
            activityC22955mRequireActivity.startActivity(intentPutExtra);
            activityC22955mRequireActivity.finish();
            return;
        }
        if (bVar instanceof b.c) {
            ActivityC22955m activityC22955mRequireActivity2 = completeRegistrationFragment.requireActivity();
            b.c cVar = (b.c) bVar;
            ParsingPermissionFormContent parsingPermissionFormContent = new ParsingPermissionFormContent(cVar.f395271a, cVar.f395272b);
            androidx.fragment.app.H hE2 = activityC22955mRequireActivity2.getSupportFragmentManager().e();
            ParsingPermissionFragment.a aVar3 = ParsingPermissionFragment.f93867D0;
            PpFlow ppFlow = PpFlow.f93888c;
            aVar3.getClass();
            hE2.j(R.id.fragment_container, ParsingPermissionFragment.a.c(parsingPermissionFormContent, ppFlow), null, 1);
            hE2.e();
            return;
        }
        if (bVar instanceof b.d) {
            C43259k.d(C22981N.a(completeRegistrationFragment.getLifecycle()), null, null, new o(completeRegistrationFragment, ((b.d) bVar).f395274a, null), 3);
            return;
        }
        if (!(bVar instanceof b.e)) {
            if (bVar instanceof b.C11095b) {
                completeRegistrationFragment.t5(((b.C11095b) bVar).f395270a);
                return;
            }
            return;
        }
        b.e eVar = (b.e) bVar;
        com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
        C47313c c47313c = completeRegistrationFragment.f93385C0;
        kotlin.reflect.n<Object> nVar = CompleteRegistrationFragment.f93382F0[7];
        TextView textView = (TextView) c47313c.a();
        PrintableText printableTextC = eVar.f395275a;
        if (printableTextC == null) {
            printableTextC = com.avito.android.printable_text.b.c(R.string.auth_common_error, new Serializable[0]);
        }
        com.avito.android.component.toast.c.b(cVar2, textView, printableTextC, null, null, null, eVar.f395276b, 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(ee.b bVar) {
        f(bVar);
        return G0.f406611a;
    }
}
