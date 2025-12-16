package com.avito.android.safety.password_setting.mvi;

import Y41.p;
import com.avito.android.safety.password_setting.mvi.entity.PasswordSettingInternalAction;
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

/* compiled from: PasswordSettingActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "internalAction", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.password_setting.mvi.PasswordSettingActor$setPassword$1", f = "PasswordSettingActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements p<PasswordSettingInternalAction, Continuation<? super InterfaceC43160i<? extends PasswordSettingInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f257480q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f257481r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f257482s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f257483t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, c cVar, String str2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f257481r = str;
        this.f257482s = cVar;
        this.f257483t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f257481r, this.f257482s, this.f257483t, continuation);
        bVar.f257480q = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(PasswordSettingInternalAction passwordSettingInternalAction, Continuation<? super InterfaceC43160i<? extends PasswordSettingInternalAction>> continuation) {
        return ((b) create(passwordSettingInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        PasswordSettingInternalAction passwordSettingInternalAction = (PasswordSettingInternalAction) this.f257480q;
        if (!(passwordSettingInternalAction instanceof PasswordSettingInternalAction.FinishContent)) {
            return new C43210w(passwordSettingInternalAction);
        }
        String str = this.f257481r;
        if (str != null) {
            c cVar = this.f257482s;
            cVar.getClass();
            return C43175k.G(new a(cVar, str, this.f257483t, (PasswordSettingInternalAction.FinishContent) passwordSettingInternalAction, null));
        }
        PasswordSettingInternalAction.FinishContent finishContent = (PasswordSettingInternalAction.FinishContent) passwordSettingInternalAction;
        String str2 = finishContent.f257493b;
        String str3 = finishContent.f257494c;
        return new C43207v(new PasswordSettingInternalAction[]{new PasswordSettingInternalAction.FinishContent(str2, str3), new PasswordSettingInternalAction.Finish(str2, str3)});
    }
}
