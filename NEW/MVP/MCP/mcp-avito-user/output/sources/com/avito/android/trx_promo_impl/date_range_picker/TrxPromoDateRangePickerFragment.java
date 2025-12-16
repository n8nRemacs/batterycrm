package com.avito.android.trx_promo_impl.date_range_picker;

import Cd.C13243a;
import SF0.b;
import SF0.c;
import Y41.l;
import Y41.p;
import Y41.q;
import Y61.k;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.m;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.search.filter.RunnableC34589p;
import com.avito.android.trx_promo_impl.date_range_picker.di.c;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureDateRangePickerLinkContent;
import com.avito.android.ui.fragments.BaseDialogFragment;
import cv.InterfaceC39417a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.C42829l0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import z1.AbstractC50339a;

/* compiled from: TrxPromoDateRangePickerFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/TrxPromoDateRangePickerFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrxPromoDateRangePickerFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: r0, reason: collision with root package name */
    @k
    public static final a f303953r0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.trx_promo_impl.date_range_picker.f f303954h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f303955i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f303956j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f303957k0;

    /* renamed from: l0, reason: collision with root package name */
    public Chips f303958l0;

    /* renamed from: m0, reason: collision with root package name */
    public Picker f303959m0;

    /* renamed from: n0, reason: collision with root package name */
    public Picker f303960n0;

    /* renamed from: o0, reason: collision with root package name */
    public FrameLayout f303961o0;

    /* renamed from: p0, reason: collision with root package name */
    public Button f303962p0;

    /* renamed from: q0, reason: collision with root package name */
    @k
    public final ViewGroup.LayoutParams f303963q0;

    /* compiled from: TrxPromoDateRangePickerFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/TrxPromoDateRangePickerFragment$a;", "", "<init>", "()V", "", "EXTRA_CONTENT", "Ljava/lang/String;", "EXTRA_DATE_FROM", "EXTRA_DATE_TO", "", "PICKER_DELAY", "J", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TrxPromoDateRangePickerFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$onCreateDialog$1", f = "TrxPromoDateRangePickerFragment.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f303964q;

        /* compiled from: TrxPromoDateRangePickerFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$onCreateDialog$1$1", f = "TrxPromoDateRangePickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f303966q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ TrxPromoDateRangePickerFragment f303967r;

            /* compiled from: TrxPromoDateRangePickerFragment.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$onCreateDialog$1$1$1", f = "TrxPromoDateRangePickerFragment.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$b$a$a, reason: collision with other inner class name */
            public static final class C9318a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f303968q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TrxPromoDateRangePickerFragment f303969r;

                /* compiled from: TrxPromoDateRangePickerFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSF0/c;", "it", "LSF0/c$b;", "invoke", "(LSF0/c;)LSF0/c$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$b$a$a$a, reason: collision with other inner class name */
                public static final class C9319a extends N implements l<SF0.c, c.b> {

                    /* renamed from: l, reason: collision with root package name */
                    public static final C9319a f303970l = new C9319a();

                    public C9319a() {
                        super(1);
                    }

                    @Override // Y41.l
                    public final c.b invoke(SF0.c cVar) {
                        return cVar.f14863b;
                    }
                }

                /* compiled from: TrxPromoDateRangePickerFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$b$a$a$b, reason: collision with other inner class name */
                public /* synthetic */ class C9320b implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ TrxPromoDateRangePickerFragment f303971b;

                    public C9320b(TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment) {
                        this.f303971b = trxPromoDateRangePickerFragment;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
                        /*
                            Method dump skipped, instructions count: 249
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment.b.a.C9318a.C9320b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f303971b, TrxPromoDateRangePickerFragment.class, "render", "render(Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerState$ViewState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$b$a$a$c */
                public static final class c implements InterfaceC43160i<c.b> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC43160i f303972b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$b$a$a$c$a, reason: collision with other inner class name */
                    public static final class C9321a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f303973b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$onCreateDialog$1$1$1$invokeSuspend$$inlined$map$1$2", f = "TrxPromoDateRangePickerFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$b$a$a$c$a$a, reason: collision with other inner class name */
                        public static final class C9322a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f303974q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f303975r;

                            public C9322a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@k Object obj) {
                                this.f303974q = obj;
                                this.f303975r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C9321a.this.emit(null, this);
                            }
                        }

                        public C9321a(InterfaceC43172j interfaceC43172j) {
                            this.f303973b = interfaceC43172j;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC43172j
                        @Y61.l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment.b.a.C9318a.c.C9321a.C9322a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$b$a$a$c$a$a r0 = (com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment.b.a.C9318a.c.C9321a.C9322a) r0
                                int r1 = r0.f303975r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f303975r = r1
                                goto L18
                            L13:
                                com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$b$a$a$c$a$a r0 = new com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$b$a$a$c$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f303974q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f303975r
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.C42729a0.b(r6)
                                goto L43
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                kotlin.C42729a0.b(r6)
                                SF0.c r5 = (SF0.c) r5
                                SF0.c$b r5 = r5.f14863b
                                r0.f303975r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f303973b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L43
                                return r1
                            L43:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment.b.a.C9318a.c.C9321a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public c(InterfaceC43160i interfaceC43160i) {
                        this.f303972b = interfaceC43160i;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@k InterfaceC43172j<? super c.b> interfaceC43172j, @k Continuation continuation) {
                        Object objCollect = this.f303972b.collect(new C9321a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9318a(TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment, Continuation<? super C9318a> continuation) {
                    super(2, continuation);
                    this.f303969r = trxPromoDateRangePickerFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C9318a(this.f303969r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C9318a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f303968q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = TrxPromoDateRangePickerFragment.f303953r0;
                        TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment = this.f303969r;
                        c cVar = new c(C43175k.s(trxPromoDateRangePickerFragment.f5().getState(), C9319a.f303970l));
                        C9320b c9320b = new C9320b(trxPromoDateRangePickerFragment);
                        this.f303968q = 1;
                        if (cVar.collect(c9320b, this) == coroutine_suspended) {
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

            /* compiled from: TrxPromoDateRangePickerFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$onCreateDialog$1$1$2", f = "TrxPromoDateRangePickerFragment.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$b$a$b, reason: collision with other inner class name */
            public static final class C9323b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f303977q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TrxPromoDateRangePickerFragment f303978r;

                /* compiled from: TrxPromoDateRangePickerFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C9324a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ TrxPromoDateRangePickerFragment f303979b;

                    public C9324a(TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment) {
                        this.f303979b = trxPromoDateRangePickerFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        SF0.b bVar = (SF0.b) obj;
                        a aVar = TrxPromoDateRangePickerFragment.f303953r0;
                        TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment = this.f303979b;
                        if (bVar instanceof b.C1004b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = trxPromoDateRangePickerFragment.f303956j0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((b.C1004b) bVar).f14859a, null, null, 6);
                        } else if (bVar instanceof b.c) {
                            Dialog dialog = trxPromoDateRangePickerFragment.getDialog();
                            com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                            if (dVar != null) {
                                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                                PrintableText printableText = ((b.c) bVar).f14860a;
                                ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                                f.c.f125255c.getClass();
                                com.avito.android.component.toast.c.d(cVar, dVar, printableText, null, f.c.a.b(), 0, toastBarPosition, 942);
                            }
                        } else if (bVar instanceof b.a) {
                            String tag = trxPromoDateRangePickerFragment.getTag();
                            if (tag == null) {
                                tag = "";
                            }
                            b.a aVar3 = (b.a) bVar;
                            trxPromoDateRangePickerFragment.getParentFragmentManager().o0(C22777e.b(new Q("trx_promo_key_date_range_picker_result_from", aVar3.f14857a), new Q("trx_promo_key_date_range_picker_result_to", aVar3.f14858b)), tag);
                            Dialog dialog2 = trxPromoDateRangePickerFragment.getDialog();
                            com.avito.android.lib.design.bottom_sheet.d dVar2 = dialog2 instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog2 : null;
                            if (dVar2 != null) {
                                dVar2.r();
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f303979b, TrxPromoDateRangePickerFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9323b(TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment, Continuation<? super C9323b> continuation) {
                    super(2, continuation);
                    this.f303978r = trxPromoDateRangePickerFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C9323b(this.f303978r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C9323b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f303977q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = TrxPromoDateRangePickerFragment.f303953r0;
                        TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment = this.f303978r;
                        InterfaceC43160i<SF0.b> events = trxPromoDateRangePickerFragment.f5().getEvents();
                        C9324a c9324a = new C9324a(trxPromoDateRangePickerFragment);
                        this.f303977q = 1;
                        if (events.collect(c9324a, this) == coroutine_suspended) {
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
            public a(TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f303967r = trxPromoDateRangePickerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f303967r, continuation);
                aVar.f303966q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f303966q;
                TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment = this.f303967r;
                C43259k.d(t12, null, null, new C9318a(trxPromoDateRangePickerFragment, null), 3);
                C43259k.d(t12, null, null, new C9323b(trxPromoDateRangePickerFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return TrxPromoDateRangePickerFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f303964q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment = TrxPromoDateRangePickerFragment.this;
                a aVar = new a(trxPromoDateRangePickerFragment, null);
                this.f303964q = 1;
                if (C23056p0.b(trxPromoDateRangePickerFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: TrxPromoDateRangePickerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment = (TrxPromoDateRangePickerFragment) this.receiver;
            a aVar = TrxPromoDateRangePickerFragment.f303953r0;
            trxPromoDateRangePickerFragment.getClass();
            Chips chips = (Chips) view2.findViewById(R.id.trx_promo_date_range_picker_chips);
            trxPromoDateRangePickerFragment.f303958l0 = chips;
            chips.setItemAnimator(null);
            Picker picker = new Picker(view2.getContext(), null, 0, 0, 14, null);
            ViewGroup.LayoutParams layoutParams = trxPromoDateRangePickerFragment.f303963q0;
            picker.setLayoutParams(layoutParams);
            trxPromoDateRangePickerFragment.f303959m0 = picker;
            Picker picker2 = new Picker(view2.getContext(), null, 0, 0, 14, null);
            picker2.setLayoutParams(layoutParams);
            trxPromoDateRangePickerFragment.f303960n0 = picker2;
            trxPromoDateRangePickerFragment.f303961o0 = (FrameLayout) view2.findViewById(R.id.trx_promo_date_range_picker_container);
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoDateRangePickerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment = (TrxPromoDateRangePickerFragment) this.receiver;
            a aVar = TrxPromoDateRangePickerFragment.f303953r0;
            trxPromoDateRangePickerFragment.getClass();
            Button button = (Button) view.findViewById(R.id.trx_promo_date_range_picker_button);
            trxPromoDateRangePickerFragment.f303962p0 = button;
            button.setOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(trxPromoDateRangePickerFragment, 17));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f303980l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f303980l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f303980l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return TrxPromoDateRangePickerFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f303982l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f303982l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f303982l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f303983l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f303983l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f303983l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f303984l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f303984l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f303984l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TrxPromoDateRangePickerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/trx_promo_impl/date_range_picker/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.trx_promo_impl.date_range_picker.e> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.trx_promo_impl.date_range_picker.e invoke() {
            com.avito.android.trx_promo_impl.date_range_picker.f fVar = TrxPromoDateRangePickerFragment.this.f303954h0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.trx_promo_impl.date_range_picker.e) fVar.get();
        }
    }

    public TrxPromoDateRangePickerFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f303955i0 = new O0(m0.f406844a.b(com.avito.android.trx_promo_impl.date_range_picker.e.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f303963q0 = new ViewGroup.LayoutParams(-1, -2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g5(Picker picker, List list, C42829l0 c42829l0, q qVar) {
        picker.f();
        picker.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Q q12 = (Q) it.next();
            Picker.d(picker, (List) q12.f406619b, (m) q12.f406620c, 12);
        }
        com.avito.android.lib.design.picker.k<?> kVar = (com.avito.android.lib.design.picker.k) c42829l0.f406871b;
        com.avito.android.lib.design.picker.k<?> kVar2 = (com.avito.android.lib.design.picker.k) c42829l0.f406872c;
        com.avito.android.lib.design.picker.k<?> kVar3 = (com.avito.android.lib.design.picker.k) c42829l0.f406873d;
        picker.setFirstWheelValue(kVar);
        picker.setSecondWheelValue(kVar2);
        picker.setThirdWheelValue(kVar3);
        picker.postDelayed(new RunnableC34589p(picker, qVar), 200L);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        c.a aVarA = com.avito.android.trx_promo_impl.date_range_picker.di.a.a();
        com.avito.android.trx_promo_impl.di.l lVar = (com.avito.android.trx_promo_impl.di.l) C29972i.a(C29972i.b(this), com.avito.android.trx_promo_impl.di.l.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        r rVarB = s.b(this);
        Bundle arguments = getArguments();
        Parcelable parcelable = arguments == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("trx_promo_date_range_picker_content", TrxPromoConfigureDateRangePickerLinkContent.class) : arguments.getParcelable("trx_promo_date_range_picker_content");
        if (parcelable == null) {
            throw new IllegalArgumentException("trx_promo_date_range_picker_content - param must be not null");
        }
        TrxPromoConfigureDateRangePickerLinkContent trxPromoConfigureDateRangePickerLinkContent = (TrxPromoConfigureDateRangePickerLinkContent) parcelable;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("trx_promo_date_range_picker_date_from") : null;
        Bundle arguments3 = getArguments();
        aVarA.a(lVar, interfaceC39417aB, rVarB, trxPromoConfigureDateRangePickerLinkContent, string, arguments3 != null ? arguments3.getString("trx_promo_date_range_picker_date_to") : null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f303957k0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f303957k0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, d5());
    }

    public final com.avito.android.trx_promo_impl.date_range_picker.e f5() {
        return (com.avito.android.trx_promo_impl.date_range_picker.e) this.f303955i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f303957k0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.B(R.layout.trx_promo_date_range_picker_content, R.layout.trx_promo_date_range_picker_footer, new c(1, this, TrxPromoDateRangePickerFragment.class, "onContentInflated", "onContentInflated(Landroid/view/View;)V", 0), new d(1, this, TrxPromoDateRangePickerFragment.class, "onFooterInflated", "onFooterInflated(Landroid/view/View;)V", 0), true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.J(true);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f303957k0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }
}
