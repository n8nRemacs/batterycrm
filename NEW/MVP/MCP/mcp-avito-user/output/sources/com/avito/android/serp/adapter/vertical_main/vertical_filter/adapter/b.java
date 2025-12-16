package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalSearchAllFiltersItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/b;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/l;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends l implements a {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Context f273440g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f273441h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Badge f273442i;

    public b(@Y61.k View view) {
        super(view);
        this.f273440g = view.getContext();
        View viewFindViewById = view.findViewById(R.id.all_filters);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f273441h = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.notification_badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f273442i = (Badge) viewFindViewById2;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.a
    public final void VD(@Y61.l Integer num, boolean z12) throws Resources.NotFoundException {
        int iIntValue = R.attr.buttonSecondaryLarge;
        Button button = this.f273441h;
        if (z12) {
            if (num != null) {
                iIntValue = num.intValue();
            }
            button.setAppearanceFromAttr(iIntValue);
        } else {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f273440g, R.style.Theme_DesignSystem_Re23);
            if (num != null) {
                iIntValue = num.intValue();
            }
            button.setAppearance(C35835l0.j(iIntValue, contextThemeWrapper));
        }
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.a
    public final void ks(@Y61.k String str) {
        boolean z12 = str.length() > 0;
        Badge badge = this.f273442i;
        D6.G(badge, z12);
        badge.setTitleText(str);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.a
    public final void setSelected(boolean z12) {
        Drawable drawableH;
        Context context = this.f273440g;
        Button button = this.f273441h;
        if (z12) {
            button.setIconColor(null);
            drawableH = C35835l0.h(R.attr.ic_filter_thin_selected_24, context);
        } else {
            drawableH = C35835l0.h(R.attr.ic_filter_thin_20, context);
        }
        button.setImageDrawable(drawableH);
    }
}
