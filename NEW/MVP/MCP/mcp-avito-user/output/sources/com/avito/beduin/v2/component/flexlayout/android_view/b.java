package com.avito.beduin.v2.component.flexlayout.android_view;

import ET0.h;
import ET0.l;
import Y61.k;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import com.avito.beduin.v2.component.common.Arrangement;
import com.avito.beduin.v2.component.common.AxisAlignment;
import com.avito.beduin.v2.component.common.Orientation;
import com.avito.beduin.v2.component.flexlayout.state.b;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.C;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.q;
import com.avito.beduin.v2.render.android_view.s;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FlexLayoutComponent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00040\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/component/flexlayout/android_view/b;", "Lcom/avito/beduin/v2/render/android_view/q;", "Lcom/avito/beduin/v2/component/flexlayout/state/b;", "Lcom/google/android/flexbox/FlexboxLayout;", "Lcom/avito/beduin/v2/component/flexlayout/state/b$a;", "Lcom/avito/beduin/v2/render/android_view/s$c;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends q<com.avito.beduin.v2.component.flexlayout.state.b, FlexboxLayout, b.a> implements s.c<b.a> {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f335725p = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f335726m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Orientation f335727n;

    /* renamed from: o, reason: collision with root package name */
    public s<b.a> f335728o;

    /* compiled from: FlexLayoutComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Orientation orientation = Orientation.f335659b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Arrangement.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Arrangement.a aVar = Arrangement.f335645c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Arrangement.a aVar2 = Arrangement.f335645c;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Arrangement.a aVar3 = Arrangement.f335645c;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Arrangement.a aVar4 = Arrangement.f335645c;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Arrangement.a aVar5 = Arrangement.f335645c;
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[AxisAlignment.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AxisAlignment.a aVar6 = AxisAlignment.f335651c;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AxisAlignment.a aVar7 = AxisAlignment.f335651c;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(@k A a12, @k Orientation orientation) {
        super(null, 1, null);
        this.f335726m = a12;
        this.f335727n = orientation;
    }

    public static int v(Resources resources, int i12) {
        if (i12 == -2) {
            return -2;
        }
        if (i12 != -1) {
            return ET0.d.b(resources, i12);
        }
        return -1;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final boolean c(InterfaceC36244d interfaceC36244d, InterfaceC36244d interfaceC36244d2) {
        return ((b.a) interfaceC36244d).f335745b.equals(((b.a) interfaceC36244d2).f335745b);
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final ViewGroup.LayoutParams d(InterfaceC36244d interfaceC36244d, Resources resources) {
        b.a.C10393a c10393a = ((b.a) interfaceC36244d).f335745b;
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(v(resources, c10393a.f335746a), v(resources, c10393a.f335747b));
        ET0.b bVar = c10393a.f335748c;
        layoutParams.setMargins(v(resources, bVar != null ? bVar.f4016a : 0), v(resources, bVar != null ? bVar.f4019d : 0), v(resources, bVar != null ? bVar.f4017b : 0), v(resources, bVar != null ? bVar.f4018c : 0));
        layoutParams.f348434c = c10393a.f335749d;
        return layoutParams;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final boolean h(InterfaceC36244d interfaceC36244d) {
        return ((b.a) interfaceC36244d).f335745b.f335751f;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, Object obj) {
        int i12;
        FlexboxLayout flexboxLayout = (FlexboxLayout) view;
        com.avito.beduin.v2.component.flexlayout.state.b bVar = (com.avito.beduin.v2.component.flexlayout.state.b) obj;
        int iOrdinal = this.f335727n.ordinal();
        boolean z12 = bVar.f335733b;
        int i13 = 3;
        int i14 = 2;
        if (iOrdinal == 0) {
            i12 = !z12 ? 0 : 1;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = !z12 ? 2 : 3;
        }
        flexboxLayout.setFlexDirection(i12);
        int iOrdinal2 = bVar.f335734c.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                i13 = 4;
            } else if (iOrdinal2 == 2) {
                i13 = 5;
            } else if (iOrdinal2 == 3) {
                i13 = 0;
            } else if (iOrdinal2 == 4) {
                i13 = 2;
            } else {
                if (iOrdinal2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = 1;
            }
        }
        flexboxLayout.setJustifyContent(i13);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        h hVar = bVar.f335736e;
        shapeDrawable.setIntrinsicWidth(ET0.d.b(flexboxLayout.getResources(), hVar.f4022a));
        shapeDrawable.setIntrinsicHeight(ET0.d.b(flexboxLayout.getResources(), hVar.f4023b));
        shapeDrawable.setAlpha(0);
        flexboxLayout.setDividerDrawable(shapeDrawable);
        flexboxLayout.setShowDivider(2);
        int iOrdinal3 = bVar.f335735d.ordinal();
        if (iOrdinal3 == 0) {
            i14 = 0;
        } else if (iOrdinal3 != 1) {
            if (iOrdinal3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i14 = 1;
        }
        flexboxLayout.setAlignItems(i14);
        Y41.a<G0> aVar = bVar.f335739h;
        flexboxLayout.setOnClickListener(aVar != null ? new i(17, aVar) : null);
        flexboxLayout.setClickable(aVar != null);
        M.a(flexboxLayout, bVar.f335740i);
        flexboxLayout.setBackgroundColor(t(bVar.f335732a));
        ET0.b bVar2 = bVar.f335737f;
        flexboxLayout.setPadding(ET0.d.b(flexboxLayout.getResources(), bVar2 != null ? bVar2.f4016a : 0), ET0.d.b(flexboxLayout.getResources(), bVar2 != null ? bVar2.f4019d : 0), ET0.d.b(flexboxLayout.getResources(), bVar2 != null ? bVar2.f4017b : 0), ET0.d.b(flexboxLayout.getResources(), bVar2 != null ? bVar2.f4018c : 0));
        s<b.a> sVar = this.f335728o;
        s.a(c.f335729l, sVar != null ? sVar : null, kVar, bVar.f335738g);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        FlexboxLayout flexboxLayout = new FlexboxLayout(viewGroup.getContext(), null);
        flexboxLayout.setFlexWrap(1);
        A a12 = this.f335726m;
        if (a12.f337909e.f57087a) {
            l.a(flexboxLayout);
        }
        this.f335728o = new s<>(a12, a12.f337907c, flexboxLayout, this, R.id.flex_child_component, this);
        return flexboxLayout;
    }

    @Override // com.avito.beduin.v2.render.android_view.q
    @k
    public final C u() {
        s<b.a> sVar = this.f335728o;
        if (sVar == null) {
            return null;
        }
        return sVar;
    }
}
