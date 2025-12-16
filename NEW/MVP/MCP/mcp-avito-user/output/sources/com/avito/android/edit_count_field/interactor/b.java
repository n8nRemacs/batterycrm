package com.avito.android.edit_count_field.interactor;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.edit_count_field.model.EditCountFieldArguments;
import com.avito.android.edit_count_field.mvi.entity.EditCountFieldInternalAction;
import com.avito.android.remote.D0;
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

/* compiled from: EditCountFieldInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_count_field/interactor/b;", "Lcom/avito/android/edit_count_field/interactor/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.edit_count_field.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final EditCountFieldArguments f146600a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e<D0> f146601b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e<Gson> f146602c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f146603d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final R0 f146604e;

    /* compiled from: EditCountFieldInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_count_field.interactor.EditCountFieldInteractorImpl$editCount$1", f = "EditCountFieldInteractor.kt", i = {0, 1}, l = {36, 38, 42, 47, 52}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super EditCountFieldInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146605q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f146606r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Integer f146608t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f146608t = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f146608t, continuation);
            aVar.f146606r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EditCountFieldInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_count_field.interactor.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EditCountFieldInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_count_field.interactor.EditCountFieldInteractorImpl$editCount$2", f = "EditCountFieldInteractor.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.edit_count_field.interactor.b$b, reason: collision with other inner class name */
    public static final class C4263b extends SuspendLambda implements q<InterfaceC43172j<? super EditCountFieldInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146609q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f146610r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f146611s;

        public C4263b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super EditCountFieldInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C4263b c4263b = new C4263b(3, continuation);
            c4263b.f146610r = interfaceC43172j;
            c4263b.f146611s = th2;
            return c4263b.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f146609q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f146610r;
                Throwable th2 = this.f146611s;
                if (!(th2 instanceof CancellationException)) {
                    EditCountFieldInternalAction.Error error = new EditCountFieldInternalAction.Error(th2);
                    this.f146610r = null;
                    this.f146609q = 1;
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
    public b(@k EditCountFieldArguments editCountFieldArguments, @k e<D0> eVar, @k e<Gson> eVar2, @k InterfaceC35863o4 interfaceC35863o4, @k R0 r02) {
        this.f146600a = editCountFieldArguments;
        this.f146601b = eVar;
        this.f146602c = eVar2;
        this.f146603d = interfaceC35863o4;
        this.f146604e = r02;
    }

    @Override // com.avito.android.edit_count_field.interactor.a
    @k
    public final InterfaceC43160i<EditCountFieldInternalAction> a(@l Integer num) {
        return C43175k.I(this.f146604e.a(), new C43152f0(C43175k.G(new a(num, null)), new C4263b(3, null)));
    }
}
