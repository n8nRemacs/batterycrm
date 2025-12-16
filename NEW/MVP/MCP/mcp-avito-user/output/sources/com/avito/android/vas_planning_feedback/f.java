package com.avito.android.vas_planning_feedback;

import Y61.k;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPlanningFeedbackViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_feedback/f;", "Landroidx/lifecycle/P0$c;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f323058a;

    @Inject
    public f(@k InterfaceC35745a5 interfaceC35745a5) {
        this.f323058a = interfaceC35745a5;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        if (cls.isAssignableFrom(e.class)) {
            return new e(this.f323058a);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
