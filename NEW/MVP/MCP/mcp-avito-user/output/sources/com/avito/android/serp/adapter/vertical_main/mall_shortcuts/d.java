package com.avito.android.serp.adapter.vertical_main.mall_shortcuts;

import androidx.compose.runtime.internal.P;
import com.avito.android.J0;
import com.avito.android.di.module.ga;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MallShortcutsWidgetConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/d;", "Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f272985a;

    @Inject
    public d(@ga @Y61.k J0 j02) {
        this.f272985a = j02;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x000f A[SYNTHETIC] */
    @Override // com.avito.android.serp.adapter.vertical_main.mall_shortcuts.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.serp.adapter.vertical_main.mall_shortcuts.MallShortcutsWidgetItem a(@Y61.k com.avito.android.remote.model.vertical_main.MallShortcutsWidget r16) {
        /*
            r15 = this;
            java.util.List r0 = r16.getItems()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L71
            java.lang.Object r2 = r0.next()
            com.avito.android.remote.model.vertical_main.MallShortcutsWidget$Shortcut r2 = (com.avito.android.remote.model.vertical_main.MallShortcutsWidget.Shortcut) r2
            java.lang.String r4 = r2.getLayout()
            java.lang.String r5 = "S"
            boolean r5 = kotlin.jvm.internal.L.f(r4, r5)
            if (r5 == 0) goto L2c
            com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.MallShortcutItem$Layout r4 = com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.MallShortcutItem.Layout.f273006b
        L2a:
            r10 = r4
            goto L38
        L2c:
            java.lang.String r5 = "L"
            boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
            if (r4 == 0) goto L37
            com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.MallShortcutItem$Layout r4 = com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.MallShortcutItem.Layout.f273007c
            goto L2a
        L37:
            r10 = r3
        L38:
            if (r10 != 0) goto L3b
            goto L6b
        L3b:
            com.avito.android.remote.model.UniversalColor r4 = r2.getBackgroundUniversalColor()
            if (r4 != 0) goto L51
            java.lang.String r4 = r2.getBackgroundColor()
            if (r4 != 0) goto L49
            java.lang.String r4 = "warmGray4"
        L49:
            r5 = 0
            r6 = 2
            com.avito.android.remote.model.UniversalColor r3 = com.avito.android.remote.model.UniversalColorKt.universalColorOf$default(r4, r5, r6, r3)
            r11 = r3
            goto L52
        L51:
            r11 = r4
        L52:
            com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.MallShortcutItem r3 = new com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.MallShortcutItem
            com.avito.android.remote.model.text.AttributedText r6 = r2.getTitle()
            com.avito.android.deep_linking.links.DeepLink r8 = r2.getUri()
            com.avito.android.remote.model.text.AttributedText r9 = r2.getTitleWithTransfer()
            com.avito.android.remote.model.UniversalImage r12 = r2.getImage()
            r14 = 0
            r7 = 0
            r13 = 2
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L6b:
            if (r3 == 0) goto Lf
            r1.add(r3)
            goto Lf
        L71:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L78
            return r3
        L78:
            com.avito.android.serp.adapter.vertical_main.mall_shortcuts.MallShortcutsWidgetItem r0 = new com.avito.android.serp.adapter.vertical_main.mall_shortcuts.MallShortcutsWidgetItem
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mall_shortcuts_widget"
            r2.<init>(r3)
            r3 = r15
            com.avito.android.J0 r4 = r3.f272985a
            java.lang.String r2 = com.avito.android.bxcontent.mvi.entity.f.k(r4, r2)
            com.avito.android.remote.model.widget_analytics.Analytics r4 = r16.getAnalytics()
            com.avito.android.remote.model.widget_settings.Settings r5 = r16.getSettings()
            r0.<init>(r2, r1, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.vertical_main.mall_shortcuts.d.a(com.avito.android.remote.model.vertical_main.MallShortcutsWidget):com.avito.android.serp.adapter.vertical_main.mall_shortcuts.MallShortcutsWidgetItem");
    }
}
