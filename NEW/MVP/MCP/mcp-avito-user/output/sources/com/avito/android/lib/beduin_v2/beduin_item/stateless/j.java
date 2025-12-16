package com.avito.android.lib.beduin_v2.beduin_item.stateless;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.widget.FrameLayout;
import cU.s;
import cU.t;
import cU.v;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.avito.beduin.v2.engine.component.B;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.BeduinView;
import kotlin.AbstractC40048c;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;

/* compiled from: BeduinItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/beduin_item/stateless/j;", "Lcom/avito/android/lib/beduin_v2/beduin_item/stateless/h;", "Lcom/avito/konveyor/util/d;", "Lcom/avito/android/lib/beduin_v2/beduin_item/stateless/a;", "_design-modules_beduin-v2_beduin-item_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j extends h implements com.avito.konveyor.util.d<a> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f175477e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> f175478b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BeduinView f175479c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public C43238h f175480d;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@k FrameLayout frameLayout, @k ScreenPerformanceTracker screenPerformanceTracker, @k aU0.b bVar, @k B b12, @k x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> xVar) {
        super(frameLayout);
        this.f175478b = xVar;
        Context context = frameLayout.getContext();
        t tVarA = ((s.b) C29972i.a(C29972i.b(context), s.b.class)).fd().a(context, screenPerformanceTracker, bVar, v.f57891a, b12);
        BeduinView beduinView = new BeduinView(context, null, 0, 0, 14, null);
        A aB2 = tVarA.b();
        com.avito.beduin.v2.theme.k kVarA = tVarA.a();
        beduinView.f337913c = aB2;
        beduinView.f337914d = kVarA;
        this.f175479c = beduinView;
        frameLayout.removeAllViews();
        frameLayout.addView(beduinView);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        C43238h c43238h = this.f175480d;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f175480d = null;
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        a aVar2 = (a) aVar;
        C43238h c43238h = this.f175480d;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        C43238h c43238hA = U.a(K.f411877a.y());
        C43259k.d(c43238hA, null, null, new i(this, aVar2.f175461b, null), 3);
        this.f175480d = c43238hA;
    }
}
