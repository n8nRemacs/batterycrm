package com.avito.android.safety.password_change.mvi;

import com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PasswordChangeActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "internalAction", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.password_change.mvi.PasswordChangeActor$changePassword$1", f = "PasswordChangeActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements Y41.p<PasswordChangeInternalAction, Continuation<? super InterfaceC43160i<? extends PasswordChangeInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f257290q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f257291r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f257292s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f257293t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, d dVar, String str2, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f257291r = str;
        this.f257292s = dVar;
        this.f257293t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f257291r, this.f257292s, this.f257293t, continuation);
        aVar.f257290q = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(PasswordChangeInternalAction passwordChangeInternalAction, Continuation<? super InterfaceC43160i<? extends PasswordChangeInternalAction>> continuation) {
        return ((a) create(passwordChangeInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        PasswordChangeInternalAction passwordChangeInternalAction = (PasswordChangeInternalAction) this.f257290q;
        if (!(passwordChangeInternalAction instanceof PasswordChangeInternalAction.FinishContent)) {
            return new C43210w(passwordChangeInternalAction);
        }
        String str = this.f257291r;
        if (str != null) {
            d dVar = this.f257292s;
            dVar.getClass();
            return C43175k.G(new c(dVar, str, this.f257293t, (PasswordChangeInternalAction.FinishContent) passwordChangeInternalAction, null));
        }
        PasswordChangeInternalAction.FinishContent finishContent = (PasswordChangeInternalAction.FinishContent) passwordChangeInternalAction;
        String str2 = finishContent.f257321b;
        String str3 = finishContent.f257322c;
        return new C43207v(new PasswordChangeInternalAction[]{new PasswordChangeInternalAction.FinishContent(str2, str3), new PasswordChangeInternalAction.Finish(str2, str3)});
    }
}
