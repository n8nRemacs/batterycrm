package com.avito.android.user_adverts.root_screen.adverts_host;

import android.os.Bundle;
import kotlin.G0;
import kotlin.Metadata;
import yq0.InterfaceC50281a;
import zq0.AbstractC50612a;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "requestKey", "Landroid/os/Bundle;", "result", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class J extends kotlin.jvm.internal.N implements Y41.p<String, Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f312258l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(UserAdvertsHostFragment userAdvertsHostFragment) {
        super(2);
        this.f312258l = userAdvertsHostFragment;
    }

    @Override // Y41.p
    public final G0 invoke(String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (str.equals("request_key_hints_dialog") && bundle2.getBoolean("key_hints_dialog_data", false)) {
            AbstractC50612a abstractC50612a = this.f312258l.f312296F0;
            if (abstractC50612a == null) {
                abstractC50612a = null;
            }
            abstractC50612a.accept(InterfaceC50281a.f.f443510a);
        }
        return G0.f406611a;
    }
}
