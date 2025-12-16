package com.avito.android.wallet.pin.impl.creation.mvi;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.wallet.pin.impl.creation.mvi.entity.a;
import eP0.InterfaceC40037a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WalletPinCreationScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.C10197a f328706l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<eP0.b> f328707m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC40037a, G0> f328708n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f328709o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(a.C10197a c10197a, InterfaceC43160i<? extends eP0.b> interfaceC43160i, Y41.l<? super InterfaceC40037a, G0> lVar, int i12) {
        super(2);
        this.f328706l = c10197a;
        this.f328707m = interfaceC43160i;
        this.f328708n = lVar;
        this.f328709o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f328709o | 1);
        InterfaceC43160i<eP0.b> interfaceC43160i = this.f328707m;
        Y41.l<InterfaceC40037a, G0> lVar = this.f328708n;
        s.c(this.f328706l, interfaceC43160i, lVar, a12, iA2);
        return G0.f406611a;
    }
}
