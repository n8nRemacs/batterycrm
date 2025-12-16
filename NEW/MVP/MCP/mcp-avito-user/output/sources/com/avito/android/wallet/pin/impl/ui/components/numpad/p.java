package com.avito.android.wallet.pin.impl.ui.components.numpad;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletPinNumPad.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class p extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f328973l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f328974m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f328975n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f328976o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, Y41.a aVar, v vVar, int i12) {
        super(2);
        this.f328973l = str;
        this.f328974m = aVar;
        this.f328975n = vVar;
        this.f328976o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f328976o | 1);
        d.c(this.f328973l, this.f328974m, this.f328975n, a12, iA2);
        return G0.f406611a;
    }
}
