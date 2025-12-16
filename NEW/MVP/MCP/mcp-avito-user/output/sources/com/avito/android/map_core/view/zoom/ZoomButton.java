package com.avito.android.map_core.view.zoom;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.lib.util.c;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ZoomButton.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/map_core/view/zoom/ZoomButton;", "Landroidx/cardview/widget/CardView;", "LLV/b;", "Lcom/avito/android/map_core/view/zoom/a;", "newState", "Lkotlin/G0;", "setState", "(Lcom/avito/android/map_core/view/zoom/a;)V", "Landroid/widget/FrameLayout;", "b", "Lkotlin/C;", "getZoomInButton", "()Landroid/widget/FrameLayout;", "zoomInButton", "c", "getZoomOutButton", "zoomOutButton", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ZoomButton extends CardView implements LV.b<com.avito.android.map_core.view.zoom.a> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f185826d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C zoomInButton;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C zoomOutButton;

    /* compiled from: ZoomButton.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/FrameLayout;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    final class a extends N implements Y41.a<FrameLayout> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final FrameLayout invoke() {
            View viewFindViewById = ZoomButton.this.findViewById(R.id.zoomIn);
            if (viewFindViewById != null) {
                return (FrameLayout) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
    }

    /* compiled from: ZoomButton.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/FrameLayout;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    final class b extends N implements Y41.a<FrameLayout> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final FrameLayout invoke() {
            View viewFindViewById = ZoomButton.this.findViewById(R.id.zoomOut);
            if (viewFindViewById != null) {
                return (FrameLayout) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
    }

    @j
    public ZoomButton(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final FrameLayout getZoomInButton() {
        return (FrameLayout) this.zoomInButton.getValue();
    }

    private final FrameLayout getZoomOutButton() {
        return (FrameLayout) this.zoomOutButton.getValue();
    }

    @Override // LV.b
    public void setState(@k com.avito.android.map_core.view.zoom.a newState) {
        if (new c(newState, null).f181333c) {
            return;
        }
        Y41.a<G0> aVar = newState.f185831a;
        if (!new c(aVar, null).f181333c && aVar != null) {
            getZoomInButton().setOnClickListener(new com.avito.android.lib.design.list_item.a(20, aVar));
        }
        Y41.a<G0> aVar2 = newState.f185832b;
        if (new c(aVar2, null).f181333c || aVar2 == null) {
            return;
        }
        getZoomOutButton().setOnClickListener(new com.avito.android.lib.design.list_item.a(21, aVar2));
    }

    public ZoomButton(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.zoomInButton = C42727D.c(new a());
        this.zoomOutButton = C42727D.c(new b());
        View.inflate(context, R.layout.search_map_zoom_button, this);
    }
}
