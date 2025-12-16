package com.avito.android.publish.screen.objects.domain.usecase;

import Gd0.C13867a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.objects.P0;
import com.avito.android.publish.screen.objects.di.InterfaceC34011b;
import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
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
import yc.C50213a;

/* compiled from: DeleteObjectUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/domain/usecase/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.objects.domain.repository.a f240073a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final P0 f240074b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f240075c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f240076d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C50213a f240077e;

    /* compiled from: DeleteObjectUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.objects.domain.usecase.DeleteObjectUseCase$invoke$1", f = "DeleteObjectUseCase.kt", i = {0}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, 39}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.publish.screen.objects.domain.usecase.a$a, reason: collision with other inner class name */
    public static final class C7209a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ObjectFillFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f240078q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f240079r;

        public C7209a(Continuation<? super C7209a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C7209a c7209a = a.this.new C7209a(continuation);
            c7209a.f240079r = obj;
            return c7209a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ObjectFillFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7209a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f240078q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f240079r;
                com.avito.android.publish.screen.objects.domain.repository.a aVar2 = aVar.f240073a;
                this.f240079r = interfaceC43172j;
                this.f240078q = 1;
                if (aVar2.C1() == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f240079r;
                C42729a0.b(obj);
            }
            boolean z12 = aVar.f240075c;
            com.avito.android.publish.screen.objects.domain.repository.a aVar3 = aVar.f240073a;
            if (z12) {
                aVar.f240076d.c(new C13867a(aVar3.b8(), aVar3.dc(), aVar3.Z5(), aVar.f240077e));
            }
            aVar.f240074b.a(aVar3.Dc());
            ObjectFillFormInternalAction.LeaveScreenWithChangedObject leaveScreenWithChangedObject = new ObjectFillFormInternalAction.LeaveScreenWithChangedObject(aVar3.Dc().getId());
            this.f240079r = null;
            this.f240078q = 2;
            if (interfaceC43172j.emit(leaveScreenWithChangedObject, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.publish.screen.objects.domain.repository.a aVar, @Y61.k P0 p02, @InterfaceC34011b boolean z12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a) {
        this.f240073a = aVar;
        this.f240074b = p02;
        this.f240075c = z12;
        this.f240076d = interfaceC28373a;
        this.f240077e = c50213a;
    }

    @Y61.k
    public final InterfaceC43160i<ObjectFillFormInternalAction> a() {
        return C43175k.G(new C7209a(null));
    }
}
