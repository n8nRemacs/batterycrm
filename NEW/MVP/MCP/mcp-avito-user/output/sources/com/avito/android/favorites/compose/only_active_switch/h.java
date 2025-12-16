package com.avito.android.favorites.compose.only_active_switch;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ShowOnlyActiveFavoritesSwitch.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f156869l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f156870m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f156871n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f156872o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC22204y1 interfaceC22204y1, Y41.a aVar, v vVar, int i12) {
        super(2);
        this.f156869l = interfaceC22204y1;
        this.f156870m = aVar;
        this.f156871n = vVar;
        this.f156872o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f156872o | 1);
        v vVar = this.f156871n;
        i.b(this.f156869l, this.f156870m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
