package com.avito.android.mortgage_invite.client_search;

import androidx.compose.runtime.C22066f2;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageClientSearchScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class A extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W10.c f205301l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205302m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205303n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MortgageClient, G0> f205304o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f205305p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f205306q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(W10.c cVar, Y41.a aVar, Y41.a aVar2, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f205301l = cVar;
        this.f205302m = aVar;
        this.f205303n = aVar2;
        this.f205304o = lVar;
        this.f205305p = vVar;
        this.f205306q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f205306q | 1);
        Y41.a<G0> aVar = this.f205303n;
        Y41.l<MortgageClient, G0> lVar = this.f205304o;
        I.a(this.f205301l, this.f205302m, aVar, lVar, this.f205305p, a12, iA2);
        return G0.f406611a;
    }
}
