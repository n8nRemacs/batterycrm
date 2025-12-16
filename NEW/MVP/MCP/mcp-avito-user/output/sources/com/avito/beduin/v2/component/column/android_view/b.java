package com.avito.beduin.v2.component.column.android_view;

import ET0.l;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import com.avito.beduin.v2.component.column.state.a;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.C;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.q;
import com.avito.beduin.v2.render.android_view.s;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ColumnComponent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00040\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/component/column/android_view/b;", "Lcom/avito/beduin/v2/render/android_view/q;", "Lcom/avito/beduin/v2/component/column/state/a;", "Landroid/widget/LinearLayout;", "Lcom/avito/beduin/v2/component/column/state/a$a;", "Lcom/avito/beduin/v2/render/android_view/s$c;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends q<com.avito.beduin.v2.component.column.state.a, LinearLayout, a.C10390a> implements s.c<a.C10390a> {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f335597o = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f335598m;

    /* renamed from: n, reason: collision with root package name */
    public s<a.C10390a> f335599n;

    public b(@k A a12) {
        super(null, 1, null);
        this.f335598m = a12;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final boolean c(InterfaceC36244d interfaceC36244d, InterfaceC36244d interfaceC36244d2) {
        return ((a.C10390a) interfaceC36244d).f335622b.equals(((a.C10390a) interfaceC36244d2).f335622b);
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final ViewGroup.LayoutParams d(InterfaceC36244d interfaceC36244d, Resources resources) {
        int i12;
        a.C10390a.C10391a c10391a = ((a.C10390a) interfaceC36244d).f335622b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(d.a(resources, c10391a.f335624b), d.a(resources, c10391a.f335625c));
        ET0.b bVar = c10391a.f335626d;
        layoutParams.setMargins(d.a(resources, bVar != null ? bVar.f4016a : 0), d.a(resources, bVar != null ? bVar.f4019d : 0), d.a(resources, bVar != null ? bVar.f4017b : 0), d.a(resources, bVar != null ? bVar.f4018c : 0));
        int iOrdinal = c10391a.f335623a.ordinal();
        if (iOrdinal != 0) {
            i12 = 1;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new IllegalArgumentException();
                }
                i12 = 8388613;
            }
        } else {
            i12 = 8388611;
        }
        layoutParams.gravity = i12;
        float f12 = c10391a.f335627e;
        layoutParams.weight = f12;
        if (f12 > 0.0f) {
            layoutParams.height = 0;
        }
        return layoutParams;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final boolean h(InterfaceC36244d interfaceC36244d) {
        return ((a.C10390a) interfaceC36244d).f335622b.f335628f;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, Object obj) {
        LinearLayout linearLayout = (LinearLayout) view;
        com.avito.beduin.v2.component.column.state.a aVar = (com.avito.beduin.v2.component.column.state.a) obj;
        Y41.a<G0> aVar2 = aVar.f335616d;
        linearLayout.setOnClickListener(aVar2 != null ? new i(16, aVar2) : null);
        linearLayout.setClickable(aVar2 != null);
        M.a(linearLayout, aVar.f335617e);
        linearLayout.setBackgroundColor(t(aVar.f335613a));
        ET0.b bVar = aVar.f335614b;
        linearLayout.setPadding(ET0.d.b(linearLayout.getResources(), bVar != null ? bVar.f4016a : 0), ET0.d.b(linearLayout.getResources(), bVar != null ? bVar.f4019d : 0), ET0.d.b(linearLayout.getResources(), bVar != null ? bVar.f4017b : 0), ET0.d.b(linearLayout.getResources(), bVar != null ? bVar.f4018c : 0));
        s<a.C10390a> sVar = this.f335599n;
        s.a(a.f335596l, sVar != null ? sVar : null, kVar, aVar.f335615c);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        A a12 = this.f335598m;
        if (a12.f337909e.f57087a) {
            l.a(linearLayout);
        }
        this.f335599n = new s<>(a12, a12.f337907c, linearLayout, this, R.id.column_child_component, this);
        return linearLayout;
    }

    @Override // com.avito.beduin.v2.render.android_view.q
    @k
    public final C u() {
        s<a.C10390a> sVar = this.f335599n;
        if (sVar == null) {
            return null;
        }
        return sVar;
    }
}
