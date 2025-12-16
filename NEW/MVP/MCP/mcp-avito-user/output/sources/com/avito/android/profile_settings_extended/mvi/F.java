package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsImageActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$processGalleryItemAction$1", f = "ExtendedProfileSettingsImageActor.kt", i = {0, 2}, l = {144, 150, 159, 172}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes16.dex */
final class F extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230420q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f230421r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yc0.o f230422s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B f230423t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(yc0.o oVar, B b12, Continuation<? super F> continuation) {
        super(2, continuation);
        this.f230422s = oVar;
        this.f230423t = b12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        F f12 = new F(this.f230422s, this.f230423t, continuation);
        f12.f230421r = obj;
        return f12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((F) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.F.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
