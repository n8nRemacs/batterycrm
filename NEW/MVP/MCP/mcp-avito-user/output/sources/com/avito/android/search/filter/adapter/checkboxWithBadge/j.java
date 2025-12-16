package com.avito.android.search.filter.adapter.checkboxWithBadge;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.badge.g;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: CheckBoxWithBadgeItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/checkboxWithBadge/j;", "Lcom/avito/android/search/filter/adapter/checkboxWithBadge/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f262135f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckbox f262136b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ComponentContainer f262137c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public com.avito.android.blueprints.publish.multiselect.inline.i f262138d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f262139e;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.filters_checkbox);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemCheckbox");
        }
        this.f262136b = (ListItemCheckbox) viewFindViewById;
        this.f262137c = (ComponentContainer) view;
        this.f262139e = view.getContext();
    }

    @Override // com.avito.android.search.filter.adapter.checkboxWithBadge.i
    public final void Cv(@l com.avito.android.publish.slots.delivery_addresses.f fVar) {
        this.f262136b.setImageClickedListener(fVar);
    }

    @Override // com.avito.android.search.filter.adapter.checkboxWithBadge.i
    public final void Pi(@k String str) {
        g.a aVar = com.avito.android.lib.design.badge.g.f178395r;
        Context context = this.f262139e;
        int iJ2 = C35835l0.j(R.attr.badgeTextMedium, context);
        aVar.getClass();
        com.avito.android.lib.design.badge.g gVarB = g.a.b(iJ2, context);
        ColorStateList colorStateListB = new C35763c0(C48065c.c(context, str), null, null, null, 14, null).b();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(colorStateListB);
        gradientDrawable.setStroke(gVarB.f178402g, colorStateListB);
        gradientDrawable.setCornerRadius(gVarB.f178406k);
        this.f262136b.setBadgeBackground(gradientDrawable);
    }

    @Override // com.avito.android.search.filter.adapter.checkboxWithBadge.i
    public final void S1(@k Y41.l<? super Boolean, G0> lVar) {
        com.avito.android.blueprints.publish.multiselect.inline.i iVar = this.f262138d;
        ListItemCheckbox listItemCheckbox = this.f262136b;
        if (iVar != null) {
            listItemCheckbox.j(iVar);
        }
        com.avito.android.blueprints.publish.multiselect.inline.i iVar2 = new com.avito.android.blueprints.publish.multiselect.inline.i(2, lVar);
        listItemCheckbox.e(iVar2);
        this.f262138d = iVar2;
    }

    @Override // com.avito.android.search.filter.adapter.checkboxWithBadge.i
    public final void S70(@k String str) {
        this.f262136b.setBadgeTextColor(C48065c.c(this.f262139e, str));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        com.avito.android.blueprints.publish.multiselect.inline.i iVar = this.f262138d;
        if (iVar != null) {
            this.f262136b.j(iVar);
        }
    }

    @Override // com.avito.android.search.filter.adapter.checkboxWithBadge.i
    public final void n4(@k String str) {
        this.f262136b.setBadgeText(str);
    }

    @Override // com.avito.android.search.filter.adapter.checkboxWithBadge.i
    public final void pR() {
        this.f262136b.setImageDrawable(null);
    }

    @Override // com.avito.android.search.filter.adapter.checkboxWithBadge.i
    public final void setChecked(boolean z12) {
        this.f262136b.setChecked(z12);
    }

    @Override // com.avito.android.search.filter.adapter.checkboxWithBadge.i
    public final void setText(@k String str) {
        this.f262136b.setTitle(str);
    }

    @Override // com.avito.android.search.filter.adapter.checkboxWithBadge.i
    public final void setTitle(@l String str) {
        this.f262137c.setTitle(str);
    }

    @Override // com.avito.android.search.filter.adapter.checkboxWithBadge.i
    public final void ta() {
        Context context = this.f262139e;
        Drawable drawableH = C35835l0.h(R.attr.ic_help20, context);
        ListItemCheckbox listItemCheckbox = this.f262136b;
        listItemCheckbox.setImageDrawable(drawableH);
        listItemCheckbox.setImageColor(C35835l0.d(R.attr.warmGray28, context));
    }

    @Override // com.avito.android.search.filter.adapter.checkboxWithBadge.i
    public final void w0() {
        Badge badge = this.f262136b.f179518t;
        if (badge != null) {
            D6.w(badge);
        }
    }

    @Override // com.avito.android.search.filter.adapter.checkboxWithBadge.i
    public final void zj(boolean z12) {
        this.f262136b.setCheckboxEnabled(z12);
    }
}
