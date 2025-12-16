package com.avito.android.ai_assistant.adapter.beduin;

import Y61.k;
import android.view.View;
import android.widget.FrameLayout;
import cU0.InterfaceC27108f;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.ownership.Owners;
import com.avito.beduin.v2.engine.component.z;
import kotlin.Metadata;

/* compiled from: BeduinItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/beduin/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/ai_assistant/adapter/beduin/e;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.beduin_v2.feature.item.a f88775b;

    public f(@k View view, @k Screen screen, @k ScreenPerformanceTracker screenPerformanceTracker, @k com.avito.android.lib.beduin_v2.feature.item.b bVar, @k z zVar, @k InterfaceC27108f interfaceC27108f) {
        super(view);
        this.f88775b = bVar.a(new ZS.b(screen, Owners.f210480e, "AssistantBeduinItem"), (FrameLayout) view, interfaceC27108f, screenPerformanceTracker, zVar, true);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f88775b.a();
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        this.f88775b.T3(((a) aVar).f88763c);
    }
}
