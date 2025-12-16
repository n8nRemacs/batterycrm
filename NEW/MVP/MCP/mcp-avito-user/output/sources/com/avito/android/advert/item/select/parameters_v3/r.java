package com.avito.android.advert.item.select.parameters_v3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectParametersV3Screen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class r extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f79606l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f79607m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f79608n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<String, String, G0> f79609o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f79610p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC22204y1 interfaceC22204y1, Y41.l lVar, Y41.l lVar2, Y41.p pVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f79606l = interfaceC22204y1;
        this.f79607m = lVar;
        this.f79608n = lVar2;
        this.f79609o = pVar;
        this.f79610p = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        Y41.p<String, String, G0> pVar = this.f79609o;
        Y41.l<DeepLink, G0> lVar = this.f79607m;
        Y41.l<String, G0> lVar2 = this.f79608n;
        x.b(this.f79606l, lVar, lVar2, pVar, this.f79610p, a12, iA2);
        return G0.f406611a;
    }
}
