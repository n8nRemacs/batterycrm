package com.avito.android.publish.step.request.suggest.mvi;

import Y41.p;
import Y41.q;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.publish.di.W;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.core.I;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: SuggestRequestBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/step/request/suggest/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "LBf0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements com.avito.android.arch.mvi.b<Bf0.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C0 f245468a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.params_suggest.h f245469b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.params_suggest.a f245470c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f245471d;

    /* renamed from: e, reason: collision with root package name */
    public final int f245472e;

    /* compiled from: SuggestRequestBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBf0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.step.request.suggest.mvi.SuggestRequestBootstrap$produce$1", f = "SuggestRequestBootstrap.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super Bf0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f245473q;

        /* compiled from: SuggestRequestBootstrap.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "Lcom/avito/android/publish/params_suggest/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.step.request.suggest.mvi.SuggestRequestBootstrap$produce$1$result$1", f = "SuggestRequestBootstrap.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.publish.step.request.suggest.mvi.d$a$a, reason: collision with other inner class name */
        public static final class C7355a extends SuspendLambda implements p<T, Continuation<? super List<? extends com.avito.android.publish.params_suggest.d>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f245475q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ d f245476r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7355a(d dVar, Continuation<? super C7355a> continuation) {
                super(2, continuation);
                this.f245476r = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C7355a(this.f245476r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super List<? extends com.avito.android.publish.params_suggest.d>> continuation) {
                return ((C7355a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f245475q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    d dVar = this.f245476r;
                    com.avito.android.publish.params_suggest.h hVar = dVar.f245469b;
                    C0 c02 = dVar.f245468a;
                    I<List<com.avito.android.publish.params_suggest.d>> iA2 = hVar.a(c02.f231861Y.getNavigation(), c02.f231873k0);
                    this.f245475q = 1;
                    obj = C43292o.b(iA2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Bf0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            CategoryParameters categoryParametersA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f245473q;
            d dVar = d.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                CategoryPublishStep categoryPublishStepRe = dVar.f245468a.re(Boxing.boxInt(dVar.f245472e));
                if (!(categoryPublishStepRe instanceof CategoryPublishStep.Request)) {
                    return G0.f406611a;
                }
                if (L.f(((CategoryPublishStep.Request) categoryPublishStepRe).getShouldSkip(), Boxing.boxBoolean(true))) {
                    dVar.f245468a.xe(null);
                    return G0.f406611a;
                }
                kotlinx.coroutines.scheduling.b bVarA = dVar.f245471d.a();
                C7355a c7355a = new C7355a(dVar, null);
                this.f245473q = 1;
                obj = C43259k.g(bVarA, c7355a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            List<com.avito.android.publish.params_suggest.d> list = (List) obj;
            CategoryParameters categoryParameters = dVar.f245468a.f231873k0;
            C0 c02 = dVar.f245468a;
            if (categoryParameters != null && (categoryParametersA = dVar.f245470c.a(categoryParameters, list)) != null) {
                c02.Le(categoryParametersA);
            }
            c02.xe(null);
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestRequestBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBf0/b;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.step.request.suggest.mvi.SuggestRequestBootstrap$produce$2", f = "SuggestRequestBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super Bf0.b>, Throwable, Continuation<? super G0>, Object> {
        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Bf0.b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            return d.this.new b(continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            d.this.f245468a.xe(null);
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k C0 c02, @Y61.k com.avito.android.publish.params_suggest.h hVar, @Y61.k com.avito.android.publish.params_suggest.a aVar, @Y61.k R0 r02, @W int i12) {
        this.f245468a = c02;
        this.f245469b = hVar;
        this.f245470c = aVar;
        this.f245471d = r02;
        this.f245472e = i12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<Bf0.b> a() {
        return new C43152f0(C43175k.G(new a(null)), new b(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
