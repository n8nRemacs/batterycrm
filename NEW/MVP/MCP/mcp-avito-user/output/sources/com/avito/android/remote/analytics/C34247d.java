package com.avito.android.remote.analytics;

import com.avito.android.quic.cronet.CronetTcpRstReporter;
import kotlin.Metadata;
import lj0.C43781a;
import lj0.InterfaceC43782b;

/* compiled from: NetworkErrorsModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/d;", "Lcom/avito/android/quic/cronet/CronetTcpRstReporter$b;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.analytics.d, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34247d implements CronetTcpRstReporter.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43782b f253116a;

    public C34247d(InterfaceC43782b interfaceC43782b) {
        this.f253116a = interfaceC43782b;
    }

    @Override // com.avito.android.quic.cronet.CronetTcpRstReporter.b
    @Y61.l
    public final String a() {
        C43781a c43781aA = this.f253116a.a();
        if (c43781aA != null) {
            return c43781aA.f414169a;
        }
        return null;
    }

    @Override // com.avito.android.quic.cronet.CronetTcpRstReporter.b
    @Y61.l
    public final String b() {
        C43781a c43781aA = this.f253116a.a();
        if (c43781aA != null) {
            return c43781aA.f414170b;
        }
        return null;
    }
}
