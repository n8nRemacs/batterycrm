package com.avito.android.serp.adapter.vertical_main.mini_search_widget;

import Xr0.InterfaceC17042a;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MiniSearchWidgetItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mini_search_widget/m;", "Lcom/avito/android/serp/adapter/vertical_main/mini_search_widget/j;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f273065b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f273066c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC17042a f273067d;

    @Inject
    public m(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k InterfaceC17042a interfaceC17042a) {
        this.f273065b = aVar;
        this.f273066c = gVar;
        this.f273067d = interfaceC17042a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r8, TV0.a r9, int r10) {
        /*
            r7 = this;
            com.avito.android.serp.adapter.vertical_main.mini_search_widget.o r8 = (com.avito.android.serp.adapter.vertical_main.mini_search_widget.o) r8
            com.avito.android.serp.adapter.vertical_main.mini_search_widget.MiniSearchWidgetItem r9 = (com.avito.android.serp.adapter.vertical_main.mini_search_widget.MiniSearchWidgetItem) r9
            com.avito.android.remote.model.vertical_main.MiniSearchWidgetAction r0 = r9.f273032d
            if (r0 == 0) goto L13
            java.lang.Boolean r1 = r0.isFilterIconVisible()
            if (r1 == 0) goto L13
            boolean r1 = r1.booleanValue()
            goto L14
        L13:
            r1 = 1
        L14:
            com.avito.android.remote.model.text.AttributedText r2 = r9.f273031c
            r8.w(r2)
            r2 = 0
            if (r0 == 0) goto L21
            com.avito.android.remote.model.text.AttributedText r3 = r0.getTitle()
            goto L22
        L21:
            r3 = r2
        L22:
            r8.K50(r3)
            if (r0 == 0) goto L2c
            com.avito.android.remote.model.text.AttributedText r3 = r0.getDescription()
            goto L2d
        L2c:
            r3 = r2
        L2d:
            r8.nL(r3)
            r8.GM(r1)
            r3 = 0
            r4 = 8
            r5 = 16
            if (r1 == 0) goto L4b
            if (r0 == 0) goto L41
            com.avito.android.remote.model.text.AttributedText r6 = r0.getDescription()
            goto L42
        L41:
            r6 = r2
        L42:
            if (r6 == 0) goto L4b
            r8.Qy(r4, r5, r3)
            r8.KU(r4, r5)
            goto L7f
        L4b:
            if (r1 == 0) goto L5b
            if (r0 == 0) goto L54
            com.avito.android.remote.model.text.AttributedText r6 = r0.getDescription()
            goto L55
        L54:
            r6 = r2
        L55:
            if (r6 != 0) goto L5b
            r8.Qy(r4, r5, r5)
            goto L7f
        L5b:
            if (r1 != 0) goto L70
            if (r0 == 0) goto L64
            com.avito.android.remote.model.text.AttributedText r4 = r0.getDescription()
            goto L65
        L64:
            r4 = r2
        L65:
            if (r4 == 0) goto L70
            r0 = 11
            r8.Qy(r5, r0, r3)
            r8.KU(r5, r5)
            goto L7f
        L70:
            if (r1 != 0) goto L7f
            if (r0 == 0) goto L79
            com.avito.android.remote.model.text.AttributedText r0 = r0.getDescription()
            goto L7a
        L79:
            r0 = r2
        L7a:
            if (r0 != 0) goto L7f
            r8.Qy(r5, r5, r5)
        L7f:
            com.avito.android.serp.adapter.vertical_main.mini_search_widget.k r0 = new com.avito.android.serp.adapter.vertical_main.mini_search_widget.k
            r0.<init>(r9, r7, r10)
            r8.U(r0)
            com.avito.android.serp.adapter.vertical_main.mini_search_widget.l r10 = new com.avito.android.serp.adapter.vertical_main.mini_search_widget.l
            r10.<init>(r7)
            r8.hr(r10)
            com.avito.android.serp.adapter.vertical_main.mini_search_widget.MiniSearchWidgetRecentSearches r9 = r9.f273034f
            if (r9 == 0) goto L95
            java.util.ArrayList r2 = r9.f273041b
        L95:
            r8.mQ(r2)
            if (r9 == 0) goto La7
            com.avito.android.serp.adapter.vertical_main.mini_search_widget.MiniSearchWidgetRecentSearches$Analytics r8 = r9.f273042c
            if (r8 == 0) goto La7
            com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent r8 = r8.f273043b
            if (r8 == 0) goto La7
            Xr0.a r9 = r7.f273067d
            r9.a(r8)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.vertical_main.mini_search_widget.m.O5(TV0.e, TV0.a, int):void");
    }
}
