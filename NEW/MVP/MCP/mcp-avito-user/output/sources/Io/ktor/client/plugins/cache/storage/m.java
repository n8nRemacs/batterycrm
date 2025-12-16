package io.ktor.client.plugins.cache.storage;

import io.ktor.http.T0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: FileCacheStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2", f = "FileCacheStorage.kt", i = {0}, l = {72, 73}, m = "invokeSuspend", n = {"urlHex"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class m extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f399248q;

    /* renamed from: r, reason: collision with root package name */
    public int f399249r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f399250s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ T0 f399251t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f399252u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, T0 t02, b bVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f399250s = hVar;
        this.f399251t = t02;
        this.f399252u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new m(this.f399250s, this.f399251t, this.f399252u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String strE;
        b bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399249r;
        h hVar = this.f399250s;
        if (i12 == 0) {
            C42729a0.b(obj);
            hVar.getClass();
            strE = h.e(this.f399251t);
            this.f399248q = strE;
            this.f399249r = 1;
            obj = hVar.g(strE, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            strE = this.f399248q;
            C42729a0.b(obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            bVar = this.f399252u;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            if (!L.f(((b) next).f399194h, bVar.f399194h)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayListI0 = C42745f0.i0(bVar, arrayList);
        this.f399248q = null;
        this.f399249r = 2;
        hVar.getClass();
        if (U.c(new n(hVar, strE, arrayListI0, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
