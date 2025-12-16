package com.avito.android.beduin.common.component.grid_snippet_skeleton;

import Y61.k;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.Corners;
import com.avito.android.beduin.common.utils.H;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.y6;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BeduinGridSnippetSkeletonLayout.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f101424a = y6.b(12);

    /* renamed from: b, reason: collision with root package name */
    public static final int f101425b = y6.b(12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f101426c = y6.b(8);

    /* renamed from: d, reason: collision with root package name */
    public static final int f101427d = y6.b(10);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final List<Float> f101428e = C42745f0.U(Float.valueOf(1.0f), Float.valueOf(0.87f), Float.valueOf(0.5f));

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final BeduinContainerBackground f101429f = new BeduinContainerBackground(new UniversalColor("warmGray8", null, null), null, new Corners(6, null, null, null, null, null, 32, null), null, null, null, null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final BeduinContainerBackground f101430g = new BeduinContainerBackground(new UniversalColor("warmGray8", null, null), null, new Corners(2, null, null, null, null, null, 32, null), null, null, null, null);

    public static final void a(SimpleDraweeView simpleDraweeView, BeduinContainerBackground beduinContainerBackground) {
        Integer numD;
        Integer numE;
        Integer numH;
        Integer numG;
        GW0.a hierarchy = simpleDraweeView.getHierarchy();
        RoundingParams roundingParams = new RoundingParams();
        Corners corners = beduinContainerBackground.getCorners();
        float fB2 = 0.0f;
        float fB3 = (corners == null || (numG = corners.g()) == null) ? 0.0f : y6.b(numG.intValue());
        Corners corners2 = beduinContainerBackground.getCorners();
        float fB4 = (corners2 == null || (numH = corners2.h()) == null) ? 0.0f : y6.b(numH.intValue());
        Corners corners3 = beduinContainerBackground.getCorners();
        float fB5 = (corners3 == null || (numE = corners3.e()) == null) ? 0.0f : y6.b(numE.intValue());
        Corners corners4 = beduinContainerBackground.getCorners();
        if (corners4 != null && (numD = corners4.d()) != null) {
            fB2 = y6.b(numD.intValue());
        }
        roundingParams.d(fB3, fB4, fB5, fB2);
        hierarchy.s(roundingParams);
        UniversalColor color = beduinContainerBackground.getColor();
        if (color != null) {
            simpleDraweeView.getHierarchy().o(H.a(simpleDraweeView.getContext(), color), 1);
        }
    }
}
