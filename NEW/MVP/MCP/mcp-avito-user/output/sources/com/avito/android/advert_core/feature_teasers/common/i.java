package com.avito.android.advert_core.feature_teasers.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.DrawableMarginSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert_core.feature_teasers.common.AdvertDetailsFeatureTeaserItem;
import com.avito.android.advert_core.feature_teasers.common.dialog.AdvertDetailsFeatureTeaserDialogInfo;
import com.avito.android.advert_core.feature_teasers.common.dialog.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: FeatureTeaserView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/i;", "Lcom/avito/android/advert_core/feature_teasers/common/l;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class i implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final k f83660b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final n f83661c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f83662d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f83663e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f83664f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f83665g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f83666h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f83667i;

    public i(@Y61.k View view, @Y61.k k kVar, @Y61.k n nVar) {
        this.f83660b = kVar;
        this.f83661c = nVar;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83662d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83663e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.options_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f83664f = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.link);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83665g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f83666h = (Button) viewFindViewById5;
        this.f83667i = view.getContext();
    }

    public static void b(View view) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.weight = 1.0f;
    }

    @Override // com.avito.android.advert_core.feature_teasers.common.l
    public final void Dx(@Y61.k Y41.a<G0> aVar) {
        this.f83665g.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(10, aVar));
    }

    @Override // com.avito.android.advert_core.feature_teasers.common.l
    public final void Is(@Y61.l String str, @Y61.l AdvertDetailsFeatureTeaserItem.Icon icon) {
        TextView textView = this.f83662d;
        I5.a(textView, str, false);
        I5.d(textView, null, a.a(icon, this.f83667i), 11);
    }

    @Override // com.avito.android.advert_core.feature_teasers.common.l
    public final void Ue(@Y61.l String str) {
        I5.a(this.f83665g, str, false);
    }

    @Override // com.avito.android.advert_core.feature_teasers.common.l
    public final void Wn(@Y61.k List<AdvertDetailsFeatureTeaserOption> list) {
        TextView textViewA;
        ViewGroup viewGroup;
        Iterator<T> it = list.iterator();
        int i12 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            SpannableString spannableString = null;
            k kVar = this.f83660b;
            ViewGroup viewGroup2 = this.f83664f;
            if (!zHasNext) {
                if (kVar.c()) {
                    int iJ2 = C42745f0.J(list) / 2;
                    int size = (list.size() - 1) % 2;
                    while (viewGroup2.getChildCount() - 1 > iJ2) {
                        viewGroup2.removeViewAt(viewGroup2.getChildCount() - 1);
                    }
                    ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getChildAt(iJ2);
                    int childCount = viewGroup3.getChildCount() - 1;
                    if (childCount > size) {
                        TextView textView = (TextView) viewGroup3.getChildAt(childCount);
                        textView.setText((CharSequence) null);
                        textView.setCompoundDrawables(null, null, null, null);
                    }
                } else {
                    int iJ3 = C42745f0.J(list);
                    while (viewGroup2.getChildCount() - 1 > iJ3) {
                        viewGroup2.removeViewAt(viewGroup2.getChildCount() - 1);
                    }
                }
                if (!kVar.c() || viewGroup2.getChildCount() == 0) {
                    return;
                }
                View childAt = viewGroup2.getChildAt(viewGroup2.getChildCount() - 1);
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) childAt;
                    if (viewGroup4.getChildCount() > 1) {
                        return;
                    }
                    com.avito.android.lib.design.text_view.a aVarA = a();
                    viewGroup4.addView(aVarA);
                    b(aVarA);
                    return;
                }
                return;
            }
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            AdvertDetailsFeatureTeaserOption advertDetailsFeatureTeaserOption = (AdvertDetailsFeatureTeaserOption) next;
            int childCount2 = viewGroup2.getChildCount() - 1;
            if (kVar.c()) {
                int i14 = i12 / 2;
                int i15 = i12 % 2;
                if (i14 > childCount2) {
                    textViewA = a();
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) viewGroup2.getChildAt(i14);
                    textViewA = viewGroup5.getChildCount() - 1 < i15 ? a() : (TextView) viewGroup5.getChildAt(i15);
                }
            } else {
                textViewA = i12 > childCount2 ? a() : (TextView) viewGroup2.getChildAt(i12);
            }
            String str = advertDetailsFeatureTeaserOption.f83611b;
            AdvertDetailsFeatureTeaserItem.Icon icon = advertDetailsFeatureTeaserOption.f83612c;
            Context context = this.f83667i;
            Drawable drawableA = a.a(icon, context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.advert_details_feature_teaser_option_icon_padding);
            if (str != null) {
                spannableString = new SpannableString(str);
                if (drawableA != null) {
                    spannableString.setSpan(new DrawableMarginSpan(drawableA, dimensionPixelSize), 0, 0, 18);
                }
            }
            textViewA.setText(spannableString);
            if (textViewA.getParent() == null) {
                if (kVar.c()) {
                    int i16 = i12 / 2;
                    if (i16 > childCount2) {
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        viewGroup2.addView(linearLayout);
                        b(linearLayout);
                        viewGroup = linearLayout;
                    } else {
                        viewGroup = (ViewGroup) viewGroup2.getChildAt(i16);
                    }
                    viewGroup.addView(textViewA);
                } else {
                    viewGroup2.addView(textViewA);
                }
                b(textViewA);
            }
            i12 = i13;
        }
    }

    public final com.avito.android.lib.design.text_view.a a() {
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(this.f83667i, null, 0, 0, 14, null);
        aVar.setTextAppearance(C35835l0.j(R.attr.textBody, aVar.getContext()));
        aVar.setPadding(0, aVar.getResources().getDimensionPixelSize(R.dimen.advert_details_feature_teaser_option_top_padding), 0, 0);
        return aVar;
    }

    @Override // com.avito.android.advert_core.feature_teasers.common.l
    public final void a0(@Y61.k Y41.a<G0> aVar) {
        this.f83666h.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(9, aVar));
    }

    @Override // com.avito.android.advert_core.feature_teasers.common.l
    public final void f(@Y61.l String str) {
        TextView textView = this.f83663e;
        I5.a(textView, str, false);
        if (str == null || str.length() == 0) {
            return;
        }
        textView.setTextAppearance(C35835l0.j(R.attr.textBody, textView.getContext()));
        k kVar = this.f83660b;
        if (kVar.c() || kVar.d()) {
            textView.setTextColor(C35835l0.d(R.attr.gray44, this.f83667i));
        }
    }

    @Override // com.avito.android.advert_core.feature_teasers.common.l
    public final void jU(@Y61.k AdvertDetailsFeatureTeaserDialogInfo advertDetailsFeatureTeaserDialogInfo) {
        com.avito.android.lib.util.g.a(this.f83661c.a(this.f83667i, advertDetailsFeatureTeaserDialogInfo));
    }

    @Override // com.avito.android.advert_core.feature_teasers.common.l
    public final void w2(@Y61.l String str) {
        com.avito.android.lib.design.button.b.a(this.f83666h, str, false);
    }
}
