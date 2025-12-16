package com.avito.android.map_core.overlay;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.shadow_layout.ShadowFrameLayout;
import com.avito.android.remote.model.Alignment;
import com.avito.android.remote.model.Overlay;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;

/* compiled from: TopOverlayAppearance.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/map_core/overlay/a;", "Lcom/avito/android/map_core/overlay/c;", "Lcom/avito/android/remote/model/Overlay$CompactLabel;", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends c<Overlay.CompactLabel> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f185663b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f185664c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f185665d;

    /* renamed from: e, reason: collision with root package name */
    public ShadowFrameLayout f185666e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f185667f;

    /* renamed from: g, reason: collision with root package name */
    public View f185668g;

    /* compiled from: TopOverlayAppearance.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map_core.overlay.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C5449a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f185669a;

        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                iArr[Alignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Alignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Alignment.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f185669a = iArr;
        }
    }

    public /* synthetic */ a(com.avito.android.util.text.a aVar, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(aVar, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? true : z13);
    }

    @Override // com.avito.android.map_core.overlay.c
    @k
    public final kotlin.reflect.d<Overlay.CompactLabel> a() {
        return m0.f406844a.b(Overlay.CompactLabel.class);
    }

    @Override // com.avito.android.map_core.overlay.c
    public final void b(Overlay overlay) {
        Overlay.CompactLabel compactLabel = (Overlay.CompactLabel) overlay;
        ShadowFrameLayout shadowFrameLayout = this.f185666e;
        if (shadowFrameLayout == null) {
            shadowFrameLayout = null;
        }
        shadowFrameLayout.setShadowEnabled(this.f185664c);
        View view = this.f185668g;
        if (view == null) {
            view = null;
        }
        D6.G(view, this.f185665d);
        TextView textView = this.f185667f;
        TextView textView2 = textView != null ? textView : null;
        j.a(textView2, compactLabel.getText(), this.f185663b);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        Alignment align = compactLabel.getAlign();
        int i12 = align == null ? -1 : C5449a.f185669a[align.ordinal()];
        int i13 = 8388611;
        if (i12 != 1) {
            if (i12 == 2) {
                i13 = 17;
            } else if (i12 == 3) {
                i13 = 8388613;
            }
        }
        textView2.setGravity(i13);
    }

    @Override // com.avito.android.map_core.overlay.c
    public final void c(@k View view) {
        this.f185666e = (ShadowFrameLayout) view.findViewById(R.id.overlay_container_compact);
        this.f185667f = (TextView) view.findViewById(R.id.overlay_compact_label);
        this.f185668g = view.findViewById(R.id.overlay_compact_border);
    }

    public a(@k com.avito.android.util.text.a aVar, boolean z12, boolean z13) {
        super(R.layout.map_overlay_compactlabel);
        this.f185663b = aVar;
        this.f185664c = z12;
        this.f185665d = z13;
    }
}
