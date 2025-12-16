package com.avito.android.wallet.pin.impl.verification.mvi;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;
import pP0.InterfaceC46989a;
import pP0.InterfaceC46990b;

/* compiled from: WalletPinVerificationScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class k extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.C10227a f329327l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC46990b> f329328m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC46989a, G0> f329329n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f329330o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(a.C10227a c10227a, InterfaceC43160i<? extends InterfaceC46990b> interfaceC43160i, Y41.l<? super InterfaceC46989a, G0> lVar, int i12) {
        super(2);
        this.f329327l = c10227a;
        this.f329328m = interfaceC43160i;
        this.f329329n = lVar;
        this.f329330o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f329330o | 1);
        InterfaceC43160i<InterfaceC46990b> interfaceC43160i = this.f329328m;
        Y41.l<InterfaceC46989a, G0> lVar = this.f329329n;
        o.b(this.f329327l, interfaceC43160i, lVar, a12, iA2);
        return G0.f406611a;
    }
}
