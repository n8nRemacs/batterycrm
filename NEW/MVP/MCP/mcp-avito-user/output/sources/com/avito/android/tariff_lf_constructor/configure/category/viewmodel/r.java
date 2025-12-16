package com.avito.android.tariff_lf_constructor.configure.category.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: ConstructorConfigureCategoryViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "categoryId", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f299436b;

    public r(v vVar) {
        this.f299436b = vVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // l41.g
    public final void accept(Object obj) {
        String str = (String) obj;
        v vVar = this.f299436b;
        ScreenPerformanceTracker.a.b(vVar.f299446O, null, 3);
        vVar.f299447P.dispose();
        vVar.f299447P = (AtomicReference) vVar.f299444M.a(vVar.f299440E, vVar.f299441J, (52 & 4) != 0 ? null : null, (52 & 8) != 0 ? null : str, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null).j0(vVar.f299445N.e()).v0(new t(vVar), new u(vVar), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }
}
