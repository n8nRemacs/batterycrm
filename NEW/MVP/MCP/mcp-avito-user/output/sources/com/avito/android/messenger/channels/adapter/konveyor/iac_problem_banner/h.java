package com.avito.android.messenger.channels.adapter.konveyor.iac_problem_banner;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.v;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelsIacProblemBannerUI.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f186941l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f186942m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f186943n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f186944o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22374n f186945p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f186946q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(UniversalImage universalImage, float f12, float f13, v vVar, InterfaceC22374n interfaceC22374n, int i12) {
        super(2);
        this.f186941l = universalImage;
        this.f186942m = f12;
        this.f186943n = f13;
        this.f186944o = vVar;
        this.f186945p = interfaceC22374n;
        this.f186946q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f186946q | 1);
        float f12 = this.f186942m;
        float f13 = this.f186943n;
        l.b(this.f186941l, f12, f13, this.f186944o, a12, iA2);
        return G0.f406611a;
    }
}
