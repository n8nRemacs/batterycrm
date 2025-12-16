package com.avito.android.preloading;

import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.core.C;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class e implements C {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f221851b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f221852c;

    public /* synthetic */ e(j jVar, Object obj) {
        this.f221851b = jVar;
        this.f221852c = obj;
    }

    @Override // io.reactivex.rxjava3.core.C
    public final void f(B b12) {
        this.f221851b.c(this.f221852c, new f(1, b12, B.class, "onNext", "onNext(Ljava/lang/Object;)V", 0), new g(1, b12, B.class, "onError", "onError(Ljava/lang/Throwable;)V", 0), new h(0, b12, B.class, "onComplete", "onComplete()V", 0));
    }
}
