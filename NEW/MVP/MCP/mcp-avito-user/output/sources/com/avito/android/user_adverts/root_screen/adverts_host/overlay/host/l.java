package com.avito.android.user_adverts.root_screen.adverts_host.overlay.host;

import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HostOverlayEnabler.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LTI0/c;", "shortcuts", "LBI0/d;", SingleLineInputModel.STYLE_SEARCH, "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState;", "actions", "", "<anonymous>", "(LTI0/c;LBI0/d;Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState;)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.HostOverlayEnablerKt$collectPauseResumeOverlay$2", f = "HostOverlayEnabler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class l extends SuspendLambda implements Y41.r<TI0.c, BI0.d, UserAdvertsActionsState, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ TI0.c f313210q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ BI0.d f313211r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ UserAdvertsActionsState f313212s;

    public l() {
        throw null;
    }

    @Override // Y41.r
    public final Object invoke(TI0.c cVar, BI0.d dVar, UserAdvertsActionsState userAdvertsActionsState, Continuation<? super Boolean> continuation) {
        l lVar = new l(4, continuation);
        lVar.f313210q = cVar;
        lVar.f313211r = dVar;
        lVar.f313212s = userAdvertsActionsState;
        return lVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r4) {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.C42729a0.b(r4)
            TI0.c r4 = r3.f313210q
            BI0.d r0 = r3.f313211r
            com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState r1 = r3.f313212s
            TI0.c$b r4 = r4.f15561j
            boolean r2 = r4 instanceof TI0.c.b.a
            if (r2 == 0) goto L30
            TI0.c$b$a r4 = (TI0.c.b.a) r4
            boolean r4 = r4.f15565a
            if (r4 != 0) goto L30
            boolean r4 = r0 instanceof BI0.d.C0052d
            if (r4 == 0) goto L22
            BI0.d$d r0 = (BI0.d.C0052d) r0
            boolean r4 = r0.f1324a
            if (r4 != 0) goto L30
        L22:
            com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$c r4 = r1.f314466e
            boolean r0 = r4 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState.c.C9710c
            if (r0 == 0) goto L2e
            com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$c$c r4 = (com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState.c.C9710c) r4
            boolean r4 = r4.f314480c
            if (r4 != 0) goto L30
        L2e:
            r4 = 1
            goto L31
        L30:
            r4 = 0
        L31:
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
