package com.avito.android.wallet.pin.impl.settings.mvi;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kP0.C42617c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletSecuritySettingsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C42617c f328887l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f328888m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f328889n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C42617c c42617c, Y41.a<G0> aVar, int i12) {
        super(2);
        this.f328887l = c42617c;
        this.f328888m = aVar;
        this.f328889n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f328889n | 1);
        o.d(this.f328887l, this.f328888m, a12, iA2);
        return G0.f406611a;
    }
}
