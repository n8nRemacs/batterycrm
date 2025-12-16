package com.avito.android.advert.item.select.no_click_contact;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectNoClickContactScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class j extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f79465l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f79466m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f79467n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<String, String, G0> f79468o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v.a f79469p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(InterfaceC22204y1 interfaceC22204y1, Y41.l lVar, Y41.l lVar2, Y41.p pVar, v.a aVar, int i12) {
        super(2);
        this.f79465l = interfaceC22204y1;
        this.f79466m = lVar;
        this.f79467n = lVar2;
        this.f79468o = pVar;
        this.f79469p = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        Y41.p<String, String, G0> pVar = this.f79468o;
        Y41.l<DeepLink, G0> lVar = this.f79466m;
        Y41.l<String, G0> lVar2 = this.f79467n;
        r.a(this.f79465l, lVar, lVar2, pVar, this.f79469p, a12, iA2);
        return G0.f406611a;
    }
}
