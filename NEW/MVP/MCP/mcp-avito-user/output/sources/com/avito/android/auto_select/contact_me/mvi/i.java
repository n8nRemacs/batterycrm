package com.avito.android.auto_select.contact_me.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.t;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.auto_select.contact_me.mvi.entity.AutoSelectContactMeInternalAction;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PhoneLink;
import gf.InterfaceC40671b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectContactMeOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_select/contact_me/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction;", "Lgf/b;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements t<AutoSelectContactMeInternalAction, InterfaceC40671b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f96021b;

    @Inject
    public i(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f96021b = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40671b b(AutoSelectContactMeInternalAction autoSelectContactMeInternalAction) {
        String str;
        String str2;
        AutoSelectContactMeInternalAction autoSelectContactMeInternalAction2 = autoSelectContactMeInternalAction;
        if (autoSelectContactMeInternalAction2 instanceof AutoSelectContactMeInternalAction.Init) {
            return null;
        }
        if (autoSelectContactMeInternalAction2 instanceof AutoSelectContactMeInternalAction.CloseScreen) {
            return InterfaceC40671b.a.f396672a;
        }
        if (autoSelectContactMeInternalAction2 instanceof AutoSelectContactMeInternalAction.DeepLinkClicked) {
            return new InterfaceC40671b.C11219b(((AutoSelectContactMeInternalAction.DeepLinkClicked) autoSelectContactMeInternalAction2).f96007b);
        }
        if (autoSelectContactMeInternalAction2 instanceof AutoSelectContactMeInternalAction.ContactClicked) {
            DeepLink deepLink = ((AutoSelectContactMeInternalAction.ContactClicked) autoSelectContactMeInternalAction2).f96006b.f95995f;
            if (deepLink != null) {
                return new InterfaceC40671b.C11219b(deepLink);
            }
            return null;
        }
        if (!(autoSelectContactMeInternalAction2 instanceof AutoSelectContactMeInternalAction.LogItemCall)) {
            throw new NoWhenBranchMatchedException();
        }
        AutoSelectContactMeInternalAction.LogItemCall logItemCall = (AutoSelectContactMeInternalAction.LogItemCall) autoSelectContactMeInternalAction2;
        DeepLink deepLink2 = logItemCall.f96009b.f95995f;
        if (deepLink2 instanceof PhoneLink.Call) {
            str2 = ((PhoneLink.Call) deepLink2).f133575d;
        } else {
            if (!(deepLink2 instanceof PhoneRequestLink)) {
                if (deepLink2 instanceof ClickStreamLink) {
                    DeepLink deepLink3 = ((ClickStreamLink) deepLink2).f133110e;
                    PhoneLink.Call call = deepLink3 instanceof PhoneLink.Call ? (PhoneLink.Call) deepLink3 : null;
                    if (call != null) {
                        str2 = call.f133575d;
                    }
                }
                str = null;
                this.f96021b.c(new com.avito.android.analytics.call.c(logItemCall.f96010c, null, str, "r", 0, null, "contacts_block_callback", true, 32, null));
                return null;
            }
            str2 = ((PhoneRequestLink) deepLink2).f92282c;
        }
        str = str2;
        this.f96021b.c(new com.avito.android.analytics.call.c(logItemCall.f96010c, null, str, "r", 0, null, "contacts_block_callback", true, 32, null));
        return null;
    }
}
