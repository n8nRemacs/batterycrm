package com.avito.android.social_management.adapter.available;

import Y61.k;
import kotlin.Metadata;

/* compiled from: AvailableItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/adapter/available/e;", "Lcom/avito/android/social_management/adapter/available/b;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f284503b;

    public e(@k com.jakewharton.rxrelay3.c cVar) {
        this.f284503b = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r2, TV0.a r3, int r4) {
        /*
            r1 = this;
            com.avito.android.social_management.adapter.available.f r2 = (com.avito.android.social_management.adapter.available.f) r2
            com.avito.android.social_management.adapter.SocialItem$Available r3 = (com.avito.android.social_management.adapter.SocialItem.Available) r3
            com.avito.android.remote.model.social.SocialNetwork r4 = r3.f284476c
            java.lang.String r0 = r4.getTitle()
            r2.m6(r0)
            java.lang.String r4 = r4.getType()
            int r0 = r4.hashCode()
            switch(r0) {
                case -1905968092: goto L61;
                case -1459150334: goto L55;
                case 3305: goto L49;
                case 3548: goto L3d;
                case 3765: goto L31;
                case 93029210: goto L25;
                case 112209715: goto L19;
                default: goto L18;
            }
        L18:
            goto L69
        L19:
            java.lang.String r0 = "vk-id"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L22
            goto L69
        L22:
            com.avito.android.component.info_block.ConnectionLabel r4 = com.avito.android.component.info_block.ConnectionLabel.f125214c
            goto L6d
        L25:
            java.lang.String r0 = "apple"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2e
            goto L69
        L2e:
            com.avito.android.component.info_block.ConnectionLabel r4 = com.avito.android.component.info_block.ConnectionLabel.f125218g
            goto L6d
        L31:
            java.lang.String r0 = "vk"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L3a
            goto L69
        L3a:
            com.avito.android.component.info_block.ConnectionLabel r4 = com.avito.android.component.info_block.ConnectionLabel.f125214c
            goto L6d
        L3d:
            java.lang.String r0 = "ok"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L46
            goto L69
        L46:
            com.avito.android.component.info_block.ConnectionLabel r4 = com.avito.android.component.info_block.ConnectionLabel.f125216e
            goto L6d
        L49:
            java.lang.String r0 = "gp"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L52
            goto L69
        L52:
            com.avito.android.component.info_block.ConnectionLabel r4 = com.avito.android.component.info_block.ConnectionLabel.f125215d
            goto L6d
        L55:
            java.lang.String r0 = "esia-id"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L5e
            goto L69
        L5e:
            com.avito.android.component.info_block.ConnectionLabel r4 = com.avito.android.component.info_block.ConnectionLabel.f125217f
            goto L6d
        L61:
            java.lang.String r0 = "avitofake"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L6b
        L69:
            r4 = 0
            goto L6d
        L6b:
            com.avito.android.component.info_block.ConnectionLabel r4 = com.avito.android.component.info_block.ConnectionLabel.f125219h
        L6d:
            if (r4 == 0) goto L72
            int r4 = r4.f125222b
            goto L73
        L72:
            r4 = 0
        L73:
            r2.setIcon(r4)
            io.reactivex.rxjava3.disposables.c r4 = new io.reactivex.rxjava3.disposables.c
            r4.<init>()
            com.avito.android.social_management.adapter.available.c r0 = new com.avito.android.social_management.adapter.available.c
            r0.<init>(r2, r4)
            r2.d(r0)
            io.reactivex.rxjava3.core.z r2 = r2.A()
            com.avito.android.social_management.adapter.available.d r0 = new com.avito.android.social_management.adapter.available.d
            r0.<init>(r1, r3)
            io.reactivex.rxjava3.disposables.d r2 = r2.t0(r0)
            r4.b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.social_management.adapter.available.e.O5(TV0.e, TV0.a, int):void");
    }
}
