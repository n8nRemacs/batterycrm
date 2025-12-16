package com.avito.android.user_stats.extended_user_stats;

import com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedUserStatsView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class u extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f318259l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ExtendedUserStatsViewModel.b f318260m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r rVar, ExtendedUserStatsViewModel.b bVar) {
        super(0);
        this.f318259l = rVar;
        this.f318260m = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f318259l.f317325o.accept(this.f318260m.f317103c);
        return G0.f406611a;
    }
}
