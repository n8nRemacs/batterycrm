package com.avito.android.gig_shift_action.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.deep_linking.x;
import com.avito.android.gig.shift_action_impl.generated.api.checkout_v_2.Reason;
import com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2.ActionV2;
import com.avito.android.gig_shift_action.mvi.q;
import com.avito.android.gig_shift_action.mvi.z;
import com.avito.android.gig_snippet.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import java.util.Date;
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
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rG.InterfaceC47539a;
import tG.C48551a;

/* compiled from: GigShiftActionInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_action/domain/a;", "", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC47539a f160439a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.gig_snippet.a f160440b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Resources f160441c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final x f160442d;

    /* compiled from: GigShiftActionInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/gig_shift_action/mvi/q;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_shift_action.domain.GigShiftActionInteractor$requestCheckIn$1", f = "GigShiftActionInteractor.kt", i = {0}, l = {35, 36}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.gig_shift_action.domain.a$a, reason: collision with other inner class name */
    public static final class C4691a extends SuspendLambda implements p<InterfaceC43172j<? super q>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f160443q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f160444r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f160446t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f160447u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4691a(long j12, String str, Continuation<? super C4691a> continuation) {
            super(2, continuation);
            this.f160446t = j12;
            this.f160447u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4691a c4691a = a.this.new C4691a(this.f160446t, this.f160447u, continuation);
            c4691a.f160444r = obj;
            return c4691a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super q> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C4691a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f160443q;
            a aVar2 = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f160444r;
                InterfaceC47539a interfaceC47539a = aVar2.f160439a;
                this.f160444r = interfaceC43172j;
                this.f160443q = 1;
                obj = interfaceC47539a.b(this.f160446t, this.f160447u, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f160444r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            aVar2.getClass();
            if (typedResult instanceof TypedResult.Success) {
                aVar = new q.a(null, 1, null);
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = q.b.f160503a;
            }
            this.f160444r = null;
            this.f160443q = 2;
            if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GigShiftActionInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/gig_shift_action/mvi/q;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_shift_action.domain.GigShiftActionInteractor$requestCheckOut$1", f = "GigShiftActionInteractor.kt", i = {0}, l = {41, 42}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super q>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f160448q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f160449r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f160451t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f160452u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Reason f160453v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j12, String str, Reason reason, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f160451t = j12;
            this.f160452u = str;
            this.f160453v = reason;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(this.f160451t, this.f160452u, this.f160453v, continuation);
            bVar.f160449r = obj;
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
            Object aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f160448q;
            a aVar2 = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f160449r;
                InterfaceC47539a interfaceC47539a = aVar2.f160439a;
                this.f160449r = interfaceC43172j;
                this.f160448q = 1;
                obj = interfaceC47539a.c(this.f160451t, this.f160452u, this.f160453v, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f160449r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            aVar2.getClass();
            if (typedResult instanceof TypedResult.Success) {
                String successUri = ((C48551a) ((TypedResult.Success) typedResult).getResult()).getSuccessUri();
                if (successUri == null || successUri.length() == 0) {
                    successUri = null;
                }
                aVar = new q.a(successUri != null ? aVar2.f160442d.b(successUri) : null);
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = q.b.f160503a;
            }
            this.f160449r = null;
            this.f160448q = 2;
            if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GigShiftActionInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/gig_shift_action/mvi/q;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_shift_action.domain.GigShiftActionInteractor$requestShiftParams$1", f = "GigShiftActionInteractor.kt", i = {0}, l = {30, 31}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super q>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f160454q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f160455r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f160457t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f160457t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = a.this.new c(this.f160457t, continuation);
            cVar.f160455r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super q> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object objA;
            Object cVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f160454q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f160455r;
                InterfaceC47539a interfaceC47539a = aVar.f160439a;
                this.f160455r = interfaceC43172j;
                this.f160454q = 1;
                objA = interfaceC47539a.a(this.f160457t, this);
                if (objA == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f160455r;
                C42729a0.b(obj);
                objA = obj;
            }
            TypedResult typedResult = (TypedResult) objA;
            aVar.getClass();
            if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                ActionV2.ActionName actionName = ((uG.c) success.getResult()).getActionButton().getAction().getActionName();
                String title = ((uG.c) success.getResult()).getTitle();
                String startTime = ((uG.c) success.getResult()).getStartTime();
                String endTime = ((uG.c) success.getResult()).getEndTime();
                com.avito.android.gig_snippet.a aVar2 = aVar.f160440b;
                String strA = a.C4709a.a(aVar2, startTime, endTime, null, 12);
                String name = ((uG.c) success.getResult()).getSeller().getName();
                String defaultUrl = ((uG.c) success.getResult()).getSeller().getAvatar().getDefaultUrl();
                String address = ((uG.c) success.getResult()).getAddress();
                long slotId = ((uG.c) success.getResult()).getSlotId();
                String label = ((uG.c) success.getResult()).getActionButton().getLabel();
                List<com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2.Reason> listB = ((uG.c) success.getResult()).getActionButton().getAction().b();
                List<com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2.Reason> listB2 = ((uG.c) success.getResult()).getActionButton().getAction().b();
                com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2.Reason reason = listB2 != null ? (com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2.Reason) C42745f0.K(0, listB2) : null;
                String secret = ((uG.c) success.getResult()).getSecret();
                Date dateD = aVar2.d(((uG.c) success.getResult()).getStartTime());
                Date dateD2 = aVar2.d(((uG.c) success.getResult()).getEndTime());
                ActionV2.ActionName actionName2 = ((uG.c) success.getResult()).getActionButton().getAction().getActionName();
                ActionV2.ActionName actionName3 = ActionV2.ActionName.CheckOut;
                cVar = new q.c(((uG.c) success.getResult()).getActionButton().getAction().getActionName() == actionName3 ? aVar.f160441c.getString(R.string.checkout_title) : ((uG.c) success.getResult()).getSheet().getTitle(), ((uG.c) success.getResult()).getActionButton().getAction().getActionName() == actionName3 ? null : ((uG.c) success.getResult()).getSheet().getDescription(), new z(actionName, slotId, title, strA, name, address, defaultUrl, label, secret, listB, reason, dateD, dateD2, actionName2 == actionName3), ((uG.c) success.getResult()).getActionButton().getLabel());
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = ((TypedResult.Error) typedResult).getError() instanceof ApiError.NotFound ? q.f.f160510a : q.b.f160503a;
            }
            this.f160455r = null;
            this.f160454q = 2;
            if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k InterfaceC47539a interfaceC47539a, @k com.avito.android.gig_snippet.a aVar, @k Resources resources, @k x xVar) {
        this.f160439a = interfaceC47539a;
        this.f160440b = aVar;
        this.f160441c = resources;
        this.f160442d = xVar;
    }

    @k
    public final InterfaceC43160i<q> a(long j12, @l String str) {
        return C43175k.G(new C4691a(j12, str, null));
    }

    @k
    public final InterfaceC43160i<q> b(long j12, @l String str, @l Reason reason) {
        return C43175k.G(new b(j12, str, reason, null));
    }

    @k
    public final InterfaceC43160i<q> c(@l String str) {
        return C43175k.G(new c(str, null));
    }
}
