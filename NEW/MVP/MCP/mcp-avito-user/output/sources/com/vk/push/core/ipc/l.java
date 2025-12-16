package com.vk.push.core.ipc;

import android.content.ComponentName;
import android.os.IInterface;
import android.os.RemoteException;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.ipc.b;
import com.vk.push.core.ipc.q;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;

/* compiled from: BaseIPCClient.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"V", "Landroid/os/IInterface;", "T", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
@DebugMetadata(c = "com.vk.push.core.ipc.BaseIPCClient$makeAsyncRequest$2", f = "BaseIPCClient.kt", i = {}, l = {381}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class l extends SuspendLambda implements Y41.p<T, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f367067q;

    /* renamed from: r, reason: collision with root package name */
    public int f367068r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b<IInterface> f367069s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N f367070t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f367071u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ N f367072v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ N f367073w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f367074x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(b<IInterface> bVar, Y41.p<IInterface, ? super com.vk.push.core.base.a, G0> pVar, String str, Y41.p<? super AidlResult<?>, ? super T11.a, Object> pVar2, Y41.l<? super Exception, Object> lVar, Y41.l<? super String, ComponentName> lVar2, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f367069s = bVar;
        this.f367070t = (N) pVar;
        this.f367071u = str;
        this.f367072v = (N) pVar2;
        this.f367073w = (N) lVar;
        this.f367074x = lVar2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.p, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v0, types: [Y41.l, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        ?? r52 = this.f367073w;
        ?? r62 = this.f367074x;
        return new l(this.f367069s, this.f367070t, this.f367071u, this.f367072v, r52, r62, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<Object> continuation) {
        return ((l) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.p, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v0, types: [Y41.p, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r8v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f367068r;
        if (i12 == 0) {
            C42729a0.b(obj);
            b<IInterface> bVar = this.f367069s;
            ?? r42 = this.f367070t;
            String str = this.f367071u;
            ?? r62 = this.f367072v;
            ?? r82 = this.f367073w;
            ?? r12 = this.f367074x;
            this.f367067q = r12;
            this.f367068r = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this));
            rVar.p();
            q.a aVar = new q.a(r42, str, r62, bVar.i(), r82, rVar);
            b.C10839b<T> c10839b = bVar.f367040h;
            IInterface iInterface = c10839b != 0 ? c10839b.f367048c : null;
            b.C10839b<T> c10839b2 = bVar.f367040h;
            T11.a aVar2 = c10839b2 != 0 ? c10839b2.f367046a : null;
            if (iInterface == null || aVar2 == null) {
                Iterator<T11.a> it = bVar.f367034b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bVar.i().error("No available hosts found. Binding has failed, giving up.", null);
                        com.vk.push.core.utils.d.a(aVar.f367086b, aVar.f367085a.invoke(new NoHostsToBindException()));
                        break;
                    }
                    T11.a next = it.next();
                    try {
                        ComponentName componentName = (ComponentName) r12.invoke(next.f15306a);
                        if (componentName == null) {
                            bVar.i().a("Component name from host " + next.f15306a + " is null", null);
                        } else if (bVar.e(next, componentName, aVar)) {
                            break;
                        }
                    } catch (SecurityException e12) {
                        bVar.i().error("No permission to bind to " + next.f15306a, e12);
                    } catch (Exception e13) {
                        bVar.i().error("Unable to bind service", e13);
                    }
                }
            } else {
                try {
                    bVar.f367043k.add(aVar);
                    aVar.a(iInterface, aVar2, new g(bVar));
                } catch (RemoteException e14) {
                    bVar.i().a("RemoteException while executing request", e14);
                }
            }
            obj = rVar.o();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
