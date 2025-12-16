package com.avito.android.user_stats.extended_user_stats;

import android.content.res.Resources;
import com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: ExtendedUserStatsViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LfW0/h;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class D<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExtendedUserStatsViewModel f317008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f317009c;

    public D(ExtendedUserStatsViewModel extendedUserStatsViewModel, String str) {
        this.f317008b = extendedUserStatsViewModel;
        this.f317009c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) throws Resources.NotFoundException {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        String str = this.f317009c;
        ExtendedUserStatsViewModel extendedUserStatsViewModel = this.f317008b;
        if (!z12) {
            if (p22 instanceof P2.a) {
                extendedUserStatsViewModel.f317055T.postValue(ExtendedUserStatsViewModel.ne(extendedUserStatsViewModel, str, ExtendedUserStatsViewModel.ConfigProgressState.f317082c));
                extendedUserStatsViewModel.f317058W = false;
                return;
            }
            return;
        }
        extendedUserStatsViewModel.f317057V = (fW0.h) ((P2.b) p22).f318720a;
        extendedUserStatsViewModel.f317055T.postValue(ExtendedUserStatsViewModel.ke(extendedUserStatsViewModel, str));
        extendedUserStatsViewModel.ye(null);
        extendedUserStatsViewModel.f317058W = false;
        extendedUserStatsViewModel.ve(null);
    }
}
