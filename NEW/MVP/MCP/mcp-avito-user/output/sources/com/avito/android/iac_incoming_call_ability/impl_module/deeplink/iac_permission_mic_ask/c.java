package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_permission_mic_ask;

import android.content.DialogInterface;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacPermissionMicAskLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f168264l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DialogInterface dialogInterface) {
        super(0);
        this.f168264l = dialogInterface;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f168264l.dismiss();
        return G0.f406611a;
    }
}
