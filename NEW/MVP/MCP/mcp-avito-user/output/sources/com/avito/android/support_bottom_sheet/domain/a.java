package com.avito.android.support_bottom_sheet.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import aH.C19773a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.t1;
import com.avito.android.support_bottom_sheet.analytics.SupportRequestType;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vA0.C49186a;
import xA0.AbstractC49804b;

/* compiled from: SupportDialogInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/support_bottom_sheet/domain/a;", "", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ZG.a f292422a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final t1 f292423b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f292424c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f292425d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Long f292426e;

    /* compiled from: SupportDialogInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LxA0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.support_bottom_sheet.domain.SupportDialogInteractor$getSupportChat$1", f = "SupportDialogInteractor.kt", i = {0}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, 39}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.support_bottom_sheet.domain.a$a, reason: collision with other inner class name */
    public static final class C8871a extends SuspendLambda implements p<InterfaceC43172j<? super AbstractC49804b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f292427q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f292428r;

        public C8871a(Continuation<? super C8871a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8871a c8871a = a.this.new C8871a(continuation);
            c8871a.f292428r = obj;
            return c8871a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AbstractC49804b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8871a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            AbstractC49804b c12850b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f292427q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f292428r;
                ZG.a aVar2 = aVar.f292422a;
                String strA = aVar.f292423b.a();
                this.f292428r = interfaceC43172j;
                this.f292427q = 1;
                obj = aVar2.a(strA, aVar.f292425d, aVar.f292426e, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f292428r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                InterfaceC28373a interfaceC28373a = aVar.f292424c;
                SupportRequestType supportRequestType = SupportRequestType.f292398c;
                Long l12 = aVar.f292426e;
                interfaceC28373a.c(new C49186a(supportRequestType, l12 != null ? l12.toString() : null));
                c12850b = new AbstractC49804b.C12850b(((C19773a) ((TypedResult.Success) typedResult).getResult()).getDeeplink());
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                c12850b = AbstractC49804b.a.f442282a;
            }
            this.f292428r = null;
            this.f292427q = 2;
            if (interfaceC43172j.emit(c12850b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k ZG.a aVar, @k t1 t1Var, @k InterfaceC28373a interfaceC28373a, @k @Named("SCREEN_TAG") String str, @l @Named("SLOT_ID") Long l12) {
        this.f292422a = aVar;
        this.f292423b = t1Var;
        this.f292424c = interfaceC28373a;
        this.f292425d = str;
        this.f292426e = l12;
    }

    @k
    public final InterfaceC43160i<AbstractC49804b> a() {
        return C43175k.G(new C8871a(null));
    }
}
