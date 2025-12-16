package com.avito.android.short_term_rent.bookingform.mvi;

import aw0.C24186b;
import aw0.C24188d;
import com.avito.android.short_term_rent.bookingform.BookingFormOpenParams;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import cw0.C39425b;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;

/* compiled from: BookingFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$handleGuestsSelectionChanged$1", f = "BookingFormActor.kt", i = {0, 0, 0}, l = {287, 298}, m = "invokeSuspend", n = {"$this$flow", "formData", "updatedGuestsData"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: com.avito.android.short_term_rent.bookingform.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34973f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C24186b f281862q;

    /* renamed from: r, reason: collision with root package name */
    public C24188d f281863r;

    /* renamed from: s, reason: collision with root package name */
    public int f281864s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f281865t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C39425b f281866u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C34968a f281867v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a.f f281868w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34973f(C39425b c39425b, C34968a c34968a, a.f fVar, Continuation<? super C34973f> continuation) {
        super(2, continuation);
        this.f281866u = c39425b;
        this.f281867v = c34968a;
        this.f281868w = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34973f c34973f = new C34973f(this.f281866u, this.f281867v, this.f281868w, continuation);
        c34973f.f281865t = obj;
        return c34973f;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34973f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        C24188d c24188d;
        C24188d c24188d2;
        C24186b c24186b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f281864s;
        C34968a c34968a = this.f281867v;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f281865t;
            C39425b c39425b = this.f281866u;
            C24186b c24186b2 = c39425b.f393066b;
            if (c24186b2 == null) {
                return G0.f406611a;
            }
            com.avito.android.short_term_rent.bookingform.mvi.interactor.a aVar = c34968a.f281766e;
            BookingFormOpenParams bookingFormOpenParams = c34968a.f281762a;
            aVar.b(bookingFormOpenParams.f281214b, bookingFormOpenParams.f281224l);
            String str = bookingFormOpenParams.f281214b;
            c34968a.f281766e.h(bookingFormOpenParams.f281220h, str, bookingFormOpenParams.f281224l);
            a.f fVar = this.f281868w;
            int i13 = fVar.f281837a;
            ArrayList arrayList = fVar.f281838b;
            int size = arrayList.size() + i13;
            C24188d c24188d3 = c39425b.f393066b.f56779c;
            int i14 = fVar.f281837a;
            if (c24188d3 != null) {
                c24188d = new C24188d(Boxing.boxInt(size), Boxing.boxInt(i14), fVar.f281839c, arrayList, c24188d3.f56795e, c24188d3.f56796f);
            } else {
                c24188d = new C24188d(Boxing.boxInt(size), Boxing.boxInt(i14), fVar.f281839c, arrayList, null, false);
            }
            BookingFormInternalAction.GuestsSelectionChanged guestsSelectionChanged = new BookingFormInternalAction.GuestsSelectionChanged(c24188d);
            this.f281865t = interfaceC43172j;
            this.f281862q = c24186b2;
            this.f281863r = c24188d;
            this.f281864s = 1;
            if (interfaceC43172j.emit(guestsSelectionChanged, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c24188d2 = c24188d;
            c24186b = c24186b2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C24188d c24188d4 = this.f281863r;
            C24186b c24186b3 = this.f281862q;
            interfaceC43172j = (InterfaceC43172j) this.f281865t;
            C42729a0.b(obj);
            c24188d2 = c24188d4;
            c24186b = c24186b3;
        }
        if (c24188d2.f56796f) {
            X xA2 = c34968a.f281763b.a(C24186b.a(c24186b, null, c24188d2, null, null, null, null, null, null, 2043));
            this.f281865t = null;
            this.f281862q = null;
            this.f281863r = null;
            this.f281864s = 2;
            if (C43175k.u(this, xA2, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
