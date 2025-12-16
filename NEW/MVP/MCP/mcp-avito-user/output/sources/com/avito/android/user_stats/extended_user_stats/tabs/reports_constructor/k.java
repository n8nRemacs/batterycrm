package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor;

import Y41.l;
import android.os.Bundle;
import com.avito.user_stats.model.extended_user_stats.Hint;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HintMetricChartDialogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class k extends N implements l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Hint f318160l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Hint hint) {
        super(1);
        this.f318160l = hint;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        bundle.putParcelable("HintArgsMetricChartDialogFragment", this.f318160l);
        return G0.f406611a;
    }
}
