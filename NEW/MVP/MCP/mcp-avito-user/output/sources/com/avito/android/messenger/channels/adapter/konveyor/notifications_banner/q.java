package com.avito.android.messenger.channels.adapter.konveyor.notifications_banner;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.layout.InterfaceC22374n;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelsNotificationsBannerRedesign.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class q extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f187010l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f187011m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f187012n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f187013o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f187014p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f187015q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22374n f187016r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f187017s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(UniversalImage universalImage, float f12, float f13, float f14, float f15, androidx.compose.ui.v vVar, InterfaceC22374n interfaceC22374n, int i12) {
        super(2);
        this.f187010l = universalImage;
        this.f187011m = f12;
        this.f187012n = f13;
        this.f187013o = f14;
        this.f187014p = f15;
        this.f187015q = vVar;
        this.f187016r = interfaceC22374n;
        this.f187017s = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f187017s | 1);
        float f12 = this.f187013o;
        float f13 = this.f187014p;
        u.b(this.f187010l, this.f187011m, this.f187012n, f12, f13, a12, iA2);
        return G0.f406611a;
    }
}
