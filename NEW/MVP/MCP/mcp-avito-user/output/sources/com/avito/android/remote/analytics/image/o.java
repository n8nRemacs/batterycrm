package com.avito.android.remote.analytics.image;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.analytics.u;
import com.avito.android.remote.analytics.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import lj0.InterfaceC43782b;

/* compiled from: ImagesNetworkErrorsReporter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/analytics/image/o;", "Lcom/avito/android/remote/analytics/image/n;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class o implements n {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C43059p f253140g;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f253141a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f253142b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f253143c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.n f253144d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final y f253145e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43782b f253146f;

    /* compiled from: ImagesNetworkErrorsReporter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/analytics/image/o$a;", "", "<init>", "()V", "Lkotlin/text/p;", "httpCodeRegex", "Lkotlin/text/p;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ImagesNetworkErrorsReporter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/image/q$a;", "response", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/analytics/image/q$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
        @Override // l41.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void accept(java.lang.Object r20) throws java.lang.NumberFormatException {
            /*
                r19 = this;
                r0 = r20
                com.avito.android.remote.analytics.image.q$a r0 = (com.avito.android.remote.analytics.image.q.a) r0
                java.lang.Throwable r1 = r0.f253157c
                r2 = 0
                r3 = r19
                com.avito.android.remote.analytics.image.o r4 = com.avito.android.remote.analytics.image.o.this
                if (r1 == 0) goto L14
                com.avito.android.remote.analytics.n r5 = r4.f253144d
                com.avito.android.remote.analytics.a r5 = r5.c(r1)
                goto L15
            L14:
                r5 = r2
            L15:
                lj0.b r6 = r4.f253146f
                lj0.a r6 = r6.a()
                if (r6 == 0) goto L21
                java.lang.String r6 = r6.f414169a
                r14 = r6
                goto L22
            L21:
                r14 = r2
            L22:
                lj0.b r6 = r4.f253146f
                lj0.a r6 = r6.a()
                if (r6 == 0) goto L2e
                java.lang.String r6 = r6.f414170b
                r15 = r6
                goto L2f
            L2e:
                r15 = r2
            L2f:
                kj0.b r6 = new kj0.b
                com.avito.android.remote.analytics.NetworkErrorType r7 = com.avito.android.remote.analytics.NetworkErrorType.f253096c
                if (r1 != 0) goto L39
                java.lang.String r7 = "other"
            L37:
                r11 = r7
                goto L77
            L39:
                java.lang.String r7 = r1.getMessage()
                if (r7 != 0) goto L41
            L3f:
                r7 = r2
                goto L63
            L41:
                kotlin.text.p r8 = com.avito.android.remote.analytics.image.o.f253140g
                kotlin.text.n r7 = kotlin.text.C43059p.b(r8, r7)
                if (r7 == 0) goto L3f
                java.util.List r7 = r7.d()
                r8 = 1
                java.lang.Object r7 = kotlin.collections.C42745f0.K(r8, r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L3f
                int r7 = java.lang.Integer.parseInt(r7)
                com.avito.android.remote.error.o r8 = com.avito.android.remote.error.o.f253437a
                r8.getClass()
                java.lang.String r7 = com.avito.android.remote.error.o.a(r7)
            L63:
                if (r7 == 0) goto L66
                goto L37
            L66:
                com.avito.android.remote.analytics.y r7 = r4.f253145e
                java.lang.String r7 = r7.a(r1)
                if (r7 != 0) goto L37
                java.lang.Class r7 = r1.getClass()
                java.lang.String r7 = r7.getSimpleName()
                goto L37
            L77:
                if (r1 == 0) goto La3
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.Class r8 = r1.getClass()
                java.lang.String r8 = r8.getName()
                r7.append(r8)
                java.lang.String r8 = ": "
                r7.append(r8)
                com.avito.android.remote.analytics.u r8 = r4.f253142b
                java.lang.String r1 = r1.getMessage()
                java.lang.String r1 = r8.c(r1)
                r7.append(r1)
                java.lang.String r1 = r7.toString()
                if (r1 == 0) goto La3
            La1:
                r12 = r1
                goto La6
            La3:
                java.lang.String r1 = "<none>"
                goto La1
            La6:
                if (r5 == 0) goto Laa
                java.lang.String r2 = r5.f253102a
            Laa:
                r13 = r2
                java.lang.String r8 = r0.f253155a
                r17 = 256(0x100, float:3.59E-43)
                r18 = 0
                java.lang.String r9 = r0.f253156b
                java.lang.String r10 = "2. image error"
                r16 = 0
                r7 = r6
                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                com.avito.android.analytics.a r0 = r4.f253143c
                r0.c(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.analytics.image.o.b.accept(java.lang.Object):void");
        }
    }

    static {
        new a(null);
        f253140g = new C43059p("Unexpected HTTP code Response\\{.*code=(\\d{3}).*");
    }

    @Inject
    public o(@Y61.k q qVar, @Y61.k u uVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.remote.analytics.n nVar, @Y61.k y yVar, @Y61.k InterfaceC43782b interfaceC43782b) {
        this.f253141a = qVar;
        this.f253142b = uVar;
        this.f253143c = interfaceC28373a;
        this.f253144d = nVar;
        this.f253145e = yVar;
        this.f253146f = interfaceC43782b;
    }

    @Override // com.avito.android.remote.analytics.image.n
    public final void a() {
        this.f253141a.getF253162d().t0(new b());
    }
}
