package com.avito.android.lib.design.nav_bar;

import PK0.n;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.nav_bar.a;
import com.avito.android.lib.design.nav_bar.b;
import com.avito.android.lib.design.text_view.e;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import e11.ViewOnClickListenerC39879j1;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: NavBar.kt */
@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\n\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/lib/design/nav_bar/NavBar;", "Landroid/widget/FrameLayout;", "LLV/a;", "Lcom/avito/android/lib/design/nav_bar/a;", "Lcom/avito/android/lib/design/nav_bar/b;", "Landroid/view/View;", "view", "Lkotlin/G0;", "setContent", "(Landroid/view/View;)V", "", "actions", "setActions", "([Landroid/view/View;)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/nav_bar/b;)V", "newState", "setState", "(Lcom/avito/android/lib/design/nav_bar/a;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NavBar extends FrameLayout implements LV.a<com.avito.android.lib.design.nav_bar.a, com.avito.android.lib.design.nav_bar.b> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f179818g = 0;

    /* renamed from: b, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.nav_bar.a f179819b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.nav_bar.b f179820c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f179821d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout f179822e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final FrameLayout f179823f;

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            int i22 = NavBar.f179818g;
            NavBar.this.f();
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            int i22 = NavBar.f179818g;
            NavBar.this.f();
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements View.OnLayoutChangeListener {
        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            int i22 = NavBar.f179818g;
            NavBar.this.f();
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements View.OnLayoutChangeListener {
        public d() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            int i22 = NavBar.f179818g;
            NavBar.this.f();
        }
    }

    @j
    public NavBar(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static void e(NavBar navBar, CharSequence charSequence, int i12, int i13) {
        n nVar;
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        navBar.getClass();
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(navBar.getContext(), null, i12, 0);
        com.avito.android.lib.design.nav_bar.b bVar = navBar.f179820c;
        if (bVar != null && (nVar = bVar.f179851g) != null) {
            e.a(aVar, nVar);
        }
        aVar.setId(R.id.nav_bar_title);
        aVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        aVar.setText(charSequence);
        aVar.setMaxLines(1);
        aVar.setEllipsize(TextUtils.TruncateAt.END);
        navBar.setContent(aVar);
    }

    @k
    public final ImageView a(@InterfaceC42150f int i12) {
        Drawable drawableMutate;
        C35763c0 c35763c0;
        ImageView imageView = new ImageView(getContext());
        imageView.setBackground(C35835l0.h(android.R.attr.selectableItemBackgroundBorderless, imageView.getContext()));
        Context context = imageView.getContext();
        com.avito.android.lib.design.nav_bar.b bVar = this.f179820c;
        Drawable drawable = null;
        ColorStateList colorStateListB = (bVar == null || (c35763c0 = bVar.f179850f) == null) ? null : c35763c0.b();
        Drawable drawableH = C35835l0.h(i12, context);
        if (drawableH != null && (drawableMutate = drawableH.mutate()) != null) {
            drawableMutate.setTintList(colorStateListB);
            drawable = drawableMutate;
        }
        imageView.setImageDrawable(drawable);
        return imageView;
    }

    @k
    public final com.avito.android.lib.design.text_view.a b(@k PrintableText printableText) {
        n nVar;
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(getContext(), null, 0, 0, 14, null);
        aVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        aVar.setClickable(true);
        com.avito.android.lib.design.nav_bar.b bVar = this.f179820c;
        if (bVar != null && (nVar = bVar.f179849e) != null) {
            e.a(aVar, nVar);
        }
        aVar.setText(printableText.k0(aVar.getContext()));
        return aVar;
    }

    public final void c(@InterfaceC42150f int i12, @k Y41.a<G0> aVar) {
        Drawable drawableMutate;
        C35763c0 c35763c0;
        ImageView imageView = this.f179821d;
        Context context = imageView.getContext();
        com.avito.android.lib.design.nav_bar.b bVar = this.f179820c;
        Drawable drawable = null;
        ColorStateList colorStateListB = (bVar == null || (c35763c0 = bVar.f179850f) == null) ? null : c35763c0.b();
        Drawable drawableH = C35835l0.h(i12, context);
        if (drawableH != null && (drawableMutate = drawableH.mutate()) != null) {
            drawableMutate.setTintList(colorStateListB);
            drawable = drawableMutate;
        }
        imageView.setImageDrawable(drawable);
        imageView.setOnClickListener(new ViewOnClickListenerC39879j1(aVar, 18));
        imageView.setVisibility(0);
        addOnLayoutChangeListener(new b());
    }

    public final void f() {
        int i12;
        ImageView imageView = this.f179821d;
        if (imageView.getVisibility() == 0) {
            int measuredWidth = imageView.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int marginStart = measuredWidth + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            com.avito.android.lib.design.nav_bar.b bVar = this.f179820c;
            i12 = marginStart + (bVar != null ? bVar.f179847c : 0);
        } else {
            com.avito.android.lib.design.nav_bar.b bVar2 = this.f179820c;
            i12 = bVar2 != null ? bVar2.f179845a : 0;
        }
        LinearLayout linearLayout = this.f179822e;
        if (linearLayout.getVisibility() == 0) {
            int measuredWidth2 = linearLayout.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            int marginEnd = measuredWidth2 + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
            com.avito.android.lib.design.nav_bar.b bVar3 = this.f179820c;
            i = (bVar3 != null ? bVar3.f179847c : 0) + marginEnd;
        } else {
            com.avito.android.lib.design.nav_bar.b bVar4 = this.f179820c;
            if (bVar4 != null) {
                i = bVar4.f179845a;
            }
        }
        FrameLayout frameLayout = this.f179823f;
        if (frameLayout.getLayoutParams().width == -1) {
            frameLayout.setPaddingRelative(i12, frameLayout.getPaddingTop(), i, frameLayout.getPaddingBottom());
        } else {
            int iMax = Math.max(i12, i);
            frameLayout.setPaddingRelative(iMax, frameLayout.getPaddingTop(), iMax, frameLayout.getPaddingBottom());
        }
    }

    public final void setActions(@k View... actions) {
        LinearLayout linearLayout = this.f179822e;
        linearLayout.removeAllViews();
        for (View view : actions) {
            linearLayout.addView(view);
        }
        linearLayout.setVisibility(actions.length == 0 ? 8 : 0);
        addOnLayoutChangeListener(new a());
    }

    public final void setContent(@l View view) {
        FrameLayout frameLayout = this.f179823f;
        frameLayout.removeAllViews();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            layoutParams2.width = layoutParams3 != null ? layoutParams3.width : -2;
            frameLayout.setLayoutParams(layoutParams2);
            frameLayout.addView(view);
            f();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavBar(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        C35763c0 c35763c0;
        b.a aVar;
        b.a aVar2;
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? R.attr.navBar : i12;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178959b0, i12, 0);
        com.avito.android.lib.design.nav_bar.b.f179844h.getClass();
        this.f179820c = b.C5290b.b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageViewA = a(R.attr.ic_arrowBack24);
        imageViewA.setId(R.id.nav_bar_back_button);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388627);
        com.avito.android.lib.design.nav_bar.b bVar = this.f179820c;
        layoutParams.setMarginStart((bVar == null || (aVar2 = bVar.f179846b) == null) ? 0 : aVar2.f179854c);
        com.avito.android.lib.design.nav_bar.b bVar2 = this.f179820c;
        int i14 = (bVar2 == null || (aVar = bVar2.f179846b) == null) ? 0 : aVar.f179855d;
        imageViewA.setPadding(i14, i14, i14, i14);
        imageViewA.setLayoutParams(layoutParams);
        imageViewA.setVisibility(8);
        this.f179821d = imageViewA;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.nav_bar_actions_container);
        linearLayout.setGravity(16);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 8388629);
        com.avito.android.lib.design.nav_bar.b bVar3 = this.f179820c;
        layoutParams2.setMarginEnd(bVar3 != null ? bVar3.f179845a : 0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setVisibility(8);
        this.f179822e = linearLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.f179823f = frameLayout;
        com.avito.android.lib.design.nav_bar.b bVar4 = this.f179820c;
        if (bVar4 != null && (c35763c0 = bVar4.f179848d) != null) {
            setBackgroundColor(c35763c0.f318848a);
        }
        addView(imageViewA);
        addView(frameLayout);
        addView(linearLayout);
    }

    @Override // LV.b
    public void setState(@k com.avito.android.lib.design.nav_bar.a newState) {
        ColorStateList colorStateListB;
        C35763c0 c35763c0;
        G0 g02;
        C35763c0 c35763c02;
        com.avito.android.lib.design.nav_bar.a aVar = this.f179819b;
        if (new com.avito.android.lib.util.c(newState, aVar).f181333c) {
            return;
        }
        this.f179819b = newState;
        Drawable drawable = aVar != null ? aVar.f179828a : null;
        Drawable drawable2 = newState.f179828a;
        com.avito.android.lib.util.c cVar = new com.avito.android.lib.util.c(drawable2, drawable);
        ImageView imageView = this.f179821d;
        if (!cVar.f181333c) {
            if (drawable2 != null) {
                com.avito.android.lib.design.nav_bar.b bVar = this.f179820c;
                drawable2.setTintList((bVar == null || (c35763c02 = bVar.f179850f) == null) ? null : c35763c02.b());
            }
            imageView.setImageDrawable(drawable2);
            addOnLayoutChangeListener(new c());
        }
        Y41.a<G0> aVar2 = aVar != null ? aVar.f179829b : null;
        Y41.a<G0> aVar3 = newState.f179829b;
        if (!new com.avito.android.lib.util.c(aVar3, aVar2).f181333c) {
            Y41.a<G0> aVar4 = aVar3;
            if (aVar4 != null) {
                imageView.setOnClickListener(new i(28, aVar4));
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                imageView.setOnClickListener(null);
            }
        }
        boolean z12 = newState.f179830c;
        if (!new com.avito.android.lib.util.c(Boolean.valueOf(z12), aVar != null ? Boolean.valueOf(aVar.f179830c) : null).f181333c) {
            imageView.setVisibility(z12 ? 0 : 8);
            addOnLayoutChangeListener(new d());
        }
        String str = aVar != null ? aVar.f179831d : null;
        String str2 = newState.f179831d;
        if (!new com.avito.android.lib.util.c(str2, str).f181333c) {
            if (str2 == null) {
                str2 = "";
            }
            e(this, str2, 0, 6);
        }
        View view = aVar != null ? aVar.f179832e : null;
        View view2 = newState.f179832e;
        if (!new com.avito.android.lib.util.c(view2, view).f181333c) {
            setContent(view2);
        }
        List<a.b> list = aVar != null ? aVar.f179833f : null;
        List<a.b> list2 = newState.f179833f;
        boolean zF2 = L.f(list2, list);
        final Y41.l<Integer, G0> lVar = newState.f179834g;
        if (zF2) {
            if (L.f(lVar, aVar != null ? aVar.f179834g : null)) {
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (list2 != null) {
            final int i12 = 0;
            for (Object obj : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                a.b bVar2 = (a.b) obj;
                if (bVar2 instanceof a.c) {
                    a.c cVar2 = (a.c) bVar2;
                    com.avito.android.lib.design.text_view.a aVarB = b(cVar2.f179841a);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.setMarginStart(y6.b(cVar2.f179842b));
                    layoutParams.setMarginEnd(y6.b(cVar2.f179843c));
                    aVarB.setLayoutParams(layoutParams);
                    if (lVar != null) {
                        final int i14 = 0;
                        aVarB.setOnClickListener(new View.OnClickListener() { // from class: qV.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                Y41.l lVar2 = lVar;
                                int i15 = i12;
                                switch (i14) {
                                    case 0:
                                        int i16 = NavBar.f179818g;
                                        lVar2.invoke(Integer.valueOf(i15));
                                        break;
                                    default:
                                        int i17 = NavBar.f179818g;
                                        lVar2.invoke(Integer.valueOf(i15));
                                        break;
                                }
                            }
                        });
                    }
                    arrayList.add(aVarB);
                } else if (bVar2 instanceof a.C5289a) {
                    a.C5289a c5289a = (a.C5289a) bVar2;
                    Drawable drawable3 = c5289a.f179835a;
                    ImageView imageView2 = new ImageView(getContext());
                    Drawable drawableH = c5289a.f179837c;
                    if (drawableH == null) {
                        drawableH = C35835l0.h(android.R.attr.selectableItemBackgroundBorderless, imageView2.getContext());
                    }
                    imageView2.setForeground(drawableH);
                    C35763c0 c35763c03 = c5289a.f179836b;
                    if (c35763c03 == null || (colorStateListB = c35763c03.b()) == null) {
                        com.avito.android.lib.design.nav_bar.b bVar3 = this.f179820c;
                        colorStateListB = (bVar3 == null || (c35763c0 = bVar3.f179850f) == null) ? null : c35763c0.b();
                    }
                    drawable3.setTintList(colorStateListB);
                    imageView2.setImageDrawable(drawable3);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.setMarginStart(c5289a.f179838d);
                    layoutParams2.setMarginEnd(c5289a.f179839e);
                    int i15 = c5289a.f179840f;
                    imageView2.setPadding(i15, i15, i15, i15);
                    imageView2.setLayoutParams(layoutParams2);
                    if (lVar != null) {
                        final int i16 = 1;
                        imageView2.setOnClickListener(new View.OnClickListener() { // from class: qV.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                Y41.l lVar2 = lVar;
                                int i152 = i12;
                                switch (i16) {
                                    case 0:
                                        int i162 = NavBar.f179818g;
                                        lVar2.invoke(Integer.valueOf(i152));
                                        break;
                                    default:
                                        int i17 = NavBar.f179818g;
                                        lVar2.invoke(Integer.valueOf(i152));
                                        break;
                                }
                            }
                        });
                    }
                    arrayList.add(imageView2);
                }
                i12 = i13;
            }
        }
        if (arrayList.isEmpty()) {
            this.f179822e.removeAllViews();
        } else {
            View[] viewArr = (View[]) arrayList.toArray(new View[0]);
            setActions((View[]) Arrays.copyOf(viewArr, viewArr.length));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.nav_bar.b r10) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.nav_bar.NavBar.setStyle(com.avito.android.lib.design.nav_bar.b):void");
    }
}
