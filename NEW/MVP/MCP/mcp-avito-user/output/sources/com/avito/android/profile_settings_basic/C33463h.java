package com.avito.android.profile_settings_basic;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AvatarInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_basic/j;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_basic.AvatarInteractorImpl$uploadAvatar$2", f = "AvatarInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile_settings_basic.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33463h extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC33465j>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C33461f f228843q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33463h(C33461f c33461f, Continuation<? super C33463h> continuation) {
        super(3, continuation);
        this.f228843q = c33461f;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super InterfaceC33465j> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        return new C33463h(this.f228843q, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f228843q.f228816f = null;
        return G0.f406611a;
    }
}
