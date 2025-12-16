package com.avito.android.quic.tracking;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.quic.p;
import java.io.IOException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import okhttp3.HttpUrl;
import okhttp3.Protocol;

/* compiled from: NetworkRequestsResultsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.quic.tracking.NetworkRequestsResultsTrackerImpl$onSingleRequest$1", f = "NetworkRequestsResultsTracker.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f246332q;

    /* renamed from: r, reason: collision with root package name */
    public String f246333r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC28373a f246334s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f246335t;

    /* renamed from: u, reason: collision with root package name */
    public int f246336u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f246337v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Protocol f246338w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ HttpUrl f246339x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ IOException f246340y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f246341z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Protocol protocol, HttpUrl httpUrl, IOException iOException, boolean z12, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f246337v = cVar;
        this.f246338w = protocol;
        this.f246339x = httpUrl;
        this.f246340y = iOException;
        this.f246341z = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f246337v, this.f246338w, this.f246339x, this.f246340y, this.f246341z, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        InterfaceC28373a interfaceC28373a;
        Object objA;
        boolean z12;
        String str;
        String str2;
        String url;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f246336u;
        HttpUrl httpUrl = this.f246339x;
        String strA = null;
        c cVar = this.f246337v;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC28373a = cVar.f246342a;
            p.b bVar = cVar.f246343b;
            String strA2 = bVar.a();
            boolean zB2 = bVar.b();
            String protocol = this.f246338w.getProtocol();
            String strEncodedPath = httpUrl != null ? httpUrl.encodedPath() : null;
            if (strEncodedPath == null) {
                strEncodedPath = "";
            }
            this.f246332q = strA2;
            this.f246333r = protocol;
            this.f246334s = interfaceC28373a;
            this.f246335t = zB2;
            this.f246336u = 1;
            objA = cVar.f246344c.a(strEncodedPath, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            z12 = zB2;
            str = protocol;
            str2 = strA2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z13 = this.f246335t;
            interfaceC28373a = this.f246334s;
            String str3 = this.f246333r;
            String str4 = this.f246332q;
            C42729a0.b(obj);
            z12 = z13;
            str = str3;
            str2 = str4;
            objA = obj;
        }
        String str5 = (String) objA;
        String strHost = httpUrl != null ? httpUrl.host() : null;
        IOException iOException = this.f246340y;
        String strA3 = iOException != null ? cVar.f246346e.a(iOException) : null;
        String strA4 = cVar.f246345d.a();
        String strB = cVar.f246345d.b();
        if (httpUrl != null && (url = httpUrl.getUrl()) != null) {
            strA = cVar.f246347f.a(url);
        }
        interfaceC28373a.c(new ng0.g(this.f246341z, str2, str, z12, strHost, str5, strA3, strA4, strB, strA, cVar.f246348g.d()));
        return G0.f406611a;
    }
}
