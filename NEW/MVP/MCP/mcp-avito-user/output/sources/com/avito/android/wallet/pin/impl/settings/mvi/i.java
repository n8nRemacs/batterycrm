package com.avito.android.wallet.pin.impl.settings.mvi;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.a;
import kP0.InterfaceC42615a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletSecuritySettingsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.C10210a f328880l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC42615a, G0> f328881m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f328882n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(a.C10210a c10210a, Y41.l<? super InterfaceC42615a, G0> lVar, int i12) {
        super(2);
        this.f328880l = c10210a;
        this.f328881m = lVar;
        this.f328882n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f328882n | 1);
        o.b(this.f328880l, this.f328881m, a12, iA2);
        return G0.f406611a;
    }
}
