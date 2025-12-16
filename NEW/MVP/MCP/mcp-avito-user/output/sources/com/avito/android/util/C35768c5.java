package com.avito.android.util;

import android.os.Looper;
import i41.C41224a;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: SchedulersFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/c5;", "Lcom/avito/android/util/a5;", "<init>", "()V", "_common_schedulers-factory_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.c5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35768c5 implements InterfaceC35745a5 {
    public C35768c5() {
        C41224a.f398356a = new C35760b5(io.reactivex.rxjava3.android.schedulers.b.a(Looper.getMainLooper()));
    }

    @Override // com.avito.android.util.InterfaceC35745a5
    @Y61.k
    public final io.reactivex.rxjava3.core.H a() {
        return io.reactivex.rxjava3.schedulers.b.f404943c;
    }

    @Override // com.avito.android.util.InterfaceC35745a5
    @Y61.k
    public final io.reactivex.rxjava3.internal.schedulers.s b() {
        return io.reactivex.rxjava3.schedulers.b.f404944d;
    }

    @Override // com.avito.android.util.InterfaceC35745a5
    @Y61.k
    public final io.reactivex.rxjava3.core.H c() {
        return io.reactivex.rxjava3.schedulers.b.f404942b;
    }

    @Override // com.avito.android.util.InterfaceC35745a5
    @Y61.k
    public final io.reactivex.rxjava3.core.H d() {
        return io.reactivex.rxjava3.schedulers.b.f404945e;
    }

    @Override // com.avito.android.util.InterfaceC35745a5
    @Y61.k
    public final io.reactivex.rxjava3.core.H e() {
        return io.reactivex.rxjava3.android.schedulers.b.b();
    }

    @Override // com.avito.android.util.InterfaceC35745a5
    @Y61.k
    public final io.reactivex.rxjava3.core.H f() {
        return io.reactivex.rxjava3.schedulers.b.f404941a;
    }

    @Override // com.avito.android.util.InterfaceC35745a5
    @Y61.k
    public final io.reactivex.rxjava3.internal.schedulers.d g(@Y61.k Executor executor) {
        io.reactivex.rxjava3.core.H h12 = io.reactivex.rxjava3.schedulers.b.f404941a;
        return new io.reactivex.rxjava3.internal.schedulers.d(executor, false, false);
    }
}
