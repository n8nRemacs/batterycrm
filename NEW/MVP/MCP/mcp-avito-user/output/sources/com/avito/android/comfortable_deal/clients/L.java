package com.avito.android.comfortable_deal.clients;

import androidx.compose.runtime.C22066f2;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kp.C43476b;
import kp.InterfaceC43479e;

/* compiled from: ClientsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class L extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43479e f120125l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C43476b f120126m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f120127n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f120128o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f120129p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<ClientCardData, G0> f120130q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f120131r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f120132s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(InterfaceC43479e interfaceC43479e, C43476b c43476b, Y41.a<G0> aVar, Y41.l<? super Integer, G0> lVar, Y41.a<G0> aVar2, Y41.l<? super ClientCardData, G0> lVar2, Y41.l<? super DeepLink, G0> lVar3, int i12) {
        super(2);
        this.f120125l = interfaceC43479e;
        this.f120126m = c43476b;
        this.f120127n = aVar;
        this.f120128o = lVar;
        this.f120129p = aVar2;
        this.f120130q = lVar2;
        this.f120131r = lVar3;
        this.f120132s = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f120132s | 1);
        Y41.l<ClientCardData, G0> lVar = this.f120130q;
        Y41.l<DeepLink, G0> lVar2 = this.f120131r;
        C29444u.i(this.f120125l, this.f120126m, this.f120127n, this.f120128o, this.f120129p, lVar, lVar2, a12, iA2);
        return G0.f406611a;
    }
}
