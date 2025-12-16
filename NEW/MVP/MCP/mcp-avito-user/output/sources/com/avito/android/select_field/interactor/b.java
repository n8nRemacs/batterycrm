package com.avito.android.select_field.interactor;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.D0;
import com.avito.android.select_field.model.SelectFieldArguments;
import com.avito.android.select_field.mvi.entity.SelectFieldInternalAction;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import h31.e;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectFieldInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_field/interactor/b;", "Lcom/avito/android/select_field/interactor/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.select_field.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SelectFieldArguments f267154a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e<D0> f267155b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e<Gson> f267156c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f267157d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final R0 f267158e;

    /* compiled from: SelectFieldInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select_field.interactor.SelectFieldInteractorImpl$editSelect$1", f = "SelectFieldInteractor.kt", i = {0, 1}, l = {36, 38, 42, 47, 52}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super SelectFieldInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f267159q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f267160r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Integer f267162t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f267162t = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f267162t, continuation);
            aVar.f267160r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SelectFieldInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0139  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 356
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select_field.interactor.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SelectFieldInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select_field.interactor.SelectFieldInteractorImpl$editSelect$2", f = "SelectFieldInteractor.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.select_field.interactor.b$b, reason: collision with other inner class name */
    public static final class C7969b extends SuspendLambda implements q<InterfaceC43172j<? super SelectFieldInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f267163q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f267164r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f267165s;

        public C7969b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super SelectFieldInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C7969b c7969b = new C7969b(3, continuation);
            c7969b.f267164r = interfaceC43172j;
            c7969b.f267165s = th2;
            return c7969b.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f267163q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f267164r;
                Throwable th2 = this.f267165s;
                if (!(th2 instanceof CancellationException)) {
                    SelectFieldInternalAction.Error error = new SelectFieldInternalAction.Error(th2);
                    this.f267164r = null;
                    this.f267163q = 1;
                    if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k SelectFieldArguments selectFieldArguments, @k e<D0> eVar, @k e<Gson> eVar2, @k InterfaceC35863o4 interfaceC35863o4, @k R0 r02) {
        this.f267154a = selectFieldArguments;
        this.f267155b = eVar;
        this.f267156c = eVar2;
        this.f267157d = interfaceC35863o4;
        this.f267158e = r02;
    }

    @Override // com.avito.android.select_field.interactor.a
    @k
    public final InterfaceC43160i<SelectFieldInternalAction> a(@l Integer num) {
        return C43175k.I(this.f267158e.a(), new C43152f0(C43175k.G(new a(num, null)), new C7969b(3, null)));
    }
}
