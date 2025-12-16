package com.avito.android.map_core.view.marker;

import android.widget.LinearLayout;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MarkerPinView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class c extends N implements Y41.a<LinearLayout> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MarkerPinView f185800l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MarkerPinView markerPinView) {
        super(0);
        this.f185800l = markerPinView;
    }

    @Override // Y41.a
    public final LinearLayout invoke() {
        return (LinearLayout) this.f185800l.findViewById(R.id.marker_pin_container);
    }
}
