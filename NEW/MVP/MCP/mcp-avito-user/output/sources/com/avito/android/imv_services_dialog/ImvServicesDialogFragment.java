package com.avito.android.imv_services_dialog;

import Cd.C13243a;
import Y41.p;
import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
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
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.imv_services_dialog.b;
import com.avito.android.imv_services_dialog.perfomance.ImvServicesDialogScreen;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.imv_services.ImvServices;
import com.avito.android.remote.model.imv_services.ImvServicesAnswerButton;
import com.avito.android.remote.model.imv_services.ImvServicesChart;
import com.avito.android.remote.model.imv_services.ImvServicesFeedback;
import com.avito.android.remote.model.imv_services.ImvServicesHintData;
import com.avito.android.remote.model.imv_services.ImvServicesPriceRangeBorder;
import com.avito.android.remote.model.imv_services.ImvServicesPriceRangeTitle;
import com.avito.android.remote.model.imv_services.ImvServicesPricesGroup;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.I5;
import jN.C42288c;
import jN.InterfaceC42286a;
import jN.InterfaceC42287b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: ImvServicesDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_services_dialog/ImvServicesDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvServicesDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f170721h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.imv_services_dialog.e f170722i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final O0 f170723j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f170724k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f170725l0;

    /* renamed from: m0, reason: collision with root package name */
    @l
    public com.avito.android.imv_services_dialog.b f170726m0;

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f170720o0 = {m0.f406844a.e(new Y(ImvServicesDialogFragment.class, "screenParams", "getScreenParams()Lcom/avito/android/imv_services_dialog/ImvServicesDialogScreenParams;", 0))};

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f170719n0 = new a(null);

    /* compiled from: ImvServicesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_services_dialog/ImvServicesDialogFragment$a;", "", "<init>", "()V", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ImvServicesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "answerId", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Integer, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            ImvServicesPricesGroup pricesGroup;
            Integer num2 = num;
            ImvServicesDialogFragment imvServicesDialogFragment = ImvServicesDialogFragment.this;
            com.avito.android.imv_services_dialog.d dVar = (com.avito.android.imv_services_dialog.d) imvServicesDialogFragment.f170723j0.getValue();
            ImvServicesDialogScreenParams imvServicesDialogScreenParamsF5 = imvServicesDialogFragment.f5();
            ImvServices imvServices = imvServicesDialogFragment.f5().f170747c;
            ImvServicesChart priceRange = imvServices.getPriceRange();
            dVar.accept(new InterfaceC42286a.b(imvServices.getFeedback(), (priceRange == null || (pricesGroup = priceRange.getPricesGroup()) == null) ? null : pricesGroup.getOrigin(), num2, imvServicesDialogScreenParamsF5.f170746b));
            return G0.f406611a;
        }
    }

    /* compiled from: ImvServicesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "answerId", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Integer, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            ImvServicesPricesGroup pricesGroup;
            Integer num2 = num;
            ImvServicesDialogFragment imvServicesDialogFragment = ImvServicesDialogFragment.this;
            com.avito.android.imv_services_dialog.d dVar = (com.avito.android.imv_services_dialog.d) imvServicesDialogFragment.f170723j0.getValue();
            ImvServicesDialogScreenParams imvServicesDialogScreenParamsF5 = imvServicesDialogFragment.f5();
            ImvServices imvServices = imvServicesDialogFragment.f5().f170747c;
            ImvServicesChart priceRange = imvServices.getPriceRange();
            dVar.accept(new InterfaceC42286a.C11562a(imvServices.getFeedback(), (priceRange == null || (pricesGroup = priceRange.getPricesGroup()) == null) ? null : pricesGroup.getOrigin(), num2, imvServicesDialogScreenParamsF5.f170746b));
            return G0.f406611a;
        }
    }

    /* compiled from: ImvServicesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ImvServicesDialogFragment.this.f170726m0 = null;
            return G0.f406611a;
        }
    }

    /* compiled from: ImvServicesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.imv_services_dialog.ImvServicesDialogFragment$onCreateView$1", f = "ImvServicesDialogFragment.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f170730q;

        /* compiled from: ImvServicesDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.imv_services_dialog.ImvServicesDialogFragment$onCreateView$1$1", f = "ImvServicesDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f170732q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ImvServicesDialogFragment f170733r;

            /* compiled from: ImvServicesDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.imv_services_dialog.ImvServicesDialogFragment$onCreateView$1$1$1", f = "ImvServicesDialogFragment.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.imv_services_dialog.ImvServicesDialogFragment$e$a$a, reason: collision with other inner class name */
            public static final class C5050a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f170734q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ImvServicesDialogFragment f170735r;

                /* compiled from: ImvServicesDialogFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LjN/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LjN/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.imv_services_dialog.ImvServicesDialogFragment$e$a$a$a, reason: collision with other inner class name */
                public static final class C5051a extends N implements Y41.l<C42288c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ ImvServicesDialogFragment f170736l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C5051a(ImvServicesDialogFragment imvServicesDialogFragment) {
                        super(1);
                        this.f170736l = imvServicesDialogFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(C42288c c42288c) {
                        C42288c c42288c2 = c42288c;
                        com.avito.android.imv_services_dialog.b bVar = this.f170736l.f170726m0;
                        if (bVar != null) {
                            TextView textView = bVar.f170756I;
                            if (textView == null) {
                                textView = null;
                            }
                            I5.a(textView, c42288c2.f405596b, false);
                            ImvServices imvServices = c42288c2.f405597c;
                            if (imvServices != null) {
                                com.avito.android.util.text.j.a((TextView) bVar.f170757J.getValue(), imvServices.getHeader(), null);
                                com.avito.android.util.text.j.a((TextView) bVar.f170758K.getValue(), imvServices.getTitle(), null);
                                ImvServicesChart priceRange = imvServices.getPriceRange();
                                bVar.W().setVisibility(priceRange != null ? 0 : 8);
                                LayoutInflater layoutInflater = bVar.f170755H;
                                if (priceRange != null) {
                                    bVar.W().removeAllViews();
                                    int i12 = b.a.f170767a[priceRange.getType().ordinal()];
                                    if (i12 == 1) {
                                        View viewInflate = layoutInflater.inflate(R.layout.imv_services_dialog_low_chart_view, (ViewGroup) bVar.W(), false);
                                        View viewFindViewById = viewInflate.findViewById(R.id.imv_services_low_start_title);
                                        if (viewFindViewById == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                        }
                                        TextView textView2 = (TextView) viewFindViewById;
                                        View viewFindViewById2 = viewInflate.findViewById(R.id.imv_services_low_end_title);
                                        if (viewFindViewById2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                        }
                                        TextView textView3 = (TextView) viewFindViewById2;
                                        View viewFindViewById3 = viewInflate.findViewById(R.id.imv_services_low_from);
                                        if (viewFindViewById3 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                        }
                                        TextView textView4 = (TextView) viewFindViewById3;
                                        ImvServicesPriceRangeTitle title = priceRange.getTitle();
                                        I5.a(textView2, title != null ? title.getLow() : null, false);
                                        ImvServicesPriceRangeTitle title2 = priceRange.getTitle();
                                        I5.a(textView3, title2 != null ? title2.getGood() : null, false);
                                        ImvServicesPriceRangeBorder border = priceRange.getBorder();
                                        I5.a(textView4, border != null ? border.getLeft() : null, false);
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        com.avito.android.imv_services_dialog.b.V(constraintLayout, R.id.imv_services_low_track_point, priceRange.getPointPosition());
                                        bVar.W().addView(viewInflate, -1, constraintLayout.getLayoutParams());
                                    } else if (i12 == 2) {
                                        View viewInflate2 = layoutInflater.inflate(R.layout.imv_services_dialog_good_chart_view, (ViewGroup) bVar.W(), false);
                                        View viewFindViewById4 = viewInflate2.findViewById(R.id.imv_services_good_track_title);
                                        if (viewFindViewById4 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                        }
                                        TextView textView5 = (TextView) viewFindViewById4;
                                        View viewFindViewById5 = viewInflate2.findViewById(R.id.imv_services_good_from);
                                        if (viewFindViewById5 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                        }
                                        TextView textView6 = (TextView) viewFindViewById5;
                                        View viewFindViewById6 = viewInflate2.findViewById(R.id.imv_services_good_to);
                                        if (viewFindViewById6 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                        }
                                        TextView textView7 = (TextView) viewFindViewById6;
                                        ImvServicesPriceRangeTitle title3 = priceRange.getTitle();
                                        I5.a(textView5, title3 != null ? title3.getGood() : null, false);
                                        ImvServicesPriceRangeBorder border2 = priceRange.getBorder();
                                        I5.a(textView6, border2 != null ? border2.getLeft() : null, false);
                                        ImvServicesPriceRangeBorder border3 = priceRange.getBorder();
                                        I5.a(textView7, border3 != null ? border3.getRight() : null, false);
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate2;
                                        com.avito.android.imv_services_dialog.b.V(constraintLayout2, R.id.imv_services_good_track_point, priceRange.getPointPosition());
                                        bVar.W().addView(viewInflate2, -1, constraintLayout2.getLayoutParams());
                                    } else if (i12 == 3) {
                                        View viewInflate3 = layoutInflater.inflate(R.layout.imv_services_dialog_high_chart_view, (ViewGroup) bVar.W(), false);
                                        View viewFindViewById7 = viewInflate3.findViewById(R.id.imv_services_high_start_title);
                                        if (viewFindViewById7 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                        }
                                        TextView textView8 = (TextView) viewFindViewById7;
                                        View viewFindViewById8 = viewInflate3.findViewById(R.id.imv_services_high_end_title);
                                        if (viewFindViewById8 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                        }
                                        TextView textView9 = (TextView) viewFindViewById8;
                                        View viewFindViewById9 = viewInflate3.findViewById(R.id.imv_services_high_to);
                                        if (viewFindViewById9 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                        }
                                        TextView textView10 = (TextView) viewFindViewById9;
                                        ImvServicesPriceRangeTitle title4 = priceRange.getTitle();
                                        I5.a(textView8, title4 != null ? title4.getGood() : null, false);
                                        ImvServicesPriceRangeTitle title5 = priceRange.getTitle();
                                        I5.a(textView9, title5 != null ? title5.getHigh() : null, false);
                                        ImvServicesPriceRangeBorder border4 = priceRange.getBorder();
                                        I5.a(textView10, border4 != null ? border4.getRight() : null, false);
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate3;
                                        com.avito.android.imv_services_dialog.b.V(constraintLayout3, R.id.imv_services_high_track_point, priceRange.getPointPosition());
                                        bVar.W().addView(viewInflate3, -1, constraintLayout3.getLayoutParams());
                                    }
                                }
                                ImvServicesHintData hintData = imvServices.getHintData();
                                if (hintData != null) {
                                    InterfaceC42726C interfaceC42726C = bVar.f170760M;
                                    ((LinearLayout) interfaceC42726C.getValue()).removeAllViews();
                                    I5.a((TextView) bVar.f170759L.getValue(), hintData.getText(), false);
                                    List<String> options = hintData.getOptions();
                                    if (options != null) {
                                        for (String str : options) {
                                            String bullet = hintData.getBullet();
                                            View viewInflate4 = layoutInflater.inflate(R.layout.imv_services_dialog_options_view, (ViewGroup) bVar.W(), false);
                                            View viewFindViewById10 = viewInflate4.findViewById(R.id.option_bullet);
                                            if (viewFindViewById10 == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                            }
                                            I5.a((TextView) viewFindViewById10, bullet, false);
                                            View viewFindViewById11 = viewInflate4.findViewById(R.id.option_title);
                                            if (viewFindViewById11 == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                            }
                                            I5.a((TextView) viewFindViewById11, str, false);
                                            ((LinearLayout) interfaceC42726C.getValue()).addView(viewInflate4, -1, viewInflate4.getLayoutParams());
                                        }
                                    }
                                }
                                ImvServicesFeedback feedback2 = imvServices.getFeedback();
                                InterfaceC42726C interfaceC42726C2 = bVar.f170766S;
                                if (feedback2 != null) {
                                    I5.a((TextView) bVar.f170762O.getValue(), feedback2.getText(), false);
                                    List<ImvServicesAnswerButton> answers = feedback2.getAnswers();
                                    final ImvServicesAnswerButton imvServicesAnswerButton = answers != null ? (ImvServicesAnswerButton) C42745f0.G(answers) : null;
                                    InterfaceC42726C interfaceC42726C3 = bVar.f170763P;
                                    I5.a((TextView) interfaceC42726C3.getValue(), imvServicesAnswerButton != null ? imvServicesAnswerButton.getText() : null, false);
                                    TextView textView11 = (TextView) interfaceC42726C3.getValue();
                                    final Y41.l<Integer, G0> lVar = bVar.f170752E;
                                    final int i13 = 0;
                                    textView11.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.imv_services_dialog.a
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            String id2;
                                            String id3;
                                            Y41.l lVar2 = lVar;
                                            Integer numY0 = null;
                                            ImvServicesAnswerButton imvServicesAnswerButton2 = imvServicesAnswerButton;
                                            switch (i13) {
                                                case 0:
                                                    int i14 = b.f170751T;
                                                    if (imvServicesAnswerButton2 != null && (id2 = imvServicesAnswerButton2.getId()) != null) {
                                                        numY0 = C43066x.y0(id2);
                                                    }
                                                    lVar2.invoke(numY0);
                                                    break;
                                                default:
                                                    int i15 = b.f170751T;
                                                    if (imvServicesAnswerButton2 != null && (id3 = imvServicesAnswerButton2.getId()) != null) {
                                                        numY0 = C43066x.y0(id3);
                                                    }
                                                    lVar2.invoke(numY0);
                                                    break;
                                            }
                                        }
                                    });
                                    List<ImvServicesAnswerButton> answers2 = feedback2.getAnswers();
                                    final ImvServicesAnswerButton imvServicesAnswerButton2 = answers2 != null ? (ImvServicesAnswerButton) C42745f0.K(1, answers2) : null;
                                    InterfaceC42726C interfaceC42726C4 = bVar.f170764Q;
                                    I5.a((TextView) interfaceC42726C4.getValue(), imvServicesAnswerButton2 != null ? imvServicesAnswerButton2.getText() : null, false);
                                    TextView textView12 = (TextView) interfaceC42726C4.getValue();
                                    final Y41.l<Integer, G0> lVar2 = bVar.f170753F;
                                    final int i14 = 1;
                                    textView12.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.imv_services_dialog.a
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            String id2;
                                            String id3;
                                            Y41.l lVar22 = lVar2;
                                            Integer numY0 = null;
                                            ImvServicesAnswerButton imvServicesAnswerButton22 = imvServicesAnswerButton2;
                                            switch (i14) {
                                                case 0:
                                                    int i142 = b.f170751T;
                                                    if (imvServicesAnswerButton22 != null && (id2 = imvServicesAnswerButton22.getId()) != null) {
                                                        numY0 = C43066x.y0(id2);
                                                    }
                                                    lVar22.invoke(numY0);
                                                    break;
                                                default:
                                                    int i15 = b.f170751T;
                                                    if (imvServicesAnswerButton22 != null && (id3 = imvServicesAnswerButton22.getId()) != null) {
                                                        numY0 = C43066x.y0(id3);
                                                    }
                                                    lVar22.invoke(numY0);
                                                    break;
                                            }
                                        }
                                    });
                                    ((TextView) interfaceC42726C2.getValue()).setText(feedback2.getAnsweredText());
                                }
                                ((Group) bVar.f170765R.getValue()).setVisibility(c42288c2.f405598d ? 0 : 8);
                                ((TextView) interfaceC42726C2.getValue()).setVisibility(c42288c2.f405599e ? 0 : 8);
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5050a(ImvServicesDialogFragment imvServicesDialogFragment, Continuation<? super C5050a> continuation) {
                    super(2, continuation);
                    this.f170735r = imvServicesDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C5050a(this.f170735r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C5050a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f170734q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ImvServicesDialogFragment imvServicesDialogFragment = this.f170735r;
                        n2<C42288c> state = ((com.avito.android.imv_services_dialog.d) imvServicesDialogFragment.f170723j0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = imvServicesDialogFragment.f170725l0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C5051a c5051a = new C5051a(imvServicesDialogFragment);
                        this.f170734q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c5051a, this) == coroutine_suspended) {
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

            /* compiled from: ImvServicesDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.imv_services_dialog.ImvServicesDialogFragment$onCreateView$1$1$2", f = "ImvServicesDialogFragment.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f170737q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ImvServicesDialogFragment f170738r;

                /* compiled from: ImvServicesDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.imv_services_dialog.ImvServicesDialogFragment$e$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C5052a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ImvServicesDialogFragment f170739b;

                    public C5052a(ImvServicesDialogFragment imvServicesDialogFragment) {
                        this.f170739b = imvServicesDialogFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        com.avito.android.imv_services_dialog.b bVar;
                        InterfaceC42287b interfaceC42287b = (InterfaceC42287b) obj;
                        a aVar = ImvServicesDialogFragment.f170719n0;
                        ImvServicesDialogFragment imvServicesDialogFragment = this.f170739b;
                        if (interfaceC42287b instanceof InterfaceC42287b.a) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = imvServicesDialogFragment.f170724k0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            ((InterfaceC42287b.a) interfaceC42287b).getClass();
                            b.a.a(aVar2, null, null, null, 6);
                        } else if ((interfaceC42287b instanceof InterfaceC42287b.C11563b) && (bVar = imvServicesDialogFragment.f170726m0) != null) {
                            String str = ((InterfaceC42287b.C11563b) interfaceC42287b).f405593a;
                            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                            if (str == null) {
                                str = "";
                            }
                            com.avito.android.component.toast.c.d(cVar, bVar, com.avito.android.printable_text.b.f(str), null, f.a.f125253a, 0, ToastBarPosition.f181047e, 942);
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
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f170739b, ImvServicesDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(ImvServicesDialogFragment imvServicesDialogFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f170738r = imvServicesDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f170738r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f170737q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ImvServicesDialogFragment imvServicesDialogFragment = this.f170738r;
                        InterfaceC43160i<InterfaceC42287b> events = ((com.avito.android.imv_services_dialog.d) imvServicesDialogFragment.f170723j0.getValue()).getEvents();
                        C5052a c5052a = new C5052a(imvServicesDialogFragment);
                        this.f170737q = 1;
                        if (events.collect(c5052a, this) == coroutine_suspended) {
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
            public a(ImvServicesDialogFragment imvServicesDialogFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f170733r = imvServicesDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f170733r, continuation);
                aVar.f170732q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f170732q;
                ImvServicesDialogFragment imvServicesDialogFragment = this.f170733r;
                C43259k.d(t12, null, null, new C5050a(imvServicesDialogFragment, null), 3);
                C43259k.d(t12, null, null, new b(imvServicesDialogFragment, null), 3);
                return G0.f406611a;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return ImvServicesDialogFragment.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f170730q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                ImvServicesDialogFragment imvServicesDialogFragment = ImvServicesDialogFragment.this;
                a aVar = new a(imvServicesDialogFragment, null);
                this.f170730q = 1;
                if (C23056p0.b(imvServicesDialogFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f170740l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f170740l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f170740l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ImvServicesDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f170742l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f170742l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f170742l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f170743l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f170743l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f170743l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f170744l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f170744l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f170744l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ImvServicesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/imv_services_dialog/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/imv_services_dialog/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.imv_services_dialog.d> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.imv_services_dialog.d invoke() {
            com.avito.android.imv_services_dialog.e eVar = ImvServicesDialogFragment.this.f170722i0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.imv_services_dialog.d) eVar.get();
        }
    }

    public ImvServicesDialogFragment() {
        super(0, 1, null);
        this.f170721h0 = new C35968w3(this);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f170723j0 = new O0(m0.f406844a.b(com.avito.android.imv_services_dialog.d.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.imv_services_dialog.di.a.a().a(f5(), new C28478k(ImvServicesDialogScreen.f170810d, s.b(this), null, 4, null), (com.avito.android.imv_services_dialog.di.c) C29972i.a(C29972i.b(this), com.avito.android.imv_services_dialog.di.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f170725l0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final ImvServicesDialogScreenParams f5() {
        return (ImvServicesDialogScreenParams) this.f170721h0.getValue(this, f170720o0[0]);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f170725l0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.imv_services_dialog.b bVar = new com.avito.android.imv_services_dialog.b(requireContext(), R.style.Re23_BottomSheet_Default, new b(), new c(), new d());
        this.f170726m0 = bVar;
        return bVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        C43259k.d(C22981N.a(getLifecycle()), null, null, new e(null), 3);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f170725l0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }
}
