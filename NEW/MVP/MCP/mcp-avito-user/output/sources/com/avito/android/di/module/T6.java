package com.avito.android.di.module;

import android.location.Location;
import com.avito.android.quic.p;
import kotlin.Metadata;

/* compiled from: QuicBindingsModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/di/module/T6;", "Lcom/avito/android/quic/p$d;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class T6 implements p.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.geo.j f144141a;

    public T6(com.avito.android.geo.j jVar) {
        this.f144141a = jVar;
    }

    @Override // com.avito.android.quic.p.d
    @Y61.l
    public final Location a() {
        return this.f144141a.j();
    }
}
