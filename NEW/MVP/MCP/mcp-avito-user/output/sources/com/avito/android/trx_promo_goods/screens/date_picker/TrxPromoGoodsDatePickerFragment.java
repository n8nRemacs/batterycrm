package com.avito.android.trx_promo_goods.screens.date_picker;

import Cd.C13243a;
import OF0.b;
import Y41.l;
import Y41.p;
import Y61.k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
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
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.m;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.trx_promo_goods.screens.date_picker.deeplink.TrxPromoGoodsConfigureDatePickerLinkContent;
import com.avito.android.trx_promo_goods.screens.date_picker.di.b;
import com.avito.android.ui.fragments.BaseDialogFragment;
import cv.InterfaceC39417a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: TrxPromoGoodsDatePickerFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/TrxPromoGoodsDatePickerFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrxPromoGoodsDatePickerFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: p0, reason: collision with root package name */
    @k
    public static final a f303624p0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.trx_promo_goods.screens.date_picker.f f303625h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f303626i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f303627j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f303628k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f303629l0;

    /* renamed from: m0, reason: collision with root package name */
    public Picker f303630m0;

    /* renamed from: n0, reason: collision with root package name */
    public Button f303631n0;

    /* renamed from: o0, reason: collision with root package name */
    public TextView f303632o0;

    /* compiled from: TrxPromoGoodsDatePickerFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/TrxPromoGoodsDatePickerFragment$a;", "", "<init>", "()V", "", "EXTRA_CONTENT", "Ljava/lang/String;", "EXTRA_START_DATE", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TrxPromoGoodsDatePickerFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.trx_promo_goods.screens.date_picker.TrxPromoGoodsDatePickerFragment$onCreateDialog$1", f = "TrxPromoGoodsDatePickerFragment.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f303633q;

        /* compiled from: TrxPromoGoodsDatePickerFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.trx_promo_goods.screens.date_picker.TrxPromoGoodsDatePickerFragment$onCreateDialog$1$1", f = "TrxPromoGoodsDatePickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f303635q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ TrxPromoGoodsDatePickerFragment f303636r;

            /* compiled from: TrxPromoGoodsDatePickerFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.trx_promo_goods.screens.date_picker.TrxPromoGoodsDatePickerFragment$onCreateDialog$1$1$1", f = "TrxPromoGoodsDatePickerFragment.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.trx_promo_goods.screens.date_picker.TrxPromoGoodsDatePickerFragment$b$a$a, reason: collision with other inner class name */
            public static final class C9297a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f303637q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TrxPromoGoodsDatePickerFragment f303638r;

                /* compiled from: TrxPromoGoodsDatePickerFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.trx_promo_goods.screens.date_picker.TrxPromoGoodsDatePickerFragment$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C9298a extends H implements l<OF0.c, G0> {
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void f(@k OF0.c cVar) {
                        TrxPromoGoodsDatePickerFragment trxPromoGoodsDatePickerFragment = (TrxPromoGoodsDatePickerFragment) this.receiver;
                        a aVar = TrxPromoGoodsDatePickerFragment.f303624p0;
                        Dialog dialog = trxPromoGoodsDatePickerFragment.getDialog();
                        com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                        if (dVar != null) {
                            com.avito.android.lib.design.bottom_sheet.d.M(dVar, cVar.f12109b, false, true, 6);
                        }
                        Button button = trxPromoGoodsDatePickerFragment.f303631n0;
                        if (button == null) {
                            button = null;
                        }
                        com.avito.android.mnz_common.extensions.i.a(button, cVar.f12115h);
                        Button button2 = trxPromoGoodsDatePickerFragment.f303631n0;
                        if (button2 == null) {
                            button2 = null;
                        }
                        button2.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(10, cVar, trxPromoGoodsDatePickerFragment));
                        AttributedText attributedText = cVar.f12116i;
                        if (attributedText != null) {
                            attributedText.setOnDeepLinkClickListener(new com.avito.android.tariff.cpa.configure_info.items.feature.e(trxPromoGoodsDatePickerFragment, 5));
                        }
                        TextView textView = trxPromoGoodsDatePickerFragment.f303632o0;
                        if (textView == null) {
                            textView = null;
                        }
                        com.avito.android.util.text.a aVar2 = trxPromoGoodsDatePickerFragment.f303628k0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        com.avito.android.util.text.j.a(textView, attributedText, aVar2);
                        Picker picker = trxPromoGoodsDatePickerFragment.f303630m0;
                        Picker picker2 = picker != null ? picker : null;
                        if (picker2.getFirstWheelValue() == null && picker2.getSecondWheelValue() == null && picker2.getThirdWheelValue() == null) {
                            picker2.e();
                            Iterator<T> it = cVar.f12110c.iterator();
                            while (it.hasNext()) {
                                Q q12 = (Q) it.next();
                                Picker.d(picker2, (List) q12.f406619b, (m) q12.f406620c, 12);
                            }
                            picker2.setFirstWheelValue(cVar.f12111d);
                            picker2.setSecondWheelValue(cVar.f12112e);
                            picker2.setThirdWheelValue(cVar.f12113f);
                            picker2.f();
                            picker2.b(new com.avito.android.trx_promo_goods.screens.date_picker.a(trxPromoGoodsDatePickerFragment));
                            com.avito.android.trx_promo_goods.screens.date_picker.b bVar = new com.avito.android.trx_promo_goods.screens.date_picker.b(trxPromoGoodsDatePickerFragment);
                            ArrayList arrayList = picker2.f179978b;
                            com.avito.android.lib.design.picker.i iVar = (com.avito.android.lib.design.picker.i) C42745f0.K(1, arrayList);
                            if (iVar != null) {
                                iVar.f180031p.add(bVar);
                            }
                            com.avito.android.trx_promo_goods.screens.date_picker.c cVar2 = new com.avito.android.trx_promo_goods.screens.date_picker.c(trxPromoGoodsDatePickerFragment);
                            com.avito.android.lib.design.picker.i iVar2 = (com.avito.android.lib.design.picker.i) C42745f0.K(2, arrayList);
                            if (iVar2 != null) {
                                iVar2.f180031p.add(cVar2);
                            }
                        }
                    }

                    @Override // Y41.l
                    public final /* bridge */ /* synthetic */ G0 invoke(OF0.c cVar) {
                        f(cVar);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9297a(TrxPromoGoodsDatePickerFragment trxPromoGoodsDatePickerFragment, Continuation<? super C9297a> continuation) {
                    super(2, continuation);
                    this.f303638r = trxPromoGoodsDatePickerFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C9297a(this.f303638r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C9297a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f303637q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = TrxPromoGoodsDatePickerFragment.f303624p0;
                        TrxPromoGoodsDatePickerFragment trxPromoGoodsDatePickerFragment = this.f303638r;
                        n2<OF0.c> state = trxPromoGoodsDatePickerFragment.f5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = trxPromoGoodsDatePickerFragment.f303627j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C9298a c9298a = new C9298a(1, trxPromoGoodsDatePickerFragment, TrxPromoGoodsDatePickerFragment.class, "render", "render(Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerState;)V", 0);
                        this.f303637q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c9298a, this) == coroutine_suspended) {
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

            /* compiled from: TrxPromoGoodsDatePickerFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.trx_promo_goods.screens.date_picker.TrxPromoGoodsDatePickerFragment$onCreateDialog$1$1$2", f = "TrxPromoGoodsDatePickerFragment.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.trx_promo_goods.screens.date_picker.TrxPromoGoodsDatePickerFragment$b$a$b, reason: collision with other inner class name */
            public static final class C9299b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f303639q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TrxPromoGoodsDatePickerFragment f303640r;

                /* compiled from: TrxPromoGoodsDatePickerFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.trx_promo_goods.screens.date_picker.TrxPromoGoodsDatePickerFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C9300a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ TrxPromoGoodsDatePickerFragment f303641b;

                    public C9300a(TrxPromoGoodsDatePickerFragment trxPromoGoodsDatePickerFragment) {
                        this.f303641b = trxPromoGoodsDatePickerFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        OF0.b bVar = (OF0.b) obj;
                        a aVar = TrxPromoGoodsDatePickerFragment.f303624p0;
                        TrxPromoGoodsDatePickerFragment trxPromoGoodsDatePickerFragment = this.f303641b;
                        if (bVar instanceof b.C0782b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = trxPromoGoodsDatePickerFragment.f303629l0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((b.C0782b) bVar).f12105a, null, null, 6);
                        } else if (bVar instanceof b.c) {
                            Dialog dialog = trxPromoGoodsDatePickerFragment.getDialog();
                            com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                            if (dVar != null) {
                                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                                PrintableText printableText = ((b.c) bVar).f12106a;
                                ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                                f.c.f125255c.getClass();
                                com.avito.android.component.toast.c.d(cVar, dVar, printableText, null, f.c.a.b(), 0, toastBarPosition, 942);
                            }
                        } else if (bVar instanceof b.a) {
                            String tag = trxPromoGoodsDatePickerFragment.getTag();
                            if (tag == null) {
                                tag = "";
                            }
                            trxPromoGoodsDatePickerFragment.getParentFragmentManager().o0(C22777e.b(new Q("trx_promo_goods_key_date_picker_result", ((b.a) bVar).f12104a)), tag);
                            Dialog dialog2 = trxPromoGoodsDatePickerFragment.getDialog();
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
                        return new C42801a(2, this.f303641b, TrxPromoGoodsDatePickerFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9299b(TrxPromoGoodsDatePickerFragment trxPromoGoodsDatePickerFragment, Continuation<? super C9299b> continuation) {
                    super(2, continuation);
                    this.f303640r = trxPromoGoodsDatePickerFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C9299b(this.f303640r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C9299b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f303639q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = TrxPromoGoodsDatePickerFragment.f303624p0;
                        TrxPromoGoodsDatePickerFragment trxPromoGoodsDatePickerFragment = this.f303640r;
                        InterfaceC43160i<OF0.b> events = trxPromoGoodsDatePickerFragment.f5().getEvents();
                        C9300a c9300a = new C9300a(trxPromoGoodsDatePickerFragment);
                        this.f303639q = 1;
                        if (events.collect(c9300a, this) == coroutine_suspended) {
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
            public a(TrxPromoGoodsDatePickerFragment trxPromoGoodsDatePickerFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f303636r = trxPromoGoodsDatePickerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f303636r, continuation);
                aVar.f303635q = obj;
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
                T t12 = (T) this.f303635q;
                TrxPromoGoodsDatePickerFragment trxPromoGoodsDatePickerFragment = this.f303636r;
                C43259k.d(t12, null, null, new C9297a(trxPromoGoodsDatePickerFragment, null), 3);
                C43259k.d(t12, null, null, new C9299b(trxPromoGoodsDatePickerFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return TrxPromoGoodsDatePickerFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f303633q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                TrxPromoGoodsDatePickerFragment trxPromoGoodsDatePickerFragment = TrxPromoGoodsDatePickerFragment.this;
                a aVar = new a(trxPromoGoodsDatePickerFragment, null);
                this.f303633q = 1;
                if (C23056p0.b(trxPromoGoodsDatePickerFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: TrxPromoGoodsDatePickerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            TrxPromoGoodsDatePickerFragment trxPromoGoodsDatePickerFragment = (TrxPromoGoodsDatePickerFragment) this.receiver;
            a aVar = TrxPromoGoodsDatePickerFragment.f303624p0;
            trxPromoGoodsDatePickerFragment.getClass();
            trxPromoGoodsDatePickerFragment.f303630m0 = (Picker) view.findViewById(R.id.trx_promo_goods_date_picker_picker);
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoGoodsDatePickerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            TrxPromoGoodsDatePickerFragment trxPromoGoodsDatePickerFragment = (TrxPromoGoodsDatePickerFragment) this.receiver;
            a aVar = TrxPromoGoodsDatePickerFragment.f303624p0;
            trxPromoGoodsDatePickerFragment.getClass();
            trxPromoGoodsDatePickerFragment.f303631n0 = (Button) view2.findViewById(R.id.trx_promo_goods_date_picker_button);
            TextView textView = (TextView) view2.findViewById(R.id.trx_promo_goods_date_picker_text_info);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            trxPromoGoodsDatePickerFragment.f303632o0 = textView;
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f303642l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f303642l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f303642l);
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
            return TrxPromoGoodsDatePickerFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f303644l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f303644l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f303644l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f303645l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f303645l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f303645l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f303646l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f303646l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f303646l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TrxPromoGoodsDatePickerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/trx_promo_goods/screens/date_picker/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.trx_promo_goods.screens.date_picker.e> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.trx_promo_goods.screens.date_picker.e invoke() {
            com.avito.android.trx_promo_goods.screens.date_picker.f fVar = TrxPromoGoodsDatePickerFragment.this.f303625h0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.trx_promo_goods.screens.date_picker.e) fVar.get();
        }
    }

    public TrxPromoGoodsDatePickerFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f303626i0 = new O0(m0.f406844a.b(com.avito.android.trx_promo_goods.screens.date_picker.e.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.trx_promo_goods.screens.date_picker.di.a.a();
        com.avito.android.trx_promo_goods.common.di.c cVar = (com.avito.android.trx_promo_goods.common.di.c) C29972i.a(C29972i.b(this), com.avito.android.trx_promo_goods.common.di.c.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        r rVarB = s.b(this);
        Bundle arguments = getArguments();
        Parcelable parcelable = arguments == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("trx_promo_goods_extra_date_picker_content", TrxPromoGoodsConfigureDatePickerLinkContent.class) : arguments.getParcelable("trx_promo_goods_extra_date_picker_content");
        if (parcelable == null) {
            throw new IllegalArgumentException("trx_promo_goods_extra_date_picker_content - param must be not null");
        }
        TrxPromoGoodsConfigureDatePickerLinkContent trxPromoGoodsConfigureDatePickerLinkContent = (TrxPromoGoodsConfigureDatePickerLinkContent) parcelable;
        Bundle arguments2 = getArguments();
        aVarA.a(cVar, interfaceC39417aB, rVarB, trxPromoGoodsConfigureDatePickerLinkContent, arguments2 != null ? arguments2.getString("trx_promo_goods_extra_start_date") : null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f303627j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f303627j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, d5());
    }

    public final com.avito.android.trx_promo_goods.screens.date_picker.e f5() {
        return (com.avito.android.trx_promo_goods.screens.date_picker.e) this.f303626i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f303627j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.B(R.layout.trx_promo_goods_date_picker_content, R.layout.trx_promo_goods_date_picker_footer, new c(1, this, TrxPromoGoodsDatePickerFragment.class, "onContentInflated", "onContentInflated(Landroid/view/View;)V", 0), new d(1, this, TrxPromoGoodsDatePickerFragment.class, "onFooterInflated", "onFooterInflated(Landroid/view/View;)V", 0), true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.J(true);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f303627j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        String tag = getTag();
        if (tag == null) {
            tag = "";
        }
        C22960s.a(Bundle.EMPTY, this, tag);
    }
}
