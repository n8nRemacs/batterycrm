package com.avito.android.entry_point_client_room.report.mvi;

import Y41.p;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.entry_point_client_room.report.mvi.entity.SendReportInternalAction;
import com.avito.android.util.C5;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;
import sz.AbstractC48438c;

/* compiled from: SendReportActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.entry_point_client_room.report.mvi.SendReportActor$process$1", f = "SendReportActor.kt", i = {}, l = {30, 40, 42, 47, 48}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super SendReportInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f147696q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f147697r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC48438c f147698s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ sz.e f147699t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f147700u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AbstractC48438c abstractC48438c, sz.e eVar, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f147698s = abstractC48438c;
        this.f147699t = eVar;
        this.f147700u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f147698s, this.f147699t, this.f147700u, continuation);
        aVar.f147697r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SendReportInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f147696q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f147697r;
            AbstractC48438c.a aVar = AbstractC48438c.a.f438943a;
            AbstractC48438c abstractC48438c = this.f147698s;
            if (L.f(abstractC48438c, aVar)) {
                SendReportInternalAction.Close close = SendReportInternalAction.Close.f147715b;
                this.f147696q = 1;
                if (interfaceC43172j.emit(close, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                boolean zF2 = L.f(abstractC48438c, AbstractC48438c.C12653c.f438945a);
                b bVar = this.f147700u;
                if (zF2) {
                    sz.e eVar = this.f147699t;
                    if (C5.f318568b.e(eVar.f438952d.f438938a)) {
                        bVar.f147702b.c(eVar.f438953e.f438938a, eVar.f438952d.f438938a, bVar.f147703c, bVar.f147704d, bVar.f147705e);
                        SendReportInternalAction.CloseWithOkResult closeWithOkResult = SendReportInternalAction.CloseWithOkResult.f147716b;
                        this.f147696q = 2;
                        if (interfaceC43172j.emit(closeWithOkResult, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        SendReportInternalAction.ErrorOnPhoneInput errorOnPhoneInput = SendReportInternalAction.ErrorOnPhoneInput.f147717b;
                        this.f147696q = 3;
                        if (interfaceC43172j.emit(errorOnPhoneInput, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (abstractC48438c instanceof AbstractC48438c.b) {
                    b.a.a(bVar.f147701a, ((AbstractC48438c.b) abstractC48438c).f438944a, null, null, 6);
                } else if (abstractC48438c instanceof AbstractC48438c.d) {
                    SendReportInternalAction.UpdateDescriptionInput updateDescriptionInput = new SendReportInternalAction.UpdateDescriptionInput(((AbstractC48438c.d) abstractC48438c).f438946a);
                    this.f147696q = 4;
                    if (interfaceC43172j.emit(updateDescriptionInput, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (abstractC48438c instanceof AbstractC48438c.e) {
                    SendReportInternalAction.UpdatePhoneInput updatePhoneInput = new SendReportInternalAction.UpdatePhoneInput(((AbstractC48438c.e) abstractC48438c).f438947a);
                    this.f147696q = 5;
                    if (interfaceC43172j.emit(updatePhoneInput, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4 && i12 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
