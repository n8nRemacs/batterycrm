package com.avito.android.util.rx3;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.operators.flowable.V1;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class A0 implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f318987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f318988c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ A0(Y41.l lVar) {
        this.f318987b = 1;
        this.f318988c = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // l41.o
    public final Object apply(Object obj) {
        Object obj2 = this.f318988c;
        C35907l c35907l = (C35907l) obj;
        switch (this.f318987b) {
            case 0:
                long j12 = c35907l.f319037b;
                if (j12 == -1) {
                    return AbstractC41777j.a(c35907l.f319036a);
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                int i12 = AbstractC41777j.f401972b;
                Objects.requireNonNull(timeUnit, "unit is null");
                io.reactivex.rxjava3.core.H h12 = (io.reactivex.rxjava3.core.H) obj2;
                Objects.requireNonNull(h12, "scheduler is null");
                return new V1(Math.max(0L, j12), timeUnit, h12).k(new C0(c35907l));
            case 1:
                Throwable th2 = c35907l.f319036a;
                return ((Boolean) ((kotlin.jvm.internal.N) obj2).invoke(th2)).booleanValue() ? AbstractC41777j.j(c35907l) : AbstractC41777j.a(th2);
            default:
                Throwable th3 = c35907l.f319036a;
                return ((Boolean) ((Y41.l) obj2).invoke(th3)).booleanValue() ? AbstractC41777j.j(c35907l) : AbstractC41777j.a(th3);
        }
    }

    public /* synthetic */ A0(Object obj, int i12) {
        this.f318987b = i12;
        this.f318988c = obj;
    }
}
