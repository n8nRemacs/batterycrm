package com.avito.android.lib.design.modal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.C22767g;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.design.State;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import gw.InterfaceC40743a;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import j.e0;
import j.f0;
import j.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import wK0.AbstractC49526a;

/* compiled from: ModalView.kt */
@s0
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002:\u0001CJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u000e\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u0019\u0010\u0013\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0013\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u000bJ\u0019\u0010\u0018\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u000bJ\u0019\u0010\u001f\u001a\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u000bJ\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\u000bJ\u0019\u0010+\u001a\u00020\u00052\b\b\u0001\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\u000bJ\u0017\u0010,\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\u000bJ\u0017\u0010-\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\u000bJ\u0017\u0010.\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\u000bJ\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u00020 H\u0016¢\u0006\u0004\b3\u0010#J\u0017\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020/H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00052\u0006\u00104\u001a\u00020/H\u0016¢\u0006\u0004\b7\u00106J\u0017\u00108\u001a\u00020\u00052\u0006\u00104\u001a\u00020/H\u0016¢\u0006\u0004\b8\u00106J\u0019\u00109\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\bH\u0007¢\u0006\u0004\b9\u0010\u000bJ\u0017\u0010.\u001a\u00020\u00052\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b.\u0010<R(\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010'¨\u0006D"}, d2 = {"Lcom/avito/android/lib/design/modal/f;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/lib/design/modal/a$d;", "Landroid/view/ViewGroup$LayoutParams;", "params", "Lkotlin/G0;", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "", "top", "setModalPadding", "(I)V", "setModalMargin", "titleRes", "setTitle", "", "title", "(Ljava/lang/String;)V", "subtitleRes", "setSubtitle", "", "subtitle", "(Ljava/lang/CharSequence;)V", "src", "setImage", "Landroid/graphics/drawable/Drawable;", "drawable", "(Landroid/graphics/drawable/Drawable;)V", "orientation", "setButtonsOrientation", "offset", "setContentToButtonSpacing", "", "isVisible", "setCloseButtonVisible", "(Z)V", "Lkotlin/Function0;", "action", "setOnCloseClicked", "(LY41/a;)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setCloseButtonStyle", "colorAttr", "setCloseButtonColor", "setSubtitleTextColor", "setTitleTextColor", "setBackgroundColor", "Landroid/view/View;", "getTouchOutsideView", "()Landroid/view/View;", "cancelable", "setCancelable", "view", "setCustomView", "(Landroid/view/View;)V", "setIllustrationView", "setCustomBackground", "setCloseButtonAppearance", "Landroid/content/res/ColorStateList;", "backgroundColor", "(Landroid/content/res/ColorStateList;)V", "F", "LY41/a;", "getDismissAction", "()LY41/a;", "setDismissAction", "dismissAction", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends FrameLayout implements a.d {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f179741G = 0;

    /* renamed from: A, reason: collision with root package name */
    public final int f179742A;

    /* renamed from: B, reason: collision with root package name */
    public final int f179743B;

    /* renamed from: C, reason: collision with root package name */
    public final int f179744C;

    /* renamed from: D, reason: collision with root package name */
    public final int f179745D;

    /* renamed from: E, reason: collision with root package name */
    public final int f179746E;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.a<G0> dismissAction;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f179748b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f179749c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f179750d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f179751e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f179752f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a f179753g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f179754h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f179755i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f179756j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final EdgeScrollView f179757k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f179758l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f179759m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f179760n;

    /* renamed from: o, reason: collision with root package name */
    public final int f179761o;

    /* renamed from: p, reason: collision with root package name */
    public final int f179762p;

    /* renamed from: q, reason: collision with root package name */
    public final int f179763q;

    /* renamed from: r, reason: collision with root package name */
    public int f179764r;

    /* renamed from: s, reason: collision with root package name */
    public final int f179765s;

    /* renamed from: t, reason: collision with root package name */
    public final int f179766t;

    /* renamed from: u, reason: collision with root package name */
    public final int f179767u;

    /* renamed from: v, reason: collision with root package name */
    public final int f179768v;

    /* renamed from: w, reason: collision with root package name */
    public final int f179769w;

    /* renamed from: x, reason: collision with root package name */
    public final int f179770x;

    /* renamed from: y, reason: collision with root package name */
    public int f179771y;

    /* renamed from: z, reason: collision with root package name */
    public final int f179772z;

    public f(@Y61.k Context context, int i12, int i13) throws Resources.NotFoundException {
        super(context, null, i12);
        a aVar = new a();
        this.f179753g = aVar;
        this.dismissAction = g.f179775l;
        LayoutInflater.from(getContext()).inflate(R.layout.design_modal, (ViewGroup) this, true);
        this.f179754h = findViewById(R.id.modal_touch_outside);
        View viewFindViewById = findViewById(R.id.modal_content);
        this.f179755i = viewFindViewById;
        TextView textView = (TextView) findViewById(R.id.title);
        this.f179748b = textView;
        TextView textView2 = (TextView) findViewById(R.id.subtitle);
        this.f179749c = textView2;
        ImageView imageView = (ImageView) findViewById(R.id.image);
        this.f179750d = imageView;
        this.f179751e = (ImageView) findViewById(R.id.close_icon);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.content_container);
        this.f179756j = linearLayout;
        this.f179757k = (EdgeScrollView) findViewById(R.id.content_scroll);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.buttons_container);
        this.f179758l = linearLayout2;
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.texts_container);
        this.f179759m = linearLayout3;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.close_button_container);
        this.f179752f = frameLayout;
        this.f179760n = (ViewGroup) findViewById(R.id.custom_view_container);
        aVar.f179774c = imageView;
        com.avito.android.lib.util.i iVar = com.avito.android.lib.util.i.f181373a;
        com.avito.android.lib.util.i.k(iVar, this, new e(4, viewFindViewById, D6.class, "changeMargin", "changeMargin(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", 1));
        com.avito.android.lib.util.i.f(iVar, this);
        this.f179768v = getContext().getResources().getDimensionPixelSize(R.dimen.modal_margin);
        Integer numValueOf = i13 <= 0 ? null : Integer.valueOf(i13);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, d.n.f178955Z, i12, numValueOf != null ? numValueOf.intValue() : R.style.Modal_Default);
        this.f179761o = typedArrayObtainStyledAttributes.getResourceId(3, this.f179761o);
        this.f179762p = typedArrayObtainStyledAttributes.getResourceId(4, this.f179762p);
        this.f179763q = typedArrayObtainStyledAttributes.getResourceId(2, this.f179763q);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(19, 0);
        int i14 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f179770x = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        ColorStateList colorStateListA = x.a(typedArrayObtainStyledAttributes, getContext(), 0);
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            this.f179771y = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, this.f179771y);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f179772z = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, this.f179772z);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f179742A = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, this.f179742A);
        }
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            this.f179743B = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, this.f179743B);
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            this.f179764r = typedArrayObtainStyledAttributes.getDimensionPixelSize(23, this.f179764r);
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            this.f179765s = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, this.f179765s);
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f179766t = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, this.f179766t);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f179767u = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.f179767u);
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            this.f179746E = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, this.f179746E);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.f179769w = typedArrayObtainStyledAttributes.getDimensionPixelSize(24, this.f179769w);
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f179744C = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            this.f179745D = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.f179745D;
            }
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = this.f179745D;
            }
            frameLayout.requestLayout();
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            setCloseButtonAppearance(typedArrayObtainStyledAttributes.getResourceId(8, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        setButtonsOrientation(i14);
        textView.setTextAppearance(resourceId);
        textView2.setTextAppearance(resourceId2);
        setCloseButtonVisible(z12);
        if (colorStateListA != null) {
            setBackgroundColor(colorStateListA);
        }
        D6.f(linearLayout, this.f179765s, this.f179764r, this.f179766t, 0, 8);
        D6.f(linearLayout2, this.f179765s, 0, this.f179766t, this.f179767u, 2);
        linearLayout.setDividerDrawable(b(this.f179746E));
        linearLayout2.setDividerDrawable(b(this.f179742A));
        linearLayout3.setDividerDrawable(b(this.f179743B));
    }

    public static ShapeDrawable b(int i12) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setIntrinsicHeight(i12);
        shapeDrawable.setIntrinsicWidth(i12);
        shapeDrawable.getPaint().setColor(0);
        return shapeDrawable;
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void F3(int i12, @Y61.k Y41.a aVar, @Y61.k String str) {
        a(str, i12, new C(4, aVar));
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void G3() {
        setCloseButtonVisible(false);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void H3(@Y61.k Y41.a<G0> aVar) {
        setCloseButtonVisible(true);
        setOnCloseClicked(aVar);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void I3(@Y61.k Y41.a aVar) {
        N3(getContext().getString(R.string.messenger_deleted_message_popup_ok), aVar);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void J3() {
        this.f179758l.removeAllViews();
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void K3(@Y61.k Y41.l<? super InterfaceC40743a, G0> lVar) {
        lVar.invoke(this.f179753g);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void L3(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        F3(this.f179761o, aVar, str);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void M3(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        F3(this.f179762p, aVar, str);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void N3(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        F3(this.f179763q, aVar, str);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void O3(int i12, @Y61.k Y41.a<G0> aVar) {
        L3(getContext().getString(i12), aVar);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void P3(@Y61.k Y41.a<G0> aVar) {
        this.f179754h.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(5, aVar, this));
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void Q3(@Y61.k String str, @Y61.k View.OnClickListener onClickListener) {
        a(str, this.f179761o, onClickListener);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void R3(@Y61.k String str, @Y61.k com.avito.android.order.feature.c cVar) {
        a(str, this.f179762p, cVar);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void S3(@r int i12, @r int i13) {
        ViewGroup.LayoutParams layoutParams = this.f179750d.getLayoutParams();
        layoutParams.width = i12;
        layoutParams.height = i13;
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void T3(int i12, @Y61.k Y41.a<G0> aVar) {
        M3(getContext().getString(i12), aVar);
    }

    public final void a(@Y61.k String str, @f0 int i12, @Y61.k View.OnClickListener onClickListener) {
        LinearLayout linearLayout = this.f179758l;
        if (linearLayout.getChildCount() >= 3) {
            linearLayout.removeViewAt(0);
        }
        Button button = new Button(getContext(), null, 0, i12);
        button.setText(str);
        button.setOnClickListener(onClickListener);
        linearLayout.addView(button, new LinearLayout.LayoutParams(-1, -2, 1.0f));
        D6.G(linearLayout, linearLayout.getChildCount() > 0);
        c();
    }

    public final void c() {
        D6.f(this.f179756j, 0, 0, 0, (!D6.y(this.f179748b) || D6.y(this.f179749c)) ? D6.y(this.f179758l) ? this.f179771y : this.f179772z : getContext().getResources().getDimensionPixelSize(R.dimen.modal_titlePadding), 7);
    }

    @Y61.k
    public final Y41.a<G0> getDismissAction() {
        return this.dismissAction;
    }

    @Override // com.avito.android.lib.design.modal.a.d
    @Y61.k
    /* renamed from: getTouchOutsideView, reason: from getter */
    public View getF179754h() {
        return this.f179754h;
    }

    @Override // android.view.View
    public void setBackgroundColor(int colorAttr) {
        setBackgroundColor(C35835l0.e(colorAttr, getContext()));
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setButtonsOrientation(int orientation) {
        this.f179758l.setOrientation(orientation);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setCancelable(boolean cancelable) {
        if (cancelable) {
            P3(c.f179719l);
        } else {
            this.f179754h.setOnClickListener(null);
        }
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void setCloseButtonAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178957a0);
        ColorStateList colorStateListA = x.a(typedArrayObtainStyledAttributes, getContext(), 2);
        ImageView imageView = this.f179751e;
        imageView.setImageTintList(colorStateListA);
        int i12 = (this.f179745D - this.f179744C) / 2;
        com.avito.android.lib.util.r.a(imageView, Math.max(0, i12), Math.max(0, i12), x.a(typedArrayObtainStyledAttributes, getContext(), 0), x.a(typedArrayObtainStyledAttributes, getContext(), 1));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setCloseButtonColor(@InterfaceC42150f int colorAttr) {
        this.f179751e.setImageTintList(C35835l0.e(colorAttr, getContext()));
    }

    public void setCloseButtonStyle(@f0 int style) throws Resources.NotFoundException {
        setCloseButtonAppearance(style);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setCloseButtonVisible(boolean isVisible) {
        D6.G(this.f179752f, isVisible);
        int i12 = isVisible ? this.f179745D - this.f179772z : 0;
        TextView textView = this.f179748b;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.rightMargin = i12;
        textView.setLayoutParams(layoutParams);
    }

    public void setContentToButtonSpacing(@r int offset) {
        this.f179771y = y6.d(offset);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setCustomView(@Y61.k View view) {
        ViewGroup viewGroup = this.f179760n;
        D6.H(viewGroup);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }

    public final void setDismissAction(@Y61.k Y41.a<G0> aVar) {
        this.dismissAction = aVar;
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setImage(@InterfaceC42165v int src) {
        setImage(getContext().getDrawable(src));
    }

    @Override // android.view.View
    public void setLayoutParams(@Y61.l ViewGroup.LayoutParams params) {
        ViewGroup.LayoutParams layoutParams = this.f179755i.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            Integer numValueOf = Integer.valueOf(marginLayoutParams.topMargin);
            if (!(numValueOf.intValue() > 0)) {
                numValueOf = null;
            }
            marginLayoutParams.topMargin = numValueOf != null ? numValueOf.intValue() : this.f179768v;
            Integer numValueOf2 = Integer.valueOf(marginLayoutParams.bottomMargin);
            if (!(numValueOf2.intValue() > 0)) {
                numValueOf2 = null;
            }
            marginLayoutParams.bottomMargin = numValueOf2 != null ? numValueOf2.intValue() : this.f179768v;
            Integer numValueOf3 = Integer.valueOf(marginLayoutParams.width);
            Integer num = numValueOf3.intValue() > 0 ? numValueOf3 : null;
            marginLayoutParams.width = num != null ? num.intValue() : this.f179769w;
        }
        super.setLayoutParams(params);
    }

    public void setModalPadding(@r int top) {
        this.f179764r = y6.d(top);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setOnCloseClicked(@Y61.k Y41.a<G0> action) {
        this.f179751e.setOnClickListener(new com.avito.android.lib.design.list_item.a(9, action));
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setSubtitle(@e0 int subtitleRes) {
        setSubtitle(getContext().getString(subtitleRes));
    }

    public void setSubtitleTextColor(int colorAttr) {
        this.f179749c.setTextColor(C35835l0.e(colorAttr, getContext()));
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setTitle(@Y61.l String title) {
        TextView textView = this.f179748b;
        I5.a(textView, title, false);
        D6.G(this.f179759m, D6.y(this.f179749c) || D6.y(textView));
        c();
    }

    public void setTitleTextColor(int colorAttr) {
        this.f179748b.setTextColor(C35835l0.e(colorAttr, getContext()));
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setImage(@Y61.l Drawable drawable) {
        ImageView imageView = this.f179750d;
        imageView.setImageDrawable(drawable);
        D6.G(imageView, drawable != null);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setSubtitle(@Y61.l CharSequence subtitle) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f179749c;
        textView.setMovementMethod(linkMovementMethod);
        I5.a(textView, subtitle, false);
        D6.G(this.f179759m, D6.y(textView) || D6.y(this.f179748b));
        c();
    }

    private final void setBackgroundColor(ColorStateList backgroundColor) {
        AbstractC49526a.C12816a c12816a = AbstractC49526a.f441376b;
        this.f179755i.setBackground(AbstractC49526a.C12816a.a(c12816a, backgroundColor, null, this.f179770x, null, 0, 122));
        LayerDrawable layerDrawable = new LayerDrawable(new AbstractC49526a[]{AbstractC49526a.C12816a.a(c12816a, backgroundColor, null, this.f179770x, null, 0, 122)});
        layerDrawable.setLayerInset(0, 0, this.f179772z, 0, 0);
        this.f179758l.setBackground(layerDrawable);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{backgroundColor.getDefaultColor(), C22767g.i(backgroundColor.getDefaultColor(), 0)});
        gradientDrawable.setCornerRadius(gradientDrawable.getCornerRadius());
        G0 g02 = G0.f406611a;
        EdgeScrollView edgeScrollView = this.f179757k;
        edgeScrollView.f179684b = edgeScrollView.f179684b;
        edgeScrollView.f179685c = gradientDrawable;
        edgeScrollView.invalidate();
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setTitle(@e0 int titleRes) {
        setTitle(getContext().getString(titleRes));
    }

    /* compiled from: ModalView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/modal/f$a;", "Lgw/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC40743a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public Drawable f179773b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public ImageView f179774c;

        public a() {
            State.a aVar = State.f135879c;
        }

        @Override // gw.InterfaceC40743a
        @Y61.l
        /* renamed from: getImage, reason: from getter */
        public final Drawable getF179773b() {
            return this.f179773b;
        }

        @Override // gw.InterfaceC40743a
        @Y61.l
        public final View getImageContainerView() {
            return this.f179774c;
        }

        @Override // gw.InterfaceC40743a
        public final void setImage(@Y61.l Drawable drawable) {
            this.f179773b = drawable;
            ImageView imageView = this.f179774c;
            if (imageView == null) {
                imageView = null;
            }
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                D6.G(imageView, this.f179773b != null);
            }
        }

        @Override // gw.InterfaceC40743a
        public final void setState(@Y61.k State state) {
        }
    }

    public void setCustomBackground(@Y61.k View view) {
    }

    public void setIllustrationView(@Y61.k View view) {
    }

    public void setModalMargin(@r int top) {
    }
}
