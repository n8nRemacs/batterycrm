package com.avito.android.short_term_rent.bookingform.mvi;

import com.avito.android.analytics.a0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BookingFormActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$handleButtonClick$1", f = "BookingFormActor.kt", i = {}, l = {488}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.short_term_rent.bookingform.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34970c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f281775q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f281776r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a.h f281777s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34968a f281778t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34970c(a.h hVar, C34968a c34968a, Continuation<? super C34970c> continuation) {
        super(2, continuation);
        this.f281777s = hVar;
        this.f281778t = c34968a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34970c c34970c = new C34970c(this.f281777s, this.f281778t, continuation);
        c34970c.f281776r = obj;
        return c34970c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34970c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f281775q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f281776r;
            a.h hVar = this.f281777s;
            ParametrizedEvent parametrizedEvent = hVar.f281843b;
            if (parametrizedEvent != null) {
                this.f281778t.f281766e.a(a0.a(parametrizedEvent));
            }
            DeepLink deepLink = hVar.f281842a;
            if (deepLink != null) {
                BookingFormInternalAction.OpenDeepLink openDeepLink = new BookingFormInternalAction.OpenDeepLink(deepLink, null, 2, null);
                this.f281775q = 1;
                if (interfaceC43172j.emit(openDeepLink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
