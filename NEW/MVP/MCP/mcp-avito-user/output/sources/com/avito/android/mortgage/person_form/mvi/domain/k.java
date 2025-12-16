package com.avito.android.mortgage.person_form.mvi.domain;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.DataHolder;
import com.avito.android.mortgage.api.model.FormItemValueModel;
import com.avito.android.mortgage.api.model.items.form.InputFormContentItemValue;
import com.avito.android.mortgage.api.model.items.form.InputFormContentType;
import com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue;
import com.avito.android.mortgage.api.model.items.form.SuggestFormSuggestType;
import com.avito.android.mortgage.domain.check_access.a;
import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UpdateMortgageFormInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/domain/k;", "Lcom/avito/android/mortgage/person_form/mvi/domain/j;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f201072a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final IZ.a f201073b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.person_form.mvi.domain.a f201074c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.person_form.mvi.domain.validators.c f201075d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.domain.check_access.b f201076e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.person_form.mvi.domain.formatters.a f201077f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.person_form.mvi.domain.formatters.d f201078g;

    /* compiled from: UpdateMortgageFormInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201079a;

        static {
            int[] iArr = new int[InputFormContentType.values().length];
            try {
                iArr[InputFormContentType.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputFormContentType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f201079a = iArr;
        }
    }

    /* compiled from: UpdateMortgageFormInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.UpdateMortgageFormInteractorImpl$updateForm$1", f = "UpdateMortgageFormInteractor.kt", i = {0, 1, 1, 1, 3, 3, 4, 4}, l = {80, 93, 102, 109, 138, 142}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "validationResult", "reloadAfterUpdate", "$this$flow", "reloadAfterUpdate", "$this$flow", "reloadAfterUpdate"}, s = {"L$0", "L$0", "L$1", "I$0", "L$0", "I$0", "L$0", "I$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PersonFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ String f201080A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ String f201081B;

        /* renamed from: q, reason: collision with root package name */
        public LinkedHashSet f201082q;

        /* renamed from: r, reason: collision with root package name */
        public int f201083r;

        /* renamed from: s, reason: collision with root package name */
        public int f201084s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f201085t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List<LZ.c> f201087v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f201088w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f201089x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ boolean f201090y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f201091z;

        /* compiled from: UpdateMortgageFormInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage/domain/check_access/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/mortgage/domain/check_access/a;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.UpdateMortgageFormInteractorImpl$updateForm$1$3", f = "UpdateMortgageFormInteractor.kt", i = {0}, l = {114, 116, 132}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
        public static final class a extends SuspendLambda implements Y41.p<com.avito.android.mortgage.domain.check_access.a, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f201092q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f201093r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<PersonFormInternalAction> f201094s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Set<com.avito.android.mortgage.person_form.mvi.domain.validators.a> f201095t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ String f201096u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f201097v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f201098w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ String f201099x;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ String f201100y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Set<com.avito.android.mortgage.person_form.mvi.domain.validators.a> set, String str, String str2, String str3, String str4, String str5, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f201094s = interfaceC43172j;
                this.f201095t = set;
                this.f201096u = str;
                this.f201097v = str2;
                this.f201098w = str3;
                this.f201099x = str4;
                this.f201100y = str5;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f201094s, this.f201095t, this.f201096u, this.f201097v, this.f201098w, this.f201099x, this.f201100y, continuation);
                aVar.f201093r = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(com.avito.android.mortgage.domain.check_access.a aVar, Continuation<? super G0> continuation) {
                return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                com.avito.android.mortgage.domain.check_access.a aVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f201092q;
                InterfaceC43172j<PersonFormInternalAction> interfaceC43172j = this.f201094s;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    aVar = (com.avito.android.mortgage.domain.check_access.a) this.f201093r;
                    PersonFormInternalAction.UploadingCompleted uploadingCompleted = new PersonFormInternalAction.UploadingCompleted(this.f201095t);
                    this.f201093r = aVar;
                    this.f201092q = 1;
                    if (interfaceC43172j.emit(uploadingCompleted, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2 && i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        return G0.f406611a;
                    }
                    aVar = (com.avito.android.mortgage.domain.check_access.a) this.f201093r;
                    C42729a0.b(obj);
                }
                if (aVar instanceof a.C5890a) {
                    a.C5890a c5890a = (a.C5890a) aVar;
                    String str = c5890a.f199470a;
                    String str2 = this.f201097v;
                    String str3 = this.f201098w;
                    PersonFormInternalAction.OpenPhoneConfirmationDialog openPhoneConfirmationDialog = new PersonFormInternalAction.OpenPhoneConfirmationDialog(new PhoneConfirmArguments(str, c5890a.f199471b, c5890a.f199473d, this.f201096u, str2, str3, this.f201099x, c5890a.f199472c, this.f201100y));
                    this.f201093r = null;
                    this.f201092q = 2;
                    if (interfaceC43172j.emit(openPhoneConfirmationDialog, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    PersonFormInternalAction.PhoneConfirmed phoneConfirmed = PersonFormInternalAction.PhoneConfirmed.f201202b;
                    this.f201093r = null;
                    this.f201092q = 3;
                    if (interfaceC43172j.emit(phoneConfirmed, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return G0.f406611a;
            }
        }

        /* compiled from: UpdateMortgageFormInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/error/ApiError;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.UpdateMortgageFormInteractorImpl$updateForm$1$4", f = "UpdateMortgageFormInteractor.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.mortgage.person_form.mvi.domain.k$b$b, reason: collision with other inner class name */
        public static final class C5958b extends SuspendLambda implements Y41.p<ApiError, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f201101q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f201102r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<PersonFormInternalAction> f201103s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C5958b(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super C5958b> continuation) {
                super(2, continuation);
                this.f201103s = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C5958b c5958b = new C5958b(this.f201103s, continuation);
                c5958b.f201102r = obj;
                return c5958b;
            }

            @Override // Y41.p
            public final Object invoke(ApiError apiError, Continuation<? super G0> continuation) {
                return ((C5958b) create(apiError, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f201101q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    PersonFormInternalAction.UploadingFailed uploadingFailed = new PersonFormInternalAction.UploadingFailed((ApiError) this.f201102r);
                    this.f201101q = 1;
                    if (this.f201103s.emit(uploadingFailed, this) == coroutine_suspended) {
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

        /* compiled from: UpdateMortgageFormInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.UpdateMortgageFormInteractorImpl$updateForm$1$5", f = "UpdateMortgageFormInteractor.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f201104q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<PersonFormInternalAction> f201105r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super c> continuation) {
                super(1, continuation);
                this.f201105r = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
                return new c(this.f201105r, continuation);
            }

            @Override // Y41.l
            public final Object invoke(Continuation<? super G0> continuation) {
                return ((c) create(continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f201104q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    PersonFormInternalAction.ReloadingStarted reloadingStarted = new PersonFormInternalAction.ReloadingStarted();
                    this.f201104q = 1;
                    if (this.f201105r.emit(reloadingStarted, this) == coroutine_suspended) {
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

        /* compiled from: UpdateMortgageFormInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJZ/m;", "it", "Lkotlin/G0;", "<anonymous>", "(LJZ/m;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.UpdateMortgageFormInteractorImpl$updateForm$1$6", f = "UpdateMortgageFormInteractor.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Y41.p<JZ.m, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f201106q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f201107r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<PersonFormInternalAction> f201108s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f201108s = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                d dVar = new d(this.f201108s, continuation);
                dVar.f201107r = obj;
                return dVar;
            }

            @Override // Y41.p
            public final Object invoke(JZ.m mVar, Continuation<? super G0> continuation) {
                return ((d) create(mVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f201106q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    PersonFormInternalAction.ReloadingCompleted reloadingCompleted = new PersonFormInternalAction.ReloadingCompleted((JZ.m) this.f201107r);
                    this.f201106q = 1;
                    if (this.f201108s.emit(reloadingCompleted, this) == coroutine_suspended) {
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

        /* compiled from: UpdateMortgageFormInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/error/ApiError;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.UpdateMortgageFormInteractorImpl$updateForm$1$7", f = "UpdateMortgageFormInteractor.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
        public static final class e extends SuspendLambda implements Y41.p<ApiError, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f201109q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f201110r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<PersonFormInternalAction> f201111s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public e(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f201111s = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                e eVar = new e(this.f201111s, continuation);
                eVar.f201110r = obj;
                return eVar;
            }

            @Override // Y41.p
            public final Object invoke(ApiError apiError, Continuation<? super G0> continuation) {
                return ((e) create(apiError, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f201109q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    PersonFormInternalAction.ReloadingFailed reloadingFailed = new PersonFormInternalAction.ReloadingFailed((ApiError) this.f201110r);
                    this.f201109q = 1;
                    if (this.f201111s.emit(reloadingFailed, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<LZ.c> list, String str, String str2, boolean z12, String str3, String str4, String str5, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f201087v = list;
            this.f201088w = str;
            this.f201089x = str2;
            this.f201090y = z12;
            this.f201091z = str3;
            this.f201080A = str4;
            this.f201081B = str5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = k.this.new b(this.f201087v, this.f201088w, this.f201089x, this.f201090y, this.f201091z, this.f201080A, this.f201081B, continuation);
            bVar.f201085t = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x0252 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x023e  */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 656
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.mvi.domain.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public k(@Y61.k R0 r02, @Y61.k IZ.a aVar, @Y61.k com.avito.android.mortgage.person_form.mvi.domain.a aVar2, @Y61.k com.avito.android.mortgage.person_form.mvi.domain.validators.c cVar, @Y61.k com.avito.android.mortgage.domain.check_access.b bVar, @Y61.k com.avito.android.mortgage.person_form.mvi.domain.formatters.a aVar3, @Y61.k com.avito.android.mortgage.person_form.mvi.domain.formatters.d dVar) {
        this.f201072a = r02;
        this.f201073b = aVar;
        this.f201074c = aVar2;
        this.f201075d = cVar;
        this.f201076e = bVar;
        this.f201077f = aVar3;
        this.f201078g = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v28, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.util.ArrayList] */
    public static final ArrayList c(k kVar, List list, LinkedHashSet linkedHashSet) {
        ?? arrayList;
        Object next;
        kVar.getClass();
        List list2 = list;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.avito.android.mortgage.api.model.items.form.d dVar = ((LZ.c) it.next()).f9996b;
            SuggestFormContentItemValue suggestFormContentItemValue = dVar instanceof SuggestFormContentItemValue ? (SuggestFormContentItemValue) dVar : null;
            if (suggestFormContentItemValue != null) {
                arrayList2.add(suggestFormContentItemValue);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            SuggestFormContentItemValue suggestFormContentItemValue2 = (SuggestFormContentItemValue) next2;
            if (suggestFormContentItemValue2.getIsDisclosed() && suggestFormContentItemValue2.getSuggestType() == SuggestFormSuggestType.ADDRESS) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            List<String> listE = ((SuggestFormContentItemValue) it3.next()).e();
            if (listE == null) {
                listE = C42784z0.f406748b;
            }
            C42745f0.h(listE, arrayList4);
        }
        Set setP0 = C42745f0.P0(arrayList4);
        int iF2 = P0.f(C42745f0.q(arrayList3, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next3 = it4.next();
            linkedHashMap.put(((SuggestFormContentItemValue) next3).getId(), next3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List<String> listE2 = ((SuggestFormContentItemValue) entry.getValue()).e();
            if (listE2 != null) {
                arrayList = new ArrayList();
                for (String str : listE2) {
                    Iterator it5 = list2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it5.next();
                        if (L.f(((LZ.c) next).f9996b.getId(), str)) {
                            break;
                        }
                    }
                    LZ.c cVar = (LZ.c) next;
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = C42784z0.f406748b;
            }
            linkedHashMap2.put(key, arrayList);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!((List) entry2.getValue()).isEmpty()) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            List list3 = (List) entry3.getValue();
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it6 = list3.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    if (LZ.e.a((LZ.c) it6.next())) {
                        linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                        break;
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
            List list4 = (List) entry4.getValue();
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it7 = list4.iterator();
                while (it7.hasNext()) {
                    if (!e((LZ.c) it7.next(), linkedHashSet)) {
                        break;
                    }
                }
            }
            linkedHashMap5.put(entry4.getKey(), entry4.getValue());
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it8 = linkedHashMap5.entrySet().iterator();
        while (it8.hasNext()) {
            List list5 = (List) ((Map.Entry) it8.next()).getValue();
            ArrayList arrayList6 = new ArrayList(C42745f0.q(list5, 10));
            Iterator it9 = list5.iterator();
            while (it9.hasNext()) {
                arrayList6.add(((LZ.c) it9.next()).f9996b);
            }
            C42745f0.h(arrayList6, arrayList5);
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it10 = list2.iterator();
        while (it10.hasNext()) {
            com.avito.android.mortgage.api.model.items.form.d dVar2 = ((LZ.c) it10.next()).f9996b;
            SuggestFormContentItemValue suggestFormContentItemValue3 = dVar2 instanceof SuggestFormContentItemValue ? (SuggestFormContentItemValue) dVar2 : null;
            if (suggestFormContentItemValue3 != null) {
                arrayList7.add(suggestFormContentItemValue3);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it11 = arrayList7.iterator();
        while (it11.hasNext()) {
            Object next4 = it11.next();
            if (!((SuggestFormContentItemValue) next4).getIsDisclosed()) {
                arrayList8.add(next4);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator it12 = arrayList8.iterator();
        while (it12.hasNext()) {
            List<String> listE3 = ((SuggestFormContentItemValue) it12.next()).e();
            if (listE3 == null) {
                listE3 = C42784z0.f406748b;
            }
            C42745f0.h(listE3, arrayList9);
        }
        ArrayList arrayList10 = new ArrayList();
        for (Object obj : list2) {
            LZ.c cVar2 = (LZ.c) obj;
            if (!setP0.contains(cVar2.f9996b.getId()) && !arrayList9.contains(cVar2.f9996b.getId())) {
                arrayList10.add(obj);
            }
        }
        ArrayList arrayList11 = new ArrayList();
        Iterator it13 = arrayList10.iterator();
        while (it13.hasNext()) {
            Object next5 = it13.next();
            LZ.c cVar3 = (LZ.c) next5;
            if (LZ.e.a(cVar3) && e(cVar3, linkedHashSet)) {
                arrayList11.add(next5);
            }
        }
        ArrayList arrayList12 = new ArrayList(C42745f0.q(arrayList11, 10));
        Iterator it14 = arrayList11.iterator();
        while (it14.hasNext()) {
            arrayList12.add(((LZ.c) it14.next()).f9996b);
        }
        return C42745f0.h0(arrayList12, arrayList5);
    }

    public static final JZ.j d(k kVar, com.avito.android.mortgage.api.model.items.form.d dVar) {
        FormItemValueModel formItemValueModel;
        FormItemValueModel formItemValueModel2;
        kVar.getClass();
        JZ.j jVar = null;
        if (dVar instanceof com.avito.android.mortgage.api.model.items.form.a ? true : dVar instanceof com.avito.android.mortgage.api.model.items.form.f) {
            formItemValueModel2 = null;
        } else if (dVar instanceof com.avito.android.mortgage.api.model.items.form.b) {
            formItemValueModel2 = new FormItemValueModel(null, String.valueOf(((com.avito.android.mortgage.api.model.items.form.b) dVar).getValue()));
        } else if (dVar instanceof com.avito.android.mortgage.api.model.items.form.c) {
            String strG = ((com.avito.android.mortgage.api.model.items.form.c) dVar).g();
            if (strG == null) {
                strG = "";
            }
            formItemValueModel2 = new FormItemValueModel(null, strG);
        } else {
            if (dVar instanceof InputFormContentItemValue) {
                InputFormContentItemValue inputFormContentItemValue = (InputFormContentItemValue) dVar;
                InputFormContentType inputFormContentTypeD = inputFormContentItemValue.d();
                String value = inputFormContentItemValue.getValue();
                int i12 = a.f201079a[inputFormContentTypeD.ordinal()];
                if (i12 == 1) {
                    if (value == null) {
                        value = "";
                    }
                    value = kVar.f201077f.a(value);
                } else if (i12 == 2) {
                    if (value == null) {
                        value = "";
                    }
                    value = kVar.f201078g.a(value);
                }
                if (value == null) {
                    value = "";
                }
                formItemValueModel = new FormItemValueModel(null, value);
            } else if (dVar instanceof com.avito.android.mortgage.api.model.items.form.e) {
                String strG2 = ((com.avito.android.mortgage.api.model.items.form.e) dVar).g();
                if (strG2 == null) {
                    strG2 = "";
                }
                formItemValueModel2 = new FormItemValueModel(null, strG2);
            } else if (dVar instanceof SuggestFormContentItemValue) {
                SuggestFormContentItemValue suggestFormContentItemValue = (SuggestFormContentItemValue) dVar;
                FormItemValueModel value2 = suggestFormContentItemValue.getValue();
                DataHolder data = value2 != null ? value2.getData() : null;
                FormItemValueModel value3 = suggestFormContentItemValue.getValue();
                String value4 = value3 != null ? value3.getValue() : null;
                if (value4 == null) {
                    value4 = "";
                }
                formItemValueModel2 = new FormItemValueModel(data, value4);
            } else {
                if (!(dVar instanceof LZ.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                LZ.b bVar = (LZ.b) dVar;
                String str = bVar.f9989b;
                formItemValueModel = new FormItemValueModel(str != null ? new DataHolder.ChildrenDataHolder(str) : null, String.valueOf(bVar.getValue()));
            }
            formItemValueModel2 = formItemValueModel;
        }
        if (formItemValueModel2 != null) {
            String id2 = dVar.getId();
            String name = dVar.getName();
            String context = dVar.getContext();
            jVar = new JZ.j(id2, name, context != null ? context : "", formItemValueModel2);
        }
        return jVar;
    }

    public static boolean e(LZ.c cVar, LinkedHashSet linkedHashSet) {
        String name = cVar.f9996b.getName();
        if (linkedHashSet.isEmpty()) {
            return true;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (L.f(((com.avito.android.mortgage.person_form.mvi.domain.validators.a) it.next()).f201170a, name)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.avito.android.mortgage.person_form.mvi.domain.j
    @Y61.k
    public final InterfaceC43160i a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k ArrayList arrayList, @Y61.k LZ.c cVar) {
        return C43175k.I(this.f201072a.a(), C43175k.G(new l(this, arrayList, cVar, str, str2, str3, null)));
    }

    @Override // com.avito.android.mortgage.person_form.mvi.domain.j
    @Y61.k
    public final InterfaceC43160i<PersonFormInternalAction> b(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k List<LZ.c> list, boolean z12) {
        return C43175k.I(this.f201072a.a(), C43175k.G(new b(list, str, str2, z12, str4, str5, str3, null)));
    }
}
