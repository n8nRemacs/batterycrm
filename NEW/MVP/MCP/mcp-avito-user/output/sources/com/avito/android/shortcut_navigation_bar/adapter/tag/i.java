package com.avito.android.shortcut_navigation_bar.adapter.tag;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.v;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TagShortcutItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/tag/i;", "Lcom/avito/android/shortcut_navigation_bar/adapter/tag/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f283360c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f283361b;

    public i(@k View view) {
        super(view);
        Button button = (Button) view;
        this.f283361b = button;
        v.a(button, y6.b(12));
        button.setBackgroundColor(C35835l0.d(R.attr.warmGray4, button.getContext()));
        button.setForeground(androidx.core.content.d.getDrawable(button.getContext(), R.drawable.tag_item_ripple_fg));
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.tag.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f283361b.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(24, aVar));
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.tag.h
    public final void setSelected(boolean z12) {
        this.f283361b.setSelected(z12);
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.tag.h
    public final void setText(@k String str) {
        this.f283361b.setText(str);
    }
}
