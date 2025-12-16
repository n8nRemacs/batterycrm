package com.avito.android.iac_avcalls.impl_module.platform_v1;

import GJ.a;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.t;
import com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.x;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCallState;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCameraPosition;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCreateCallMetaInfo;
import com.avito.android.iac_avcalls.public_module.models.AvCallsEvent;
import com.avito.android.iac_avcalls.public_module.models.AvCallsTerminateReason;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.avcalls.android.call.models.CreateCallMetaInfo;
import com.avito.avcalls.android.video.CameraPosition;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.core.M;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.completable.C41816g;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import io.reactivex.rxjava3.internal.operators.single.C42019q;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: AvCallsPlatformImplV1.kt */
@Singleton
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/d;", "LHJ/a;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements HJ.a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f164594e = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f164595a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final t f164596b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final F f164597c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f164598d;

    /* compiled from: AvCallsPlatformImplV1.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AvCallsPlatformImplV1.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LxQ0/b;", "it", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;", "apply", "(LxQ0/b;)Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f164599b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return DJ.c.a((xQ0.b) obj);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@k x xVar, @k t tVar, @k F f12, @k InterfaceC28373a interfaceC28373a) {
        this.f164595a = xVar;
        this.f164596b = tVar;
        this.f164597c = f12;
        this.f164598d = interfaceC28373a;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.d("AvCallsPlatform", "AvCallsPlatformV1 instance is initialized", null);
    }

    @Override // HJ.a
    public final void a(@k String str, boolean z12) {
        GJ.a.f6439b.getClass();
        GJ.a aVarA = a.C0343a.a();
        try {
            this.f164595a.a().a(str, z12);
            G0 g02 = G0.f406611a;
        } finally {
        }
    }

    @Override // HJ.a
    public final boolean b(@k String str, @k String str2) {
        GJ.a.f6439b.getClass();
        GJ.a aVarA = a.C0343a.a();
        try {
            return this.f164595a.a().b(str, str2);
        } finally {
        }
    }

    @Override // HJ.a
    public final void c(@k String str, boolean z12) {
        GJ.a.f6439b.getClass();
        GJ.a aVarA = a.C0343a.a();
        try {
            this.f164595a.a().c(str, z12);
            G0 g02 = G0.f406611a;
        } finally {
        }
    }

    @Override // HJ.a
    public final void d(@k AvCallsCameraPosition avCallsCameraPosition) {
        CameraPosition cameraPosition;
        GJ.a.f6439b.getClass();
        GJ.a aVarA = a.C0343a.a();
        try {
            com.avito.avcalls.android.a aVarA2 = this.f164595a.a();
            int iOrdinal = avCallsCameraPosition.ordinal();
            if (iOrdinal == 0) {
                cameraPosition = CameraPosition.f332471b;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                cameraPosition = CameraPosition.f332472c;
            }
            aVarA2.d(cameraPosition);
            G0 g02 = G0.f406611a;
        } catch (Throwable th2) {
            try {
                p("switchCamera", th2);
                throw th2;
            } finally {
                q(aVarA, "switchCamera");
            }
        }
    }

    @Override // HJ.a
    public final void e(@k String str, boolean z12, @k MJ.a aVar) {
        GJ.a.f6439b.getClass();
        GJ.a aVarA = a.C0343a.a();
        try {
            this.f164595a.a().f(str, z12, ((EJ.c) aVar).f3928a);
            G0 g02 = G0.f406611a;
        } finally {
        }
    }

    @Override // HJ.a
    @k
    public final z<AvCallsEvent> f() {
        return this.f164596b.f();
    }

    @Override // HJ.a
    public final void g(@k String str, boolean z12, @k MJ.a aVar) {
        GJ.a.f6439b.getClass();
        GJ.a aVarA = a.C0343a.a();
        try {
            this.f164595a.a().i(str, z12, ((EJ.c) aVar).f3928a);
            G0 g02 = G0.f406611a;
        } finally {
        }
    }

    @Override // HJ.a
    @k
    public final JJ.b getConfig() {
        return new JJ.b(this.f164595a.a().getConfig().f331657e);
    }

    @Override // HJ.a
    @k
    public final I<G0> h(@k String str, @k AvCallsTerminateReason avCallsTerminateReason) {
        return o(new C41816g(new FX0.b(this, str, avCallsTerminateReason, 9)).B(G0.f406611a), "terminateCall");
    }

    @Override // HJ.a
    @k
    public final I<G0> i(@k String str) {
        return o(new C41816g(new com.avito.android.iac_avcalls.impl_module.platform_v1.b(this, str, 1)).B(G0.f406611a), "acceptIncomingCall");
    }

    @Override // HJ.a
    @k
    public final I<G0> j(@k String str) {
        return o(new C41816g(new com.avito.android.iac_avcalls.impl_module.platform_v1.b(this, str, 0)).B(G0.f406611a), "startOutgoingCall");
    }

    @Override // HJ.a
    @k
    public final I<G0> k(@k IacPiiString iacPiiString) {
        return o(new C41816g(new com.avito.android.iac_avcalls.impl_module.platform_v1.a(this, iacPiiString, 0)).B(G0.f406611a), "onExternalSignalingTransportEvent");
    }

    @Override // HJ.a
    @k
    public final I<G0> l(@k String str) {
        return o(new C41816g(new com.avito.android.iac_avcalls.impl_module.platform_v1.b(this, str, 2)).B(G0.f406611a), "sendRingingForIncomingCall");
    }

    @Override // HJ.a
    @k
    public final I<G0> m(@k IacPiiString iacPiiString) {
        return o(new C41816g(new com.avito.android.iac_avcalls.impl_module.platform_v1.a(this, iacPiiString, 1)).B(G0.f406611a), "onPushNotification");
    }

    @Override // HJ.a
    @k
    public final I<AvCallsCallState> n(@k final String str, @k final String str2, @k final String str3, final boolean z12, @k final AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo) {
        return o(new C42006d(new M() { // from class: com.avito.android.iac_avcalls.impl_module.platform_v1.c
            @Override // io.reactivex.rxjava3.core.M
            public final void j(K k12) {
                com.avito.avcalls.android.a aVarA = this.f164588b.f164595a.a();
                AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo2 = avCallsCreateCallMetaInfo;
                CreateCallMetaInfo createCallMetaInfo = new CreateCallMetaInfo(avCallsCreateCallMetaInfo2.getScenario(), avCallsCreateCallMetaInfo2.getItemId(), avCallsCreateCallMetaInfo2.getExtraInfo());
                com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.e eVar = new com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.e(k12);
                aVarA.g(str, str3, str2, z12, createCallMetaInfo, eVar);
            }
        }), "createOutgoingCall").r(b.f164599b);
    }

    public final C42019q o(I i12, String str) {
        GJ.a.f6439b.getClass();
        GJ.a aVar = new GJ.a(0L);
        return I.q(G0.f406611a).n(new e(aVar, i12)).k(new f(this, str, aVar)).i(new g(this, str, aVar));
    }

    public final void p(String str, Throwable th2) {
        y.a aVar = new y.a(this.f164597c.a("calls", "AvCallsExecutionError", str).f91030a, 1L);
        InterfaceC28373a interfaceC28373a = this.f164598d;
        interfaceC28373a.c(aVar);
        interfaceC28373a.c(new NonFatalErrorEvent("Error in IacDialer.".concat(str), th2, null, null, 12, null));
    }

    public final void q(GJ.a aVar, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() - aVar.f6440a;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AvCallsPlatform", "AvCallsPlatform: '" + str + "' duration in millis: " + jCurrentTimeMillis, null);
        this.f164598d.c(new y.c(this.f164597c.a("calls", "AvCallsExecutionTime", str).f91030a, Long.valueOf(jCurrentTimeMillis), null));
    }
}
