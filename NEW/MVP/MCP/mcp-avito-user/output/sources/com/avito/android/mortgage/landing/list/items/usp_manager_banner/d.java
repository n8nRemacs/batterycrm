package com.avito.android.mortgage.landing.list.items.usp_manager_banner;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.mortgage.api.model.landing.LandingManagerUspItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UspManagerBannerItemScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<LandingManagerUspItem> f200041l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f200042m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list, v vVar, int i12) {
        super(2);
        this.f200041l = list;
        this.f200042m = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(57);
        v vVar = this.f200042m;
        g.b(this.f200041l, vVar, a12, iA2);
        return G0.f406611a;
    }
}
