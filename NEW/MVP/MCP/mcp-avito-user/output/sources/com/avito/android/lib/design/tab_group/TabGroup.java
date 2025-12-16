package com.avito.android.lib.design.tab_group;

import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.tab_group.e;
import com.avito.android.lib.design.tab_group.layout.d;
import com.avito.android.util.C35763c0;
import com.avito.android.util.D6;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TabGroup.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0003\u0016\u0017\u0018J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/avito/android/lib/design/tab_group/TabGroup;", "Lcom/avito/android/lib/design/tab_group/layout/d;", "LLV/a;", "Lcom/avito/android/lib/design/tab_group/d;", "Lcom/avito/android/lib/design/tab_group/e;", "Landroid/graphics/drawable/Drawable;", "drawable", "Lkotlin/G0;", "setTabIndicatorPathDrawable", "(Landroid/graphics/drawable/Drawable;)V", "newState", "setState", "(Lcom/avito/android/lib/design/tab_group/d;)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/tab_group/e;)V", "v", "Lcom/avito/android/lib/design/tab_group/e;", "getStyle$_design_modules_components", "()Lcom/avito/android/lib/design/tab_group/e;", "setStyle$_design_modules_components", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "a", "b", "c", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"Recycle", "CustomViewStyleable", "UseCompatLoadingForDrawables"})
/* loaded from: classes14.dex */
public final class TabGroup extends com.avito.android.lib.design.tab_group.layout.d implements LV.a<d, e> {

    /* renamed from: s, reason: collision with root package name */
    public int f180713s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public Drawable f180714t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.tab_group.a f180715u;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @k
    public e style;

    /* renamed from: w, reason: collision with root package name */
    @l
    public d f180717w;

    /* compiled from: TabGroup.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/tab_group/TabGroup$a;", "Lcom/avito/android/lib/design/tab_group/layout/d$c;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends d.c {

        /* renamed from: f, reason: collision with root package name */
        @l
        public View f180718f;

        @Override // com.avito.android.lib.design.tab_group.layout.d.c
        public final void a() {
            super.a();
            this.f180718f = null;
        }
    }

    /* compiled from: TabGroup.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/tab_group/TabGroup$b;", "Lcom/avito/android/lib/design/tab_group/layout/d$b;", "Lcom/avito/android/lib/design/tab_group/layout/d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends d.b {
        public b(@k Context context) {
            super(context);
            setWillNotDraw(false);
        }

        @Override // com.avito.android.lib.design.tab_group.layout.d.b
        public final void a(@k d.C5316d c5316d, @k RectF rectF) {
            View view;
            c cVar = c5316d instanceof c ? (c) c5316d : null;
            if (cVar == null || (view = cVar.f180720d) == null) {
                super.a(c5316d, rectF);
                return;
            }
            if (view.getVisibility() != 0) {
                super.a(c5316d, rectF);
                return;
            }
            if (view.getParent() instanceof d.C5316d) {
                float left = view.getLeft() + ((c) c5316d).getLeft();
                rectF.set(left, 0.0f, view.getWidth() + left, 0.0f);
            } else {
                c cVar2 = (c) c5316d;
                float left2 = view.getLeft() + cVar2.getPaddingStart() + cVar2.getLeft();
                rectF.set(left2, 0.0f, view.getWidth() + left2, 0.0f);
            }
        }

        @Override // com.avito.android.lib.design.tab_group.layout.d.b, android.view.View
        public final void draw(@k Canvas canvas) {
            Drawable drawable;
            TabGroup tabGroup = TabGroup.this;
            if (tabGroup.getTabCount() != 0 && (drawable = tabGroup.f180714t) != null) {
                int contentInsetStart = tabGroup.getContentInsetStart();
                int height = getHeight();
                Integer num = tabGroup.getStyle().f180747h;
                drawable.setBounds(contentInsetStart, height - (num != null ? num.intValue() : drawable.getIntrinsicHeight()), getWidth() - tabGroup.f180713s, getHeight());
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }
    }

    /* compiled from: TabGroup.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/tab_group/TabGroup$c;", "Lcom/avito/android/lib/design/tab_group/layout/d$d;", "Lcom/avito/android/lib/design/tab_group/layout/d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends d.C5316d {

        /* renamed from: d, reason: collision with root package name */
        @l
        public View f180720d;

        public c() {
            throw null;
        }

        @Override // com.avito.android.lib.design.tab_group.layout.d.C5316d
        public final void a() {
            View customView;
            super.a();
            d.c tab = getF180796b();
            a aVar = tab instanceof a ? (a) tab : null;
            if (aVar == null || (customView = aVar.f180718f) == null) {
                customView = getCustomView();
            }
            this.f180720d = customView;
        }
    }

    @j
    public TabGroup(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void setTabIndicatorPathDrawable(Drawable drawable) {
        if (L.f(drawable, this.f180714t)) {
            return;
        }
        this.f180714t = drawable;
        getSlidingTabIndicator().postInvalidateOnAnimation();
    }

    @k
    /* renamed from: getStyle$_design_modules_components, reason: from getter */
    public final e getStyle() {
        return this.style;
    }

    @Override // com.avito.android.lib.design.tab_group.layout.d
    @k
    public final d.b h() {
        return new b(getContext());
    }

    @Override // com.avito.android.lib.design.tab_group.layout.d
    public final d.c i() {
        d.c cVarB = com.avito.android.lib.design.tab_group.layout.d.getTabPool().b();
        a aVar = cVarB instanceof a ? (a) cVarB : null;
        return aVar == null ? new a() : aVar;
    }

    public final void s() {
        int contentInsetStart;
        int i12;
        int i13 = this.mode;
        int i14 = (i13 == 0 || i13 == 2) ? this.contentInsetStart : 0;
        d.b slidingTabIndicator = getSlidingTabIndicator();
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        slidingTabIndicator.setPaddingRelative(i14, 0, 0, 0);
        int i15 = this.mode;
        if (i15 == 0) {
            getSlidingTabIndicator().setGravity(8388611);
        } else if (i15 == 1 || i15 == 2) {
            getSlidingTabIndicator().setGravity(1);
        }
        r(true);
        if (getMode() == 0 || getMode() == 2) {
            contentInsetStart = getContentInsetStart();
            i12 = this.f180713s;
        } else {
            contentInsetStart = 0;
            i12 = 0;
        }
        getSlidingTabIndicator().setPaddingRelative(contentInsetStart, 0, i12, 0);
        r(true);
    }

    public final void setStyle$_design_modules_components(@k e eVar) {
        this.style = eVar;
    }

    @Override // com.avito.android.lib.design.tab_group.layout.d
    @k
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final a k() {
        d.c cVarB = com.avito.android.lib.design.tab_group.layout.d.getTabPool().b();
        a aVar = cVarB instanceof a ? (a) cVarB : null;
        if (aVar == null) {
            aVar = new a();
        }
        aVar.f180794d = this;
        d.C5316d c5316dB = getTabViewPool().b();
        c cVar = c5316dB instanceof c ? (c) c5316dB : null;
        if (cVar == null) {
            cVar = new c(this, getContext());
        }
        cVar.setTab(aVar);
        cVar.setFocusable(true);
        cVar.f180720d = aVar.f180718f;
        aVar.f180795e = cVar;
        return aVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabGroup(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? 0 : i12;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178932L0, i12, R.style.Design_Widget_TabGroup);
        e.f180739j.getClass();
        e eVarA = e.a.a(typedArrayObtainStyledAttributes, context);
        this.style = eVarA;
        setContentInsetStart(eVarA.f180741b);
        e eVar = this.style;
        this.f180713s = eVar.f180741b;
        C35763c0 c35763c0 = eVar.f180742c;
        setSelectedTabIndicatorColor(c35763c0 != null ? c35763c0.f318848a : 0);
        Integer num = this.style.f180748i;
        setSelectedTabIndicatorHeight(num != null ? num.intValue() : D6.j(this, 3));
        setDefaultHeight(this.style.f180746g.f180755g);
        Drawable drawable = context.getDrawable(R.drawable.tab_indicator_path_drawable);
        if (drawable != null) {
            C35763c0 c35763c02 = this.style.f180743d;
            drawable.setTint(c35763c02 != null ? c35763c02.f318848a : 0);
            setTabIndicatorPathDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
        s();
    }

    @Override // LV.b
    public void setState(@k d newState) {
        d dVar = this.f180717w;
        if (new com.avito.android.lib.util.c(newState, dVar).f181333c) {
            return;
        }
        this.f180717w = newState;
        List<com.avito.android.lib.design.tab_group.b> list = dVar != null ? dVar.f180736a : null;
        List<com.avito.android.lib.design.tab_group.b> list2 = newState.f180736a;
        boolean z12 = new com.avito.android.lib.util.c(list2, list).f181333c;
        int i12 = newState.f180737b;
        if (!z12 && list2 != null) {
            l();
            com.avito.android.lib.design.tab_group.c.a(this, list2, Integer.valueOf(i12));
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (!new com.avito.android.lib.util.c(numValueOf, dVar != null ? Integer.valueOf(dVar.f180737b) : null).f181333c) {
            n(numValueOf.intValue());
        }
        Y41.l<Integer, G0> lVar = dVar != null ? dVar.f180738c : null;
        Y41.l<Integer, G0> lVar2 = newState.f180738c;
        if (new com.avito.android.lib.util.c(lVar2, lVar).f181333c) {
            return;
        }
        Y41.l<Integer, G0> lVar3 = lVar2;
        com.avito.android.lib.design.tab_group.layout.b bVar = this.f180715u;
        if (bVar != null) {
            m(bVar);
        }
        if (lVar3 == null) {
            this.f180715u = null;
            return;
        }
        com.avito.android.lib.design.tab_group.a aVar = new com.avito.android.lib.design.tab_group.a(this);
        this.f180715u = aVar;
        d(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0106  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.tab_group.e r12) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.tab_group.TabGroup.setStyle(com.avito.android.lib.design.tab_group.e):void");
    }
}
