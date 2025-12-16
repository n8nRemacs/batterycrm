package com.avito.android.user_stats.extended_user_stats;

import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedUserStatsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/J;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_stats/extended_user_stats/J;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class k extends N implements Y41.l<J, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f317226l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ExtendedUserStatsFragment f317227m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f317228n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ArrayList arrayList, ExtendedUserStatsFragment extendedUserStatsFragment, int i12) {
        super(1);
        this.f317226l = arrayList;
        this.f317227m = extendedUserStatsFragment;
        this.f317228n = i12;
    }

    @Override // Y41.l
    public final G0 invoke(J j12) {
        J j13 = j12;
        j13.f317146a = this.f317226l;
        j13.f317147b = new C35738j(this.f317227m, this.f317228n);
        return G0.f406611a;
    }
}
