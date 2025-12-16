package com.avito.android.missed_calls;

import Y61.k;
import com.jakewharton.rxrelay3.d;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MissedCallsPushStream.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/missed_calls/b;", "Lcom/avito/android/missed_calls/a;", "<init>", "()V", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d<G0> f197807a = new com.jakewharton.rxrelay3.b().M0();

    @Inject
    public b() {
    }

    @Override // com.avito.android.missed_calls.a
    public final void a() {
        this.f197807a.accept(G0.f406611a);
    }

    @Override // com.avito.android.missed_calls.a
    public final z l() {
        return this.f197807a;
    }
}
