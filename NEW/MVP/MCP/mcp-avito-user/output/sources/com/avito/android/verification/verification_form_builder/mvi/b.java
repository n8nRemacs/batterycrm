package com.avito.android.verification.verification_form_builder.mvi;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.verification.inn.list.button.ButtonItem;
import com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FormBuilderActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_form_builder.mvi.FormBuilderActor$handleButtonClick$2", f = "FormBuilderActor.kt", i = {}, l = {104, 106}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FormBuilderInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f325417q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f325418r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ButtonItem f325419s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f325420t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TM0.c f325421u;

    /* compiled from: FormBuilderActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<Boolean, FormBuilderInternalAction> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ButtonItem f325422l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ButtonItem buttonItem) {
            super(1);
            this.f325422l = buttonItem;
        }

        @Override // Y41.l
        public final FormBuilderInternalAction invoke(Boolean bool) {
            return new FormBuilderInternalAction.SetButtonLoading(this.f325422l.f323901b, bool.booleanValue());
        }
    }

    /* compiled from: FormBuilderActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.verification_form_builder.mvi.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C10062b {
        static {
            int[] iArr = new int[ButtonItem.Type.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ButtonItem.Type type = ButtonItem.Type.f323917b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ButtonItem.Type type2 = ButtonItem.Type.f323917b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ButtonItem buttonItem, g gVar, TM0.c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f325419s = buttonItem;
        this.f325420t = gVar;
        this.f325421u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f325419s, this.f325420t, this.f325421u, continuation);
        bVar.f325418r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FormBuilderInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f325417q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f325418r;
            ButtonItem buttonItem = this.f325419s;
            if (buttonItem.f323905f) {
                return G0.f406611a;
            }
            int iOrdinal = buttonItem.f323907h.ordinal();
            g gVar = this.f325420t;
            if (iOrdinal == 0) {
                b.a.a(gVar.f325454b, buttonItem.f323903d, null, null, 6);
            } else if (iOrdinal == 1) {
                a aVar = new a(buttonItem);
                this.f325417q = 2;
                if (g.c(gVar, interfaceC43172j, this.f325421u, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (iOrdinal == 2) {
                FormBuilderInternalAction.BackAction backAction = FormBuilderInternalAction.BackAction.f325433b;
                this.f325417q = 1;
                if (interfaceC43172j.emit(backAction, this) == coroutine_suspended) {
                    return coroutine_suspended;
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
