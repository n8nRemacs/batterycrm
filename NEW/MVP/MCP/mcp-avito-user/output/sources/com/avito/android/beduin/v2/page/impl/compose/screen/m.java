package com.avito.android.beduin.v2.page.impl.compose.screen;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinV2PageScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f105075l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f105076m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i12, Y41.a aVar) {
        super(2);
        this.f105075l = aVar;
        this.f105076m = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f105076m | 1);
        j.c(this.f105075l, a12, iA2);
        return G0.f406611a;
    }
}
