package com.avito.android.extended_profile_selection_create.select;

import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateInternalAction;
import com.avito.android.remote.D0;
import com.avito.android.remote.N;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.Set;
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

/* compiled from: ExtendedProfileSelectionCreateInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/d;", "Lcom/avito/android/extended_profile_selection_create/select/c;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile_selection_create.select.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30499d implements InterfaceC30498c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<N> f152104a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f152105b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f152106c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f152107d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f152108e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f152109f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSelectionCreateConfig f152110g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_selection_create.select.converter.a f152111h;

    /* compiled from: ExtendedProfileSelectionCreateInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateInteractorImpl$createSelection$1", f = "ExtendedProfileSelectionCreateInteractor.kt", i = {0, 1, 1, 2, 2, 2, 4, 4, 4}, l = {154, 157, 161, 172, 181, 183}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "valueId", "$this$flow", "valueId", "itemListId", "$this$flow", "valueId", "itemListId"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "J$0"})
    /* renamed from: com.avito.android.extended_profile_selection_create.select.d$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public String f152112q;

        /* renamed from: r, reason: collision with root package name */
        public Long f152113r;

        /* renamed from: s, reason: collision with root package name */
        public long f152114s;

        /* renamed from: t, reason: collision with root package name */
        public int f152115t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f152116u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f152117v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ C30499d f152118w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Long f152119x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Set<Long> f152120y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, C30499d c30499d, Long l12, Set<Long> set, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f152117v = str;
            this.f152118w = c30499d;
            this.f152119x = l12;
            this.f152120y = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f152117v, this.f152118w, this.f152119x, this.f152120y, continuation);
            aVar.f152116u = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x010a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0158  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 418
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_selection_create.select.C30499d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateInteractorImpl$createSelection$2", f = "ExtendedProfileSelectionCreateInteractor.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile_selection_create.select.d$b */
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f152121q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f152122r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f152123s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f152122r = interfaceC43172j;
            bVar.f152123s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f152121q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f152122r;
                ExtendedProfileSelectionCreateInternalAction.CreateSelectionError createSelectionError = new ExtendedProfileSelectionCreateInternalAction.CreateSelectionError(this.f152123s);
                this.f152122r = null;
                this.f152121q = 1;
                if (interfaceC43172j.emit(createSelectionError, this) == coroutine_suspended) {
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

    /* compiled from: ExtendedProfileSelectionCreateInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateInteractorImpl$loadAdverts$1", f = "ExtendedProfileSelectionCreateInteractor.kt", i = {0, 0, 0, 1, 1, 1}, l = {99, UpdateStatusCode.DialogButton.CONFIRM, 123}, m = "invokeSuspend", n = {"$this$flow", "requestSearchParams", "isFirstPage", "$this$flow", "requestSearchParams", "isFirstPage"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
    /* renamed from: com.avito.android.extended_profile_selection_create.select.d$c */
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public SearchParams f152124q;

        /* renamed from: r, reason: collision with root package name */
        public int f152125r;

        /* renamed from: s, reason: collision with root package name */
        public int f152126s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f152127t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f152128u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SearchParams f152129v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ C30499d f152130w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f152131x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, SearchParams searchParams, C30499d c30499d, boolean z12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f152128u = i12;
            this.f152129v = searchParams;
            this.f152130w = c30499d;
            this.f152131x = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f152128u, this.f152129v, this.f152130w, this.f152131x, continuation);
            cVar.f152127t = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x036c  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x018a  */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r56) throws com.avito.android.util.ApiException, java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 901
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_selection_create.select.C30499d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateInteractorImpl$loadAdverts$2", f = "ExtendedProfileSelectionCreateInteractor.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile_selection_create.select.d$d, reason: collision with other inner class name */
    public static final class C4450d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f152132q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f152133r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f152134s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f152135t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4450d(int i12, Continuation<? super C4450d> continuation) {
            super(3, continuation);
            this.f152135t = i12;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C4450d c4450d = new C4450d(this.f152135t, continuation);
            c4450d.f152133r = interfaceC43172j;
            c4450d.f152134s = th2;
            return c4450d.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f152132q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f152133r;
                ExtendedProfileSelectionCreateInternalAction.AdvertsLoadingError advertsLoadingError = new ExtendedProfileSelectionCreateInternalAction.AdvertsLoadingError(this.f152134s, this.f152135t == 1);
                this.f152133r = null;
                this.f152132q = 1;
                if (interfaceC43172j.emit(advertsLoadingError, this) == coroutine_suspended) {
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

    /* compiled from: ExtendedProfileSelectionCreateInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateInteractorImpl$loadAdvertsWithSelected$1", f = "ExtendedProfileSelectionCreateInteractor.kt", i = {0, 1, 2}, l = {63, 65, 67, 73}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.extended_profile_selection_create.select.d$e */
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public C30499d f152136q;

        /* renamed from: r, reason: collision with root package name */
        public int f152137r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f152138s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Long f152140u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Long l12, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f152140u = l12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = C30499d.this.new e(this.f152140u, continuation);
            eVar.f152138s = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00eb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r46) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_selection_create.select.C30499d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateInteractorImpl$loadAdvertsWithSelected$2", f = "ExtendedProfileSelectionCreateInteractor.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile_selection_create.select.d$f */
    public static final class f extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f152141q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f152142r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f152143s;

        public f() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            f fVar = new f(3, continuation);
            fVar.f152142r = interfaceC43172j;
            fVar.f152143s = th2;
            return fVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f152141q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f152142r;
                ExtendedProfileSelectionCreateInternalAction.SelectedAdvertsLoadedError selectedAdvertsLoadedError = new ExtendedProfileSelectionCreateInternalAction.SelectedAdvertsLoadedError(this.f152143s);
                this.f152142r = null;
                this.f152141q = 1;
                if (interfaceC43172j.emit(selectedAdvertsLoadedError, this) == coroutine_suspended) {
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
    public C30499d(@Y61.k h31.e<N> eVar, @Y61.k h31.e<D0> eVar2, @Y61.k h31.e<Gson> eVar3, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k R0 r02, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig, @Y61.k com.avito.android.extended_profile_selection_create.select.converter.a aVar) {
        this.f152104a = eVar;
        this.f152105b = eVar2;
        this.f152106c = eVar3;
        this.f152107d = interfaceC35863o4;
        this.f152108e = r02;
        this.f152109f = searchParamsConverter;
        this.f152110g = extendedProfileSelectionCreateConfig;
        this.f152111h = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.extended_profile_selection_create.select.C30499d r10, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws com.avito.android.util.ApiException {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof com.avito.android.extended_profile_selection_create.select.C30503e
            if (r0 == 0) goto L16
            r0 = r12
            com.avito.android.extended_profile_selection_create.select.e r0 = (com.avito.android.extended_profile_selection_create.select.C30503e) r0
            int r1 = r0.f152272s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f152272s = r1
            goto L1b
        L16:
            com.avito.android.extended_profile_selection_create.select.e r0 = new com.avito.android.extended_profile_selection_create.select.e
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.f152270q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f152272s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.C42729a0.b(r12)
            goto Laa
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            kotlin.C42729a0.b(r12)
            h31.e<com.google.gson.Gson> r12 = r10.f152106c
            java.lang.Object r12 = r12.get()
            com.google.gson.Gson r12 = (com.google.gson.Gson) r12
            com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig r2 = r10.f152110g
            java.util.ArrayList r4 = r2.f151624o
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r5.remove(r11)
            r4 = 0
            r5.add(r4, r11)
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.C42745f0.q(r5, r6)
            r4.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        L5f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L74
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            com.avito.android.remote.model.extended.modification.SelectionModification$OrderItem r7 = new com.avito.android.remote.model.extended.modification.SelectionModification$OrderItem
            r7.<init>(r6)
            r4.add(r7)
            goto L5f
        L74:
            com.avito.android.remote.model.extended.modification.ModificationBody r5 = new com.avito.android.remote.model.extended.modification.ModificationBody
            com.avito.android.remote.model.extended.modification.SelectionModification r6 = new com.avito.android.remote.model.extended.modification.SelectionModification
            com.avito.android.remote.model.extended.modification.SelectionModification$OperationType r7 = com.avito.android.remote.model.extended.modification.SelectionModification.OperationType.ADD
            com.avito.android.remote.model.extended.modification.SelectionModification$Value r8 = new com.avito.android.remote.model.extended.modification.SelectionModification$Value
            r9 = 0
            r8.<init>(r9, r9, r9, r9)
            com.avito.android.remote.model.extended.modification.SelectionModification$Operation r9 = new com.avito.android.remote.model.extended.modification.SelectionModification$Operation
            r9.<init>(r7, r11, r8)
            java.util.List r11 = java.util.Collections.singletonList(r9)
            java.lang.String r2 = r2.f151612c
            r6.<init>(r2, r11, r4)
            java.util.List r11 = java.util.Collections.singletonList(r6)
            r5.<init>(r11)
            java.lang.String r11 = r12.l(r5)
            h31.e<com.avito.android.remote.D0> r10 = r10.f152105b
            java.lang.Object r10 = r10.get()
            com.avito.android.remote.D0 r10 = (com.avito.android.remote.D0) r10
            r0.f152272s = r3
            java.lang.Object r12 = r10.h(r11, r0)
            if (r12 != r1) goto Laa
            goto Lb9
        Laa:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r10 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r10 == 0) goto Lba
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r10 = r12.getResult()
            r1 = r10
            com.avito.android.remote.model.extended.modification.SelectionModificationResult r1 = (com.avito.android.remote.model.extended.modification.SelectionModificationResult) r1
        Lb9:
            return r1
        Lba:
            boolean r10 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r10 == 0) goto Lcd
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r10 = r12.getError()
            java.lang.Throwable r11 = r12.getCause()
            com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r10, r11)
            throw r10
        Lcd:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_selection_create.select.C30499d.d(com.avito.android.extended_profile_selection_create.select.d, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.extended_profile_selection_create.select.InterfaceC30498c
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileSelectionCreateInternalAction> a(@Y61.k Set<Long> set, @Y61.l Long l12, @Y61.l String str) {
        return C43175k.I(this.f152108e.a(), new C43152f0(C43175k.G(new a(str, this, l12, set, null)), new b(3, null)));
    }

    @Override // com.avito.android.extended_profile_selection_create.select.InterfaceC30498c
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileSelectionCreateInternalAction> b(@Y61.l Long l12) {
        return C43175k.I(this.f152108e.a(), new C43152f0(C43175k.G(new e(l12, null)), new f(3, null)));
    }

    @Override // com.avito.android.extended_profile_selection_create.select.InterfaceC30498c
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileSelectionCreateInternalAction> c(int i12, @Y61.k SearchParams searchParams, boolean z12) {
        return C43175k.I(this.f152108e.a(), new C43152f0(C43175k.G(new c(i12, searchParams, this, z12, null)), new C4450d(i12, null)));
    }
}
