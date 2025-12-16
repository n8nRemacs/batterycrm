package com.avito.android.rating_form.step;

import Ca1.ViewOnTouchListenerC13234a;
import Cd.C13243a;
import Xg0.C17007a;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.rating_form.B;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.RatingFormScreen;
import com.avito.android.rating_form.step.di.c;
import com.avito.android.rating_form.step.dialog.BottomSheetDialogFragment;
import com.avito.android.rating_form.step.dialog.DialogInfo;
import com.avito.android.rating_form.step.dialog.FullscreenDialogFragment;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.select.Arguments;
import com.avito.android.suggest_locations.InterfaceC35139d;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.H2;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K2;
import com.avito.android.util.y6;
import hx.InterfaceC41184a;
import ih0.C41404c;
import ih0.InterfaceC41402a;
import ih0.InterfaceC41403b;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import qK0.C47312b;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: RatingFormStepFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/step/RatingFormStepFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/photo_list_view/x;", "Lcom/avito/android/select/p;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingFormStepFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.photo_list_view.x, com.avito.android.select.p {

    /* renamed from: R0, reason: collision with root package name */
    @Y61.k
    public static final a f249120R0;

    /* renamed from: S0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f249121S0;

    /* renamed from: T0, reason: collision with root package name */
    public static final int f249122T0;

    /* renamed from: U0, reason: collision with root package name */
    public static final int f249123U0;

    /* renamed from: V0, reason: collision with root package name */
    public static final int f249124V0;

    /* renamed from: W0, reason: collision with root package name */
    public static final int f249125W0;

    /* renamed from: X0, reason: collision with root package name */
    public static final int f249126X0;

    /* renamed from: Y0, reason: collision with root package name */
    public static final int f249127Y0;

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public InterfaceC35139d f249128A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public InterfaceC41184a f249129B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public com.avito.android.rating_form.step.b f249130C0;

    /* renamed from: D0, reason: collision with root package name */
    @X41.f
    @Inject
    public boolean f249131D0;

    /* renamed from: E0, reason: collision with root package name */
    @X41.f
    @Inject
    public boolean f249132E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final C47313c f249133F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final C47312b f249134G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public final C47313c f249135H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final C47313c f249136I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public final C47313c f249137J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public final C47313c f249138K0;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final C47313c f249139L0;

    /* renamed from: M0, reason: collision with root package name */
    public RatingFormStepArguments f249140M0;

    /* renamed from: N0, reason: collision with root package name */
    public String f249141N0;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.l
    public H2 f249142O0;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.l
    public WeakReference<DialogFragment> f249143P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.k
    public FieldIdentifier f249144Q0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public y f249145n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f249146o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f249147p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f249148q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f249149r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public PhotoPickerIntentFactory f249150s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.rating_form.item.photo_picker.e f249151t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f249152u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_list_view.s f249153v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f249154w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f249155x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f249156y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f249157z0;

    /* compiled from: RatingFormStepFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/rating_form/step/RatingFormStepFragment$a;", "", "<init>", "()V", "", "BUTTON_HEIGHT", "I", "CONTENT_PADDING_HORIZONTAL_DEFAULT", "CONTENT_PADDING_HORIZONTAL_REDESIGN", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "RECYCLER_PADDING_BOTTOM_WITHOUT_DISCLAIMER", "RECYCLER_PADDING_BOTTOM_WITH_DISCLAIMER", "RECYCLER_PADDING_BOTTOM_WITH_REDESIGN_DISCLAIMER", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: RatingFormStepFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.rating_form.step.RatingFormStepFragment$a$a, reason: collision with other inner class name */
        public static final class C7482a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ RatingFormStepArguments f249158l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7482a(RatingFormStepArguments ratingFormStepArguments) {
                super(1);
                this.f249158l = ratingFormStepArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key_arguments", this.f249158l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static RatingFormStepFragment a(@Y61.k RatingFormStepArguments ratingFormStepArguments) {
            RatingFormStepFragment ratingFormStepFragment = new RatingFormStepFragment();
            C35966w1.a(ratingFormStepFragment, -1, new C7482a(ratingFormStepArguments));
            return ratingFormStepFragment;
        }

        public a() {
        }
    }

    /* compiled from: RatingFormStepFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC41403b, G0> {
        public final void f(@Y61.k InterfaceC41403b interfaceC41403b) {
            DialogFragment dialogFragment;
            Dialog dialog;
            DialogFragment dialogFragment2;
            Dialog dialog2;
            RatingFormStepFragment ratingFormStepFragment = (RatingFormStepFragment) this.receiver;
            a aVar = RatingFormStepFragment.f249120R0;
            ratingFormStepFragment.getClass();
            view = null;
            View view = null;
            if (interfaceC41403b instanceof InterfaceC41403b.c) {
                InterfaceC41403b.c cVar = (InterfaceC41403b.c) interfaceC41403b;
                InterfaceC35845m2 interfaceC35845m2 = ratingFormStepFragment.f249157z0;
                C35966w1.g(ratingFormStepFragment, (interfaceC35845m2 != null ? interfaceC35845m2 : null).u(Uri.parse(cVar.f398657a), (6 & 2) == 0, (6 & 4) == 0), new q(ratingFormStepFragment));
                return;
            }
            int i12 = 0;
            if (interfaceC41403b instanceof InterfaceC41403b.f) {
                InterfaceC41403b.f fVar = (InterfaceC41403b.f) interfaceC41403b;
                WeakReference<DialogFragment> weakReference = ratingFormStepFragment.f249143P0;
                if (weakReference == null || (dialogFragment2 = weakReference.get()) == null || (dialog2 = dialogFragment2.getDialog()) == null || !dialog2.isShowing()) {
                    InterfaceC41402a interfaceC41402a = fVar.f398661b;
                    c.a.C3719a c3719a = interfaceC41402a != null ? new c.a.C3719a(ratingFormStepFragment.getString(R.string.rating_form_retry_error), true, null, new r(ratingFormStepFragment, interfaceC41402a), 4, null) : null;
                    boolean z12 = ratingFormStepFragment.f249132E0;
                    PrintableText printableTextC = fVar.f398660a;
                    if (!z12) {
                        com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                        if (printableTextC == null) {
                            printableTextC = com.avito.android.printable_text.b.c(R.string.rating_form_error, new Serializable[0]);
                        }
                        List listV = C42745f0.V(c3719a);
                        f.c.f125255c.getClass();
                        com.avito.android.component.toast.c.c(cVar2, ratingFormStepFragment, printableTextC, null, listV, f.c.a.b(), 0, ToastBarPosition.f181046d, 938);
                        return;
                    }
                    com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
                    View viewFindViewById = ratingFormStepFragment.requireActivity().findViewById(android.R.id.content);
                    if (printableTextC == null) {
                        printableTextC = com.avito.android.printable_text.b.c(R.string.rating_form_error, new Serializable[0]);
                    }
                    List listV2 = C42745f0.V(c3719a);
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar3, viewFindViewById, printableTextC, null, listV2, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4010);
                    return;
                }
                return;
            }
            if (interfaceC41403b instanceof InterfaceC41403b.j) {
                com.avito.android.select.bottom_sheet.c.a(ratingFormStepFragment, ((InterfaceC41403b.j) interfaceC41403b).f398668a).show(ratingFormStepFragment.getParentFragmentManager(), "select_fragment");
                return;
            }
            if (interfaceC41403b instanceof InterfaceC41403b.h) {
                InterfaceC41403b.h hVar = (InterfaceC41403b.h) interfaceC41403b;
                com.avito.android.rating_form.step.b bVar = ratingFormStepFragment.f249130C0;
                if (bVar == null) {
                    bVar = null;
                }
                androidx.view.result.h<Intent> hVar2 = bVar.f249174e;
                if (hVar2 != null) {
                    InterfaceC35139d interfaceC35139d = ratingFormStepFragment.f249128A0;
                    InterfaceC35139d interfaceC35139d2 = interfaceC35139d != null ? interfaceC35139d : null;
                    String str = hVar.f398664a;
                    if (str == null) {
                        str = "";
                    }
                    hVar2.b(interfaceC35139d2.a(null, null, null, str, PublishIntentFactory.LocationPickerChooseButtonLocation.f231992c, null, (32576 & 64) != 0 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b, (32576 & 128) != 0 ? null : null, (32576 & 256) != 0 ? null : hVar.f398665b, (32576 & 2048) != 0 ? null : null, (32576 & 8192) != 0 ? null : null, (32576 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : Boolean.TRUE));
                    return;
                }
                return;
            }
            if (interfaceC41403b instanceof InterfaceC41403b.i) {
                com.avito.android.rating_form.step.b bVar2 = ratingFormStepFragment.f249130C0;
                if (bVar2 == null) {
                    bVar2 = null;
                }
                androidx.view.result.h<Intent> hVar3 = bVar2.f249175f;
                if (hVar3 != null) {
                    InterfaceC41184a interfaceC41184a = ratingFormStepFragment.f249129B0;
                    if (interfaceC41184a == null) {
                        interfaceC41184a = null;
                    }
                    hVar3.b(InterfaceC41184a.C11358a.a(interfaceC41184a, null, null, 7));
                    return;
                }
                return;
            }
            if (interfaceC41403b instanceof InterfaceC41403b.C11386b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = ratingFormStepFragment.f249152u0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC41403b.C11386b) interfaceC41403b).f398656a, null, null, 6);
                return;
            }
            if (interfaceC41403b instanceof InterfaceC41403b.e) {
                DialogInfo dialogInfo = ((InterfaceC41403b.e) interfaceC41403b).f398659a;
                if (dialogInfo.f249346g != DialogInfo.ViewType.f249367b) {
                    RatingFormStepArguments ratingFormStepArguments = ratingFormStepFragment.f249140M0;
                    if (ratingFormStepArguments == null) {
                        ratingFormStepArguments = null;
                    }
                    androidx.fragment.app.H hE2 = ratingFormStepFragment.getParentFragmentManager().e();
                    FullscreenDialogFragment.f249371s0.getClass();
                    hE2.n(R.id.rating_form_fragment_container, FullscreenDialogFragment.a.a(ratingFormStepArguments, dialogInfo), null);
                    hE2.c("auxiliary");
                    hE2.e();
                    return;
                }
                RatingFormStepArguments ratingFormStepArguments2 = ratingFormStepFragment.f249140M0;
                RatingFormStepArguments ratingFormStepArguments3 = ratingFormStepArguments2 != null ? ratingFormStepArguments2 : null;
                WeakReference<DialogFragment> weakReference2 = ratingFormStepFragment.f249143P0;
                if (weakReference2 == null || (dialogFragment = weakReference2.get()) == null || (dialog = dialogFragment.getDialog()) == null || !dialog.isShowing()) {
                    BottomSheetDialogFragment.f249322m0.getClass();
                    BottomSheetDialogFragment bottomSheetDialogFragmentA = BottomSheetDialogFragment.a.a(ratingFormStepArguments3, dialogInfo);
                    ratingFormStepFragment.f249143P0 = new WeakReference<>(bottomSheetDialogFragmentA);
                    bottomSheetDialogFragmentA.show(ratingFormStepFragment.getParentFragmentManager(), "bottom_sheet_dialog");
                    return;
                }
                return;
            }
            if (!(interfaceC41403b instanceof InterfaceC41403b.d)) {
                if (!(interfaceC41403b instanceof InterfaceC41403b.g)) {
                    if (interfaceC41403b instanceof InterfaceC41403b.a) {
                        ratingFormStepFragment.r5().accept(InterfaceC41402a.f.f398631a);
                        return;
                    }
                    return;
                }
                InterfaceC41403b.g gVar = (InterfaceC41403b.g) interfaceC41403b;
                ratingFormStepFragment.f249144Q0 = gVar.f398662a;
                com.avito.android.rating_form.step.b bVar3 = ratingFormStepFragment.f249130C0;
                if (bVar3 == null) {
                    bVar3 = null;
                }
                androidx.view.result.h<Intent> hVar4 = bVar3.f249176g;
                if (hVar4 != null) {
                    InterfaceC35845m2 interfaceC35845m22 = ratingFormStepFragment.f249157z0;
                    hVar4.b((interfaceC35845m22 != null ? interfaceC35845m22 : null).s((String[]) gVar.f398663b.toArray(new String[0])));
                    return;
                }
                return;
            }
            InterfaceC41403b.d dVar = (InterfaceC41403b.d) interfaceC41403b;
            com.avito.konveyor.adapter.j jVar = ratingFormStepFragment.f249148q0;
            if (jVar == null) {
                jVar = null;
            }
            int count = jVar.f338513c.getCount();
            while (true) {
                if (i12 >= count) {
                    break;
                }
                com.avito.android.recycler.data_aware.c cVar4 = ratingFormStepFragment.f249149r0;
                if (cVar4 == null) {
                    cVar4 = null;
                }
                if (cVar4.getItemId(i12) == dVar.f398658a) {
                    RecyclerView.C cP2 = ratingFormStepFragment.q5().P(i12);
                    if (cP2 != null) {
                        view = cP2.itemView;
                    }
                } else {
                    i12++;
                }
            }
            if (view != null) {
                view.requestFocus();
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC41403b interfaceC41403b) {
            f(interfaceC41403b);
            return G0.f406611a;
        }
    }

    /* compiled from: RatingFormStepFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<C41404c, G0> {
        /* JADX WARN: Removed duplicated region for block: B:84:0x01c2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void f(@Y61.k ih0.C41404c r35) {
            /*
                Method dump skipped, instructions count: 574
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.RatingFormStepFragment.c.f(ih0.c):void");
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C41404c c41404c) {
            f(c41404c);
            return G0.f406611a;
        }
    }

    /* compiled from: RatingFormStepFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardShown", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Boolean, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = RatingFormStepFragment.f249120R0;
            RatingFormStepFragment.this.r5().accept(new InterfaceC41402a.m(zBooleanValue));
            return G0.f406611a;
        }
    }

    /* compiled from: RatingFormStepFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/rating_form/step/RatingFormStepFragment$e", "Lcom/avito/android/rating_form/item/file_picker/c;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements com.avito.android.rating_form.item.file_picker.c {
        public e() {
        }

        @Override // com.avito.android.rating_form.item.file_picker.c
        public final void a(@Y61.k FieldIdentifier fieldIdentifier, @Y61.k com.avito.android.rating_form.step.e eVar) {
            a aVar = RatingFormStepFragment.f249120R0;
            RatingFormStepFragment.this.r5().accept(new InterfaceC41402a.s(fieldIdentifier, eVar));
        }

        @Override // com.avito.android.rating_form.item.file_picker.c
        public final void b(@Y61.k FieldIdentifier fieldIdentifier, @Y61.k com.avito.android.rating_form.step.e eVar) {
            a aVar = RatingFormStepFragment.f249120R0;
            RatingFormStepFragment.this.r5().accept(new InterfaceC41402a.g(fieldIdentifier, eVar));
        }
    }

    /* compiled from: RatingFormStepFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lih0/a;", "it", "Lkotlin/G0;", "invoke", "(Lih0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC41402a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC41402a interfaceC41402a) {
            a aVar = RatingFormStepFragment.f249120R0;
            RatingFormStepFragment.this.r5().accept(interfaceC41402a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f249162l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f249162l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f249162l);
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
            return RatingFormStepFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f249164l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f249164l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f249164l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f249165l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f249165l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f249165l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f249166l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f249166l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f249166l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: RatingFormStepFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/rating_form/step/x;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/rating_form/step/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<x> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final x invoke() {
            y yVar = RatingFormStepFragment.this.f249145n0;
            if (yVar == null) {
                yVar = null;
            }
            return (x) yVar.get();
        }
    }

    static {
        Y y12 = new Y(RatingFormStepFragment.class, "contentContainer", "getContentContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0);
        n0 n0Var = m0.f406844a;
        f249121S0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(RatingFormStepFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(RatingFormStepFragment.class, "buttonContainer", "getButtonContainer()Landroid/widget/LinearLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(RatingFormStepFragment.class, "buttonList", "getButtonList()Landroid/widget/LinearLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(RatingFormStepFragment.class, ServiceTransportationWidget.DisclaimerField.TYPE, "getDisclaimer()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(RatingFormStepFragment.class, "disclaimerRedesign", "getDisclaimerRedesign()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(RatingFormStepFragment.class, "finishButton", "getFinishButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f249120R0 = new a(null);
        f249122T0 = y6.b(70);
        f249123U0 = y6.b(100);
        f249124V0 = y6.b(50);
        f249125W0 = y6.b(48);
        f249126X0 = y6.b(24);
        f249127Y0 = y6.b(16);
    }

    public RatingFormStepFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f249146o0 = new O0(m0.f406844a.b(x.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f249133F0 = new C47313c(null, 1, null);
        this.f249134G0 = new C47312b(null, 1, null);
        this.f249135H0 = new C47313c(null, 1, null);
        this.f249136I0 = new C47313c(null, 1, null);
        this.f249137J0 = new C47313c(null, 1, null);
        this.f249138K0 = new C47313c(null, 1, null);
        this.f249139L0 = new C47313c(null, 1, null);
        this.f249144Q0 = new FieldIdentifier(0, null, 3, null);
    }

    @Override // com.avito.android.photo_list_view.x
    public final void A2(int i12, @Y61.l String str, @Y61.l String str2) {
        String str3;
        Context context = getContext();
        if (context == null) {
            return;
        }
        RatingFormStepArguments ratingFormStepArguments = this.f249140M0;
        if (ratingFormStepArguments == null) {
            ratingFormStepArguments = null;
        }
        RatingFormArguments ratingFormArguments = ratingFormStepArguments.f249114b;
        if (ratingFormArguments instanceof RatingFormArguments.RatingModelArguments) {
            str3 = "ratings model images";
        } else {
            if (!(ratingFormArguments instanceof RatingFormArguments.RatingSellerArguments)) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = "ratings seller images";
        }
        String str4 = str3;
        PhotoPickerIntentFactory.PhotoPickerMode modeAdd = str == null ? new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null) : new PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit(false, false, false, 7, null);
        PhotoPickerIntentFactory photoPickerIntentFactory = this.f249150s0;
        PhotoPickerIntentFactory photoPickerIntentFactory2 = photoPickerIntentFactory != null ? photoPickerIntentFactory : null;
        String str5 = this.f249141N0;
        String str6 = str5 == null ? null : str5;
        com.avito.android.photo_list_view.s sVar = this.f249153v0;
        if (sVar == null) {
            sVar = null;
        }
        Intent intentA = PhotoPickerIntentFactory.a.a(photoPickerIntentFactory2, context, str6, str4, 0, sVar.getF218336k(), str, null, modeAdd, false, 328);
        com.avito.android.rating_form.step.b bVar = this.f249130C0;
        androidx.view.result.h<Intent> hVar = (bVar != null ? bVar : null).f249173d;
        if (hVar != null) {
            hVar.b(intentA);
        }
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        r5().accept(new InterfaceC41402a.x(str, list, str2));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f249147p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f249147p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, r5(), new b(1, this, RatingFormStepFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepOneTimeEvent;)V", 0), new c(1, this, RatingFormStepFragment.class, "render", "render(Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepState;)V", 0));
        return layoutInflater.inflate(R.layout.fragment_rating_form_step, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        H2 h22 = this.f249142O0;
        if (h22 != null) {
            h22.dispose();
        }
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.rating_form_step_content_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        C47313c c47313c = this.f249133F0;
        kotlin.reflect.n<Object>[] nVarArr = f249121S0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, (ConstraintLayout) viewFindViewById);
        int i12 = this.f249131D0 ? f249127Y0 : f249126X0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        ConstraintLayout constraintLayout = (ConstraintLayout) c47313c.a();
        constraintLayout.setPadding(i12, constraintLayout.getPaddingTop(), i12, constraintLayout.getPaddingBottom());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rating_form_step_recycler);
        kotlin.reflect.n<Object> nVar3 = nVarArr[1];
        this.f249134G0.b(this, recyclerView);
        RecyclerView recyclerViewQ5 = q5();
        getContext();
        recyclerViewQ5.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerViewQ52 = q5();
        com.avito.konveyor.adapter.j jVar = this.f249148q0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerViewQ52.setAdapter(jVar);
        RecyclerView recyclerViewQ53 = q5();
        com.avito.konveyor.a aVar = this.f249156y0;
        if (aVar == null) {
            aVar = null;
        }
        recyclerViewQ53.l(new C17007a(aVar), -1);
        q5().setItemAnimator(null);
        q5().setOnTouchListener(new ViewOnTouchListenerC13234a(this, 12));
        ScreenPerformanceTracker screenPerformanceTracker = this.f249147p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(q5());
        int iB2 = this.f249132E0 ? y6.b(16) : y6.b(24);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.rating_form_step_button_container);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), iB2);
        C47313c c47313c2 = this.f249135H0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[2];
        c47313c2.b(this, linearLayout);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        kotlin.reflect.n<Object> nVar5 = nVarArr[0];
        dVar.g((ConstraintLayout) c47313c.a());
        if (this.f249132E0) {
            dVar.j(R.id.rating_form_step_recycler, 4, R.id.rating_form_step_button_container, 3, y6.b(16));
        } else {
            dVar.f(R.id.rating_form_step_button_container, 3);
        }
        kotlin.reflect.n<Object> nVar6 = nVarArr[0];
        dVar.c((ConstraintLayout) c47313c.a());
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.rating_form_step_button_list);
        C47313c c47313c3 = this.f249136I0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[3];
        c47313c3.b(this, linearLayout2);
        TextView textView = (TextView) view.findViewById(R.id.rating_form_step_disclaimer);
        C47313c c47313c4 = this.f249137J0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[4];
        c47313c4.b(this, textView);
        kotlin.reflect.n<Object> nVar9 = nVarArr[4];
        ((TextView) c47313c4.a()).setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = (TextView) view.findViewById(R.id.rating_form_step_disclaimer_redesign);
        C47313c c47313c5 = this.f249138K0;
        kotlin.reflect.n<Object> nVar10 = nVarArr[5];
        c47313c5.b(this, textView2);
        kotlin.reflect.n<Object> nVar11 = nVarArr[5];
        ((TextView) c47313c5.a()).setMovementMethod(LinkMovementMethod.getInstance());
        Button button = (Button) view.findViewById(R.id.rating_form_step_finish_button);
        C47313c c47313c6 = this.f249139L0;
        kotlin.reflect.n<Object> nVar12 = nVarArr[6];
        c47313c6.b(this, button);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f249147p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        this.f249142O0 = K2.a(requireActivity(), new d());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle bundleRequireArguments = requireArguments();
        RatingFormStepArguments ratingFormStepArguments = (RatingFormStepArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key_arguments", RatingFormStepArguments.class) : bundleRequireArguments.getParcelable("key_arguments"));
        if (ratingFormStepArguments == null) {
            throw new IllegalArgumentException("RatingFormStepArguments not set");
        }
        this.f249140M0 = ratingFormStepArguments;
        this.f249141N0 = B.b(ratingFormStepArguments.f249115c, ratingFormStepArguments.f249116d);
        D.f90335a.getClass();
        F fA2 = D.a.a();
        c.a aVarA = com.avito.android.rating_form.step.di.a.a();
        S0 f42820b = getF42820b();
        RatingFormStepArguments ratingFormStepArguments2 = this.f249140M0;
        if (ratingFormStepArguments2 == null) {
            ratingFormStepArguments2 = null;
        }
        String str = this.f249141N0;
        String str2 = str == null ? null : str;
        RatingFormStepArguments ratingFormStepArguments3 = this.f249140M0;
        if (ratingFormStepArguments3 == null) {
            ratingFormStepArguments3 = null;
        }
        RatingFormScreen ratingFormScreen = new RatingFormScreen(ratingFormStepArguments3.f249117e);
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        RatingFormScreen.f247914e.getClass();
        C28478k c28478k = new C28478k(ratingFormScreen, rVarC, RatingFormScreen.f247915f);
        RatingFormStepArguments ratingFormStepArguments4 = this.f249140M0;
        if (ratingFormStepArguments4 == null) {
            ratingFormStepArguments4 = null;
        }
        aVarA.a(f42820b, ratingFormStepArguments2, this, str2, c28478k, ratingFormStepArguments4.f249118f, new f(), new e(), new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 17), new com.avito.android.auction.details.i(this, 12), requireContext().getContentResolver(), (com.avito.android.rating_form.di.g) C29972i.a(C29972i.b(this), com.avito.android.rating_form.di.g.class), cv.c.b(this), (com.avito.android.rating_form.step.di.d) C29972i.a(C29972i.b(this), com.avito.android.rating_form.step.di.d.class), (com.avito.android.rating_form.di.e) C29972i.a(C29972i.b(this), com.avito.android.rating_form.di.e.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f249147p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f249147p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
    }

    public final RecyclerView q5() {
        kotlin.reflect.n<Object> nVar = f249121S0[1];
        return (RecyclerView) this.f249134G0.a();
    }

    public final x r5() {
        return (x) this.f249146o0.getValue();
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
