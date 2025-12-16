package com.avito.android.iac_avcalls.impl_module.network_test;

import Y41.l;
import com.avito.avcalls.android.network_test.o;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvCallsNetworkTestImplV1.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f164334l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f164335m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AtomicBoolean atomicBoolean, o oVar) {
        super(1);
        this.f164334l = atomicBoolean;
        this.f164335m = oVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        if (!this.f164334l.getAndSet(true)) {
            this.f164335m.cancel();
        }
        return G0.f406611a;
    }
}
