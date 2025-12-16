package com.avito.android.ai_assistant.adapter.beduin;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import iT.InterfaceC41342b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinItemBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/beduin/c;", "Lcom/avito/android/ai_assistant/adapter/beduin/b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C28478k f88764a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f88765b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.beduin_v2.feature.item.b f88766c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC41342b f88767d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.konveyor.util.b f88768e = com.avito.android.actions_sheet.a.r(com.avito.konveyor.util.c.f338562a);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final g.a<f> f88769f = new g.a<>(R.layout.ai_assistant_beduin_item, new a());

    /* compiled from: BeduinItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/ai_assistant/adapter/beduin/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/ai_assistant/adapter/beduin/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, f> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            c cVar = c.this;
            Screen screen = cVar.f88764a.f90636a;
            InterfaceC41342b interfaceC41342b = cVar.f88767d;
            return new f(view2, screen, cVar.f88765b, cVar.f88766c, interfaceC41342b.invoke().H4(), interfaceC41342b.invoke().Ed());
        }
    }

    @Inject
    public c(@k C28478k c28478k, @k ScreenPerformanceTracker screenPerformanceTracker, @k com.avito.android.lib.beduin_v2.feature.item.b bVar, @k InterfaceC41342b interfaceC41342b) {
        this.f88764a = c28478k;
        this.f88765b = screenPerformanceTracker;
        this.f88766c = bVar;
        this.f88767d = interfaceC41342b;
    }

    @Override // TV0.b
    @k
    public final TV0.d<e, com.avito.android.ai_assistant.adapter.beduin.a> a() {
        return this.f88768e;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f88769f;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.ai_assistant.adapter.beduin.a;
    }
}
