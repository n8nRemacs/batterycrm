package com.avito.android.leakcanary.release;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import leakcanary.C43756n;

/* compiled from: ReleaseLeakCanaryInitializer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lleakcanary/n;", "invoke", "()Lleakcanary/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements Y41.a<C43756n> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Application, C43756n> f175086l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f175087m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Y41.l<? super Application, C43756n> lVar, f fVar) {
        super(0);
        this.f175086l = lVar;
        this.f175087m = fVar;
    }

    @Override // Y41.a
    public final C43756n invoke() {
        return this.f175086l.invoke(this.f175087m.f175080a);
    }
}
