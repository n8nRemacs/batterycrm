package com.avito.android.serp.adapter.beduin_v2;

import Y61.k;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import cU0.InterfaceC27108f;
import com.avito.android.C36135w2;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.ownership.Owners;
import com.avito.beduin.v2.engine.component.z;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: BeduinV2ItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/beduin_v2/g;", "Lcom/avito/android/serp/adapter/beduin_v2/f;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.beduin_v2.feature.item.a f269017b;

    public g(@k View view, @k Screen screen, @k ScreenPerformanceTracker screenPerformanceTracker, @k com.avito.android.lib.beduin_v2.feature.item.b bVar, @k z zVar, @k InterfaceC27108f interfaceC27108f, @k C36135w2 c36135w2) {
        super(view);
        ZS.b bVar2 = new ZS.b(screen, Owners.f210448U, "serpItem");
        FrameLayout frameLayout = (FrameLayout) view;
        n<Object> nVar = C36135w2.f327457X[27];
        this.f269017b = bVar.a(bVar2, frameLayout, interfaceC27108f, screenPerformanceTracker, zVar, ((Boolean) c36135w2.f327503x.a().invoke()).booleanValue());
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f269017b.a();
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        this.f269017b.T3(((BeduinV2Item) aVar).f268998d.f268992b);
    }
}
