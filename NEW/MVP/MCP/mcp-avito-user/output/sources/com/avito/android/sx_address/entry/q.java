package com.avito.android.sx_address.entry;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SxAddressEntryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class q extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f292983l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f292984m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f292985n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i12, Y41.a aVar, androidx.compose.ui.v vVar) {
        super(2);
        this.f292983l = aVar;
        this.f292984m = vVar;
        this.f292985n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        s.d(C22066f2.a(this.f292985n | 1), this.f292983l, a12, this.f292984m);
        return G0.f406611a;
    }
}
