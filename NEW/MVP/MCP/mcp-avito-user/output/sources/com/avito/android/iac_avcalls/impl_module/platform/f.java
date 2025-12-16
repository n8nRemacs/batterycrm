package com.avito.android.iac_avcalls.impl_module.platform;

import Y61.k;
import com.avito.avcalls.a;
import com.avito.avcalls.call.models.CallState;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.SafeContinuation;
import tJ.C48564c;

/* compiled from: AvCallsPlatformWithCoroutines.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/f;", "Lcom/avito/avcalls/a$h;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f164486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GJ.a f164487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f164488c;

    public f(d dVar, GJ.a aVar, SafeContinuation safeContinuation) {
        this.f164486a = dVar;
        this.f164487b = aVar;
        this.f164488c = safeContinuation;
    }

    @Override // com.avito.avcalls.a.h
    public final void a(@k Throwable th2) {
        d.o(this.f164486a, th2, "createOutgoingCall");
        int i12 = Z.f406624c;
        this.f164488c.resumeWith(new Z.b(th2));
    }

    @Override // com.avito.avcalls.a.h
    public final void b(@k CallState callState) {
        this.f164486a.r(this.f164487b, "createOutgoingCall");
        int i12 = Z.f406624c;
        this.f164488c.resumeWith(C48564c.a(callState));
    }
}
