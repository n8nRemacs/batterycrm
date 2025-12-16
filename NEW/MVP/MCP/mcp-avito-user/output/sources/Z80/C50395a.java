package z80;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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

/* compiled from: PinchToZoomHorizontalRecyclerViewOnScrollListener.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz80/a;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_pinch-to-zoom_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z80.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50395a extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayoutManager f443847b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C50397c f443848c;

    /* compiled from: PinchToZoomOnboardingController.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "z80/d"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.pinch_to_zoom.listener.PinchToZoomHorizontalRecyclerViewOnScrollListener$onScrollStateChanged$$inlined$stopScrolling$1", f = "PinchToZoomHorizontalRecyclerViewOnScrollListener.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: z80.a$a, reason: collision with other inner class name */
    public static final class C12944a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f443849q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C50397c f443850r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C50395a f443851s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f443852t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12944a(C50397c c50397c, Continuation continuation, C50395a c50395a, RecyclerView recyclerView) {
            super(2, continuation);
            this.f443850r = c50397c;
            this.f443851s = c50395a;
            this.f443852t = recyclerView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C12944a(this.f443850r, continuation, this.f443851s, this.f443852t);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C12944a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f443849q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f443849q = 1;
                if (C43131e0.b(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            C50397c c50397c = this.f443850r;
            if (!c50397c.f443853a.b(c50397c.f443854b)) {
                return G0.f406611a;
            }
            C50395a c50395a = this.f443851s;
            LinearLayoutManager linearLayoutManager = c50395a.f443847b;
            int iK1 = linearLayoutManager.K1();
            int iM1 = linearLayoutManager.M1();
            com.avito.android.pinch_to_zoom.e eVar = null;
            C50397c c50397c2 = c50395a.f443848c;
            if (iK1 <= iM1) {
                float f12 = 0.0f;
                com.avito.android.pinch_to_zoom.e eVar2 = null;
                while (true) {
                    Object objP = this.f443852t.P(iK1);
                    c50397c2.getClass();
                    com.avito.android.pinch_to_zoom.e eVar3 = objP instanceof com.avito.android.pinch_to_zoom.e ? (com.avito.android.pinch_to_zoom.e) objP : null;
                    if (eVar3 == null || !eVar3.Y00()) {
                        eVar3 = null;
                    }
                    if (eVar3 != null) {
                        View view = ((RecyclerView.C) eVar3).itemView;
                        int width = view.getWidth();
                        int left = view.getLeft();
                        float fMin = (Math.min(r5.getWidth(), view.getRight()) - ((int) Math.max(0.0d, left))) / width;
                        if (fMin >= 1.0d) {
                            eVar3.Zn();
                            c50397c2.f443853a.c(c50397c2.f443854b);
                            break;
                        }
                        if (fMin > f12) {
                            f12 = fMin;
                            eVar2 = eVar3;
                        }
                    }
                    if (iK1 == iM1) {
                        eVar = eVar2;
                        break;
                    }
                    iK1++;
                }
            } else if (eVar != null) {
                c50397c2.getClass();
                eVar.Zn();
                c50397c2.f443853a.c(c50397c2.f443854b);
            }
            return G0.f406611a;
        }
    }

    public C50395a(@k R0 r02, @k LinearLayoutManager linearLayoutManager, @k com.avito.android.pinch_to_zoom.b bVar, @k PinchToZoomSource pinchToZoomSource) {
        this.f443847b = linearLayoutManager;
        this.f443848c = new C50397c(r02, bVar, pinchToZoomSource);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @k RecyclerView recyclerView) {
        C50397c c50397c = this.f443848c;
        if (c50397c.f443853a.b(c50397c.f443854b)) {
            com.avito.android.pinch_to_zoom.b bVar = c50397c.f443853a;
            if (i12 == 0) {
                if (bVar.getEnabled() && c50397c.f443857e) {
                    c50397c.f443857e = false;
                    c50397c.f443856d = C43259k.d(c50397c.f443855c, null, null, new C12944a(c50397c, null, this, recyclerView), 3);
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
