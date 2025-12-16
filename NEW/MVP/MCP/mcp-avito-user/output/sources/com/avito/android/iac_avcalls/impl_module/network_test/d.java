package com.avito.android.iac_avcalls.impl_module.network_test;

import Y61.l;
import com.avito.avcalls.android.a;
import com.avito.avcalls.android.network_test.p;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.r;

/* compiled from: AvCallsNetworkTestImplV1.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/network_test/d;", "LKJ/a;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements KJ.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a.e f164331a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f164332b = C42727D.c(new b());

    /* compiled from: AvCallsNetworkTestImplV1.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/network_test/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AvCallsNetworkTestImplV1.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/avcalls/android/network_test/p;", "invoke", "()Lcom/avito/avcalls/android/network_test/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<p> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final p invoke() {
            return new p(d.this.f164331a, new com.avito.android.bxcontent.mvi.entity.f(23));
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@Y61.k a.e eVar) {
        this.f164331a = eVar;
    }

    @Override // KJ.a
    @l
    public final Object a(@Y61.k Continuation continuation) {
        r rVar = new r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        rVar.r(new e(atomicBoolean, ((p) this.f164332b.getValue()).a(new f(atomicBoolean, rVar))));
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO;
    }
}
