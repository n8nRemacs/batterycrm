package com.avito.android.session_refresh;

import Y41.p;
import com.avito.android.session_refresh.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: SessionRefresher.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.session_refresh.SessionRefresher$Impl$refreshSessionWithKmmMutex$1", f = "SessionRefresher.kt", i = {0}, l = {239}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class k extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f280704q;

    /* renamed from: r, reason: collision with root package name */
    public l.a f280705r;

    /* renamed from: s, reason: collision with root package name */
    public String f280706s;

    /* renamed from: t, reason: collision with root package name */
    public Object f280707t;

    /* renamed from: u, reason: collision with root package name */
    public String f280708u;

    /* renamed from: v, reason: collision with root package name */
    public int f280709v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l.a f280710w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f280711x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f280712y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f280713z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l.a aVar, String str, Y41.l<? super Request, Response> lVar, String str2, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f280710w = aVar;
        this.f280711x = str;
        this.f280712y = lVar;
        this.f280713z = str2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f280710w, this.f280711x, this.f280712y, this.f280713z, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Boolean> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        kotlinx.coroutines.sync.a aVar;
        String str;
        String str2;
        l.a aVar2;
        Y41.l lVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f280709v;
        if (i12 == 0) {
            C42729a0.b(obj);
            aVar = m.f280721a;
            this.f280704q = aVar;
            l.a aVar3 = this.f280710w;
            this.f280705r = aVar3;
            String str3 = this.f280711x;
            this.f280706s = str3;
            Object obj2 = this.f280712y;
            this.f280707t = obj2;
            String str4 = this.f280713z;
            this.f280708u = str4;
            this.f280709v = 1;
            if (aVar.b(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str3;
            str2 = str4;
            lVar = obj2;
            aVar2 = aVar3;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = this.f280708u;
            Y41.l lVar2 = (Y41.l) this.f280707t;
            str = this.f280706s;
            l.a aVar4 = this.f280705r;
            aVar = this.f280704q;
            C42729a0.b(obj);
            lVar = lVar2;
            aVar2 = aVar4;
        }
        try {
            return Boxing.boxBoolean(aVar2.b(lVar, str, str2));
        } finally {
            aVar.d(null);
        }
    }
}
