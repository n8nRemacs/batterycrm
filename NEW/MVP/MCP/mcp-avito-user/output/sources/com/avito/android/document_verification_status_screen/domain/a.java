package com.avito.android.document_verification_status_screen.domain;

import Fx.AbstractC13849b;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.document_verification_status_screen.models.ButtonAction;
import com.avito.android.gig.document_verification_status_screen.generated.api.get_self_employment_status.GetSelfEmploymentStatusRespSuccessActionsItem;
import com.avito.android.remote.model.TypedResult;
import java.util.ArrayList;
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

/* compiled from: VerificationStatusInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/document_verification_status_screen/domain/a;", "", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f144821a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final EF.a f144822b;

    /* compiled from: VerificationStatusInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.document_verification_status_screen.domain.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C4212a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f144823a;

        static {
            int[] iArr = new int[GetSelfEmploymentStatusRespSuccessActionsItem.Type.values().length];
            try {
                iArr[GetSelfEmploymentStatusRespSuccessActionsItem.Type.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetSelfEmploymentStatusRespSuccessActionsItem.Type.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f144823a = iArr;
        }
    }

    /* compiled from: VerificationStatusInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LFx/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.document_verification_status_screen.domain.VerificationStatusInteractor$loadPage$1", f = "VerificationStatusInteractor.kt", i = {0}, l = {17, 38}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super AbstractC13849b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f144824q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f144825r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f144825r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AbstractC13849b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object objA;
            AbstractC13849b c0311b;
            ButtonAction.Type type;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f144824q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f144825r;
                EF.a aVar2 = aVar.f144822b;
                this.f144825r = interfaceC43172j;
                this.f144824q = 1;
                objA = aVar2.a(this);
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
                interfaceC43172j = (InterfaceC43172j) this.f144825r;
                C42729a0.b(obj);
                objA = obj;
            }
            TypedResult typedResult = (TypedResult) objA;
            if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                String title = ((FF.a) success.getResult()).getTitle();
                String description = ((FF.a) success.getResult()).getDescription();
                String logoUrl = ((FF.a) success.getResult()).getLogoUrl();
                String status = ((FF.a) success.getResult()).getStatus();
                DeepLink supportDeeplink = ((FF.a) success.getResult()).getSupportDeeplink();
                List<GetSelfEmploymentStatusRespSuccessActionsItem> listA = ((FF.a) success.getResult()).a();
                ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
                for (GetSelfEmploymentStatusRespSuccessActionsItem getSelfEmploymentStatusRespSuccessActionsItem : listA) {
                    String name = getSelfEmploymentStatusRespSuccessActionsItem.getName();
                    String title2 = getSelfEmploymentStatusRespSuccessActionsItem.getTitle();
                    DeepLink deepLinkB = aVar.f144821a.b(getSelfEmploymentStatusRespSuccessActionsItem.getUrl());
                    int i13 = C4212a.f144823a[getSelfEmploymentStatusRespSuccessActionsItem.getType().ordinal()];
                    if (i13 == 1) {
                        type = ButtonAction.Type.f144833b;
                    } else {
                        if (i13 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        type = ButtonAction.Type.f144834c;
                    }
                    arrayList.add(new ButtonAction(title2, type, deepLinkB, name));
                }
                c0311b = new AbstractC13849b.C0311b(title, description, supportDeeplink, logoUrl, status, arrayList);
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                c0311b = AbstractC13849b.c.f6052a;
            }
            this.f144825r = null;
            this.f144824q = 2;
            if (interfaceC43172j.emit(c0311b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k x xVar, @k EF.a aVar) {
        this.f144821a = xVar;
        this.f144822b = aVar;
    }

    @k
    public final InterfaceC43160i<AbstractC13849b> a() {
        return C43175k.G(new b(null));
    }
}
