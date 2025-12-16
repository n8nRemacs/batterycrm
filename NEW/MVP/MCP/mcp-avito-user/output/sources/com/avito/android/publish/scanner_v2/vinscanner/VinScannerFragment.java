package com.avito.android.publish.scanner_v2.vinscanner;

import Be0.InterfaceC13140a;
import Cd.C13243a;
import De0.InterfaceC13390a;
import De0.InterfaceC13392c;
import De0.d;
import Id0.InterfaceC14061a;
import Y41.p;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.core.view.C22823h0;
import androidx.core.view.F0;
import androidx.core.view.J0;
import androidx.core.view.L0;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
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
import com.avito.android.analytics.screens.ScannerVinScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.photo_camera_view.InterfaceC33173d;
import com.avito.android.photo_picker.CameraType;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishActivity;
import com.avito.android.publish.PublishState;
import com.avito.android.publish.scanner_v2.PhotoDimension;
import com.avito.android.publish.scanner_v2.ScannerOpenParams;
import com.avito.android.publish.scanner_v2.ScannerOverlay;
import com.avito.android.publish.scanner_v2.di.b;
import com.avito.android.publish.view.result_handler.PublishResultReceiverFragment;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.ManualScanner;
import com.avito.android.remote.model.category_parameters.ManualVin;
import com.avito.android.util.A1;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.NotFoundException;
import com.facebook.drawee.view.SimpleDraweeView;
import cv.InterfaceC39417a;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
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
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import oe0.InterfaceC44764a;
import z1.AbstractC50339a;

/* compiled from: VinScannerFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/publish/scanner_v2/vinscanner/VinScannerFragment;", "Lcom/avito/android/publish/view/result_handler/PublishResultReceiverFragment;", "LId0/a;", "Lcom/avito/android/photo_camera_view/d$b;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/photo_camera_view/d$a;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VinScannerFragment extends PublishResultReceiverFragment implements InterfaceC14061a, InterfaceC33173d.b, com.avito.android.ui.fragments.c, InterfaceC28477j.b, InterfaceC33173d.a {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f239434A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.scanner_v2.c f239435B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f239436C0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC33173d f239437o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC44764a f239438p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.scanner_v2.scanner_manual_bottom_sheet.a f239439q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f239440r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC13140a f239441s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.scanner_v2.vinscanner.l f239442t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f239443u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public Provider<C0> f239444v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final O0 f239445w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f239446x0;

    /* renamed from: y0, reason: collision with root package name */
    @InterfaceC42156l
    public int f239447y0;

    /* renamed from: z0, reason: collision with root package name */
    @InterfaceC42156l
    public int f239448z0;

    /* renamed from: E0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f239433E0 = {m0.f406844a.e(new Y(VinScannerFragment.class, "scannerOpenParams", "getScannerOpenParams()Lcom/avito/android/publish/scanner_v2/ScannerOpenParams;", 0))};

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final a f239432D0 = new a(null);

    /* compiled from: VinScannerFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/publish/scanner_v2/vinscanner/VinScannerFragment$a;", "", "<init>", "()V", "", "GALLERY_REQUEST_KEY", "I", "", "SCANNER_SUCCESS_REQUEST_KEY", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VinScannerFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.scanner_v2.vinscanner.VinScannerFragment$onViewCreated$2", f = "VinScannerFragment.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f239449q;

        /* compiled from: VinScannerFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.scanner_v2.vinscanner.VinScannerFragment$onViewCreated$2$1", f = "VinScannerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f239451q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ VinScannerFragment f239452r;

            /* compiled from: VinScannerFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.scanner_v2.vinscanner.VinScannerFragment$onViewCreated$2$1$1", f = "VinScannerFragment.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.publish.scanner_v2.vinscanner.VinScannerFragment$b$a$a, reason: collision with other inner class name */
            public static final class C7201a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f239453q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ VinScannerFragment f239454r;

                /* compiled from: VinScannerFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.publish.scanner_v2.vinscanner.VinScannerFragment$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C7202a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ VinScannerFragment f239455b;

                    public C7202a(VinScannerFragment vinScannerFragment) {
                        this.f239455b = vinScannerFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) throws NotFoundException {
                        PublishState.StepState imei;
                        PublishState.StepState categoriesSuggestions;
                        CategoryParameters categoryParametersCloneWithNewParameters;
                        InterfaceC13392c interfaceC13392c = (InterfaceC13392c) obj;
                        a aVar = VinScannerFragment.f239432D0;
                        VinScannerFragment vinScannerFragment = this.f239455b;
                        if (interfaceC13392c instanceof InterfaceC13392c.b) {
                            androidx.core.content.j jVarL1 = vinScannerFragment.l1();
                            com.avito.android.publish.scanner.o oVar = jVarL1 instanceof com.avito.android.publish.scanner.o ? (com.avito.android.publish.scanner.o) jVarL1 : null;
                            if (oVar != null) {
                                oVar.M0();
                            }
                        } else if (interfaceC13392c instanceof InterfaceC13392c.a) {
                            ((PublishActivity) vinScannerFragment.requireActivity()).d2(null);
                        } else if (interfaceC13392c instanceof InterfaceC13392c.e) {
                            CategoryParameters categoryParameters = ((InterfaceC13392c.e) interfaceC13392c).f3334a;
                            InterfaceC13140a interfaceC13140a = vinScannerFragment.f239441s0;
                            if (interfaceC13140a == null) {
                                interfaceC13140a = null;
                            }
                            interfaceC13140a.c();
                            CategoryParameters categoryParameters2 = vinScannerFragment.r5().f231873k0;
                            if (categoryParameters2 != null && (categoryParametersCloneWithNewParameters = categoryParameters2.cloneWithNewParameters(categoryParameters.getParameters(), categoryParameters.getChangedIds())) != null) {
                                vinScannerFragment.r5().Ke(categoryParametersCloneWithNewParameters);
                            }
                            C0 c0R5 = vinScannerFragment.r5();
                            InterfaceC42726C interfaceC42726C = vinScannerFragment.f239436C0;
                            Object objF = C42745f0.F(c0R5.pe(((Number) interfaceC42726C.getValue()).intValue()));
                            CharParameter charParameter = objF instanceof CharParameter ? (CharParameter) objF : null;
                            if (charParameter != null) {
                                PublishState publishState = vinScannerFragment.r5().f231861Y;
                                int iIntValue = ((Number) interfaceC42726C.getValue()).intValue();
                                PublishState.StepState stepState = publishState.k().get(Integer.valueOf(iIntValue));
                                boolean z12 = stepState instanceof PublishState.StepState.Vin;
                                PublishState.StepState stepState2 = stepState;
                                if (!z12) {
                                    n0 n0Var = m0.f406844a;
                                    kotlin.reflect.d dVarB = n0Var.b(PublishState.StepState.Vin.class);
                                    if (dVarB.equals(n0Var.b(PublishState.StepState.Wizard.class))) {
                                        categoriesSuggestions = new PublishState.StepState.Wizard(null, null, null, 7, null);
                                    } else if (dVarB.equals(n0Var.b(PublishState.StepState.CategoriesSuggestions.class))) {
                                        categoriesSuggestions = new PublishState.StepState.CategoriesSuggestions(null, null, null, null, 15, null);
                                    } else {
                                        if (dVarB.equals(n0Var.b(PublishState.StepState.Vin.class))) {
                                            imei = new PublishState.StepState.Vin(null, 1, null);
                                        } else {
                                            if (!dVarB.equals(n0Var.b(PublishState.StepState.Imei.class))) {
                                                throw new NotFoundException(n0Var.b(PublishState.StepState.Vin.class).toString(), (Throwable) null, 2, (C42822w) null);
                                            }
                                            imei = new PublishState.StepState.Imei(null, 1, null);
                                        }
                                        categoriesSuggestions = imei;
                                    }
                                    publishState.k().put(Integer.valueOf(iIntValue), categoriesSuggestions);
                                    stepState2 = (PublishState.StepState.Vin) categoriesSuggestions;
                                }
                                ((PublishState.StepState.Vin) stepState2).g(charParameter.getValue());
                                vinScannerFragment.i0();
                                vinScannerFragment.getParentFragmentManager().o0(C22777e.a(), "SCANNER_SUCCESS_REQUEST_KEY");
                            }
                        } else if (interfaceC13392c instanceof InterfaceC13392c.C0178c) {
                            ManualScanner manualScanner = vinScannerFragment.s5().f239278b.getManualScanner();
                            if (manualScanner != null) {
                                com.avito.android.publish.scanner_v2.scanner_manual_bottom_sheet.a aVar2 = vinScannerFragment.f239439q0;
                                (aVar2 != null ? aVar2 : null).a(vinScannerFragment.requireContext(), manualScanner, new com.avito.android.publish.scanner_v2.vinscanner.b(vinScannerFragment));
                            }
                        } else if (interfaceC13392c instanceof InterfaceC13392c.d) {
                            InterfaceC44764a interfaceC44764a = vinScannerFragment.f239438p0;
                            InterfaceC44764a interfaceC44764a2 = interfaceC44764a != null ? interfaceC44764a : null;
                            Context contextRequireContext = vinScannerFragment.requireContext();
                            ManualVin manualVin = vinScannerFragment.s5().f239278b.getManualVin();
                            if (manualVin != null) {
                                interfaceC44764a2.a(contextRequireContext, manualVin);
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
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f239455b, VinScannerFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/scanner_v2/vinscanner/mvi/entity/VinScannerOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7201a(VinScannerFragment vinScannerFragment, Continuation<? super C7201a> continuation) {
                    super(2, continuation);
                    this.f239454r = vinScannerFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C7201a(this.f239454r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7201a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f239453q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = VinScannerFragment.f239432D0;
                        VinScannerFragment vinScannerFragment = this.f239454r;
                        InterfaceC43160i<InterfaceC13392c> events = vinScannerFragment.t5().getEvents();
                        C7202a c7202a = new C7202a(vinScannerFragment);
                        this.f239453q = 1;
                        if (events.collect(c7202a, this) == coroutine_suspended) {
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

            /* compiled from: VinScannerFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.scanner_v2.vinscanner.VinScannerFragment$onViewCreated$2$1$2", f = "VinScannerFragment.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.publish.scanner_v2.vinscanner.VinScannerFragment$b$a$b, reason: collision with other inner class name */
            public static final class C7203b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f239456q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ VinScannerFragment f239457r;

                /* compiled from: VinScannerFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.publish.scanner_v2.vinscanner.VinScannerFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C7204a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ VinScannerFragment f239458b;

                    public C7204a(VinScannerFragment vinScannerFragment) {
                        this.f239458b = vinScannerFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        De0.d dVar = (De0.d) obj;
                        VinScannerFragment vinScannerFragment = this.f239458b;
                        com.avito.android.publish.scanner_v2.c cVar = vinScannerFragment.f239435B0;
                        if (cVar != null) {
                            d.f f3335a = dVar.getF3335a();
                            String str = f3335a.f3345a;
                            if (!cVar.f239362x) {
                                I5.a(cVar.f239348j, str, false);
                            }
                            cVar.f239346h.setText(f3335a.f3346b);
                            I5.a(cVar.f239354p, f3335a.f3347c, false);
                            I5.a(cVar.f239355q, f3335a.f3348d, false);
                            cVar.f239345g.setOnClickListener(new Ae0.b(4, new com.avito.android.publish.scanner_v2.vinscanner.c(vinScannerFragment)));
                            cVar.f239347i.setOnClickListener(new Ae0.b(3, new com.avito.android.publish.scanner_v2.vinscanner.d(vinScannerFragment)));
                            cVar.f239344f.setOnClickListener(new Ae0.b(5, new com.avito.android.publish.scanner_v2.vinscanner.e(vinScannerFragment)));
                            com.avito.android.publish.scanner_v2.vinscanner.f fVar = new com.avito.android.publish.scanner_v2.vinscanner.f(vinScannerFragment, f3335a);
                            String str2 = f3335a.f3349e;
                            Button button = cVar.f239343e;
                            if (str2 != null) {
                                com.avito.android.lib.design.button.b.a(button, str2, false);
                                button.setOnClickListener(new Ae0.b(2, fVar));
                            } else {
                                com.avito.android.lib.design.button.b.a(button, null, false);
                                button.setOnClickListener(null);
                            }
                            Uri uri = Uri.EMPTY;
                            Uri uri2 = f3335a.f3350f;
                            boolean zEquals = uri2.equals(uri);
                            SimpleDraweeView simpleDraweeView = cVar.f239352n;
                            if (zEquals) {
                                D6.w(simpleDraweeView);
                            } else {
                                D6.H(simpleDraweeView);
                                ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                                aVarA.f(uri2);
                                aVarA.c();
                            }
                            cVar.L70(f3335a.f3352h);
                        }
                        if (dVar instanceof d.c) {
                            com.avito.android.publish.scanner_v2.c cVar2 = vinScannerFragment.f239435B0;
                            if (cVar2 != null) {
                                cVar2.f239363y = new com.avito.android.publish.scanner_v2.vinscanner.g(vinScannerFragment, cVar2);
                            }
                        } else if (dVar instanceof d.a) {
                            com.avito.android.publish.scanner_v2.c cVar3 = vinScannerFragment.f239435B0;
                            if (cVar3 != null) {
                                cVar3.f239363y = null;
                            }
                            if (cVar3 != null) {
                                d.a aVar = (d.a) dVar;
                                String title = aVar.f3336b;
                                if (title == null) {
                                    title = vinScannerFragment.s5().f239278b.getFailPage().getTitle();
                                }
                                com.avito.android.publish.scanner_v2.vinscanner.h hVar = new com.avito.android.publish.scanner_v2.vinscanner.h(vinScannerFragment);
                                com.avito.android.publish.scanner_v2.vinscanner.i iVar = new com.avito.android.publish.scanner_v2.vinscanner.i(vinScannerFragment);
                                D6.H(cVar3.f239357s);
                                D6.w(cVar3.f239361w);
                                D6.w(cVar3.f239352n);
                                D6.w(cVar3.f239342d);
                                D6.w(cVar3.f239346h);
                                D6.w(cVar3.f239348j);
                                D6.w(cVar3.f239349k);
                                D6.w(cVar3.f239347i);
                                D6.w(cVar3.f239350l);
                                D6.w(cVar3.f239351m);
                                I5.a(cVar3.f239358t, title, false);
                                Button button2 = cVar3.f239359u;
                                com.avito.android.lib.design.button.b.a(button2, aVar.f3337c, false);
                                button2.setOnClickListener(new Ae0.b(0, iVar));
                                Button button3 = cVar3.f239360v;
                                com.avito.android.lib.design.button.b.a(button3, aVar.f3338d, false);
                                button3.setOnClickListener(new Ae0.b(1, hVar));
                            }
                        } else if (dVar instanceof d.e) {
                            com.avito.android.publish.scanner_v2.c cVar4 = vinScannerFragment.f239435B0;
                            if (cVar4 != null) {
                                ScannerOverlay scannerOverlay = cVar4.f239342d;
                                scannerOverlay.progressEnabled = true;
                                ValueAnimator valueAnimator = scannerOverlay.f239284C;
                                if (valueAnimator != null) {
                                    valueAnimator.start();
                                }
                            }
                            InterfaceC33173d interfaceC33173d = vinScannerFragment.f239437o0;
                            (interfaceC33173d != null ? interfaceC33173d : null).g();
                        } else if (dVar instanceof d.b) {
                            com.avito.android.publish.scanner_v2.c cVar5 = vinScannerFragment.f239435B0;
                            if (cVar5 != null) {
                                ScannerOverlay scannerOverlay2 = cVar5.f239342d;
                                scannerOverlay2.progressEnabled = false;
                                ValueAnimator valueAnimator2 = scannerOverlay2.f239284C;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                                scannerOverlay2.invalidate();
                            }
                        } else if (dVar instanceof d.C0179d) {
                            com.avito.android.publish.scanner_v2.c cVar6 = vinScannerFragment.f239435B0;
                            if (cVar6 != null) {
                                D6.w(cVar6.f239357s);
                                D6.H(cVar6.f239361w);
                                D6.H(cVar6.f239342d);
                                D6.H(cVar6.f239346h);
                                D6.H(cVar6.f239349k);
                                D6.H(cVar6.f239347i);
                                if (cVar6.f239362x) {
                                    D6.H(cVar6.f239351m);
                                } else {
                                    D6.H(cVar6.f239348j);
                                    D6.H(cVar6.f239350l);
                                }
                                cVar6.D0();
                            }
                            InterfaceC33173d interfaceC33173d2 = vinScannerFragment.f239437o0;
                            (interfaceC33173d2 != null ? interfaceC33173d2 : null).a();
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
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f239458b, VinScannerFragment.class, "render", "render(Lcom/avito/android/publish/scanner_v2/vinscanner/mvi/entity/VinScannerState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7203b(VinScannerFragment vinScannerFragment, Continuation<? super C7203b> continuation) {
                    super(2, continuation);
                    this.f239457r = vinScannerFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C7203b(this.f239457r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7203b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f239456q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = VinScannerFragment.f239432D0;
                        VinScannerFragment vinScannerFragment = this.f239457r;
                        n2<De0.d> state = vinScannerFragment.t5().getState();
                        C7204a c7204a = new C7204a(vinScannerFragment);
                        this.f239456q = 1;
                        if (state.collect(c7204a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(VinScannerFragment vinScannerFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f239452r = vinScannerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f239452r, continuation);
                aVar.f239451q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f239451q;
                VinScannerFragment vinScannerFragment = this.f239452r;
                C43259k.d(t12, null, null, new C7201a(vinScannerFragment, null), 3);
                C43259k.d(t12, null, null, new C7203b(vinScannerFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return VinScannerFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f239449q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                VinScannerFragment vinScannerFragment = VinScannerFragment.this;
                a aVar = new a(vinScannerFragment, null);
                this.f239449q = 1;
                if (C23056p0.b(vinScannerFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: VinScannerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/C0;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/C0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<C0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final C0 invoke() {
            Provider<C0> provider = VinScannerFragment.this.f239444v0;
            if (provider == null) {
                provider = null;
            }
            return provider.get();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f239460l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f239460l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f239460l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f239461l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f239461l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f239461l);
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
            return VinScannerFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f239463l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f239463l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f239463l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f239464l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f239464l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f239464l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f239465l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f239465l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f239465l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f239466l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f239466l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f239466l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return VinScannerFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f239468l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f239468l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f239468l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f239469l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f239469l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f239469l.getValue()).getF42820b();
        }
    }

    /* compiled from: VinScannerFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class n extends N implements Y41.a<Integer> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            Bundle arguments = VinScannerFragment.this.getArguments();
            if (arguments != null) {
                return Integer.valueOf(arguments.getInt("step_index"));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: VinScannerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/scanner_v2/vinscanner/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/scanner_v2/vinscanner/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<com.avito.android.publish.scanner_v2.vinscanner.k> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.publish.scanner_v2.vinscanner.k invoke() {
            com.avito.android.publish.scanner_v2.vinscanner.l lVar = VinScannerFragment.this.f239442t0;
            if (lVar == null) {
                lVar = null;
            }
            return (com.avito.android.publish.scanner_v2.vinscanner.k) lVar.get();
        }
    }

    public VinScannerFragment() {
        e eVar = new e(new o());
        f fVar = new f();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new g(fVar));
        n0 n0Var = m0.f406844a;
        this.f239443u0 = new O0(n0Var.b(com.avito.android.publish.scanner_v2.vinscanner.k.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        j jVar = new j(new c());
        InterfaceC42726C interfaceC42726CB2 = C42727D.b(lazyThreadSafetyMode, new l(new k()));
        this.f239445w0 = new O0(n0Var.b(C0.class), new m(interfaceC42726CB2), jVar, new d(interfaceC42726CB2));
        this.f239434A0 = new C35968w3(this);
        this.f239436C0 = C42727D.c(new n());
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33173d.a
    public final void E9(@Y61.k List<? extends Uri> list) {
        com.avito.android.publish.scanner_v2.vinscanner.k kVarT5 = t5();
        Uri uri = (Uri) C42745f0.G(list);
        if (uri == null) {
            return;
        }
        Navigation navigation2 = r5().f231861Y.getNavigation();
        CategoryParameters categoryParameters = r5().f231873k0;
        if (categoryParameters == null) {
            return;
        }
        kVarT5.accept(new InterfaceC13390a.f(uri, navigation2, categoryParameters));
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33173d.b
    public final void H2() {
        InterfaceC35845m2 interfaceC35845m2 = this.f239440r0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        startActivity(interfaceC35845m2.i());
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33173d.b
    public final void Q4() {
        InterfaceC35845m2 interfaceC35845m2 = this.f239440r0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        Intent intentO = interfaceC35845m2.o();
        com.avito.android.publish.view.result_handler.a aVar = this.f245673n0;
        (aVar != null ? aVar : null).a(l1(), this, intentO, 2);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        t5().accept(InterfaceC13390a.C0176a.f3311a);
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        requireActivity().setRequestedOrientation(1);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f239446x0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.scanner_v2, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC33173d interfaceC33173d = this.f239437o0;
        if (interfaceC33173d == null) {
            interfaceC33173d = null;
        }
        interfaceC33173d.m();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        requireActivity().setRequestedOrientation(-1);
        super.onDetach();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        u5(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i12, @Y61.k String[] strArr, @Y61.k int[] iArr) {
        InterfaceC33173d interfaceC33173d = this.f239437o0;
        if (interfaceC33173d == null) {
            interfaceC33173d = null;
        }
        interfaceC33173d.l(i12, strArr, iArr);
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        InterfaceC13140a interfaceC13140a = this.f239441s0;
        (interfaceC13140a != null ? interfaceC13140a : null).a(iArr, strArr);
        if (iArr[0] != -1) {
            com.avito.android.publish.scanner_v2.c cVar = this.f239435B0;
            if (cVar != null) {
                cVar.D0();
                return;
            }
            return;
        }
        com.avito.android.publish.scanner_v2.c cVar2 = this.f239435B0;
        if (cVar2 != null) {
            D6.H(cVar2.f239353o);
            D6.w(cVar2.f239361w);
            D6.w(cVar2.f239349k);
            D6.w(cVar2.f239342d);
            D6.w(cVar2.f239346h);
            D6.w(cVar2.f239348j);
            D6.w(cVar2.f239347i);
            D6.w(cVar2.f239350l);
            D6.w(cVar2.f239351m);
        }
    }

    @Override // com.avito.android.publish.view.result_handler.PublishResultReceiverFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u5(true);
        J0 j0O = C22823h0.o(requireActivity().getWindow().getDecorView());
        com.avito.android.publish.scanner_v2.c cVar = this.f239435B0;
        if (cVar == null || j0O == null) {
            return;
        }
        C22823h0.c(cVar.f239340b, j0O);
        C22823h0.c(cVar.f239342d, j0O);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC33173d interfaceC33173d = this.f239437o0;
        if (interfaceC33173d == null) {
            interfaceC33173d = null;
        }
        interfaceC33173d.d(this);
        InterfaceC33173d interfaceC33173d2 = this.f239437o0;
        (interfaceC33173d2 != null ? interfaceC33173d2 : null).a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC33173d interfaceC33173d = this.f239437o0;
        if (interfaceC33173d == null) {
            interfaceC33173d = null;
        }
        interfaceC33173d.c0();
        InterfaceC33173d interfaceC33173d2 = this.f239437o0;
        (interfaceC33173d2 != null ? interfaceC33173d2 : null).g();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f239447y0 = requireActivity().getWindow().getStatusBarColor();
        this.f239448z0 = requireActivity().getWindow().getNavigationBarColor();
        InterfaceC33173d interfaceC33173d = this.f239437o0;
        if (interfaceC33173d == null) {
            interfaceC33173d = null;
        }
        com.avito.android.publish.scanner_v2.c cVar = new com.avito.android.publish.scanner_v2.c(view, interfaceC33173d);
        InterfaceC33173d interfaceC33173d2 = this.f239437o0;
        if (interfaceC33173d2 == null) {
            interfaceC33173d2 = null;
        }
        interfaceC33173d2.j(cVar);
        this.f239435B0 = cVar;
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker = this.f239446x0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        Display defaultDisplay = requireActivity().getWindowManager().getDefaultDisplay();
        Resources resources = getResources();
        PhotoDimension photoDimension = s5().f239280d;
        F70.a aVar = new F70.a(defaultDisplay, resources, new u80.c(photoDimension.f239276b, photoDimension.f239277c), CameraType.BackCamera.f218740c, true, null);
        C28478k c28478k = new C28478k(ScannerVinScreen.f90470d, s.c(this), null, 4, null);
        b.a aVarA = com.avito.android.publish.scanner_v2.di.a.a();
        com.avito.android.publish.scanner_v2.di.c cVar = (com.avito.android.publish.scanner_v2.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.scanner_v2.di.c.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        ScannerOpenParams scannerOpenParamsS5 = s5();
        aVarA.a(aVar, cVar, interfaceC39417aB, this, this, scannerOpenParamsS5.f239278b, ((Number) this.f239436C0.getValue()).intValue(), s5(), c28478k).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f239446x0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.publish.view.result_handler.PublishResultReceiverFragment
    public final void q5(int i12, int i13, @Y61.l Intent intent) {
        if (i13 == -1 && i12 == 2 && intent != null) {
            A1.f318515a.getClass();
            ArrayList arrayListA = A1.a(intent);
            if (arrayListA.isEmpty()) {
                return;
            }
            com.avito.android.publish.scanner_v2.vinscanner.k kVarT5 = t5();
            Uri uri = (Uri) C42745f0.G(arrayListA);
            if (uri == null) {
                return;
            }
            Navigation navigation2 = r5().f231861Y.getNavigation();
            CategoryParameters categoryParameters = r5().f231873k0;
            if (categoryParameters == null) {
                return;
            }
            kVarT5.accept(new InterfaceC13390a.f(uri, navigation2, categoryParameters));
        }
    }

    public final C0 r5() {
        return (C0) this.f239445w0.getValue();
    }

    public final ScannerOpenParams s5() {
        return (ScannerOpenParams) this.f239434A0.getValue(this, f239433E0[0]);
    }

    public final com.avito.android.publish.scanner_v2.vinscanner.k t5() {
        return (com.avito.android.publish.scanner_v2.vinscanner.k) this.f239443u0.getValue();
    }

    public final void u5(boolean z12) {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        Window window = activityC22955mRequireActivity.getWindow();
        if (!z12) {
            if (Build.VERSION.SDK_INT >= 29) {
                window.setNavigationBarContrastEnforced(true);
            }
            window.setStatusBarColor(this.f239447y0);
            window.setNavigationBarColor(this.f239448z0);
            L0 l02 = new L0(window, window.getDecorView());
            boolean zC2 = com.avito.android.lib.util.darkTheme.c.c(activityC22955mRequireActivity.getResources());
            l02.e(zC2);
            l02.d(zC2);
            return;
        }
        F0.a(window, false);
        if (Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
        int iD2 = C35835l0.d(R.attr.transparentBlack, requireContext());
        window.setStatusBarColor(iD2);
        window.setNavigationBarColor(iD2);
        L0 l03 = new L0(window, window.getDecorView());
        l03.e(false);
        l03.d(false);
    }
}
