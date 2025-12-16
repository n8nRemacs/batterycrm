package com.avito.android.extended_profile_widgets.adapter.universal.single;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.C22771k;
import androidx.window.layout.p;
import com.avito.android.R;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView;
import com.avito.android.extended_profile_widgets.adapter.universal.single.UniversalWidgetSingleBlockItem;
import com.avito.android.lib.util.i;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalWidgetSingleBlockItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/universal/single/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/universal/single/f;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f155002b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UniversalWidgetBlockView f155003c;

    /* renamed from: d, reason: collision with root package name */
    public final int f155004d;

    /* compiled from: UniversalWidgetSingleBlockItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[UniversalWidgetSingleBlockItem.ViewType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UniversalWidgetSingleBlockItem.ViewType viewType = UniversalWidgetSingleBlockItem.ViewType.f154992b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UniversalWidgetSingleBlockItem.ViewType viewType2 = UniversalWidgetSingleBlockItem.ViewType.f154992b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(@k View view) {
        super(view);
        this.f155002b = view;
        this.f155003c = (UniversalWidgetBlockView) view.findViewById(R.id.extended_profile_universal_block_view);
        this.f155004d = (int) view.getResources().getDimension(R.dimen.extended_profile_widget_horizontal_image_margin);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.universal.single.f
    public final void TZ(@k UniversalWidgetSingleBlockItem universalWidgetSingleBlockItem) {
        i.f181373a.getClass();
        View view = this.f155002b;
        C22771k c22771kD = i.d(view);
        int i12 = c22771kD != null ? c22771kD.f44775a : 0;
        int i13 = c22771kD != null ? c22771kD.f44777c : 0;
        p.f55345a.getClass();
        int iWidth = p.a.a().b(view.getContext()).f55343a.c().width() - (i12 + i13);
        int iOrdinal = universalWidgetSingleBlockItem.f154991e.ordinal();
        UniversalWidgetBlockView universalWidgetBlockView = this.f155003c;
        int i14 = this.f155004d;
        if (iOrdinal == 0) {
            ViewGroup.LayoutParams layoutParams = universalWidgetBlockView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iWidth - (i14 * 2);
            universalWidgetBlockView.setLayoutParams(layoutParams);
            D6.c(this.f155002b, Integer.valueOf(i14), null, Integer.valueOf(i14), null, 10);
        } else if (iOrdinal == 1) {
            ViewGroup.LayoutParams layoutParams2 = universalWidgetBlockView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = (int) ((((iWidth - i14) - y6.b(4)) / 4.0f) * 3);
            universalWidgetBlockView.setLayoutParams(layoutParams2);
            D6.c(this.f155002b, 0, null, 0, null, 10);
        } else if (iOrdinal == 2) {
            ViewGroup.LayoutParams layoutParams3 = universalWidgetBlockView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.width = iWidth - (i14 * 2);
            universalWidgetBlockView.setLayoutParams(layoutParams3);
            D6.c(this.f155002b, 0, null, 0, null, 10);
        }
        universalWidgetBlockView.g(universalWidgetSingleBlockItem.f154990d);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f155003c.i();
    }
}
