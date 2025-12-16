package com.avito.android.str_calendar.seller.calandar_parameters;

import com.avito.android.remote.model.category_parameters.GroupParameter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrCalendarParametersFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class G extends N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ GroupParameter.OnboardingTooltip f286677l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(GroupParameter.OnboardingTooltip onboardingTooltip) {
        super(1);
        this.f286677l = onboardingTooltip;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
        com.avito.android.lib.design.tooltip.o oVar2 = oVar;
        GroupParameter.OnboardingTooltip onboardingTooltip = this.f286677l;
        oVar2.i(onboardingTooltip.getTitle());
        oVar2.b(onboardingTooltip.getSubtitle());
        return G0.f406611a;
    }
}
