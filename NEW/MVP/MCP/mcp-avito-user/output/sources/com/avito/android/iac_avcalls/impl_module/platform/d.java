package com.avito.android.iac_avcalls.impl_module.platform;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCallState;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCameraPosition;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCreateCallMetaInfo;
import com.avito.android.iac_avcalls.public_module.models.AvCallsEvent;
import com.avito.android.iac_avcalls.public_module.models.AvCallsTerminateReason;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.avcalls.a;
import com.avito.avcalls.call.models.CameraPosition;
import com.avito.avcalls.call.models.CreateCallMetaInfo;
import com.avito.avcalls.call.models.TerminateReason;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.d2;
import xJ.C49847b;

/* compiled from: AvCallsPlatformWithCoroutines.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/d;", "Lcom/avito/android/iac_avcalls/impl_module/platform/c;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.iac_avcalls.impl_module.platform.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_avcalls.impl_module.platform.avcalls.a f164440a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f164441b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f164442c;

    /* compiled from: AvCallsPlatformWithCoroutines.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/a$c;", "callback", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/a$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<a.c, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f164444m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f164444m = str;
        }

        @Override // Y41.l
        public final G0 invoke(a.c cVar) {
            d.this.f164440a.c().g(this.f164444m, cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsPlatformWithCoroutines.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f164446m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f164447n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ MJ.a f164448o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z12, MJ.a aVar) {
            super(0);
            this.f164446m = str;
            this.f164447n = z12;
            this.f164448o = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f164440a.c().f(this.f164446m, this.f164447n, (C49847b) this.f164448o);
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsPlatformWithCoroutines.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/a$h;", "callback", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/a$h;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<a.h, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f164450m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f164451n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f164452o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f164453p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ AvCallsCreateCallMetaInfo f164454q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, boolean z12, AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo) {
            super(1);
            this.f164450m = str;
            this.f164451n = str2;
            this.f164452o = str3;
            this.f164453p = z12;
            this.f164454q = avCallsCreateCallMetaInfo;
        }

        @Override // Y41.l
        public final G0 invoke(a.h hVar) {
            a.h hVar2 = hVar;
            com.avito.avcalls.a aVarC = d.this.f164440a.c();
            AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo = this.f164454q;
            aVarC.m(this.f164450m, this.f164451n, this.f164452o, this.f164453p, new CreateCallMetaInfo(avCallsCreateCallMetaInfo.getScenario(), avCallsCreateCallMetaInfo.getItemId(), avCallsCreateCallMetaInfo.getExtraInfo()), hVar2);
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsPlatformWithCoroutines.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.iac_avcalls.impl_module.platform.d$d, reason: collision with other inner class name */
    public static final class C4810d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f164456m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f164457n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ MJ.a f164458o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4810d(String str, boolean z12, MJ.a aVar) {
            super(0);
            this.f164456m = str;
            this.f164457n = z12;
            this.f164458o = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f164440a.c().i(this.f164456m, this.f164457n, (C49847b) this.f164458o);
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsPlatformWithCoroutines.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f164460m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f164461n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z12) {
            super(0);
            this.f164460m = str;
            this.f164461n = z12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f164440a.c().c(this.f164460m, this.f164461n);
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsPlatformWithCoroutines.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f164463m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f164464n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z12) {
            super(0);
            this.f164463m = str;
            this.f164464n = z12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f164440a.c().a(this.f164463m, this.f164464n);
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsPlatformWithCoroutines.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LJJ/b;", "invoke", "()LJJ/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<JJ.b> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final JJ.b invoke() {
            return new JJ.b(d.this.f164440a.c().getConfig().f332854e);
        }
    }

    /* compiled from: AvCallsPlatformWithCoroutines.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/a$c;", "callback", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/a$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<a.c, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IacPiiString f164467m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(IacPiiString iacPiiString) {
            super(1);
            this.f164467m = iacPiiString;
        }

        @Override // Y41.l
        public final G0 invoke(a.c cVar) {
            d.this.f164440a.c().k(this.f164467m.unwrap(), cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsPlatformWithCoroutines.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/a$c;", "callback", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/a$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<a.c, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IacPiiString f164469m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(IacPiiString iacPiiString) {
            super(1);
            this.f164469m = iacPiiString;
        }

        @Override // Y41.l
        public final G0 invoke(a.c cVar) {
            d.this.f164440a.c().l(this.f164469m.unwrap(), cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsPlatformWithCoroutines.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j extends N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f164471m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f164472n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2) {
            super(0);
            this.f164471m = str;
            this.f164472n = str2;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(d.this.f164440a.c().b(this.f164471m, this.f164472n));
        }
    }

    /* compiled from: AvCallsPlatformWithCoroutines.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/a$c;", "callback", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/a$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<a.c, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f164474m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(1);
            this.f164474m = str;
        }

        @Override // Y41.l
        public final G0 invoke(a.c cVar) {
            d.this.f164440a.c().e(this.f164474m, cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsPlatformWithCoroutines.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/a$c;", "callback", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/a$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<a.c, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f164476m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(1);
            this.f164476m = str;
        }

        @Override // Y41.l
        public final G0 invoke(a.c cVar) {
            d.this.f164440a.c().j(this.f164476m, cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsPlatformWithCoroutines.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AvCallsCameraPosition f164478m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(AvCallsCameraPosition avCallsCameraPosition) {
            super(0);
            this.f164478m = avCallsCameraPosition;
        }

        @Override // Y41.a
        public final G0 invoke() {
            CameraPosition cameraPosition;
            com.avito.avcalls.a aVarC = d.this.f164440a.c();
            int iOrdinal = this.f164478m.ordinal();
            if (iOrdinal == 0) {
                cameraPosition = CameraPosition.FRONT;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                cameraPosition = CameraPosition.BACK;
            }
            aVarC.d(cameraPosition);
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsPlatformWithCoroutines.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/a$c;", "callback", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/a$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.l<a.c, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f164480m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AvCallsTerminateReason f164481n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, AvCallsTerminateReason avCallsTerminateReason) {
            super(1);
            this.f164480m = str;
            this.f164481n = avCallsTerminateReason;
        }

        @Override // Y41.l
        public final G0 invoke(a.c cVar) {
            TerminateReason unknown;
            a.c cVar2 = cVar;
            com.avito.avcalls.a aVarC = d.this.f164440a.c();
            AvCallsTerminateReason avCallsTerminateReason = this.f164481n;
            if (avCallsTerminateReason instanceof AvCallsTerminateReason.AnswerTimeout) {
                unknown = TerminateReason.AnswerTimeout.INSTANCE;
            } else if (avCallsTerminateReason instanceof AvCallsTerminateReason.Busy) {
                unknown = TerminateReason.Busy.INSTANCE;
            } else if (avCallsTerminateReason instanceof AvCallsTerminateReason.ConnectTimeout) {
                unknown = TerminateReason.ConnectTimeout.INSTANCE;
            } else if (avCallsTerminateReason instanceof AvCallsTerminateReason.Hangup) {
                unknown = TerminateReason.Hangup.INSTANCE;
            } else if (avCallsTerminateReason instanceof AvCallsTerminateReason.InternalError) {
                unknown = TerminateReason.InternalError.INSTANCE;
            } else if (avCallsTerminateReason instanceof AvCallsTerminateReason.NoMicAccess) {
                unknown = TerminateReason.NoMicAccess.INSTANCE;
            } else if (avCallsTerminateReason instanceof AvCallsTerminateReason.Reject) {
                unknown = TerminateReason.Reject.INSTANCE;
            } else if (avCallsTerminateReason instanceof AvCallsTerminateReason.ServerError) {
                unknown = TerminateReason.ServerError.INSTANCE;
            } else {
                if (!(avCallsTerminateReason instanceof AvCallsTerminateReason.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                unknown = new TerminateReason.Unknown(((AvCallsTerminateReason.Unknown) avCallsTerminateReason).getReason());
            }
            aVarC.h(this.f164480m, unknown, cVar2);
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k com.avito.android.iac_avcalls.impl_module.platform.avcalls.a aVar, @Y61.k F f12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f164440a = aVar;
        this.f164441b = f12;
        this.f164442c = interfaceC28373a;
    }

    public static final void o(d dVar, Throwable th2, String str) {
        y.a aVar = new y.a(dVar.f164441b.a("calls", "AvCallsExecutionError", str).f91030a, 1L);
        InterfaceC28373a interfaceC28373a = dVar.f164442c;
        interfaceC28373a.c(aVar);
        interfaceC28373a.c(new NonFatalErrorEvent("Error in IacDialer.".concat(str), th2, null, null, 12, null));
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    public final void a(@Y61.k String str, boolean z12) {
        q("enableSendingVideo", new f(str, z12));
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    public final boolean b(@Y61.k String str, @Y61.k String str2) {
        return ((Boolean) q("sendDtmf", new j(str, str2))).booleanValue();
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    public final void c(@Y61.k String str, boolean z12) {
        q("enableSendingAudio", new e(str, z12));
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    public final void d(@Y61.k AvCallsCameraPosition avCallsCameraPosition) {
        q("switchCamera", new m(avCallsCameraPosition));
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    public final void e(@Y61.k String str, boolean z12, @Y61.k MJ.a aVar) {
        q("detachVideoRenderer", new C4810d(str, z12, aVar));
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    @Y61.l
    public final Object f(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, @Y61.k AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo, @Y61.k Continuation<? super AvCallsCallState> continuation) throws Throwable {
        c cVar = new c(str, str3, str2, z12, avCallsCreateCallMetaInfo);
        GJ.a.f6439b.getClass();
        GJ.a aVar = new GJ.a(0L);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        cVar.invoke(new com.avito.android.iac_avcalls.impl_module.platform.f(this, aVar, safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    public final void g(@Y61.k String str, boolean z12, @Y61.k MJ.a aVar) {
        q("attachVideoRenderer", new b(str, z12, aVar));
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    @Y61.k
    public final JJ.b getConfig() {
        return (JJ.b) q("getConfig", new g());
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    @Y61.l
    public final Object h(@Y61.k String str, @Y61.k AvCallsTerminateReason avCallsTerminateReason, @Y61.k Continuation<? super G0> continuation) throws Throwable {
        Object objP = p("terminateCall", new n(str, avCallsTerminateReason), (SuspendLambda) continuation);
        return objP == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objP : G0.f406611a;
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    @Y61.k
    public final d2<AvCallsEvent> i() {
        return this.f164440a.f();
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    @Y61.l
    public final Object j(@Y61.k String str, @Y61.k Continuation<? super G0> continuation) throws Throwable {
        Object objP = p("acceptIncomingCall", new a(str), (SuspendLambda) continuation);
        return objP == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objP : G0.f406611a;
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    @Y61.l
    public final Object k(@Y61.k String str, @Y61.k Continuation<? super G0> continuation) throws Throwable {
        Object objP = p("sendRingingForIncomingCall", new k(str), (SuspendLambda) continuation);
        return objP == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objP : G0.f406611a;
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    @Y61.l
    public final Object l(@Y61.k IacPiiString iacPiiString, @Y61.k Continuation<? super G0> continuation) throws Throwable {
        Object objP = p("handleCallDeliveredByPush", new h(iacPiiString), (SuspendLambda) continuation);
        return objP == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objP : G0.f406611a;
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    @Y61.l
    public final Object m(@Y61.k IacPiiString iacPiiString, @Y61.k Continuation<? super G0> continuation) throws Throwable {
        Object objP = p("handleSocketMessage", new i(iacPiiString), (SuspendLambda) continuation);
        return objP == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objP : G0.f406611a;
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.c
    @Y61.l
    public final Object n(@Y61.k String str, @Y61.k Continuation<? super G0> continuation) throws Throwable {
        Object objP = p("startOutgoingCall", new l(str), (SuspendLambda) continuation);
        return objP == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objP : G0.f406611a;
    }

    public final Object p(String str, Y41.l lVar, SuspendLambda suspendLambda) throws Throwable {
        GJ.a.f6439b.getClass();
        GJ.a aVar = new GJ.a(0L);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(suspendLambda));
        lVar.invoke(new com.avito.android.iac_avcalls.impl_module.platform.e(this, aVar, str, safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(suspendLambda);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : G0.f406611a;
    }

    public final <T> T q(String str, Y41.a<? extends T> aVar) {
        GJ.a.f6439b.getClass();
        GJ.a aVar2 = new GJ.a(0L);
        T tInvoke = aVar.invoke();
        r(aVar2, str);
        return tInvoke;
    }

    public final void r(GJ.a aVar, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() - aVar.f6440a;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AvCallsPlatform", "'" + str + "' duration in millis: " + jCurrentTimeMillis, null);
        this.f164442c.c(new y.c(this.f164441b.a("calls", "AvCallsExecutionTime", str).f91030a, Long.valueOf(jCurrentTimeMillis), null));
    }
}
