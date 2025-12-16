package com.avito.android.publish.slots.images_groups_recommendations.analytics;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.D6;
import com.avito.android.util.R0;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import yc.C50213a;

/* compiled from: ImagesGroupsRecommendationsShownTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/analytics/d;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f244166a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C50213a f244167b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43238h f244168c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AtomicBoolean f244169d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public boolean f244170e;

    @Inject
    public d(@k InterfaceC28373a interfaceC28373a, @k C50213a c50213a, @k R0 r02) {
        this.f244166a = interfaceC28373a;
        this.f244167b = c50213a;
        this.f244168c = U.a(r02.a());
    }

    public final void a(int i12, RecyclerView recyclerView) {
        RecyclerView.m layoutManager;
        View viewZ;
        if (i12 == -1 || (layoutManager = recyclerView.getLayoutManager()) == null || (viewZ = layoutManager.Z(i12)) == null || (viewZ.getTop() / D6.r(recyclerView)) * 100 >= 67.0f) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f244169d;
        if (atomicBoolean.get()) {
            return;
        }
        this.f244166a.c(new g(this.f244167b));
        atomicBoolean.set(true);
    }
}
