package com.esiasdk.android;

import com.esiasdk.android.esiaLoginClient.TokenParameters;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.Z1;

/* compiled from: EsiaAuthVm.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/esiasdk/android/esiaLoginClient/TokenParameters;", "it", "Lkotlin/G0;", "invoke", "(Lcom/esiasdk/android/esiaLoginClient/TokenParameters;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class i extends N implements Y41.l<TokenParameters, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f339712l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar) {
        super(1);
        this.f339712l = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(TokenParameters tokenParameters) {
        n nVar = this.f339712l;
        Z1<Boolean> z12 = nVar.f339723J;
        Boolean bool = Boolean.FALSE;
        z12.setValue(bool);
        nVar.f339724K.setValue(bool);
        nVar.f339727N.w(tokenParameters);
        return G0.f406611a;
    }
}
