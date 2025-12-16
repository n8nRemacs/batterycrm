package com.avito.android.iac_avcalls.impl_module.platform;

import Y61.k;
import com.avito.avcalls.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.SafeContinuation;

/* compiled from: AvCallsPlatformWithCoroutines.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/e;", "Lcom/avito/avcalls/a$c;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements a.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f164482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GJ.a f164483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f164484c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f164485d;

    public e(d dVar, GJ.a aVar, String str, SafeContinuation safeContinuation) {
        this.f164482a = dVar;
        this.f164483b = aVar;
        this.f164484c = str;
        this.f164485d = safeContinuation;
    }

    @Override // com.avito.avcalls.a.c
    public final void a(@k Throwable th2) {
        d.o(this.f164482a, th2, this.f164484c);
        int i12 = Z.f406624c;
        this.f164485d.resumeWith(new Z.b(th2));
    }

    @Override // com.avito.avcalls.a.c
    public final void onComplete() {
        this.f164482a.r(this.f164483b, this.f164484c);
        int i12 = Z.f406624c;
        this.f164485d.resumeWith(G0.f406611a);
    }
}
