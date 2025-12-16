package com.avito.android.mortgage.landing.list.items.usp_manager_banner;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.mortgage.api.model.landing.LandingManagerUspItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UspManagerBannerItemScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LandingManagerUspItem f200039l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f200040m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LandingManagerUspItem landingManagerUspItem, v vVar, int i12) {
        super(2);
        this.f200039l = landingManagerUspItem;
        this.f200040m = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(49);
        v vVar = this.f200040m;
        g.a(this.f200039l, vVar, a12, iA2);
        return G0.f406611a;
    }
}
