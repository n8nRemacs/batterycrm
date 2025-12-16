package com.avito.beduin.v2.component.row.android_view;

import ET0.l;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import com.avito.beduin.v2.component.row.state.a;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.C;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.q;
import com.avito.beduin.v2.render.android_view.s;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RowComponent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00040\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/component/row/android_view/c;", "Lcom/avito/beduin/v2/render/android_view/q;", "Lcom/avito/beduin/v2/component/row/state/a;", "Landroid/widget/LinearLayout;", "Lcom/avito/beduin/v2/component/row/state/a$a;", "Lcom/avito/beduin/v2/render/android_view/s$c;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends q<com.avito.beduin.v2.component.row.state.a, LinearLayout, a.C10422a> implements s.c<a.C10422a> {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f336146o = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f336147m;

    /* renamed from: n, reason: collision with root package name */
    public s<a.C10422a> f336148n;

    public c(@k A a12) {
        super(null, 1, null);
        this.f336147m = a12;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final boolean c(InterfaceC36244d interfaceC36244d, InterfaceC36244d interfaceC36244d2) {
        return ((a.C10422a) interfaceC36244d).f336171b.equals(((a.C10422a) interfaceC36244d2).f336171b);
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final ViewGroup.LayoutParams d(InterfaceC36244d interfaceC36244d, Resources resources) {
        int i12;
        a.C10422a.C10423a c10423a = ((a.C10422a) interfaceC36244d).f336171b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(e.a(resources, c10423a.f336173b), e.a(resources, c10423a.f336174c));
        ET0.b bVar = c10423a.f336175d;
        layoutParams.setMargins(e.a(resources, bVar != null ? bVar.f4016a : 0), e.a(resources, bVar != null ? bVar.f4019d : 0), e.a(resources, bVar != null ? bVar.f4017b : 0), e.a(resources, bVar != null ? bVar.f4018c : 0));
        int iOrdinal = c10423a.f336172a.ordinal();
        if (iOrdinal == 0) {
            i12 = 48;
        } else if (iOrdinal == 1) {
            i12 = 16;
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException();
            }
            i12 = 80;
        }
        layoutParams.gravity = i12;
        float f12 = c10423a.f336176e;
        layoutParams.weight = f12;
        if (f12 > 0.0f) {
            layoutParams.width = 0;
        }
        return layoutParams;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final boolean h(InterfaceC36244d interfaceC36244d) {
        return ((a.C10422a) interfaceC36244d).f336171b.f336177f;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, Object obj) {
        LinearLayout linearLayout = (LinearLayout) view;
        com.avito.beduin.v2.component.row.state.a aVar = (com.avito.beduin.v2.component.row.state.a) obj;
        Y41.a<G0> aVar2 = aVar.f336165d;
        linearLayout.setOnClickListener(aVar2 != null ? new i(18, aVar2) : null);
        linearLayout.setClickable(aVar2 != null);
        M.a(linearLayout, aVar.f336166e);
        linearLayout.setBackgroundColor(t(aVar.f336162a));
        ET0.b bVar = aVar.f336163b;
        linearLayout.setPadding(ET0.d.b(linearLayout.getResources(), bVar != null ? bVar.f4016a : 0), ET0.d.b(linearLayout.getResources(), bVar != null ? bVar.f4019d : 0), ET0.d.b(linearLayout.getResources(), bVar != null ? bVar.f4017b : 0), ET0.d.b(linearLayout.getResources(), bVar != null ? bVar.f4018c : 0));
        s<a.C10422a> sVar = this.f336148n;
        s.a(b.f336145l, sVar != null ? sVar : null, kVar, aVar.f336164c);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(0);
        A a12 = this.f336147m;
        if (a12.f337909e.f57087a) {
            l.a(linearLayout);
        }
        this.f336148n = new s<>(a12, a12.f337907c, linearLayout, this, R.id.row_child_component, this);
        return linearLayout;
    }

    @Override // com.avito.beduin.v2.render.android_view.q
    @k
    public final C u() {
        s<a.C10422a> sVar = this.f336148n;
        if (sVar == null) {
            return null;
        }
        return sVar;
    }
}
