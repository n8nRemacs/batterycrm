package com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen;

import WK.a;
import Y41.p;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.IacFinishedFeedbackScreenFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacFinishedFeedbackScreenFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "rating", "", "fromBS", "Lkotlin/G0;", "invoke", "(IZ)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements p<Integer, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacFinishedFeedbackScreenFragment f166650l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(IacFinishedFeedbackScreenFragment iacFinishedFeedbackScreenFragment) {
        super(2);
        this.f166650l = iacFinishedFeedbackScreenFragment;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, Boolean bool) {
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        IacFinishedFeedbackScreenFragment.a aVar = IacFinishedFeedbackScreenFragment.f166628t0;
        this.f166650l.r5().accept(new a.c(iIntValue, zBooleanValue));
        return G0.f406611a;
    }
}
