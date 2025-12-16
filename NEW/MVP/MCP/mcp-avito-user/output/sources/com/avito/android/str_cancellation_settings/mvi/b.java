package com.avito.android.str_cancellation_settings.mvi;

import Vy0.C15729a;
import com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction;
import com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsState;
import java.util.Date;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCancellationSettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_cancellation_settings.mvi.StrCancellationSettingsActor$handleApplyButtonClick$1", f = "StrCancellationSettingsActor.kt", i = {}, l = {117, 124}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrCancellationSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f288424q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f288425r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StrCancellationSettingsState f288426s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f288427t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(StrCancellationSettingsState strCancellationSettingsState, a aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f288426s = strCancellationSettingsState;
        this.f288427t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f288426s, this.f288427t, continuation);
        bVar.f288425r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrCancellationSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Ry0.c cVar;
        Ry0.c cVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f288424q;
        if (i12 != 0) {
            if (i12 == 1) {
                C42729a0.b(obj);
                return G0.f406611a;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f288425r;
        StrCancellationSettingsState strCancellationSettingsState = this.f288426s;
        if (strCancellationSettingsState.f288472l == StrCancellationSettingsState.LoadingType.f288478e) {
            return G0.f406611a;
        }
        a aVar = this.f288427t;
        com.avito.android.str_cancellation_settings.domain.a aVar2 = aVar.f288421c;
        Long l12 = strCancellationSettingsState.f288463c;
        aVar2.b(String.valueOf(l12));
        Ry0.h hVar = strCancellationSettingsState.f288462b;
        if (!aVar.f288420b.a(strCancellationSettingsState.f288469i, strCancellationSettingsState.f288466f, strCancellationSettingsState.f288468h, (hVar == null || (cVar2 = hVar.f14782b) == null) ? null : cVar2.f14768d.f14760b, (hVar == null || (cVar = hVar.f14782b) == null) ? null : cVar.f14768d.f14761c)) {
            StrCancellationSettingsInternalAction.ShowDiscountInputError showDiscountInputError = new StrCancellationSettingsInternalAction.ShowDiscountInputError(null);
            this.f288424q = 1;
            if (interfaceC43172j.emit(showDiscountInputError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        if (l12 != null) {
            long jLongValue = l12.longValue();
            Date date = strCancellationSettingsState.f288464d;
            String strB = date != null ? C15729a.b(date) : null;
            Date date2 = strCancellationSettingsState.f288465e;
            String strB2 = date2 != null ? C15729a.b(date2) : null;
            boolean z12 = strCancellationSettingsState.f288466f;
            Integer num = z12 ? strCancellationSettingsState.f288467g : null;
            Boolean boolBoxBoolean = Boxing.boxBoolean(strCancellationSettingsState.f288468h);
            boolBoxBoolean.getClass();
            Boolean bool = z12 ? boolBoxBoolean : null;
            String str = strCancellationSettingsState.f288469i;
            com.avito.android.str_cancellation_settings.domain.g gVarA = aVar.f288419a.a(jLongValue, strB, strB2, z12, num, bool, str != null ? C43066x.y0(str) : null);
            this.f288424q = 2;
            if (C43175k.u(this, gVarA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
