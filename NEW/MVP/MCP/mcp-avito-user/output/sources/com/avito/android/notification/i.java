package com.avito.android.notification;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import t3.InterfaceC48480k;

/* compiled from: GetAskNotificationCheckResultInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notification/i;", "Lcom/avito/android/notification/h;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final b f207444a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u3.g<SimpleTestGroupWithNone> f207445b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f207446c;

    /* compiled from: GetAskNotificationCheckResultInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/notification/i$a;", "", "<init>", "()V", "", "ASK_NOTIFICATION_GROUP_ANALYTICS_TAG", "Ljava/lang/String;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public i(@Y61.k b bVar, @InterfaceC48480k @Y61.k u3.g<SimpleTestGroupWithNone> gVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f207444a = bVar;
        this.f207445b = gVar;
        this.f207446c = interfaceC28373a;
    }

    @Override // com.avito.android.notification.h
    public final boolean a() {
        boolean zA2 = this.f207445b.f439742a.f439749b.a();
        if (!zA2) {
            this.f207446c.c(new y.a("onboarding.ask_notification.group.NONE", 0L, 2, null));
        }
        return zA2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.notification.h
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.avito.android.notification.j
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.notification.j r0 = (com.avito.android.notification.j) r0
            int r1 = r0.f207450t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207450t = r1
            goto L18
        L13:
            com.avito.android.notification.j r0 = new com.avito.android.notification.j
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f207448r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f207450t
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.C42729a0.b(r11)
            goto Lcf
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L38:
            com.avito.android.notification.i r2 = r0.f207447q
            kotlin.C42729a0.b(r11)
            goto L6d
        L3e:
            com.avito.android.notification.i r2 = r0.f207447q
            kotlin.C42729a0.b(r11)
            goto L55
        L44:
            kotlin.C42729a0.b(r11)
            r0.f207447q = r10
            r0.f207450t = r5
            com.avito.android.notification.b r11 = r10.f207444a
            java.lang.Object r11 = r11.a(r0)
            if (r11 != r1) goto L54
            return r1
        L54:
            r2 = r10
        L55:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L60
            com.avito.android.notification.a$d r11 = com.avito.android.notification.a.d.f207409a
            return r11
        L60:
            com.avito.android.notification.b r11 = r2.f207444a
            r0.f207447q = r2
            r0.f207450t = r4
            java.lang.Object r11 = r11.b(r0)
            if (r11 != r1) goto L6d
            return r1
        L6d:
            java.util.List r11 = (java.util.List) r11
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L7d
            com.avito.android.notification.b r11 = r2.f207444a
            r11.c()
            com.avito.android.notification.a$c r11 = com.avito.android.notification.a.c.f207408a
            return r11
        L7d:
            r11 = 0
            r0.f207447q = r11
            r0.f207450t = r3
            com.avito.android.analytics.statsd.y$a r11 = new com.avito.android.analytics.statsd.y$a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "onboarding.ask_notification.group."
            r0.<init>(r3)
            u3.g<com.avito.android.ab_tests.groups.SimpleTestGroupWithNone> r3 = r2.f207445b
            u3.m<T> r4 = r3.f439742a
            T r4 = r4.f439749b
            com.avito.android.ab_tests.groups.SimpleTestGroupWithNone r4 = (com.avito.android.ab_tests.groups.SimpleTestGroupWithNone) r4
            java.lang.String r4 = r4.name()
            r0.append(r4)
            java.lang.String r5 = r0.toString()
            r6 = 0
            r8 = 2
            r9 = 0
            r4 = r11
            r4.<init>(r5, r6, r8, r9)
            com.avito.android.analytics.a r0 = r2.f207446c
            r0.c(r11)
            r3.b()
            u3.m<T> r11 = r3.f439742a
            T r11 = r11.f439749b
            com.avito.android.ab_tests.groups.SimpleTestGroupWithNone r11 = (com.avito.android.ab_tests.groups.SimpleTestGroupWithNone) r11
            boolean r11 = r11.b()
            com.avito.android.notification.b r0 = r2.f207444a
            if (r11 == 0) goto Lc7
            com.avito.android.notification.a$b r11 = new com.avito.android.notification.a$b
            r0.c()
            kotlin.G0 r0 = kotlin.G0.f406611a
            r11.<init>(r0)
            goto Lcc
        Lc7:
            r0.c()
            com.avito.android.notification.a$a r11 = com.avito.android.notification.a.C6183a.f207406a
        Lcc:
            if (r11 != r1) goto Lcf
            return r1
        Lcf:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notification.i.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
