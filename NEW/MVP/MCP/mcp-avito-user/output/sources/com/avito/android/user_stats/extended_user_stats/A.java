package com.avito.android.user_stats.extended_user_stats;

import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedUserStatsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class A extends N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f317000l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f317001m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(View view, r rVar) {
        super(1);
        this.f317000l = view;
        this.f317001m = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
        com.avito.android.lib.design.tooltip.o oVar2 = oVar;
        Resources resources = this.f317000l.getContext().getResources();
        oVar2.i(resources.getString(R.string.user_stats_dynamic_tooltip_title));
        oVar2.b(resources.getString(R.string.user_stats_dynamic_tooltip_description));
        oVar2.d(resources.getString(R.string.user_stats_dynamic_tooltip_button));
        oVar2.c(new o(this.f317001m, 2));
        return G0.f406611a;
    }
}
