package com.avito.android.profile_vk_linking.request_token;

import Zc0.InterfaceC19540c;
import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: VkRequestTokenView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class h extends H implements Y41.l<InterfaceC19540c, G0> {
    @Override // Y41.l
    public final G0 invoke(InterfaceC19540c interfaceC19540c) {
        ActivityC22955m activityC22955mL1;
        InterfaceC19540c interfaceC19540c2 = interfaceC19540c;
        k kVar = (k) this.receiver;
        kVar.getClass();
        if (interfaceC19540c2 instanceof InterfaceC19540c.C1443c) {
            kVar.f231361c.loadUrl(((InterfaceC19540c.C1443c) interfaceC19540c2).f20305a);
        } else {
            boolean z12 = interfaceC19540c2 instanceof InterfaceC19540c.b;
            VkRequestTokenFragment vkRequestTokenFragment = kVar.f231359a;
            if (z12) {
                Intent intent = new Intent();
                InterfaceC19540c.b bVar = (InterfaceC19540c.b) interfaceC19540c2;
                intent.putExtra("key_result_code", bVar.f20303a);
                intent.putExtra("key_result_state", bVar.f20304b);
                ActivityC22955m activityC22955mL12 = vkRequestTokenFragment.l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.setResult(-1, intent);
                }
                ActivityC22955m activityC22955mL13 = vkRequestTokenFragment.l1();
                if (activityC22955mL13 != null) {
                    activityC22955mL13.finish();
                }
            } else if ((interfaceC19540c2 instanceof InterfaceC19540c.a) && (activityC22955mL1 = vkRequestTokenFragment.l1()) != null) {
                activityC22955mL1.finish();
            }
        }
        return G0.f406611a;
    }
}
