package com.avito.android.wallet.page.mvi;

import Y61.k;
import Y61.l;
import aP0.InterfaceC19802a;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: WalletPageInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/mvi/a;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC19802a> f328085a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<NO0.a> f328086b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f328087c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f328088d;

    @Inject
    public a(@k h31.e<InterfaceC19802a> eVar, @k h31.e<NO0.a> eVar2, @l @com.avito.android.wallet.page.di.component.c String str, @com.avito.android.wallet.page.di.component.b boolean z12) {
        this.f328085a = eVar;
        this.f328086b = eVar2;
        this.f328087c = str;
        this.f328088d = z12;
    }

    @l
    public final Object a(@k ContinuationImpl continuationImpl) {
        String str = this.f328087c;
        boolean z12 = this.f328088d;
        if (z12) {
            Object objB = this.f328086b.get().b(str, continuationImpl);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : (TypedResult) objB;
        }
        if (z12) {
            throw new NoWhenBranchMatchedException();
        }
        Object objD = this.f328085a.get().d(str, continuationImpl);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : (TypedResult) objD;
    }
}
