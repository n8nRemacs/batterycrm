package com.avito.android.bxcontent.mvi.sources;

import Y41.p;
import Y61.k;
import com.avito.android.bxcontent.mvi.entity.l;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceOrderRequestsDataSource.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062&\u0010\u0005\u001a\"\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0003\u0012\u0004\u0012\u00020\u00040\u00000\u0000H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lcom/avito/android/service_order_widget/storage/ItemId;", "Lcom/avito/android/service_order_widget/storage/FormId;", "", "itemRequests", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Ljava/util/Map;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.sources.ServiceOrderRequestsDataSourceImpl$observeServiceOrderRequests$1", f = "ServiceOrderRequestsDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements p<Map<String, ? extends Map<String, ? extends Boolean>>, Continuation<? super InterfaceC43160i<? extends String>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f112552q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f112553r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<l> f112554s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Y41.a aVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.f112553r = eVar;
        this.f112554s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f112554s, this.f112553r, continuation);
        bVar.f112552q = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(Map<String, ? extends Map<String, ? extends Boolean>> map, Continuation<? super InterfaceC43160i<? extends String>> continuation) {
        return ((b) create(map, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f112553r.f112561c.c(this.f112554s.invoke().f().f112428e, (Map) this.f112552q);
    }
}
