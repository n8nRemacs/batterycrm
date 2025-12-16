package com.avito.android.gig_apply.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pH.AbstractC46954b;
import yF.InterfaceC50106a;

/* compiled from: GigApplyInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/domain/c;", "", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC50106a f159662a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f159663b;

    /* compiled from: GigApplyInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.domain.GigApplyInteractor$requestApply$1", f = "GigApplyInteractor.kt", i = {0}, l = {19, 20}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super AbstractC46954b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159664q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f159665r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f159667t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f159667t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = c.this.new a(this.f159667t, continuation);
            aVar.f159665r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AbstractC46954b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object dVar;
            Uri uri;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159664q;
            c cVar = c.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f159665r;
                InterfaceC50106a interfaceC50106a = cVar.f159662a;
                this.f159665r = interfaceC43172j;
                this.f159664q = 1;
                obj = interfaceC50106a.a(this.f159667t, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f159665r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            cVar.getClass();
            if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                String successUri = ((AF.c) success.getResult()).getSuccessUri();
                DeepLink deepLinkB = successUri != null ? cVar.f159663b.b(successUri) : null;
                AF.b sheet = ((AF.c) success.getResult()).getSheet();
                AF.a actionButton = ((AF.c) success.getResult()).getActionButton();
                if (deepLinkB != null) {
                    String successUri2 = ((AF.c) success.getResult()).getSuccessUri();
                    dVar = new AbstractC46954b.a(deepLinkB, (successUri2 == null || (uri = Uri.parse(successUri2)) == null) ? null : uri.getQueryParameter("slotId"));
                } else {
                    dVar = (actionButton == null || sheet == null) ? AbstractC46954b.f.f428311a : new AbstractC46954b.d(sheet, actionButton);
                }
            } else {
                dVar = AbstractC46954b.f.f428311a;
            }
            this.f159665r = null;
            this.f159664q = 2;
            if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public c(@k InterfaceC50106a interfaceC50106a, @k x xVar) {
        this.f159662a = interfaceC50106a;
        this.f159663b = xVar;
    }

    @k
    public final InterfaceC43160i<AbstractC46954b> a(long j12) {
        return C43175k.G(new a(j12, null));
    }
}
