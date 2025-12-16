package com.avito.avcalls.android.call;

import com.avito.avcalls.android.call.models.CallDirection;
import com.avito.avcalls.android.call.models.CallMetaInfo;
import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.rtc.C36192b;
import com.avito.avcalls.android.signaling.proto.OptionsUpdate;
import com.avito.avcalls.android.signaling.proto.VoipMessage;
import com.avito.avcalls.android.video.CameraPosition;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;
import xQ0.f;

/* compiled from: CallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/android/call/o;", "", "Companion", "a", "b", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.avcalls.android.call.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC36187o {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f331578a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43238h f331579b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43238h f331580c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final x f331581d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.config.a f331582e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.stats.d f331583f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.H f331584g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.rtc.i f331585h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.utils.coroutines.e f331586i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Long f331587j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Long f331588k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Long f331589l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Z1<xQ0.b> f331590m;

    /* compiled from: CallSession.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/avcalls/android/call/o$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.call.o$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CallSession.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/call/o$b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.call.o$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f331591b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f331592c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f331593d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f331594e;

        static {
            b bVar = new b("AUDIO", 0);
            f331591b = bVar;
            b bVar2 = new b("VIDEO", 1);
            f331592c = bVar2;
            b[] bVarArr = {bVar, bVar2};
            f331593d = bVarArr;
            f331594e = kotlin.enums.c.a(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f331593d.clone();
        }
    }

    /* compiled from: CallSession.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.call.o$c */
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b bVar = b.f331591b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: CallSession.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.android.call.CallSession$enableSendingMedia$1$1", f = "CallSession.kt", i = {}, l = {314}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.avcalls.android.call.o$d */
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f331595q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ xQ0.b f331597s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ xQ0.h f331598t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xQ0.b bVar, xQ0.h hVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f331597s = bVar;
            this.f331598t = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return AbstractC36187o.this.new d(this.f331597s, this.f331598t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f331595q;
            if (i12 == 0) {
                C42729a0.b(obj);
                x xVar = AbstractC36187o.this.f331581d;
                xQ0.b bVar = this.f331597s;
                String str = bVar.f442473f.f442492a;
                xQ0.h hVar = this.f331598t;
                this.f331595q = 1;
                if (xVar.i(bVar.f442468a, bVar.f442469b, str, hVar.f442490a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CallSession.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.android.call.CallSession$startTerminationTimer$1", f = "CallSession.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.avcalls.android.call.o$e */
    public static final class e extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f331599q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ xQ0.k f331601s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xQ0.k kVar, Continuation<? super e> continuation) {
            super(1, continuation);
            this.f331601s = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return AbstractC36187o.this.new e(this.f331601s, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((e) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f331599q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f331599q = 1;
                if (AbstractC36187o.this.h(this.f331601s, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC36187o(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, @Y61.k CallDirection callDirection, @Y61.k C43238h c43238h, @Y61.k C43238h c43238h2, @Y61.k x xVar, @Y61.k S s5, @Y61.k com.avito.avcalls.android.config.a aVar, @Y61.k com.avito.avcalls.android.stats.d dVar, @Y61.k Y41.p pVar, @Y61.k CallMetaInfo callMetaInfo) {
        this.f331578a = str;
        this.f331579b = c43238h;
        this.f331580c = c43238h2;
        this.f331581d = xVar;
        this.f331582e = aVar;
        this.f331583f = dVar;
        this.f331584g = (kotlin.jvm.internal.H) pVar;
        this.f331586i = new com.avito.avcalls.android.utils.coroutines.e(c43238h);
        xQ0.b.INSTANCE.getClass();
        this.f331590m = p2.a(new xQ0.b(str, str2, callDirection, f.c.f442482b, new xQ0.h(new xQ0.g(true, false), false), new xQ0.j(str3, false, new xQ0.h(new xQ0.g(true, false), false)), z12, false, CameraPosition.f332471b, false, callMetaInfo));
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CallSession", "initialize PCSession");
        this.f331585h = new com.avito.avcalls.android.rtc.i(c43238h, str, s5.f331470b.f331673b, s5.f331469a, z12, C42727D.c(new P(s5)), C42727D.c(new Q(s5)), s5.f331472d);
        C43259k.d(c43238h, null, null, new C36184l(this, null), 3);
        C43259k.d(c43238h, null, null, new C36185m(this, null), 3);
        C43259k.d(c43238h, null, null, new C36186n(this, null), 3);
    }

    public static final void a(AbstractC36187o abstractC36187o, b bVar) {
        com.avito.avcalls.android.rtc.A a12;
        abstractC36187o.c().f442472e.f442490a.getClass();
        boolean z12 = false;
        boolean z13 = abstractC36187o.c().f442472e.f442491b && (abstractC36187o.c().f442471d instanceof f.a);
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        String str = "updatePCSessionMediaTrackState(): mediaType=" + bVar + ", mss=" + abstractC36187o.c().f442472e.f442490a + ", isMediaAvailable=" + z13;
        companion.getClass();
        g.Companion.c("CallSession", str);
        int iOrdinal = bVar.ordinal();
        com.avito.avcalls.android.rtc.i iVar = abstractC36187o.f331585h;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            boolean z14 = abstractC36187o.c().f442472e.f442490a.f442489b;
            if (z14 && z13) {
                z12 = true;
            }
            iVar.j(z12);
            iVar.f(z14, abstractC36187o.c().f442476i);
            return;
        }
        boolean z15 = abstractC36187o.c().f442472e.f442490a.f442488a && z13;
        iVar.getClass();
        g.Companion.c("PCSession", "setAudioTxEnabled(): isEnabled=" + z15);
        if (z15) {
            g.Companion.c("PCSession", "enableAudioDeviceIfNeeded(): needsToEnableAudioDevice=" + iVar.f331935r);
            if (iVar.f331935r) {
                iVar.f331923f.a(iVar.f331926i.f331968a, true);
                C36192b c36192b = iVar.f331928k;
                if (c36192b != null && (a12 = iVar.f331929l) != null) {
                    g.Companion.c("RtpSender(" + a12.f331869b + ')', "resetTrack");
                    a12.a(null);
                    a12.a(c36192b);
                }
                iVar.f331935r = false;
            }
        }
        C36192b c36192b2 = iVar.f331928k;
        if (c36192b2 == null || c36192b2.a().enabled() == z15) {
            return;
        }
        c36192b2.b(z15);
    }

    public final void b(b bVar, boolean z12) {
        xQ0.g gVarA;
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        String str = "enableSendingMedia(): mediaType=" + bVar + ", isEnabled=" + z12 + ", state=" + c();
        companion.getClass();
        g.Companion.c("CallSession", str);
        if (c().f442471d instanceof f.e) {
            return;
        }
        Z1<xQ0.b> z13 = this.f331590m;
        xQ0.b value = z13.getValue();
        xQ0.h hVar = value.f442472e;
        int iOrdinal = bVar.ordinal();
        xQ0.h hVar2 = value.f442472e;
        if (iOrdinal == 0) {
            gVarA = xQ0.g.a(hVar2.f442490a, z12, false, 6);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            gVarA = xQ0.g.a(hVar2.f442490a, false, z12, 5);
        }
        xQ0.h hVarA = xQ0.h.a(hVar, gVarA, false, 2);
        if (!hVarA.equals(hVar2)) {
            C43259k.d(this.f331579b, null, null, new d(value, hVarA, null), 3);
        }
        z13.setValue(xQ0.b.a(value, null, hVarA, null, false, null, false, null, 2031));
    }

    @Y61.k
    public final xQ0.b c() {
        return this.f331590m.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v14, types: [Y41.p, kotlin.jvm.internal.H] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.avito.avcalls.android.call.C36188p
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.avcalls.android.call.p r0 = (com.avito.avcalls.android.call.C36188p) r0
            int r1 = r0.f331607v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f331607v = r1
            goto L18
        L13:
            com.avito.avcalls.android.call.p r0 = new com.avito.avcalls.android.call.p
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f331605t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f331607v
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            long r1 = r0.f331604s
            long r3 = r0.f331603r
            com.avito.avcalls.android.call.o r0 = r0.f331602q
            kotlin.C42729a0.b(r11)
            r8 = r1
            r2 = r3
            r4 = r8
            goto L6c
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3a:
            kotlin.C42729a0.b(r11)
            com.avito.avcalls.android.config.a r11 = r10.f331582e
            boolean r11 = r11.getF331661i()
            if (r11 != 0) goto L48
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        L48:
            java.lang.Long r11 = r10.f331587j
            if (r11 == 0) goto Lbf
            long r4 = r11.longValue()
            java.lang.Long r11 = r10.f331588k
            if (r11 == 0) goto Lbc
            long r6 = r11.longValue()
            r0.f331602q = r10
            r0.f331603r = r4
            r0.f331604s = r6
            r0.f331607v = r3
            com.avito.avcalls.android.rtc.i r11 = r10.f331585h
            java.lang.Object r11 = r11.d(r0)
            if (r11 != r1) goto L69
            return r1
        L69:
            r0 = r10
            r2 = r4
            r4 = r6
        L6c:
            r6 = r11
            com.avito.avcalls.android.stats.a r6 = (com.avito.avcalls.android.stats.a) r6
            com.avito.avcalls.android.logger.g$a r11 = com.avito.avcalls.android.logger.g.INSTANCE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "WebRTC getStats report for callId="
            r1.<init>(r7)
            java.lang.String r7 = r0.f331578a
            r1.append(r7)
            java.lang.String r7 = ": "
            r1.append(r7)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r11.getClass()
            java.lang.String r11 = "CallSession"
            com.avito.avcalls.android.logger.g.Companion.c(r11, r1)
            com.avito.avcalls.android.stats.d r1 = r0.f331583f
            java.lang.String r1 = r1.a(r2, r4, r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Delivered stats report for call callId="
            r2.<init>(r3)
            java.lang.String r3 = r0.f331578a
            r2.append(r3)
            r2.append(r7)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.avito.avcalls.android.logger.g.Companion.c(r11, r2)
            kotlin.jvm.internal.H r11 = r0.f331584g
            xQ0.b r0 = r0.c()
            r11.invoke(r1, r0)
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        Lbc:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        Lbf:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.AbstractC36187o.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public abstract Object e(@Y61.k VoipMessage voipMessage, @Y61.k Continuation<? super G0> continuation);

    public final void f(@Y61.k xQ0.f fVar) {
        Z1<xQ0.b> z12 = this.f331590m;
        z12.setValue(xQ0.b.a(z12.getValue(), fVar, null, null, false, null, false, null, 2039));
    }

    public final void g(long j12, @Y61.k xQ0.k kVar) {
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        StringBuilder sbQ = androidx.compose.foundation.H.q(j12, "start termination timer delay=", ", terminateReason=");
        sbQ.append(kVar.getF442495a());
        String string = sbQ.toString();
        companion.getClass();
        g.Companion.c("CallSession", string);
        this.f331586i.a(j12, new e(kVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@Y61.k xQ0.k r9, boolean r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.AbstractC36187o.h(xQ0.k, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void i(@Y61.k VoipMessage voipMessage) {
        Boolean bool;
        Boolean bool2;
        VoipMessage.MediaSender mediaSender = voipMessage.f332132d;
        xQ0.g gVar = mediaSender != null ? new xQ0.g(mediaSender.f332136a, mediaSender.f332137b) : c().f442473f.f442494c.f442490a;
        OptionsUpdate optionsUpdate = voipMessage.f332135g;
        boolean zBooleanValue = (optionsUpdate == null || (bool2 = optionsUpdate.f332118a) == null) ? c().f442475h : bool2.booleanValue();
        CameraPosition cameraPositionA = xQ0.c.a(optionsUpdate != null ? optionsUpdate.f332119b : null);
        if (cameraPositionA == null) {
            cameraPositionA = c().f442476i;
        }
        this.f331590m.setValue(xQ0.b.a(c(), null, null, xQ0.j.a(c().f442473f, null, xQ0.h.a(c().f442473f.f442494c, gVar, false, 2), 7), zBooleanValue, cameraPositionA, (optionsUpdate == null || (bool = optionsUpdate.f332120c) == null) ? c().f442477j : bool.booleanValue(), null, 1119));
    }
}
