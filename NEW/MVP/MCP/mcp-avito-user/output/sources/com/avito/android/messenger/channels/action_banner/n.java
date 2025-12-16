package com.avito.android.messenger.channels.action_banner;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.BannerEvent;
import com.avito.android.messenger.channels.action_banner.d;
import com.avito.android.util.C;
import jM.InterfaceC42283a;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: ChannelsListBannerInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/action_banner/n;", "Lcom/avito/android/messenger/channels/action_banner/g;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f186757a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f186758b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I30.d f186759c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42283a f186760d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f186761e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f186762f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.filter.j f186763g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f186764h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C f186765i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final JY.a f186766j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public String f186767k;

    @Inject
    public n(@Y61.k e eVar, @Y61.k a aVar, @Y61.k I30.d dVar, @Y61.k InterfaceC42283a interfaceC42283a, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k com.avito.android.server_time.f fVar, @Y61.k com.avito.android.messenger.channels.filter.j jVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C c12, @Y61.k JY.a aVar2) {
        this.f186757a = eVar;
        this.f186758b = aVar;
        this.f186759c = dVar;
        this.f186760d = interfaceC42283a;
        this.f186761e = interfaceC47842z;
        this.f186762f = fVar;
        this.f186763g = jVar;
        this.f186764h = interfaceC28373a;
        this.f186765i = c12;
        this.f186766j = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.messenger.channels.action_banner.g
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.l com.avito.android.messenger.channels.action_banner.d r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.avito.android.messenger.channels.action_banner.m
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.messenger.channels.action_banner.m r0 = (com.avito.android.messenger.channels.action_banner.m) r0
            int r1 = r0.f186756u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f186756u = r1
            goto L18
        L13:
            com.avito.android.messenger.channels.action_banner.m r0 = new com.avito.android.messenger.channels.action_banner.m
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f186754s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f186756u
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.avito.android.messenger.channels.action_banner.d r8 = r0.f186753r
            com.avito.android.messenger.channels.action_banner.n r0 = r0.f186752q
            kotlin.C42729a0.b(r9)
            goto L58
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.C42729a0.b(r9)
            com.avito.android.messenger.channels.filter.j r9 = r7.f186763g
            java.lang.Boolean r9 = r9.a()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            boolean r9 = kotlin.jvm.internal.L.f(r9, r2)
            if (r9 == 0) goto L4a
            return r4
        L4a:
            r0.f186752q = r7
            r0.f186753r = r8
            r0.f186756u = r3
            java.lang.Object r9 = r7.d(r0)
            if (r9 != r1) goto L57
            return r1
        L57:
            r0 = r7
        L58:
            java.util.List r9 = (java.util.List) r9
            if (r8 == 0) goto L8d
            java.util.Iterator r1 = r9.iterator()
            r2 = 0
        L61:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L77
            java.lang.Object r5 = r1.next()
            com.avito.android.messenger.channels.action_banner.d r5 = (com.avito.android.messenger.channels.action_banner.d) r5
            int r5 = r5.f186716a
            int r6 = r8.f186716a
            if (r5 != r6) goto L74
            goto L78
        L74:
            int r2 = r2 + 1
            goto L61
        L77:
            r2 = -1
        L78:
            if (r2 < 0) goto L8d
            int r2 = r2 + r3
            int r8 = r9.size()
            int r8 = r8 - r3
            if (r2 > r8) goto L8d
            java.lang.Object r8 = kotlin.collections.C42745f0.K(r2, r9)
            r9 = r8
            com.avito.android.messenger.channels.action_banner.d r9 = (com.avito.android.messenger.channels.action_banner.d) r9
            r0.g(r9)
            return r8
        L8d:
            java.lang.Object r8 = kotlin.collections.C42745f0.G(r9)
            com.avito.android.messenger.channels.action_banner.d r8 = (com.avito.android.messenger.channels.action_banner.d) r8
            if (r8 == 0) goto L99
            r0.g(r8)
            r4 = r8
        L99:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.action_banner.n.a(com.avito.android.messenger.channels.action_banner.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.messenger.channels.action_banner.g
    public final void b(@Y61.k d dVar) {
        if (dVar.equals(d.b.f186725h)) {
            this.f186760d.d();
            return;
        }
        d.c cVar = d.c.f186728h;
        boolean zEquals = dVar.equals(cVar);
        e eVar = this.f186757a;
        C c12 = this.f186765i;
        com.avito.android.server_time.f fVar = this.f186762f;
        if (!zEquals) {
            if (dVar instanceof d.a) {
                eVar.b(-5, fVar.now() + (c12.s() ? TimeUnit.MINUTES.toMillis(5L) : dVar.getF186724i()));
            }
        } else {
            eVar.b(cVar.f186716a, fVar.now() + (c12.s() ? TimeUnit.MINUTES.toMillis(5L) : dVar.getF186724i()));
            this.f186764h.c(new BannerEvent.d());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.messenger.channels.action_banner.g
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.l com.avito.android.messenger.channels.action_banner.d r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.avito.android.messenger.channels.action_banner.l
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.messenger.channels.action_banner.l r0 = (com.avito.android.messenger.channels.action_banner.l) r0
            int r1 = r0.f186751u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f186751u = r1
            goto L18
        L13:
            com.avito.android.messenger.channels.action_banner.l r0 = new com.avito.android.messenger.channels.action_banner.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f186749s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f186751u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r7)
            goto L66
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            com.avito.android.messenger.channels.action_banner.d r6 = r0.f186748r
            com.avito.android.messenger.channels.action_banner.n r2 = r0.f186747q
            kotlin.C42729a0.b(r7)
            goto L4d
        L3c:
            kotlin.C42729a0.b(r7)
            r0.f186747q = r5
            r0.f186748r = r6
            r0.f186751u = r4
            java.lang.Object r7 = r5.d(r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r7 = kotlin.collections.C42745f0.r(r7, r6)
            if (r7 == 0) goto L58
            return r6
        L58:
            r7 = 0
            r0.f186747q = r7
            r0.f186748r = r7
            r0.f186751u = r3
            java.lang.Object r7 = r2.a(r6, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.action_banner.n.c(com.avito.android.messenger.channels.action_banner.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.avito.android.messenger.channels.action_banner.i
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.messenger.channels.action_banner.i r0 = (com.avito.android.messenger.channels.action_banner.i) r0
            int r1 = r0.f186737v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f186737v = r1
            goto L18
        L13:
            com.avito.android.messenger.channels.action_banner.i r0 = new com.avito.android.messenger.channels.action_banner.i
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f186735t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f186737v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.util.ArrayList r1 = r0.f186734s
            java.util.ArrayList r2 = r0.f186733r
            com.avito.android.messenger.channels.action_banner.n r0 = r0.f186732q
            kotlin.C42729a0.b(r9)
            goto L52
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            kotlin.C42729a0.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0.f186732q = r8
            r0.f186733r = r9
            r0.f186734s = r9
            r0.f186737v = r3
            java.lang.Object r0 = r8.e(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r1 = r9
            r2 = r1
            r9 = r0
            r0 = r8
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L64
            com.avito.android.messenger.channels.action_banner.d$a r9 = new com.avito.android.messenger.channels.action_banner.d$a
            java.lang.String r4 = r0.f186767k
            r9.<init>(r4)
            r1.add(r9)
        L64:
            r0.getClass()
            com.avito.android.messenger.channels.action_banner.d$c r9 = com.avito.android.messenger.channels.action_banner.d.c.f186728h
            int r4 = r9.f186716a
            com.avito.android.messenger.channels.action_banner.e r5 = r0.f186757a
            long r4 = r5.a(r4)
            com.avito.android.server_time.f r6 = r0.f186762f
            long r6 = r6.now()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L7c
            goto L7d
        L7c:
            r3 = 0
        L7d:
            I30.d r4 = r0.f186759c
            boolean r4 = r4.b()
            if (r3 == 0) goto L8a
            if (r4 != 0) goto L8a
            r1.add(r9)
        L8a:
            jM.a r9 = r0.f186760d
            boolean r9 = r9.a()
            if (r9 == 0) goto L97
            com.avito.android.messenger.channels.action_banner.d$b r9 = com.avito.android.messenger.channels.action_banner.d.b.f186725h
            r1.add(r9)
        L97:
            com.avito.android.messenger.channels.action_banner.h r9 = new com.avito.android.messenger.channels.action_banner.h
            r9.<init>()
            java.util.List r9 = kotlin.collections.C42745f0.B0(r2, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.action_banner.n.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.avito.android.messenger.channels.action_banner.j
            if (r0 == 0) goto L13
            r0 = r10
            com.avito.android.messenger.channels.action_banner.j r0 = (com.avito.android.messenger.channels.action_banner.j) r0
            int r1 = r0.f186741t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f186741t = r1
            goto L18
        L13:
            com.avito.android.messenger.channels.action_banner.j r0 = new com.avito.android.messenger.channels.action_banner.j
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f186739r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f186741t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            com.avito.android.messenger.channels.action_banner.n r0 = r0.f186738q
            kotlin.C42729a0.b(r10)
            goto L54
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L34:
            kotlin.C42729a0.b(r10)
            JY.a r10 = r9.f186766j
            boolean r10 = r10.a()
            if (r10 != 0) goto L44
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r10
        L44:
            java.lang.String r10 = r9.f186767k
            if (r10 != 0) goto L53
            r0.f186738q = r9
            r0.f186741t = r4
            java.lang.Object r10 = r9.f(r0)
            if (r10 != r1) goto L53
            return r1
        L53:
            r0 = r9
        L54:
            java.lang.String r10 = r0.f186767k
            if (r10 == 0) goto L8d
            boolean r10 = kotlin.text.C43066x.K(r10)
            if (r10 == 0) goto L5f
            goto L8d
        L5f:
            com.avito.android.messenger.channels.action_banner.e r10 = r0.f186757a
            r1 = -5
            long r5 = r10.a(r1)
            com.avito.android.server_time.f r10 = r0.f186762f
            long r7 = r10.now()
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 >= 0) goto L72
            r10 = r4
            goto L73
        L72:
            r10 = r3
        L73:
            com.avito.android.messenger.channels.action_banner.a r0 = r0.f186758b
            long r1 = r0.c(r1)
            boolean r0 = r0.b()
            if (r10 == 0) goto L88
            r5 = 3
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 >= 0) goto L88
            if (r0 != 0) goto L88
            r3 = r4
        L88:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r10
        L8d:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.action_banner.n.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.messenger.channels.action_banner.k
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.messenger.channels.action_banner.k r0 = (com.avito.android.messenger.channels.action_banner.k) r0
            int r1 = r0.f186746u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f186746u = r1
            goto L18
        L13:
            com.avito.android.messenger.channels.action_banner.k r0 = new com.avito.android.messenger.channels.action_banner.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f186744s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f186746u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.avito.android.messenger.channels.action_banner.n r1 = r0.f186743r
            com.avito.android.messenger.channels.action_banner.n r0 = r0.f186742q
            kotlin.C42729a0.b(r5)     // Catch: java.lang.Exception -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L5c
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.C42729a0.b(r5)
            ru.avito.messenger.z r5 = r4.f186761e     // Catch: java.lang.Exception -> L5a
            com.avito.android.remote.model.messenger.get_settings.GetSettingsRequest$ForAutoReplies r2 = com.avito.android.remote.model.messenger.get_settings.GetSettingsRequest.ForAutoReplies.INSTANCE     // Catch: java.lang.Exception -> L5a
            io.reactivex.rxjava3.core.I r5 = r5.n(r2)     // Catch: java.lang.Exception -> L5a
            r0.f186742q = r4     // Catch: java.lang.Exception -> L5a
            r0.f186743r = r4     // Catch: java.lang.Exception -> L5a
            r0.f186746u = r3     // Catch: java.lang.Exception -> L5a
            java.lang.Object r5 = kotlinx.coroutines.rx3.C43292o.b(r5, r0)     // Catch: java.lang.Exception -> L5a
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r0 = r4
            r1 = r0
        L51:
            com.avito.android.remote.model.messenger.get_settings.GetSettingsResponse r5 = (com.avito.android.remote.model.messenger.get_settings.GetSettingsResponse) r5     // Catch: java.lang.Exception -> L2d
            java.lang.String r5 = r5.getAutoRepliesUrl()     // Catch: java.lang.Exception -> L2d
            goto L68
        L58:
            r0 = r4
            goto L5c
        L5a:
            r5 = move-exception
            goto L58
        L5c:
            com.avito.android.util.X2 r1 = com.avito.android.util.X2.f318778a
            java.lang.String r2 = "ChannelsListBannerInteractorTag"
            java.lang.String r3 = "client.getSettings(ForAutoReplies) request error!"
            r1.a(r2, r3, r5)
            java.lang.String r5 = ""
            r1 = r0
        L68:
            r1.f186767k = r5
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.action_banner.n.f(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void g(d dVar) {
        if (dVar == null) {
            return;
        }
        int i12 = d.b.f186725h.f186716a;
        int i13 = dVar.f186716a;
        if (i13 == i12) {
            this.f186760d.c();
        } else if (i13 == -5) {
            this.f186758b.a(i13);
        }
    }
}
