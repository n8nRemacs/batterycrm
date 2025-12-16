package com.avito.android.publish.slots.user_verification.blocker;

import Y61.k;
import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UserVerificationBlockerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/user_verification/blocker/f;", "Lcom/avito/android/publish/slots/user_verification/blocker/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f245114b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f245115c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f245114b = cVar;
        this.f245115c = new C41981q0(cVar);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.e(cVar.f245109d);
        hVar.r(cVar.f245110e);
        hVar.Wb(cVar.f245111f, new e(this));
        hVar.DQ(cVar.f245112g);
    }

    @Override // com.avito.android.publish.slots.user_verification.blocker.d
    @k
    /* renamed from: f5, reason: from getter */
    public final C41981q0 getF245115c() {
        return this.f245115c;
    }
}
