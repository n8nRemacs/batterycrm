package com.avito.android.tariff_lf_constructor.configure.vertical;

import Y41.p;
import Y61.k;
import android.widget.Toast;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l;
import com.avito.android.tariff_lf_constructor.configure.vertical.ConstructorConfigureVerticalFragment;
import com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.h;
import com.avito.android.util.P2;
import com.avito.konveyor.adapter.d;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;

/* compiled from: ConstructorConfigureVerticalFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff_lf_constructor.configure.vertical.ConstructorConfigureVerticalFragment$observeViewModel$1", f = "ConstructorConfigureVerticalFragment.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f300567q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ConstructorConfigureVerticalFragment f300568r;

    /* compiled from: ConstructorConfigureVerticalFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff_lf_constructor.configure.vertical.ConstructorConfigureVerticalFragment$observeViewModel$1$1", f = "ConstructorConfigureVerticalFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.tariff_lf_constructor.configure.vertical.a$a, reason: collision with other inner class name */
    public static final class C9189a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f300569q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ConstructorConfigureVerticalFragment f300570r;

        /* compiled from: ConstructorConfigureVerticalFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.tariff_lf_constructor.configure.vertical.ConstructorConfigureVerticalFragment$observeViewModel$1$1$1", f = "ConstructorConfigureVerticalFragment.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.tariff_lf_constructor.configure.vertical.a$a$a, reason: collision with other inner class name */
        public static final class C9190a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f300571q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ConstructorConfigureVerticalFragment f300572r;

            /* compiled from: ConstructorConfigureVerticalFragment.kt */
            @s0
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "", "Lcom/avito/conveyor_item/a;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(Lcom/avito/android/util/P2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.tariff_lf_constructor.configure.vertical.a$a$a$a, reason: collision with other inner class name */
            public static final class C9191a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ConstructorConfigureVerticalFragment f300573b;

                public C9191a(ConstructorConfigureVerticalFragment constructorConfigureVerticalFragment) {
                    this.f300573b = constructorConfigureVerticalFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    P2 p22 = (P2) obj;
                    boolean z12 = p22 instanceof P2.c;
                    ConstructorConfigureVerticalFragment constructorConfigureVerticalFragment = this.f300573b;
                    if (z12) {
                        ConstructorConfigureVerticalFragment.a aVar = ConstructorConfigureVerticalFragment.f300552y0;
                        constructorConfigureVerticalFragment.q5().k(null);
                    } else if (p22 instanceof P2.a) {
                        P2.a aVar2 = (P2.a) p22;
                        ApiError apiError = aVar2.f318719a;
                        if (apiError instanceof ApiError.ErrorAction) {
                            l lVar = constructorConfigureVerticalFragment.f300563w0;
                            if (lVar != null) {
                                lVar.y(((ApiError.ErrorAction) apiError).getLink());
                            }
                            ApiError.ErrorAction errorAction = (ApiError.ErrorAction) apiError;
                            String f244063c = errorAction.getF244063c();
                            if (f244063c != null && !C43066x.K(f244063c)) {
                                Toast.makeText(constructorConfigureVerticalFragment.getContext(), errorAction.getF244063c(), 1).show();
                            }
                            ActivityC22955m activityC22955mL1 = constructorConfigureVerticalFragment.l1();
                            if (activityC22955mL1 != null) {
                                activityC22955mL1.finish();
                            }
                        } else {
                            ConstructorConfigureVerticalFragment.a aVar3 = ConstructorConfigureVerticalFragment.f300552y0;
                            constructorConfigureVerticalFragment.q5().a(z.k(aVar2.f318719a));
                        }
                    } else if (p22 instanceof P2.b) {
                        ConstructorConfigureVerticalFragment.a aVar4 = ConstructorConfigureVerticalFragment.f300552y0;
                        constructorConfigureVerticalFragment.q5().j();
                        d dVar = constructorConfigureVerticalFragment.f300554n0;
                        if (dVar == null) {
                            dVar = null;
                        }
                        dVar.l((List) ((P2.b) p22).f318720a, null);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9190a(ConstructorConfigureVerticalFragment constructorConfigureVerticalFragment, Continuation<? super C9190a> continuation) {
                super(2, continuation);
                this.f300572r = constructorConfigureVerticalFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new C9190a(this.f300572r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C9190a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f300571q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ConstructorConfigureVerticalFragment constructorConfigureVerticalFragment = this.f300572r;
                    h hVar = constructorConfigureVerticalFragment.f300559s0;
                    if (hVar == null) {
                        hVar = null;
                    }
                    Z1<P2<List<? extends com.avito.conveyor_item.a>>> z12 = hVar.f300672L;
                    C9191a c9191a = new C9191a(constructorConfigureVerticalFragment);
                    this.f300571q = 1;
                    if (z12.collect(c9191a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9189a(ConstructorConfigureVerticalFragment constructorConfigureVerticalFragment, Continuation<? super C9189a> continuation) {
            super(2, continuation);
            this.f300570r = constructorConfigureVerticalFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            C9189a c9189a = new C9189a(this.f300570r, continuation);
            c9189a.f300569q = obj;
            return c9189a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C9189a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C43259k.d((T) this.f300569q, null, null, new C9190a(this.f300570r, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ConstructorConfigureVerticalFragment constructorConfigureVerticalFragment, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f300568r = constructorConfigureVerticalFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f300568r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f300567q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            ConstructorConfigureVerticalFragment constructorConfigureVerticalFragment = this.f300568r;
            C9189a c9189a = new C9189a(constructorConfigureVerticalFragment, null);
            this.f300567q = 1;
            if (C23056p0.b(constructorConfigureVerticalFragment, state, c9189a, this) == coroutine_suspended) {
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
