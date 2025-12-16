package com.avito.android.lib.design.badge;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.P;
import androidx.dynamicanimation.animation.c;
import androidx.dynamicanimation.animation.i;
import androidx.dynamicanimation.animation.j;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.badge.g;
import com.avito.android.lib.design.d;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import j.D;
import j.InterfaceC42150f;
import j.f0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: Badge.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0002\u001f J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0019\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/avito/android/lib/design/badge/Badge;", "Landroid/widget/FrameLayout;", "LpK0/a;", "LLV/a;", "Lcom/avito/android/lib/design/badge/f;", "Lcom/avito/android/lib/design/badge/g;", "", "color", "Lkotlin/G0;", "setTextColor", "(I)V", "setBackgroundColor", "visibility", "setVisibility", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "id", "setTextViewId", "newState", "setState", "(Lcom/avito/android/lib/design/badge/f;)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/badge/g;)V", "", "value", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleText", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Badge extends FrameLayout implements InterfaceC46971a, LV.a<f, g> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f178358i = 0;

    /* renamed from: b, reason: collision with root package name */
    @l
    public g f178359b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public f f178360c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.text_view.a f178361d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.button.c f178362e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public View f178363f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public b f178364g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public a f178365h;

    /* compiled from: Badge.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/badge/Badge$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final View f178366a;

        /* renamed from: b, reason: collision with root package name */
        public final long f178367b;

        /* renamed from: c, reason: collision with root package name */
        public final int f178368c;

        /* renamed from: d, reason: collision with root package name */
        public final float f178369d;

        /* renamed from: e, reason: collision with root package name */
        public final float f178370e;

        /* renamed from: f, reason: collision with root package name */
        public final float f178371f;

        /* renamed from: g, reason: collision with root package name */
        public final float f178372g;

        /* renamed from: h, reason: collision with root package name */
        public int f178373h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f178374i = true;

        /* renamed from: j, reason: collision with root package name */
        @l
        public ViewPropertyAnimator f178375j;

        /* renamed from: k, reason: collision with root package name */
        public final long f178376k;

        /* renamed from: l, reason: collision with root package name */
        public final i f178377l;

        public a(@k View view, long j12, long j13, int i12, float f12, float f13, float f14, float f15, float f16) {
            this.f178366a = view;
            this.f178367b = j13;
            this.f178368c = i12;
            this.f178369d = f12;
            this.f178370e = f13;
            this.f178371f = f14;
            this.f178372g = f15;
            this.f178373h = i12;
            this.f178376k = (long) ((1 - f16) * j12 * 2);
            i iVar = new i(view, androidx.dynamicanimation.animation.c.f46025n, f13);
            iVar.c(new c.r() { // from class: com.avito.android.lib.design.badge.b
                @Override // androidx.dynamicanimation.animation.c.r
                public final void a(float f17) {
                    Badge.a aVar = this.f178389a;
                    View view2 = aVar.f178366a;
                    view2.setScaleY(f17);
                    view2.setAlpha((f17 / aVar.f178370e) * aVar.f178372g);
                }
            });
            iVar.b(new c.q() { // from class: com.avito.android.lib.design.badge.c
                @Override // androidx.dynamicanimation.animation.c.q
                public final void a(androidx.dynamicanimation.animation.c cVar, boolean z12, float f17, float f18) {
                    Badge.a aVar = this.f178390a;
                    int i13 = aVar.f178373h - 1;
                    aVar.f178373h = i13;
                    if (i13 > 0 || aVar.f178374i) {
                        ViewPropertyAnimator viewPropertyAnimatorA = aVar.a();
                        viewPropertyAnimatorA.start();
                        aVar.f178375j = viewPropertyAnimatorA;
                    } else {
                        aVar.f178373h = aVar.f178368c;
                        aVar.f178366a.postDelayed(new d(aVar), aVar.f178367b);
                    }
                }
            });
            this.f178377l = iVar;
            view.setAlpha(f14);
            j jVar = iVar.f46047t;
            jVar.a(0.28f);
            jVar.b(200.0f);
        }

        public final ViewPropertyAnimator a() {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.f178366a.animate();
            float f12 = this.f178369d;
            return viewPropertyAnimatorAnimate.scaleX(f12).scaleY(f12).alpha(this.f178371f).setDuration(this.f178376k).withEndAction(new com.avito.android.lib.design.badge.a(this, 0));
        }

        public final void b() {
            if (this.f178374i) {
                ViewPropertyAnimator viewPropertyAnimator = this.f178375j;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                this.f178374i = false;
                this.f178373h = this.f178368c;
                View view = this.f178366a;
                if (view.getScaleX() == 1.0f && view.getScaleY() == 1.0f) {
                    this.f178377l.j();
                    return;
                }
                ViewPropertyAnimator viewPropertyAnimatorA = a();
                viewPropertyAnimatorA.start();
                this.f178375j = viewPropertyAnimatorA;
            }
        }
    }

    /* compiled from: Badge.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/badge/Badge$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Badge f178378a;

        /* renamed from: b, reason: collision with root package name */
        public final long f178379b;

        /* renamed from: c, reason: collision with root package name */
        public final float f178380c;

        /* renamed from: d, reason: collision with root package name */
        public final float f178381d;

        /* renamed from: e, reason: collision with root package name */
        public final float f178382e;

        /* renamed from: f, reason: collision with root package name */
        public final float f178383f;

        /* renamed from: g, reason: collision with root package name */
        public final float f178384g;

        /* renamed from: h, reason: collision with root package name */
        public final float f178385h;

        public b(@k Badge badge, long j12, float f12, float f13, float f14, float f15, float f16, float f17) {
            this.f178378a = badge;
            this.f178379b = j12;
            this.f178380c = f12;
            this.f178381d = f13;
            this.f178382e = f14;
            this.f178383f = f15;
            this.f178384g = f16;
            this.f178385h = f17;
        }
    }

    /* compiled from: Badge.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = Badge.f178358i;
            Badge.this.d();
            return G0.f406611a;
        }
    }

    @X41.j
    public Badge(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static GradientDrawable b(g gVar) {
        GradientDrawable gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(0);
        C35763c0 c35763c0 = gVar.f178401f;
        gradientDrawableE.setColor(c35763c0 != null ? c35763c0.b() : null);
        C35763c0 c35763c02 = gVar.f178403h;
        gradientDrawableE.setStroke(gVar.f178402g, c35763c02 != null ? c35763c02.b() : null);
        gradientDrawableE.setCornerRadius(gVar.f178406k);
        return gradientDrawableE;
    }

    public static void e(Badge badge, int i12, Integer num, ColorStateList colorStateList, int i13) throws Resources.NotFoundException {
        if ((i13 & 2) != 0) {
            num = null;
        }
        TypedArray typedArrayObtainStyledAttributes = badge.getContext().obtainStyledAttributes(i12, d.n.f178964e);
        badge.a(typedArrayObtainStyledAttributes, num, colorStateList, null, null);
        typedArrayObtainStyledAttributes.recycle();
        badge.requestLayout();
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void a(TypedArray typedArray, Integer num, ColorStateList colorStateList, Integer num2, ColorStateList colorStateList2) {
        g.a aVar = g.f178395r;
        Context context = getContext();
        aVar.getClass();
        g gVarC = g.a.c(typedArray, context);
        if (colorStateList != null) {
            gVarC = g.a(gVarC, null, 0, 0, C35771d0.b(colorStateList), 0, null, 0, 0, 0.0f, null, 131039);
        }
        g gVarA = gVarC;
        if (num2 != null) {
            gVarA = g.a(gVarA, null, 0, 0, null, num2.intValue(), null, 0, 0, 0.0f, null, 131007);
        }
        g gVarA2 = gVarA;
        if (colorStateList2 != null) {
            gVarA2 = g.a(gVarA2, null, 0, 0, null, 0, C35771d0.b(colorStateList2), 0, 0, 0.0f, null, 130943);
        }
        CharSequence text = typedArray.getText(5);
        if (text != null) {
            setTitleText(text);
        }
        setStyle(gVarA2);
        if (num != null) {
            this.f178361d.setTextColor(num.intValue());
        }
    }

    public final void c(g gVar) {
        a aVar = this.f178365h;
        if (aVar != null) {
            aVar.f178377l.d();
            aVar.a().cancel();
            aVar.f178374i = true;
        }
        View view = this.f178363f;
        a aVar2 = null;
        if (view != null) {
            removeView(view);
            this.f178363f = null;
        }
        if (gVar.f178411p) {
            View view2 = new View(getContext());
            view2.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
            view2.setBackground(b(gVar));
            P.b(view2, new RunnableC28882d(15, view2, this));
            this.f178363f = view2;
            addView(view2, 0);
            g.b bVar = gVar.f178410o;
            aVar2 = new a(view2, bVar.f178413a, bVar.f178414b, bVar.f178415c, bVar.f178418f, bVar.f178419g, bVar.f178420h, bVar.f178421i, bVar.f178422j);
            a aVar3 = this.f178365h;
            if (aVar3 != null) {
                aVar3.b();
            }
        }
        this.f178365h = aVar2;
    }

    public final void d() {
        a aVar;
        g gVar = this.f178359b;
        if (gVar != null) {
            b(gVar);
        }
        f fVar = this.f178360c;
        if (!(fVar != null ? L.f(fVar.f178393b, Boolean.TRUE) : false) || (aVar = this.f178365h) == null) {
            return;
        }
        aVar.b();
    }

    @Override // android.view.View
    public final void draw(@k Canvas canvas) {
        this.f178362e.a(canvas, this);
        super.draw(canvas);
    }

    @k
    public final CharSequence getTitleText() {
        return this.f178361d.getText();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        this.f178362e.d(this);
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178964e);
        a(typedArrayObtainStyledAttributes, null, null, null, null);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(color);
        }
        setBackground(gradientDrawable);
    }

    public final void setTextColor(int color) {
        this.f178361d.setTextColor(color);
    }

    public final void setTextViewId(@D int id2) {
        this.f178361d.setId(id2);
    }

    public final void setTitleText(@k CharSequence charSequence) {
        com.avito.android.lib.design.text_view.a aVar = this.f178361d;
        g gVar = this.f178359b;
        aVar.setVisibility((gVar == null || !gVar.f178412q || charSequence.length() <= 0) ? 8 : 0);
        aVar.setText(charSequence);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        boolean z12 = this.f178364g != null;
        boolean z13 = getVisibility() == 0;
        boolean z14 = visibility == 0;
        super.setVisibility(visibility);
        f fVar = this.f178360c;
        if (fVar == null || !fVar.f178394c || !z12 || z13 || !z14) {
            if (z14) {
                d();
                return;
            }
            a aVar = this.f178365h;
            if (aVar != null) {
                aVar.f178377l.d();
                aVar.a().cancel();
                aVar.f178374i = true;
                return;
            }
            return;
        }
        b bVar = this.f178364g;
        if (bVar != null) {
            c cVar = new c();
            Badge badge = bVar.f178378a;
            float f12 = bVar.f178380c;
            badge.setScaleX(f12);
            badge.setScaleY(f12);
            ViewPropertyAnimator duration = badge.animate().setDuration(bVar.f178379b);
            float f13 = bVar.f178381d;
            duration.scaleX(f13).scaleY(f13).setInterpolator(new PathInterpolator(bVar.f178382e, bVar.f178383f, bVar.f178384g, bVar.f178385h)).withEndAction(new com.avito.android.lib.design.badge.a(cVar, 1)).start();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Badge(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.badge : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_Badge : i13;
        super(context, attributeSet);
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(context, null, 0, 0, 14, null);
        aVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        aVar.setVisibility(8);
        this.f178361d = aVar;
        this.f178362e = new com.avito.android.lib.design.button.c();
        setWillNotDraw(false);
        setClipChildren(false);
        setPadding(0, 0, 0, 0);
        addView(aVar);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178964e, i12, i13);
        a(typedArrayObtainStyledAttributes, null, null, null, null);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // LV.b
    public void setState(@k f newState) {
        f fVar = this.f178360c;
        if (!new com.avito.android.lib.util.c(newState, fVar).f181333c) {
            this.f178360c = newState;
            CharSequence charSequence = fVar != null ? fVar.f178392a : null;
            CharSequence charSequence2 = newState.f178392a;
            if (!new com.avito.android.lib.util.c(charSequence2, charSequence).f181333c) {
                CharSequence charSequence3 = charSequence2;
                if (charSequence3 == null) {
                    charSequence3 = "";
                }
                setTitleText(charSequence3);
            }
        }
        if (L.f(newState.f178393b, Boolean.TRUE)) {
            a aVar = this.f178365h;
            if (aVar != null) {
                aVar.b();
                return;
            }
            return;
        }
        a aVar2 = this.f178365h;
        if (aVar2 != null) {
            aVar2.f178374i = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0145  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.badge.g r18) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.badge.Badge.setStyle(com.avito.android.lib.design.badge.g):void");
    }
}
