package com.avito.android.serp.adapter.replace_main_widget;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import rn0.InterfaceC47690b;

/* compiled from: ReplaceMainWidgetPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/replace_main_widget/l;", "Lcom/avito/android/serp/adapter/replace_main_widget/j;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f270691b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f270692c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f270693d = f2.b(0, 1, BufferOverflow.f410778c, 1);

    @Inject
    public l(@Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k h31.e<InterfaceC47690b> eVar) {
        this.f270691b = gVar;
        this.f270692c = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a aVar2 = (a) eVar;
        ReplaceMainWidgetItem replaceMainWidgetItem = (ReplaceMainWidgetItem) aVar;
        aVar2.f270677b = new k(replaceMainWidgetItem, this);
        aVar2.f270678c.a(replaceMainWidgetItem.f());
    }

    @Override // com.avito.android.serp.adapter.replace_main_widget.j
    @Y61.k
    /* renamed from: Y0, reason: from getter */
    public final e2 getF270693d() {
        return this.f270693d;
    }
}
