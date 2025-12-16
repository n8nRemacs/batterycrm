package com.avito.android.rating_form.select_item;

import Cd.C13243a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.w;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.RatingFormScreen;
import com.avito.android.rating_form.select_item.di.i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import com.avito.android.util.y6;
import fh0.C40423b;
import fh0.InterfaceC40422a;
import fh0.c;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47312b;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: RatingFormSelectItemFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/select_item/RatingFormSelectItemFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingFormSelectItemFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f248869A0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public static final a f248870z0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.rating_form.select_item.j f248871n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f248872o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f248873p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.responsive.j f248874q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.responsive.e f248875r0;

    /* renamed from: s0, reason: collision with root package name */
    @X41.f
    @Inject
    public boolean f248876s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f248877t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f248878u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public TextView f248879v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f248880w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47312b f248881x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f248882y0;

    /* compiled from: RatingFormSelectItemFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/rating_form/select_item/RatingFormSelectItemFragment$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "", "SEARCH_DEBOUNCE_MS", "J", "", "SUBTITLE_WITH_PRESELECTED_ITEM_BOTTOM_MARGIN", "I", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: RatingFormSelectItemFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.rating_form.select_item.RatingFormSelectItemFragment$a$a, reason: collision with other inner class name */
        public static final class C7474a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ RatingFormSelectItemArguments f248883l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7474a(RatingFormSelectItemArguments ratingFormSelectItemArguments) {
                super(1);
                this.f248883l = ratingFormSelectItemArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key_arguments", this.f248883l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static RatingFormSelectItemFragment a(@Y61.k RatingFormSelectItemArguments ratingFormSelectItemArguments) {
            RatingFormSelectItemFragment ratingFormSelectItemFragment = new RatingFormSelectItemFragment();
            C35966w1.a(ratingFormSelectItemFragment, -1, new C7474a(ratingFormSelectItemArguments));
            return ratingFormSelectItemFragment;
        }

        public a() {
        }
    }

    /* compiled from: RatingFormSelectItemFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<fh0.c, G0> {
        public final void f(@Y61.k fh0.c cVar) {
            f.c cVarB;
            InterfaceC40422a interfaceC40422a;
            RatingFormSelectItemFragment ratingFormSelectItemFragment = (RatingFormSelectItemFragment) this.receiver;
            a aVar = RatingFormSelectItemFragment.f248870z0;
            ratingFormSelectItemFragment.getClass();
            if (cVar instanceof c.a) {
                c.a aVar2 = (c.a) cVar;
                PrintableText printableText = aVar2.f396058c;
                c.a.C3719a c3719a = null;
                String strK0 = printableText != null ? printableText.k0(ratingFormSelectItemFragment.requireContext()) : null;
                if (strK0 != null && (interfaceC40422a = aVar2.f396059d) != null) {
                    c3719a = new c.a.C3719a(strK0, true, null, new com.avito.android.rating_form.select_item.b(ratingFormSelectItemFragment, interfaceC40422a), 4, null);
                }
                View view = ratingFormSelectItemFragment.getView();
                if (view != null) {
                    com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                    PrintableText printableTextC = aVar2.f396056a;
                    if (printableTextC == null) {
                        printableTextC = com.avito.android.printable_text.b.c(R.string.rating_form_error, new Serializable[0]);
                    }
                    PrintableText printableText2 = printableTextC;
                    List listV = C42745f0.V(c3719a);
                    com.avito.android.rating.user_contacts.b bVar = new com.avito.android.rating.user_contacts.b(1, cVar, ratingFormSelectItemFragment);
                    Throwable th2 = aVar2.f396057b;
                    if (th2 != null) {
                        cVarB = new f.c(th2);
                    } else {
                        f.c.f125255c.getClass();
                        cVarB = f.c.a.b();
                    }
                    com.avito.android.component.toast.c.b(cVar2, view, printableText2, null, listV, null, cVarB, 0, ToastBarPosition.f181046d, null, false, false, bVar, null, 2986);
                }
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(fh0.c cVar) {
            f(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: RatingFormSelectItemFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfh0/b;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lfh0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C40423b, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C40423b c40423b) {
            C40423b c40423b2 = c40423b;
            a aVar = RatingFormSelectItemFragment.f248870z0;
            RatingFormSelectItemFragment ratingFormSelectItemFragment = RatingFormSelectItemFragment.this;
            C47313c c47313c = ratingFormSelectItemFragment.f248878u0;
            n<Object>[] nVarArr = RatingFormSelectItemFragment.f248869A0;
            n<Object> nVar = nVarArr[1];
            TextView textView = (TextView) c47313c.a();
            n<Object> nVar2 = nVarArr[1];
            textView.setText(c40423b2.f396049b.k0(((TextView) c47313c.a()).getContext()));
            TextView textView2 = ratingFormSelectItemFragment.f248879v0;
            if (textView2 != null) {
                I5.a(textView2, c40423b2.f396050c, false);
            }
            boolean z12 = c40423b2.f396055h;
            int iB2 = z12 ? y6.b(33) : 0;
            TextView textView3 = ratingFormSelectItemFragment.f248879v0;
            if (textView3 != null) {
                ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                bVar.f44154A = iB2;
                textView3.setLayoutParams(bVar);
            }
            C47313c c47313c2 = ratingFormSelectItemFragment.f248877t0;
            n<Object> nVar3 = nVarArr[0];
            w wVar = ((MotionLayout) c47313c2.a()).f43807b;
            androidx.constraintlayout.widget.d dVarB = wVar == null ? null : wVar.b(R.id.start);
            dVarB.x(R.id.rating_form_search_items_subtitle, 4, iB2);
            n<Object> nVar4 = nVarArr[0];
            ((MotionLayout) c47313c2.a()).G(R.id.start, dVarB);
            n<Object> nVar5 = nVarArr[0];
            ((MotionLayout) c47313c2.a()).requestLayout();
            com.avito.android.recycler.responsive.e eVar = ratingFormSelectItemFragment.f248875r0;
            if (eVar == null) {
                eVar = null;
            }
            eVar.c(new UV0.c(c40423b2.f396051d));
            com.avito.android.recycler.responsive.j jVar = ratingFormSelectItemFragment.f248874q0;
            (jVar != null ? jVar : null).notifyDataSetChanged();
            C47313c c47313c3 = ratingFormSelectItemFragment.f248880w0;
            n<Object> nVar6 = nVarArr[2];
            ((Input) c47313c3.a()).setVisibility(c40423b2.f396053f ? 0 : 8);
            C47313c c47313c4 = ratingFormSelectItemFragment.f248882y0;
            n<Object> nVar7 = nVarArr[4];
            ((Button) c47313c4.a()).setVisibility(z12 ? 0 : 8);
            return G0.f406611a;
        }
    }

    /* compiled from: RatingFormSelectItemFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<String, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = RatingFormSelectItemFragment.f248870z0;
            RatingFormSelectItemFragment.this.q5().accept(new InterfaceC40422a.e(str));
            return G0.f406611a;
        }
    }

    /* compiled from: RatingFormSelectItemFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfh0/a;", "it", "Lkotlin/G0;", "invoke", "(Lfh0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<InterfaceC40422a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC40422a interfaceC40422a) {
            a aVar = RatingFormSelectItemFragment.f248870z0;
            RatingFormSelectItemFragment.this.q5().accept(interfaceC40422a);
            return G0.f406611a;
        }
    }

    /* compiled from: RatingFormSelectItemFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = RatingFormSelectItemFragment.f248870z0;
            RatingFormSelectItemFragment.this.q5().accept(InterfaceC40422a.c.f396043a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f248888l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f248888l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f248888l);
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
            return RatingFormSelectItemFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f248890l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f248890l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f248890l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f248891l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f248891l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f248891l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f248892l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f248892l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f248892l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: RatingFormSelectItemFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/rating_form/select_item/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/rating_form/select_item/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.rating_form.select_item.i> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.rating_form.select_item.i invoke() {
            com.avito.android.rating_form.select_item.j jVar = RatingFormSelectItemFragment.this.f248871n0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.rating_form.select_item.i) jVar.get();
        }
    }

    static {
        Y y12 = new Y(RatingFormSelectItemFragment.class, "container", "getContainer()Landroidx/constraintlayout/motion/widget/MotionLayout;", 0);
        n0 n0Var = m0.f406844a;
        f248869A0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(RatingFormSelectItemFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(RatingFormSelectItemFragment.class, "searchInput", "getSearchInput()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(RatingFormSelectItemFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(RatingFormSelectItemFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f248870z0 = new a(null);
    }

    public RatingFormSelectItemFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f248872o0 = new O0(m0.f406844a.b(com.avito.android.rating_form.select_item.i.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f248877t0 = new C47313c(null, 1, null);
        this.f248878u0 = new C47313c(null, 1, null);
        this.f248880w0 = new C47313c(null, 1, null);
        this.f248881x0 = new C47312b(null, 1, null);
        this.f248882y0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f248873p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f248873p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new b(1, this, RatingFormSelectItemFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemOneTimeEvent;)V", 0), new c());
        return layoutInflater.inflate(this.f248876s0 ? R.layout.fragment_rating_form_select_item_redesign : R.layout.fragment_rating_form_select_item, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        View view = getView();
        if (view != null) {
            K2.d(view, true);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        MotionLayout motionLayout = (MotionLayout) view.findViewById(R.id.rating_form_search_container);
        C47313c c47313c = this.f248877t0;
        n<Object>[] nVarArr = f248869A0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, motionLayout);
        TextView textView = (TextView) view.findViewById(R.id.rating_form_search_items_title);
        C47313c c47313c2 = this.f248878u0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, textView);
        this.f248879v0 = (TextView) view.findViewById(R.id.rating_form_search_items_subtitle);
        Input input = (Input) view.findViewById(R.id.rating_form_search_items_input);
        C47313c c47313c3 = this.f248880w0;
        n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, input);
        n<Object> nVar4 = nVarArr[2];
        Input input2 = (Input) c47313c3.a();
        input2.b(new com.avito.android.rating_form.select_item.a(input2.m53getText(), getViewLifecycleOwner(), new d()));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rating_form_search_items_recycler);
        n<Object> nVar5 = nVarArr[3];
        C47312b c47312b = this.f248881x0;
        c47312b.b(this, recyclerView);
        n<Object> nVar6 = nVarArr[3];
        RecyclerView recyclerView2 = (RecyclerView) c47312b.a();
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        n<Object> nVar7 = nVarArr[3];
        RecyclerView recyclerView3 = (RecyclerView) c47312b.a();
        com.avito.android.recycler.responsive.j jVar = this.f248874q0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView3.setAdapter(jVar);
        Button button = (Button) view.findViewById(R.id.rating_form_search_items_continue_button);
        C47313c c47313c4 = this.f248882y0;
        n<Object> nVar8 = nVarArr[4];
        c47313c4.b(this, button);
        n<Object> nVar9 = nVarArr[4];
        ((Button) c47313c4.a()).setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this, 23));
        ScreenPerformanceTracker screenPerformanceTracker = this.f248873p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        n<Object> nVar10 = nVarArr[3];
        screenPerformanceTracker.b((RecyclerView) c47312b.a());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f248873p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        String str;
        Bundle bundleRequireArguments = requireArguments();
        RatingFormSelectItemArguments ratingFormSelectItemArguments = (RatingFormSelectItemArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key_arguments", RatingFormSelectItemArguments.class) : bundleRequireArguments.getParcelable("key_arguments"));
        if (ratingFormSelectItemArguments == null) {
            throw new IllegalArgumentException("RatingFormSelectItemArguments not set");
        }
        RatingFormArguments ratingFormArguments = ratingFormSelectItemArguments.f248865b;
        RatingFormArguments.RatingSellerArguments ratingSellerArguments = ratingFormArguments instanceof RatingFormArguments.RatingSellerArguments ? (RatingFormArguments.RatingSellerArguments) ratingFormArguments : null;
        if (ratingSellerArguments == null || (str = ratingSellerArguments.f247909b) == null) {
            throw new IllegalArgumentException("fid not set");
        }
        D.f90335a.getClass();
        F fA2 = D.a.a();
        i.a aVarA = com.avito.android.rating_form.select_item.di.a.a();
        RatingFormScreen ratingFormScreen = new RatingFormScreen(null, 1, null);
        r rVarC = s.c(this);
        RatingFormScreen.f247914e.getClass();
        aVarA.a(this, str, ratingFormSelectItemArguments, new C28478k(ratingFormScreen, rVarC, RatingFormScreen.f247916g), ratingFormSelectItemArguments.f248868e, new e(), new f(), (com.avito.android.rating_form.di.g) C29972i.a(C29972i.b(this), com.avito.android.rating_form.di.g.class), (com.avito.android.rating_form.di.e) C29972i.a(C29972i.b(this), com.avito.android.rating_form.di.e.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f248873p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f248873p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final com.avito.android.rating_form.select_item.i q5() {
        return (com.avito.android.rating_form.select_item.i) this.f248872o0.getValue();
    }
}
