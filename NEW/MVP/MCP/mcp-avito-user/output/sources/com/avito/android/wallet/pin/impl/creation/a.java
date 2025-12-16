package com.avito.android.wallet.pin.impl.creation;

import Y41.l;
import com.avito.android.wallet.pin.impl.creation.mvi.t;
import eP0.InterfaceC40037a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletPinCreationActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LeP0/a;", "it", "Lkotlin/G0;", "invoke", "(LeP0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class a extends N implements l<InterfaceC40037a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WalletPinCreationActivity f328452l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WalletPinCreationActivity walletPinCreationActivity) {
        super(1);
        this.f328452l = walletPinCreationActivity;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC40037a interfaceC40037a) {
        ((t) this.f328452l.f328434n.getValue()).accept(interfaceC40037a);
        return G0.f406611a;
    }
}
