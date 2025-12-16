package z80;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC23487e;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.util.R0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;

/* compiled from: PinchToZoomViewPager2OnPageChangeCallback.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz80/f;", "Landroidx/viewpager2/widget/ViewPager2$i;", "_avito_pinch-to-zoom_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class f extends ViewPager2.i {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C50397c f443859d;

    /* compiled from: PinchToZoomOnboardingController.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "z80/d"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.pinch_to_zoom.listener.PinchToZoomViewPager2OnPageChangeCallback$onPageScrollStateChanged$$inlined$stopScrolling$1", f = "PinchToZoomViewPager2OnPageChangeCallback.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f443860q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C50397c f443861r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ f f443862s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C50397c c50397c, Continuation continuation, f fVar) {
            super(2, continuation);
            this.f443861r = c50397c;
            this.f443862s = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f443861r, continuation, this.f443862s);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f443860q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f443860q = 1;
                if (C43131e0.b(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            C50397c c50397c = this.f443861r;
            if (!c50397c.f443853a.b(c50397c.f443854b)) {
                return G0.f406611a;
            }
            f fVar = this.f443862s;
            InterfaceC23487e interfaceC23487eA = fVar.a();
            C50397c c50397c2 = fVar.f443859d;
            c50397c2.getClass();
            com.avito.android.pinch_to_zoom.e eVar = null;
            com.avito.android.pinch_to_zoom.e eVar2 = interfaceC23487eA instanceof com.avito.android.pinch_to_zoom.e ? (com.avito.android.pinch_to_zoom.e) interfaceC23487eA : null;
            if (eVar2 != null && eVar2.Y00()) {
                eVar = eVar2;
            }
            if (eVar != null) {
                eVar.Zn();
                c50397c2.f443853a.c(c50397c2.f443854b);
            }
            return G0.f406611a;
        }
    }

    public f(@k R0 r02, @k com.avito.android.pinch_to_zoom.b bVar, @k PinchToZoomSource pinchToZoomSource) {
        this.f443859d = new C50397c(r02, bVar, pinchToZoomSource);
    }

    @l
    public abstract Fragment a();

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageScrollStateChanged(int i12) {
        super.onPageScrollStateChanged(i12);
        C50397c c50397c = this.f443859d;
        if (c50397c.f443853a.b(c50397c.f443854b)) {
            com.avito.android.pinch_to_zoom.b bVar = c50397c.f443853a;
            if (i12 == 0) {
                if (bVar.getEnabled() && c50397c.f443857e) {
                    c50397c.f443857e = false;
                    c50397c.f443856d = C43259k.d(c50397c.f443855c, null, null, new a(c50397c, null, this), 3);
                    return;
                }
                return;
            }
            if (!bVar.getEnabled() || c50397c.f443857e) {
                return;
            }
            N0 n02 = c50397c.f443856d;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            c50397c.f443857e = true;
        }
    }
}
