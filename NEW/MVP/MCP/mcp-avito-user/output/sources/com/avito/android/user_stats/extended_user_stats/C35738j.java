package com.avito.android.user_stats.extended_user_stats;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedUserStatsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/k;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/bottom_sheet/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.user_stats.extended_user_stats.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35738j extends N implements Y41.l<com.avito.android.lib.design.bottom_sheet.k, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedUserStatsFragment f317224l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f317225m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35738j(ExtendedUserStatsFragment extendedUserStatsFragment, int i12) {
        super(1);
        this.f317224l = extendedUserStatsFragment;
        this.f317225m = i12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.bottom_sheet.k kVar) {
        com.avito.android.lib.design.bottom_sheet.k kVar2 = kVar;
        ExtendedUserStatsViewModel extendedUserStatsViewModel = this.f317224l.f317024u0;
        if (extendedUserStatsViewModel == null) {
            extendedUserStatsViewModel = null;
        }
        extendedUserStatsViewModel.xe(new com.avito.android.user_stats.extended_user_stats.metrics.f(kVar2, null, 2, null), this.f317225m);
        return G0.f406611a;
    }
}
