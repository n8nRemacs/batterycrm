package com.avito.android.rating_form.info;

import Y41.l;
import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.image_loader.glide.utils.b;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.darkTheme.c;
import com.avito.android.publish.slots.delivery_addresses.f;
import com.avito.android.rating_form.RatingFormInfoScreen;
import com.avito.android.rating_form.info.di.b;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import m.C43852a;
import qK0.C47313c;

/* compiled from: RatingFormInfoFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/info/RatingFormInfoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingFormInfoFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @k
    public static final a f248153t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f248154u0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f248155n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f248156o0;

    /* renamed from: p0, reason: collision with root package name */
    @k
    public final C47313c f248157p0;

    /* renamed from: q0, reason: collision with root package name */
    @k
    public final C47313c f248158q0;

    /* renamed from: r0, reason: collision with root package name */
    @k
    public final C47313c f248159r0;

    /* renamed from: s0, reason: collision with root package name */
    @k
    public final C47313c f248160s0;

    /* compiled from: RatingFormInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/info/RatingFormInfoFragment$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: RatingFormInfoFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.rating_form.info.RatingFormInfoFragment$a$a, reason: collision with other inner class name */
        public static final class C7466a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ RatingFormInfoArguments f248161l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7466a(RatingFormInfoArguments ratingFormInfoArguments) {
                super(1);
                this.f248161l = ratingFormInfoArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key_arguments", this.f248161l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static RatingFormInfoFragment a(@k RatingFormInfoArguments ratingFormInfoArguments) {
            RatingFormInfoFragment ratingFormInfoFragment = new RatingFormInfoFragment();
            C35966w1.a(ratingFormInfoFragment, -1, new C7466a(ratingFormInfoArguments));
            return ratingFormInfoFragment;
        }

        public a() {
        }
    }

    static {
        Y y12 = new Y(RatingFormInfoFragment.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0);
        n0 n0Var = m0.f406844a;
        f248154u0 = new n[]{n0Var.e(y12), e.s(RatingFormInfoFragment.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0, n0Var), e.s(RatingFormInfoFragment.class, "messageView", "getMessageView()Landroid/widget/TextView;", 0, n0Var), e.s(RatingFormInfoFragment.class, "button", "getButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f248153t0 = new a(null);
    }

    public RatingFormInfoFragment() {
        super(0, 1, null);
        this.f248157p0 = new C47313c(null, 1, null);
        this.f248158q0 = new C47313c(null, 1, null);
        this.f248159r0 = new C47313c(null, 1, null);
        this.f248160s0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f248155n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.fragment_rating_form_info, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        G0 g02;
        super.onViewCreated(view, bundle);
        Bundle bundleRequireArguments = requireArguments();
        RatingFormInfoArguments ratingFormInfoArguments = (RatingFormInfoArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key_arguments", RatingFormInfoArguments.class) : bundleRequireArguments.getParcelable("key_arguments"));
        if (ratingFormInfoArguments == null) {
            throw new IllegalArgumentException("RatingFormInfo`Arguments not set");
        }
        View viewFindViewById = view.findViewById(R.id.rating_form_info_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        C47313c c47313c = this.f248157p0;
        n<Object>[] nVarArr = f248154u0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, (ImageView) viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.rating_form_info_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C47313c c47313c2 = this.f248158q0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, (TextView) viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R.id.rating_form_info_message);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C47313c c47313c3 = this.f248159r0;
        n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, (TextView) viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.rating_form_info_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        C47313c c47313c4 = this.f248160s0;
        n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, (Button) viewFindViewById4);
        ScreenPerformanceTracker screenPerformanceTracker = this.f248155n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f248155n0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.m(screenPerformanceTracker2.getF305951e());
        n<Object> nVar5 = nVarArr[1];
        ((TextView) c47313c2.a()).setText(ratingFormInfoArguments.f248147b);
        n<Object> nVar6 = nVarArr[2];
        I5.a((TextView) c47313c3.a(), ratingFormInfoArguments.f248148c, false);
        UniversalImage universalImage = ratingFormInfoArguments.f248151f;
        if (universalImage != null) {
            n<Object> nVar7 = nVarArr[0];
            b.d((ImageView) c47313c.a(), com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, c.c(getResources()))));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            n<Object> nVar8 = nVarArr[0];
            ImageView imageView = (ImageView) c47313c.a();
            n<Object> nVar9 = nVarArr[0];
            imageView.setImageDrawable(C43852a.a(((ImageView) c47313c.a()).getContext(), R.drawable.img_rating_form_info));
        }
        String str = ratingFormInfoArguments.f248149d;
        if (str != null && ratingFormInfoArguments.f248150e != null) {
            n<Object> nVar10 = nVarArr[3];
            D6.G((Button) c47313c4.a(), true);
            n<Object> nVar11 = nVarArr[3];
            ((Button) c47313c4.a()).setText(str);
            n<Object> nVar12 = nVarArr[3];
            ((Button) c47313c4.a()).setOnClickListener(new f(11, this, ratingFormInfoArguments));
        }
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f248155n0;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker3, null, null, null, 7);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.rating_form.info.di.a.a();
        RatingFormInfoScreen ratingFormInfoScreen = RatingFormInfoScreen.f247912d;
        r rVarC = s.c(this);
        ratingFormInfoScreen.getClass();
        aVarA.a(new C28478k(ratingFormInfoScreen, rVarC, RatingFormInfoScreen.f247913e), (com.avito.android.rating_form.info.di.c) C29972i.a(C29972i.b(this), com.avito.android.rating_form.info.di.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f248155n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
