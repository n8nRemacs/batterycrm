package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsImageActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$processSelectedGalleryImage$2", f = "ExtendedProfileSettingsImageActor.kt", i = {}, l = {401}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class K extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230475q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f230476r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f230477s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f230478t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> f230479u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Y41.a aVar, B b12, String str, Continuation continuation) {
        super(3, continuation);
        this.f230477s = b12;
        this.f230478t = str;
        this.f230479u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> aVar = this.f230479u;
        String str = this.f230478t;
        K k12 = new K(aVar, this.f230477s, str, continuation);
        k12.f230476r = interfaceC43172j;
        return k12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f230475q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f230476r;
            InterfaceC43160i<ExtendedProfileSettingsInternalAction> interfaceC43160iB = this.f230477s.b(this.f230478t, this.f230479u, null);
            this.f230475q = 1;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
