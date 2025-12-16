package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.h;
import com.avito.android.remote.model.SearchParams;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BxContentActor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/bxcontent/last_search_tooltip/b;", "Lcom/avito/android/bxcontent/last_search_tooltip/a;", "<anonymous>", "(Lcom/avito/android/bxcontent/last_search_tooltip/b;)Lcom/avito/android/bxcontent/last_search_tooltip/a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$1$1", f = "BxContentActor.kt", i = {}, l = {JfifUtil.MARKER_RST7}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29194f extends SuspendLambda implements Y41.p<com.avito.android.bxcontent.last_search_tooltip.b, Continuation<? super com.avito.android.bxcontent.last_search_tooltip.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f112448q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f112449r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.h f112450s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29194f(com.avito.android.bxcontent.mvi.entity.h hVar, Continuation<? super C29194f> continuation) {
        super(2, continuation);
        this.f112450s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29194f c29194f = new C29194f(this.f112450s, continuation);
        c29194f.f112449r = obj;
        return c29194f;
    }

    @Override // Y41.p
    public final Object invoke(com.avito.android.bxcontent.last_search_tooltip.b bVar, Continuation<? super com.avito.android.bxcontent.last_search_tooltip.a> continuation) {
        return ((C29194f) create(bVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f112448q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.bxcontent.last_search_tooltip.b bVar = (com.avito.android.bxcontent.last_search_tooltip.b) this.f112449r;
            com.avito.android.bxcontent.mvi.entity.i iVar = ((h.a) this.f112450s).f112293a;
            SearchParams searchParams = iVar.f112295a;
            String str = iVar.f112296b;
            this.f112448q = 1;
            obj = bVar.a(searchParams, str, this);
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
