package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import nE.C44240b;

/* compiled from: UserAdvertsTooltipsPlayer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/e;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35695e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f315633d = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f315634a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C44240b f315635b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f315636c = C42727D.b(LazyThreadSafetyMode.f406616d, b.f315637l);

    /* compiled from: UserAdvertsTooltipsPlayer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/e$a;", "", "<init>", "()V", "", "AWAIT_ITEM_EXIST_TIMEOUT", "J", "MULTI_ACTIONS_TOOLTIP_DELAY_MILLIS", "", "MULTI_ITEM_GROUP_ONBOARDING_BOTTOM_GAP", "I", "MULTI_ITEM_GROUP_START_DELAY_MILLIS", "MULTI_ITEM_GROUP_TOOLTIP_CORNER_RADIUS", "MULTI_ITEM_GROUP_TOOLTIP_DELAY_MILLIS", "MULTI_ITEM_GROUP_TOOLTIP_PADDING_BOTTOM", "MULTI_ITEM_GROUP_TOOLTIP_PADDING_LEFT", "MULTI_ITEM_GROUP_TOOLTIP_PADDING_RIGHT", "MULTI_ITEM_GROUP_TOOLTIP_PADDING_TOP", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UserAdvertsTooltipsPlayer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/PopupWindow$OnDismissListener;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.e$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<PopupWindow.OnDismissListener> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f315637l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final PopupWindow.OnDismissListener invoke() {
            return new C35703m();
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C35695e(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k C44240b c44240b) {
        this.f315634a = aVar;
        this.f315635b = c44240b;
    }

    public static Object a(RecyclerView recyclerView, ContinuationImpl continuationImpl) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuationImpl));
        rVar.p();
        RunnableC35697g runnableC35697g = new RunnableC35697g(rVar);
        rVar.r(new C35696f(recyclerView, runnableC35697g));
        recyclerView.postOnAnimation(runnableC35697g);
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
    }

    public static Object c(RecyclerView recyclerView, ContinuationImpl continuationImpl) {
        if (recyclerView.getScrollState() == 0) {
            return G0.f406611a;
        }
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuationImpl));
        rVar.p();
        C35701k c35701k = new C35701k(recyclerView, rVar);
        rVar.r(new C35700j(recyclerView, c35701k));
        recyclerView.o(c35701k);
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
    }

    public static int d(RecyclerView.Adapter adapter, long j12, int i12, int i13) {
        if (i12 < 0) {
            i12 = 0;
        }
        int itemCount = adapter.getItemCount() - 1;
        if (i13 > itemCount) {
            i13 = itemCount;
        }
        if (i12 > i13) {
            return -1;
        }
        while (adapter.getItemId(i12) != j12) {
            if (i12 == i13) {
                return -1;
            }
            i12++;
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(androidx.recyclerview.widget.RecyclerView.Adapter r12, long r13, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.C35698h
            if (r0 == 0) goto L13
            r0 = r15
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.h r0 = (com.avito.android.user_adverts.tab_screens.adverts.tooltip.C35698h) r0
            int r1 = r0.f315643s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315643s = r1
            goto L18
        L13:
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.h r0 = new com.avito.android.user_adverts.tab_screens.adverts.tooltip.h
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f315641q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f315643s
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.C42729a0.b(r15)
            goto L62
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            kotlin.C42729a0.b(r15)
            if (r12 != 0) goto L3c
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
            return r12
        L3c:
            int r15 = r12.getItemCount()
            int r15 = r15 - r4
            r2 = 0
            int r15 = d(r12, r13, r2, r15)
            if (r15 == r3) goto L4d
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r15)
            return r12
        L4d:
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.i r15 = new com.avito.android.user_adverts.tab_screens.adverts.tooltip.i
            r10 = 0
            r5 = r15
            r6 = r12
            r7 = r11
            r8 = r13
            r5.<init>(r6, r7, r8, r10)
            r0.f315643s = r4
            r12 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r15 = kotlinx.coroutines.D1.c(r12, r15, r0)
            if (r15 != r1) goto L62
            return r1
        L62:
            java.lang.Integer r15 = (java.lang.Integer) r15
            if (r15 == 0) goto L6f
            int r12 = r15.intValue()
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
            return r12
        L6f:
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.tooltip.C35695e.b(androidx.recyclerview.widget.RecyclerView$Adapter, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.avito.android.user_adverts_views_pub.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.avito.android.user_adverts_views_pub.c.b r26, com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.C9780c r27, java.lang.String r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.tooltip.C35695e.e(com.avito.android.user_adverts_views_pub.c$b, com.avito.android.user_adverts.tab_screens.adverts.tooltip.c$c, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(androidx.recyclerview.widget.RecyclerView r10, com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.b r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.tooltip.C35695e.f(androidx.recyclerview.widget.RecyclerView, com.avito.android.user_adverts.tab_screens.adverts.tooltip.c$b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, android.widget.PopupWindow, com.avito.android.lib.design.tooltip.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.l r21, com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.b r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.tooltip.C35695e.g(com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.l, com.avito.android.user_adverts.tab_screens.adverts.tooltip.c$b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(androidx.recyclerview.widget.RecyclerView r18, com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.C9780c r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.tooltip.C35695e.h(androidx.recyclerview.widget.RecyclerView, com.avito.android.user_adverts.tab_screens.adverts.tooltip.c$c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(@Y61.k com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c r7, @Y61.k androidx.recyclerview.widget.RecyclerView r8, @Y61.k android.view.View r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.B
            if (r0 == 0) goto L13
            r0 = r10
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.B r0 = (com.avito.android.user_adverts.tab_screens.adverts.tooltip.B) r0
            int r1 = r0.f315555t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315555t = r1
            goto L18
        L13:
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.B r0 = new com.avito.android.user_adverts.tab_screens.adverts.tooltip.B
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f315553r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f315555t
            r3 = 8
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            android.view.View r9 = r0.f315552q
            kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L30
            goto L77
        L30:
            r7 = move-exception
            goto L84
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            android.view.View r9 = r0.f315552q
            kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L30
            goto L5f
        L40:
            kotlin.C42729a0.b(r10)
            boolean r10 = r7 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.a     // Catch: java.lang.Throwable -> L30
            if (r10 == 0) goto L4a
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.d$d r7 = com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35694d.C9781d.f315632a     // Catch: java.lang.Throwable -> L30
            goto L7a
        L4a:
            boolean r10 = r7 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.b     // Catch: java.lang.Throwable -> L30
            r2 = 0
            if (r10 == 0) goto L63
            r9.setVisibility(r2)     // Catch: java.lang.Throwable -> L30
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.c$b r7 = (com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.b) r7     // Catch: java.lang.Throwable -> L30
            r0.f315552q = r9     // Catch: java.lang.Throwable -> L30
            r0.f315555t = r5     // Catch: java.lang.Throwable -> L30
            java.lang.Object r10 = r6.f(r8, r7, r0)     // Catch: java.lang.Throwable -> L30
            if (r10 != r1) goto L5f
            return r1
        L5f:
            r7 = r10
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.d r7 = (com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35694d) r7     // Catch: java.lang.Throwable -> L30
            goto L7a
        L63:
            boolean r10 = r7 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.C9780c     // Catch: java.lang.Throwable -> L30
            if (r10 == 0) goto L7e
            r9.setVisibility(r2)     // Catch: java.lang.Throwable -> L30
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.c$c r7 = (com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c.C9780c) r7     // Catch: java.lang.Throwable -> L30
            r0.f315552q = r9     // Catch: java.lang.Throwable -> L30
            r0.f315555t = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r10 = r6.h(r8, r7, r0)     // Catch: java.lang.Throwable -> L30
            if (r10 != r1) goto L77
            return r1
        L77:
            r7 = r10
            com.avito.android.user_adverts.tab_screens.adverts.tooltip.d r7 = (com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35694d) r7     // Catch: java.lang.Throwable -> L30
        L7a:
            r9.setVisibility(r3)
            return r7
        L7e:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L30
            r7.<init>()     // Catch: java.lang.Throwable -> L30
            throw r7     // Catch: java.lang.Throwable -> L30
        L84:
            r9.setVisibility(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.tooltip.C35695e.i(com.avito.android.user_adverts.tab_screens.adverts.tooltip.c, androidx.recyclerview.widget.RecyclerView, android.view.View, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
