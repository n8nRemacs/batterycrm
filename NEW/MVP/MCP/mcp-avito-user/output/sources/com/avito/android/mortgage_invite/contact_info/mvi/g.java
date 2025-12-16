package com.avito.android.mortgage_invite.contact_info.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.contact_info.model.ApplicationContactInfoArguments;
import com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction;
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

/* compiled from: ApplicationContactInfoBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements com.avito.android.arch.mvi.b<ApplicationContactInfoInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.contact_info.domain.c f205724a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z10.a f205725b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ApplicationContactInfoArguments f205726c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f205727d;

    /* compiled from: ApplicationContactInfoBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_invite.contact_info.mvi.ApplicationContactInfoBootstrap$produce$1", f = "ApplicationContactInfoBootstrap.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ApplicationContactInfoInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f205728q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f205729r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f205729r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ApplicationContactInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f205728q;
            g gVar = g.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f205729r;
                if (gVar.f205727d) {
                    return G0.f406611a;
                }
                gVar.f205727d = true;
                ApplicationContactInfoArguments applicationContactInfoArguments = gVar.f205726c;
                gVar.f205725b.b(applicationContactInfoArguments.f205673c);
                ApplicationContactInfoInternalAction.Init init = new ApplicationContactInfoInternalAction.Init(applicationContactInfoArguments);
                this.f205729r = interfaceC43172j;
                this.f205728q = 1;
                if (interfaceC43172j.emit(init, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f205729r;
                C42729a0.b(obj);
            }
            InterfaceC43160i<ApplicationContactInfoInternalAction> interfaceC43160iA = gVar.f205724a.a();
            this.f205729r = null;
            this.f205728q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public g(@Y61.k com.avito.android.mortgage_invite.contact_info.domain.c cVar, @Y61.k Z10.a aVar, @Y61.k ApplicationContactInfoArguments applicationContactInfoArguments) {
        this.f205724a = cVar;
        this.f205725b = aVar;
        this.f205726c = applicationContactInfoArguments;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ApplicationContactInfoInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
