package com.avito.android.sx_address.entry;

import DA0.a;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SxAddressEntryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class p extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.C0157a f292979l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f292980m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f292981n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f292982o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a.C0157a c0157a, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f292979l = c0157a;
        this.f292980m = lVar;
        this.f292981n = aVar;
        this.f292982o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f292982o | 1);
        v.a aVar = this.f292981n;
        s.c(this.f292979l, this.f292980m, aVar, a12, iA2);
        return G0.f406611a;
    }
}
