package com.avito.android.extended_profile_selection_create.name;

import KA.a;
import Y41.p;
import Y41.q;
import Y61.l;
import com.avito.android.extended_profile_selection_create.name.mvi.entity.ExtendedProfileSetSelectionNameInternalAction;
import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import com.google.gson.Gson;
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

/* compiled from: ExtendedProfileSetSelectionNameInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/g;", "Lcom/avito/android/extended_profile_selection_create/name/f;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f151868a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f151869b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f151870c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSetSelectionNameConfig f151871d;

    /* compiled from: ExtendedProfileSetSelectionNameInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameInteractorImpl$updateSelection$1", f = "ExtendedProfileSetSelectionNameInteractor.kt", i = {0, 1}, l = {41, 44, 48, 58}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ExtendedProfileSetSelectionNameInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151872q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f151873r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f151875t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f151876u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Long f151877v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z12, Long l12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f151875t = str;
            this.f151876u = z12;
            this.f151877v = l12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(this.f151875t, this.f151876u, this.f151877v, continuation);
            aVar.f151873r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSetSelectionNameInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_selection_create.name.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameInteractorImpl$updateSelection$2", f = "ExtendedProfileSetSelectionNameInteractor.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super ExtendedProfileSetSelectionNameInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151878q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f151879r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f151880s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSetSelectionNameInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f151879r = interfaceC43172j;
            bVar.f151880s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f151878q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f151879r;
                ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameError setSelectionNameError = new ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameError(this.f151880s, a.C0558a.f9336a);
                this.f151879r = null;
                this.f151878q = 1;
                if (interfaceC43172j.emit(setSelectionNameError, this) == coroutine_suspended) {
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
    public g(@Y61.k h31.e<D0> eVar, @Y61.k h31.e<Gson> eVar2, @Y61.k R0 r02, @Y61.k ExtendedProfileSetSelectionNameConfig extendedProfileSetSelectionNameConfig) {
        this.f151868a = eVar;
        this.f151869b = eVar2;
        this.f151870c = r02;
        this.f151871d = extendedProfileSetSelectionNameConfig;
    }

    @Override // com.avito.android.extended_profile_selection_create.name.f
    @Y61.k
    public final InterfaceC43160i a(@l Long l12, boolean z12, @Y61.k String str) {
        return C43175k.I(this.f151870c.a(), new C43152f0(C43175k.G(new a(str, z12, l12, null)), new b(3, null)));
    }
}
