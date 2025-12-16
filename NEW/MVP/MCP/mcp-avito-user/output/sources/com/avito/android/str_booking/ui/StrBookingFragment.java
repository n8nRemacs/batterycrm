package com.avito.android.str_booking.ui;

import Cd.C13243a;
import Mx0.C14541a;
import Y41.p;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import com.avito.android.analytics.screens.StrBookingScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.gsm_call_starter.public_module.link.GsmCallStartLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.AnimationOverlayUrl;
import com.avito.android.remote.model.Image;
import com.avito.android.str_booking.domain.items_converter.InterfaceC35075o;
import com.avito.android.str_booking.mvi.entity.a;
import com.avito.android.str_booking.mvi.entity.b;
import com.avito.android.str_booking.network.models.sections.UpdatedTimeContent;
import com.avito.android.str_booking.ui.ScreenType;
import com.avito.android.str_booking.ui.f;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.V2;
import com.avito.android.webview.l;
import gF.InterfaceC40577a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: StrBookingFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_booking/ui/StrBookingFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/fragments/c;", "<init>", "()V", "a", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrBookingFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.ui.fragments.c {

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final a f285867G0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public InterfaceC35075o f285868A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_booking.ui.delegates.c f285869B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_booking.ui.delegates.e f285870C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_booking.domain.polling.b f285871D0;

    /* renamed from: E0, reason: collision with root package name */
    public com.avito.android.str_booking.ui.f f285872E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f285873F0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public o f285874n0;

    /* renamed from: o0, reason: collision with root package name */
    public RecyclerView f285875o0;

    /* renamed from: p0, reason: collision with root package name */
    public LinearLayoutManager f285876p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f285877q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f285878r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f285879s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f285880t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_booking.ui.banner.d f285881u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC40577a f285882v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.webview.l f285883w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f285884x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f285885y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public x f285886z0;

    /* compiled from: StrBookingFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/str_booking/ui/StrBookingFragment$a;", "", "<init>", "()V", "", "MAPS_HOST", "Ljava/lang/String;", "NO_SCREEN_TYPE_ERROR_MESSAGE", "ORDER_ID", "", "REQ_GALLERY", "I", "SCREEN_TYPE", "START_ANIMATION", "TAG", "UX_FEEDBACK_EVENT_NAME", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrBookingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ScreenType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ScreenType.a aVar = ScreenType.f285864b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: StrBookingFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_booking.ui.StrBookingFragment$onViewCreated$1", f = "StrBookingFragment.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285887q;

        /* compiled from: StrBookingFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_booking.ui.StrBookingFragment$onViewCreated$1$1", f = "StrBookingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f285889q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StrBookingFragment f285890r;

            /* compiled from: StrBookingFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_booking.ui.StrBookingFragment$onViewCreated$1$1$1", f = "StrBookingFragment.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_booking.ui.StrBookingFragment$c$a$a, reason: collision with other inner class name */
            public static final class C8557a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f285891q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrBookingFragment f285892r;

                /* compiled from: StrBookingFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMx0/a;", "it", "Lkotlin/G0;", "invoke", "(LMx0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.str_booking.ui.StrBookingFragment$c$a$a$a, reason: collision with other inner class name */
                public static final class C8558a extends N implements Y41.l<C14541a, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ StrBookingFragment f285893l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C8558a(StrBookingFragment strBookingFragment) {
                        super(1);
                        this.f285893l = strBookingFragment;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:129:0x01af  */
                    /* JADX WARN: Removed duplicated region for block: B:130:0x01b2  */
                    /* JADX WARN: Removed duplicated region for block: B:132:0x01b5  */
                    @Override // Y41.l
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final kotlin.G0 invoke(Mx0.C14541a r19) {
                        /*
                            Method dump skipped, instructions count: 547
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_booking.ui.StrBookingFragment.c.a.C8557a.C8558a.invoke(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8557a(StrBookingFragment strBookingFragment, Continuation<? super C8557a> continuation) {
                    super(2, continuation);
                    this.f285892r = strBookingFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8557a(this.f285892r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8557a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f285891q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = StrBookingFragment.f285867G0;
                        StrBookingFragment strBookingFragment = this.f285892r;
                        n2<C14541a> state = strBookingFragment.q5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = strBookingFragment.f285878r0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C8558a c8558a = new C8558a(strBookingFragment);
                        this.f285891q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c8558a, this) == coroutine_suspended) {
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

            /* compiled from: StrBookingFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_booking.ui.StrBookingFragment$onViewCreated$1$1$2", f = "StrBookingFragment.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f285894q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrBookingFragment f285895r;

                /* compiled from: StrBookingFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_booking.ui.StrBookingFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C8559a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StrBookingFragment f285896b;

                    public C8559a(StrBookingFragment strBookingFragment) {
                        this.f285896b = strBookingFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        DeepLink deepLink;
                        com.avito.android.str_booking.mvi.entity.b bVar = (com.avito.android.str_booking.mvi.entity.b) obj;
                        a aVar = StrBookingFragment.f285867G0;
                        StrBookingFragment strBookingFragment = this.f285896b;
                        f.b bVar2 = null;
                        if (bVar instanceof b.e) {
                            b.e eVar = (b.e) bVar;
                            if (eVar instanceof b.e.a) {
                                deepLink = ((b.e.a) eVar).f285801a;
                            } else {
                                if (!(eVar instanceof b.e.C8555b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                String str = ((b.e.C8555b) eVar).f285802a;
                                x xVar = strBookingFragment.f285886z0;
                                if (xVar == null) {
                                    xVar = null;
                                }
                                DeepLink deepLinkB = xVar.b(str);
                                if (deepLinkB instanceof NoMatchLink) {
                                    V2.f318762a.e("deeplink for " + str + " not found", null);
                                }
                                deepLink = deepLinkB;
                            }
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = strBookingFragment.f285885y0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("up_intent", null);
                            bundle.putBoolean("with_up_intent", false);
                            G0 g02 = G0.f406611a;
                            b.a.a(aVar2, deepLink, null, bundle, 2);
                        } else if (bVar instanceof b.h) {
                            Uri uri = Uri.parse(((b.h) bVar).f285806a);
                            com.avito.android.webview.l lVar = strBookingFragment.f285883w0;
                            if (lVar == null) {
                                lVar = null;
                            }
                            C35966w1.g(strBookingFragment, l.a.a(lVar, uri, null, 6), new com.avito.android.str_booking.ui.b(uri));
                        } else if (bVar instanceof b.C8554b) {
                            String str2 = ((b.C8554b) bVar).f285798a;
                            com.avito.android.deeplink_handler.handler.composite.a aVar3 = strBookingFragment.f285885y0;
                            if (aVar3 == null) {
                                aVar3 = null;
                            }
                            b.a.a(aVar3, new GsmCallStartLink(str2, null, null, null, null, null, 62, null), null, null, 6);
                        } else if (bVar instanceof b.g) {
                            b.g gVar = (b.g) bVar;
                            InterfaceC35845m2 interfaceC35845m2 = strBookingFragment.f285884x0;
                            Intent intentK = (interfaceC35845m2 != null ? interfaceC35845m2 : null).k(gVar.f285805a);
                            if (intentK.resolveActivity(strBookingFragment.requireContext().getPackageManager()) != null) {
                                C35966w1.g(strBookingFragment, intentK, new com.avito.android.str_booking.ui.a(strBookingFragment, gVar));
                            } else {
                                strBookingFragment.r5(gVar);
                            }
                        } else if (bVar instanceof b.f) {
                            b.f fVar = (b.f) bVar;
                            List<Image> list = fVar.f285803a;
                            InterfaceC40577a interfaceC40577a = strBookingFragment.f285882v0;
                            C35966w1.d(strBookingFragment, (interfaceC40577a != null ? interfaceC40577a : null).a(fVar.f285804b, list), 100);
                        } else if (bVar instanceof b.j) {
                            com.avito.android.str_booking.ui.f fVar2 = strBookingFragment.f285872E0;
                            if (fVar2 == null) {
                                fVar2 = null;
                            }
                            b.j jVar = (b.j) bVar;
                            fVar2.getClass();
                            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(fVar2.f286014a.getContext(), 0, 2, null);
                            View viewInflate = View.inflate(dVar.getContext(), R.layout.str_booking_confirm_bottomsheet, null);
                            dVar.G(viewInflate, true);
                            com.avito.android.lib.design.bottom_sheet.j.c(dVar, jVar.f285808a, true, 0, 0, 0, 120);
                            TextView textView = (TextView) viewInflate.findViewById(R.id.str_booking_subtitle);
                            Button button = (Button) viewInflate.findViewById(R.id.str_approve_button);
                            Button button2 = (Button) viewInflate.findViewById(R.id.str_cancel_button);
                            kotlin.c.b(textView, jVar.f285811d);
                            button.setState(new UU.a(jVar.f285809b, null, false, false, false, new com.avito.android.str_booking.ui.i(fVar2, jVar, dVar), null, null, null, false, 990, null));
                            button2.setState(new UU.a(jVar.f285810c, null, false, false, false, new com.avito.android.str_booking.ui.j(dVar), null, null, null, false, 990, null));
                            com.avito.android.lib.util.g.a(dVar);
                        } else if (bVar instanceof b.c) {
                            ActivityC22955m activityC22955mRequireActivity = strBookingFragment.requireActivity();
                            activityC22955mRequireActivity.setResult(-1);
                            activityC22955mRequireActivity.finish();
                        } else if (bVar instanceof b.a) {
                            RecyclerView recyclerView = strBookingFragment.f285875o0;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            LinearLayoutManager linearLayoutManager = strBookingFragment.f285876p0;
                            recyclerView.F0((linearLayoutManager != null ? linearLayoutManager : null).M1() + 1);
                        } else if (bVar instanceof b.k) {
                            com.avito.android.str_booking.ui.f fVar3 = strBookingFragment.f285872E0;
                            com.avito.android.str_booking.ui.f fVar4 = fVar3 != null ? fVar3 : null;
                            fVar4.f286015b.d(fVar4.f286014a);
                        } else if (bVar instanceof b.d) {
                            com.avito.android.str_booking.ui.f fVar5 = strBookingFragment.f285872E0;
                            com.avito.android.str_booking.ui.f fVar6 = fVar5 != null ? fVar5 : null;
                            fVar6.f286015b.c(fVar6.f286014a);
                        } else if (bVar instanceof b.i) {
                            com.avito.android.str_booking.ui.f fVar7 = strBookingFragment.f285872E0;
                            (fVar7 != null ? fVar7 : null).f286019f.accept(a.k.f285793a);
                        } else if (bVar instanceof b.n) {
                            com.avito.android.str_booking.ui.f fVar8 = strBookingFragment.f285872E0;
                            if (fVar8 == null) {
                                fVar8 = null;
                            }
                            UpdatedTimeContent updatedTimeContent = ((b.n) bVar).f285816a;
                            N0 n02 = fVar8.f286022i;
                            if (n02 != null) {
                                ((V0) n02).c(null);
                            }
                            fVar8.f286022i = C43259k.d(androidx.view.N0.a(fVar8.f286019f), null, null, new com.avito.android.str_booking.ui.k(updatedTimeContent, fVar8, null), 3);
                        } else if (bVar instanceof b.o) {
                            com.avito.android.str_booking.ui.f fVar9 = strBookingFragment.f285872E0;
                            if (fVar9 == null) {
                                fVar9 = null;
                            }
                            N0 n03 = fVar9.f286022i;
                            if (n03 != null) {
                                ((V0) n03).c(null);
                            }
                        } else if (bVar instanceof b.m) {
                            com.avito.android.str_booking.ui.f fVar10 = strBookingFragment.f285872E0;
                            com.avito.android.str_booking.ui.f fVar11 = fVar10 != null ? fVar10 : null;
                            AnimationOverlayUrl animationOverlayUrl = ((b.m) bVar).f285815a;
                            fVar11.getClass();
                            com.avito.android.lib.design.animation.animation_overlay.e.b(com.avito.android.lib.design.animation.animation_overlay.e.f178326a, fVar11.f286014a, animationOverlayUrl, 30);
                        } else if (bVar instanceof b.l) {
                            com.avito.android.str_booking.ui.f fVar12 = strBookingFragment.f285872E0;
                            if (fVar12 == null) {
                                fVar12 = null;
                            }
                            com.avito.android.str_booking.domain.c cVar = ((b.l) bVar).f285814a;
                            View view = fVar12.f286014a;
                            RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.str_booking_sections_recycler);
                            MotionLayout motionLayout = view instanceof MotionLayout ? (MotionLayout) view : null;
                            if (motionLayout != null) {
                                motionLayout.setProgress(1.0f);
                            }
                            if (recyclerView2 != null) {
                                RecyclerView.m layoutManager = recyclerView2.getLayoutManager();
                                LinearLayoutManager linearLayoutManager2 = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                                if (linearLayoutManager2 != null) {
                                    f.b bVar3 = fVar12.f286023j;
                                    if (bVar3 != null) {
                                        bVar3.f53878a = cVar.f285573a;
                                        bVar2 = bVar3;
                                    }
                                    linearLayoutManager2.x1(bVar2);
                                }
                            }
                            if (recyclerView2 != null) {
                                com.avito.android.str_booking.ui.g gVar2 = new com.avito.android.str_booking.ui.g(recyclerView2, cVar);
                                recyclerView2.postDelayed(gVar2, 350L);
                                recyclerView2.addOnAttachStateChangeListener(new com.avito.android.str_booking.ui.h(recyclerView2, gVar2));
                            }
                        }
                        G0 g03 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g03;
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
                        return new C42801a(2, this.f285896b, StrBookingFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_booking/mvi/entity/StrBookingOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(StrBookingFragment strBookingFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f285895r = strBookingFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f285895r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f285894q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = StrBookingFragment.f285867G0;
                        StrBookingFragment strBookingFragment = this.f285895r;
                        InterfaceC43160i<com.avito.android.str_booking.mvi.entity.b> events = strBookingFragment.q5().getEvents();
                        C8559a c8559a = new C8559a(strBookingFragment);
                        this.f285894q = 1;
                        if (events.collect(c8559a, this) == coroutine_suspended) {
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
            public a(StrBookingFragment strBookingFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f285890r = strBookingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f285890r, continuation);
                aVar.f285889q = obj;
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
                T t12 = (T) this.f285889q;
                StrBookingFragment strBookingFragment = this.f285890r;
                C43259k.d(t12, null, null, new C8557a(strBookingFragment, null), 3);
                C43259k.d(t12, null, null, new b(strBookingFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return StrBookingFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f285887q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                StrBookingFragment strBookingFragment = StrBookingFragment.this;
                a aVar = new a(strBookingFragment, null);
                this.f285887q = 1;
                if (C23056p0.b(strBookingFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: StrBookingFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Exception, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f285897l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.f285897l = str;
        }

        @Override // Y41.l
        public final G0 invoke(Exception exc) {
            V2.f318762a.j("StrBookingFragment", "openMapInWebView() failed to open uri = " + Uri.parse(this.f285897l), null);
            return G0.f406611a;
        }
    }

    /* compiled from: StrBookingFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/str_booking/ui/ScreenType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<ScreenType> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final ScreenType invoke() {
            String string = StrBookingFragment.this.requireArguments().getString("screen_type", "");
            if (string == null || C43066x.K(string)) {
                string = null;
            }
            if (string == null) {
                throw new IllegalArgumentException("screenType is required");
            }
            ScreenType.f285864b.getClass();
            return ScreenType.a.a(string);
        }
    }

    /* compiled from: StrBookingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/str_booking/mvi/entity/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<com.avito.android.str_booking.mvi.entity.a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.str_booking.mvi.entity.a aVar) {
            a aVar2 = StrBookingFragment.f285867G0;
            StrBookingFragment.this.q5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f285900l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f285900l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f285900l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StrBookingFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f285902l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f285902l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f285902l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f285903l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f285903l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f285903l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f285904l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f285904l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f285904l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrBookingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_booking/ui/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_booking/ui/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<n> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final n invoke() {
            o oVar = StrBookingFragment.this.f285874n0;
            if (oVar == null) {
                oVar = null;
            }
            return (n) oVar.get();
        }
    }

    public StrBookingFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f285877q0 = new O0(m0.f406844a.b(n.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f285873F0 = C42727D.c(new e());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        q5().accept(a.b.f285780a);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        int i12;
        ScreenPerformanceTracker screenPerformanceTracker = this.f285878r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        int iOrdinal = ((ScreenType) this.f285873F0.getValue()).ordinal();
        if (iOrdinal == 0) {
            i12 = R.layout.str_booking_buyer_fragment;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.layout.str_booking_seller_fragment;
        }
        return layoutInflater.inflate(i12, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        q5().accept(a.k.f285793a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        RecyclerView.m layoutManager;
        super.onStop();
        com.avito.android.str_booking.ui.f fVar = this.f285872E0;
        Parcelable parcelableY0 = null;
        if (fVar == null) {
            fVar = null;
        }
        N0 n02 = fVar.f286022i;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        com.avito.android.str_booking.ui.f fVar2 = this.f285872E0;
        if (fVar2 == null) {
            fVar2 = null;
        }
        View view = fVar2.f286014a;
        MotionLayout motionLayout = view instanceof MotionLayout ? (MotionLayout) view : null;
        Float fValueOf = motionLayout != null ? Float.valueOf(motionLayout.getProgress()) : null;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.str_booking_sections_recycler);
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            parcelableY0 = layoutManager.Y0();
        }
        fVar2.f286019f.accept(new a.m(fValueOf, parcelableY0));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.str_booking.ui.delegates.c cVar = this.f285869B0;
        com.avito.android.str_booking.ui.delegates.c cVar2 = cVar != null ? cVar : null;
        com.avito.konveyor.adapter.d dVar = this.f285879s0;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        com.avito.konveyor.adapter.d dVar3 = this.f285880t0;
        com.avito.konveyor.adapter.d dVar4 = dVar3 != null ? dVar3 : null;
        com.avito.android.str_booking.ui.banner.d dVar5 = this.f285881u0;
        com.avito.android.str_booking.ui.banner.d dVar6 = dVar5 != null ? dVar5 : null;
        InterfaceC35075o interfaceC35075o = this.f285868A0;
        InterfaceC35075o interfaceC35075o2 = interfaceC35075o != null ? interfaceC35075o : null;
        n nVarQ5 = q5();
        com.avito.android.str_booking.domain.polling.b bVar = this.f285871D0;
        this.f285872E0 = new com.avito.android.str_booking.ui.f(view, cVar2, dVar2, dVar4, dVar6, nVarQ5, interfaceC35075o2, bVar != null ? bVar : null);
        com.avito.android.lib.util.i iVar = com.avito.android.lib.util.i.f181373a;
        iVar.getClass();
        if (com.avito.android.lib.util.i.f181377e) {
            com.avito.android.lib.util.i.g(iVar, view);
        }
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new c(null), 3);
        com.avito.android.str_booking.ui.delegates.e eVar = this.f285870C0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.a(view);
        View viewFindViewById = view.findViewById(R.id.str_booking_sections_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f285875o0 = (RecyclerView) viewFindViewById;
        requireContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.f285876p0 = linearLayoutManager;
        RecyclerView recyclerView = this.f285875o0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        ScreenPerformanceTracker screenPerformanceTracker = this.f285878r0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @SuppressLint({"HardcodeStringDetector"})
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(StrBookingScreen.f90508d, s.c(this), null, 4, null);
        String string = requireArguments().getString("order_id");
        if (string == null) {
            throw new IllegalArgumentException("orderId is required");
        }
        String string2 = requireArguments().getString("ux_feedback_event_name");
        Bundle bundleRequireArguments = requireArguments();
        AnimationOverlayUrl animationOverlayUrl = (AnimationOverlayUrl) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("start_animation", AnimationOverlayUrl.class) : bundleRequireArguments.getParcelable("start_animation"));
        com.avito.android.str_booking.di.a.a().a(cv.c.b(this), (com.avito.android.str_booking.di.m) C29972i.a(C29972i.b(this), com.avito.android.str_booking.di.m.class), getChildFragmentManager(), c28478k, animationOverlayUrl, string, (ScreenType) this.f285873F0.getValue(), string2, bundle == null, new f()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f285878r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final n q5() {
        return (n) this.f285877q0.getValue();
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void r5(b.g gVar) {
        String str = "https://yandex.com/maps/?ll=" + gVar.f285805a.getLongitude() + ',' + gVar.f285805a.getLatitude() + "&z=17";
        com.avito.android.webview.l lVar = this.f285883w0;
        if (lVar == null) {
            lVar = null;
        }
        C35966w1.g(this, l.a.a(lVar, Uri.parse(str), null, 6), new d(str));
    }
}
