package com.avito.android.di.module;

import com.avito.android.quic.p;
import kotlin.Metadata;

/* compiled from: QuicBindingsModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/di/module/S6;", "Lcom/avito/android/quic/p$b;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class S6 implements p.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.C f144131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.H f144132b;

    public S6(com.avito.android.analytics.C c12, com.avito.android.analytics.H h12) {
        this.f144131a = c12;
        this.f144132b = h12;
    }

    @Override // com.avito.android.quic.p.b
    @Y61.k
    public final String a() {
        return this.f144132b.a();
    }

    @Override // com.avito.android.quic.p.b
    public final boolean b() {
        return this.f144132b.getF89659d().f89680c;
    }
}
