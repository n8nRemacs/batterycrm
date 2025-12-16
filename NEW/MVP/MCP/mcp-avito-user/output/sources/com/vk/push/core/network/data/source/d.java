package com.vk.push.core.network.data.source;

import Y41.p;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import okhttp3.Response;

/* compiled from: MasterHostApi.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Z;", "", "LT11/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Z;"}, k = 3, mv = {1, 7, 0})
@DebugMetadata(c = "com.vk.push.core.network.data.source.MasterHostApi$getHostList$2", f = "MasterHostApi.kt", i = {1}, l = {104, 105}, m = "invokeSuspend", n = {"response$iv"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super Z<? extends List<? extends T11.a>>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Response f367105q;

    /* renamed from: r, reason: collision with root package name */
    public int f367106r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List<String> f367107s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f367108t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List<String> list, g gVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f367107s = list;
        this.f367108t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new d(this.f367107s, this.f367108t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Z<? extends List<? extends T11.a>>> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:7:0x0010, B:23:0x008c, B:25:0x0094, B:26:0x00a9, B:28:0x00af, B:29:0x00d4, B:31:0x00da, B:32:0x00ed, B:33:0x00f0, B:13:0x0020, B:19:0x0075, B:16:0x006c), top: B:39:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:7:0x0010, B:23:0x008c, B:25:0x0094, B:26:0x00a9, B:28:0x00af, B:29:0x00d4, B:31:0x00da, B:32:0x00ed, B:33:0x00f0, B:13:0x0020, B:19:0x0075, B:16:0x006c), top: B:39:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.network.data.source.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
