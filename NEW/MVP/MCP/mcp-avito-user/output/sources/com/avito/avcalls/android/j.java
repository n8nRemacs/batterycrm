package com.avito.avcalls.android;

import com.avito.avcalls.android.call.C36177e;
import com.avito.avcalls.android.call.models.CreateCallMetaInfo;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AvCallsImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LxQ0/b;", "<anonymous>", "()LxQ0/b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.AvCallsImpl$createOutgoingCall$1", f = "AvCallsImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class j extends SuspendLambda implements Y41.l<Continuation<? super xQ0.b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g f331710q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f331711r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f331712s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f331713t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f331714u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ CreateCallMetaInfo f331715v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, String str, String str2, String str3, boolean z12, CreateCallMetaInfo createCallMetaInfo, Continuation<? super j> continuation) {
        super(1, continuation);
        this.f331710q = gVar;
        this.f331711r = str;
        this.f331712s = str2;
        this.f331713t = str3;
        this.f331714u = z12;
        this.f331715v = createCallMetaInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new j(this.f331710q, this.f331711r, this.f331712s, this.f331713t, this.f331714u, this.f331715v, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super xQ0.b> continuation) {
        return ((j) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C36177e c36177e = this.f331710q.f331703b;
        CreateCallMetaInfo createCallMetaInfo = this.f331715v;
        return c36177e.e(this.f331711r, this.f331712s, this.f331713t, this.f331714u, createCallMetaInfo);
    }
}
