package com.avito.android.messenger_icebreakers_dialog.view;

import Cd.C13243a;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.C22981N;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.statsd.y;
import com.avito.android.di.C29972i;
import com.avito.android.image_loader.d;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.messenger_icebreakers_dialog.MessengerIcebreakerBottomSheetData;
import com.avito.android.messenger_icebreakers_dialog.MessengerIcebreakerDialogResult;
import com.avito.android.messenger_icebreakers_dialog.deeplink.MessengerIcebreakerDialogDeeplink;
import com.avito.android.messenger_icebreakers_dialog.di.b;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import z1.AbstractC50339a;

/* compiled from: MessengerIcebreakerBottomSheetFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/view/MessengerIcebreakerBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerIcebreakerBottomSheetFragment extends BottomSheetDialogFragment implements InterfaceC28477j.b {

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final a f197675q0 = new a(null);

    /* renamed from: f0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger_icebreakers_dialog.f f197676f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final O0 f197677g0;

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f197678h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f197679i0;

    /* renamed from: j0, reason: collision with root package name */
    public final long f197680j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f197681k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f197682l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f197683m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f197684n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.l
    public Chips f197685o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public Input f197686p0;

    /* compiled from: MessengerIcebreakerBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/view/MessengerIcebreakerBottomSheetFragment$a;", "", "<init>", "()V", "", "ARG_DATA", "Ljava/lang/String;", "ARG_LINK", "ARG_REQUEST_KEY", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MessengerIcebreakerBottomSheetFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerBottomSheetData;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<MessengerIcebreakerBottomSheetData> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final MessengerIcebreakerBottomSheetData invoke() {
            MessengerIcebreakerBottomSheetData messengerIcebreakerBottomSheetData;
            Bundle arguments = MessengerIcebreakerBottomSheetFragment.this.getArguments();
            if (arguments != null) {
                messengerIcebreakerBottomSheetData = (MessengerIcebreakerBottomSheetData) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("messenger_icebreaker_data", MessengerIcebreakerBottomSheetData.class) : arguments.getParcelable("messenger_icebreaker_data"));
            } else {
                messengerIcebreakerBottomSheetData = null;
            }
            if (messengerIcebreakerBottomSheetData != null) {
                return messengerIcebreakerBottomSheetData;
            }
            throw new IllegalArgumentException("MessengerIcebreakerBottomSheetData is not provided");
        }
    }

    /* compiled from: MessengerIcebreakerBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/image_loader/d;", "invoke", "()Lcom/avito/android/image_loader/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.android.image_loader.d> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.image_loader.d invoke() {
            return new com.avito.android.image_loader.e().a(MessengerIcebreakerBottomSheetFragment.this.requireContext());
        }
    }

    /* compiled from: MessengerIcebreakerBottomSheetFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<MessengerIcebreakerDialogDeeplink> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final MessengerIcebreakerDialogDeeplink invoke() {
            MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink;
            Bundle arguments = MessengerIcebreakerBottomSheetFragment.this.getArguments();
            if (arguments != null) {
                messengerIcebreakerDialogDeeplink = (MessengerIcebreakerDialogDeeplink) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("messenger_icebreaker_link", MessengerIcebreakerDialogDeeplink.class) : arguments.getParcelable("messenger_icebreaker_link"));
            } else {
                messengerIcebreakerDialogDeeplink = null;
            }
            if (messengerIcebreakerDialogDeeplink != null) {
                return messengerIcebreakerDialogDeeplink;
            }
            throw new IllegalArgumentException("DeepLink is not provided");
        }
    }

    /* compiled from: MessengerIcebreakerBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger_icebreakers_dialog/view/MessengerIcebreakerBottomSheetFragment$e", "Lcom/google/android/material/bottomsheet/h;", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends com.google.android.material.bottomsheet.h {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ MessengerIcebreakerBottomSheetFragment f197690q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ContextThemeWrapper contextThemeWrapper, MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment) {
            super(contextThemeWrapper, 0);
            this.f197690q = messengerIcebreakerBottomSheetFragment;
            this.f356052o = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        }

        @Override // androidx.view.r, android.app.Dialog
        @InterfaceC42830m
        public final void onBackPressed() {
            super.onBackPressed();
            a aVar = MessengerIcebreakerBottomSheetFragment.f197675q0;
            MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment = this.f197690q;
            messengerIcebreakerBottomSheetFragment.getParentFragmentManager().o0(new MessengerIcebreakerDialogResult.OnCancel(messengerIcebreakerBottomSheetFragment.c5()).c(), messengerIcebreakerBottomSheetFragment.d5());
        }
    }

    /* compiled from: MessengerIcebreakerBottomSheetFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ImageView f197691l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MessengerIcebreakerBottomSheetFragment f197692m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ImageView imageView, MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment) {
            super(1);
            this.f197691l = imageView;
            this.f197692m = messengerIcebreakerBottomSheetFragment;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            boolean z12 = str.length() == 0;
            MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment = this.f197692m;
            ImageView imageView = this.f197691l;
            if (z12) {
                imageView.setImageTintList(C35835l0.e(com.avito.android.R.attr.gray36, messengerIcebreakerBottomSheetFragment.requireContext()));
            } else {
                imageView.setImageTintList(C35835l0.e(com.avito.android.R.attr.black, messengerIcebreakerBottomSheetFragment.requireContext()));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MessengerIcebreakerBottomSheetFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<String> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            Bundle arguments = MessengerIcebreakerBottomSheetFragment.this.getArguments();
            String string = arguments != null ? arguments.getString("messenger_icebreaker_request_key") : null;
            if (string != null) {
                return string;
            }
            throw new IllegalArgumentException("Request key is not provided");
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f197694l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f197694l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f197694l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return MessengerIcebreakerBottomSheetFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f197696l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f197696l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f197696l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f197697l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f197697l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f197697l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f197698l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f197698l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f197698l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: MessengerIcebreakerBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/messenger_icebreakers_dialog/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.messenger_icebreakers_dialog.e> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.messenger_icebreakers_dialog.e invoke() {
            com.avito.android.messenger_icebreakers_dialog.f fVar = MessengerIcebreakerBottomSheetFragment.this.f197676f0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.messenger_icebreakers_dialog.e) fVar.get();
        }
    }

    public MessengerIcebreakerBottomSheetFragment() {
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f197677g0 = new O0(m0.f406844a.b(com.avito.android.messenger_icebreakers_dialog.e.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
        com.avito.android.time.c.f301452a.getClass();
        this.f197680j0 = com.avito.android.time.c.f301453b.a();
        this.f197681k0 = C42727D.c(new b());
        this.f197682l0 = C42727D.c(new d());
        this.f197683m0 = C42727D.c(new g());
        this.f197684n0 = C42727D.c(new c());
    }

    public final MessengerIcebreakerBottomSheetData b5() {
        return (MessengerIcebreakerBottomSheetData) this.f197681k0.getValue();
    }

    public final MessengerIcebreakerDialogDeeplink c5() {
        return (MessengerIcebreakerDialogDeeplink) this.f197682l0.getValue();
    }

    public final String d5() {
        return (String) this.f197683m0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.messenger_icebreakers_dialog.di.a.a().a(this, new r(this, Long.valueOf(this.f197680j0), (String) null, 4, (C42822w) null), b5(), (b.a) C29972i.a(C29972i.b(this), b.a.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f197678h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        e eVar = new e(new ContextThemeWrapper(requireContext(), com.avito.android.R.style.MessengerIcebreakerSheet_Theme), this);
        eVar.setCancelable(false);
        eVar.setCanceledOnTouchOutside(false);
        eVar.s().M(false);
        eVar.s().f355974K = false;
        return eVar;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f197678h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(com.avito.android.R.layout.messenger_icebreaker_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f197686p0 = null;
        this.f197685o0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        View decorView;
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        View viewFindViewById2 = view.findViewById(com.avito.android.R.id.messenger_icebreakers_close);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        final int i12 = 0;
        ((ImageView) viewFindViewById2).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.messenger_icebreakers_dialog.view.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MessengerIcebreakerBottomSheetFragment f197701c;

            {
                this.f197701c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment = this.f197701c;
                        Input input = messengerIcebreakerBottomSheetFragment.f197686p0;
                        if (input != null) {
                            K2.d(input, true);
                        }
                        messengerIcebreakerBottomSheetFragment.getParentFragmentManager().o0(new MessengerIcebreakerDialogResult.OnCancel(messengerIcebreakerBottomSheetFragment.c5()).c(), messengerIcebreakerBottomSheetFragment.d5());
                        messengerIcebreakerBottomSheetFragment.requireDialog().cancel();
                        break;
                    case 1:
                        MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment2 = this.f197701c;
                        Input input2 = messengerIcebreakerBottomSheetFragment2.f197686p0;
                        if (input2 != null) {
                            K2.d(input2, true);
                        }
                        messengerIcebreakerBottomSheetFragment2.getParentFragmentManager().o0(new MessengerIcebreakerDialogResult.OnCancel(messengerIcebreakerBottomSheetFragment2.c5()).c(), messengerIcebreakerBottomSheetFragment2.d5());
                        messengerIcebreakerBottomSheetFragment2.requireDialog().cancel();
                        break;
                    default:
                        MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment3 = this.f197701c;
                        InterfaceC28373a interfaceC28373a = messengerIcebreakerBottomSheetFragment3.f197679i0;
                        if (interfaceC28373a == null) {
                            interfaceC28373a = null;
                        }
                        interfaceC28373a.c(new y.a("messengerIcebreakerDialog.phone", 1L));
                        String strD5 = messengerIcebreakerBottomSheetFragment3.d5();
                        MessengerIcebreakerDialogResult.OnPhoneClick onPhoneClick = new MessengerIcebreakerDialogResult.OnPhoneClick(messengerIcebreakerBottomSheetFragment3.c5());
                        FragmentManager parentFragmentManager = messengerIcebreakerBottomSheetFragment3.getParentFragmentManager();
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("messenger_icebreakers_dialog.MessengerIcebreakerDialogResult", onPhoneClick);
                        parentFragmentManager.o0(bundle2, strD5);
                        messengerIcebreakerBottomSheetFragment3.requireDialog().dismiss();
                        break;
                }
            }
        });
        Window window = requireDialog().getWindow();
        if (window != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(R.id.touch_outside)) != null) {
            final int i13 = 1;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.messenger_icebreakers_dialog.view.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ MessengerIcebreakerBottomSheetFragment f197701c;

                {
                    this.f197701c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment = this.f197701c;
                            Input input = messengerIcebreakerBottomSheetFragment.f197686p0;
                            if (input != null) {
                                K2.d(input, true);
                            }
                            messengerIcebreakerBottomSheetFragment.getParentFragmentManager().o0(new MessengerIcebreakerDialogResult.OnCancel(messengerIcebreakerBottomSheetFragment.c5()).c(), messengerIcebreakerBottomSheetFragment.d5());
                            messengerIcebreakerBottomSheetFragment.requireDialog().cancel();
                            break;
                        case 1:
                            MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment2 = this.f197701c;
                            Input input2 = messengerIcebreakerBottomSheetFragment2.f197686p0;
                            if (input2 != null) {
                                K2.d(input2, true);
                            }
                            messengerIcebreakerBottomSheetFragment2.getParentFragmentManager().o0(new MessengerIcebreakerDialogResult.OnCancel(messengerIcebreakerBottomSheetFragment2.c5()).c(), messengerIcebreakerBottomSheetFragment2.d5());
                            messengerIcebreakerBottomSheetFragment2.requireDialog().cancel();
                            break;
                        default:
                            MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment3 = this.f197701c;
                            InterfaceC28373a interfaceC28373a = messengerIcebreakerBottomSheetFragment3.f197679i0;
                            if (interfaceC28373a == null) {
                                interfaceC28373a = null;
                            }
                            interfaceC28373a.c(new y.a("messengerIcebreakerDialog.phone", 1L));
                            String strD5 = messengerIcebreakerBottomSheetFragment3.d5();
                            MessengerIcebreakerDialogResult.OnPhoneClick onPhoneClick = new MessengerIcebreakerDialogResult.OnPhoneClick(messengerIcebreakerBottomSheetFragment3.c5());
                            FragmentManager parentFragmentManager = messengerIcebreakerBottomSheetFragment3.getParentFragmentManager();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("messenger_icebreakers_dialog.MessengerIcebreakerDialogResult", onPhoneClick);
                            parentFragmentManager.o0(bundle2, strD5);
                            messengerIcebreakerBottomSheetFragment3.requireDialog().dismiss();
                            break;
                    }
                }
            });
        }
        Image image = b5().f197522c;
        if (image != null) {
            View viewFindViewById3 = view.findViewById(com.avito.android.R.id.messenger_icebreakers_item_image);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
            }
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById3;
            com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(image);
            C35949t5.c(simpleDraweeView, aVarB, null, null, d.a.a((com.avito.android.image_loader.d) this.f197684n0.getValue(), simpleDraweeView.getContext(), aVarB, null, null, 28), 6);
        }
        Image image2 = b5().f197523d;
        if (image2 != null) {
            com.avito.android.image_loader.a aVarB2 = com.avito.android.image_loader.b.b(image2);
            View viewFindViewById4 = view.findViewById(com.avito.android.R.id.messenger_icebreakers_item_avatar);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
            }
            C35949t5.c((SimpleDraweeView) viewFindViewById4, aVarB2, null, null, null, 14);
        }
        View viewFindViewById5 = view.findViewById(com.avito.android.R.id.messenger_icebreakers_seller_name);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById5).setText(b5().f197525f);
        View viewFindViewById6 = view.findViewById(com.avito.android.R.id.messenger_icebreakers_item_name);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById6).setText(b5().f197524e);
        View viewFindViewById7 = view.findViewById(com.avito.android.R.id.messenger_icebreakers_item_price);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById7).setText(b5().f197527h);
        View viewFindViewById8 = view.findViewById(com.avito.android.R.id.messenger_icebreakers_phone_btn);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        ImageButton imageButton = (ImageButton) viewFindViewById8;
        if (b5().f197526g != null) {
            D6.H(imageButton);
            final int i14 = 2;
            imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.messenger_icebreakers_dialog.view.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ MessengerIcebreakerBottomSheetFragment f197701c;

                {
                    this.f197701c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment = this.f197701c;
                            Input input = messengerIcebreakerBottomSheetFragment.f197686p0;
                            if (input != null) {
                                K2.d(input, true);
                            }
                            messengerIcebreakerBottomSheetFragment.getParentFragmentManager().o0(new MessengerIcebreakerDialogResult.OnCancel(messengerIcebreakerBottomSheetFragment.c5()).c(), messengerIcebreakerBottomSheetFragment.d5());
                            messengerIcebreakerBottomSheetFragment.requireDialog().cancel();
                            break;
                        case 1:
                            MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment2 = this.f197701c;
                            Input input2 = messengerIcebreakerBottomSheetFragment2.f197686p0;
                            if (input2 != null) {
                                K2.d(input2, true);
                            }
                            messengerIcebreakerBottomSheetFragment2.getParentFragmentManager().o0(new MessengerIcebreakerDialogResult.OnCancel(messengerIcebreakerBottomSheetFragment2.c5()).c(), messengerIcebreakerBottomSheetFragment2.d5());
                            messengerIcebreakerBottomSheetFragment2.requireDialog().cancel();
                            break;
                        default:
                            MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment3 = this.f197701c;
                            InterfaceC28373a interfaceC28373a = messengerIcebreakerBottomSheetFragment3.f197679i0;
                            if (interfaceC28373a == null) {
                                interfaceC28373a = null;
                            }
                            interfaceC28373a.c(new y.a("messengerIcebreakerDialog.phone", 1L));
                            String strD5 = messengerIcebreakerBottomSheetFragment3.d5();
                            MessengerIcebreakerDialogResult.OnPhoneClick onPhoneClick = new MessengerIcebreakerDialogResult.OnPhoneClick(messengerIcebreakerBottomSheetFragment3.c5());
                            FragmentManager parentFragmentManager = messengerIcebreakerBottomSheetFragment3.getParentFragmentManager();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("messenger_icebreakers_dialog.MessengerIcebreakerDialogResult", onPhoneClick);
                            parentFragmentManager.o0(bundle2, strD5);
                            messengerIcebreakerBottomSheetFragment3.requireDialog().dismiss();
                            break;
                    }
                }
            });
        }
        View viewFindViewById9 = view.findViewById(com.avito.android.R.id.messenger_icebreakers_buttons);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f197685o0 = (Chips) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(com.avito.android.R.id.messenger_icebreakers_hint);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        View viewFindViewById11 = view.findViewById(com.avito.android.R.id.messenger_icebreakers_input);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(com.avito.android.R.id.messenger_icebreakers_send);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        input.setTouchListener(new Ha1.a(3));
        n.c(input, new f((ImageView) viewFindViewById12, this));
        View viewFindViewById13 = view.findViewById(com.avito.android.R.id.messenger_icebreakers_send);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById13).setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(24, input, this));
        C43259k.d(C22981N.a(getLifecycle()), null, null, new com.avito.android.messenger_icebreakers_dialog.view.b(this, null), 3);
        this.f197686p0 = input;
        int i15 = (int) (requireActivity().getResources().getDisplayMetrics().heightPixels * 0.97d);
        ((com.google.android.material.bottomsheet.h) requireDialog()).s().N(i15, false);
        ((com.google.android.material.bottomsheet.h) requireDialog()).s().f356006l = i15;
        ScreenPerformanceTracker screenPerformanceTracker = this.f197678h0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }
}
