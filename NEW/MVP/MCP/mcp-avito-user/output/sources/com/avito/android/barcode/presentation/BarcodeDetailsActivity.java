package com.avito.android.barcode.presentation;

import Cd.r;
import Og.InterfaceC14686c;
import Sg.InterfaceC15183a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.BarcodeDetailsScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.barcode.domain.model.BarcodeData;
import com.avito.android.barcode.presentation.d;
import com.avito.android.barcode.presentation.mvi.entity.BarcodeState;
import com.avito.android.barcode_encoder.BarcodeFormat;
import com.avito.android.di.C29972i;
import com.avito.android.util.D6;
import com.avito.android.util.L0;
import com.avito.android.util.P5;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import z1.AbstractC50339a;

/* compiled from: BarcodeDetailsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/barcode/presentation/BarcodeDetailsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeDetailsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: z, reason: collision with root package name */
    @k
    public static final a f98681z = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public d.a f98682m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f98683n = new O0(m0.f406844a.b(com.avito.android.barcode.presentation.d.class), new d(), new c(new f()), new e());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public L0 f98684o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f98685p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public Float f98686q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.barcode_encoder.a f98687r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public ImageView f98688s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public TextView f98689t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public TextView f98690u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public TextView f98691v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public TextView f98692w;

    /* renamed from: x, reason: collision with root package name */
    @l
    public com.avito.android.progress_overlay.l f98693x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public BarcodeFormat f98694y;

    /* compiled from: BarcodeDetailsActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/barcode/presentation/BarcodeDetailsActivity$a;", "", "<init>", "()V", "", "CONTENT_TYPE", "Ljava/lang/String;", "", "DESIRED_SCREEN_BRIGHTNESS", "F", "", "TOP_AND_BOTTOM_MARGIN", "I", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: BarcodeDetailsActivity.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.barcode.presentation.BarcodeDetailsActivity$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2966a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f98695a;

            static {
                int[] iArr = new int[BarcodeFormat.values().length];
                try {
                    iArr[BarcodeFormat.f98753QR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f98695a = iArr;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BarcodeDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.barcode.presentation.BarcodeDetailsActivity$onCreate$1", f = "BarcodeDetailsActivity.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f98696q;

        /* compiled from: BarcodeDetailsActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.barcode.presentation.BarcodeDetailsActivity$onCreate$1$1", f = "BarcodeDetailsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f98698q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ BarcodeDetailsActivity f98699r;

            /* compiled from: BarcodeDetailsActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.barcode.presentation.BarcodeDetailsActivity$onCreate$1$1$1", f = "BarcodeDetailsActivity.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.barcode.presentation.BarcodeDetailsActivity$b$a$a, reason: collision with other inner class name */
            public static final class C2967a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f98700q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ BarcodeDetailsActivity f98701r;

                /* compiled from: BarcodeDetailsActivity.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.barcode.presentation.BarcodeDetailsActivity$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C2968a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BarcodeDetailsActivity f98702b;

                    public C2968a(BarcodeDetailsActivity barcodeDetailsActivity) {
                        this.f98702b = barcodeDetailsActivity;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        a aVar = BarcodeDetailsActivity.f98681z;
                        BarcodeDetailsActivity barcodeDetailsActivity = this.f98702b;
                        barcodeDetailsActivity.getClass();
                        if (((InterfaceC14686c) obj) instanceof InterfaceC14686c.a) {
                            barcodeDetailsActivity.finish();
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f98702b, BarcodeDetailsActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/barcode/presentation/mvi/entity/BarcodeOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2967a(BarcodeDetailsActivity barcodeDetailsActivity, Continuation<? super C2967a> continuation) {
                    super(2, continuation);
                    this.f98701r = barcodeDetailsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C2967a(this.f98701r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2967a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f98700q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = BarcodeDetailsActivity.f98681z;
                        BarcodeDetailsActivity barcodeDetailsActivity = this.f98701r;
                        com.avito.android.barcode.presentation.d dVar = (com.avito.android.barcode.presentation.d) barcodeDetailsActivity.f98683n.getValue();
                        C2968a c2968a = new C2968a(barcodeDetailsActivity);
                        this.f98700q = 1;
                        Object objCollect = dVar.getEvents().collect(c2968a, this);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCollect = G0.f406611a;
                        }
                        if (objCollect == coroutine_suspended) {
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

            /* compiled from: BarcodeDetailsActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.barcode.presentation.BarcodeDetailsActivity$onCreate$1$1$2", f = "BarcodeDetailsActivity.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.barcode.presentation.BarcodeDetailsActivity$b$a$b, reason: collision with other inner class name */
            public static final class C2969b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f98703q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ BarcodeDetailsActivity f98704r;

                /* compiled from: BarcodeDetailsActivity.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.barcode.presentation.BarcodeDetailsActivity$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C2970a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BarcodeDetailsActivity f98705b;

                    public C2970a(BarcodeDetailsActivity barcodeDetailsActivity) {
                        this.f98705b = barcodeDetailsActivity;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        BarcodeState barcodeState = (BarcodeState) obj;
                        a aVar = BarcodeDetailsActivity.f98681z;
                        BarcodeDetailsActivity barcodeDetailsActivity = this.f98705b;
                        if (barcodeState instanceof BarcodeState.Loading) {
                            com.avito.android.progress_overlay.l lVar = barcodeDetailsActivity.f98693x;
                            if (lVar != null) {
                                lVar.k(null);
                            }
                        } else if (barcodeState instanceof BarcodeState.ShowContent) {
                            TextView textView = barcodeDetailsActivity.f98691v;
                            if (textView != null) {
                                textView.setVisibility(8);
                            }
                            TextView textView2 = barcodeDetailsActivity.f98692w;
                            if (textView2 != null) {
                                textView2.setVisibility(8);
                            }
                            com.avito.android.progress_overlay.l lVar2 = barcodeDetailsActivity.f98693x;
                            if (lVar2 != null) {
                                lVar2.j();
                            }
                            BarcodeData barcodeData = ((BarcodeState.ShowContent) barcodeState).f98742b;
                            String str = barcodeData.f98665c;
                            if (str == null || C43066x.K(str)) {
                                TextView textView3 = barcodeDetailsActivity.f98689t;
                                if (textView3 != null) {
                                    textView3.setVisibility(8);
                                }
                            } else {
                                TextView textView4 = barcodeDetailsActivity.f98689t;
                                if (textView4 != null) {
                                    textView4.setVisibility(0);
                                }
                                TextView textView5 = barcodeDetailsActivity.f98689t;
                                if (textView5 != null) {
                                    textView5.setText(barcodeData.f98665c);
                                }
                            }
                            String str2 = barcodeData.f98666d;
                            if (str2 == null || C43066x.K(str2)) {
                                TextView textView6 = barcodeDetailsActivity.f98690u;
                                if (textView6 != null) {
                                    textView6.setVisibility(8);
                                }
                            } else {
                                TextView textView7 = barcodeDetailsActivity.f98690u;
                                if (textView7 != null) {
                                    textView7.setVisibility(0);
                                }
                                TextView textView8 = barcodeDetailsActivity.f98690u;
                                if (textView8 != null) {
                                    textView8.setText(str2);
                                }
                            }
                            ImageView imageView = barcodeDetailsActivity.f98688s;
                            if (imageView != null) {
                                imageView.setVisibility(0);
                            }
                            ImageView imageView2 = barcodeDetailsActivity.f98688s;
                            if (imageView2 != null) {
                                D6.l(true, imageView2, new com.avito.android.barcode.presentation.a(barcodeData.f98667e, imageView2, barcodeDetailsActivity, barcodeData.f98664b));
                            }
                        } else if (barcodeState instanceof BarcodeState.Error) {
                            com.avito.android.progress_overlay.l lVar3 = barcodeDetailsActivity.f98693x;
                            if (lVar3 != null) {
                                lVar3.j();
                            }
                            ImageView imageView3 = barcodeDetailsActivity.f98688s;
                            if (imageView3 != null) {
                                imageView3.setVisibility(8);
                            }
                            TextView textView9 = barcodeDetailsActivity.f98691v;
                            if (textView9 != null) {
                                textView9.setVisibility(0);
                            }
                            TextView textView10 = barcodeDetailsActivity.f98691v;
                            if (textView10 != null) {
                                textView10.setText(((BarcodeState.Error) barcodeState).f98737b.k0(barcodeDetailsActivity));
                            }
                            TextView textView11 = barcodeDetailsActivity.f98692w;
                            if (textView11 != null) {
                                textView11.setVisibility(0);
                            }
                            TextView textView12 = barcodeDetailsActivity.f98692w;
                            if (textView12 != null) {
                                textView12.setText(((BarcodeState.Error) barcodeState).f98738c.k0(barcodeDetailsActivity));
                            }
                            BarcodeState.Error error = (BarcodeState.Error) barcodeState;
                            String str3 = error.f98740e;
                            if (str3 == null || C43066x.K(str3)) {
                                TextView textView13 = barcodeDetailsActivity.f98689t;
                                if (textView13 != null) {
                                    textView13.setVisibility(8);
                                }
                            } else {
                                TextView textView14 = barcodeDetailsActivity.f98689t;
                                if (textView14 != null) {
                                    textView14.setVisibility(0);
                                }
                                TextView textView15 = barcodeDetailsActivity.f98689t;
                                if (textView15 != null) {
                                    textView15.setText(error.f98740e);
                                }
                            }
                            String str4 = error.f98739d;
                            if (str4 == null || C43066x.K(str4)) {
                                TextView textView16 = barcodeDetailsActivity.f98690u;
                                if (textView16 != null) {
                                    textView16.setVisibility(8);
                                }
                            } else {
                                TextView textView17 = barcodeDetailsActivity.f98690u;
                                if (textView17 != null) {
                                    textView17.setVisibility(0);
                                }
                                TextView textView18 = barcodeDetailsActivity.f98690u;
                                if (textView18 != null) {
                                    textView18.setText(str4);
                                }
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f98705b, BarcodeDetailsActivity.class, "handleState", "handleState(Lcom/avito/android/barcode/presentation/mvi/entity/BarcodeState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2969b(BarcodeDetailsActivity barcodeDetailsActivity, Continuation<? super C2969b> continuation) {
                    super(2, continuation);
                    this.f98704r = barcodeDetailsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C2969b(this.f98704r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2969b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f98703q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = BarcodeDetailsActivity.f98681z;
                        BarcodeDetailsActivity barcodeDetailsActivity = this.f98704r;
                        com.avito.android.barcode.presentation.d dVar = (com.avito.android.barcode.presentation.d) barcodeDetailsActivity.f98683n.getValue();
                        C2970a c2970a = new C2970a(barcodeDetailsActivity);
                        this.f98703q = 1;
                        if (dVar.ke(c2970a, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BarcodeDetailsActivity barcodeDetailsActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f98699r = barcodeDetailsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f98699r, continuation);
                aVar.f98698q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f98698q;
                BarcodeDetailsActivity barcodeDetailsActivity = this.f98699r;
                C43259k.d(t12, null, null, new C2967a(barcodeDetailsActivity, null), 3);
                C43259k.d(t12, null, null, new C2969b(barcodeDetailsActivity, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return BarcodeDetailsActivity.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f98696q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                BarcodeDetailsActivity barcodeDetailsActivity = BarcodeDetailsActivity.this;
                a aVar = new a(barcodeDetailsActivity, null);
                this.f98696q = 1;
                if (C23056p0.b(barcodeDetailsActivity, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/A", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f98707m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.l lVar) {
            super(0);
            this.f98707m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(BarcodeDetailsActivity.this, this.f98707m);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<S0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return BarcodeDetailsActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<AbstractC50339a> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return BarcodeDetailsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: BarcodeDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "stateHandle", "Lcom/avito/android/barcode/presentation/d;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/barcode/presentation/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<C23060r0, com.avito.android.barcode.presentation.d> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.barcode.presentation.d invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            d.a aVar = BarcodeDetailsActivity.this.f98682m;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.barcode_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        Intent intent = getIntent();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extra_arguments", BarcodeArguments.class) : intent.getParcelableExtra("extra_arguments");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        BarcodeArguments barcodeArguments = (BarcodeArguments) parcelableExtra;
        this.f98694y = barcodeArguments.f98678c;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.barcode.di.d.a().a((com.avito.android.barcode.di.b) C29972i.a(C29972i.b(this), com.avito.android.barcode.di.b.class), (InterfaceC15183a) C29972i.a(C29972i.b(this), InterfaceC15183a.class), barcodeArguments.f98677b, barcodeArguments.f98679d, barcodeArguments.f98680e, barcodeArguments.f98678c, new C28478k(BarcodeDetailsScreen.f90296d, s.a(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f98685p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f98685p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        BarcodeFormat barcodeFormat = this.f98694y;
        TextView textView = (TextView) findViewById(R.id.toolbar_title);
        int i12 = barcodeFormat == BarcodeFormat.f98753QR ? R.string.barcode_screen_title_QR : R.string.barcode_screen_title;
        if (textView != null) {
            textView.setText(i12);
        }
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            P5.b(toolbar);
        }
        Toolbar toolbar2 = this.f304539d;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 2));
        }
        this.f98688s = (ImageView) findViewById(R.id.barcode_container);
        this.f98689t = (TextView) findViewById(R.id.content_text);
        this.f98690u = (TextView) findViewById(R.id.provider_label);
        this.f98691v = (TextView) findViewById(R.id.error_title);
        this.f98692w = (TextView) findViewById(R.id.error_description);
        this.f98693x = new com.avito.android.progress_overlay.l((ViewGroup) findViewById(R.id.barcode_screen_root), 0, null, 0, 0, 30, null);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f98685p;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        this.f98686q = Float.valueOf(attributes.screenBrightness);
        attributes.screenBrightness = 1.0f;
        getWindow().setAttributes(attributes);
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        Float f12 = this.f98686q;
        if (f12 != null) {
            float fFloatValue = f12.floatValue();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.screenBrightness = fFloatValue;
            getWindow().setAttributes(attributes);
        }
        super.onDestroy();
    }
}
