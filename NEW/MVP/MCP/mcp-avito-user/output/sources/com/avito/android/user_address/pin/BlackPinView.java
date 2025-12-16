package com.avito.android.user_address.pin;

import X41.j;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapMoveReason;
import com.avito.android.util.C1;
import com.avito.android.util.y6;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.scheduling.c;
import m.C43852a;

/* compiled from: BlackPinView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/pin/BlackPinView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/avito/android/avito_map/AvitoMap$MapMoveStartListener;", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "_avito_user-address_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BlackPinView extends AppCompatImageView implements AvitoMap.MapMoveStartListener, AvitoMap.MapMoveEndListener {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AnimatedVectorDrawable f307988b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AnimatedVectorDrawable f307989c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f307990d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public N0 f307991e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C43238h f307992f;

    /* compiled from: BlackPinView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_address.pin.BlackPinView$onMapSettled$1", f = "BlackPinView.kt", i = {}, l = {71, 72}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f307993q;

        /* compiled from: BlackPinView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.user_address.pin.BlackPinView$onMapSettled$1$1", f = "BlackPinView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.user_address.pin.BlackPinView$a$a, reason: collision with other inner class name */
        public static final class C9453a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ BlackPinView f307995q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9453a(BlackPinView blackPinView, Continuation<? super C9453a> continuation) {
                super(2, continuation);
                this.f307995q = blackPinView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C9453a(this.f307995q, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C9453a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                BlackPinView blackPinView = this.f307995q;
                AnimatedVectorDrawable animatedVectorDrawable = blackPinView.f307989c;
                blackPinView.setImageDrawable(animatedVectorDrawable);
                if (animatedVectorDrawable != null) {
                    animatedVectorDrawable.start();
                }
                blackPinView.f307990d = false;
                C43259k.d(blackPinView.f307992f, null, null, new com.avito.android.user_address.pin.a(blackPinView, null), 3);
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return BlackPinView.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f307993q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f307993q = 1;
                if (C43131e0.b(50L, this) == coroutine_suspended) {
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
                C42729a0.b(obj);
            }
            c cVar = C43262l0.f411945a;
            AbstractC43129d1 abstractC43129d1 = K.f411877a;
            C9453a c9453a = new C9453a(BlackPinView.this, null);
            this.f307993q = 2;
            if (C43259k.g(abstractC43129d1, c9453a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @j
    public BlackPinView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapMoveStartListener
    public final void onMapMoveStarted(@k AvitoMapMoveReason avitoMapMoveReason) {
        N0 n02 = this.f307991e;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        C1.f318564a.getClass();
        if (C1.a() && avitoMapMoveReason == AvitoMapMoveReason.GESTURE && !this.f307990d) {
            AnimatedVectorDrawable animatedVectorDrawable = this.f307988b;
            setImageDrawable(animatedVectorDrawable);
            if (animatedVectorDrawable != null) {
                animatedVectorDrawable.start();
            }
            this.f307990d = true;
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapMoveEndListener
    public final void onMapSettled(@k AvitoMapCameraPosition avitoMapCameraPosition) {
        if (this.f307990d) {
            C1.f318564a.getClass();
            if (C1.a()) {
                this.f307991e = C43259k.d(this.f307992f, null, null, new a(null), 3);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(y6.b(44), 1073741824), View.MeasureSpec.makeMeasureSpec(y6.b(59), 1073741824));
    }

    public BlackPinView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        Drawable drawableA = C43852a.a(context, R.drawable.black_pin_moving);
        AnimatedVectorDrawable animatedVectorDrawable = drawableA instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawableA : null;
        this.f307988b = animatedVectorDrawable;
        Drawable drawableA2 = C43852a.a(context, R.drawable.black_pin_stop);
        this.f307989c = drawableA2 instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawableA2 : null;
        this.f307992f = U.a(C43262l0.f411945a);
        setImageDrawable(animatedVectorDrawable);
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.reset();
        }
    }
}
