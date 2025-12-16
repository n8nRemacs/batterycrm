package com.avito.android.deal_confirmation;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: DealConfirmationPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "authorized", "Lio/reactivex/rxjava3/core/O;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f132758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f132759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f132760d;

    public f(h hVar, String str, String str2) {
        this.f132758b = hVar;
        this.f132759c = str;
        this.f132760d = str2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return I.q(Boolean.FALSE);
        }
        h hVar = this.f132758b;
        ScreenPerformanceTracker.a.b(hVar.f132765d, null, 3);
        C42026y c42026yA = g1.a(hVar.f132762a.b(this.f132759c, this.f132760d));
        ScreenPerformanceTracker.a.d(hVar.f132765d, null, null, null, null, 15);
        return c42026yA.s(hVar.f132763b.e()).n(new e(hVar));
    }
}
