package com.avito.android.safety.safety_settings.domain;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction;
import com.avito.android.util.R0;
import io0.InterfaceC42082a;
import java.io.Serializable;
import java.util.TimeZone;
import javax.inject.Inject;
import jo0.C42408d;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafetySettingsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/safety_settings/domain/a;", "", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42082a f257608a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f257609b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f257610c;

    /* renamed from: d, reason: collision with root package name */
    public final long f257611d = (TimeZone.getDefault().getRawOffset() / 60) / 1000;

    /* compiled from: SafetySettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safety.safety_settings.domain.SafetySettingsInteractor$getAdditionalSessions$1", f = "SafetySettingsInteractor.kt", i = {0}, l = {53, 58}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.safety.safety_settings.domain.a$a, reason: collision with other inner class name */
    public static final class C7732a extends SuspendLambda implements p<InterfaceC43172j<? super SafetySettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f257612q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f257613r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f257615t;

        /* compiled from: SafetySettingsInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljo0/d;", "it", "", "invoke", "(Ljo0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.safety.safety_settings.domain.a$a$a, reason: collision with other inner class name */
        public static final class C7733a extends N implements Y41.l<C42408d, Object> {

            /* renamed from: l, reason: collision with root package name */
            public static final C7733a f257616l = new C7733a();

            public C7733a() {
                super(1);
            }

            @Override // Y41.l
            public final Object invoke(C42408d c42408d) {
                return new SafetySettingsInternalAction.AdditionalContentSuccess(c42408d);
            }
        }

        /* compiled from: SafetySettingsInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.safety.safety_settings.domain.a$a$b */
        public static final class b extends N implements Y41.l<String, Object> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f257617l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final Object invoke(String str) {
                return new SafetySettingsInternalAction.AdditionalContentError(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7732a(long j12, Continuation<? super C7732a> continuation) {
            super(2, continuation);
            this.f257615t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C7732a c7732a = a.this.new C7732a(this.f257615t, continuation);
            c7732a.f257613r = obj;
            return c7732a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SafetySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7732a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f257612q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f257613r;
                a aVar = a.this;
                InterfaceC42082a interfaceC42082a = aVar.f257608a;
                Long lBoxLong = Boxing.boxLong(this.f257615t);
                this.f257613r = interfaceC43172j;
                this.f257612q = 1;
                obj = interfaceC42082a.e(aVar.f257611d, lBoxLong, aVar.f257610c, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f257613r;
                C42729a0.b(obj);
            }
            Object objR = z.r((TypedResult) obj, C7733a.f257616l, b.f257617l, null, com.avito.android.printable_text.b.c(R.string.safety_settings_unknown_error, new Serializable[0]), 28);
            this.f257613r = null;
            this.f257612q = 2;
            if (interfaceC43172j.emit(objR, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SafetySettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safety.safety_settings.domain.SafetySettingsInteractor$getAdditionalSessions$2", f = "SafetySettingsInteractor.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super SafetySettingsInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f257618q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f257619r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f257620s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super SafetySettingsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f257619r = interfaceC43172j;
            bVar.f257620s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f257618q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f257619r;
                SafetySettingsInternalAction.AdditionalContentError additionalContentError = new SafetySettingsInternalAction.AdditionalContentError(z.n(this.f257620s).getF244063c());
                this.f257619r = null;
                this.f257618q = 1;
                if (interfaceC43172j.emit(additionalContentError, this) == coroutine_suspended) {
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

    /* compiled from: SafetySettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safety.safety_settings.domain.SafetySettingsInteractor$getAdditionalSessions$3", f = "SafetySettingsInteractor.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super SafetySettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f257621q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f257622r;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = new c(2, continuation);
            cVar.f257622r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SafetySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f257621q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f257622r;
                SafetySettingsInternalAction.AdditionalContentLoading additionalContentLoading = new SafetySettingsInternalAction.AdditionalContentLoading();
                this.f257621q = 1;
                if (interfaceC43172j.emit(additionalContentLoading, this) == coroutine_suspended) {
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

    /* compiled from: SafetySettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safety.safety_settings.domain.SafetySettingsInteractor$getSafetySettings$1", f = "SafetySettingsInteractor.kt", i = {0}, l = {39, 44}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super SafetySettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f257623q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f257624r;

        /* compiled from: SafetySettingsInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljo0/d;", "it", "", "invoke", "(Ljo0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.safety.safety_settings.domain.a$d$a, reason: collision with other inner class name */
        public static final class C7734a extends N implements Y41.l<C42408d, Object> {

            /* renamed from: l, reason: collision with root package name */
            public static final C7734a f257626l = new C7734a();

            public C7734a() {
                super(1);
            }

            @Override // Y41.l
            public final Object invoke(C42408d c42408d) {
                return new SafetySettingsInternalAction.ContentSuccess(c42408d);
            }
        }

        /* compiled from: SafetySettingsInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b extends N implements Y41.l<String, Object> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f257627l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final Object invoke(String str) {
                return new SafetySettingsInternalAction.ContentError(str);
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d dVar = a.this.new d(continuation);
            dVar.f257624r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SafetySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f257623q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f257624r;
                a aVar = a.this;
                InterfaceC42082a interfaceC42082a = aVar.f257608a;
                this.f257624r = interfaceC43172j;
                this.f257623q = 1;
                obj = interfaceC42082a.e(aVar.f257611d, null, aVar.f257610c, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f257624r;
                C42729a0.b(obj);
            }
            Object objR = z.r((TypedResult) obj, C7734a.f257626l, b.f257627l, null, com.avito.android.printable_text.b.c(R.string.safety_settings_unknown_error, new Serializable[0]), 28);
            this.f257624r = null;
            this.f257623q = 2;
            if (interfaceC43172j.emit(objR, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SafetySettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safety.safety_settings.domain.SafetySettingsInteractor$getSafetySettings$2", f = "SafetySettingsInteractor.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements q<InterfaceC43172j<? super SafetySettingsInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f257628q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f257629r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f257630s;

        public e() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super SafetySettingsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            e eVar = new e(3, continuation);
            eVar.f257629r = interfaceC43172j;
            eVar.f257630s = th2;
            return eVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f257628q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f257629r;
                SafetySettingsInternalAction.ContentError contentError = new SafetySettingsInternalAction.ContentError(z.n(this.f257630s).getF244063c());
                this.f257629r = null;
                this.f257628q = 1;
                if (interfaceC43172j.emit(contentError, this) == coroutine_suspended) {
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

    /* compiled from: SafetySettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safety.safety_settings.domain.SafetySettingsInteractor$getSafetySettings$3", f = "SafetySettingsInteractor.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super SafetySettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f257631q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f257632r;

        public f() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            f fVar = new f(2, continuation);
            fVar.f257632r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SafetySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f257631q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f257632r;
                SafetySettingsInternalAction.ContentLoading contentLoading = new SafetySettingsInternalAction.ContentLoading();
                this.f257631q = 1;
                if (interfaceC43172j.emit(contentLoading, this) == coroutine_suspended) {
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
    public a(@k InterfaceC42082a interfaceC42082a, @k R0 r02, @l String str) {
        this.f257608a = interfaceC42082a;
        this.f257609b = r02;
        this.f257610c = str;
    }

    @k
    public final InterfaceC43160i<SafetySettingsInternalAction> a(long j12) {
        return C43175k.I(this.f257609b.a(), new C43137a0(new c(2, null), new C43152f0(C43175k.G(new C7732a(j12, null)), new b(3, null))));
    }

    @k
    public final InterfaceC43160i<SafetySettingsInternalAction> b() {
        return C43175k.I(this.f257609b.a(), new C43137a0(new f(2, null), new C43152f0(C43175k.G(new d(null)), new e(3, null))));
    }
}
