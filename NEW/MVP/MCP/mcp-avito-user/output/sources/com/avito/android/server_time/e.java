package com.avito.android.server_time;

import Y61.k;
import io.reactivex.rxjava3.core.G;
import kotlin.Metadata;

/* compiled from: ServerTimeDiffRelay.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/server_time/e;", "Lcom/avito/android/server_time/c;", "Lcom/avito/android/server_time/d;", "<init>", "()V", "_common_server-time_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c, d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<Long> f273996b = new io.reactivex.rxjava3.subjects.e<>();

    @Override // java.util.function.Consumer
    public final void accept(Long l12) {
        this.f273996b.onNext(Long.valueOf(l12.longValue()));
    }

    @Override // io.reactivex.rxjava3.core.E
    public final void c(@k G<? super Long> g12) {
        this.f273996b.c(g12);
    }
}
