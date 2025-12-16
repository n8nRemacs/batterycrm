package com.avito.android.universal_map.map.common.marker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ClusterMarkerManager.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/b;", "Lcom/avito/android/universal_map/map/common/marker/a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f304968a;

    /* renamed from: b, reason: collision with root package name */
    public final int f304969b;

    @Inject
    public b(@Y61.k Context context, @Y61.k d dVar) {
        this.f304968a = dVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.universal_map_cluster, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        View viewFindViewById = viewInflate.findViewById(R.id.text_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText("2222");
        viewInflate.measure(0, 0);
        this.f304969b = kotlin.math.b.b((viewInflate.getMeasuredHeight() / 2) / context.getResources().getDisplayMetrics().density);
    }

    @Override // com.avito.android.universal_map.map.common.marker.a
    @Y61.l
    public final Float a(double d12, float f12) {
        return this.f304968a.a(this.f304969b, d12, f12);
    }
}
