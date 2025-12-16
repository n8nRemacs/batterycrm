package com.avito.android.cpt.pre_activation.ui.items;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PreActivationNavBar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f126786l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f126787m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f126788n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f126789o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, Y41.a aVar, v.a aVar2, int i12) {
        super(2);
        this.f126786l = str;
        this.f126787m = aVar;
        this.f126788n = aVar2;
        this.f126789o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f126789o | 1);
        v.a aVar = this.f126788n;
        g.a(this.f126786l, this.f126787m, aVar, a12, iA2);
        return G0.f406611a;
    }
}
