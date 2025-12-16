package com.avito.android.map_core.overlay;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.shadow_layout.ShadowFrameLayout;
import com.avito.android.remote.model.Overlay;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;

/* compiled from: TopOverlayAppearance.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/map_core/overlay/b;", "Lcom/avito/android/map_core/overlay/c;", "Lcom/avito/android/remote/model/Overlay$Label;", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends c<Overlay.Label> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f185670b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f185671c;

    /* renamed from: d, reason: collision with root package name */
    public ShadowFrameLayout f185672d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f185673e;

    public /* synthetic */ b(com.avito.android.util.text.a aVar, boolean z12, int i12, C42822w c42822w) {
        this(aVar, (i12 & 2) != 0 ? true : z12);
    }

    @Override // com.avito.android.map_core.overlay.c
    @k
    public final kotlin.reflect.d<Overlay.Label> a() {
        return m0.f406844a.b(Overlay.Label.class);
    }

    @Override // com.avito.android.map_core.overlay.c
    public final void b(Overlay overlay) {
        Overlay.Label label = (Overlay.Label) overlay;
        ShadowFrameLayout shadowFrameLayout = this.f185672d;
        if (shadowFrameLayout == null) {
            shadowFrameLayout = null;
        }
        shadowFrameLayout.setShadowEnabled(this.f185671c);
        TextView textView = this.f185673e;
        TextView textView2 = textView != null ? textView : null;
        j.a(textView2, label.getText(), this.f185670b);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.map_core.overlay.c
    public final void c(@k View view) {
        this.f185672d = (ShadowFrameLayout) view.findViewById(R.id.overlay_container);
        this.f185673e = (TextView) view.findViewById(R.id.overlay_label);
    }

    public b(@k com.avito.android.util.text.a aVar, boolean z12) {
        super(R.layout.map_overlay_label);
        this.f185670b = aVar;
        this.f185671c = z12;
    }
}
