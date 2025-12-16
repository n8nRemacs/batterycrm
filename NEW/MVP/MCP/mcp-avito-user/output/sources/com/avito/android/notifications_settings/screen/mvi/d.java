package com.avito.android.notifications_settings.screen.mvi;

import com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsInternalAction;
import com.avito.android.util.InterfaceC35741a1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: NotificationsSettingsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.notifications_settings.screen.mvi.NotificationsSettingsActor$toggleChange$2", f = "NotificationsSettingsActor.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super NotificationsSettingsInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f208112q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f208113r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f208114s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f208115t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation<? super d> continuation) {
        super(3, continuation);
        this.f208115t = eVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super NotificationsSettingsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        d dVar = new d(this.f208115t, continuation);
        dVar.f208113r = interfaceC43172j;
        dVar.f208114s = th2;
        return dVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f208112q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f208113r;
            NotificationsSettingsInternalAction.ShowSaveError showSaveError = new NotificationsSettingsInternalAction.ShowSaveError(InterfaceC35741a1.a.a(this.f208115t.f208118c, this.f208114s, null, null, 6));
            this.f208113r = null;
            this.f208112q = 1;
            if (interfaceC43172j.emit(showSaveError, this) == coroutine_suspended) {
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
