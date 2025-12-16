package com.avito.android.messenger.channels.mvi.list_feature;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListActor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lkotlin/G0;", "<anonymous>", "(Lru/avito/messenger/MessengerUserHashInfo;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$loadNextPage$2", f = "ChannelsListActor.kt", i = {0, 1}, l = {1034, 1056}, m = "invokeSuspend", n = {"curLoadingId", "curLoadingId"}, s = {"J$0", "J$0"})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31778d extends SuspendLambda implements Y41.p<MessengerUserHashInfo, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public long f188013q;

    /* renamed from: r, reason: collision with root package name */
    public int f188014r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f188015s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.l<HY.m> f188016t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C31772a f188017u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31778d(com.avito.android.arch.mvi.utils.l<HY.m> lVar, C31772a c31772a, Continuation<? super C31778d> continuation) {
        super(2, continuation);
        this.f188016t = lVar;
        this.f188017u = c31772a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31778d c31778d = new C31778d(this.f188016t, this.f188017u, continuation);
        c31778d.f188015s = obj;
        return c31778d;
    }

    @Override // Y41.p
    public final Object invoke(MessengerUserHashInfo messengerUserHashInfo, Continuation<? super kotlin.G0> continuation) {
        return ((C31778d) create(messengerUserHashInfo, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x001a, B:54:0x0165, B:55:0x019e, B:14:0x0033, B:44:0x0107, B:46:0x0111, B:49:0x012a, B:48:0x0121, B:33:0x00c3, B:36:0x00d1, B:38:0x00d5, B:40:0x00db, B:50:0x0149), top: B:68:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x001a, B:54:0x0165, B:55:0x019e, B:14:0x0033, B:44:0x0107, B:46:0x0111, B:49:0x012a, B:48:0x0121, B:33:0x00c3, B:36:0x00d1, B:38:0x00d5, B:40:0x00db, B:50:0x0149), top: B:68:0x000e }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.C31778d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
