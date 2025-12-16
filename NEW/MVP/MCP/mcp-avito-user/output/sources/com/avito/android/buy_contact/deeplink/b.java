package com.avito.android.buy_contact.deeplink;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import Y41.p;
import com.avito.android.buy_contact_link.link.JobBuyContactLink;
import com.avito.android.contact_access.links.ContactsPackagesApplyLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.job.cv_packages.links.CvPackagesLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kv.C43501a;

/* compiled from: BuyContactDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class b extends C42801a implements p<C43501a, Continuation<? super G0>, Object>, SuspendFunction {
    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        C43501a c43501a2 = c43501a;
        e eVar = (e) this.receiver;
        eVar.getClass();
        DeepLink deepLink = c43501a2.f413260a.f134520a;
        boolean z12 = deepLink instanceof CvPackagesLink;
        InterfaceC14249c interfaceC14249c = c43501a2.f413261b;
        if (z12) {
            if (interfaceC14249c instanceof InterfaceC14247a.b) {
                String str = ((CvPackagesLink) deepLink).f174421b;
                boolean z13 = ((CvPackagesLink.b.C5141b) interfaceC14249c).f174424b;
                eVar.j(new JobBuyContactLink.b.C3256b());
            } else if (interfaceC14249c instanceof InterfaceC14247a.InterfaceC0545a) {
                eVar.j(new JobBuyContactLink.b.a(null, 1, null));
            }
        } else if (deepLink instanceof ContactsPackagesApplyLink) {
            if (interfaceC14249c instanceof InterfaceC14247a.b) {
                eVar.j(new JobBuyContactLink.b.C3256b(((ContactsPackagesApplyLink) deepLink).f126153b, null, 2, null));
            } else if (interfaceC14249c instanceof InterfaceC14247a.InterfaceC0545a) {
                eVar.j(new JobBuyContactLink.b.a(null, 1, null));
            }
        }
        return G0.f406611a;
    }
}
