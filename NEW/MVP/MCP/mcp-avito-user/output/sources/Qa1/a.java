package Qa1;

import cb1.C27164c;
import com.vk.push.core.push.RegisterForPushesResult;
import java.util.LinkedList;
import kotlin.G0;
import mb1.InterfaceC44046a;
import ru.rustore.sdk.core.tasks.f;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C27164c f13764a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44046a f13765b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final qb1.g f13766c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final jb1.c f13767d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final jb1.d f13768e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final jb1.l f13769f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final jb1.n f13770g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinkedList f13771h = new LinkedList();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final T11.f f13772i;

    /* renamed from: Qa1.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0911a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13773a;

        static {
            int[] iArr = new int[RegisterForPushesResult.values().length];
            try {
                RegisterForPushesResult.Companion companion = RegisterForPushesResult.INSTANCE;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RegisterForPushesResult.Companion companion2 = RegisterForPushesResult.INSTANCE;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13773a = iArr;
        }
    }

    public a(@Y61.k C27164c c27164c, @Y61.k InterfaceC44046a interfaceC44046a, @Y61.k qb1.g gVar, @Y61.k jb1.c cVar, @Y61.k jb1.d dVar, @Y61.k jb1.l lVar, @Y61.k jb1.n nVar, @Y61.k T11.f fVar) {
        this.f13764a = c27164c;
        this.f13765b = interfaceC44046a;
        this.f13766c = gVar;
        this.f13767d = cVar;
        this.f13768e = dVar;
        this.f13769f = lVar;
        this.f13770g = nVar;
        this.f13772i = fVar.b("SubscribeComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Qa1.d
            if (r0 == 0) goto L13
            r0 = r7
            Qa1.d r0 = (Qa1.d) r0
            int r1 = r0.f13786u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13786u = r1
            goto L18
        L13:
            Qa1.d r0 = new Qa1.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13784s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f13786u
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3c
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            kotlin.C42729a0.b(r7)
            goto L64
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.String r6 = r0.f13783r
            Qa1.a r2 = r0.f13782q
            kotlin.C42729a0.b(r7)
            goto L56
        L3c:
            kotlin.C42729a0.b(r7)
            T11.f r7 = r5.f13772i
            java.lang.String r2 = "Saving new push token to the storage"
            r7.info(r2)
            r0.f13782q = r5
            r0.f13783r = r6
            r0.f13786u = r3
            qb1.g r7 = r5.f13766c
            java.lang.Object r7 = r7.d(r6, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r5
        L56:
            r7 = 0
            r0.f13782q = r7
            r0.f13783r = r7
            r0.f13786u = r4
            java.lang.Object r6 = r2.d(r6, r0)
            if (r6 != r1) goto L64
            return r1
        L64:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Qa1.a.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Qa1.c
            if (r0 == 0) goto L13
            r0 = r5
            Qa1.c r0 = (Qa1.c) r0
            int r1 = r0.f13781t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13781t = r1
            goto L18
        L13:
            Qa1.c r0 = new Qa1.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13779r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f13781t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Qa1.a r0 = r0.f13778q
            kotlin.C42729a0.b(r5)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C42729a0.b(r5)
            T11.f r5 = r4.f13772i
            java.lang.String r2 = "Get current push token"
            r5.info(r2)
            r0.f13778q = r4
            r0.f13781t = r3
            qb1.g r5 = r4.f13766c
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r0 = r4
        L4b:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L55
            boolean r1 = kotlin.text.C43066x.K(r5)
            if (r1 == 0) goto L5d
        L55:
            T11.f r0 = r0.f13772i
            r1 = 0
            java.lang.String r2 = "No saved push token found"
            r0.a(r2, r1)
        L5d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Qa1.a.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c(Throwable th2) {
        G0 g02;
        synchronized (this.f13771h) {
            do {
                try {
                    f.b bVar = (f.b) this.f13771h.poll();
                    if (bVar != null) {
                        bVar.a(th2);
                        g02 = G0.f406611a;
                    } else {
                        g02 = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            } while (g02 != null);
            G0 g03 = G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof Qa1.f
            if (r0 == 0) goto L13
            r0 = r12
            Qa1.f r0 = (Qa1.f) r0
            int r1 = r0.f13795u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13795u = r1
            goto L18
        L13:
            Qa1.f r0 = new Qa1.f
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f13793s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f13795u
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L4a
            if (r2 == r3) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r11 = r0.f13792r
            Qa1.a r0 = r0.f13791q
            kotlin.C42729a0.b(r12)
            goto Lb8
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            java.lang.Object r11 = r0.f13792r
            java.lang.String r11 = (java.lang.String) r11
            Qa1.a r2 = r0.f13791q
            kotlin.C42729a0.b(r12)
            kotlin.Z r12 = (kotlin.Z) r12
            java.lang.Object r12 = r12.f406625b
        L46:
            r9 = r12
            r12 = r11
            r11 = r9
            goto L5e
        L4a:
            kotlin.C42729a0.b(r12)
            r0.f13791q = r10
            r0.f13792r = r11
            r0.f13795u = r3
            jb1.l r12 = r10.f13769f
            java.lang.Object r12 = r12.a(r11, r0)
            if (r12 != r1) goto L5c
            return r1
        L5c:
            r2 = r10
            goto L46
        L5e:
            int r5 = kotlin.Z.f406624c
            boolean r5 = r11 instanceof kotlin.Z.b
            if (r5 != 0) goto Lb7
            r5 = r11
            pb1.a r5 = (pb1.C47049a) r5
            T11.f r6 = r2.f13772i
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Register for pushes completed, result = "
            r7.<init>(r8)
            com.vk.push.core.push.RegisterForPushesResult r8 = r5.f428622a
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.info(r7)
            int[] r6 = Qa1.a.C0911a.f13773a
            com.vk.push.core.push.RegisterForPushesResult r7 = r5.f428622a
            int r7 = r7.ordinal()
            r6 = r6[r7]
            T11.f r7 = r2.f13772i
            if (r6 == r3) goto L93
            if (r6 == r4) goto L8d
            goto La8
        L8d:
            java.lang.String r3 = "Result is already registered"
            r7.info(r3)
            goto La8
        L93:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Register for pushes successful, host = "
            r3.<init>(r6)
            T11.a r5 = r5.f428623b
            java.lang.String r5 = r5.f15306a
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r7.info(r3)
        La8:
            r0.f13791q = r2
            r0.f13792r = r11
            r0.f13795u = r4
            jb1.n r3 = r2.f13770g
            java.lang.Object r12 = r3.a(r12, r0)
            if (r12 != r1) goto Lb7
            return r1
        Lb7:
            r0 = r2
        Lb8:
            java.lang.Throwable r11 = kotlin.Z.b(r11)
            if (r11 == 0) goto Lc5
            T11.f r12 = r0.f13772i
            java.lang.String r0 = "Register for pushes has failed"
            r12.error(r0, r11)
        Lc5:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Qa1.a.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof Qa1.e
            if (r0 == 0) goto L13
            r0 = r8
            Qa1.e r0 = (Qa1.e) r0
            int r1 = r0.f13790t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13790t = r1
            goto L18
        L13:
            Qa1.e r0 = new Qa1.e
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f13788r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f13790t
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r3) goto L2f
            kotlin.C42729a0.b(r8)
            goto L93
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            kotlin.C42729a0.b(r8)
            goto L85
        L3b:
            Qa1.a r2 = r0.f13787q
            kotlin.C42729a0.b(r8)
            nb1.a r8 = (nb1.C44374a) r8
            java.lang.String r8 = r8.f415216a
            goto L5d
        L45:
            kotlin.C42729a0.b(r8)
            T11.f r8 = r7.f13772i
            java.lang.String r2 = "Calling register for pushes"
            r8.info(r2)
            r0.f13787q = r7
            r0.f13790t = r4
            qb1.g r8 = r7.f13766c
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            r2 = r7
        L5d:
            java.lang.String r8 = (java.lang.String) r8
            boolean r4 = kotlin.text.C43066x.K(r8)
            r6 = 0
            if (r4 == 0) goto L88
            T11.f r8 = r2.f13772i
            java.lang.String r3 = "No saved push token found."
            r8.a(r3, r6)
            ru.rustore.sdk.core.tasks.f$a r8 = ru.rustore.sdk.core.tasks.f.f436778d
            r8.getClass()
            kotlin.Q r8 = ru.rustore.sdk.core.tasks.f.a.a()
            B r8 = r8.f406620c
            ru.rustore.sdk.core.tasks.f$b r8 = (ru.rustore.sdk.core.tasks.f.b) r8
            r0.f13787q = r6
            r0.f13790t = r5
            java.lang.Object r8 = r2.f(r8, r0)
            if (r8 != r1) goto L85
            return r1
        L85:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        L88:
            r0.f13787q = r6
            r0.f13790t = r3
            java.lang.Object r8 = r2.d(r8, r0)
            if (r8 != r1) goto L93
            return r1
        L93:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Qa1.a.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a3 A[Catch: Exception -> 0x0147, TryCatch #6 {Exception -> 0x0147, blocks: (B:18:0x003d, B:83:0x0133, B:85:0x0139, B:89:0x0140, B:91:0x0144, B:98:0x0150, B:101:0x0157, B:121:0x019d, B:123:0x01a3, B:124:0x01aa, B:80:0x011c, B:26:0x0059, B:29:0x0066, B:55:0x00ba, B:32:0x006c, B:52:0x00ac), top: B:149:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x017f A[EXC_TOP_SPLITTER, LOOP:0: B:152:0x017f->B:157:?, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e2 A[Catch: Exception -> 0x00f0, TryCatch #0 {Exception -> 0x00f0, blocks: (B:58:0x00ca, B:63:0x00d5, B:65:0x00d9, B:69:0x00e2, B:71:0x00e8, B:74:0x00f4, B:76:0x0101), top: B:140:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0101 A[Catch: Exception -> 0x00f0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f0, blocks: (B:58:0x00ca, B:63:0x00d5, B:65:0x00d9, B:69:0x00e2, B:71:0x00e8, B:74:0x00f4, B:76:0x0101), top: B:140:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0139 A[Catch: Exception -> 0x0147, TryCatch #6 {Exception -> 0x0147, blocks: (B:18:0x003d, B:83:0x0133, B:85:0x0139, B:89:0x0140, B:91:0x0144, B:98:0x0150, B:101:0x0157, B:121:0x019d, B:123:0x01a3, B:124:0x01aa, B:80:0x011c, B:26:0x0059, B:29:0x0066, B:55:0x00ba, B:32:0x006c, B:52:0x00ac), top: B:149:0x0022 }] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@Y61.k ru.rustore.sdk.core.tasks.f.b r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qa1.a.f(ru.rustore.sdk.core.tasks.f$b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
