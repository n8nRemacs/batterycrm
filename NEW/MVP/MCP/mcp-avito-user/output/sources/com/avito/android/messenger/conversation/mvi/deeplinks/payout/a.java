package com.avito.android.messenger.conversation.mvi.deeplinks.payout;

import android.app.Dialog;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: AbstractPayoutDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PayoutLink;", "Deeplink", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<Dialog> f190533l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l0.h<Dialog> hVar) {
        super(0);
        this.f190533l = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Dialog dialog = this.f190533l.f406842b;
        if (dialog != null) {
            dialog.dismiss();
        }
        return G0.f406611a;
    }
}
