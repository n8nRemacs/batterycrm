package com.avito.android.serp.adapter.mini_menu;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MiniMenuWidgetConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/p;", "Lcom/avito/android/serp/adapter/mini_menu/o;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements o {
    @Inject
    public p() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    @Override // com.avito.android.serp.adapter.mini_menu.o
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.serp.adapter.mini_menu.MiniMenuBlockItem b(@Y61.k com.avito.android.remote.model.Shortcuts r17) {
        /*
            r16 = this;
            java.util.List r0 = r17.getMiniMenuItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L14:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r0.next()
            int r5 = r2 + 1
            if (r2 < 0) goto L78
            com.avito.android.remote.model.serp.MiniMenuItemWidget r3 = (com.avito.android.remote.model.serp.MiniMenuItemWidget) r3
            java.lang.String r8 = r3.getTitle()
            if (r8 != 0) goto L2c
        L2a:
            r15 = r1
            goto L71
        L2c:
            com.avito.android.deep_linking.links.DeepLink r9 = r3.getUri()
            if (r9 != 0) goto L33
            goto L2a
        L33:
            com.avito.android.remote.model.UniversalImage r6 = r3.getImage()
            com.avito.android.remote.model.serp.TextBadge r7 = r3.getBadge()
            if (r6 == 0) goto L44
            com.avito.android.serp.adapter.mini_menu.item.Badge$ImageBadge r7 = new com.avito.android.serp.adapter.mini_menu.item.Badge$ImageBadge
            r7.<init>(r6)
            r10 = r7
            goto L5a
        L44:
            if (r7 == 0) goto L59
            com.avito.android.serp.adapter.mini_menu.item.Badge$TextBadge r6 = new com.avito.android.serp.adapter.mini_menu.item.Badge$TextBadge
            java.lang.String r10 = r7.getTitle()
            java.lang.String r11 = r7.getBackgroundColor()
            java.lang.String r7 = r7.getTextColor()
            r6.<init>(r10, r11, r7)
            r10 = r6
            goto L5a
        L59:
            r10 = r1
        L5a:
            if (r10 != 0) goto L5d
            goto L2a
        L5d:
            com.avito.android.serp.adapter.mini_menu.item.MiniMenuItem r15 = new com.avito.android.serp.adapter.mini_menu.item.MiniMenuItem
            java.lang.String r6 = "MiniMenuItem_"
            java.lang.String r7 = AK.c.g(r2, r6)
            com.avito.android.remote.model.serp.Onboarding r11 = r3.getOnboarding()
            r13 = 32
            r14 = 0
            r12 = 0
            r6 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
        L71:
            if (r15 == 0) goto L76
            r4.add(r15)
        L76:
            r2 = r5
            goto L14
        L78:
            kotlin.collections.C42745f0.H0()
            throw r1
        L7c:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L83
            return r1
        L83:
            com.avito.android.serp.adapter.mini_menu.MiniMenuBlockItem r0 = new com.avito.android.serp.adapter.mini_menu.MiniMenuBlockItem
            r10 = 124(0x7c, float:1.74E-43)
            r11 = 0
            java.lang.String r3 = "MiniMenu"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.mini_menu.p.b(com.avito.android.remote.model.Shortcuts):com.avito.android.serp.adapter.mini_menu.MiniMenuBlockItem");
    }
}
