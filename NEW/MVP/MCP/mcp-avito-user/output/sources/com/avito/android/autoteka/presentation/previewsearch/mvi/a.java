package com.avito.android.autoteka.presentation.previewsearch.mvi;

import Y41.p;
import com.avito.android.autoteka.deeplinks.AutotekaBuyReportLink;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchDetails;
import com.avito.android.autoteka.model.AutotekaChoosingPurchaseButtonParams;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchAction;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchInternalAction;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: AutotekaPreviewSearchActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState;", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<AutotekaPreviewSearchAction, AutotekaPreviewSearchInternalAction, AutotekaPreviewSearchState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.previewSearch.a f97560a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f97561b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AutotekaPreviewSearchDetails f97562c;

    /* compiled from: AutotekaPreviewSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/a$a;", "", "a", "b", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/a$a$a;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/a$a$b;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.autoteka.presentation.previewsearch.mvi.a$a, reason: collision with other inner class name */
    public interface InterfaceC2914a {

        /* compiled from: AutotekaPreviewSearchActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/a$a$a;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/a$a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.autoteka.presentation.previewsearch.mvi.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2915a implements InterfaceC2914a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C2915a f97563a = new C2915a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C2915a);
            }

            public final int hashCode() {
                return -618444132;
            }

            @Y61.k
            public final String toString() {
                return "Default";
            }
        }

        /* compiled from: AutotekaPreviewSearchActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/a$a$b;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/a$a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.autoteka.presentation.previewsearch.mvi.a$a$b */
        public static final /* data */ class b implements InterfaceC2914a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f97564a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1456757812;
            }

            @Y61.k
            public final String toString() {
                return "Latest";
            }
        }
    }

    /* compiled from: AutotekaPreviewSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.previewsearch.mvi.AutotekaPreviewSearchActor$process$1", f = "AutotekaPreviewSearchActor.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super AutotekaPreviewSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97565q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f97566r;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f97566r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AutotekaPreviewSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97565q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f97566r;
                AutotekaPreviewSearchInternalAction.InstructionDialog instructionDialog = AutotekaPreviewSearchInternalAction.InstructionDialog.f97620b;
                this.f97565q = 1;
                if (interfaceC43172j.emit(instructionDialog, this) == coroutine_suspended) {
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

    /* compiled from: AutotekaPreviewSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.previewsearch.mvi.AutotekaPreviewSearchActor$process$2", f = "AutotekaPreviewSearchActor.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super AutotekaPreviewSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97567q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f97568r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AutotekaPreviewSearchAction f97569s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AutotekaPreviewSearchAction autotekaPreviewSearchAction, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f97569s = autotekaPreviewSearchAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f97569s, continuation);
            cVar.f97568r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AutotekaPreviewSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97567q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f97568r;
                AutotekaPreviewSearchInternalAction.NavigateByDeepLink navigateByDeepLink = new AutotekaPreviewSearchInternalAction.NavigateByDeepLink(new AutotekaBuyReportLink(((AutotekaPreviewSearchAction.NavigateToExample) this.f97569s).f97611b.toString(), null, null, null, 14, null));
                this.f97567q = 1;
                if (interfaceC43172j.emit(navigateByDeepLink, this) == coroutine_suspended) {
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

    /* compiled from: AutotekaPreviewSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.previewsearch.mvi.AutotekaPreviewSearchActor$process$3", f = "AutotekaPreviewSearchActor.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super AutotekaPreviewSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97570q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f97571r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AutotekaPreviewSearchState f97572s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AutotekaPreviewSearchState autotekaPreviewSearchState, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f97572s = autotekaPreviewSearchState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f97572s, continuation);
            dVar.f97571r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AutotekaPreviewSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParams;
            DeepLink deepLink;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97570q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f97571r;
                AutotekaPreviewSearchState autotekaPreviewSearchState = this.f97572s;
                if ((autotekaPreviewSearchState instanceof AutotekaPreviewSearchState.Data) && (autotekaChoosingPurchaseButtonParams = ((AutotekaPreviewSearchState.Data) autotekaPreviewSearchState).f97632f.f96895h) != null && (deepLink = autotekaChoosingPurchaseButtonParams.f97068b) != null) {
                    AutotekaPreviewSearchInternalAction.NavigateByDeepLink navigateByDeepLink = new AutotekaPreviewSearchInternalAction.NavigateByDeepLink(deepLink);
                    this.f97570q = 1;
                    if (interfaceC43172j.emit(navigateByDeepLink, this) == coroutine_suspended) {
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

    /* compiled from: AutotekaPreviewSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.previewsearch.mvi.AutotekaPreviewSearchActor$process$4", f = "AutotekaPreviewSearchActor.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super AutotekaPreviewSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97573q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f97574r;

        public e() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(2, continuation);
            eVar.f97574r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AutotekaPreviewSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97573q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f97574r;
                AutotekaPreviewSearchInternalAction.HideKeyboard hideKeyboard = AutotekaPreviewSearchInternalAction.HideKeyboard.f97618b;
                this.f97573q = 1;
                if (interfaceC43172j.emit(hideKeyboard, this) == coroutine_suspended) {
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

    /* compiled from: AutotekaPreviewSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.previewsearch.mvi.AutotekaPreviewSearchActor$process$5", f = "AutotekaPreviewSearchActor.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super AutotekaPreviewSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97575q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f97576r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AutotekaPreviewSearchState f97577s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AutotekaPreviewSearchState autotekaPreviewSearchState, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f97577s = autotekaPreviewSearchState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f97577s, continuation);
            fVar.f97576r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AutotekaPreviewSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97575q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f97576r;
                if (this.f97577s.f97631e) {
                    AutotekaPreviewSearchInternalAction.ShowKeyboard showKeyboard = AutotekaPreviewSearchInternalAction.ShowKeyboard.f97625b;
                    this.f97575q = 1;
                    if (interfaceC43172j.emit(showKeyboard, this) == coroutine_suspended) {
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
    public a(@Y61.k com.avito.android.autoteka.data.previewSearch.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k AutotekaPreviewSearchDetails autotekaPreviewSearchDetails) {
        this.f97560a = aVar;
        this.f97561b = aVar2;
        this.f97562c = autotekaPreviewSearchDetails;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new com.avito.android.autoteka.presentation.previewsearch.mvi.f(2, null), new com.avito.android.autoteka.presentation.previewsearch.mvi.e(y.a(this.f97561b.d9()))), C43175k.C(new com.avito.android.autoteka.presentation.previewsearch.mvi.c(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, com.avito.android.autoteka.presentation.previewsearch.mvi.b.f97578l)));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<AutotekaPreviewSearchInternalAction> b(@Y61.k AutotekaPreviewSearchAction autotekaPreviewSearchAction, @Y61.k AutotekaPreviewSearchState autotekaPreviewSearchState) {
        com.avito.android.autoteka.helpers.c.f96648a.getClass();
        String strA = com.avito.android.autoteka.helpers.c.a();
        boolean z12 = autotekaPreviewSearchAction instanceof AutotekaPreviewSearchAction.SearchPreview;
        AutotekaPreviewSearchDetails autotekaPreviewSearchDetails = this.f97562c;
        if (z12) {
            return C43175k.G(new com.avito.android.autoteka.presentation.previewsearch.mvi.d(this, autotekaPreviewSearchDetails.f96226d, autotekaPreviewSearchDetails.f96225c, ((AutotekaPreviewSearchAction.SearchPreview) autotekaPreviewSearchAction).f97615b, com.avito.android.autoteka.helpers.c.a(), null));
        }
        if (autotekaPreviewSearchAction instanceof AutotekaPreviewSearchAction.RetrySearchPreview) {
            return C43175k.G(new com.avito.android.autoteka.presentation.previewsearch.mvi.d(this, autotekaPreviewSearchDetails.f96226d, autotekaPreviewSearchDetails.f96225c, autotekaPreviewSearchState.getF97628b(), com.avito.android.autoteka.helpers.c.a(), null));
        }
        if (autotekaPreviewSearchAction instanceof AutotekaPreviewSearchAction.RestorePreviousState) {
            String strD = autotekaPreviewSearchState.getF97628b();
            if (strD.length() <= 0) {
                strD = null;
            }
            String str = strD == null ? ((AutotekaPreviewSearchAction.RestorePreviousState) autotekaPreviewSearchAction).f97613b : strD;
            if (str == null) {
                return C43175k.w();
            }
            if (autotekaPreviewSearchState instanceof AutotekaPreviewSearchState.Waiting) {
                return C43175k.G(new com.avito.android.autoteka.presentation.previewsearch.mvi.d(this, null, null, str, strA, null));
            }
            if (autotekaPreviewSearchState instanceof AutotekaPreviewSearchState.ReadyToPreviewSearch) {
                return C43175k.G(new com.avito.android.autoteka.presentation.previewsearch.mvi.d(this, autotekaPreviewSearchDetails.f96226d, autotekaPreviewSearchDetails.f96225c, str, strA, null));
            }
            if (autotekaPreviewSearchState instanceof AutotekaPreviewSearchState.Data ? true : autotekaPreviewSearchState instanceof AutotekaPreviewSearchState.FullScreenError) {
                return C43175k.w();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (autotekaPreviewSearchAction instanceof AutotekaPreviewSearchAction.ShowInstructionDialog) {
            return C43175k.G(new b(2, null));
        }
        if (autotekaPreviewSearchAction instanceof AutotekaPreviewSearchAction.NavigateToExample) {
            return C43175k.G(new c(autotekaPreviewSearchAction, null));
        }
        if (autotekaPreviewSearchAction instanceof AutotekaPreviewSearchAction.ClickToPurchase) {
            return C43175k.G(new d(autotekaPreviewSearchState, null));
        }
        if (autotekaPreviewSearchAction instanceof AutotekaPreviewSearchAction.HideKeyboard) {
            return C43175k.G(new e(2, null));
        }
        if (autotekaPreviewSearchAction instanceof AutotekaPreviewSearchAction.ShowKeyboardIfNeed) {
            return C43175k.G(new f(autotekaPreviewSearchState, null));
        }
        if (autotekaPreviewSearchAction instanceof AutotekaPreviewSearchAction.OpenPhotoGallery) {
            return new C43210w(new AutotekaPreviewSearchInternalAction.OpenPhotoGallery(((AutotekaPreviewSearchAction.OpenPhotoGallery) autotekaPreviewSearchAction).f97612b));
        }
        throw new NoWhenBranchMatchedException();
    }
}
