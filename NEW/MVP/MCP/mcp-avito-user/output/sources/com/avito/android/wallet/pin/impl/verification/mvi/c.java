package com.avito.android.wallet.pin.impl.verification.mvi;

import androidx.view.y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import pP0.InterfaceC46989a;

/* compiled from: WalletPinVerificationScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y f329129l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC46989a, G0> f329130m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(y yVar, Y41.l<? super InterfaceC46989a, G0> lVar) {
        super(0);
        this.f329129l = yVar;
        this.f329130m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        y yVar = this.f329129l;
        if (yVar != null) {
            yVar.c();
        }
        this.f329130m.invoke(InterfaceC46989a.C12271a.f428521a);
        return G0.f406611a;
    }
}
