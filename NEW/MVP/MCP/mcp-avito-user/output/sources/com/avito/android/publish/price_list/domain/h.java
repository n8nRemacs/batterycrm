package com.avito.android.publish.price_list.domain;

import Y41.p;
import Y41.q;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.error.z;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.adverts.PretendAdvertResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.x1;
import com.avito.android.util.ApiException;
import com.avito.android.util.R0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ve0.AbstractC49316a;
import yc.C50213a;

/* compiled from: SelectPriceListInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/domain/h;", "Lcom/avito/android/publish/price_list/domain/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<x1> f238540a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C0 f238541b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f238542c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C50213a f238543d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f238544e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f238545f;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<AbstractC49316a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f238546b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ObjectsParameter f238547c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.publish.price_list.domain.h$a$a, reason: collision with other inner class name */
        public static final class C7169a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f238548b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ObjectsParameter f238549c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.publish.price_list.domain.SelectPriceListInteractorImpl$validatePriceList$$inlined$map$1$2", f = "SelectPriceListInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.publish.price_list.domain.h$a$a$a, reason: collision with other inner class name */
            public static final class C7170a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f238550q;

                /* renamed from: r, reason: collision with root package name */
                public int f238551r;

                public C7170a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f238550q = obj;
                    this.f238551r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C7169a.this.emit(null, this);
                }
            }

            public C7169a(InterfaceC43172j interfaceC43172j, ObjectsParameter objectsParameter) {
                this.f238548b = interfaceC43172j;
                this.f238549c = objectsParameter;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.publish.price_list.domain.h.a.C7169a.C7170a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.publish.price_list.domain.h$a$a$a r0 = (com.avito.android.publish.price_list.domain.h.a.C7169a.C7170a) r0
                    int r1 = r0.f238551r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f238551r = r1
                    goto L18
                L13:
                    com.avito.android.publish.price_list.domain.h$a$a$a r0 = new com.avito.android.publish.price_list.domain.h$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f238550q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f238551r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r7)
                    goto L7d
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    com.avito.android.remote.model.adverts.PretendAdvertResult r6 = (com.avito.android.remote.model.adverts.PretendAdvertResult) r6
                    boolean r7 = r6 instanceof com.avito.android.remote.model.adverts.PretendAdvertResult.Ok
                    if (r7 == 0) goto L3d
                    ve0.a$b r6 = ve0.AbstractC49316a.b.f440914a
                    goto L72
                L3d:
                    boolean r7 = r6 instanceof com.avito.android.remote.model.adverts.PretendAdvertResult.InputErrors
                    if (r7 == 0) goto L80
                    com.avito.android.remote.model.adverts.PretendAdvertResult$InputErrors r6 = (com.avito.android.remote.model.adverts.PretendAdvertResult.InputErrors) r6
                    com.avito.android.remote.model.PretendResult r7 = r6.getMessages()
                    java.util.Map r7 = r7.getErrors()
                    com.avito.android.remote.model.category_parameters.ObjectsParameter r2 = r5.f238549c
                    java.lang.String r2 = r2.getId()
                    java.lang.Object r7 = r7.get(r2)
                    boolean r2 = r7 instanceof com.avito.android.remote.model.PretendErrorValue.ObjectsMessages
                    r4 = 0
                    if (r2 == 0) goto L5d
                    com.avito.android.remote.model.PretendErrorValue$ObjectsMessages r7 = (com.avito.android.remote.model.PretendErrorValue.ObjectsMessages) r7
                    goto L5e
                L5d:
                    r7 = r4
                L5e:
                    if (r7 == 0) goto L64
                    java.lang.String r4 = r7.getMessage()
                L64:
                    ve0.a$c r7 = new ve0.a$c
                    com.avito.android.remote.model.PretendResult r6 = r6.getMessages()
                    java.util.Map r6 = r6.getErrors()
                    r7.<init>(r4, r6)
                    r6 = r7
                L72:
                    r0.f238551r = r3
                    kotlinx.coroutines.flow.j r7 = r5.f238548b
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L7d
                    return r1
                L7d:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                L80:
                    kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                    r6.<init>()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.price_list.domain.h.a.C7169a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, ObjectsParameter objectsParameter) {
            this.f238546b = interfaceC43160i;
            this.f238547c = objectsParameter;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super AbstractC49316a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f238546b.collect(new C7169a(interfaceC43172j, this.f238547c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SelectPriceListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/adverts/PretendAdvertResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.price_list.domain.SelectPriceListInteractorImpl$validatePriceList$1", f = "SelectPriceListInteractor.kt", i = {0}, l = {39, 47}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super PretendAdvertResult>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f238553q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f238554r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ObjectsParameter f238556t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ObjectsParameter objectsParameter, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f238556t = objectsParameter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = h.this.new b(this.f238556t, continuation);
            bVar.f238554r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PretendAdvertResult> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws ApiException {
            InterfaceC43172j interfaceC43172j;
            List<ParameterSlot> listSingletonList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f238553q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f238554r;
                h hVar = h.this;
                x1 x1Var = hVar.f238540a.get();
                C0 c02 = hVar.f238541b;
                Navigation navigation2 = c02.f231861Y.getNavigation();
                CategoryParametersConverter categoryParametersConverter = hVar.f238542c;
                Map<String, String> mapConvertToFieldMap = categoryParametersConverter.convertToFieldMap(navigation2);
                CategoryParameters categoryParameters = c02.f231873k0;
                if (categoryParameters == null || (listSingletonList = categoryParameters.getParametersExceptOwnedBySlots()) == null) {
                    listSingletonList = Collections.singletonList(this.f238556t);
                }
                Map<String, String> mapConvertToFieldMap2 = categoryParametersConverter.convertToFieldMap(listSingletonList);
                String strB = hVar.f238543d.b();
                this.f238554r = interfaceC43172j;
                this.f238553q = 1;
                obj = x1Var.a(mapConvertToFieldMap, null, null, mapConvertToFieldMap2, strB, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f238554r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                Object result = ((TypedResult.Success) typedResult).getResult();
                this.f238554r = null;
                this.f238553q = 2;
                if (interfaceC43172j.emit(result, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Error) {
                throw new ApiException(((TypedResult.Error) typedResult).getError(), null, 2, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectPriceListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lve0/a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.price_list.domain.SelectPriceListInteractorImpl$validatePriceList$3", f = "SelectPriceListInteractor.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements q<InterfaceC43172j<? super AbstractC49316a>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f238557q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f238558r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f238559s;

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AbstractC49316a> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = h.this.new c(continuation);
            cVar.f238558r = interfaceC43172j;
            cVar.f238559s = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f238557q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f238558r;
                AbstractC49316a.C12785a c12785a = new AbstractC49316a.C12785a(z.i(h.this.f238545f.a(this.f238559s)));
                this.f238558r = null;
                this.f238557q = 1;
                if (interfaceC43172j.emit(c12785a, this) == coroutine_suspended) {
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
    public h(@Y61.k h31.e<x1> eVar, @Y61.k C0 c02, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k C50213a c50213a, @Y61.k R0 r02, @Y61.k com.avito.android.remote.error.f fVar) {
        this.f238540a = eVar;
        this.f238541b = c02;
        this.f238542c = categoryParametersConverter;
        this.f238543d = c50213a;
        this.f238544e = r02;
        this.f238545f = fVar;
    }

    @Override // com.avito.android.publish.price_list.domain.g
    @Y61.k
    public final InterfaceC43160i<AbstractC49316a> a(@Y61.k ObjectsParameter objectsParameter) {
        return C43175k.I(this.f238544e.a(), new C43152f0(new a(C43175k.G(new b(objectsParameter, null)), objectsParameter), new c(null)));
    }
}
