package com.avito.android.registration_self_employment_redirect_screen.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import aj0.C19900a;
import aj0.c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.gig.registration_self_employment_redirect_screen.generated.api.get_self_employment_registration.GetSelfEmploymentRegistrationRespSuccessActionsItem;
import com.avito.android.registration_self_employment_redirect_screen.models.ButtonAction;
import com.avito.android.remote.model.TypedResult;
import jG.InterfaceC42250a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kG.C42578a;
import kG.C42579b;
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

/* compiled from: SelfEmploymentRedirectInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/domain/a;", "", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f252726a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42250a f252727b;

    /* compiled from: SelfEmploymentRedirectInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.registration_self_employment_redirect_screen.domain.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C7592a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f252728a;

        static {
            int[] iArr = new int[GetSelfEmploymentRegistrationRespSuccessActionsItem.Type.values().length];
            try {
                iArr[GetSelfEmploymentRegistrationRespSuccessActionsItem.Type.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetSelfEmploymentRegistrationRespSuccessActionsItem.Type.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f252728a = iArr;
        }
    }

    /* compiled from: SelfEmploymentRedirectInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Laj0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.registration_self_employment_redirect_screen.domain.SelfEmploymentRedirectInteractor$loadPage$1", f = "SelfEmploymentRedirectInteractor.kt", i = {0}, l = {18, 43}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f252729q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f252730r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f252730r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object objA;
            Object bVar;
            ButtonAction.Type type;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f252729q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f252730r;
                InterfaceC42250a interfaceC42250a = aVar.f252727b;
                this.f252730r = interfaceC43172j;
                this.f252729q = 1;
                objA = interfaceC42250a.a(this);
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
                interfaceC43172j = (InterfaceC43172j) this.f252730r;
                C42729a0.b(obj);
                objA = obj;
            }
            TypedResult typedResult = (TypedResult) objA;
            if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                String title = ((C42579b) success.getResult()).getTitle();
                String description = ((C42579b) success.getResult()).getDescription();
                DeepLink supportDeeplink = ((C42579b) success.getResult()).getSupportDeeplink();
                List<C42578a> listC = ((C42579b) success.getResult()).c();
                ArrayList arrayList = new ArrayList(C42745f0.q(listC, 10));
                int i13 = 0;
                for (Object obj2 : listC) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    C42578a c42578a = (C42578a) obj2;
                    arrayList.add(new C19900a(c42578a.getTitle(), c42578a.getDescription().toString(), String.valueOf(i14)));
                    i13 = i14;
                }
                List<GetSelfEmploymentRegistrationRespSuccessActionsItem> listA = ((C42579b) success.getResult()).a();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(listA, 10));
                for (GetSelfEmploymentRegistrationRespSuccessActionsItem getSelfEmploymentRegistrationRespSuccessActionsItem : listA) {
                    String title2 = getSelfEmploymentRegistrationRespSuccessActionsItem.getTitle();
                    DeepLink deepLinkB = aVar.f252726a.b(getSelfEmploymentRegistrationRespSuccessActionsItem.getUrl());
                    int i15 = C7592a.f252728a[getSelfEmploymentRegistrationRespSuccessActionsItem.getType().ordinal()];
                    if (i15 == 1) {
                        type = ButtonAction.Type.f252737b;
                    } else {
                        if (i15 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        type = ButtonAction.Type.f252738c;
                    }
                    arrayList2.add(new ButtonAction(title2, type, deepLinkB));
                }
                bVar = new c.b(title, description, arrayList, arrayList2, supportDeeplink);
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = c.C1505c.f21136a;
            }
            this.f252730r = null;
            this.f252729q = 2;
            if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k x xVar, @k InterfaceC42250a interfaceC42250a) {
        this.f252726a = xVar;
        this.f252727b = interfaceC42250a;
    }

    @k
    public final InterfaceC43160i<c> a() {
        return C43175k.G(new b(null));
    }
}
