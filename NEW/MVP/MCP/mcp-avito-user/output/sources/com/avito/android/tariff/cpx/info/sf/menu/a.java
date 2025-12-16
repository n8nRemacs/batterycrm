package com.avito.android.tariff.cpx.info.sf.menu;

import Y41.p;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.tariff.cpx.info.sf.menu.TariffCpxInfoSfMenuDialogFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import zB0.InterfaceC50433b;

/* compiled from: TariffCpxInfoSfMenuDialogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpx.info.sf.menu.TariffCpxInfoSfMenuDialogFragment$ScreenContent$1", f = "TariffCpxInfoSfMenuDialogFragment.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f296760q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC50433b> f296761r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TariffCpxInfoSfMenuDialogFragment f296762s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f296763t;

    /* compiled from: TariffCpxInfoSfMenuDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LzB0/b;", "event", "Lkotlin/G0;", "emit", "(LzB0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.tariff.cpx.info.sf.menu.a$a, reason: collision with other inner class name */
    public static final class C9035a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TariffCpxInfoSfMenuDialogFragment f296764b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f296765c;

        public C9035a(TariffCpxInfoSfMenuDialogFragment tariffCpxInfoSfMenuDialogFragment, InterfaceC22204y1 interfaceC22204y1) {
            this.f296764b = tariffCpxInfoSfMenuDialogFragment;
            this.f296765c = interfaceC22204y1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            InterfaceC50433b interfaceC50433b = (InterfaceC50433b) obj;
            boolean z12 = interfaceC50433b instanceof InterfaceC50433b.a;
            TariffCpxInfoSfMenuDialogFragment tariffCpxInfoSfMenuDialogFragment = this.f296764b;
            if (z12) {
                tariffCpxInfoSfMenuDialogFragment.dismiss();
            } else if (interfaceC50433b instanceof InterfaceC50433b.C12947b) {
                TariffCpxInfoSfMenuDialogFragment.a aVar = TariffCpxInfoSfMenuDialogFragment.f296742o0;
                ((Y41.l) this.f296765c.getF42167b()).invoke(((InterfaceC50433b.C12947b) interfaceC50433b).f443945a);
                tariffCpxInfoSfMenuDialogFragment.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC43160i interfaceC43160i, TariffCpxInfoSfMenuDialogFragment tariffCpxInfoSfMenuDialogFragment, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f296761r = interfaceC43160i;
        this.f296762s = tariffCpxInfoSfMenuDialogFragment;
        this.f296763t = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new a(this.f296761r, this.f296762s, this.f296763t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f296760q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C9035a c9035a = new C9035a(this.f296762s, this.f296763t);
            this.f296760q = 1;
            if (this.f296761r.collect(c9035a, this) == coroutine_suspended) {
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
