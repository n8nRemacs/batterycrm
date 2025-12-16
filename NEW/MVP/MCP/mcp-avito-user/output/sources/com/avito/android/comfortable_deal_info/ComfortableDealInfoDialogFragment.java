package com.avito.android.comfortable_deal_info;

import VU.b;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.comfortable_deal_info.ComfortableDealInfoDialogFragment;
import com.avito.android.comfortable_deal_info.dto.Action;
import com.avito.android.comfortable_deal_info.dto.Screen;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.bottom_sheet.q;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.lib.design.floating_container.a;
import com.avito.android.lib.design.floating_container.b;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import md.InterfaceC44055a;
import uq.C49096b;
import uq.C49098d;

/* compiled from: ComfortableDealInfoDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/comfortable_deal_info/ComfortableDealInfoDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lmd/a;", "Lcom/avito/android/comfortable_deal_info/di/e;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_comfortable-deal-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes12.dex */
public final class ComfortableDealInfoDialogFragment extends BaseDialogFragment implements InterfaceC44055a<com.avito.android.comfortable_deal_info.di.e>, InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.comfortable_deal_info.f f123437h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public C49096b f123438i0;

    /* renamed from: j0, reason: collision with root package name */
    public com.avito.android.comfortable_deal_info.di.e f123439j0;

    /* renamed from: k0, reason: collision with root package name */
    @k
    public final C35968w3 f123440k0;

    /* renamed from: l0, reason: collision with root package name */
    @l
    public b f123441l0;

    /* renamed from: m0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f123442m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f123443n0;

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f123436p0 = {m0.f406844a.e(new Y(ComfortableDealInfoDialogFragment.class, "openParams", "getOpenParams()Lcom/avito/android/comfortable_deal_info/ComfortableDealInfoDialogParams;", 0))};

    /* renamed from: o0, reason: collision with root package name */
    @k
    public static final a f123435o0 = new a(null);

    /* compiled from: ComfortableDealInfoDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal_info/ComfortableDealInfoDialogFragment$a;", "", "<init>", "()V", "_avito_comfortable-deal-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ComfortableDealInfoDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/comfortable_deal_info/ComfortableDealInfoDialogFragment$b", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_comfortable-deal-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.lib.design.bottom_sheet.d {
        public b(Context context) {
            super(context, R.style.Re23_BottomSheet_Default);
        }

        @Override // androidx.view.r, android.app.Dialog
        @SuppressLint({"MissingSuperCall"})
        public final void onBackPressed() {
            a aVar = ComfortableDealInfoDialogFragment.f123435o0;
            ComfortableDealInfoDialogFragment comfortableDealInfoDialogFragment = ComfortableDealInfoDialogFragment.this;
            Screen screen = (Screen) C42745f0.K(comfortableDealInfoDialogFragment.f123443n0, comfortableDealInfoDialogFragment.f5().f123450b);
            String str = screen != null ? screen.f123488e : null;
            C49096b c49096b = comfortableDealInfoDialogFragment.f123438i0;
            if (c49096b == null) {
                c49096b = null;
            }
            c49096b.a(str);
            com.avito.android.comfortable_deal_info.f fVar = comfortableDealInfoDialogFragment.f123437h0;
            (fVar != null ? fVar : null).dismiss();
        }
    }

    /* compiled from: ComfortableDealInfoDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Bundle f123445l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ComfortableDealInfoDialogFragment f123446m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bundle bundle, ComfortableDealInfoDialogFragment comfortableDealInfoDialogFragment) {
            super(1);
            this.f123445l = bundle;
            this.f123446m = comfortableDealInfoDialogFragment;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            if (this.f123445l == null) {
                ComfortableDealInfoDialogFragment comfortableDealInfoDialogFragment = this.f123446m;
                com.avito.android.comfortable_deal_info.f fVar = comfortableDealInfoDialogFragment.f123437h0;
                if (fVar == null) {
                    fVar = null;
                }
                fVar.a(comfortableDealInfoDialogFragment.f5().f123451c);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ComfortableDealInfoDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f123447l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            return G0.f406611a;
        }
    }

    /* compiled from: ComfortableDealInfoDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = ComfortableDealInfoDialogFragment.f123435o0;
            ComfortableDealInfoDialogFragment comfortableDealInfoDialogFragment = ComfortableDealInfoDialogFragment.this;
            Screen screen = (Screen) C42745f0.K(comfortableDealInfoDialogFragment.f123443n0, comfortableDealInfoDialogFragment.f5().f123450b);
            String str = screen != null ? screen.f123488e : null;
            C49096b c49096b = comfortableDealInfoDialogFragment.f123438i0;
            (c49096b != null ? c49096b : null).a(str);
            return G0.f406611a;
        }
    }

    /* compiled from: ComfortableDealInfoDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<Integer, G0> {
        public final void f(int i12) {
            Window window;
            View decorView;
            final ComfortableDealInfoDialogFragment comfortableDealInfoDialogFragment = (ComfortableDealInfoDialogFragment) this.receiver;
            comfortableDealInfoDialogFragment.f123443n0 = i12;
            b bVar = comfortableDealInfoDialogFragment.f123441l0;
            if (bVar == null || (window = bVar.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            ImageButton imageButton = (ImageButton) decorView.findViewById(R.id.back_button);
            TextView textView = (TextView) decorView.findViewById(R.id.screen_indicator);
            ImageButton imageButton2 = (ImageButton) decorView.findViewById(R.id.close_button);
            FloatingContainer floatingContainer = (FloatingContainer) decorView.findViewById(R.id.comfortable_deal_info_footer);
            if (imageButton != null) {
                imageButton.setVisibility(comfortableDealInfoDialogFragment.f123443n0 == 0 ? 8 : 0);
                final int i13 = 1;
                imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.comfortable_deal_info.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ComfortableDealInfoDialogFragment comfortableDealInfoDialogFragment2 = comfortableDealInfoDialogFragment;
                        switch (i13) {
                            case 0:
                                ComfortableDealInfoDialogFragment.a aVar = ComfortableDealInfoDialogFragment.f123435o0;
                                Screen screen = (Screen) C42745f0.K(comfortableDealInfoDialogFragment2.f123443n0, comfortableDealInfoDialogFragment2.f5().f123450b);
                                String str = screen != null ? screen.f123488e : null;
                                C49096b c49096b = comfortableDealInfoDialogFragment2.f123438i0;
                                if (c49096b == null) {
                                    c49096b = null;
                                }
                                c49096b.a(str);
                                f fVar = comfortableDealInfoDialogFragment2.f123437h0;
                                (fVar != null ? fVar : null).dismiss();
                                break;
                            default:
                                ComfortableDealInfoDialogFragment.a aVar2 = ComfortableDealInfoDialogFragment.f123435o0;
                                Screen screen2 = (Screen) C42745f0.K(comfortableDealInfoDialogFragment2.f123443n0, comfortableDealInfoDialogFragment2.f5().f123450b);
                                String str2 = screen2 != null ? screen2.f123488e : null;
                                Screen screen3 = (Screen) C42745f0.K(comfortableDealInfoDialogFragment2.f123443n0 - 1, comfortableDealInfoDialogFragment2.f5().f123450b);
                                String str3 = screen3 != null ? screen3.f123488e : null;
                                C49096b c49096b2 = comfortableDealInfoDialogFragment2.f123438i0;
                                if (c49096b2 == null) {
                                    c49096b2 = null;
                                }
                                c49096b2.getClass();
                                if (str2 != null && str3 != null) {
                                    c49096b2.f440300a.c(new C49098d(str2, str3));
                                }
                                f fVar2 = comfortableDealInfoDialogFragment2.f123437h0;
                                (fVar2 != null ? fVar2 : null).b(comfortableDealInfoDialogFragment2.f123443n0 - 1);
                                break;
                        }
                    }
                });
            }
            if (textView != null) {
                textView.setText(comfortableDealInfoDialogFragment.getString(R.string.comfortable_deal_info_screen_position, Integer.valueOf(comfortableDealInfoDialogFragment.f123443n0 + 1), Integer.valueOf(comfortableDealInfoDialogFragment.f5().f123450b.size())));
            }
            if (imageButton2 != null) {
                final int i14 = 0;
                imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.comfortable_deal_info.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ComfortableDealInfoDialogFragment comfortableDealInfoDialogFragment2 = comfortableDealInfoDialogFragment;
                        switch (i14) {
                            case 0:
                                ComfortableDealInfoDialogFragment.a aVar = ComfortableDealInfoDialogFragment.f123435o0;
                                Screen screen = (Screen) C42745f0.K(comfortableDealInfoDialogFragment2.f123443n0, comfortableDealInfoDialogFragment2.f5().f123450b);
                                String str = screen != null ? screen.f123488e : null;
                                C49096b c49096b = comfortableDealInfoDialogFragment2.f123438i0;
                                if (c49096b == null) {
                                    c49096b = null;
                                }
                                c49096b.a(str);
                                f fVar = comfortableDealInfoDialogFragment2.f123437h0;
                                (fVar != null ? fVar : null).dismiss();
                                break;
                            default:
                                ComfortableDealInfoDialogFragment.a aVar2 = ComfortableDealInfoDialogFragment.f123435o0;
                                Screen screen2 = (Screen) C42745f0.K(comfortableDealInfoDialogFragment2.f123443n0, comfortableDealInfoDialogFragment2.f5().f123450b);
                                String str2 = screen2 != null ? screen2.f123488e : null;
                                Screen screen3 = (Screen) C42745f0.K(comfortableDealInfoDialogFragment2.f123443n0 - 1, comfortableDealInfoDialogFragment2.f5().f123450b);
                                String str3 = screen3 != null ? screen3.f123488e : null;
                                C49096b c49096b2 = comfortableDealInfoDialogFragment2.f123438i0;
                                if (c49096b2 == null) {
                                    c49096b2 = null;
                                }
                                c49096b2.getClass();
                                if (str2 != null && str3 != null) {
                                    c49096b2.f440300a.c(new C49098d(str2, str3));
                                }
                                f fVar2 = comfortableDealInfoDialogFragment2.f123437h0;
                                (fVar2 != null ? fVar2 : null).b(comfortableDealInfoDialogFragment2.f123443n0 - 1);
                                break;
                        }
                    }
                });
            }
            if (floatingContainer != null) {
                ViewParent parent = floatingContainer.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                }
                ViewParent parent2 = floatingContainer.getParent();
                ViewParent parent3 = parent2 != null ? parent2.getParent() : null;
                ViewGroup viewGroup2 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                }
                Screen screen = (Screen) C42745f0.K(comfortableDealInfoDialogFragment.f123443n0, comfortableDealInfoDialogFragment.f5().f123450b);
                if (screen == null) {
                    return;
                }
                b.a aVar = com.avito.android.lib.design.floating_container.b.f179184i;
                InterfaceC42726C interfaceC42726C = comfortableDealInfoDialogFragment.f123442m0;
                Context context = (Context) interfaceC42726C.getValue();
                int iJ2 = C35835l0.j(R.attr.floatingContainerOneButtonPrimary, (Context) interfaceC42726C.getValue());
                aVar.getClass();
                com.avito.android.lib.design.floating_container.b bVarB = b.a.b(iJ2, context);
                b.a aVar2 = VU.b.f17147t;
                Context context2 = (Context) interfaceC42726C.getValue();
                Action action = screen.f123487d;
                String str = action.f123484c;
                aVar2.getClass();
                floatingContainer.setStyle(com.avito.android.lib.design.floating_container.b.a(bVarB, new b.AbstractC5272b.a(b.a.b(context2, str)), y6.b(34), y6.b(10), y6.b(10), 240));
                floatingContainer.setState(new com.avito.android.lib.design.floating_container.a(new a.AbstractC5270a.b(new UU.a(action.f123483b, null, false, false, false, new com.avito.android.comfortable_deal_info.b(comfortableDealInfoDialogFragment), null, null, null, false, 990, null))));
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Integer num) {
            f(num.intValue());
            return G0.f406611a;
        }
    }

    /* compiled from: ComfortableDealInfoDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<Context> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Context invoke() {
            return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, ComfortableDealInfoDialogFragment.this.requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Dialog_Re23));
        }
    }

    public ComfortableDealInfoDialogFragment() {
        super(0, 1, null);
        this.f123440k0 = new C35968w3(this);
        this.f123442m0 = C42727D.c(new g());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.comfortable_deal_info.di.e eVarA = com.avito.android.comfortable_deal_info.di.h.a().a((com.avito.android.comfortable_deal_info.di.d) C29972i.a(C29972i.b(this), com.avito.android.comfortable_deal_info.di.d.class), f5(), this, new f(1, this, ComfortableDealInfoDialogFragment.class, "onScreenChanged", "onScreenChanged(I)V", 0));
        this.f123439j0 = eVarA;
        eVarA.a(this);
    }

    public final ComfortableDealInfoDialogParams f5() {
        return (ComfortableDealInfoDialogParams) this.f123440k0.getValue(this, f123436p0[0]);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        b bVar = new b((Context) this.f123442m0.getValue());
        this.f123441l0 = bVar;
        bVar.T();
        bVar.setCanceledOnTouchOutside(true);
        bVar.S(y6.b(630));
        bVar.K(true);
        View viewInflate = bVar.getLayoutInflater().inflate(R.layout.comfortable_deal_info_overlay_header, (ViewGroup) null);
        bVar.f178524r = viewInflate;
        q qVar = bVar.f178530x;
        if (qVar != null) {
            qVar.B(viewInflate);
        }
        View viewFindViewById = viewInflate.findViewById(R.id.thumb);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        D6.G((ImageView) viewFindViewById, !((Context) r0.getValue()).getResources().getBoolean(R.bool.is_tablet));
        bVar.B(R.layout.fragment_container, R.layout.comfortable_deal_info_dialog_footer, new c(bundle, this), d.f123447l, true);
        bVar.R(new e());
        return bVar;
    }

    @Override // md.InterfaceC44055a
    public final com.avito.android.comfortable_deal_info.di.e r0() {
        com.avito.android.comfortable_deal_info.di.e eVar = this.f123439j0;
        if (eVar == null) {
            return null;
        }
        return eVar;
    }
}
