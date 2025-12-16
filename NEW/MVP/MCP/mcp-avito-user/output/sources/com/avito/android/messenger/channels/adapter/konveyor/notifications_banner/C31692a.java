package com.avito.android.messenger.channels.adapter.konveyor.notifications_banner;

import androidx.compose.runtime.A;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsNotificationsBannerView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31692a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ChannelsListItem.e f186978l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f186979m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f186980n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f186981o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31692a(ChannelsListItem.e eVar, b bVar, Y41.a<G0> aVar, Y41.a<G0> aVar2) {
        super(2);
        this.f186978l = eVar;
        this.f186979m = bVar;
        this.f186980n = aVar;
        this.f186981o = aVar2;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            ChannelsListItem.e eVar = this.f186978l;
            String strC = u0.i.c(a13, eVar.f186818d);
            String strC2 = u0.i.c(a13, eVar.f186819e);
            UniversalImage universalImage = this.f186979m.f186982b ? eVar.f186821g : null;
            a13.C(860512587);
            Object objT = a13.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = this.f186980n;
                a13.H(objT);
            }
            Y41.a aVar = (Y41.a) objT;
            a13.h();
            a13.C(860514794);
            Object objT2 = a13.t();
            if (objT2 == c1651a) {
                objT2 = this.f186981o;
                a13.H(objT2);
            }
            a13.h();
            u.a(strC, strC2, universalImage, aVar, (Y41.a) objT2, a13, 28160);
        }
        return G0.f406611a;
    }
}
