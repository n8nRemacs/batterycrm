package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import cJ0.InterfaceC27054h;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListData;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsTooltipsQueue.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/P;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UserAdvertsListData f315616a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27054h f315617b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f315618c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f315619d = new kotlinx.coroutines.sync.d();

    @Inject
    public P(@Y61.k UserAdvertsListData userAdvertsListData, @Y61.k InterfaceC27054h interfaceC27054h, @Y61.k R0 r02) {
        this.f315616a = userAdvertsListData;
        this.f315617b = interfaceC27054h;
        this.f315618c = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.avito.android.user_adverts.tab_screens.adverts.tooltip.P r4, com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.I
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.I r0 = (com.avito.android.user_adverts.tab_screens.adverts.tooltip.I) r0
            int r1 = r0.f315584v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315584v = r1
            goto L18
        L13:
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.I r0 = new com.avito.android.user_adverts.tab_screens.adverts.tooltip.I
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f315582t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f315584v
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            kotlinx.coroutines.sync.d r4 = r0.f315581s
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.c r5 = r0.f315580r
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.P r0 = r0.f315579q
            kotlin.C42729a0.b(r6)
            r6 = r4
            r4 = r0
            goto L4d
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.sync.d r6 = r4.f315619d
            r0.f315579q = r4
            r0.f315580r = r5
            r0.f315581s = r6
            r0.f315584v = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 != r1) goto L4d
            goto L7d
        L4d:
            r0 = 0
            boolean r1 = r5 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.a     // Catch: java.lang.Throwable -> L68
            r2 = 0
            if (r1 == 0) goto L55
        L53:
            r3 = r2
            goto L76
        L55:
            boolean r1 = r5 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.b     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L6a
            cJ0.h r5 = r4.f315617b     // Catch: java.lang.Throwable -> L68
            boolean r5 = r5.d()     // Catch: java.lang.Throwable -> L68
            if (r5 != 0) goto L53
            com.avito.android.user_adverts.tab_screens.UserAdvertsListData r4 = r4.f315616a     // Catch: java.lang.Throwable -> L68
            int r4 = r4.f314690c     // Catch: java.lang.Throwable -> L68
            if (r4 != 0) goto L53
            goto L76
        L68:
            r4 = move-exception
            goto L84
        L6a:
            boolean r5 = r5 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.C9780c     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L7e
            cJ0.h r4 = r4.f315617b     // Catch: java.lang.Throwable -> L68
            boolean r4 = r4.c()     // Catch: java.lang.Throwable -> L68
            if (r4 != 0) goto L53
        L76:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)     // Catch: java.lang.Throwable -> L68
            r6.d(r0)
        L7d:
            return r1
        L7e:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L68
            r4.<init>()     // Catch: java.lang.Throwable -> L68
            throw r4     // Catch: java.lang.Throwable -> L68
        L84:
            r6.d(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.tooltip.P.a(com.avito.android.user_adverts.tab_screens.adverts.tooltip.P, com.avito.android.user_adverts.tab_screens.adverts.tooltip.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.user_adverts.tab_screens.adverts.tooltip.P r4, com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.O
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.O r0 = (com.avito.android.user_adverts.tab_screens.adverts.tooltip.O) r0
            int r1 = r0.f315615v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315615v = r1
            goto L18
        L13:
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.O r0 = new com.avito.android.user_adverts.tab_screens.adverts.tooltip.O
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f315613t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f315615v
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            kotlinx.coroutines.sync.d r4 = r0.f315612s
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.c r5 = r0.f315611r
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.P r0 = r0.f315610q
            kotlin.C42729a0.b(r6)
            r6 = r4
            r4 = r0
            goto L4d
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.sync.d r6 = r4.f315619d
            r0.f315610q = r4
            r0.f315611r = r5
            r0.f315612s = r6
            r0.f315615v = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 != r1) goto L4d
            goto L6d
        L4d:
            r0 = 0
            boolean r1 = r5 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.b     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L5a
            cJ0.h r4 = r4.f315617b     // Catch: java.lang.Throwable -> L58
            r4.b()     // Catch: java.lang.Throwable -> L58
            goto L66
        L58:
            r4 = move-exception
            goto L6e
        L5a:
            boolean r1 = r5 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.C9780c     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L64
            cJ0.h r4 = r4.f315617b     // Catch: java.lang.Throwable -> L58
            r4.a()     // Catch: java.lang.Throwable -> L58
            goto L66
        L64:
            boolean r4 = r5 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.a     // Catch: java.lang.Throwable -> L58
        L66:
            kotlin.G0 r4 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L58
            r6.d(r0)
            kotlin.G0 r1 = kotlin.G0.f406611a
        L6d:
            return r1
        L6e:
            r6.d(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.tooltip.P.b(com.avito.android.user_adverts.tab_screens.adverts.tooltip.P, com.avito.android.user_adverts.tab_screens.adverts.tooltip.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
