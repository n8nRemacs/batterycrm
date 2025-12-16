package com.avito.android.quic.tracking;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.quic.cronet.CronetTcpRstReporter;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import okhttp3.Protocol;
import okhttp3.Response;

/* compiled from: QuicRequestsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.quic.tracking.QuicRequestsTrackerImpl$reportFirstUsage$1", f = "QuicRequestsTracker.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public boolean f246358q;

    /* renamed from: r, reason: collision with root package name */
    public String f246359r;

    /* renamed from: s, reason: collision with root package name */
    public Protocol f246360s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC28373a f246361t;

    /* renamed from: u, reason: collision with root package name */
    public int f246362u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f246363v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Response f246364w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Response response, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f246363v = hVar;
        this.f246364w = response;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new f(this.f246363v, this.f246364w, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        InterfaceC28373a interfaceC28373a;
        Object objA;
        Protocol protocol;
        String str;
        boolean z12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f246362u;
        Response response = this.f246364w;
        h hVar = this.f246363v;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC28373a = hVar.f246373a;
            boolean zIsSuccessful = response.isSuccessful();
            String strA = hVar.f246374b.a();
            Protocol protocol2 = response.protocol();
            String strEncodedPath = response.request().url().encodedPath();
            this.f246359r = strA;
            this.f246360s = protocol2;
            this.f246361t = interfaceC28373a;
            this.f246358q = zIsSuccessful;
            this.f246362u = 1;
            objA = hVar.f246375c.a(strEncodedPath, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            protocol = protocol2;
            str = strA;
            z12 = zIsSuccessful;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z13 = this.f246358q;
            interfaceC28373a = this.f246361t;
            Protocol protocol3 = this.f246360s;
            String str2 = this.f246359r;
            C42729a0.b(obj);
            z12 = z13;
            protocol = protocol3;
            str = str2;
            objA = obj;
        }
        String strHost = response.request().url().host();
        boolean zB2 = hVar.f246374b.b();
        CronetTcpRstReporter.b bVar = hVar.f246376d;
        interfaceC28373a.c(new ng0.d(z12, str, protocol, zB2, strHost, (String) objA, bVar.a(), bVar.b(), hVar.f246377e.a(response.request().url().getUrl()), hVar.f246378f.d()));
        return G0.f406611a;
    }
}
