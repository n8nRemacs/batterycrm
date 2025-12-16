package ru.avito.component.toolbar;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.n;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.o;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.id.captcha.web.h;
import hw.InterfaceC41177b;
import kG0.C42580a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import n11.RunnableC44167a;

/* compiled from: CollapsingTitleAppBarLayout.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0010R\"\u0010\u001b\u001a\u00020\u00148\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R.\u00100\u001a\u0004\u0018\u00010$2\b\u0010,\u001a\u0004\u0018\u00010$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R$\u00108\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R.\u0010B\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010L\u001a\u0004\u0018\u00010$2\b\u0010I\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010(\"\u0004\bK\u0010*R(\u0010O\u001a\u0004\u0018\u00010$2\b\u0010M\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010(\"\u0004\b\u000b\u0010*¨\u0006P"}, d2 = {"Lru/avito/component/toolbar/CollapsingTitleAppBarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lkotlin/G0;", "setSubTitle", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "", "isVisible", "setHomeIconVisibility", "(Z)V", "setTitleActionViewVisibility", "enabled", "setActionEnabled", "Landroid/widget/FrameLayout;", "I", "Landroid/widget/FrameLayout;", "getActionViewContainer", "()Landroid/widget/FrameLayout;", "setActionViewContainer", "(Landroid/widget/FrameLayout;)V", "actionViewContainer", "Landroid/widget/RelativeLayout;", "J", "Landroid/widget/RelativeLayout;", "getAppbarContainer", "()Landroid/widget/RelativeLayout;", "setAppbarContainer", "(Landroid/widget/RelativeLayout;)V", "appbarContainer", "", "L", "Ljava/lang/String;", "getShortTitle", "()Ljava/lang/String;", "setShortTitle", "(Ljava/lang/String;)V", "shortTitle", "navigationTitleString", "M", "getNavigationTitle", "setNavigationTitle", "navigationTitle", "Lru/avito/component/toolbar/a;", "N", "Lru/avito/component/toolbar/a;", "getClickListener", "()Lru/avito/component/toolbar/a;", "setClickListener", "(Lru/avito/component/toolbar/a;)V", "clickListener", "Lru/avito/component/toolbar/e;", "O", "Lru/avito/component/toolbar/e;", "getTitleActionClickListener", "()Lru/avito/component/toolbar/e;", "setTitleActionClickListener", "(Lru/avito/component/toolbar/e;)V", "titleActionClickListener", "Landroid/view/View;", "actionView", "P", "Landroid/view/View;", "getActionView", "()Landroid/view/View;", "setActionView", "(Landroid/view/View;)V", "titleString", "getTitle", "setTitle", "title", "subTitleString", "getSubTitle", "subTitle", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public class CollapsingTitleAppBarLayout extends AppBarLayout {

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f430573Q = 0;

    /* renamed from: A, reason: collision with root package name */
    public final TextView f430574A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f430575B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f430576C;

    /* renamed from: D, reason: collision with root package name */
    public final FrameLayout f430577D;

    /* renamed from: E, reason: collision with root package name */
    public final ImageView f430578E;

    /* renamed from: F, reason: collision with root package name */
    public final RelativeLayout f430579F;

    /* renamed from: G, reason: collision with root package name */
    public final FrameLayout f430580G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f430581H;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    public FrameLayout actionViewContainer;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public RelativeLayout appbarContainer;

    /* renamed from: K, reason: collision with root package name */
    public boolean f430584K;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    @l
    public String shortTitle;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    @l
    public String navigationTitle;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    @l
    public ru.avito.component.toolbar.a clickListener;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    @l
    public e titleActionClickListener;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    @l
    public View actionView;

    /* compiled from: CollapsingTitleAppBarLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f430590l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(1);
            this.f430590l = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(o oVar) {
            o oVar2 = oVar;
            d dVar = this.f430590l;
            oVar2.i(dVar.f430593a);
            oVar2.b(dVar.f430594b);
            return G0.f406611a;
        }
    }

    public CollapsingTitleAppBarLayout(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C42580a.o.f406215e, 0, 0);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(typedArrayObtainStyledAttributes.getResourceId(2, R.layout.collapsing_title_appbar_layout_legacy), (ViewGroup) this, true);
        setAppbarContainer((RelativeLayout) findViewById(R.id.appbar_container));
        View viewFindViewById = findViewById(R.id.action_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        setActionViewContainer((FrameLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.titles_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
        }
        this.f430579F = (RelativeLayout) viewFindViewById2;
        this.f430574A = (TextView) findViewById(R.id.appbar_title);
        this.f430575B = (TextView) findViewById(R.id.sub_title);
        this.f430576C = (TextView) findViewById(R.id.title_short);
        this.f430580G = (FrameLayout) findViewById(R.id.title_action_container);
        this.f430581H = (ImageView) findViewById(R.id.title_action_view);
        TextView textView = this.f430576C;
        (textView == null ? null : textView).setAlpha(0.0f);
        setTitleActionViewVisibility(false);
        ImageView imageView = this.f430581H;
        (imageView == null ? null : imageView).setOnClickListener(new b(this, 0));
        setTitle(typedArrayObtainStyledAttributes.getString(6));
        setSubTitle(typedArrayObtainStyledAttributes.getString(4));
        this.shortTitle = typedArrayObtainStyledAttributes.getString(3);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.home);
        this.f430577D = frameLayout;
        frameLayout.setOnClickListener(new b(this, 1));
        FrameLayout frameLayout2 = this.f430577D;
        this.f430578E = (ImageView) (frameLayout2 == null ? null : frameLayout2).findViewById(R.id.home_button_icon);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            ImageView imageView2 = this.f430578E;
            (imageView2 == null ? null : imageView2).setImageDrawable(drawable);
        }
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(7, getContext().getResources().getDimensionPixelSize(R.dimen.container_horizontal_padding));
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(9, getContext().getResources().getDimensionPixelSize(R.dimen.collapsing_title_appbar_padding_bottom_legacy));
        int dimension3 = (int) typedArrayObtainStyledAttributes.getDimension(10, getContext().getResources().getDimensionPixelSize(R.dimen.collapsing_title_appbar_padding_top_legacy));
        int dimension4 = (int) typedArrayObtainStyledAttributes.getDimension(5, getContext().getResources().getDimensionPixelSize(R.dimen.collapsing_subtitle_appbar_padding_top_legacy));
        int color = typedArrayObtainStyledAttributes.getColor(1, -1);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(8, -1);
        typedArrayObtainStyledAttributes.recycle();
        RelativeLayout relativeLayout = this.f430579F;
        (relativeLayout == null ? null : relativeLayout).setPadding(dimension, dimension3, dimension, dimension2);
        TextView textView2 = this.f430575B;
        int paddingLeft = (textView2 == null ? null : textView2).getPaddingLeft();
        TextView textView3 = this.f430575B;
        int paddingRight = (textView3 == null ? null : textView3).getPaddingRight();
        TextView textView4 = this.f430575B;
        int paddingBottom = (textView4 == null ? null : textView4).getPaddingBottom();
        TextView textView5 = this.f430575B;
        (textView5 == null ? null : textView5).setPadding(paddingLeft, dimension4, paddingRight, paddingBottom);
        a(new n(this, 6));
        if (color != -1) {
            ImageView imageView3 = this.f430578E;
            (imageView3 == null ? null : imageView3).setColorFilter(color);
        }
        if (resourceId != -1) {
            TextView textView6 = this.f430574A;
            (textView6 != null ? textView6 : null).setTextAppearance(resourceId);
        }
    }

    public static void m(CollapsingTitleAppBarLayout collapsingTitleAppBarLayout, int i12) {
        Drawable drawable = androidx.core.content.d.getDrawable(collapsingTitleAppBarLayout.getContext(), i12);
        ImageView imageView = collapsingTitleAppBarLayout.f430578E;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
    }

    @l
    public final View getActionView() {
        return this.actionView;
    }

    @k
    public final FrameLayout getActionViewContainer() {
        FrameLayout frameLayout = this.actionViewContainer;
        if (frameLayout != null) {
            return frameLayout;
        }
        return null;
    }

    @k
    public final RelativeLayout getAppbarContainer() {
        RelativeLayout relativeLayout = this.appbarContainer;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        return null;
    }

    @l
    public final ru.avito.component.toolbar.a getClickListener() {
        return this.clickListener;
    }

    @l
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    @l
    public final String getShortTitle() {
        return this.shortTitle;
    }

    @l
    public final String getSubTitle() {
        TextView textView = this.f430575B;
        if (textView == null) {
            textView = null;
        }
        return textView.getText().toString();
    }

    @l
    public final String getTitle() {
        TextView textView = this.f430574A;
        if (textView == null) {
            textView = null;
        }
        return textView.getText().toString();
    }

    @l
    public final e getTitleActionClickListener() {
        return this.titleActionClickListener;
    }

    public final void l() {
        String str;
        if (this.f430584K) {
            this.f430584K = false;
            String str2 = this.shortTitle;
            if (!(str2 == null || C43066x.K(str2)) && (str = this.navigationTitle) != null && !C43066x.K(str)) {
                n(this.navigationTitle);
                return;
            }
            String str3 = this.navigationTitle;
            if (str3 == null || C43066x.K(str3)) {
                TextView textView = this.f430576C;
                (textView != null ? textView : null).animate().alpha(0.0f).setDuration(250L).start();
            } else {
                TextView textView2 = this.f430576C;
                (textView2 != null ? textView2 : null).animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    public final void n(String str) {
        TextView textView = this.f430576C;
        if (textView == null) {
            textView = null;
        }
        textView.animate().alpha(0.0f).setDuration(250L).withEndAction(new h(23, this, str)).start();
    }

    public final void o(@k d dVar) {
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(getAppbarContainer().getContext(), 0, 0, 6, null);
        kVar.f181224j = new r.a(new i.b(new b.C5327b()));
        int i12 = kVar.f181229o;
        kVar.f181228n = -1;
        kVar.f181229o = i12;
        p.a(kVar, new a(dVar));
        kVar.e(getAppbarContainer());
    }

    public final void setActionEnabled(boolean enabled) {
        View view = this.actionView;
        if (view != null) {
            view.setClickable(enabled);
        }
        View view2 = this.actionView;
        if (view2 == null) {
            return;
        }
        view2.setEnabled(enabled);
    }

    public final void setActionView(@l View view) {
        if (view != null) {
            getActionViewContainer().addView(view);
            getActionViewContainer().setVisibility(0);
        } else {
            getActionViewContainer().removeAllViews();
            getActionViewContainer().setVisibility(4);
        }
        getActionViewContainer().post(new RunnableC44167a(this, 4));
        this.actionView = view;
        if (view != null) {
            view.setOnClickListener(new b(this, 2));
        }
    }

    public final void setActionViewContainer(@k FrameLayout frameLayout) {
        this.actionViewContainer = frameLayout;
    }

    public final void setAppbarContainer(@k RelativeLayout relativeLayout) {
        this.appbarContainer = relativeLayout;
    }

    public final void setClickListener(@l ru.avito.component.toolbar.a aVar) {
        this.clickListener = aVar;
    }

    public final void setHomeIconVisibility(boolean isVisible) {
        ImageView imageView = this.f430578E;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setVisibility(isVisible ? 0 : 4);
        FrameLayout frameLayout = this.f430577D;
        (frameLayout != null ? frameLayout : null).setEnabled(isVisible);
    }

    public final void setNavigationTitle(@l String str) {
        this.navigationTitle = str;
        if (str == null || C43066x.K(str)) {
            return;
        }
        TextView textView = this.f430576C;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str);
        TextView textView2 = this.f430576C;
        (textView2 != null ? textView2 : null).setAlpha(1.0f);
    }

    public final void setShortTitle(@l String str) {
        this.shortTitle = str;
    }

    public final void setSubTitle(@l String str) {
        TextView textView = this.f430575B;
        if (textView == null) {
            textView = null;
        }
        I5.a(textView, str, false);
    }

    public final void setTitle(@l String str) {
        TextView textView = this.f430574A;
        if (textView == null) {
            textView = null;
        }
        I5.a(textView, str, false);
    }

    public final void setTitleActionClickListener(@l e eVar) {
        this.titleActionClickListener = eVar;
    }

    public final void setTitleActionViewVisibility(boolean isVisible) {
        FrameLayout frameLayout = this.f430580G;
        if (frameLayout == null) {
            frameLayout = null;
        }
        D6.G(frameLayout, isVisible);
    }

    public final void setSubTitle(@l AttributedText text) {
        TextView textView = this.f430575B;
        if (textView == null) {
            textView = null;
        }
        j.a(textView, text, null);
        TextView textView2 = this.f430575B;
        (textView2 != null ? textView2 : null).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
