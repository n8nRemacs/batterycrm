package com.avito.android.gig_shift_cancel.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.gig.shift_cancel_impl.generated.api.cancel_info_v_1.ActionV2;
import com.avito.android.gig.shift_cancel_impl.generated.api.cancel_v_1.Reason;
import com.avito.android.gig_shift_cancel.mvi.q;
import com.avito.android.gig_shift_cancel.mvi.r;
import com.avito.android.gig_snippet.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import xG.InterfaceC49829a;
import yG.C50111c;

/* compiled from: GigShiftCancelInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_cancel/domain/a;", "", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC49829a f160615a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.gig_snippet.a f160616b;

    /* compiled from: GigShiftCancelInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/gig_shift_cancel/mvi/q;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_shift_cancel.domain.GigShiftCancelInteractor$requestCancel$1", f = "GigShiftCancelInteractor.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.gig_shift_cancel.domain.a$a, reason: collision with other inner class name */
    public static final class C4697a extends SuspendLambda implements p<InterfaceC43172j<? super q>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f160617q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f160618r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f160620t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Reason f160621u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4697a(long j12, Reason reason, Continuation<? super C4697a> continuation) {
            super(2, continuation);
            this.f160620t = j12;
            this.f160621u = reason;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4697a c4697a = a.this.new C4697a(this.f160620t, this.f160621u, continuation);
            c4697a.f160618r = obj;
            return c4697a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super q> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C4697a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            q qVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f160617q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f160618r;
                InterfaceC49829a interfaceC49829a = aVar.f160615a;
                this.f160618r = interfaceC43172j;
                this.f160617q = 1;
                obj = interfaceC49829a.a(this.f160620t, this.f160621u, this);
                if (obj == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f160618r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            aVar.getClass();
            if (typedResult instanceof TypedResult.Success) {
                qVar = q.a.f160666a;
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                qVar = q.b.f160667a;
            }
            this.f160618r = null;
            this.f160617q = 2;
            if (interfaceC43172j.emit(qVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GigShiftCancelInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/gig_shift_cancel/mvi/q;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_shift_cancel.domain.GigShiftCancelInteractor$requestCancelParams$1", f = "GigShiftCancelInteractor.kt", i = {0}, l = {22, 23}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super q>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f160622q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f160623r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f160625t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f160625t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(this.f160625t, continuation);
            bVar.f160623r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super q> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object objB;
            q cVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f160622q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f160623r;
                InterfaceC49829a interfaceC49829a = aVar.f160615a;
                this.f160623r = interfaceC43172j;
                this.f160622q = 1;
                objB = interfaceC49829a.b(this.f160625t, this);
                if (objB == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f160623r;
                C42729a0.b(obj);
                objB = obj;
            }
            TypedResult typedResult = (TypedResult) objB;
            aVar.getClass();
            if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                ActionV2.ActionName actionName = ((C50111c) success.getResult()).getActionButton().getAction().getActionName();
                String title = ((C50111c) success.getResult()).getTitle();
                String startTime = ((C50111c) success.getResult()).getStartTime();
                String endTime = ((C50111c) success.getResult()).getEndTime();
                com.avito.android.gig_snippet.a aVar2 = aVar.f160616b;
                String strA = a.C4709a.a(aVar2, startTime, endTime, null, 8);
                String name = ((C50111c) success.getResult()).getSeller().getName();
                String defaultUrl = ((C50111c) success.getResult()).getSeller().getAvatar().getDefaultUrl();
                String address = ((C50111c) success.getResult()).getAddress();
                long slotId = ((C50111c) success.getResult()).getSlotId();
                String label = ((C50111c) success.getResult()).getActionButton().getLabel();
                List<com.avito.android.gig.shift_cancel_impl.generated.api.cancel_info_v_1.Reason> listB = ((C50111c) success.getResult()).getActionButton().getAction().b();
                List<com.avito.android.gig.shift_cancel_impl.generated.api.cancel_info_v_1.Reason> listB2 = ((C50111c) success.getResult()).getActionButton().getAction().b();
                cVar = new q.c(((C50111c) success.getResult()).getSheet().getTitle(), ((C50111c) success.getResult()).getSheet().getDescription(), new r(actionName, slotId, title, strA, name, address, defaultUrl, label, ((C50111c) success.getResult()).getSecret(), listB, listB2 != null ? (com.avito.android.gig.shift_cancel_impl.generated.api.cancel_info_v_1.Reason) C42745f0.K(0, listB2) : null, aVar2.d(((C50111c) success.getResult()).getStartTime()), aVar2.d(((C50111c) success.getResult()).getEndTime())), ((C50111c) success.getResult()).getActionButton().getLabel());
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = ((TypedResult.Error) typedResult).getError() instanceof ApiError.NotFound ? q.e.f160673a : q.b.f160667a;
            }
            this.f160623r = null;
            this.f160622q = 2;
            if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k InterfaceC49829a interfaceC49829a, @k com.avito.android.gig_snippet.a aVar) {
        this.f160615a = interfaceC49829a;
        this.f160616b = aVar;
    }

    @k
    public final InterfaceC43160i<q> a(long j12, @l Reason reason) {
        return C43175k.G(new C4697a(j12, reason, null));
    }

    @k
    public final InterfaceC43160i<q> b(long j12) {
        return C43175k.G(new b(j12, null));
    }
}
