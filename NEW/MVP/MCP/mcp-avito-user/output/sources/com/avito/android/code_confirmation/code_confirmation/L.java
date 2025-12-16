package com.avito.android.code_confirmation.code_confirmation;

import Vo.C15699a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter;
import kotlin.Metadata;

/* compiled from: CodeConfirmationPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LVo/a;", "kotlin.jvm.PlatformType", "result", "Lkotlin/G0;", "accept", "(LVo/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class L<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f119420b;

    public L(T t12) {
        this.f119420b = t12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C15699a c15699a = (C15699a) obj;
        T t12 = this.f119420b;
        ScreenPerformanceTracker.a.d(t12.f119451l, "requestCode", null, null, null, 14);
        ScreenPerformanceTracker screenPerformanceTracker = t12.f119451l;
        screenPerformanceTracker.m("requestCode");
        String str = t12.f119458s;
        String str2 = c15699a.f17383a;
        CodeConfirmationPresenter.Mode mode = t12.f119464y;
        t12.d(str, str2, c15699a.f17384b, 5, CodeConfirmationPresenter.TfaFlow.Sms.f119409b, mode);
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, "requestCode", null, null, 6);
    }
}
