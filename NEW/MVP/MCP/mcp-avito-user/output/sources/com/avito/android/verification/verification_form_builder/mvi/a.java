package com.avito.android.verification.verification_form_builder.mvi;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.verification.verification_form_builder.FormBuilderScreenData;
import com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FormBuilderActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_form_builder.mvi.FormBuilderActor$handleButtonClick$1", f = "FormBuilderActor.kt", i = {}, l = {94, 96}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FormBuilderInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f325411q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f325412r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FormBuilderScreenData.Button f325413s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f325414t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TM0.c f325415u;

    /* compiled from: FormBuilderActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.verification_form_builder.mvi.a$a, reason: collision with other inner class name */
    public static final class C10061a extends N implements Y41.l<Boolean, FormBuilderInternalAction> {

        /* renamed from: l, reason: collision with root package name */
        public static final C10061a f325416l = new C10061a();

        public C10061a() {
            super(1);
        }

        @Override // Y41.l
        public final FormBuilderInternalAction invoke(Boolean bool) {
            return new FormBuilderInternalAction.SetActionLoading(bool.booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FormBuilderScreenData.Button button, g gVar, TM0.c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f325413s = button;
        this.f325414t = gVar;
        this.f325415u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f325413s, this.f325414t, this.f325415u, continuation);
        aVar.f325412r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FormBuilderInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f325411q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f325412r;
            FormBuilderScreenData.Button button = this.f325413s;
            if (button.f325359d) {
                return G0.f406611a;
            }
            FormBuilderScreenData.Button.a.C10060a c10060a = FormBuilderScreenData.Button.a.C10060a.f325365a;
            FormBuilderScreenData.Button.a aVar = button.f325357b;
            if (L.f(aVar, c10060a)) {
                FormBuilderInternalAction.BackAction backAction = FormBuilderInternalAction.BackAction.f325433b;
                this.f325411q = 1;
                if (interfaceC43172j.emit(backAction, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                boolean z12 = aVar instanceof FormBuilderScreenData.Button.a.b;
                g gVar = this.f325414t;
                if (z12) {
                    b.a.a(gVar.f325454b, ((FormBuilderScreenData.Button.a.b) aVar).f325366a, null, null, 6);
                } else if (L.f(aVar, FormBuilderScreenData.Button.a.c.f325367a)) {
                    C10061a c10061a = C10061a.f325416l;
                    this.f325411q = 2;
                    if (g.c(gVar, interfaceC43172j, this.f325415u, c10061a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
