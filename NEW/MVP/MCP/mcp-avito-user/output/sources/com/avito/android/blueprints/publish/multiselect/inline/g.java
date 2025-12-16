package com.avito.android.blueprints.publish.multiselect.inline;

import Ba.ViewOnClickListenerC13121a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.p6;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: PublishInlineMultiselectItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/publish/multiselect/inline/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/publish/multiselect/inline/f;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f106385b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f106386c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f106387d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Badge f106388e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f106389f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout f106390g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ComponentContainer f106391h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public LayoutInflater f106392i;

    /* renamed from: j, reason: collision with root package name */
    public final int f106393j;

    /* renamed from: k, reason: collision with root package name */
    public final int f106394k;

    public g(@k View view) {
        super(view);
        this.f106385b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f106386c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f106387d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.badge);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f106388e = (Badge) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.options_top_inset);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f106389f = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.options_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f106390g = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        ComponentContainer componentContainer = (ComponentContainer) viewFindViewById6;
        this.f106391h = componentContainer;
        new C41981q0(new com.jakewharton.rxrelay3.c());
        this.f106393j = componentContainer.getPaddingTop();
        this.f106394k = componentContainer.getPaddingBottom();
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.f
    public final void A20(boolean z12) {
        D6.G(this.f106389f, z12);
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.f
    public final void H(@l CharSequence charSequence) {
        ComponentContainer.n(this.f106391h, charSequence, 2);
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.f
    public final void I1(@l String str) {
        boolean z12 = true ^ (str == null || C43066x.K(str));
        Badge badge = this.f106388e;
        D6.G(badge, z12);
        if (str == null) {
            str = "";
        }
        badge.setTitleText(str);
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.f
    public final void L8(@k String str) {
        LinearLayout linearLayout = this.f106390g;
        p6 p6Var = new p6(linearLayout);
        while (p6Var.hasNext()) {
            View view = (View) p6Var.next();
            if (L.f(view.getTag(), str)) {
                linearLayout.removeView(view);
                return;
            }
        }
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.f
    public final void R8(@l Integer num, @l Integer num2) {
        D6.f(this.f106391h, 0, num != null ? num.intValue() : this.f106393j, 0, num2 != null ? num2.intValue() : this.f106394k, 5);
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.f
    public final void b8(@k String str, @k String str2, @l String str3, boolean z12, @l Y41.a<G0> aVar, @l Integer num, @l Y41.l<? super Boolean, G0> lVar) {
        LayoutInflater layoutInflater = this.f106392i;
        G0 g02 = null;
        View viewInflate = layoutInflater != null ? layoutInflater.inflate(R.layout.publish_checkbox_list_item, (ViewGroup) null) : null;
        ListItemCheckbox listItemCheckbox = (ListItemCheckbox) viewInflate;
        j jVar = new j(listItemCheckbox);
        listItemCheckbox.setTitle(str2);
        listItemCheckbox.setSubtitle(str3);
        listItemCheckbox.setChecked(z12);
        if (aVar == null) {
            listItemCheckbox.k();
        } else {
            listItemCheckbox.l();
        }
        listItemCheckbox.setImageClickedListener(new ViewOnClickListenerC13121a(22, aVar));
        i iVar = jVar.f106397a;
        if (iVar != null) {
            listItemCheckbox.j(iVar);
        }
        i iVar2 = new i(0, lVar);
        listItemCheckbox.e(iVar2);
        jVar.f106397a = iVar2;
        listItemCheckbox.setTag(str);
        LinearLayout linearLayout = this.f106390g;
        if (num != null) {
            if ((num.intValue() <= linearLayout.getChildCount() ? num : null) != null) {
                linearLayout.addView(viewInflate, num.intValue());
                g02 = G0.f406611a;
            }
        }
        if (g02 == null) {
            linearLayout.addView(viewInflate);
        }
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.f
    @k
    public final Context getContext() {
        return this.f106385b.getContext();
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.f
    public final void s(@k String str) {
        this.f106390g.setTag(str);
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.f
    public final void setSubtitle(@l CharSequence charSequence) {
        I5.a(this.f106387d, charSequence, false);
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.f
    public final void setTitle(@l CharSequence charSequence) {
        I5.a(this.f106386c, charSequence, false);
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.f
    public final void u(@l CharSequence charSequence) {
        this.f106391h.q(charSequence);
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.f
    public final void yr(@l Theme theme) {
        this.f106392i = LayoutInflater.from(new ContextThemeWrapper(this.f106385b.getContext(), com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, theme != null ? theme.getResName() : null)));
    }

    @Override // com.avito.android.blueprints.publish.multiselect.inline.f
    public final void za() {
        this.f106390g.removeAllViews();
    }
}
