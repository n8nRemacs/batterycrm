package com.avito.android.lib.compose.design.shared.animation_view;

import Y41.p;
import android.widget.ImageView;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.lib.design.animation.AnimationView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AnimationView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AnimationView.a.d f177607l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f177608m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AnimationView.a.d dVar, v vVar, ImageView.ScaleType scaleType, int i12) {
        super(2);
        this.f177607l = dVar;
        this.f177608m = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(441);
        g.a(this.f177607l, this.f177608m, a12, iA2);
        return G0.f406611a;
    }
}
