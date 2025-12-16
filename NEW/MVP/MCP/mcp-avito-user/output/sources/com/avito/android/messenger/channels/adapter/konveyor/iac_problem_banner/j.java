package com.avito.android.messenger.channels.adapter.konveyor.iac_problem_banner;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelsIacProblemBannerUI.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class j extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f186951l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f186952m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f186953n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f186954o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f186955p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f186956q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, String str2, UniversalImage universalImage, Y41.a aVar, Y41.a aVar2, v vVar, int i12) {
        super(2);
        this.f186951l = str;
        this.f186952m = str2;
        this.f186953n = universalImage;
        this.f186954o = aVar;
        this.f186955p = aVar2;
        this.f186956q = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(28161);
        UniversalImage universalImage = this.f186953n;
        Y41.a<G0> aVar = this.f186954o;
        l.a(this.f186951l, this.f186952m, universalImage, aVar, this.f186955p, a12, iA2);
        return G0.f406611a;
    }
}
