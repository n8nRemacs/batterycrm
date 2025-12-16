package com.avito.android.lib.design.modal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.C22767g;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.design.State;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.close_button.CloseButton;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.modal.ModalState;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.modal.d;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
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
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import wK0.AbstractC49526a;

/* compiled from: ModalViewRe23.kt */
@s0
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001VJ\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0019\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0015\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ\u0019\u0010\u001a\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\b2\b\b\u0001\u0010\u001e\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u001f\u0010\u000eJ\u0019\u0010\u001f\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\u001f\u0010\"J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\u000eJ\u0019\u0010&\u001a\u00020\b2\b\b\u0001\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010\u000eJ\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0+H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\b2\b\b\u0001\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010\u000eJ\u0019\u00102\u001a\u00020\b2\b\b\u0001\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u0010\u000eJ\u0017\u00103\u001a\u00020\b2\u0006\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u0010\u000eJ\u0017\u00104\u001a\u00020\b2\u0006\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u0010\u000eJ\u0017\u00105\u001a\u00020\b2\u0006\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u0010\u000eJ\u000f\u00106\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\b2\u0006\u00108\u001a\u00020'H\u0016¢\u0006\u0004\b9\u0010*J\u0017\u0010:\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b:\u0010\u0012J\u0017\u0010;\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b;\u0010\u0012J\u0017\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u0005H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u00105\u001a\u00020\b2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\b5\u0010DR$\u0010J\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010AR$\u0010/\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010>R(\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010.¨\u0006W"}, d2 = {"Lcom/avito/android/lib/design/modal/i;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/lib/design/modal/a$d;", "LLV/a;", "Lcom/avito/android/lib/design/modal/ModalState;", "Lcom/avito/android/lib/design/modal/d;", "Landroid/view/ViewGroup$LayoutParams;", "params", "Lkotlin/G0;", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "", "top", "setModalPadding", "(I)V", "Landroid/view/View;", "view", "setCustomBackground", "(Landroid/view/View;)V", "setModalMargin", "titleRes", "setTitle", "", "title", "(Ljava/lang/String;)V", "subtitleRes", "setSubtitle", "", "subtitle", "(Ljava/lang/CharSequence;)V", "src", "setImage", "Landroid/graphics/drawable/Drawable;", "drawable", "(Landroid/graphics/drawable/Drawable;)V", "orientation", "setButtonsOrientation", "offset", "setContentToButtonSpacing", "", "isVisible", "setCloseButtonVisible", "(Z)V", "Lkotlin/Function0;", "action", "setOnCloseClicked", "(LY41/a;)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setCloseButtonStyle", "colorAttr", "setCloseButtonColor", "setSubtitleTextColor", "setTitleTextColor", "setBackgroundColor", "getTouchOutsideView", "()Landroid/view/View;", "cancelable", "setCancelable", "setCustomView", "setIllustrationView", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/modal/d;)V", "newState", "setState", "(Lcom/avito/android/lib/design/modal/ModalState;)V", "Landroid/content/res/ColorStateList;", "backgroundColor", "(Landroid/content/res/ColorStateList;)V", "b", "Lcom/avito/android/lib/design/modal/ModalState;", "getState$_design_modules_components", "()Lcom/avito/android/lib/design/modal/ModalState;", "setState$_design_modules_components", VoiceInfo.STATE, "c", "Lcom/avito/android/lib/design/modal/d;", "getStyle$_design_modules_components", "()Lcom/avito/android/lib/design/modal/d;", "setStyle$_design_modules_components", "G", "LY41/a;", "getDismissAction", "()LY41/a;", "setDismissAction", "dismissAction", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends FrameLayout implements a.d, LV.a<ModalState, com.avito.android.lib.design.modal.d> {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f179776H = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f179777A;

    /* renamed from: B, reason: collision with root package name */
    public int f179778B;

    /* renamed from: C, reason: collision with root package name */
    public int f179779C;

    /* renamed from: D, reason: collision with root package name */
    public int f179780D;

    /* renamed from: E, reason: collision with root package name */
    public int f179781E;

    /* renamed from: F, reason: collision with root package name */
    public int f179782F;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.a<G0> dismissAction;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public ModalState state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public com.avito.android.lib.design.modal.d style;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f179786d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f179787e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f179788f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final CloseButton f179789g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f179790h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a f179791i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final View f179792j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f179793k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f179794l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f179795m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ScrollView f179796n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f179797o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f179798p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f179799q;

    /* renamed from: r, reason: collision with root package name */
    public final int f179800r;

    /* renamed from: s, reason: collision with root package name */
    public final int f179801s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public VU.b f179802t;

    /* renamed from: u, reason: collision with root package name */
    public int f179803u;

    /* renamed from: v, reason: collision with root package name */
    public int f179804v;

    /* renamed from: w, reason: collision with root package name */
    public int f179805w;

    /* renamed from: x, reason: collision with root package name */
    public int f179806x;

    /* renamed from: y, reason: collision with root package name */
    public final int f179807y;

    /* renamed from: z, reason: collision with root package name */
    public int f179808z;

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            D6.f(i.this.f179786d, 0, 0, view.getMeasuredWidth(), 0, 11);
        }
    }

    /* compiled from: ModalViewRe23.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgw/a;", "loadable", "Lkotlin/G0;", "invoke", "(Lgw/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<InterfaceC40743a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ModalState.a f179812l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ModalState.a aVar) {
            super(1);
            this.f179812l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC40743a interfaceC40743a) {
            InterfaceC40743a interfaceC40743a2 = interfaceC40743a;
            s.a(interfaceC40743a2, ((ModalState.c) this.f179812l).f179700a, true, true, new l(interfaceC40743a2), new m(interfaceC40743a2));
            return G0.f406611a;
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements View.OnLayoutChangeListener {
        public d() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            D6.f(i.this.f179795m, 0, 0, 0, view.getHeight(), 7);
        }
    }

    public i(@Y61.k Context context, int i12, int i13) {
        super(context, null, i12);
        a aVar = new a();
        this.f179791i = aVar;
        this.dismissAction = k.f179815l;
        LayoutInflater.from(getContext()).inflate(R.layout.design_modal_re23, (ViewGroup) this, true);
        this.f179792j = findViewById(R.id.modal_touch_outside);
        View viewFindViewById = findViewById(R.id.modal_content);
        this.f179793k = viewFindViewById;
        this.f179794l = (ViewGroup) findViewById(R.id.illustration_view_container);
        this.f179786d = (TextView) findViewById(R.id.title);
        this.f179787e = (TextView) findViewById(R.id.subtitle);
        ImageView imageView = (ImageView) findViewById(R.id.image);
        this.f179788f = imageView;
        this.f179789g = (CloseButton) findViewById(R.id.close_icon);
        this.f179795m = (LinearLayout) findViewById(R.id.content_container);
        this.f179796n = (ScrollView) findViewById(R.id.content_scroll);
        this.f179797o = (LinearLayout) findViewById(R.id.buttons_container);
        this.f179798p = (LinearLayout) findViewById(R.id.texts_container);
        this.f179799q = (ViewGroup) findViewById(R.id.custom_view_container);
        aVar.f179810c = imageView;
        this.f179790h = (FrameLayout) findViewById(R.id.modal_background);
        com.avito.android.lib.util.i iVar = com.avito.android.lib.util.i.f181373a;
        com.avito.android.lib.util.i.k(iVar, this, new h(4, viewFindViewById, D6.class, "changeMargin", "changeMargin(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", 1));
        com.avito.android.lib.util.i.f(iVar, this);
        this.f179807y = getContext().getResources().getDimensionPixelSize(R.dimen.modal_margin);
        Integer numValueOf = i13 <= 0 ? null : Integer.valueOf(i13);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, d.n.f178955Z, i12, numValueOf != null ? numValueOf.intValue() : R.style.Modal_Default);
        d.a aVar2 = com.avito.android.lib.design.modal.d.f179720u;
        Context context2 = getContext();
        aVar2.getClass();
        setStyle(d.a.b(typedArrayObtainStyledAttributes, context2));
        this.f179800r = typedArrayObtainStyledAttributes.getResourceId(3, this.f179800r);
        this.f179801s = typedArrayObtainStyledAttributes.getResourceId(4, this.f179801s);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        typedArrayObtainStyledAttributes.recycle();
        setCloseButtonVisible(z12);
    }

    public static ShapeDrawable c(int i12) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setIntrinsicHeight(i12);
        shapeDrawable.setIntrinsicWidth(i12);
        shapeDrawable.getPaint().setColor(0);
        return shapeDrawable;
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void F3(@f0 int i12, @Y61.k Y41.a aVar, @Y61.k String str) {
        a(str, i12, new C(5, aVar));
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
        this.f179797o.removeAllViews();
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void K3(@Y61.k Y41.l<? super InterfaceC40743a, G0> lVar) {
        lVar.invoke(this.f179791i);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void L3(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        F3(this.f179800r, aVar, str);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void M3(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        F3(this.f179801s, aVar, str);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void N3(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        VU.b bVar = this.f179802t;
        LinearLayout linearLayout = this.f179797o;
        if (linearLayout.getChildCount() >= 3) {
            linearLayout.removeViewAt(0);
        }
        Button button = new Button(getContext(), null, 0, 0);
        if (bVar != null) {
            button.setStyle(bVar);
        }
        button.setState(new UU.a(str, null, false, false, false, new j(aVar), null, null, null, false, 990, null));
        linearLayout.addView(button, new LinearLayout.LayoutParams(-1, -2, 1.0f));
        d();
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void O3(int i12, @Y61.k Y41.a<G0> aVar) {
        L3(getContext().getString(i12), aVar);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void P3(@Y61.k Y41.a<G0> aVar) {
        this.f179792j.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(6, aVar, this));
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void Q3(@Y61.k String str, @Y61.k View.OnClickListener onClickListener) {
        a(str, this.f179800r, onClickListener);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void R3(@Y61.k String str, @Y61.k com.avito.android.order.feature.c cVar) {
        a(str, this.f179801s, cVar);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void S3(@r int i12, @r int i13) {
        ViewGroup.LayoutParams layoutParams = this.f179788f.getLayoutParams();
        layoutParams.width = i12;
        layoutParams.height = i13;
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public final void T3(int i12, @Y61.k Y41.a<G0> aVar) {
        M3(getContext().getString(i12), aVar);
    }

    public final void a(@Y61.k String str, @f0 int i12, @Y61.k View.OnClickListener onClickListener) {
        LinearLayout linearLayout = this.f179797o;
        if (linearLayout.getChildCount() >= 3) {
            linearLayout.removeViewAt(0);
        }
        Button button = new Button(getContext(), null, 0, i12);
        button.setText(str);
        button.setOnClickListener(onClickListener);
        linearLayout.addView(button, new LinearLayout.LayoutParams(-1, -2, 1.0f));
        d();
    }

    public final int b() {
        int i12 = Resources.getSystem().getDisplayMetrics().widthPixels;
        com.avito.android.lib.design.modal.d dVar = this.style;
        int i13 = dVar != null ? dVar.f179723c : 0;
        int i14 = this.f179808z;
        int i15 = i13 * 2;
        return i12 <= i14 + i15 ? i12 - i15 : i14;
    }

    public final void d() {
        LinearLayout linearLayout = this.f179797o;
        linearLayout.setVisibility(linearLayout.getChildCount() != 0 ? 0 : 8);
        e();
    }

    public final void e() {
        LinearLayout linearLayout = this.f179797o;
        if (linearLayout.getVisibility() != 0) {
            D6.f(this.f179795m, 0, 0, 0, this.f179778B, 7);
        } else if (!linearLayout.isLaidOut() || linearLayout.isLayoutRequested()) {
            linearLayout.addOnLayoutChangeListener(new d());
        } else {
            D6.f(this.f179795m, 0, 0, 0, linearLayout.getHeight(), 7);
        }
    }

    public final void f() {
        this.f179798p.setVisibility(D6.y(this.f179787e) || D6.y(this.f179786d) ? 0 : 8);
    }

    @Y61.k
    public final Y41.a<G0> getDismissAction() {
        return this.dismissAction;
    }

    @Y61.l
    /* renamed from: getState$_design_modules_components, reason: from getter */
    public final ModalState getState() {
        return this.state;
    }

    @Y61.l
    /* renamed from: getStyle$_design_modules_components, reason: from getter */
    public final com.avito.android.lib.design.modal.d getStyle() {
        return this.style;
    }

    @Override // com.avito.android.lib.design.modal.a.d
    @Y61.k
    /* renamed from: getTouchOutsideView, reason: from getter */
    public View getF179792j() {
        return this.f179792j;
    }

    @Override // android.view.View
    public void setBackgroundColor(int colorAttr) {
        setBackgroundColor(C35835l0.e(colorAttr, getContext()));
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setButtonsOrientation(int orientation) {
        this.f179797o.setOrientation(orientation);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setCancelable(boolean cancelable) {
        if (cancelable) {
            P3(com.avito.android.lib.design.modal.c.f179719l);
        } else {
            this.f179792j.setOnClickListener(null);
        }
    }

    public void setCloseButtonColor(@InterfaceC42150f int colorAttr) {
        this.f179789g.setImageTintList(C35835l0.e(colorAttr, getContext()));
    }

    public void setCloseButtonStyle(@f0 int style) {
        this.f179789g.setAppearance(style);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setCloseButtonVisible(boolean isVisible) {
        int i12 = isVisible ? 0 : 8;
        CloseButton closeButton = this.f179789g;
        closeButton.setVisibility(i12);
        if (!isVisible) {
            D6.f(this.f179786d, 0, 0, 0, 0, 11);
        } else if (!closeButton.isLaidOut() || closeButton.isLayoutRequested()) {
            closeButton.addOnLayoutChangeListener(new b());
        } else {
            D6.f(this.f179786d, 0, 0, closeButton.getMeasuredWidth(), 0, 11);
        }
    }

    public void setContentToButtonSpacing(@r int offset) {
        this.f179777A = y6.d(offset);
    }

    public void setCustomBackground(@Y61.k View view) {
        v.a(view, this.f179782F);
        FrameLayout frameLayout = this.f179790h;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
        D6.H(frameLayout);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setCustomView(@Y61.k View view) {
        ViewGroup viewGroup = this.f179799q;
        D6.H(viewGroup);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }

    public final void setDismissAction(@Y61.k Y41.a<G0> aVar) {
        this.dismissAction = aVar;
    }

    public void setIllustrationView(@Y61.k View view) {
        ViewGroup viewGroup = this.f179794l;
        D6.H(viewGroup);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public void setImage(@InterfaceC42165v int src) {
        setImage(getContext().getDrawable(src));
    }

    @Override // android.view.View
    public void setLayoutParams(@Y61.l ViewGroup.LayoutParams params) {
        ViewGroup.LayoutParams layoutParams = this.f179793k.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            Integer numValueOf = Integer.valueOf(marginLayoutParams.topMargin);
            if (!(numValueOf.intValue() > 0)) {
                numValueOf = null;
            }
            marginLayoutParams.topMargin = numValueOf != null ? numValueOf.intValue() : this.f179807y;
            Integer numValueOf2 = Integer.valueOf(marginLayoutParams.bottomMargin);
            if (!(numValueOf2.intValue() > 0)) {
                numValueOf2 = null;
            }
            marginLayoutParams.bottomMargin = numValueOf2 != null ? numValueOf2.intValue() : this.f179807y;
            Integer numValueOf3 = Integer.valueOf(marginLayoutParams.width);
            Integer num = numValueOf3.intValue() > 0 ? numValueOf3 : null;
            marginLayoutParams.width = num != null ? num.intValue() : b();
        }
        super.setLayoutParams(params);
    }

    public void setModalMargin(@r int top) {
        D6.c(this.f179796n, null, Integer.valueOf(y6.d(top)), null, null, 13);
    }

    public void setModalPadding(@r int top) {
        int iD2 = y6.d(top);
        this.f179803u = iD2;
        D6.f(this.f179795m, 0, iD2, 0, 0, 13);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setOnCloseClicked(@Y61.k Y41.a<G0> action) {
        this.f179789g.setOnClickListener(new com.avito.android.lib.design.list_item.a(10, action));
    }

    public final void setState$_design_modules_components(@Y61.l ModalState modalState) {
        this.state = modalState;
    }

    public final void setStyle$_design_modules_components(@Y61.l com.avito.android.lib.design.modal.d dVar) {
        this.style = dVar;
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setSubtitle(@e0 int subtitleRes) {
        setSubtitle(getContext().getString(subtitleRes));
    }

    public void setSubtitleTextColor(int colorAttr) {
        this.f179787e.setTextColor(C35835l0.e(colorAttr, getContext()));
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setTitle(@Y61.l String title) {
        I5.a(this.f179786d, title, false);
        f();
        e();
    }

    public void setTitleTextColor(int colorAttr) {
        this.f179786d.setTextColor(C35835l0.e(colorAttr, getContext()));
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setImage(@Y61.l Drawable drawable) {
        ImageView imageView = this.f179788f;
        imageView.setImageDrawable(drawable);
        D6.G(imageView, drawable != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // LV.b
    public void setState(@Y61.k ModalState newState) {
        ModalState modalState = this.state;
        com.avito.android.lib.util.c cVar = new com.avito.android.lib.util.c(newState, modalState);
        if (cVar.f181333c) {
            return;
        }
        this.state = newState;
        boolean z12 = newState.f179695j;
        if (!new com.avito.android.lib.util.c(Boolean.valueOf(z12), modalState != null ? Boolean.valueOf(modalState.f179695j) : null).f181333c) {
            setCancelable(z12);
        }
        Y41.a<G0> aVar = modalState != null ? modalState.f179696k : null;
        Y41.a<G0> aVar2 = newState.f179696k;
        if (!new com.avito.android.lib.util.c(aVar2, aVar).f181333c && aVar2 != null) {
            P3(aVar2);
        }
        ModalState.a aVar3 = modalState != null ? modalState.f179691f : null;
        ModalState.a aVar4 = newState.f179691f;
        if (!L.f(aVar4, aVar3)) {
            boolean z13 = aVar4 instanceof ModalState.d;
            ViewGroup viewGroup = this.f179794l;
            if (z13) {
                D6.w(viewGroup);
                setImage(((ModalState.d) aVar4).f179703a);
            } else if (aVar4 instanceof ModalState.c) {
                D6.w(viewGroup);
                K3(new c(aVar4));
                ModalState.c cVar2 = (ModalState.c) aVar4;
                S3(cVar2.f179701b, cVar2.f179702c);
            } else {
                boolean z14 = aVar4 instanceof ModalState.b;
                ImageView imageView = this.f179788f;
                if (z14) {
                    D6.w(imageView);
                    ((ModalState.b) aVar4).getClass();
                    setIllustrationView(null);
                } else {
                    D6.w(viewGroup);
                    D6.w(imageView);
                }
            }
        }
        CharSequence charSequence = modalState != null ? modalState.f179686a : null;
        CharSequence charSequence2 = newState.f179686a;
        if (!L.f(charSequence2, charSequence)) {
            I5.a(this.f179786d, charSequence2, false);
            f();
            e();
        }
        CharSequence charSequence3 = modalState != null ? modalState.f179687b : null;
        CharSequence charSequence4 = newState.f179687b;
        if (!L.f(charSequence4, charSequence3)) {
            setSubtitle(charSequence4);
        }
        boolean z15 = newState.f179689d;
        if (!new com.avito.android.lib.util.c(Boolean.valueOf(z15), modalState != null ? Boolean.valueOf(modalState.f179689d) : null).f181333c) {
            setCloseButtonVisible(z15);
        }
        List<Button> list = modalState != null ? modalState.f179688c : null;
        List<Button> list2 = newState.f179688c;
        if (!new com.avito.android.lib.util.c(list2, list).f181333c) {
            List<Button> list3 = list2;
            J3();
            if (list3 != null) {
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    this.f179797o.addView((Button) it.next(), new LinearLayout.LayoutParams(-1, -2, 1.0f));
                }
            }
            d();
        }
        T t12 = cVar.f181331a;
        View view = t12 != 0 ? ((ModalState) t12).f179692g : null;
        T t13 = cVar.f181332b;
        if (!new com.avito.android.lib.util.c(view, t13 != 0 ? ((ModalState) t13).f179692g : null).f181333c) {
            if (view != null) {
                setCustomBackground(view);
            } else {
                this.f179790h.removeAllViews();
            }
        }
        View view2 = t12 != 0 ? ((ModalState) t12).f179693h : null;
        if (new com.avito.android.lib.util.c(view2, t13 != 0 ? ((ModalState) t13).f179693h : null).f181333c) {
            return;
        }
        if (view2 != null) {
            setCustomView(view2);
            return;
        }
        ViewGroup viewGroup2 = this.f179799q;
        viewGroup2.removeAllViews();
        D6.w(viewGroup2);
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c0  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.modal.d r13) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.modal.i.setStyle(com.avito.android.lib.design.modal.d):void");
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setSubtitle(@Y61.l CharSequence subtitle) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f179787e;
        textView.setMovementMethod(linkMovementMethod);
        I5.a(textView, subtitle, false);
        f();
        e();
    }

    private final void setBackgroundColor(ColorStateList backgroundColor) {
        this.f179793k.setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, backgroundColor, null, this.f179782F, null, 0, 122));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{C22767g.i(backgroundColor.getDefaultColor(), 0), C22767g.i(backgroundColor.getDefaultColor(), 220), backgroundColor.getDefaultColor()});
        gradientDrawable.setCornerRadius(this.f179782F);
        this.f179797o.setBackground(gradientDrawable);
    }

    @Override // com.avito.android.lib.design.modal.a.d
    public void setTitle(@e0 int titleRes) {
        setTitle(getContext().getString(titleRes));
    }

    /* compiled from: ModalViewRe23.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/modal/i$a;", "Lgw/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC40743a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public Drawable f179809b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public ImageView f179810c;

        public a() {
            State.a aVar = State.f135879c;
        }

        @Override // gw.InterfaceC40743a
        @Y61.l
        /* renamed from: getImage, reason: from getter */
        public final Drawable getF179809b() {
            return this.f179809b;
        }

        @Override // gw.InterfaceC40743a
        @Y61.l
        public final View getImageContainerView() {
            return this.f179810c;
        }

        @Override // gw.InterfaceC40743a
        public final void setImage(@Y61.l Drawable drawable) {
            this.f179809b = drawable;
            ImageView imageView = this.f179810c;
            if (imageView == null) {
                imageView = null;
            }
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                D6.G(imageView, this.f179809b != null);
            }
        }

        @Override // gw.InterfaceC40743a
        public final void setState(@Y61.k State state) {
        }
    }
}
