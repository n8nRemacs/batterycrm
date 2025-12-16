package com.avito.android.installments.form.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.credits.di.o;
import com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
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
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: InstallmentsFormBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/installments/form/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements com.avito.android.arch.mvi.b<InstallmentsFormInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f172776a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f172777b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f172778c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.installments.form.j f172779d;

    /* compiled from: InstallmentsFormBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.installments.form.mvi.InstallmentsFormBootstrap$produce$1", f = "InstallmentsFormBootstrap.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InstallmentsFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f172780q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f172781r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f172781r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InstallmentsFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f172780q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f172781r;
                f fVar = f.this;
                String str = fVar.f172776a;
                com.avito.android.installments.form.j jVar = fVar.f172779d;
                if (str == null || str.length() == 0) {
                    String str2 = fVar.f172777b;
                    if (str2 == null || str2.length() == 0) {
                        InstallmentsFormInternalAction.ShowUnknownError showUnknownError = InstallmentsFormInternalAction.ShowUnknownError.f172763b;
                        this.f172780q = 3;
                        if (interfaceC43172j.emit(showUnknownError, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        InterfaceC43160i<InstallmentsFormInternalAction> interfaceC43160iB = jVar.b(str2);
                        this.f172780q = 2;
                        if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    jVar.getClass();
                    C43207v c43207vA = com.avito.android.installments.form.j.a(fVar.f172776a);
                    this.f172780q = 1;
                    if (C43175k.u(this, c43207vA, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public f(@com.avito.android.credits.di.m @Y61.l String str, @Y61.l @o String str2, @com.avito.android.credits.di.n boolean z12, @Y61.k com.avito.android.installments.form.j jVar) {
        this.f172776a = str;
        this.f172777b = str2;
        this.f172778c = z12;
        this.f172779d = jVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InstallmentsFormInternalAction> a() {
        return this.f172778c ? C43175k.w() : C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
