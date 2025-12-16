package com.avito.android.quic.tracking;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.quic.cronet.CronetTcpRstReporter;
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
@DebugMetadata(c = "com.avito.android.quic.tracking.QuicRequestsTrackerImpl$reportProtocolChange$1", f = "QuicRequestsTracker.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public boolean f246365q;

    /* renamed from: r, reason: collision with root package name */
    public String f246366r;

    /* renamed from: s, reason: collision with root package name */
    public Protocol f246367s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC28373a f246368t;

    /* renamed from: u, reason: collision with root package name */
    public int f246369u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f246370v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Response f246371w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Protocol f246372x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Response response, Protocol protocol, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f246370v = hVar;
        this.f246371w = response;
        this.f246372x = protocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new g(this.f246370v, this.f246371w, this.f246372x, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
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
        int i12 = this.f246369u;
        Response response = this.f246371w;
        h hVar = this.f246370v;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC28373a = hVar.f246373a;
            boolean zIsSuccessful = response.isSuccessful();
            String strA = hVar.f246374b.a();
            Protocol protocol2 = response.protocol();
            String strEncodedPath = response.request().url().encodedPath();
            this.f246366r = strA;
            this.f246367s = protocol2;
            this.f246368t = interfaceC28373a;
            this.f246365q = zIsSuccessful;
            this.f246369u = 1;
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
            boolean z13 = this.f246365q;
            interfaceC28373a = this.f246368t;
            Protocol protocol3 = this.f246367s;
            String str2 = this.f246366r;
            C42729a0.b(obj);
            z12 = z13;
            protocol = protocol3;
            str = str2;
            objA = obj;
        }
        String strHost = response.request().url().host();
        boolean zB2 = hVar.f246374b.b();
        CronetTcpRstReporter.b bVar = hVar.f246376d;
        interfaceC28373a.c(new ng0.f(z12, str, protocol, zB2, strHost, (String) objA, this.f246372x, bVar.a(), bVar.b(), hVar.f246377e.a(response.request().url().getUrl()), hVar.f246378f.d()));
        return G0.f406611a;
    }
}
