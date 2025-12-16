package com.avito.android.edit_basic_info.interactor;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import Za0.InterfaceC19524a;
import androidx.compose.runtime.internal.P;
import com.avito.android.edit_basic_info.mvi.entity.EditBasicInfoInternalAction;
import com.avito.android.util.R0;
import h31.e;
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

/* compiled from: EditBasicInfoInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/interactor/b;", "Lcom/avito/android/edit_basic_info/interactor/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.edit_basic_info.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC19524a> f146083a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f146084b;

    /* compiled from: EditBasicInfoInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_basic_info.interactor.EditBasicInfoInteractorImpl$editBasicInfo$1", f = "EditBasicInfoInteractor.kt", i = {0, 1}, l = {42, 43, 59, 61}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super EditBasicInfoInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146085q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f146086r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Integer f146088t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Integer f146089u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Integer f146090v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f146091w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f146092x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Integer f146093y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f146088t = num;
            this.f146089u = num2;
            this.f146090v = num3;
            this.f146091w = str;
            this.f146092x = str2;
            this.f146093y = num4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f146088t, this.f146089u, this.f146090v, this.f146091w, this.f146092x, this.f146093y, continuation);
            aVar.f146086r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EditBasicInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_basic_info.interactor.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EditBasicInfoInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_basic_info.interactor.EditBasicInfoInteractorImpl$editBasicInfo$2", f = "EditBasicInfoInteractor.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.edit_basic_info.interactor.b$b, reason: collision with other inner class name */
    public static final class C4249b extends SuspendLambda implements q<InterfaceC43172j<? super EditBasicInfoInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146094q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f146095r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f146096s;

        public C4249b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super EditBasicInfoInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C4249b c4249b = new C4249b(3, continuation);
            c4249b.f146095r = interfaceC43172j;
            c4249b.f146096s = th2;
            return c4249b.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f146094q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f146095r;
                EditBasicInfoInternalAction.SavingError savingError = new EditBasicInfoInternalAction.SavingError(this.f146096s);
                this.f146095r = null;
                this.f146094q = 1;
                if (interfaceC43172j.emit(savingError, this) == coroutine_suspended) {
                    return coroutine_suspended;
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
    public b(@k R0 r02, @k e eVar) {
        this.f146083a = eVar;
        this.f146084b = r02;
    }

    @Override // com.avito.android.edit_basic_info.interactor.a
    @k
    public final InterfaceC43160i<EditBasicInfoInternalAction> a(@l String str, @l Integer num, @l Integer num2, @l String str2, @l Integer num3, @l Integer num4) {
        return C43175k.I(this.f146084b.a(), new C43152f0(C43175k.G(new a(num, num2, num3, str, str2, num4, null)), new C4249b(3, null)));
    }
}
