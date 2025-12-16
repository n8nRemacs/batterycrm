package com.avito.android.extended_profile_widgets.adapter.base_info_ml;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.remote.model.ExtendedProfileBaseInfoMl;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35852n1;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: BaseInfoMlItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/base_info_ml/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/base_info_ml/j;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f154272k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f154273b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f154274c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f154275d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f154276e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f154277f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RatingBar f154278g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f154279h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f154280i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Button f154281j;

    public k(@Y61.k View view) {
        super(view);
        this.f154273b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.avatar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f154274c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.name);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154275d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154276e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.rating_number);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154277f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.rating_score);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.rating.RatingBar");
        }
        this.f154278g = (RatingBar) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.rating_text);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154279h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.extended_profile_base_info_ml_actions_item_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f154280i = (LinearLayout) viewFindViewById7;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.base_info_ml.j
    public final void AR(@Y61.k com.avito.android.image_loader.a aVar, @Y61.k Y41.a aVar2) {
        C35949t5.c(this.f154274c, aVar, null, null, null, 14);
        this.f154274c.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(24, aVar2));
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.base_info_ml.j
    public final void G8(@Y61.l String str) {
        I5.a(this.f154275d, String.valueOf(str), false);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.base_info_ml.j
    public final int Jb() {
        Rect rect = new Rect();
        LinearLayout linearLayout = this.f154280i;
        if (linearLayout.getHeight() <= 0) {
            return 0;
        }
        linearLayout.getGlobalVisibleRect(rect);
        return (int) ((((rect.top < 0 || rect.bottom < 0) ? 0.0f : rect.height()) / linearLayout.getHeight()) * 100);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.base_info_ml.j
    public final void Qv(@Y61.k List<? extends ExtendedProfileBaseInfoMl.Action> list, boolean z12, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.k Y41.a<G0> aVar) {
        boolean z13;
        boolean z14;
        Button button;
        LinearLayout linearLayout = this.f154280i;
        linearLayout.removeAllViews();
        List<? extends ExtendedProfileBaseInfoMl.Action> list2 = list;
        boolean z15 = list2 instanceof Collection;
        if (z15 && list2.isEmpty()) {
            z13 = false;
        } else {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((ExtendedProfileBaseInfoMl.Action) it.next()) instanceof ExtendedProfileBaseInfoMl.Phone) {
                    z13 = true;
                    break;
                }
            }
            z13 = false;
        }
        if (z15 && list2.isEmpty()) {
            z14 = false;
        } else {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((ExtendedProfileBaseInfoMl.Action) it2.next()) instanceof ExtendedProfileBaseInfoMl.Messenger) {
                    z14 = true;
                    break;
                }
            }
            z14 = false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z13 && z14) {
            n0 n0Var = m0.f406844a;
            linkedHashSet.add(n0Var.b(ExtendedProfileBaseInfoMl.Phone.class));
            linkedHashSet.add(n0Var.b(ExtendedProfileBaseInfoMl.Messenger.class));
        } else {
            n0 n0Var2 = m0.f406844a;
            linkedHashSet.add(n0Var2.b(ExtendedProfileBaseInfoMl.Phone.class));
            linkedHashSet.add(n0Var2.b(ExtendedProfileBaseInfoMl.Messenger.class));
            linkedHashSet.add(n0Var2.b(ExtendedProfileBaseInfoMl.Subscribe.class));
        }
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            ExtendedProfileBaseInfoMl.Action action = (ExtendedProfileBaseInfoMl.Action) obj;
            if (action instanceof ExtendedProfileBaseInfoMl.Messenger) {
                ExtendedProfileBaseInfoMl.Messenger messenger = (ExtendedProfileBaseInfoMl.Messenger) action;
                Button button2 = new Button(linearLayout.getContext(), null, 0, 0, 12, null);
                button2.setAppearanceFromAttr(R.attr.buttonSecondaryMedium);
                String title = messenger.getTitle();
                com.avito.android.lib.design.button.b.a(button2, title != null ? title : "", false);
                button2.setEnabled(!L.f(messenger.getDisabled(), Boolean.TRUE));
                Button.g(button2, C43852a.a(button2.getContext(), R.drawable.ic_basic_info_ml_chat), null, false, null, 14);
                button2.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(3, messenger, lVar));
                button = button2;
            } else if (action instanceof ExtendedProfileBaseInfoMl.Phone) {
                ExtendedProfileBaseInfoMl.Phone phone = (ExtendedProfileBaseInfoMl.Phone) action;
                button = new Button(linearLayout.getContext(), null, 0, 0, 12, null);
                button.setAppearanceFromAttr(R.attr.buttonSecondaryMedium);
                String title2 = phone.getTitle();
                com.avito.android.lib.design.button.b.a(button, title2 != null ? title2 : "", false);
                Button.g(button, C43852a.a(button.getContext(), R.drawable.ic_basic_info_ml_call), null, false, null, 14);
                button.setEnabled(!L.f(phone.getDisabled(), Boolean.TRUE));
                button.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(2, phone, lVar));
            } else {
                if (!(action instanceof ExtendedProfileBaseInfoMl.Subscribe)) {
                    throw new NoWhenBranchMatchedException();
                }
                ExtendedProfileBaseInfoMl.Subscribe subscribe = (ExtendedProfileBaseInfoMl.Subscribe) action;
                boolean z16 = z13 && z14;
                Button button3 = new Button(linearLayout.getContext(), null, 0, 0, 12, null);
                button3.setAppearanceFromAttr(R.attr.buttonSecondaryMedium);
                if (z16) {
                    if (L.f(subscribe.isSubscribed(), Boolean.TRUE)) {
                        button3.setImageResource(R.drawable.ic_basic_info_ml_subscribed);
                    } else {
                        button3.setImageResource(R.drawable.ic_basic_info_ml_subscribe);
                    }
                } else if (L.f(subscribe.isSubscribed(), Boolean.TRUE)) {
                    com.avito.android.lib.design.button.b.a(button3, subscribe.getSettingsTitle(), false);
                } else {
                    com.avito.android.lib.design.button.b.a(button3, subscribe.getSubscribeTitle(), false);
                }
                Button button4 = this.f154281j;
                if (button4 != null) {
                    button4.setEnabled(!z12);
                }
                Button button5 = this.f154281j;
                if (button5 != null) {
                    button5.setLoading(z12);
                }
                button3.setEnabled(!L.f(subscribe.getDisabled(), Boolean.TRUE));
                button3.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(25, aVar));
                this.f154281j = button3;
                button = button3;
            }
            linearLayout.addView(button, linkedHashSet.contains(m0.f406844a.b(action.getClass())) ? new LinearLayout.LayoutParams(0, -2, 1.0f) : new LinearLayout.LayoutParams(-2, -2));
            D6.c(button, Integer.valueOf(i12 == 0 ? 0 : l.f154282a), null, Integer.valueOf(i12 == list.size() - 1 ? 0 : l.f154282a), null, 10);
            i12 = i13;
        }
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.base_info_ml.j
    public final void X6(@Y61.l Float f12, @Y61.l String str, boolean z12, @Y61.l Y41.a aVar) {
        int i12 = str != null ? z12 ? R.attr.blue : R.attr.black : R.attr.gray28;
        boolean z13 = f12 != null;
        TextView textView = this.f154277f;
        D6.G(textView, z13);
        boolean z14 = f12 != null;
        RatingBar ratingBar = this.f154278g;
        D6.G(ratingBar, z14);
        boolean z15 = str != null;
        TextView textView2 = this.f154279h;
        D6.G(textView2, z15);
        textView.setText(f12 != null ? C35852n1.a(f12.floatValue()) : null);
        ratingBar.setFloatingRatingIsEnabled(true);
        ratingBar.setRating(f12 != null ? f12.floatValue() : 0.0f);
        if (str == null) {
            str = "";
        }
        textView2.setText(str);
        textView2.setTextColor(C35835l0.d(i12, this.f154273b));
        textView.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(26, aVar));
        ratingBar.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(27, aVar));
        textView2.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(28, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154274c.setOnClickListener(null);
        this.f154277f.setOnClickListener(null);
        this.f154278g.setOnClickListener(null);
        this.f154279h.setOnClickListener(null);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.base_info_ml.j
    public final void n6(@Y61.l String str) {
        I5.a(this.f154276e, str, false);
    }
}
