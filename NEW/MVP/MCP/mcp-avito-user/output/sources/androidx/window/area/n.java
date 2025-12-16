package androidx.window.area;

import Ba1.B;
import androidx.window.extensions.area.WindowAreaComponent;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.I0;

/* compiled from: WindowAreaControllerImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "", "Landroidx/window/area/o;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1", f = "WindowAreaControllerImpl.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class n extends SuspendLambda implements Y41.p<I0<? super List<? extends o>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f55172q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f55173r;

    /* compiled from: WindowAreaControllerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            throw null;
        }

        @Override // Y41.a
        public final G0 invoke() {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f55173r = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f55173r, continuation);
        nVar.f55172q = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super List<? extends o>> i02, Continuation<? super G0> continuation) {
        ((n) create(i02, continuation)).invokeSuspend(G0.f406611a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        I0 i02 = (I0) this.f55172q;
        k kVar = this.f55173r;
        B b12 = new B(17, kVar, i02);
        kVar.getClass();
        WindowAreaComponent windowAreaComponent = null;
        windowAreaComponent.addRearDisplayStatusListener(b12);
        throw null;
    }
}
