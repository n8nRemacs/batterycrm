package com.avito.android.di.module;

import com.avito.android.quic.p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;

/* compiled from: QuicBindingsModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/di/module/U6;", "Lcom/avito/android/quic/p$e;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class U6 implements p.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.location.perf_location.g f144148a;

    public U6(com.avito.android.location.perf_location.g gVar) {
        this.f144148a = gVar;
    }

    @Override // com.avito.android.quic.p.e
    @Y61.l
    public final Object a(@Y61.k String str, @Y61.k SuspendLambda suspendLambda) {
        return this.f144148a.a(!C43066x.z(str, "1/location/coords/current", false), suspendLambda);
    }
}
