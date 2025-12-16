package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinToggleFavoriteStatusAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinToggleFavoriteStatusActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/x1;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinToggleFavoriteStatusAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class x1 implements InterfaceC15523b<BeduinToggleFavoriteStatusAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f100515a;

    @Inject
    public x1(@Y61.k com.avito.android.favorite.h hVar) {
        this.f100515a = hVar;
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
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    @Override // Ui.InterfaceC15523b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.avito.android.beduin_models.BeduinAction r13) {
        /*
            r12 = this;
            com.avito.android.beduin.common.action.BeduinToggleFavoriteStatusAction r13 = (com.avito.android.beduin.common.action.BeduinToggleFavoriteStatusAction) r13
            java.lang.String r1 = r13.getAdvertId()
            java.lang.String r0 = r13.getFromPage()
            java.lang.String r2 = r13.getContext()
            int r3 = r0.hashCode()
            switch(r3) {
                case -2061635299: goto L45;
                case 3046176: goto L36;
                case 3242771: goto L26;
                case 586052842: goto L16;
                default: goto L15;
            }
        L15:
            goto L4d
        L16:
            java.lang.String r3 = "favourites"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L1f
            goto L4d
        L1f:
            com.avito.android.favorite.a$e r0 = new com.avito.android.favorite.a$e
            r0.<init>(r2)
        L24:
            r2 = r0
            goto L59
        L26:
            java.lang.String r3 = "item"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L2f
            goto L4d
        L2f:
            com.avito.android.favorite.a$f r0 = new com.avito.android.favorite.a$f
            r4 = 0
            r0.<init>(r3, r2, r4)
            goto L24
        L36:
            java.lang.String r3 = "cart"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3f
            goto L4d
        L3f:
            com.avito.android.favorite.a$b r0 = new com.avito.android.favorite.a$b
            r0.<init>(r2)
            goto L24
        L45:
            java.lang.String r3 = "snippet"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L53
        L4d:
            com.avito.android.favorite.a$b r0 = new com.avito.android.favorite.a$b
            r0.<init>(r2)
            goto L24
        L53:
            com.avito.android.favorite.a$m r0 = new com.avito.android.favorite.a$m
            r0.<init>(r2)
            goto L24
        L59:
            boolean r13 = r13.getIsFavorite()
            r3 = r13 ^ 1
            r9 = 0
            r11 = 2016(0x7e0, float:2.825E-42)
            com.avito.android.favorite.h r0 = r12.f100515a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            io.reactivex.rxjava3.core.I r13 = com.avito.android.favorite.h.a.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            l41.g<java.lang.Object> r0 = io.reactivex.rxjava3.internal.functions.a.f401994d
            l41.g<java.lang.Throwable> r1 = io.reactivex.rxjava3.internal.functions.a.f401996f
            r13.x(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.actionhandler.x1.o(com.avito.android.beduin_models.BeduinAction):void");
    }
}
