package com.avito.android.profile_vk_linking.start;

import bd0.C25632a;
import bd0.C25633b;
import com.avito.android.profile_vk_linking.common.VkPopupView;
import com.avito.android.profile_vk_linking.common.deep_linking.ProfileVkRequestTokenLink;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: VkLinkingStartView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class h extends H implements Y41.l<C25633b, G0> {
    @Override // Y41.l
    public final G0 invoke(C25633b c25633b) {
        C25633b c25633b2 = c25633b;
        n nVar = (n) this.receiver;
        nVar.getClass();
        String str = c25633b2.f57296c;
        com.avito.android.status_view.g gVar = nVar.f231488d;
        if (str != null) {
            com.avito.android.status_view.g.a(gVar, str, null, 14);
        } else if (c25633b2.f57294a) {
            D6.H(gVar.f284965h);
            D6.w(gVar.f284961d);
            gVar.f284967j.e();
        } else {
            C25632a c25632a = c25633b2.f57295b;
            if (c25632a != null) {
                D6.w(gVar.f284965h);
                D6.w(gVar.f284961d);
                gVar.f284967j.e();
                Class cls = c25633b2.f57297d ? ProfileVkRequestTokenLink.class : null;
                VkPopupView.b(nVar.f231489e, c25632a.f57291b, null, c25632a.f57290a, null, cls, 10);
            }
        }
        return G0.f406611a;
    }
}
