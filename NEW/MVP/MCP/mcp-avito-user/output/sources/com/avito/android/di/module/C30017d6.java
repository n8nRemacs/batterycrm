package com.avito.android.di.module;

import A3.a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.offlinization.analytics.events.CacheIOResult;
import java.io.IOException;
import kotlin.Metadata;
import y40.C50054a;

/* compiled from: OfflinizationBindingsModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/di/module/d6;", "LA3/b;", "_avito-apps_shared_di"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.d6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30017d6 implements A3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C50054a f144267a;

    public C30017d6(C50054a c50054a) {
        this.f144267a = c50054a;
    }

    public final void a(@Y61.k A3.a aVar) {
        CacheIOResult cacheIOResult;
        if (aVar instanceof a.InterfaceC0003a.C0004a) {
            return;
        }
        C50054a c50054a = this.f144267a;
        com.avito.android.offlinization.p pVar = c50054a.f442888b;
        if (pVar.f()) {
            try {
                c50054a.f442887a.get().clear();
                cacheIOResult = CacheIOResult.f208484c;
            } catch (IOException unused) {
                cacheIOResult = CacheIOResult.f208485d;
            }
            if (pVar.d()) {
                m40.d.f414304a.getClass();
                c50054a.f442889c.c(new y.a("performance.cacheCleaning.".concat(cacheIOResult.f208488b), 0L, 2, null));
            }
        }
    }

    @Override // A3.b
    public final void d(@Y61.k a.InterfaceC0003a.C0004a c0004a) {
        a(c0004a);
    }

    @Override // A3.b
    public final void e(@Y61.k a.InterfaceC0003a.c cVar) {
        a(cVar);
    }

    @Override // A3.b
    public final void i(@Y61.k a.b bVar) {
        a(bVar);
    }

    @Override // A3.b
    public final void l(@Y61.k a.InterfaceC0003a.b bVar) {
        a(bVar);
    }

    @Override // A3.b
    public final void p(@Y61.k a.InterfaceC0003a.d dVar) {
        a(dVar);
    }

    @Override // A3.b
    public final void m(@Y61.l Boolean bool, @Y61.k String str) {
    }
}
