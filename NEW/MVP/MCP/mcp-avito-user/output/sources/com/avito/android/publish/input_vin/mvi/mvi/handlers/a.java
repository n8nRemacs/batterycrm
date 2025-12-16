package com.avito.android.publish.input_vin.mvi.mvi.handlers;

import Y41.q;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishState;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.di.W;
import com.avito.android.publish.input_vin.mvi.mvi.p;
import com.avito.android.publish.input_vin.mvi.z;
import com.avito.android.util.NotFoundException;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.avito.android.validation.l1;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.d;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;
import me0.C44072a;
import ne0.C44387d;
import ne0.InterfaceC44385b;

/* compiled from: PublishButtonClickHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/input_vin/mvi/mvi/handlers/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C0 f236672a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l1 f236673b;

    /* renamed from: c, reason: collision with root package name */
    public final int f236674c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final p f236675d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final R0 f236676e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC33535v f236677f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C44072a f236678g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final z f236679h;

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.input_vin.mvi.mvi.handlers.PublishButtonClickHandler$handle$$inlined$flatMapLatest$1", f = "PublishButtonClickHandler.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.publish.input_vin.mvi.mvi.handlers.a$a, reason: collision with other inner class name */
    public static final class C7128a extends SuspendLambda implements q<InterfaceC43172j<? super InterfaceC44385b>, l1.b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f236680q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f236681r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f236682s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f236683t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C44387d f236684u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7128a(Continuation continuation, a aVar, C44387d c44387d) {
            super(3, continuation);
            this.f236683t = aVar;
            this.f236684u = c44387d;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC44385b> interfaceC43172j, l1.b bVar, Continuation<? super G0> continuation) {
            C7128a c7128a = new C7128a(continuation, this.f236683t, this.f236684u);
            c7128a.f236681r = interfaceC43172j;
            c7128a.f236682s = bVar;
            return c7128a.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43160i<InterfaceC44385b> interfaceC43160iG;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f236680q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f236681r;
                l1.b bVar = (l1.b) this.f236682s;
                boolean z12 = bVar instanceof l1.b.a;
                C44387d c44387d = this.f236684u;
                a aVar = this.f236683t;
                if (z12) {
                    interfaceC43160iG = aVar.f236679h.a(c44387d.f415262a);
                } else {
                    if (!(bVar instanceof l1.b.C9896b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.getClass();
                    interfaceC43160iG = C43175k.G(new com.avito.android.publish.input_vin.mvi.mvi.handlers.b((l1.b.C9896b) bVar, c44387d, aVar, null));
                }
                this.f236680q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: PublishButtonClickHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/validation/l1$b;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.input_vin.mvi.mvi.handlers.PublishButtonClickHandler$handle$1", f = "PublishButtonClickHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super l1.b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f236685q;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super l1.b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f236685q = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.e("Failed to startLocalValidation", this.f236685q);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k C0 c02, @k l1 l1Var, @W int i12, @k p pVar, @k R0 r02, @k InterfaceC33535v interfaceC33535v, @k C44072a c44072a, @k z zVar) {
        this.f236672a = c02;
        this.f236673b = l1Var;
        this.f236674c = i12;
        this.f236675d = pVar;
        this.f236676e = r02;
        this.f236677f = interfaceC33535v;
        this.f236678g = c44072a;
        this.f236679h = zVar;
    }

    @k
    public final InterfaceC43160i<InterfaceC44385b> a(@k C44387d c44387d) throws NotFoundException {
        PublishState.StepState imei;
        C0 c02 = this.f236672a;
        PublishState publishState = c02.f231861Y;
        Map<Integer, PublishState.StepState> mapK = publishState.k();
        int i12 = this.f236674c;
        Parcelable parcelable = (PublishState.StepState) mapK.get(Integer.valueOf(i12));
        if (!(parcelable instanceof PublishState.StepState.Vin)) {
            n0 n0Var = m0.f406844a;
            d dVarB = n0Var.b(PublishState.StepState.Vin.class);
            if (dVarB.equals(n0Var.b(PublishState.StepState.Wizard.class))) {
                imei = new PublishState.StepState.Wizard(null, null, null, 7, null);
            } else if (dVarB.equals(n0Var.b(PublishState.StepState.CategoriesSuggestions.class))) {
                imei = new PublishState.StepState.CategoriesSuggestions(null, null, null, null, 15, null);
            } else if (dVarB.equals(n0Var.b(PublishState.StepState.Vin.class))) {
                imei = new PublishState.StepState.Vin(null, 1, null);
            } else {
                if (!dVarB.equals(n0Var.b(PublishState.StepState.Imei.class))) {
                    throw new NotFoundException(n0Var.b(PublishState.StepState.Vin.class).toString(), (Throwable) null, 2, (C42822w) null);
                }
                imei = new PublishState.StepState.Imei(null, 1, null);
            }
            publishState.k().put(Integer.valueOf(i12), imei);
            parcelable = (PublishState.StepState.Vin) imei;
        }
        String recognizedVin = ((PublishState.StepState.Vin) parcelable).getRecognizedVin();
        String str = c44387d.f415262a;
        if (str.length() > 0 && str.equals(recognizedVin)) {
            return new C43210w(InterfaceC44385b.e.f415234a);
        }
        return C43175k.Y(C43175k.I(this.f236676e.a(), new C43152f0(y.a(this.f236673b.h(this.f236675d.a(c02.pe(i12)), B0.f406639b).F()), new b(3, null))), new C7128a(null, this, c44387d));
    }
}
