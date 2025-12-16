package com.avito.android.tariff_lf_constructor.configure.setting.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.P2;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: ConstructorSettingViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "packageId", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class w<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f300234b;

    public w(m mVar) {
        this.f300234b = mVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // l41.g
    public final void accept(Object obj) {
        String str = (String) obj;
        m mVar = this.f300234b;
        String str2 = mVar.f300198E;
        if (str2 != null) {
            ScreenPerformanceTracker.a.b(mVar.f300202M, null, 3);
            mVar.f300203N.dispose();
            mVar.f300203N = (AtomicReference) mVar.f300200K.e(str2, str).r0(P2.c.f318721a).K(new y(mVar, str)).d0(new z(mVar)).j0(mVar.f300201L.e()).v0(new A(mVar, str), new B(mVar), io.reactivex.rxjava3.internal.functions.a.f401993c);
        }
    }
}
