package com.avito.android.tariff_cpt.common.ui.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ErrorScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Throwable f297542l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f297543m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f297544n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Throwable th2, Y41.a aVar, v vVar, int i12) {
        super(2);
        this.f297542l = th2;
        this.f297543m = aVar;
        this.f297544n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        Y41.a<G0> aVar = this.f297543m;
        b.a(this.f297542l, aVar, a12, iA2);
        return G0.f406611a;
    }
}
