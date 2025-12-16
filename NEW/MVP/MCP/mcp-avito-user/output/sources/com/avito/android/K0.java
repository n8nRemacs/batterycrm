package com.avito.android;

import java.util.concurrent.atomic.AtomicLong;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IdProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/K0;", "Lcom/avito/android/J0;", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class K0 implements J0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public AtomicLong f67343a = new AtomicLong(500);

    @Inject
    public K0() {
    }

    @Override // com.avito.android.J0
    public final long a() {
        return this.f67343a.incrementAndGet();
    }

    @Override // com.avito.android.J0
    public final void b(long j12) {
        this.f67343a = new AtomicLong(j12);
    }
}
