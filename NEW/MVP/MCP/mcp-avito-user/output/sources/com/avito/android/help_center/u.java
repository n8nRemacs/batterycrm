package com.avito.android.help_center;

import androidx.fragment.app.ActivityC22955m;
import kotlin.Metadata;

/* compiled from: HelpCenterPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f161847b;

    public u(z zVar) {
        this.f161847b = zVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ActivityC22955m activityC22955mL1;
        HelpCenterFragment helpCenterFragment = this.f161847b.f161863k;
        if (helpCenterFragment == null || (activityC22955mL1 = helpCenterFragment.l1()) == null) {
            return;
        }
        activityC22955mL1.finish();
    }
}
