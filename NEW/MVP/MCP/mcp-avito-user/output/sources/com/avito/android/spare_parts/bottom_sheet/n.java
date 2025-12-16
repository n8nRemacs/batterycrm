package com.avito.android.spare_parts.bottom_sheet;

import android.animation.ValueAnimator;
import io.reactivex.rxjava3.core.InterfaceC41770c;
import io.reactivex.rxjava3.core.InterfaceC41772e;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements InterfaceC41772e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f284816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f284817c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f284818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N f284819e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n(float f12, float f13, long j12, Y41.l lVar) {
        this.f284816b = f12;
        this.f284817c = f13;
        this.f284818d = j12;
        this.f284819e = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // io.reactivex.rxjava3.core.InterfaceC41772e
    public final void e(InterfaceC41770c interfaceC41770c) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f284816b, this.f284817c);
        valueAnimatorOfFloat.setDuration(this.f284818d);
        valueAnimatorOfFloat.addUpdateListener(new com.avito.android.lib.deprecated_design.tab.n(2, this.f284819e));
        valueAnimatorOfFloat.addListener(new t(interfaceC41770c));
        valueAnimatorOfFloat.start();
    }
}
