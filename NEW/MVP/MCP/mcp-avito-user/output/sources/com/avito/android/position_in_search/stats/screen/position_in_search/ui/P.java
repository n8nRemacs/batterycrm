package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.runtime.InterfaceC22204y1;
import c90.InterfaceC26960a;
import c90.c;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PositionInSearchQueryItems.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class P extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.e.a.C2036c.b f221605l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f221606m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC26960a, G0> f221607n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public P(c.e.a.C2036c.b bVar, InterfaceC22204y1<Boolean> interfaceC22204y1, Y41.l<? super InterfaceC26960a, G0> lVar) {
        super(0);
        this.f221605l = bVar;
        this.f221606m = interfaceC22204y1;
        this.f221607n = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f221606m.setValue(Boolean.valueOf(!r0.getF42167b().booleanValue()));
        DeepLink deepLink = this.f221605l.f57772h;
        if (deepLink != null) {
            this.f221607n.invoke(new InterfaceC26960a.d(deepLink));
        }
        return G0.f406611a;
    }
}
