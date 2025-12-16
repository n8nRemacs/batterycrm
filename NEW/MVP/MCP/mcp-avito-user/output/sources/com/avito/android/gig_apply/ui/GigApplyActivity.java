package com.avito.android.gig_apply.ui;

import Cd.C13243a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.gig_apply.ui.GigApplyErrorDialogFragment;
import com.avito.android.gig_snippet.GigSingleSnippetWidget;
import com.avito.android.gig_timer_widget.GigApplyButtonTimerView;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35961v3;
import com.avito.android.util.I5;
import java.io.Serializable;
import java.util.Date;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import pH.AbstractC46955c;
import pH.C46956d;
import z1.AbstractC50339a;

/* compiled from: GigApplyActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_apply/ui/GigApplyActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigApplyActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f159825y = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.gig_apply.mvi.m f159826m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f159827n = new O0(m0.f406844a.b(com.avito.android.gig_apply.mvi.l.class), new d(), new c(new f()), new e());

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Object f159828o = C35961v3.a(this);

    /* renamed from: p, reason: collision with root package name */
    public NavBar f159829p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f159830q;

    /* renamed from: r, reason: collision with root package name */
    public ViewGroup f159831r;

    /* renamed from: s, reason: collision with root package name */
    public ViewGroup f159832s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f159833t;

    /* renamed from: u, reason: collision with root package name */
    public GigApplyButtonTimerView f159834u;

    /* renamed from: v, reason: collision with root package name */
    public ProgressBar f159835v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f159836w;

    /* renamed from: x, reason: collision with root package name */
    public GigSingleSnippetWidget f159837x;

    /* compiled from: GigApplyActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<AbstractC46955c, G0> {
        @Override // Y41.l
        public final G0 invoke(AbstractC46955c abstractC46955c) {
            AbstractC46955c abstractC46955c2 = abstractC46955c;
            GigApplyActivity gigApplyActivity = (GigApplyActivity) this.receiver;
            int i12 = GigApplyActivity.f159825y;
            gigApplyActivity.getClass();
            if (abstractC46955c2 instanceof AbstractC46955c.b) {
                GigApplyErrorDialogFragment.a aVar = GigApplyErrorDialogFragment.f159842l0;
                AbstractC46955c.b bVar = (AbstractC46955c.b) abstractC46955c2;
                String str = bVar.f428315c;
                GigApplyErrorOpenParams gigApplyErrorOpenParams = new GigApplyErrorOpenParams(bVar.f428313a, bVar.f428314b, str, bVar.f428316d);
                aVar.getClass();
                GigApplyErrorDialogFragment gigApplyErrorDialogFragment = new GigApplyErrorDialogFragment();
                gigApplyErrorDialogFragment.f159844h0.setValue(gigApplyErrorDialogFragment, GigApplyErrorDialogFragment.f159843m0[0], gigApplyErrorOpenParams);
                gigApplyErrorDialogFragment.show(gigApplyActivity.getSupportFragmentManager(), "ERROR_SHEET");
            } else if (abstractC46955c2 instanceof AbstractC46955c.C12260c) {
                a.i.C4057a.d(gigApplyActivity.P1(), com.avito.android.printable_text.b.c(R.string.gig_apply_error, new Serializable[0]), null, null, new f.c(new IllegalStateException("Gig apply request error")), 0, null, null, null, 2030);
            } else if (abstractC46955c2 instanceof AbstractC46955c.a) {
                gigApplyActivity.setResult(-1);
                gigApplyActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GigApplyActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<C46956d, G0> {
        public final void f(@Y61.k C46956d c46956d) {
            String str;
            GigApplyActivity gigApplyActivity = (GigApplyActivity) this.receiver;
            int i12 = GigApplyActivity.f159825y;
            gigApplyActivity.getClass();
            LinearLayout linearLayout = gigApplyActivity.f159830q;
            SpannableString spannableString = null;
            if (linearLayout == null) {
                linearLayout = null;
            }
            linearLayout.removeAllViews();
            for (AttributedText attributedText : c46956d.f428319b) {
                TextView textView = new TextView(gigApplyActivity);
                textView.setTextAppearance(R.style.Re23_Text_M10);
                com.avito.android.util.text.j.a(textView, attributedText, null);
                LinearLayout linearLayout2 = gigApplyActivity.f159830q;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                linearLayout2.addView(textView);
            }
            TextView textView2 = gigApplyActivity.f159833t;
            if (textView2 == null) {
                textView2 = null;
            }
            I5.a(textView2, c46956d.f428329l, false);
            Date date = c46956d.f428330m;
            if (date != null) {
                long time = date.getTime();
                GigApplyButtonTimerView gigApplyButtonTimerView = gigApplyActivity.f159834u;
                if (gigApplyButtonTimerView == null) {
                    gigApplyButtonTimerView = null;
                }
                gigApplyButtonTimerView.setTimer(time);
            }
            if (c46956d.f428333p) {
                ViewGroup viewGroup = gigApplyActivity.f159832s;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                viewGroup.setClickable(true);
                TextView textView3 = gigApplyActivity.f159833t;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setTextColor(C35835l0.d(R.attr.white, gigApplyActivity));
            } else {
                ViewGroup viewGroup2 = gigApplyActivity.f159832s;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                viewGroup2.setClickable(false);
                TextView textView4 = gigApplyActivity.f159833t;
                if (textView4 == null) {
                    textView4 = null;
                }
                textView4.setTextColor(C35835l0.d(R.attr.whiteAlpha70, gigApplyActivity));
            }
            ProgressBar progressBar = gigApplyActivity.f159835v;
            if (progressBar == null) {
                progressBar = null;
            }
            boolean z12 = c46956d.f428318a;
            progressBar.setVisibility(z12 ? 0 : 8);
            TextView textView5 = gigApplyActivity.f159833t;
            if (textView5 == null) {
                textView5 = null;
            }
            textView5.setVisibility(!z12 ? 0 : 8);
            GigApplyButtonTimerView gigApplyButtonTimerView2 = gigApplyActivity.f159834u;
            if (gigApplyButtonTimerView2 == null) {
                gigApplyButtonTimerView2 = null;
            }
            gigApplyButtonTimerView2.setVisibility(z12 ? 8 : 0);
            ViewGroup viewGroup3 = gigApplyActivity.f159832s;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            viewGroup3.setEnabled(!z12);
            GigSingleSnippetWidget gigSingleSnippetWidget = gigApplyActivity.f159837x;
            (gigSingleSnippetWidget == null ? null : gigSingleSnippetWidget).a(c46956d.f428327j, c46956d.f428326i, c46956d.f428322e, c46956d.f428325h, c46956d.f428324g, c46956d.f428330m, c46956d.f428331n, c46956d.f428332o);
            GigSingleSnippetWidget gigSingleSnippetWidget2 = gigApplyActivity.f159837x;
            if (gigSingleSnippetWidget2 == null) {
                gigSingleSnippetWidget2 = null;
            }
            gigSingleSnippetWidget2.setOnTimerFinishListener(new C30722a(gigApplyActivity));
            TextView textView6 = gigApplyActivity.f159836w;
            if (textView6 == null) {
                textView6 = null;
            }
            textView6.setMovementMethod(new LinkMovementMethod());
            TextView textView7 = gigApplyActivity.f159836w;
            if (textView7 == null) {
                textView7 = null;
            }
            String str2 = c46956d.f428320c;
            if (str2 != null && (str = c46956d.f428321d) != null) {
                String string = gigApplyActivity.getString(R.string.apply_shift_disclaimer_without_link);
                String string2 = gigApplyActivity.getString(R.string.apply_shift_disclaimer_with_disclaimer_link);
                String string3 = gigApplyActivity.getString(R.string.apply_info_disclaimer_concatenation);
                String string4 = gigApplyActivity.getString(R.string.apply_shift_disclaimer_with_promotion_link);
                C30724c c30724c = new C30724c(gigApplyActivity, str2);
                C30728d c30728d = new C30728d(gigApplyActivity, str);
                int length = string.length() + 1;
                int length2 = string2.length() + length;
                int length3 = string3.length() + length2 + 2;
                int length4 = string4.length() + length3;
                SpannableString spannableString2 = new SpannableString(string + ' ' + string2 + (char) 160 + string3 + (char) 160 + string4);
                spannableString2.setSpan(c30724c, length, length2, 33);
                spannableString2.setSpan(c30728d, length3, length4, 33);
                spannableString = spannableString2;
            }
            I5.a(textView7, spannableString, false);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C46956d c46956d) {
            f(c46956d);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f159838l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f159838l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f159838l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<S0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return GigApplyActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<AbstractC50339a> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return GigApplyActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: GigApplyActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/gig_apply/mvi/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/gig_apply/mvi/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<com.avito.android.gig_apply.mvi.l> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.gig_apply.mvi.l invoke() {
            com.avito.android.gig_apply.mvi.m mVar = GigApplyActivity.this.f159826m;
            if (mVar == null) {
                mVar = null;
            }
            return (com.avito.android.gig_apply.mvi.l) mVar.get();
        }
    }

    public static final void a2(GigApplyActivity gigApplyActivity, String str) {
        gigApplyActivity.getClass();
        try {
            int i12 = Z.f406624c;
            gigApplyActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            G0 g02 = G0.f406611a;
        } catch (Throwable unused) {
            int i13 = Z.f406624c;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.gig_apply_activity;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.gig_apply.di.a.a().a((GigApplyOpenParams) this.f159828o.getValue(), (com.avito.android.gig_apply.di.d) C29972i.a(C29972i.b(this), Object.class), cv.c.a(this)).a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        NavBar navBar = (NavBar) findViewById(R.id.gig_apply_nav_bar);
        this.f159829p = navBar;
        navBar.c(R.attr.ic_arrowBack24, new C30729e(this));
        NavBar navBar2 = this.f159829p;
        if (navBar2 == null) {
            navBar2 = null;
        }
        NavBar.e(navBar2, getString(R.string.apply_shift_screen_title), 0, 6);
        this.f159830q = (LinearLayout) findViewById(R.id.description_container);
        this.f159831r = (ViewGroup) findViewById(R.id.gig_apply_container);
        LayoutInflater layoutInflater = getLayoutInflater();
        ViewGroup viewGroup = this.f159831r;
        if (viewGroup == null) {
            viewGroup = null;
        }
        layoutInflater.inflate(R.layout.job_gig_apply_button, viewGroup);
        ViewGroup viewGroup2 = this.f159831r;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        View viewFindViewById = viewGroup2.findViewById(R.id.gig_apply_button_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup3 = (ViewGroup) viewFindViewById;
        this.f159832s = viewGroup3;
        viewGroup3.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 15));
        ViewGroup viewGroup4 = this.f159831r;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        this.f159835v = (ProgressBar) viewGroup4.findViewById(R.id.button_progress_bar);
        ViewGroup viewGroup5 = this.f159831r;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        this.f159833t = (TextView) viewGroup5.findViewById(R.id.button_text);
        ViewGroup viewGroup6 = this.f159831r;
        GigApplyButtonTimerView gigApplyButtonTimerView = (GigApplyButtonTimerView) (viewGroup6 != null ? viewGroup6 : null).findViewById(R.id.button_timer_text);
        this.f159834u = gigApplyButtonTimerView;
        gigApplyButtonTimerView.setOnTimerFinishListener(new C30723b(this));
        this.f159837x = (GigSingleSnippetWidget) findViewById(R.id.snippet_widget);
        this.f159836w = (TextView) findViewById(R.id.gig_apply_disclaimer);
        com.avito.android.arch.mvi.android.f.a((com.avito.android.gig_apply.mvi.l) this.f159827n.getValue(), this, Lifecycle.State.f46681d, new a(1, this, GigApplyActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/gig_apply/models/GigApplyOneTimeEvent;)V", 0), new b(1, this, GigApplyActivity.class, "renderState", "renderState(Lcom/avito/android/gig_apply/models/GigApplyState;)V", 0));
    }
}
